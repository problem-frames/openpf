package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.ListIterator;
import java.util.Vector;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class IntQualIntentionWrapper {
	
	private EvaluationLabel initialEvaluationLabel;
	private Intention intnt;
	private LabelBag lb;	
	private Vector<HumanJudgement> hjv;
	
	
	public IntQualIntentionWrapper() {
		init();		
	}
	
	public IntQualIntentionWrapper(Intention i) {
		init();
		intnt = i;		
	}
	
	public void init() {
		intnt = null;		
		initialEvaluationLabel = EvaluationLabel.NONE;
		lb = new LabelBag();		
		hjv = new Vector<HumanJudgement>();		
	}
	
	public void setInitialEvaluationLabel(EvaluationLabel l) {
		initialEvaluationLabel = l;
	}
	
	public EvaluationLabel getInitialEvaluationLable() {
		return initialEvaluationLabel;
	}
	
	public Intention getIntention() {
		return intnt;
	}
	
	public void setIntention(Intention i) {
		intnt = i;
	}
	
	public void bagResolved() {
		lb.resolved();
	}
	
	public void bagToResolve() {
		lb.toResolve();
	}
	
	public boolean bagNeedResolve()  {
		return lb.needResolve();
	}
	
	public void addtoLabelBag(Intention i, EvaluationLabel l) {
		lb.addToBag(i, l);
		
		bagToResolve();
	}
	
	public void printLabelBag() {
		lb.printBag();
	}
	
	public int bagSize() {
		return lb.size();
	}
	
	public ListIterator<IntentionLabelPair> bagListIterator() {	
		return lb.listIterator();
	}
	
	public IntentionLabelPair getFirstFromBag() {
		return lb.getFirst();
	} 
	
	public Object[] bagToArray() {
		
		return lb.toArray();
	}

	public HumanJudgement addHumanJudgement(EvaluationLabel result) {
		HumanJudgement hj = new HumanJudgement(lb, result);
		hjv.add(hj);
		return hj;
	}
	
	public HumanJudgement addHumanJudgement(HumanJudgement hj) {
		hjv.add(hj);
		return hj;
	}
	
	public Vector<HumanJudgement> getHumanJudgements(){
		return hjv;
	}

	public EvaluationLabel findExistingResult() {
		EvaluationLabel result = null;
		for (HumanJudgement hj: hjv)  {
			result = hj.findOrImplies(lb);
			if (result != null)
				return result;
		}
		return null;
	}
	
	public boolean isBagPositive() {
		return lb.isPositive();
	}
	
	public boolean isBagNegative() {
		return lb.isNegative();
	}
	
	public boolean bagHasSatisfied() {
		return lb.hasSatisfied();
	}
	
	public boolean bagHasDenied() {
		return lb.hasDenied();
	}
	
	public boolean bagHasUnknown() {
		return lb.hasUnknown();
	}
	
	public boolean bagHasConflict() {
		return lb.hasConflict();
	}
	
	public boolean bagIsUnknown() {
		return lb.isUnknown();
	}
	
	public boolean bagIsConflict() {
		return lb.isConflict();
	}
	
	
}
