package it.unitn.disi.sistar.importWizards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.unitn.disi.sistar.config.PlanConfig;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.DelegationFeedback;
import it.unitn.disi.sistar.editors.plan.viewers.table.DelegationFeedbackCellModifier;
import it.unitn.disi.sistar.editors.plan.viewers.table.DelegationLabelProvider;
import it.unitn.disi.sistar.editors.plan.viewers.table.FeedbackPredicate;
import it.unitn.disi.sistar.editors.plan.viewers.table.FeedbackTableViewer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;
import it.unitn.disi.sistar.editors.plan.viewers.table.SatisfactionFeedback;
import it.unitn.disi.sistar.editors.plan.viewers.table.SatisfactionFeedbackCellModifier;
import it.unitn.disi.sistar.editors.plan.viewers.table.SatisfactionLabelProvider;
import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;
import it.unitn.disi.sistar.files.plan.PlanFile;
import it.unitn.disi.sistar.files.plan.ProblemFile;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ITableLabelProvider;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellEditorListener;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;

import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import org.eclipse.jface.viewers.CellEditor;

public class UserFeedbackWizardPage extends WizardPage implements Listener {
	
	protected IWorkbench workbench;
	protected IStructuredSelection selection;

	private List<SatisfactionFeedback> satisfyPredicate; 
	private List<DelegationFeedback> delegatePredicate;

	private String[] actors;
	private String[] goals;

	private ScrolledComposite mainScrolComposite;
	private ScrolledComposite tableSatScrolComposite;
	private ScrolledComposite tableDelScrolComposite;
	private Composite composite;

	private Composite compositeButtonSat;
	private Composite compositeButtonDel;

	private FeedbackTableViewer tableViewerSat;
	private FeedbackTableViewer tableViewerDel;

	private Button addSatButton;
	private Button addDelButton;
	private Button deleteSatButton;
	private Button deleteDelButton;

	private CellEditor[] editorsSat;
	private CellEditor[] editorsDel;
	
	private DelegationFeedback selectedItemDel;
	private SatisfactionFeedback selectedItemSat;
	
	private PlanContainerMapUtility containerMap;

	public UserFeedbackWizardPage(IWorkbench workbenchL, IStructuredSelection selectionL, IFile output, PlanContainerMapUtility containerMap) {
		super("Page1");
		setTitle("User Feedback");
		setDescription("Select the details of the planning domain.");
		workbench = workbenchL;
		selection = selectionL;
		this.containerMap = containerMap;
		actors= containerMap.getAllActors();
		goals= containerMap.getAllGoals();
		PlanFile outputPlan;
		try {
		    outputPlan = new PlanFile(FileUtil.toFile(output));
			outputPlan.load();			
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);	
			ConsoleUtil.printToConsole("An error is occurred during the loading of " + output.getName());
			return;
		}
		try {
			satisfyPredicate = SatisfactionFeedback.getSatisfyPredicate(outputPlan.getContentList(), actors, goals, containerMap);
			} catch (ActorNotFoundException e) {
				MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "The original planning domain has been modified, try to run the plan analysis. ");
				satisfyPredicate = new ArrayList<SatisfactionFeedback>();
			} catch (GoalNotFoundException e) {
				MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "The original planning domain has been modified, try to run the plan analysis. ");
				satisfyPredicate = new ArrayList<SatisfactionFeedback>();
			}
			try {
				delegatePredicate = DelegationFeedback.getDelegatePredicate(outputPlan.getContentList(), actors, goals, containerMap);
				} catch (ActorNotFoundException e) {
					MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "The original planning domain has been modified, try to run the plan analysis. ");
					delegatePredicate = new ArrayList<DelegationFeedback>();
				} catch (GoalNotFoundException e) {
					MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "The original planning domain has been modified, try to run the plan analysis. ");
					delegatePredicate = new ArrayList<DelegationFeedback>();
				}

	}

	public void createControl(Composite parent) {

//		create the composite to hold the widgets
		mainScrolComposite = new ScrolledComposite(parent, SWT.V_SCROLL);
		mainScrolComposite.setVisible(true);
		mainScrolComposite.setLayout(new RowLayout(SWT.HORIZONTAL));

		mainScrolComposite.setMinSize(700, 410);
		// Expand both horizontally and vertically
		mainScrolComposite.setExpandHorizontal(true);
		mainScrolComposite.setExpandVertical(true);
		
		composite = new Composite(mainScrolComposite, SWT.NONE);
		composite.setVisible(true);
		mainScrolComposite.setContent(composite);
	
		tableSatScrolComposite =  new ScrolledComposite(composite, SWT.V_SCROLL);
		tableSatScrolComposite.setLayout(new GridLayout(1,false));
		tableSatScrolComposite.setBounds(0, 0, 550, 150);

		compositeButtonSat = new Composite(composite, SWT.NONE);
		compositeButtonSat.setLayout(new GridLayout(2,false));
		compositeButtonSat.setBounds(0, 160, 550, 50);

		tableDelScrolComposite =  new ScrolledComposite(composite,  SWT.V_SCROLL);
		tableDelScrolComposite.setBounds(0, 220, 550, 150);
		tableDelScrolComposite.setVisible(true);

		compositeButtonDel = new Composite(composite, SWT.NONE);
		compositeButtonDel.setLayout(new GridLayout(2,false));
		compositeButtonDel.setBounds(0, 380, 550, 50);

		addSatButton = new Button(compositeButtonSat,SWT.PUSH);
		addSatButton.setText("Add");
		addSatButton.setBounds(5, 5, 50, 30);
		deleteSatButton = new Button(compositeButtonSat,SWT.PUSH);
		deleteSatButton.setText("Delete");
		deleteSatButton.setBounds(35, 5, 50, 30);
		addSatButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {				
				SatisfactionFeedback sp = new SatisfactionFeedback("[None selected]", "[None selected]", FeedbackPredicate.NO_STATUS, false);
				tableViewerSat.getOptionList().add(sp);
				tableViewerSat.refresh();
			}
		});
		deleteSatButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {
				if(tableViewerSat.getOptionList().size()==0){
					MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "No element in the table!");
					return;
				}
				if (selectedItemSat!=null){
					tableViewerSat.getOptionList().remove(selectedItemSat);
					tableViewerSat.refresh();
				}else{
					MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Worning", "Select an element!");
				}
			}
		});
		tableViewerSat = new FeedbackTableViewer(tableSatScrolComposite, satisfyPredicate, FeedbackPredicate.COLUMNSAT);
		tableViewerSat.setSelectionChangedListener(new ISelectionChangedListener(){
			public void selectionChanged(SelectionChangedEvent event) {
				if(event.getSelection() instanceof IStructuredSelection){
					selectedItemSat = (SatisfactionFeedback)((IStructuredSelection)event.getSelection()).getFirstElement();
				}
			}
			});
		tableViewerSat.setCellModifier(new SatisfactionFeedbackCellModifier(tableViewerSat, containerMap));
		tableViewerSat.setLabelProvider(new SatisfactionLabelProvider());		
		editorsSat = new CellEditor[4];
		editorsSat[0] = new ComboBoxCellEditor(tableViewerSat.getTable(), actors,SWT.READ_ONLY);
		editorsSat[1] = new ComboBoxCellEditor(tableViewerSat.getTable(), goals, SWT.READ_ONLY);
		editorsSat[3] = new ComboBoxCellEditor(tableViewerSat.getTable(), FeedbackPredicate.STATUS_VAL,SWT.READ_ONLY);
		editorsSat[2] = new CheckboxCellEditor(tableViewerSat.getTable());
		tableViewerSat.setEditors(editorsSat);
				
			mainScrolComposite.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle area = mainScrolComposite.getClientArea();
				composite.setSize(area.width, composite.getSize().y);
				tableSatScrolComposite.setSize(area.width, tableSatScrolComposite.getSize().y);
				tableDelScrolComposite.setSize(area.width, tableDelScrolComposite.getSize().y);
				compositeButtonDel.setSize(area.width, compositeButtonDel.getSize().y);
				compositeButtonSat.setSize(area.width, compositeButtonSat.getSize().y);
				tableViewerSat.resize(area);
				tableViewerDel.resize(area);
			}
		});

			addDelButton = new Button(compositeButtonDel,SWT.PUSH);
			addDelButton.setText("Add");
			addDelButton.setBounds(5, 5, 50, 30);
			deleteDelButton = new Button(compositeButtonDel,SWT.PUSH);
			deleteDelButton.setText("Delete");
			deleteDelButton.setBounds(35, 5, 50, 30);
			
			addDelButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					DelegationFeedback sp = new DelegationFeedback("[None selected]", "[None selected]","[None selected]", FeedbackPredicate.NO_STATUS, false);
					tableViewerDel.getOptionList().add(sp);
					tableViewerDel.refresh();
				}
			});
			
			deleteDelButton.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent event) {
					if(tableViewerDel.getOptionList().size()==0){
						MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", "No element in the table!");
						return;
						
					}
					if (selectedItemDel!=null){
						tableViewerDel.getOptionList().remove(selectedItemDel);
						tableViewerDel.refresh();
					}else{
						MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Worning", "Select an element!");
					}
				}
			});
			tableViewerDel = new FeedbackTableViewer(tableDelScrolComposite, delegatePredicate, FeedbackPredicate.COLUMNDEL);
			tableViewerDel.setSelectionChangedListener(new ISelectionChangedListener(){
				public void selectionChanged(SelectionChangedEvent event) {
					if(event.getSelection() instanceof IStructuredSelection){
						selectedItemDel = (DelegationFeedback)((IStructuredSelection)event.getSelection()).getFirstElement();
					}
				}
				});
		
			editorsDel = new CellEditor[5];
			editorsDel[0] = new ComboBoxCellEditor(tableViewerDel.getTable(), actors,SWT.READ_ONLY);
			editorsDel[1] = new ComboBoxCellEditor(tableViewerDel.getTable(), goals, SWT.READ_ONLY);
			editorsDel[2] = new ComboBoxCellEditor(tableViewerDel.getTable(), actors,SWT.READ_ONLY);
			editorsDel[4] = new ComboBoxCellEditor(tableViewerDel.getTable(), FeedbackPredicate.STATUS_VAL,SWT.READ_ONLY);
			editorsDel[3] = new CheckboxCellEditor(tableViewerDel.getTable());
			tableViewerDel.setEditors(editorsDel);
			tableViewerDel.setCellModifier(new DelegationFeedbackCellModifier(tableViewerDel, containerMap));
			tableViewerDel.setLabelProvider(new DelegationLabelProvider());

		setControl(mainScrolComposite);
	}

	public void handleEvent(Event event) {
		// TODO Auto-generated method stub
		
	}
	
	public List getSatisfyUserFeedback(){
		return new ArrayList(tableViewerSat.getOptionList());
	}
	
	public List getDelegateUserFeedback(){
		return new ArrayList(tableViewerDel.getOptionList());
	}
		
	public Map<String,PlanContainer> createNewProblem(){
		PlanContainerMapUtility mapUtility =null;
		try {
			mapUtility = containerMap.performSatUserFeedback(tableViewerSat.getOptionList());
		if (mapUtility == null){
			return null;
		}
		mapUtility = mapUtility.performDelUserFeedback(tableViewerDel.getOptionList());
		} catch (ActorNotFoundException e) {
			MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");
		} catch (GoalNotFoundException e) {
			MessageDialog.openInformation(workbench.getActiveWorkbenchWindow().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");
		}
		if (mapUtility == null){
			return null;
		}
		return mapUtility.getPlanContainerMap();
	}
		
	public boolean areTablesComplete(){
		Iterator iter = tableViewerSat.getOptionList().iterator();
		while(iter.hasNext()){
			SatisfactionFeedback sp = (SatisfactionFeedback)iter.next();
			if (sp.getActor().compareTo("[None selected]")==0){
					return false;
			}else if (sp.getGoal().compareTo("[None selected]")==0){
				return false;
			}
		}iter = tableViewerDel.getOptionList().iterator();
		while(iter.hasNext()){
			DelegationFeedback sp = (DelegationFeedback)iter.next();
			if (sp.getDelegator().compareTo("[None selected]")==0){
					return false;
			}else if (sp.getDelegate().compareTo("[None selected]")==0){
				return false;
			}else if (sp.getGoal().compareTo("[None selected]")==0){
				return false;
			}
		}
		return true;
	}
}