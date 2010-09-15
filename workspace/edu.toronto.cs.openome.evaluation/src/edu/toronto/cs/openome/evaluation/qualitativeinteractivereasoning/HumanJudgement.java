/**
 * 
 */
package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import edu.toronto.cs.openome_model.EvaluationLabel;

/**
 * @author jenhork
 *
 */
public class HumanJudgement {
	LabelBag bag;
	EvaluationLabel result;
	boolean enabled;
	
	public HumanJudgement(LabelBag b, EvaluationLabel l)  {
		result = l;
		bag = new LabelBag(b);
		enabled = true;
	}
	
	public EvaluationLabel findOrImplies(LabelBag lb) {
		//bag.printBag();
		//lb.printBag();
		if (bag.equals(lb)) {
			//System.out.println("Equals");
			return result;
		}
		else {
			LabelBag diff = bag.diff(lb);
			//System.out.println("Diff");
			//diff.printBag();
			//System.out.println("//Diff");
			if (diff == null) {
				System.out.println("Problem with findOrImplies");
				return null;
			}
			if (result == EvaluationLabel.SATISFIED && diff.isPositive())
				return result;
			if (result == EvaluationLabel.DENIED && diff.isNegative())
				return result;
		}
		return null;
	}
	
	public String toString() {
		return result.toString();
	}
	
	public EvaluationLabel getJudgement(){
		return result;
	}
	
	public LabelBag getLabelBag() {
		return bag;
	}
	
	public void enable() {
		enabled = true;
	}
	
	public void disable() {
		enabled = false;
	}
	
	public boolean isEnabled() {
		return enabled;
	}
	
}
