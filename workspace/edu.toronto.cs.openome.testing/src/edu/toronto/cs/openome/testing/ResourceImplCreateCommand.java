package edu.toronto.cs.openome.testing;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.ResourceImpl;
import edu.toronto.cs.openome_model.impl.Openome_modelFactoryImpl;

public class ResourceImplCreateCommand implements Command {
	
	/*
	 * The model we are going to be creating an actor in
	 */
	private ContainerImpl container;
	private ModelImpl model;
	private ResourceImpl resource;
	
	/*
	 * Name of the actor
	 */
	private String intentionName = "";
	
	/*
	 * A factory that can create any class Impl
	 */
	private static Openome_modelFactoryImpl factory = new Openome_modelFactoryImpl();
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public ResourceImplCreateCommand(ModelImpl m){
		model = m;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param c - the container
	 */
	public ResourceImplCreateCommand(ContainerImpl c){
		container = c;
	}
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public ResourceImplCreateCommand(ModelImpl m, String name){
		model = m;
		intentionName = name;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public ResourceImplCreateCommand(ContainerImpl c, String name){
		container = c;
		intentionName = name;
	}



	
	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

	
	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void dispose() {
		// TODO Auto-generated method stub

	}

	
	public void execute() {
		resource = (ResourceImpl) factory.createResource();
		resource.setName(intentionName);
		
		if(container != null){
			resource.setContainer(container);
			container.getIntentions().add(resource);
		} else if (model != null){
//			resource.setModel(model);
			model.getIntentions().add(resource);
		}
	}
	
	public ResourceImpl getResourceImpl() {
		return resource;
	}

	
	public Collection<?> getAffectedObjects() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getLabel() {
		return "Create Actor model";
	}

	
	public Collection<?> getResult() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void redo() {
		// TODO Auto-generated method stub

	}

	
	public void undo() {
		// TODO Auto-generated method stub

	}

}
