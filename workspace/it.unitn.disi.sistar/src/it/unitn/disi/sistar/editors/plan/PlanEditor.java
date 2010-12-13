package it.unitn.disi.sistar.editors.plan;


import it.unitn.disi.sistar.config.PlanConfig;
import it.unitn.disi.sistar.config.PlanConfigItem;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanElementListCellEditor;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanTableViewer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PredicateList;
import it.unitn.disi.sistar.files.plan.ProblemFile;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

public class PlanEditor extends MultiPageEditorPart implements IResourceChangeListener{

	private TextEditor editor;

	private IFile editorFile;
	private List mainAreaList;
	
	private int selectedTab = 0;
	private int selectedPage = 2;
	
	
	
	private PlanContainer root;
	public static Map<String, String>childNameMapping;
	static {
		childNameMapping = new HashMap<String, String>();
		childNameMapping.put("t_actor", "Actor");
		childNameMapping.put("t_goal", "Goal");
		childNameMapping.put("t_gtype", "Goal Type");
	}
	private Map<String, PlanContainer> childContainerMap;
	
	private PlanContainer selectedItem;
	private PlanPredicate selectedElement;
	
	private Composite leftPanel;
	private Composite mainPanel;
	
	private ScrolledComposite scrolledMainPanel;
	public PlanEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	void createPlainTextView() {
		try {
			editor = new TextEditor();
			int index = addPage(editor, getEditorInput());
			setPageText(index, "Plain Text");
		} catch (PartInitException e) {
			ErrorDialog.openError(
				getSite().getShell(),
				"Error creating nested text editor",
				null,
				e.getStatus());
		}
	}
	
	void createEditorView() throws Exception {
		Composite parent = getContainer();
		final Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		composite.setLayout(new GridLayout(2,false));
		
		leftPanel = new Composite(composite, SWT.NONE);
		leftPanel.setLayoutData(new GridData(SWT.LEFT, GridData.FILL, false, true));
		leftPanel.setLayout(new GridLayout(1,false));
		
		scrolledMainPanel = new ScrolledComposite(composite,SWT.V_SCROLL|SWT.H_SCROLL);
		scrolledMainPanel.setExpandVertical(true);
		scrolledMainPanel.setExpandHorizontal(true);
		scrolledMainPanel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		
		mainPanel = new ScrolledComposite(scrolledMainPanel, SWT.NONE);
		mainPanel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
		mainPanel.setLayout(new GridLayout(1,false));
		
		scrolledMainPanel.setContent(mainPanel);
		final Composite upperLeftPanel = new Composite(leftPanel, SWT.NONE);
		upperLeftPanel.setLayout(new GridLayout(5,false));
		
		final Composite lowerLeftPanel = new Composite(leftPanel, SWT.NONE);
		lowerLeftPanel.setLayoutData(new GridData( GridData.FILL,GridData.FILL, true, true));
		lowerLeftPanel.setLayout(new GridLayout(1,false));
		
		final TreeViewer treeViewer = new TreeViewer(lowerLeftPanel, SWT.NONE);
		treeViewer.setContentProvider(new PlanContentProvider());
		treeViewer.setLabelProvider(new PlanLabelProvider());
		treeViewer.setInput(getInitalInput());
		treeViewer.expandAll();
		treeViewer.getControl().setLayoutData( new GridData(GridData.FILL, GridData.FILL, true, true));
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener()
		{
			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection() instanceof IStructuredSelection)
				{
					selectedItem = (PlanContainer)((IStructuredSelection)event.getSelection()).getFirstElement();
					PlanConfig config = PlanConfig.getInstance();
					Map configMap = config.getPredicatesMap();
					
					if(scrolledMainPanel != null)
						scrolledMainPanel.dispose();
					if(selectedItem != null )
					{
						List configList = (List)configMap.get(selectedItem.getParent().getName());
						if(configList != null)
						{
							scrolledMainPanel = new ScrolledComposite(composite,SWT.V_SCROLL|SWT.H_SCROLL);
							scrolledMainPanel.setExpandVertical(true);
							scrolledMainPanel.setExpandHorizontal(true);
							scrolledMainPanel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
							
							mainPanel = new Composite(scrolledMainPanel, SWT.NONE);
							mainPanel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
							GridLayout mainPanelLayout = new GridLayout(1, false);
							mainPanelLayout.verticalSpacing = 0;
							mainPanel.setLayout(mainPanelLayout);
							
							scrolledMainPanel.setContent(mainPanel);
							
							Label elementName = new Label(mainPanel, SWT.NONE);
							elementName.setText("Name:" + selectedItem.getName());
							
							for (Iterator iter = configList.iterator(); iter
									.hasNext();) {
								
								final Composite upperMainPanel =  new Composite(mainPanel, SWT.NONE);
								upperMainPanel.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
								upperMainPanel.setLayout(new GridLayout(2, false));

								final PlanConfigItem element = (PlanConfigItem) iter.next();
								if (element.getName().compareTo("pr_passes")!=0 &&  element.getName().compareTo("pr_satisfies")!=0){
								final List headerNames = new ArrayList();
								final List headerTypes = new ArrayList();
								
								Label predicateNameLabel = new Label(upperMainPanel, SWT.NONE);
								predicateNameLabel.setLayoutData(new GridData(GridData.FILL, SWT.END, true, true));
								predicateNameLabel.setText(element.getName());
								int index = 1;
								for (Iterator iterator = element.getParameters().iterator(); iterator
										.hasNext();) {
									String arguments = (String) iterator.next();
									headerNames.add("Param" + index++ + ":" + arguments);
									headerTypes.add(arguments);
								}
								for (Iterator iterator = element.getParametersList().iterator(); iterator
								.hasNext();) {
										String arguments = (String) iterator.next();
										headerNames.add("ParamList" + index++ + ":" + arguments);
										headerTypes.add(arguments);
								}
								
								Composite editingButtonPart = new Composite(upperMainPanel, SWT.NONE);
								GridLayout layout = new GridLayout(2, false);
								layout.marginWidth = 0;
								layout.marginHeight = 0;
								editingButtonPart.setLayout(layout);
								editingButtonPart.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false));
								Button addPredicateButton = new Button(editingButtonPart, SWT.NONE);
								addPredicateButton.setText("Add");
								
								final Composite middleMainPart = new Composite(mainPanel, SWT.NONE);
								middleMainPart.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
								GridLayout middleMainPartLayout = new GridLayout(1,false);
								middleMainPartLayout.marginTop = 0;
								middleMainPart.setLayout(middleMainPartLayout);
								
								PredicateList planList = new PredicateList();
								List predicateContentList = selectedItem.getAttribute(element.getName());
								for (Iterator iterator = predicateContentList.iterator(); iterator
										.hasNext();) {
									PlanPredicate predicateContent = (PlanPredicate) iterator.next();
									planList.add(predicateContent);
								}
								final PlanTableViewer viewer = new PlanTableViewer(middleMainPart, planList, headerNames);
								viewer.setSelectionChangedListener(new ISelectionChangedListener(){
			                          public void selectionChanged(SelectionChangedEvent event) {
			                        	  selectedElement = (PlanPredicate)((IStructuredSelection)event.getSelection()).getFirstElement();	
			                          }
		                         });
								CellEditor[] editors = new CellEditor[headerNames.size()];
								for(int i = 1; i < headerNames.size(); i++)
								{
									String headerName = (String)headerNames.get(i);
									String headerType = (String)headerTypes.get(i);
									List selectionList = childContainerMap.get(headerType).getChildren();
									
									int addParam = ((String)headerNames.get(i)).startsWith("ParamList")?0:1;
									
									List choiceListTemp = new ArrayList();
									if(addParam == 1)
										choiceListTemp.add("[None Selected]");
									for(int j =0; j < selectionList.size(); j++)
									{
										PlanContainer plan = (PlanContainer)selectionList.get(j);
										if(!plan.getName().equals(selectedItem.getName()))
											choiceListTemp.add(plan.getName());
									}
									
									String[] choiceList = new String[choiceListTemp.size()];
									for (int j = 0; j < choiceList.length; j++) {
										choiceList[j] = (String)choiceListTemp.get(j);
									}
									if(((String)headerNames.get(i)).startsWith("ParamList"))
										editors[i] = new PlanElementListCellEditor(viewer.getTable(),
												choiceList, "", SWT.READ_ONLY);
									else
										editors[i] = new ComboBoxCellEditor(viewer.getTable(),
											choiceList, SWT.READ_ONLY);
								}
								viewer.setEditors(editors);
								middleMainPart.layout();
								
								addPredicateButton.addSelectionListener(new SelectionListener(){
									public void widgetDefaultSelected(SelectionEvent e) {
										widgetSelected(e);
									}
									public void widgetSelected(SelectionEvent e) {
										PlanPredicate predicate = new PlanPredicate();
										List contentList = new ArrayList();
										//contentList.add(element.getName());
										contentList.add(selectedItem.getName());
										for(int i = 0; i < headerNames.size() -1; i++)
										{
											//System.out.println(headerNames.get(i));
											//if(!((String)headerNames.get(i)).startsWith("ParamList"))
												contentList.add("");
										}
										predicate.setParams(contentList);
										selectedItem.addAttribute(element.getName(), predicate);
										viewer.getOptionList().add(predicate);
										middleMainPart.layout();
										scrolledMainPanel.setMinSize(mainPanel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
									}
								});
								
								Button deleteButton = new Button(editingButtonPart, SWT.NONE);
								deleteButton.setText("Delete");
								deleteButton.addSelectionListener(new SelectionListener(){
									public void widgetDefaultSelected(SelectionEvent e) {
										widgetSelected(e);
									}
									public void widgetSelected(SelectionEvent e) {
										if(selectedElement!= null)
										{	
											selectedItem.removeAttribute(element.getName(), selectedElement);
											viewer.getOptionList().remove(selectedElement);
										}
										
										middleMainPart.layout();
										scrolledMainPanel.setMinSize(mainPanel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
									}
								});
								scrolledMainPanel.setMinSize(mainPanel.computeSize(SWT.DEFAULT, SWT.DEFAULT));
							}
							}
						}
						composite.layout();
					}
					
				}
			}
		});
		Tree tree = treeViewer.getTree();
        TreeColumn objectColumn = new TreeColumn(tree, SWT.NONE);
        objectColumn.setText("test Tree");
        objectColumn.setResizable(true);
        objectColumn.setWidth(150);
		CellEditor cellEditors[] = new CellEditor[1];
		CellEditor descriptionCellEditor = new TextCellEditor(treeViewer
		                          				.getTree(), SWT.BORDER);
		cellEditors[0] = descriptionCellEditor;
		treeViewer.setColumnProperties(new String[]{"1"});
		treeViewer.setCellEditors(cellEditors);
		treeViewer.setCellModifier(new ICellModifier(){
	
			public boolean canModify(Object element, String property) {
				if(element instanceof PlanContainer)
					if(((PlanContainer)element).getParent() == root)
						return false;
				return true;
			}
			
			
			public void modify(Object element, String property, Object value) {
				if(element instanceof TreeItem && ((TreeItem)element).getData() instanceof PlanContainer)
				{
					PlanContainer changedItem = (PlanContainer)((TreeItem)element).getData();
					String oldName = changedItem.getName();
					changedItem.setName((String)value);
					
					for (Iterator iter = childContainerMap.keySet().iterator(); iter.hasNext();) {
						String key = (String) iter.next();
						PlanContainer child = childContainerMap.get(key);
						for (Iterator inner = child.getChildren().iterator(); inner.hasNext();) {
							PlanContainer container = (PlanContainer) inner.next();
							PlanEditorUtil.refreshNames(container, oldName, changedItem.getName(), false);
						}
					}
					treeViewer.refresh(changedItem);
					if(!oldName.equals(changedItem.getName()))
						treeViewer.setSelection(new StructuredSelection(changedItem), true);
				}
			}
			public Object getValue(Object element, String property) {
				if(element instanceof PlanContainer)
					return ((PlanContainer)element).getName();
				return null;
			}
		});
		for (Iterator iter = childContainerMap.keySet().iterator(); iter.hasNext();) {
			final String key = (String) iter.next();
			final PlanContainer childContainer = childContainerMap.get(key);
			final Button button = new Button(upperLeftPanel, SWT.NONE);
			button.setText("New " + key);
			button.addSelectionListener(new SelectionListener()
			{
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);	
				}
				public void widgetSelected(SelectionEvent e) {
					int size = childContainer.size();
					PlanContainer newElement = new PlanContainer(key + (size + 1));
					childContainer.add(newElement);
					treeViewer.refresh(childContainer);
					treeViewer.expandToLevel(newElement, 2);
				}
			});
		}
		final Button saveButton = new Button(upperLeftPanel, SWT.NONE);
		saveButton.setText("Save");
		saveButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);	
			}
			public void widgetSelected(SelectionEvent e){
				ProblemFile file = new ProblemFile(FileUtil.toFile(editorFile));
				file.setChildContainerMap(childContainerMap);
				try {
					file.save();
					editorFile.refreshLocal(0, null);
				} catch (Exception e1) {
					ConsoleUtil.printExceptionToConsole(e1);
				}
			}
		});
		
		final Button removeElementButton = new Button(upperLeftPanel, SWT.NONE);
		removeElementButton.setText("Delete");
		removeElementButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);	
			}
			public void widgetSelected(SelectionEvent e) {
				if(selectedItem != null && selectedItem.getParent() != root)
				{
					for (Iterator iter = childContainerMap.keySet().iterator(); iter.hasNext();) {
						String key = (String) iter.next();
						PlanContainer child = childContainerMap.get(key);
						for (Iterator inner = child.getChildren().iterator(); inner.hasNext();) {
							PlanContainer container = (PlanContainer) inner.next();
							PlanEditorUtil.refreshNames(container, selectedItem.getName(), "", true);
						}
					}
					
					selectedItem.getParent().remove(selectedItem);
					treeViewer.refresh(selectedItem.getParent());
				}
			}
		});

		
		int index = addPage(composite);
		setPageText(index, "Tabular View");
		
	}
	
	public PlanContainer getInitalInput()  throws Exception{
		root = new PlanContainer();
		ProblemFile file = new ProblemFile(FileUtil.toFile(editorFile));
		file.load();
		childContainerMap = file.getChildContainerMap();
		//childContainerMap = new HashMap<String, PlanContainer>();
			for (Iterator iter = childNameMapping.keySet().iterator(); iter.hasNext();) {
				String key = (String) iter.next();
				if(childContainerMap.get(key) == null)
				{
					PlanContainer child = new PlanContainer(key);
					childContainerMap.put(key, child);
					root.add(child);
				}else
					root.add(childContainerMap.get(key));
			}
		
		
		return root;
	}
	
	protected void createPages() {
		if(getContainer().getChildren().length > 0)
		{
			selectedTab = 1;
			selectedPage = getActivePage();
		}
		try {
			createPlainTextView();
			createEditorView();
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		int pageCount = getPageCount();
		if(pageCount > 2)
			for(int i = 1;i >= 0; i--)
			{
				removePage(i);
			}
		setActivePage(1);
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor);
	}
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor = getEditor(0);
		editor.doSaveAs();
		setPageText(0, editor.getTitle());
		setInput(editor.getEditorInput());
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		
		super.init(site, editorInput);
		IFileEditorInput fileEditorInput = (IFileEditorInput)editorInput;

		editorFile = fileEditorInput.getFile();
		setPartName(editorFile.getName());
		editorFile.getWorkspace().addResourceChangeListener(this);
	}
	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
	}
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
						if(((FileEditorInput)editor.getEditorInput()).getFile().getProject().equals(event.getResource())){
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart,true);
						}
					}
				}            
			});
		}else if(event.getType() == IResourceChangeEvent.POST_CHANGE &&
				event.getDelta().findMember(editorFile.getFullPath())!= null){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					createPages();
				}            
			});
		}
	}
}
