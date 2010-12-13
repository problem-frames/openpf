package it.unitn.disi.sistar.editors.scenario;


import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.editors.scenario.viewers.ScenarioOptionList;
import it.unitn.disi.sistar.editors.scenario.viewers.ScenarioTableViewer;
import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.util.CollectionUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
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

public class ScenarioEditor extends MultiPageEditorPart implements IResourceChangeListener{

	private TextEditor editor;

	private IFile editorFile;
	private List mainAreaList;
	
	private int selectedTab = 0;
	private int selectedPage = 2;
	
	public ScenarioEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	void createPage0() {
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
	void createPage1() {
		String diagramFileName = null;
		try {
			diagramFileName = (String)editorFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		mainAreaList = new ArrayList();
		
		Composite parent = getContainer();
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		Composite firstSection = new Composite(composite, SWT.NONE);
		firstSection.setLayout(new GridLayout(2,false));
		Label filenameLabel = new Label(firstSection, SWT.NONE);
		filenameLabel.setText("Base File:" );
		
		Label filenameLabelValue = new Label(firstSection, SWT.NONE);
		filenameLabelValue.setText(diagramFileName);

		CTabFolder main = new CTabFolder(composite, SWT.BORDER|SWT.H_SCROLL);

		main.setLayoutData(new GridData(composite.getShell().getClientArea().width-300, SWT.DEFAULT));
		Composite bottomPart = new Composite(composite, SWT.NONE);
		bottomPart.setLayout(new GridLayout());
		
		Button saveButton = new Button(bottomPart, SWT.PUSH);
		saveButton.setText("Save");
		saveButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
				this.widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
				try {
					StringBuffer buffer = new StringBuffer();
					for (Iterator iter = mainAreaList.iterator(); iter.hasNext();) {
						Composite element = (Composite) iter.next();
						Control[] control = element.getChildren();
						for (int i = 0; i < control.length; i++) {
							Control widget = (Control)control[i];
							if(widget instanceof Text)
							{
								buffer.append(((Text)widget).getText());
								if(i != control.length -1)
									buffer.append(",");
							}
							else if (widget instanceof Composite)
							{
								Composite subArea = (Composite)widget;
								Control[] controlButton = (Control[])subArea.getChildren();

								for (int j = 0; j < controlButton.length; j++) {
									if(controlButton[j] instanceof Button)
									{
										Button button = (Button) controlButton[j];
										if(button.getText().equals("Yes") && button.getSelection())
											buffer.append(1);
										else if(button.getText().equals("No") && button.getSelection())
											buffer.append(2);
										else if(button.getText().equals("Auto") && button.getSelection())
											buffer.append(0);
									}
								}
								if(i != control.length -1)
									buffer.append(",");
							}
							
							
						}
						if(iter.hasNext())
							buffer.append("\n");
					}
					
					editorFile.setContents(new StringBufferInputStream(buffer.toString()), IResource.FORCE|IResource.KEEP_HISTORY, null);
					MessageDialog.openInformation(getContainer().getShell(), "Save", "Save Successful");
				} catch (Throwable e1) {
					ConsoleUtil.printExceptionToConsole(e1);
				}	
			}
			
		});
		saveButton.setLayoutData(new GridData(SWT.RIGHT, SWT.DEFAULT, true, true));
		
		String editorText =
			editor.getDocumentProvider().getDocument(editor.getEditorInput()).get();
		BufferedReader reader = new BufferedReader(new StringReader(editorText));
		try {
			for(String line = reader.readLine(); line != null; line = reader.readLine()){
				CTabItem item = new CTabItem(main, SWT.NONE);
				Composite mainArea = new Composite(main, SWT.NONE);
				item.setControl(mainArea);

				if(line== null)continue;
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				List contentLine = new ArrayList();
				while(tokenizer.hasMoreElements())
				{
					contentLine.add(tokenizer.nextElement());
				}
				item.setText((String)contentLine.get(0));

				mainArea.setLayout(new GridLayout(2, false));
				mainAreaList.add(mainArea);
				
				VerifyListener listener = new VerifyListener()
				{
					public void verifyText(VerifyEvent e) {
						boolean modify = true;
						((Text)(e.widget)).setData(((Text)(e.widget)).getText());
						try {
							if(!e.text.equals(".")&&!e.text.equals(""))
							{
								Double.parseDouble(e.text);
							}
						} catch (Exception ex) {
							modify = false;
						}
						e.doit = modify;
					}
				};
				
				Label goalNameLabel = new Label(mainArea, SWT.NONE);
				goalNameLabel.setText("Goal Name" );
				goalNameLabel.setLayoutData(new GridData(100, SWT.DEFAULT));
				
				Text goalValueLabel = new Text(mainArea, SWT.NONE|SWT.READ_ONLY);
				goalValueLabel.setText((String)contentLine.get(0));
				
				Label topGoalLabel = new Label(mainArea, SWT.NONE);
				topGoalLabel.setText("Top Goal" );
				
				Composite topGoalParent = new Composite(mainArea, SWT.NONE);
				topGoalParent.setLayout(new GridLayout(3, false));
				
				int topGoalOption = (int)Double.parseDouble((String)contentLine.get(1));
				Button topGoalYesButton = new Button(topGoalParent, SWT.RADIO);
				topGoalYesButton.setSelection(topGoalOption == 1);
				topGoalYesButton.setText("Yes" );
				
				Button topGoalNoButton = new Button(topGoalParent, SWT.RADIO);
				topGoalNoButton.setSelection(topGoalOption == 2);
				topGoalNoButton.setText("No" );
				
				Button topGoalAutoButton = new Button(topGoalParent, SWT.RADIO);
				topGoalAutoButton.setSelection(topGoalOption == 0);
				topGoalAutoButton.setText("Auto" );

				Label inputLabel = new Label(mainArea, SWT.NONE);
				inputLabel.setText("Input" );
				
				Composite inputParent = new Composite(mainArea, SWT.NONE);
				inputParent.setLayout(new GridLayout(3, false));
				
				int inputOption = (int)Double.parseDouble((String)contentLine.get(2));
				
				Button inputYesButton = new Button(inputParent, SWT.RADIO);
				inputYesButton.setSelection(inputOption == 1);
				inputYesButton.setText("Yes" );
				
				Button inputNoButton = new Button(inputParent, SWT.RADIO);
				inputNoButton.setSelection(inputOption == 2);
				inputNoButton.setText("No" );
				
				Button inputAutoButton = new Button(inputParent, SWT.RADIO);
				inputAutoButton.setSelection(inputOption == 0);
				inputAutoButton.setText("Auto" );
				
				Label inputSATLabel = new Label(mainArea, SWT.NONE);
				inputSATLabel.setText("Input SAT" );
				
				String inputSATValue = (String)contentLine.get(3);
				Text inputSATText = new Text(mainArea, SWT.BORDER);
				inputSATText.setText(inputSATValue);
				inputSATText.setLayoutData(new GridData(150,SWT.DEFAULT));
				inputSATText.addVerifyListener(listener);
				
				inputSATText.addModifyListener(new ModifyListener(){
					public void modifyText(ModifyEvent e) {
						try {
							double textValue = Double.parseDouble(((Text)e.widget).getText());
							if(textValue < 0 || textValue > 1)
								((Text)e.widget).setText((String)e.widget.getData());
						} catch (NumberFormatException e1) {
							((Text)e.widget).setText((String)e.widget.getData());
						}
					}
				});
				Label inputDENLabel = new Label(mainArea, SWT.NONE);
				inputDENLabel.setText("Input DEN" );
				
				String inputDENValue = (String)contentLine.get(4);
				Text inputDENText = new Text(mainArea, SWT.BORDER);
				inputDENText.setText(inputDENValue);
				inputDENText.setLayoutData(new GridData(150,SWT.DEFAULT));
				inputDENText.addVerifyListener(listener);
				
				Label outputSATLabel = new Label(mainArea, SWT.NONE);
				outputSATLabel.setText("Output SAT" );
				
				String outputSATValue = (String)contentLine.get(5);
				Text outputSATText = new Text(mainArea, SWT.BORDER);
				outputSATText.addVerifyListener(listener);
				outputSATText.setLayoutData(new GridData(150,SWT.DEFAULT));
				outputSATText.setText(outputSATValue);
				outputSATText.setEditable(false);
				
				Label outputDENLabel = new Label(mainArea, SWT.NONE);
				outputDENLabel.setText("Output DEN" );
				
				String outputDENValue = (String)contentLine.get(6);
				Text outputDENText = new Text(mainArea, SWT.BORDER);
				outputDENText.addVerifyListener(listener);
				outputDENText.setLayoutData(new GridData(150,SWT.DEFAULT));
				outputDENText.setText(outputDENValue);
				outputDENText.setEditable(false);
			}
			main.setSelection(selectedTab);
			reader.close();
		} catch (IOException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		
	
		int index = addPage(composite);
		setPageText(index, "Properties");
		
	}
	
	void createPage3() throws Exception {
		String diagramFileName = (String)editorFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
		Composite parent = getContainer();
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		Composite firstSection = new Composite(composite, SWT.NONE);
		firstSection.setLayout(new GridLayout(2,false));
		Label filenameLabel = new Label(firstSection, SWT.NONE);
		filenameLabel.setText("Base File:" );
		
		Label filenameLabelValue = new Label(firstSection, SWT.NONE);
		filenameLabelValue.setText(diagramFileName);

		ScenarioOptionList list = new ScenarioOptionList();
		ScenarioFile file = new ScenarioFile(FileUtil.toFile(((FileEditorInput)editor.getEditorInput()).getFile()));
		file.load();
		list.setScenarios(file.getContentList());
		
		List columnList = new ArrayList();
		columnList.add(GoalSolver.NAME_COLUMN);
		columnList.add(GoalSolver.TOPGOAL_COLUMN);
		columnList.add(GoalSolver.INPUT_COLUMN);
		columnList.add(GoalSolver.INPUT_SAT);
		columnList.add(GoalSolver.INPUT_DEN);
		columnList.add(GoalSolver.OUTPUT_SAT);
		columnList.add(GoalSolver.OUTPUT_DEN);
		List propertyList =  (List)PropertyConfig.getInstance().getServiceProperties().get("SERVICE");
		columnList.addAll(propertyList);
		
		String[] columnNames = CollectionUtil.listToStringArray(columnList);
		
		final ScenarioTableViewer scenarioTableViewer = 
			new ScenarioTableViewer(composite, list, columnNames);
		CellEditor[] editors = new CellEditor[columnNames.length];
		for(int i = 0; i < editors.length; i++)
		{
			editors[i] = new TextCellEditor(scenarioTableViewer.getTable());
		}
		editors[columnList.indexOf(GoalSolver.NAME_COLUMN)] = null;
		
		editors[columnList.indexOf(GoalSolver.TOPGOAL_COLUMN)] = new ComboBoxCellEditor(scenarioTableViewer.getTable(), list.getChoiceSelection(), SWT.READ_ONLY);
		editors[columnList.indexOf(GoalSolver.INPUT_COLUMN)] = new ComboBoxCellEditor(scenarioTableViewer.getTable(), list.getChoiceSelection(), SWT.READ_ONLY);

		scenarioTableViewer.setEditors(editors);
		
		Composite bottomPart = new Composite(composite, SWT.NONE);
		bottomPart.setLayout(new GridLayout(2, false));
		
		Button saveButton = new Button(bottomPart, SWT.PUSH);
		saveButton.setText("Save");
		saveButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
				this.widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
				try {
					ScenarioOptionList list = scenarioTableViewer.getOptionList();
					ScenarioFile file = new ScenarioFile(new File(editorFile.getRawLocationURI().getPath()));
					file.setContentList(list.getScenarios());
					file.save();
					editorFile.refreshLocal(0, null);
					MessageDialog.openInformation(getContainer().getShell(), "Save", "Save Successful");
				} catch (Throwable e1) {
					ConsoleUtil.printExceptionToConsole(e1);
				}	
			}
			
		});
		saveButton.setLayoutData(new GridData(SWT.RIGHT, SWT.DEFAULT, true, true));
		Button resetButton = new Button(bottomPart, SWT.PUSH);
		resetButton.setText("Reset");
		resetButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
				this.widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e){
				try {
					ScenarioOptionList list = scenarioTableViewer.getOptionList();
					ScenarioFile file = new ScenarioFile(new File(editorFile.getRawLocationURI().getPath()));
					file.setContentList(list.getScenarios());
					for (Iterator iter = file.getContentList().iterator(); iter.hasNext();) {
						GoalSolver element = (GoalSolver) iter.next();
						element.setOutputSAT(0);
						element.setOutputDEN(0);
					}
					file.save();
					editorFile.refreshLocal(0, null);
					//MessageDialog.openInformation(new Shell(), "Save", "Save Successful");
				} catch (Throwable e1) {
					ConsoleUtil.printExceptionToConsole(e1);
				}	
			}
			
		});
		resetButton.setLayoutData(new GridData(SWT.RIGHT, SWT.DEFAULT, true, true));
		int index = addPage(composite);
		setPageText(index, "Tabular View");
		
	}

	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		if(getContainer().getChildren().length > 0)
		{
			selectedTab = 1;
			selectedPage = getActivePage();
		}
		try {
			createPage0();
			createPage3();
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
