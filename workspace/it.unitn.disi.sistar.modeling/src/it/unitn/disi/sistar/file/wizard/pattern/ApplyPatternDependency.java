package it.unitn.disi.sistar.file.wizard.pattern;

public class ApplyPatternDependency {
	
	private String delegator;
	private String goal;
	private String delegatee;
	private String type;
	
	ApplyPatternDependency(String source, String goal, String target, String type){
		this.delegator = source;
		this.goal = goal;
		this.delegatee = target;
		this.type = type;
	}
	
	public String getDelegator(){
		return this.delegator;
	}
	
	public String getDelegatee(){
		return this.delegatee;
	}
	
	public String getGoal(){
		return this.goal;
	}
	
	public String getType(){
		return this.type;
	}

}
