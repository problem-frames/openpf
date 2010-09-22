package edu.toronto.cs.openome.testing;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.DependencyImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.openome_modelFactoryImpl;

public class DependencyImplCreateCommand implements Command {
	
	/*
	 * The model we are going to be creating an actor in
	 */
	private ContainerImpl container;
	private ModelImpl model;
	private Intention source;
	private Intention target;
	
	
	/*
	 * A factory that can create any class Impl
	 */
	private static openome_modelFactoryImpl factory = new openome_modelFactoryImpl();
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public DependencyImplCreateCommand(ModelImpl m){
		model = m;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param c - the container
	 */
	public DependencyImplCreateCommand(ContainerImpl c){
		container = c;
	}
		
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public DependencyImplCreateCommand(ModelImpl m, IntentionImpl s, IntentionImpl t){
		model = m;
		source = s;
		target = t;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public DependencyImplCreateCommand(IntentionImpl s, IntentionImpl t, ContainerImpl c){
		container = c;
		source = s;
		target = t;		
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
		DependencyImpl dep = (DependencyImpl) factory.createDependency();
		dep.setDependencyTo(target);
		dep.setDependencyFrom(source);
				
		if (model != null){
			dep.setModel(model);
			model.getDependencies().add(dep);
		}
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
