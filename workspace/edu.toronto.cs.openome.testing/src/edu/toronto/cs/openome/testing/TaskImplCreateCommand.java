package edu.toronto.cs.openome.testing;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.TaskImpl;
import edu.toronto.cs.openome_model.impl.openome_modelFactoryImpl;

public class TaskImplCreateCommand implements Command {
	
	/*
	 * The model we are going to be creating an actor in
	 */
	private ContainerImpl container;
	private ModelImpl model;
	private TaskImpl task;
	
	/*
	 * Name of the actor
	 */
	private String intentionName = "";
	
	/*
	 * A factory that can create any class Impl
	 */
	private static openome_modelFactoryImpl factory = new openome_modelFactoryImpl();
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public TaskImplCreateCommand(ModelImpl m){
		model = m;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param c - the container
	 */
	public TaskImplCreateCommand(ContainerImpl c){
		container = c;
	}
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public TaskImplCreateCommand(ModelImpl m, String name){
		model = m;
		intentionName = name;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public TaskImplCreateCommand(ContainerImpl c, String name){
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
		task = (TaskImpl) factory.createTask();
		task.setName(intentionName);
		
		if(container != null){
			task.setContainer(container);
			container.getIntentions().add(task);
		} else if (model != null){
//			task.setModel(model);
			model.getIntentions().add(task);
		}
	}
	
	public TaskImpl getTaskImpl() {
		return task;
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
