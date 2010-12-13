package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.mapping.ContributionTypeMapper;
import it.unitn.disi.sistar.mapping.GRColorMapper;
import it.unitn.disi.sistar.modeling.api.editparts.IServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramUtil;
import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ShowGoalAnalysisAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public ShowGoalAnalysisAction() {
		super();
	}
	
	public ShowGoalAnalysisAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
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


	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
	 	if(project == null)
	 		return;
	 	
		 try
		 {
			 if(!project.getFolder(FOLDER_SOLVER).exists())
				 project.getFolder(FOLDER_SOLVER).create(true, true, null);
					IFile diagramFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(selectedFile.getPersistentProperty(new QualifiedName
						(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE))));
					
					// minhsang: you must pass a not-null value to ProgressMonitor if you pass true to SaveDiagram
					DiagramEditPart editPart = (DiagramEditPart)IDEEditorUtil.openDiagram(diagramFile, workbenchPart.getSite().getWorkbenchWindow(), true, new NullProgressMonitor());
					
					List goalList = TroposDiagramUtil.getAllServices((Diagram)editPart.getDiagramView().getElement());
					ScenarioFile scenarioFile = new ScenarioFile(new File(selectedFile.getRawLocationURI().getPath()));
					
					scenarioFile.load();
					Map resultMap = scenarioFile.getContentMap();
					for (Iterator iter = goalList.iterator(); iter
							.hasNext();) {
						Service myElement = (Service) iter.next();
						final IServiceEditPart servicePart = (IServiceEditPart)editPart.findEditPart(editPart, myElement);
						if(servicePart!= null)
						{
							GoalSolver solverLine = (GoalSolver) resultMap.get(getElementName(myElement));
							if(solverLine == null)
								solverLine = new GoalSolver();
							
							final Color color = GRColorMapper.mapColor(solverLine.getOutputSAT(), solverLine.getOutputDEN());
							if(servicePart!= null)
							{
								servicePart.showAnalysisResult(color);
								servicePart.setRemarks("S:" + solverLine.getOutputSAT() + "|D:" + solverLine.getOutputDEN(), 
										"S:" + solverLine.getOutputSATStatus() + "|D:" + solverLine.getOutputDENStatus());
								if(ContributionTypeMapper.isQuantitativeView())
									servicePart.showRemarks(true, false);
								else
									servicePart.showRemarks(true, true);
							}
						}
						
					}
	        }
	        catch(Exception e)
	        {
	        	ConsoleUtil.printExceptionToConsole(e);
	        }	        
	}
	private String getElementName(EObject element)
	{
		if(element.eContainer() instanceof Actor)
			return ((Actor)element.eContainer()).getName() + "." + ((GraphicalObject)element).getName();
		return ((GraphicalObject)element).getName();
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
		ShowGoalAnalysisAction action = new ShowGoalAnalysisAction();
		action.run(null);
	}

}
