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

public class A5RelinkWizardPage extends WizardPage {
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
	public A5RelinkWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Multi-page Editor File");
		setDescription("This wizard relink the class and pattern files to the Si* diagrams files.");
		this.selection = selection;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		try{
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label;
		Button button;
		
		label = new Label(container, SWT.NULL);
		label.setText("&Class File name:");
		
		classFileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		classFileText.setLayoutData(gd);
		classFileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleClassFileBrowse();
			}
		});

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
		
		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handlePatternFileBrowse();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Scenario file:");

		fileTextSce = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gdScenario = new GridData(GridData.FILL_HORIZONTAL);
		fileTextSce.setLayoutData(gdScenario);
		fileTextSce.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleScenarioFileBrowse();
			}
		});
		
		label = new Label(container, SWT.NULL);
		label.setText("&Solution file:");

		fileTextSol = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gdSolution = new GridData(GridData.FILL_HORIZONTAL);
		fileTextSol.setLayoutData(gdSolution);
		fileTextSol.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleSolutionFileBrowse();
			}
		});
		
		/* End here */

		initialize();
		dialogChanged();
		setControl(container);
		}catch(Exception e){
			e.printStackTrace();
		}
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
	
	private void handlePatternFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Diagram File", "Please Choose the Diagram File", false, 
        		null, Collections.singletonList(xmlFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		patternFileText.setText(fileName);
	}
	
	private void handleClassFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Diagram File", "Please Choose the Diagram File", false, 
        		null, Collections.singletonList(xmlFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
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
		String patternFileName = getPatternFileName();
		String classFileName = getClassFileName();
		String scenarioFileName = getSceFileName();
		String solutionFileName = getSolFileName();
		
		if (patternFileName.length() == 0) {
			updateStatus("Pattern file name must be specified");
			return;
		}
		
		if (classFileName.length() == 0) {
			updateStatus("Class File name must be specified");
			return;
		}

		if (scenarioFileName.length() == 0) {
			updateStatus("Scenario file name must be specified");
			return;
		}

		if (solutionFileName.length() == 0) {
			updateStatus("Solution file name must be specified");
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
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
