package it.unitn.disi.sistar.config;

import java.io.Serializable;
import java.util.List;

public class PlanConfigItem implements Serializable{
	
	private String name;
	private String relatedType;
	private List parameters;
	private List parametersList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getParameters() {
		return parameters;
	}
	public void setParameters(List parameters) {
		this.parameters = parameters;
	}
	public List getParametersList() {
		return parametersList;
	}
	public void setParametersList(List parametersList) {
		this.parametersList = parametersList;
	}
	public String getRelatedType() {
		return relatedType;
	}
	public void setRelatedType(String relatedType) {
		this.relatedType = relatedType;
	}
	public String toString(){
		return "name:[" + name + "] " +
		"relatedType:[" + relatedType + "] " +
		"parameters:" + parameters + " " +
		"parametersList:" + parametersList + "\n";
	}
}
