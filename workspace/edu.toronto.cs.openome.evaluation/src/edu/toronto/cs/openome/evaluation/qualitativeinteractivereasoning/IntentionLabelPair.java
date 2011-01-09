package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class IntentionLabelPair extends Object{
	private Intention intention;
	private EvaluationLabel label;
	
	public IntentionLabelPair (Intention i, EvaluationLabel l) {
		intention = i;
		label = l;
	}
	
	public Intention getIntention() {
		return intention;
	}
	
	public EvaluationLabel getEvaluationLabel() {
		return label;
	}
	
	public boolean equals(IntentionLabelPair ilp) {
		//System.out.println("IntentionLabelPair equals: ");
		//System.out.println(intention.getName() + " " + ilp.getIntention().getName());
		//System.out.println(label.getName() + " " + ilp.getEvaluationLabel().getName());
		if (ilp.getIntention().equals(intention) && ilp.getEvaluationLabel().equals(label))  {
			//System.out.println("equals");
			return true;				
		}
		return false;
	}

}
