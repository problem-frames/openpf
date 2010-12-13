package it.unitn.disi.sistar.file.wizard.scenario;

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

import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
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
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;

public class ScenarioCreationWizardUtil {
	
	public static void createScenario(String diagramFilePath, String scenarioFilePath)
	{
		try {
			IFile myFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(diagramFilePath));
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

			StringBuffer buffer = new StringBuffer();
			//buffer.append("#actorname, goalname, topgoal, input, inputsat, inputden, outputsat, outputden");
			List contentList = new ArrayList();
			for (Iterator iter = serviceList.iterator(); iter.hasNext();) {
				Service element = (Service) iter.next();
				GoalSolver solver = new GoalSolver();
				solver.setName(getElementName(element));
				solver.setInputSAT(0);
				solver.setInputDEN(0);
				solver.setOutputSAT(0);
				solver.setOutputDEN(0);
				solver.setInputConstraint(0);
				solver.setTopGoalConstraint(0);
				solver.setProperties(CollectionUtil.stringToMap(element.getServiceProperties()));
				contentList.add(solver);
			}
			
			IFile scenarioFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(scenarioFilePath));
			
			ScenarioFile file = new ScenarioFile(FileUtil.toFile(scenarioFile));
			file.setContentList(contentList);
			scenarioFile.create(new StringBufferInputStream(""), true, new NullProgressMonitor());
			
			scenarioFile.setPersistentProperty(new QualifiedName(SistarConstants.PROPERTY_SPROJECT, SistarConstants.PROPERTY_DIAGRAM_FILE), diagramFilePath);
			file.save();
		
		} catch (Throwable e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
	}
	private static String getElementName(EObject element)
	{
		if(element.eContainer() instanceof Actor)
			return ((Actor)element.eContainer()).getName() + "." + ((GraphicalObject)element).getName();
		return ((GraphicalObject)element).getName();
	}
}
