package it.unitn.disi.sistar.file.wizard.pattern;

public class PatternDependency {
	
	private String source;
	private String goal;
	private String target;
	
	private String type;
	
	public PatternDependency(String s, String g, String t, String ty){
		this.source = s;
		this.goal = g;
		this.target = t;
		this.type = ty;
	}
	
	public void setSource(String pe){
		this.source = pe;
	}
	
	public void setGoal(String pe){
		this.goal = pe;
	}
	
	public void setTarget(String pe){
		this.target = pe;
	}
	
	public String getSource(){
		return this.source;
	}
	
	public String getGoal(){
		return this.goal;
	}
	
	public String getTarget(){
		return this.target;
	}
	
	public void setType(String ty){
		this.type = ty;
	}
	
	public String getType(){
		return type;
	}
}
