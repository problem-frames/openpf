package it.unitn.disi.sistar.file.wizard.pattern;

public class PatternRelation {
	
	private PatternElement source;
	private PatternElement target;
	private PatternElement goal;
	private String type;
	private String parent;
	
	public PatternRelation(){}
	
	public PatternRelation(String tp, PatternElement s, PatternElement t){
		this.type = tp;
		this.source = s;
		this.target = t;
	}
	
	public PatternRelation(String tp, PatternElement s, PatternElement g, PatternElement t){
		this.type = tp;
		this.source = s;
		this.target = t;
		this.goal = g;
	}
	
	public void setSource(PatternElement s){
		this.source = s;
	}

	public void setTarget(PatternElement t){
		this.target = t;
	}
	
	public void setType(String t){
		this.type = t;
	}
	
	public PatternElement getSource(){
		return this.source;
	}
	
	public PatternElement getTarget(){
		return this.target;
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setGoal(PatternElement g){
		this.goal = g;
	}
	
	public PatternElement getGoal(){
		return this.goal;
	}
	
	public void setParent(String p){
		this.parent = p;
	}
	
	public String getParent(){
		return this.parent;
	}
	
	public String print(){
		String tmp = "Relation, type " + this.type
				+ ", source " + source.getName()
				+ ", target " + target.getName();
		try{
			tmp = tmp + ", goal " + goal.getName();
		}catch(Exception e){}
		return tmp; 
	}
	
	public boolean match(PatternRelation pr){
		if(!(this.getType().matches(pr.getType())))
			return false;
		if(!(this.getSource().getName().matches(pr.getSource().getName())))
			return false;
		if(!(this.getGoal().getName().matches(pr.getGoal().getName())))
			return false;
		if(!(this.getTarget().getName().matches(pr.getTarget().getName())))
			return false;
		return true;
	}
}

