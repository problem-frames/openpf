package it.unitn.disi.sistar.file.wizard.pattern;

public class ApplyPatternCouple {
	
	private String contextElementString;
	private String diagramElementString;
	
	private PatternElement contextElement;
	private PatternElement diagramElement;
	private PatternElement solutionElement;
	
	private PatternRelation contextRelation;
	private PatternRelation diagramRelation;
	private PatternRelation solutionRelation;
	
	public ApplyPatternCouple(String p, String d){
		this.contextElementString = p;
		this.diagramElementString = d;
	}
	
	public ApplyPatternCouple() {
		// TODO Auto-generated constructor stub
	}

	public void setContextElementString(String s){
		this.contextElementString = s;
	}
	
	public void setDiagramElementString(String s){
		this.diagramElementString = s;
	}
	
	public String getContextElementString(){
		return this.contextElementString;
	}
	
	public String getDiagramElementString(){
		return this.diagramElementString;
	}
	
	public void setContextElement(PatternElement pe){
		this.contextElement = pe;
	}
	
	public void setDiagramElement(PatternElement de){
		this.diagramElement = de;
	}
	
	public void setSolutionElement(PatternElement se){
		this.solutionElement = se;
	}
	
	public PatternElement getContextElement(){
		return this.contextElement;
	}
	
	public PatternElement getDiagramElement(){
		return this.diagramElement;
	}
	
	public PatternElement getSolutionElement(){
		return this.solutionElement;
	}
	
	public void setContextRelation(PatternRelation pr){
		this.contextRelation = pr;
	}
	
	public void setDiagramRelation(PatternRelation pr){
		this.diagramRelation = pr;
	}
	
	public void setSolutionRelation(PatternRelation pr){
		this.solutionRelation = pr;
	}
	
	public PatternRelation getContextRelation(){
		return this.contextRelation;
	}
	
	public PatternRelation getDiagramRelation(){
		return this.diagramRelation;
	}
	
	public PatternRelation getSolutionRelation(){
		return this.solutionRelation;
	}

}
