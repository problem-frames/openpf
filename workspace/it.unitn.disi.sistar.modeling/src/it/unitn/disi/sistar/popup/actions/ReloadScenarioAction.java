package it.unitn.disi.sistar.popup.actions;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.util.CollectionUtil;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.ide.util.IDEEditorUtil;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class ReloadScenarioAction implements IObjectActionDelegate, SistarConstants {
	
	private IProject project;
	private IFile selectedFile;
	
	private IWorkbenchPart workbenchPart;
	
	public ReloadScenarioAction() {
		super();
	}
	
	public ReloadScenarioAction(IProject project, IFile selectedFile, IWorkbenchPart workbenchPart) {
		super();
		this.project = project;
		this.selectedFile = selectedFile;
		this.workbenchPart = workbenchPart;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		workbenchPart = targetPart;
	}

	public void run(IAction action) {
	 	if(project == null)
	 		return;
	 	try {
			String diagramFilename = (String)selectedFile.getPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE));
		
			ScenarioFile scenarioFile = new ScenarioFile(FileUtil.toFile(selectedFile));
			scenarioFile.load();
			List contentList = scenarioFile.getContentList();
			Map contentMap = scenarioFile.getContentMap();
			
			IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(diagramFilename));
			TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
			ResourceSet resourceSet = editingDomain.getResourceSet();

			Resource resource = resourceSet.getResource( URI.createPlatformResourceURI(myFile.getFullPath().toPortableString()), true);
			List serviceList = new ArrayList(); 
			Diagram diagram = (Diagram)resource.getContents().get(0);
			EList contents = diagram.eContents();
			for (Iterator iter = contents.iterator(); iter.hasNext();) {
				EObject element = (EObject) iter.next();
				if(element instanceof Service)
					serviceList.add(element);
				else if (element instanceof Actor)
				{
					EList actorContents = element.eContents();
					for (Iterator iterator = actorContents.iterator(); iterator
							.hasNext();) {
						EObject innerElement = (EObject) iterator.next();
						if(innerElement instanceof Service)
							serviceList.add(innerElement);
					}
				}
			}
			Map diagramElementsMap = new HashMap();
			
			//buffer.append("#actorname, goalname, topgoal, input, inputsat, inputden, outputsat, outputden");
			for (Iterator iter = serviceList.iterator(); iter.hasNext();) {
				Service element = (Service) iter.next();
				String name =  getElementName(element);
				
				if(!contentMap.containsKey(name))
				{
					GoalSolver solver = new GoalSolver();
					solver.setName(name);
					solver.setInputSAT(0);
					solver.setInputDEN(0);
					solver.setOutputSAT(0);
					solver.setOutputDEN(0);
					solver.setInputConstraint(0);
					solver.setTopGoalConstraint(0);
					solver.setProperties(CollectionUtil.stringToMap(element.getServiceProperties()));
					contentList.add(solver);
				}
				diagramElementsMap.put(name, element);
			}
			
			List removeList = new ArrayList();
			for (Iterator iter = contentList.iterator(); iter.hasNext();) {
				GoalSolver element = (GoalSolver) iter.next();
				if(!diagramElementsMap.containsKey(element.getName()))
					removeList.add(element);
			}
			contentList.removeAll(removeList);
			scenarioFile.setContentList(contentList);
			scenarioFile.save();
			
			if (selectedFile != null)
				IDEEditorUtil.openDiagram(selectedFile, workbenchPart.getSite().getWorkbenchWindow(), 
						true, new NullProgressMonitor());
			
	 	} catch (Exception e) {
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
		ReloadScenarioAction action = new ReloadScenarioAction();
		action.run(null);
	}

}
