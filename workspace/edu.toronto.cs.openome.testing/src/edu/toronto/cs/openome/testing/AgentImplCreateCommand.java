package edu.toronto.cs.openome.testing;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import edu.toronto.cs.openome_model.impl.AgentImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.openome_modelFactoryImpl;

public class AgentImplCreateCommand implements Command {
	
	/*
	 * The model we are going to be creating an actor in
	 */
	private ModelImpl model;
	
	/*
	 * Name of the actor
	 */
	private String actorName = "";
	
	/*
	 * A factory that can create any class Impl
	 */
	private static openome_modelFactoryImpl factory = new openome_modelFactoryImpl();
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public AgentImplCreateCommand(ModelImpl m){
		model = m;
	}
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public AgentImplCreateCommand(ModelImpl m, String name){
		model = m;
		actorName = name;
	}



//	
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

//	
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

//	
	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}

//	
	public void dispose() {
		// TODO Auto-generated method stub

	}

//	
	public void execute() {
		AgentImpl agent = (AgentImpl) factory.createAgent();
		agent.setModel(model);
		agent.setName(actorName);
		model.getContainers().add(agent);

	}

//	
	public Collection<?> getAffectedObjects() {
		// TODO Auto-generated method stub
		return null;
	}

//	
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

//	
	public String getLabel() {
		return "Create Agent model";
	}

//	
	public Collection<?> getResult() {
		// TODO Auto-generated method stub
		return null;
	}

//	
	public void redo() {
		// TODO Auto-generated method stub

	}

//	
	public void undo() {
		// TODO Auto-generated method stub

	}

}
