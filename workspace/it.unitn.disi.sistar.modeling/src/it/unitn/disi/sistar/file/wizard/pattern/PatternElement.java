package it.unitn.disi.sistar.file.wizard.pattern;

public class PatternElement {
	private String type;
	private String name;
	private String parent;
	
	
	public PatternElement(String n, String t){
		this.name = n;
		this.type = t;
	}
	
	public PatternElement() {
		// TODO Auto-generated constructor stub
	}

	public void setType(String t){
		this.type = t;
	}
	
	public void setName(String n){
		this.name = n;
	}

	public String getType(){
		return this.type;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setParent(String p){
		this.parent = p;
	}
	
	public String getParent(){
		return this.parent;
	}
}
