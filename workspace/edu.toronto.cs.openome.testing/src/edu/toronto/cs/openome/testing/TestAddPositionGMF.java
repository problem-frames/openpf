package edu.toronto.cs.openome.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionChangeRecorder;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.junit.Test;

import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.PositionImpl;

public class TestAddPositionGMF{
	
	private static Diagram diagram;
	private static edu.toronto.cs.openome_model.Model model;
	private static TransactionalEditingDomain domain;
	private static CommandStack cs;
	
	
	@Test
	public void initializeWorkspace(){
		URI diagramURI = URI.createURI("platform:/resource/test/default.ood");
		URI modelURI = URI.createURI("platform:/resource/test/default.oom");
		//TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
		
		
		Resource diagramResource = Openome_modelDiagramEditorUtil.createDiagram(diagramURI, modelURI, new NullProgressMonitor());
		diagram = (Diagram) diagramResource.getContents().get(0);
		model = (Model) diagram.getElement();

		ResourceSet rs = diagramResource.getResourceSet();
		domain =((TransactionChangeRecorder) rs.eAdapters().get(0)).getEditingDomain();
		cs = domain.getCommandStack();
	}
	
	/**
	 * Tests that a new position can be created
	 */
	@Test
	public void canAddPosition() {
		String name = "testPosition";
		
		assertTrue(model.getContainers().isEmpty());
		
		Command create = new PositionImplCreateCommand((ModelImpl) model, name);
		cs.execute(create);
		
		assertFalse(model.getContainers().isEmpty());
		
		assertTrue(model.getContainers().size() == 1);
		
		assertTrue(model.getContainers().get(0) instanceof PositionImpl);
		assertTrue(model.getContainers().get(0).getName().equals(name));
		
	}
	
	/**
	 * Tests that a new position is originally empty
	 * i.e. contains no intentions
	 */
	@Test
	public void positionIsEmpty(){
		assertTrue(model.getContainers().get(0).getIntentions().isEmpty());
	}
	
	/**
	 * Tests that a new position initially has no connecting line to any other objects
	 */
	@Test
	public void positionIsNotLinked(){
		assertTrue(model.getContainers().get(0).getAssociationFrom().isEmpty());
		assertTrue(model.getContainers().get(0).getAssociationTo().isEmpty());
		assertTrue(model.getContainers().get(0).getDependencyFrom().isEmpty());
		assertTrue(model.getContainers().get(0).getAssociationTo().isEmpty());
	}
}