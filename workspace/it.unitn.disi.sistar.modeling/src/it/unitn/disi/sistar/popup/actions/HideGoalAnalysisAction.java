package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.modeling.api.editparts.IServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class HideGoalAnalysisAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public HideGoalAnalysisAction() {
		super();
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action) {
	 	if(project == null)
	 		return;
	 	
		 try
		 {
			 if(!project.getFolder(FOLDER_SOLVER).exists())
				 project.getFolder(FOLDER_SOLVER).create(true, true, null);
					IFile diagramFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(selectedFile.getPersistentProperty(new QualifiedName
						(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE))));
					
					DiagramEditPart editPart = (DiagramEditPart)IDEEditorUtil.openDiagram(diagramFile, workbenchPart.getSite().getWorkbenchWindow(), true, new NullProgressMonitor());
					
					List goalList = TroposDiagramUtil.getAllServices((Diagram)editPart.getDiagramView().getElement());
					for (Iterator iter = goalList.iterator(); iter
							.hasNext();) {
						Service myElement = (Service) iter.next();
						final IServiceEditPart servicePart = (IServiceEditPart)editPart.findEditPart(editPart, myElement);
						if(servicePart!= null)
						{
							servicePart.hideAnalysisResult();
							servicePart.showRemarks(false, false);
						}
						
					}
	        }
	        catch(Exception e)
	        {
	        	ConsoleUtil.printExceptionToConsole(e);
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
		HideGoalAnalysisAction action = new HideGoalAnalysisAction();
		action.run(null);
	}

}
