package it.unitn.disi.sistar.file.wizard.a5;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

public class A5RunClassWizard extends Action
		implements IWorkbenchWindowActionDelegate {
	
	public void init(IWorkbenchWindow window){
	}
	
	public void dispose(){
	}
	
	public void run(IAction action){
		A5ClassCreationWizard wizard = new A5ClassCreationWizard();
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.create();
		dialog.open();
		
	}
	
	public void selectionChanged(IAction action, ISelection selection){
	}
	

}