package filesystem.diagram.part;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import filesystem.diagram.edit.parts.FilesystemEditPart;

/**
 * @generated
 */
public class FilesystemInitDiagramFileAction implements
		IWorkbenchWindowActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchWindow window;

	/**
	 * @generated
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

	/**
	 * @generated
	 */
	public void dispose() {
		window = null;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return window.getShell();
	}

	/**
	 * @generated
	 */
	public void run(IAction action) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		Resource resource = FilesystemDiagramEditorUtil.openModel(getShell(),
				Messages.InitDiagramFile_OpenModelFileDialogTitle,
				editingDomain);
		if (resource == null || resource.getContents().isEmpty()) {
			return;
		}
		EObject diagramRoot = (EObject) resource.getContents().get(0);
		Wizard wizard = new FilesystemNewDiagramFileWizard(resource.getURI(),
				diagramRoot, editingDomain);
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle,
				FilesystemEditPart.MODEL_ID));
		FilesystemDiagramEditorUtil.runWizard(getShell(), wizard,
				"InitDiagramFile"); //$NON-NLS-1$
	}
}
