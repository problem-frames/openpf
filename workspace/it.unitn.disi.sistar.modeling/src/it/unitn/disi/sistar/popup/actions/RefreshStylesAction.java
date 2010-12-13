package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RefreshStylesAction  implements IObjectActionDelegate, SistarConstants{
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public RefreshStylesAction() {
		super();
	}
	
	public RefreshStylesAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action)
	{
			final IDiagramEditPart diagramEP = (IDiagramEditPart)IDEEditorUtil.openDiagram(selectedFile, workbenchPart.getSite().getWorkbenchWindow(), true, new NullProgressMonitor());
			diagramEP.refreshStyles();
			
			workbenchPart.getSite().getWorkbenchWindow().getActivePage().saveEditor(workbenchPart.getSite().getWorkbenchWindow().getActivePage().getActiveEditor(), false);
			
			try {
				selectedFile.refreshLocal(0, null);
			} catch (CoreException e) {
				e.printStackTrace();
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
}
