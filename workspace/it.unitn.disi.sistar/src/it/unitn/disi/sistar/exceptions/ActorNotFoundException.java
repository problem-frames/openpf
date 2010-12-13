package it.unitn.disi.sistar.exceptions;

public class ActorNotFoundException extends Exception {
	
	public ActorNotFoundException(String message){
		super(message);
	}
	
	public ActorNotFoundException(String message, Exception ex){
		super(message, ex);	
	}
}
