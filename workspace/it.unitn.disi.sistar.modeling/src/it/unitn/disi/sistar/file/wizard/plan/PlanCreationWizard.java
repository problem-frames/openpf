package it.unitn.disi.sistar.file.wizard.plan;


import it.unitn.disi.sistar.modeling.SistarModelingPlugin;

import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.wizards.EditorCreationWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;

public class PlanCreationWizard extends EditorCreationWizard {

	public void addPages() {
		super.addPages();
		if (page == null) {
			page = new PlanCreationWizardPage(getWorkbench(), getSelection());
		}
		addPage(page);
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		setWindowTitle("New Plan"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(SistarModelingPlugin.getImageDescriptor("icons/start.png"));
		setNeedsProgressMonitor(true);
	}
}
