package edu.toronto.cs.openome.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
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

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.AgentImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.PositionImpl;
import edu.toronto.cs.openome_model.impl.RoleImpl;
import edu.toronto.cs.openome_model.impl.TaskImpl;

public class TestAddTaskGMF{
	
	/*
	 * Our core tools in testing
	 */
	private static Diagram diagram;
	private static edu.toronto.cs.openome_model.Model model;
	private static TransactionalEditingDomain domain;
	private static CommandStack cs;
	
	/*
	 * Our containers
	 * We should test adding a task into all four types of containers
	 */
	private static ActorImpl actor;
	private static AgentImpl agent;
	private static RoleImpl role;
	private static PositionImpl pos;
	
	
	@Test
	public void initializeWorkspace(){
		// Create the workspace
		URI diagramURI = URI.createURI("platform:/resource/test/default.ood");
		URI modelURI = URI.createURI("platform:/resource/test/default.oom");

		Resource diagramResource = Openome_modelDiagramEditorUtil.createDiagram(diagramURI, modelURI, new NullProgressMonitor());
		diagram = (Diagram) diagramResource.getContents().get(0);
		model = (Model) diagram.getElement();

		ResourceSet rs = diagramResource.getResourceSet();
		domain =((TransactionChangeRecorder) rs.eAdapters().get(0)).getEditingDomain();
		cs = domain.getCommandStack();
		
		// Add the containers
		cs.execute(new ActorImplCreateCommand((ModelImpl) model));
		cs.execute(new AgentImplCreateCommand((ModelImpl) model));
		cs.execute(new RoleImplCreateCommand((ModelImpl) model));
		cs.execute(new PositionImplCreateCommand((ModelImpl) model));
		
		//get container references
		for (Container c : model.getContainers()){
			if (c instanceof ActorImpl)
				actor = (ActorImpl) c;
			else if (c instanceof AgentImpl)
				agent = (AgentImpl) c;
			else if (c instanceof RoleImpl)
				role = (RoleImpl) c;
			else if (c instanceof PositionImpl)
				pos = (PositionImpl) c;
		}
		
		assertNotNull(actor);
		assertNotNull(agent);
		assertNotNull(role);
		assertNotNull(pos);
	}
	
	/**
	 * Tests that a new task can be created outside of any actor
	 */
	@Test
	public void canAddTaskToModel() {
		String name = "testTask";
		
		assertTrue(model.getIntentions().isEmpty());
		
		Command create = new TaskImplCreateCommand((ModelImpl) model, name);
		cs.execute(create);
		
		assertFalse(model.getIntentions().isEmpty());
		
		assertTrue(model.getIntentions().size() == 1);
		
		assertTrue(model.getIntentions().get(0) instanceof TaskImpl);
		assertTrue(model.getIntentions().get(0).getName().equals(name));
		
//		assertTrue(model.getIntentions().get(0).getModel().equals(model));
		
		//Test that the intention is fresh
		intentionIsNotLinked(model.getIntentions().get(0));
		intentionHasNoEvalLabels(model.getIntentions().get(0));
	}
	
	/**
	 * Tests that a new task can be created inside of an actor
	 */
	@Test
	public void canAddTaskToActor() {
		String name = "testTask";
		
		assertTrue(actor.getIntentions().isEmpty());
		
		Command create = new TaskImplCreateCommand(actor, name);
		cs.execute(create);
		
		assertFalse(actor.getIntentions().isEmpty());
		
		assertTrue(actor.getIntentions().size() == 1);
		
		assertTrue(actor.getIntentions().get(0) instanceof TaskImpl);
		assertTrue(actor.getIntentions().get(0).getName().equals(name));
		
		assertTrue(actor.getIntentions().get(0).getContainer().equals(actor));
		
		//Test that the intention is fresh
		intentionIsNotLinked(actor.getIntentions().get(0));
		intentionHasNoEvalLabels(actor.getIntentions().get(0));
	}
	
	/**
	 * Tests that a new task can be created inside of an agent
	 */
	@Test
	public void canAddTaskToAgent() {
		String name = "testTask";
		
		assertTrue(agent.getIntentions().isEmpty());
		
		Command create = new TaskImplCreateCommand(agent, name);
		cs.execute(create);
		
		assertFalse(agent.getIntentions().isEmpty());
		
		assertTrue(agent.getIntentions().size() == 1);
		
		assertTrue(agent.getIntentions().get(0) instanceof TaskImpl);
		assertTrue(agent.getIntentions().get(0).getName().equals(name));
		
		assertTrue(agent.getIntentions().get(0).getContainer().equals(agent));
		
		//Test that the intention is fresh
		intentionIsNotLinked(agent.getIntentions().get(0));
		intentionHasNoEvalLabels(agent.getIntentions().get(0));
		
	}
	
	/**
	 * Tests that a new task can be created inside of a role
	 */
	@Test
	public void canAddTaskToRole() {
		String name = "testTask";
		
		assertTrue(role.getIntentions().isEmpty());
		
		Command create = new TaskImplCreateCommand(role, name);
		cs.execute(create);
		
		assertFalse(role.getIntentions().isEmpty());
		
		assertTrue(role.getIntentions().size() == 1);
		
		assertTrue(role.getIntentions().get(0) instanceof TaskImpl);
		assertTrue(role.getIntentions().get(0).getName().equals(name));
		
		assertTrue(role.getIntentions().get(0).getContainer().equals(role));
		
		//Test that the intention is fresh
		intentionIsNotLinked(role.getIntentions().get(0));
		intentionHasNoEvalLabels(role.getIntentions().get(0));
	}
	
	/**
	 * Tests that a new task can be created inside of a position
	 */
	@Test
	public void canAddTaskToPosition() {
		String name = "testTask";
		
		assertTrue(pos.getIntentions().isEmpty());
		
		Command create = new TaskImplCreateCommand(pos, name);
		cs.execute(create);
		
		assertFalse(pos.getIntentions().isEmpty());
		
		assertTrue(pos.getIntentions().size() == 1);
		
		assertTrue(pos.getIntentions().get(0) instanceof TaskImpl);
		assertTrue(pos.getIntentions().get(0).getName().equals(name));
		
		assertTrue(pos.getIntentions().get(0).getContainer().equals(pos));
		
		//Test that the intention is fresh
		intentionIsNotLinked(pos.getIntentions().get(0));
		intentionHasNoEvalLabels(pos.getIntentions().get(0));
	}
	

	/**
	 * Tests that the given intention has no links
	 */
	private void intentionIsNotLinked(Intention i){
		assertTrue(i.getContributesFrom().isEmpty());
		assertTrue(i.getContributesTo().isEmpty());
		assertTrue(i.getDecompositions().isEmpty());
		assertTrue(i.getDependencyFrom().isEmpty());
		assertTrue(i.getDependencyTo().isEmpty());
	}
	
	/**
	 * Tests that the given intention has no reasoning labels
	 */
	private void intentionHasNoEvalLabels(Intention i){
		assertTrue(i.getQualitativeReasoningCombinedLabel().equals(edu.toronto.cs.openome_model.EvaluationLabel.NONE));
		assertTrue(i.getQualitativeReasoningDenialLabel().equals(edu.toronto.cs.openome_model.EvaluationLabel.NONE));
		assertTrue(i.getQualitativeReasoningSatisfiedLabel().equals(edu.toronto.cs.openome_model.EvaluationLabel.NONE));
		
		assertTrue(i.getQuantitativeReasoningCombinedLabel() == 0.0);
		assertTrue(i.getQuantitativeReasoningDeniedLabel() == 0.0);
		assertTrue(i.getQuantitativeReasoningSatisfiedLabel() == 0.0);
	}
}