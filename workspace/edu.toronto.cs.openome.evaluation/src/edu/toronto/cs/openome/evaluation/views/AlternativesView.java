package edu.toronto.cs.openome.evaluation.views;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.part.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.jface.action.*;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.*;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

import edu.toronto.cs.openome.evaluation.commands.DeleteAlternativeCommand;
import edu.toronto.cs.openome.evaluation.commands.ForwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome.evaluation.gui.EvaluationElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.handlers.UpdateLabelsHandler;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome_model.Alternative;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditor;
import edu.toronto.cs.openome_model.impl.ModelImpl;


/**
 * This class creates a view model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class AlternativesView extends ViewPart {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "edu.toronto.cs.openome.evaluation.views.AlternativesView";

	// need this to be a static
	// to support the singleton model
	public static TreeViewer viewer;

	private DrillDownAdapter drillDownAdapter;
	
	/* Action variables */
	private Action refreshAction;
	private Action deleteAction;
	private Action evaluateAction;
	private Action clickAction;
	private Action collapseAllAction;
	private Action expandAllAction;
	
	/*
	 * The content provider class is responsible for
	 * providing objects to the view. It can wrap
	 * existing objects in adapters or simply return
	 * objects as-is. These objects may be sensitive
	 * to the current input of the view, or ignore
	 * it and always show the same content 
	 * (like Task List, for example).
	 */
	 
	// This class associates each node in the tree with an object
	// Possible objects: Alternative, Intention, EvaluationLabel 
	class TreeObject implements IAdaptable {
		private String name;
		private TreeNode parent;
		
		// the object this TreeObject represents
		protected Object obj;
		protected Object img;
		
		public TreeObject(String name, Object obj, Object img) {
			this.name = name;
			this.obj = obj;
			this.img = img;
		}
		public String getName() {
			return name;
		}
		public void setParent(TreeNode parent) {
			this.parent = parent;
		}
		public TreeNode getParent() {
			return parent;
		}
		public String toString() {
			return getName();
		}
		public Object getAdapter(Class key) {
			return null;
		}
		public void setObject(Object obj){
			this.obj = obj;
		}
		public Object getObject(){
			return this.obj;
		}
		public Object getImg() {
			return this.img;
		}
		public boolean equals(TreeObject to){
			return ((this.name == to.getName()) 
						&& (this.obj).equals(to.getObject()));
		}
		public boolean equalObject(Object o){
			return ((this.obj).equals(o));
		}
	}
	
	// TreeNode represents nodes with children
	class TreeNode extends TreeObject {
		private ArrayList<TreeObject> elements;
		private boolean status = false;
		public TreeNode(String name, Object obj, Object img) {
			super(name, obj, img);
			elements = new ArrayList<TreeObject>();
		}
		public void addChild(TreeObject child) {
			elements.add(child);
			child.setParent(this);
		}
		public void removeChild(TreeObject child) {
			elements.remove(child);
			child.setParent(null);
		}
		public TreeObject [] getChildren() {
			return (TreeObject [])elements.toArray(new TreeObject[elements.size()]);
		}
		public boolean hasChildren() {
			return elements.size()>0;
		}
		public int getNumOfChild(){
			return elements.size();
		}
		public Alternative getAlternative() {
			return (Alternative) this.obj;
		}
		public void setAlternateStatus(boolean b) {
			status = b;
		}
		public boolean isAlternative(){
			return status;
		}
		public void clear() {
			
			elements.clear();
		}
	}
	
	// Need this to be public in order to change the view content
	public class ViewContentProvider implements IStructuredContentProvider, 
										   ITreeContentProvider {
		private TreeNode invisibleRoot;

		public void inputChanged(Viewer v, Object oldInput, Object newInput) {
		}
		public void dispose() {
		}
		
		public Object[] getRoot() {
			return getChildren(invisibleRoot);
		}
		public Object[] getElements(Object parent) {
			if (parent.equals(getViewSite())) {
				if (invisibleRoot==null) initialize();
				return getChildren(invisibleRoot);
			}
			return getChildren(parent);
		}
		public Object getParent(Object child) {
			if (child instanceof TreeObject) {
				return ((TreeObject)child).getParent();
			}
			return null;
		}
		public Object [] getChildren(Object parent) {
			if (parent instanceof TreeNode) {
				return ((TreeNode)parent).getChildren();
			}
			return new Object[0];
		}
		public boolean hasChildren(Object parent) {
			if (parent instanceof TreeNode)
				return ((TreeNode)parent).hasChildren();
			return false;
		}
		
		public TreeNode addNode (Alternative alt) {
			TreeNode node = createTreeNode(alt);
			addTreeNode(node);
			return node;
		}
		
		private boolean addTreeNode(TreeNode child) {
			invisibleRoot.addChild(child);
			return true;
		}
		
		private TreeNode createTreeNode(Alternative alt) {
			TreeNode node = new TreeNode(alt.getName(), alt, null);
			return node;
			
		}
		
		/**
		 * Code left in to demonstrate a dummy tree structure
		 */
		private void initialize() {
			invisibleRoot = new TreeNode("", null, null);
		}
		
//		public void addHumanJudgement(Intention intension, EvaluationLabel judgement){
//			// create the new intention in the tree
//			TreeNode newIntentionNode = new TreeNode(intension.getName(), intension);
//			// add the human judgement
//			newIntentionNode.addChild(new TreeObject("[HUMAN JUDGEMENT] " + judgement.getName(), judgement));
//			// add the new intension into the tree
//			currAlternative.addChild(newIntentionNode);
//			
//		}
//		
		/**
		 * Adds child nodes to the specified node by iterating over each given intention
		 * and creating a new TreeObject for each. 
		 * @author aftabs
		 * @param map
		 * @param node
		 */
		//public void addChildren(EList<Intention> intentions, SoftgoalWrappers softgoalWrappers, TreeNode node) {
		public void addChildren(HashMap<Intention, EvaluationLabel> map, TreeNode node) {
			
			TreeNode to;
			String actorName;
			Container con;
			
			Set<Intention> intentions = (Set<Intention>) map.keySet();
			
			
			for (Intention i : intentions){
				
				// Add each intention as a new TreeObject as a child
				
				con = i.getContainer();
				if (con != null)
				{
					actorName = con.getName();
				}
				else {
					actorName = "";
				}
				
				to = new TreeNode(i.getName() + " {" + actorName + "}" , i, map.get(i));
				node.addChild(to);
				
				// check if there are human judgments for this intention
				//IntQualIntentionWrapper intWrapper = softgoalWrappers.findIntention(i);
				/*if (intWrapper != null){
					Vector<HumanJudgement> judgments = intWrapper.getHumanJudgements();
					if (!judgments.isEmpty()){
						int j = 1;
						// add all the human judgments
						for (HumanJudgement judgment : judgments){
							to.addChild(new TreeObject("[HUMAN JUDGEMENT] " + j++ + ": " + judgment.toString(), judgment));
						}
					}
				}*/
			}
		}
		public void removeAllNodes() {
			invisibleRoot.clear();
		}
	}
	
	/**
	 * Label provider class
	 */
	class ViewLabelProvider extends EvaluationElementTypeLabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}
		public Image getImage(Object obj) {
			
				TreeNode node = (TreeNode)obj;
				
			if (node.getImg() != null)
				return super.getEvalImage((EvaluationLabel)node.getImg());
			else 
				return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FOLDER);
		}
	}
	class NameSorter extends ViewerSorter {
	}

	/**
	 * The constructor.
	 */
	public AlternativesView() {

	}

	/**
	 * This is a callback that will allow us
	 * to create the viewer and initialize it.
	 */
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new ViewContentProvider());
		viewer.setLabelProvider(new ViewLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput(getViewSite());

		// Create the help context id for the viewer's control
		PlatformUI.getWorkbench().getHelpSystem().setHelp(viewer.getControl(), "edu.toronto.cs.openome.evaluation.viewer");
		makeActions();
		hookContextMenu();
		hookDoubleClickAction();
		contributeToActionBars();
		
		/* ISelectionListener will notify the view about every time the user changes/selects a model tab */
		ISelectionListener selectionChangeListener = new ISelectionListener() {
	        public void selectionChanged(IWorkbenchPart sourcepart, ISelection selection) {
	        	clearView();
	        	loadAlternatives();
	        }
	    };
	    
	    /* Add the selection listener to the active workbench window */
	    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(selectionChangeListener);
	    
	}
	
	private void contributeToActionBars() {
		IActionBars bars = getViewSite().getActionBars();
		fillLocalToolBar(bars.getToolBarManager());
	}
	
	/**
	 * Initialize the action buttons
	 * @param manager
	 */
	private void fillLocalToolBar(IToolBarManager manager) {
		manager.add(collapseAllAction);
		manager.add(expandAllAction);
	}

	/**
	 *  Initialize the right-click drown down menu 
	 */
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				
				/* Evaluate and Delete actions only if the selected item is an Alternative */
				if (obj != null) {
					if (obj instanceof TreeNode){
						if (((TreeNode) obj).isAlternative()){
							manager.add(evaluateAction);
							manager.add(deleteAction);
							}
						}
					
				}
				
				/* Add to the Alternatives View */
				AlternativesView.this.fillContextMenu(manager);
			}
		});
		Menu menu = menuMgr.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuMgr, viewer);
	}

	private void fillContextMenu(IMenuManager manager) {
		manager.add(refreshAction);
		manager.add(new Separator());
		drillDownAdapter.addNavigationActions(manager);
		// Other plug-ins can contribute there actions here
		manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	}
	
	/** 
	 * Initialize the actions
	 */
	private void makeActions() {
		
		
		/**
		 *  Expand All Action - expands all nodes in the view
		 */
		expandAllAction = new Action() {
			public void run() {
				expandAll();
				
			}
		};
		expandAllAction.setText("Expand All");
		expandAllAction.setToolTipText("Expand All");
		expandAllAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ELCL_COLLAPSEALL_DISABLED));
		
		
		/**
		 *  Collapse All Action - collapses all nodes in the view
		 */
		collapseAllAction = new Action() {
			public void run() {
				collapseAll();
				
			}
		};
		collapseAllAction.setText("Collapse All");
		collapseAllAction.setToolTipText("Collapse All");
		collapseAllAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ELCL_COLLAPSEALL));
		
		/**
		 *  Refresh Action - refreshs the view
		 */
		refreshAction = new Action() {
			public void run() {
				
				
//				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().get
				TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
								
				clearView();
				loadAlternatives();
			}
		};
		refreshAction.setText("Refresh");
		refreshAction.setToolTipText("Refresh");
		refreshAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		
		/**
		 *  Re-evaluate Action - re-evaluates the model with the selected Alternative
		 */
		
		evaluateAction = new Action() {
			public void run() {
				clearView();
				loadAlternatives();
			}
		};
		
		
		evaluateAction.setText("Evaluate");
		evaluateAction.setToolTipText("Evaluate");
		evaluateAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		/**
		 *  Delete Action - deletes the selected Alternative
		 */
		deleteAction = new Action() {
			public void run() {
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();
				deleteAlternative(obj);
			}
		};
		deleteAction.setText("Delete");
		deleteAction.setToolTipText("Delete");
		deleteAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
				getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));
		
		
		/**
		 *  Double-Click Action - sets the labels from the selected Alternative on the model
		 */
		
		clickAction = new Action() {
			public void run() {
				ModelImpl mi;
				CommandStack cs;
				
				ISelection selection = viewer.getSelection();
				Object obj = ((IStructuredSelection)selection).getFirstElement();

				// Remap all the alternatives if user double clicks on an
				// alternative
				if (obj instanceof TreeNode) {
					if (((TreeNode) obj).getObject() instanceof Alternative){
						Alternative altToSetLabels = (Alternative) ((TreeNode) obj).getObject();
						
						/* Get all the intention to label map  from the Alternative */
						HashMap<Intention, EvaluationLabel> intentionLabels = altToSetLabels.getIntentionLabels();
						Command setLabels;
						mi = ModelInstance.getModelImpl();
						cs = ModelInstance.getCommandStack();
						
						/* Set each label to the intention in the model */
						for (Intention i : intentionLabels.keySet() ) {
							setLabels = new SetQualitativeEvaluationLabelCommand(i, intentionLabels.get(i));
							if (cs != null)
								cs.execute(setLabels);
						}
					}
					
					// expand the node
					//viewer.expandToLevel(obj, 1);
				}
				
				/**
				 * Human Judgement code - commented out for now
				 */
				
				// check if user double clicked on a human judgment
				// if so, change the label of the intention to this judgment
				// and propagate the change
				if (obj instanceof TreeObject){
					TreeObject to = (TreeObject) obj;
					/*if (to.getObject() instanceof HumanJudgement){
						HumanJudgement judgement = (HumanJudgement) to.getObject();
						// get the parent, which is the Intention this label is associated with
						// and change the label
						if (to.getParent().getObject() instanceof Intention){
							Intention inten = (Intention) to.getParent().getObject();
							// TODO: How do you change the label???
							// TODO: How do you propagate the change??????
//							inten.setQualitativeReasoningCombinedLabel(label);
							// DEBUG
							// get the alternative
							TreeObject altNode = to.getParent().getParent();
							if(altNode != null){
								if (altNode.getObject() instanceof Alternative){
									Alternative alt = (Alternative)altNode.getObject();
									Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
									SoftgoalWrappers sgoalWrapper = alt.getSoftgoalWrappers();
									IntQualIntentionWrapper intWrapper = sgoalWrapper.findIntention(inten);
									InputWindowCommand wincom = new InputWindowCommand(ar[0], intWrapper);
									
									wincom.execute();
									
									// update the intention with the new judgment
									
									showMessage("Humanjudgement: " + judgement 
											+ "\nIntention: " + inten.getName()
											+ "\nAlternative: " + to.getParent().getParent().getName());
								}
							}
							return;
						}
					}*/
				}
				
				
				
			}
		};
	}

	/**
	 *  Deletes an Alternative from the model 
	 */
	protected void deleteAlternative(Object obj) {
		if (obj instanceof TreeNode) {
			ModelImpl mi = ModelInstance.getModelImpl();
			CommandStack cs = ModelInstance.getCommandStack();
			if (cs != null && mi != null) {

				/* Get the Alternative from the node object passed in */
				Alternative altToDelete = (Alternative) ((TreeNode) obj)
						.getAlternative();

				/* Show the confirmation dialog box */
				boolean confirm = showConfirm("Do you want to delete Alternate: "
						+ altToDelete.getName());

				if (confirm) {
					
					/* Create a new delete command */
					Command deleteCommand = new DeleteAlternativeCommand(
							altToDelete, mi);

					cs.execute(deleteCommand);
					
					/* Update and refresh view */
					clearView();
					loadAlternatives();
				}
			}
		}

	}

	/**
	 * Clears all content from the Alternatives view
	 */
	private void clearView() {
		
		/* Get the viewer's content provider */ 
		ViewContentProvider contentProvider = (ViewContentProvider) viewer
		.getContentProvider();
		
		/* Remove all nodes from the content provider */
		contentProvider.removeAllNodes();
		
	}

	/**
	 * Assigns the double-click action for the viewer
	 */
	private void hookDoubleClickAction() {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			public void doubleClick(DoubleClickEvent event) {
				clickAction.run();
			}
		});
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			// @Override
			public void selectionChanged(SelectionChangedEvent arg0) {
				clickAction.run();				
			}
		});
	}
	
	/**
	 * Shows a message in a dialog box with an OK button 
	 * @param message
	 */
	private void showMessage(String message) {
		MessageDialog.openInformation(
			viewer.getControl().getShell(),
			"Alternatives",
			message);
	}
	
	/**
	 * Shows a message in a confirmation dialog box
	 * @param message
	 * @return
	 */
	private boolean showConfirm (String message) {
		return MessageDialog.openConfirm(
				viewer.getControl().getShell(),
				"Delete Alternate?",
				message);
		
		
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}
	
	/**
	 * Add and show the specified Alternative in the view.
	 * @author aftabs
	 * @param alt
	 */
	public void addAlternative(Alternative alt) {
		
		// Get the content provider
		ViewContentProvider contentProvider = (ViewContentProvider) viewer
				.getContentProvider();

		
		// Add a node in the viewer tree structure
		TreeNode node = contentProvider.addNode(alt);
		node.setAlternateStatus(true);
		
		// Add all the intentions and human judgments if there are any
		// in the parent alternative object
		//contentProvider.addChildren(alt.getIntentions(), alt.getSoftgoalWrappers(), node);
		contentProvider.addChildren(alt.getIntentionLabels(), node);
		
		refreshView();
	}
	
	/**
	 * Refresh the view
	 * @author aftabs
	 */
	public void refreshView() {
		viewer.refresh();
		}
	
	/**
	 * Loads Alternatives from the model into the view
	 */
	private void loadAlternatives() {
		
		/* Get the active model */
		ModelImpl mi = ModelInstance.getModelImpl();
		
		if (mi!=null) {
			/* Get a list of all the Alternatives currently in the model */
			EList<Alternative> alts = mi.getAlternatives();
			
			/* Add each Alternative to the view */
			for (Alternative alt : alts) {
				addAlternative(alt);
			}
		}
		refreshView();
		
	}
	
	/**
	 * Collapses all nodes in the view
	 */
	
	private void collapseAll() {

		viewer.collapseAll();
		
		
	}
	
	/**
	 * Expands all nodes in the view
	 */
	private void expandAll() {
		
		viewer.expandAll();
		
	}
}