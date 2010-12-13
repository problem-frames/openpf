package it.unitn.disi.sistar.exceptions;

public class GoalNotFoundException extends Exception {
	
	public GoalNotFoundException(String message){
		super(message);
	}
	
	public GoalNotFoundException(String message, Exception ex){
		super(message, ex);	
	}

}
