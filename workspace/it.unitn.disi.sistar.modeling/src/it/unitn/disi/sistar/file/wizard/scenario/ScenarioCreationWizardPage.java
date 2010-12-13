package it.unitn.disi.sistar.file.wizard.scenario;

import it.unitn.disi.sistar.file.wizard.common.CustomEditorUtil;

import java.io.InputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorWizardPage;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.util.DiagramFileCreator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;

public class ScenarioCreationWizardPage extends EditorWizardPage {

	private Text diagramFileText;
	private IFile diagramFileSelected;

	public ScenarioCreationWizardPage(IWorkbench workbench,
			IStructuredSelection selection) {
		super("CreationWizardPage", workbench, selection); //$NON-NLS-1$
		setTitle("Create Scenario");
		setDescription("Create a new Scenario");
		if(selection.getFirstElement() instanceof IFile && ((IFile)selection.getFirstElement()).exists() && 
				((IFile)selection.getFirstElement()).getFileExtension().equals("tpd"))
		{
			diagramFileSelected = (IFile)selection.getFirstElement();
		}
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		Control topLevel = getControl();
		
		Composite diagramFileSelection = new Composite((Composite)topLevel, SWT.NONE);
		GridLayout fileSelectionLayout = new GridLayout();
		fileSelectionLayout.numColumns=3;
		diagramFileSelection.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		diagramFileSelection.setLayout(fileSelectionLayout);
		Label diagramFileLabel = new Label(diagramFileSelection, SWT.NONE);
		diagramFileLabel.setText("Diagram File");
		
		diagramFileText = new Text(diagramFileSelection, SWT.BORDER);
		if(diagramFileSelected != null)
			diagramFileText.setText(diagramFileSelected.getFullPath().toPortableString());
		GridData textData = new GridData();
		textData.grabExcessHorizontalSpace= true;
		textData.horizontalAlignment= SWT.FILL;
		diagramFileText.setLayoutData(textData);
		Button diagramFileButton = new Button(diagramFileSelection, SWT.PUSH);
		diagramFileButton.setText("Browse");
		diagramFileButton.addSelectionListener(new SelectionListener()
		{
			public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
			}
			public void widgetSelected(SelectionEvent e) {
				
				IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
		        		"Select Diagram File", "Please Choose the Diagram File", false, 
		        		null, null);
				String fileName = filesSelected[0].getFullPath().toPortableString();
				diagramFileText.setText(fileName);
			}
			
		});
		
	}
	 @Override
	protected boolean validatePage() {
		boolean result = super.validatePage();
		if(diagramFileText!= null)
		{
			try {
				IFile linkedFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(diagramFileText.getText()));
				if(!linkedFile.exists()||!linkedFile.getFileExtension().equals("tpd"))
				{
					result = false;
					setErrorMessage("Please select a proper diagram file" );
				}
			} catch (Exception e) {
				result = false;
				setErrorMessage("Please select a proper diagram file" );
			}
		}
		return result;
	}

	public IFile createAndOpenDiagram(IPath containerPath, String fileName,
			InputStream initialContents, String kind, IWorkbenchWindow dWindow,
			IProgressMonitor progressMonitor, boolean saveDiagram) {
		return CustomEditorUtil.createAndOpenDiagram(getDiagramFileCreator(), 
				containerPath, fileName, initialContents, kind, dWindow, progressMonitor, 
				true, saveDiagram);
	}

	@Override
	public boolean doFinish(IProgressMonitor monitor) {
		if(!validatePage())
			return false;
		ScenarioCreationWizardUtil.createScenario(diagramFileText.getText(), getContainerFullPath() + "/" + getFileName());
		
		IFile scenarioFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(getContainerFullPath() + "/" + getFileName()));
		if (scenarioFile != null) {
			IDEEditorUtil.openDiagram(scenarioFile, workbench.getActiveWorkbenchWindow(), 
					true, monitor);
		}
		
		return true; 
	}
	public String getFileName() {
		String fileName = super.getFileName();

		if (fileName != null)
			fileName = getDiagramFileCreator().appendExtensionToFileName(fileName);

		return fileName;
	}

	
	protected String getDefaultFileName() {
		return "default"; //$NON-NLS-1$
	}
	
	@Override
	public DiagramFileCreator getDiagramFileCreator() {
		return ScenarioFileCreator.getInstance();
	}

}
