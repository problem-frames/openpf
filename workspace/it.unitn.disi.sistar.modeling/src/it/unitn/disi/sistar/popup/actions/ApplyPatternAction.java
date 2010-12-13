package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.file.wizard.pattern.ApplyPatternWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class ApplyPatternAction implements IObjectActionDelegate, SistarConstants{

	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public ApplyPatternAction(){
		super();
	}
	
	public ApplyPatternAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}
	
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
		
	}

	public void run(IAction action) {
		if(project == null){
			System.out.println("Projec null");
	 		return;
		}
		else{
			ApplyPatternWizard wizard = new ApplyPatternWizard(selectedFile, project);
			Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
			
			WizardDialog dialog = new WizardDialog(shell, wizard);
			dialog.setPageSize(650, 200);
			dialog.create();
			dialog.open();
		}
		
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof ITreeSelection)
		{
			if(((ITreeSelection)selection).getFirstElement() instanceof IFile)
			{
					IFile selectionFile = (IFile)((ITreeSelection)selection).getFirstElement();
					project = selectionFile.getProject();
					selectedFile = selectionFile;
			}
		}
		
	}
	
	public static void main(String[] args) {
		ApplyPatternAction action = new ApplyPatternAction();
		action.run(null);
	}

}
