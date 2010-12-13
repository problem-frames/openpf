package it.unitn.disi.sistar.file.wizard.a5;

import java.util.Collections;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (xml).
 */

public class A5CreationWizardPage extends WizardPage {
	private Text containerText;
	
	private Text patternFileText;
	private Text classFileText;
	
	private Text fileTextSce;
	private Text fileTextSol;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public A5CreationWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Multi-page Editor File");
		setDescription("This wizard creates a new file with *.xml extension that can be opened by a multi-page editor.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		//Container Boxes
		
		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		//Class File Boxes
		
		label = new Label(container, SWT.NULL);
		label.setText("&Class File name:");
		classFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		classFileText.setLayoutData(gd);
		classFileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button buttonSce = new Button(container, SWT.PUSH);
		buttonSce.setText("Browse...");
		buttonSce.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleClassFileBrowse();
			}
		});
		
		//Pattern File Boxes
		
		label = new Label(container, SWT.NULL);
		label.setText("&Pattern File name:");

		patternFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		patternFileText.setLayoutData(gd);
		patternFileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("");
		
		//Scenario file Boxes
		
		label = new Label(container, SWT.NULL);
		label.setText("&Context diagram file:");

		fileTextSce = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gdScenario = new GridData(GridData.FILL_HORIZONTAL);
		fileTextSce.setLayoutData(gdScenario);
		fileTextSce.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		buttonSce = new Button(container, SWT.PUSH);
		buttonSce.setText("Browse...");
		buttonSce.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleScenarioFileBrowse();
			}
		});
		
		//Solution file boxes
		
		label = new Label(container, SWT.NULL);
		label.setText("&Solution diagram file:");

		fileTextSol = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gdSolution = new GridData(GridData.FILL_HORIZONTAL);
		fileTextSol.setLayoutData(gdSolution);
		fileTextSol.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button buttonSol = new Button(container, SWT.PUSH);
		buttonSol.setText("Browse...");
		buttonSol.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleSolutionFileBrowse();
			}
		});

		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				containerText.setText(container.getFullPath().toString());
			}
		}
		patternFileText.setText("new_file_pattern.xml");
		classFileText.setText("");
	}
	
	ViewerFilter tpdFilter = new ViewerFilter()
    {
      
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("tpd");
      }
    };
    
    ViewerFilter xmlFilter = new ViewerFilter()
    {
      
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("xml");
      }
    };
    
	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select new file container");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				containerText.setText(((Path) result[0]).toString());
			}
		}
	}
	
	private void handleClassFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Diagram File", "Please Choose the Diagram File", false, 
        		null, Collections.singletonList(xmlFilter));
		String fileName = filesSelected[0].getName().toString();
		classFileText.setText(fileName);
	}

	private void handleScenarioFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Diagram File", "Please Choose the Diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		fileTextSce.setText(fileName);
	}
	
	private void handleSolutionFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Diagram File", "Please Choose the Diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		fileTextSol.setText(fileName);
	}
	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String patternFileName = getPatternFileName();
		String classFileName = getClassFileName();
		String scenarioFileName = getSceFileName();
		String solutionFileName = getSolFileName();

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (patternFileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		/*if (patternFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}*/
		int pattDotLoc = patternFileName.lastIndexOf('.');
		if (pattDotLoc != -1) {
			String ext = patternFileName.substring(pattDotLoc + 1);
			if (ext.equalsIgnoreCase("xml") == false) {
				updateStatus("File extension must be \"xml\"");
				return;
			}
		}
		if (classFileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}/*
		if (classFileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}*/
		int classDotLoc = classFileName.lastIndexOf('.');
		if (classDotLoc != -1) {
			String ext = classFileName.substring(classDotLoc + 1);
			if (ext.equalsIgnoreCase("xml") == false) {
				updateStatus("File extension must be \"xml\"");
				return;
			}
		}
		
		int solDotLoc = solutionFileName.lastIndexOf('.');
		if (solDotLoc != -1) {
			String ext = solutionFileName.substring(solDotLoc + 1);
			if (ext.equalsIgnoreCase("tpd") == false) {
				updateStatus("Solution file extension must be \"tpd\"");
				return;
			}
		}
		int sceDotLoc = scenarioFileName.lastIndexOf('.');
		if (sceDotLoc != -1) {
			String ext = scenarioFileName.substring(sceDotLoc + 1);
			if (ext.equalsIgnoreCase("tpd") == false) {
				updateStatus("Scenario file extension must be \"tpd\"");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return containerText.getText();
	}

	public String getPatternFileName() {
		return patternFileText.getText();
	}
	
	public String getClassFileName() {
		return classFileText.getText();
	}
	
	public String getSceFileName(){
		return fileTextSce.getText();
	}
	
	public String getSolFileName(){
		return fileTextSol.getText();
	}
}