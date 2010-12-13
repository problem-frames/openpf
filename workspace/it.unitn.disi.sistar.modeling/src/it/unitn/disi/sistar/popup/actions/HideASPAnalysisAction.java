package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class HideASPAnalysisAction  implements IObjectActionDelegate, SistarConstants{
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public HideASPAnalysisAction() {
		super();
	}
	
	public HideASPAnalysisAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action)
	{
		//minhsang: passing True to saveDiagram parameter will result to NULL. See inside openDigram for information
		DiagramEditPart diagramEP = (DiagramEditPart)IDEEditorUtil.openDiagram(selectedFile, workbenchPart.getSite().getWorkbenchWindow(), true, new NullProgressMonitor());
		((IDiagramEditPart)diagramEP).hideFailures();
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
