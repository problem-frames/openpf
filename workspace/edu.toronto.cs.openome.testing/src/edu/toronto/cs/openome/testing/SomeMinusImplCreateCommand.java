package edu.toronto.cs.openome.testing;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.DependencyImpl;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.MakeContributionImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.SoftgoalImpl;
import edu.toronto.cs.openome_model.impl.SomeMinusContributionImpl;
import edu.toronto.cs.openome_model.impl.Openome_modelFactoryImpl;

public class SomeMinusImplCreateCommand implements Command {
	
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
	private static Openome_modelFactoryImpl factory = new Openome_modelFactoryImpl();
	
	/**
	 * Command to add an actor inside a model
	 * @param model
	 */
	public SomeMinusImplCreateCommand(ModelImpl m){
		model = m;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param c - the container
	 */
	public SomeMinusImplCreateCommand(ContainerImpl c){
		container = c;
	}
		
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public SomeMinusImplCreateCommand(ModelImpl m, IntentionImpl s, IntentionImpl t){
		model = m;
		source = s;
		target = t;
	}
	
	/**
	 * Command to add an actor inside a container
	 * @param model
	 */
	public SomeMinusImplCreateCommand(IntentionImpl source, IntentionImpl target, ContainerImpl c){
		container = c;
		
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
		SomeMinusContributionImpl cont = (SomeMinusContributionImpl) factory.createSomeMinusContribution();
		cont.setSource(source);
		cont.setTarget(target);
				
		if (model != null){
			cont.setModel(model);
			model.getContributions().add(cont);
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
