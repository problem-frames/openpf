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
import org.eclipse.jface.wizard.IWizardPage;
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

public class ApplyPatternWizardPage extends WizardPage {
	private Text patternText;

	private Text diagramText;

	private ISelection selection;
	
	private IFile selectedFile;
	private IFile diagramFile;
	
	private IFile patternFile;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ApplyPatternWizardPage(ISelection selection, IFile file) {
		super("wizardPage");
		setTitle("Apply a pattern");
		setDescription("This wizard helps you to apply a pattern to a target diagram.");
		this.selection = selection;
		this.selectedFile = file;
		
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
		label.setText("&Diagram File name:");

		diagramText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		diagramText.setLayoutData(gd);
		diagramText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		label = new Label(container, SWT.NULL);
		
		label = new Label(container, SWT.NULL);
		label.setText("&Diagram target:");

		patternText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		patternText.setLayoutData(gd);
		patternText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleTargetFileBrowse();
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
				patternText.setText(container.getFullPath().toString());
			}
		}
		diagramText.setText(selectedFile.getFullPath().toString());
	}

	ViewerFilter tptFilter = new ViewerFilter()
    {
      
      public boolean select(Viewer viewer, Object parentElement, Object element)
      {
         return !(element instanceof IFile) || (((IFile)element).getFileExtension()).matches("tpt");
      }
    };
    
    private void handleTargetFileBrowse() {
		
		IFile[] filesSelected = WorkspaceResourceDialog.openFileSelection(getShell(), 
        		"Select Pattern File", "Please Choose the pattern to apply", false, 
        		null, Collections.singletonList(tptFilter));
		String fileName = filesSelected[0].getFullPath().toPortableString();
		patternText.setText(fileName);
		try{
			Path path = new Path(fileName);
			patternFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			saveDataModel();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		
		String diagramName = getFileName();
		String patternName = getDiagramName();
		
		if (patternName.length() == 0) {
			updateStatus("Pattern must be specified");
			this.setPageComplete(true);
			return;
		}
		if (diagramName.length() == 0) {
			updateStatus("Diagram must be specified");
			this.setPageComplete(true);
			return;
		}
		int dotLoc = patternName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = patternName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("tpt") == false) {
				updateStatus("File extension must be \"tpt\"");
				return;
			}
		}
		updateStatus(null);
		this.setPageComplete(true);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getContainerName() {
		return patternText.getText();
	}

	public String getFileName() {
		return diagramText.getText();
	}
	
	public String getDiagramName(){
		return patternText.getText();
	}
	
	public IFile getDiagramFile(){
		return diagramFile;
	}
	
	public IWizardPage getNextPage(){
		saveDataModel();
		ApplyPatternWizardPageTable page = ((ApplyPatternWizard)getWizard()).page2;
		page.onEnterPage();
		return page;
	}
	
	private void saveDataModel(){
		ApplyPatternWizard wizard = (ApplyPatternWizard)this.getWizard();
		PatternModel model = wizard.model;
		
		model.setSelectedFile(this.selectedFile);
		model.setDiagramFile(this.selectedFile);
		model.setPatternFile(this.patternFile);
	}
	
	public boolean canFlipToNextPage(){
		if(patternText.getText().matches(""))
		    return false;
		else
			return true;
		}
	
	public boolean isPageComplete(){
		return this.canFlipToNextPage();
	}
}
	
