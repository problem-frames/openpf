package it.unitn.disi.sistar.file.wizard.pattern;

import org.eclipse.core.resources.IFile;

public class PatternModel {

	private IFile selectedFile;
	private IFile diagramFile;
	private IFile contextFile;
	private IFile solutionFile;
	private IFile patternFile;
	
	public void setSelectedFile(IFile file){
		this.selectedFile = file;
	}
	
	public void setDiagramFile(IFile file){
		this.diagramFile = file;
	}
	
	public void setContextFile(IFile file){
		this.contextFile = file;
	}
	
	public void setSolution(IFile file){
		this.solutionFile = file;
	}
	
	public IFile getSelectedFile(){
		return this.selectedFile;
	}
	
	public IFile getDiagramFile(){
		return this.diagramFile;
	}
	
	public IFile getContextFile(){
		return this.contextFile;
	}
	
	public IFile getSolutionFile(){
		return this.solutionFile;
	}
	
	public IFile getPatternFile(){
		return this.patternFile;
	}
	
	public void setPatternFile(IFile file){
		this.patternFile = file;
	}

}
