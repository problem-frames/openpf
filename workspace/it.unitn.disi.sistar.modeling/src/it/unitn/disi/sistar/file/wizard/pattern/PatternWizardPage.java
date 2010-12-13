package it.unitn.disi.sistar.file.wizard.pattern;

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

public class PatternWizardPage extends WizardPage {
	private Text containerText;

	private Text fileText;
	private Text contextText;
	private Text solutionText;
	private Text datalogText;
	private Text descriptionText;

	private ISelection selection;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public PatternWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Pattern File creation");
		setDescription("This wizard creates a new pattern file.");
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
		
		//Container Section
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

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
		
		//Pattern file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Pattern file name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		
		//Scenario file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Context diagram file:");

		contextText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		contextText.setLayoutData(gd);
		contextText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button buttonSce = new Button(container, SWT.PUSH);
		buttonSce.setText("Browse...");
		buttonSce.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleContextFileBrowse();
			}
		});
		
		//Solution file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Solution diagram file:");

		solutionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		solutionText.setLayoutData(gd);
		solutionText.addModifyListener(new ModifyListener() {
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
		
		//Datalog properties file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Datalog properties file:");

		datalogText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		datalogText.setLayoutData(gd);
		datalogText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button buttonDat = new Button(container, SWT.PUSH);
		buttonDat.setText("Browse...");
		buttonDat.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleDatalogFileBrowse();
			}
		});
		
		//Pattern description file section
		
		label = new Label(container, SWT.NULL);
		label.setText("&Pattern description file:");

		descriptionText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		descriptionText.setLayoutData(gd);
		descriptionText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		Button buttonDes = new Button(container, SWT.PUSH);
		buttonDes.setText("Browse...");
		buttonDes.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleDescriptionFileBrowse();
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
		fileText.setText("new_file.tpt");
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
    
    ViewerFilter dppFilter = new ViewerFilter()
    {
      
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("dpp");
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
	
	private void handleContextFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Context File", "Please Choose the context diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		contextText.setText(fileName);
	}
	
	private void handleSolutionFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Context File", "Please Choose the solution diagram File", false, 
        		null, Collections.singletonList(tpdFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		solutionText.setText(fileName);
	}
	
	private void handleDatalogFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Context File", "Please Choose the datalog properties File", false, 
        		null, Collections.singletonList(dppFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		datalogText.setText(fileName);
	}
	
	private void handleDescriptionFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Context File", "Please Choose the pattern description File", false, 
        		null, Collections.singletonList(xmlFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		descriptionText.setText(fileName);
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot()
				.findMember(new Path(getContainerName()));
		String fileName = getFileName();

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
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("tpt") == false) {
				updateStatus("File extension must be \"tpt\"");
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

	public String getFileName() {
		return fileText.getText();
	}
	
	public String getContextName(){
		return contextText.getText();
	}
	
	public String getSolutionName(){
		return solutionText.getText();
	}

	public String getDatalogName(){
		return datalogText.getText();
	}
	
	public String getDescriptionName(){
		return descriptionText.getText();
	}
}
	
	
	