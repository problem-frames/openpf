package it.unitn.disi.sistar.editors.plan.viewers.table;

import java.util.List;

public class PlanPredicate {
	
	private boolean negation;
	private List params;
	
	public PlanPredicate(){
		negation=false;
	}

	public List getParams() {
		return params;
	}
	
	public boolean getNegation() {
		return negation;
	}


	public void setParams(List params) {
		this.params = params;
	}
	
	public void setNegation(boolean negation) {
		this.negation = negation;
	}
	
	public String toString() {
		return "not: " + negation + " params: "+ params.toString();	
	}

	
}
