package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.Collection;
import java.util.ListIterator;
import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;

public class HumanJudgmentLinkAxioms extends LinkAxioms {
	private IntQualIntentionWrapper wrapper;

	public HumanJudgmentLinkAxioms(Vector<Intention> sources, Intention targ,
			Vector<Link> l, DualHashMap<Integer, Intention> dhm, String desc) {
		super(sources, targ, l, dhm, desc);
		
	}
	
	public void findIndexes(HumanJudgement hj) {
		//System.out.println("finding indexes");
		sourceIndexes = new VecInt();
		
		if (intentionMap != null) {
			tIndex = (Integer) intentionMap.getInverse(wrapper.getIntention());
		
			ListIterator<IntentionLabelPair> it = hj.getLabelBag().listIterator();
			while (it.hasNext()) {
				IntentionLabelPair ilp =  it.next();
				
				Integer sourceIndex = (Integer) intentionMap.getInverse(ilp.getIntention());
				sourceIndexes.push(sourceIndex.intValue() + getLabelOffset(ilp.getEvaluationLabel()));	
			}
		}
		else {
			System.out.println("intentionMap is null");
		}
	}
	
	public void createForwardClauses() {	
		//System.out.println("Creating forward clauses for HJ");
		
		int targetOffset = 0;
		for (HumanJudgement hj : wrapper.getHumanJudgements()) {
			if (hj.isEnabled()) {
				findIndexes(hj);
						
				EvaluationLabel targetLabel = hj.getJudgement();
		
				targetOffset = getLabelOffset(targetLabel);
		
				//AND of all judgements -> Target(e)
				forwardClauses.addAll(addAndImplication(sourceIndexes, tIndex + targetOffset));		
			}
		}
		
		addRestrictions(targetOffset, forwardClauses);
		
	}
	
	
	
	private void addRestrictions(int i, Vector<VecInt> clauses) {
		VecInt vi; 
		switch (i) {
			case(0): {
				vi = new VecInt();
				vi.push(-(tIndex+2)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+3)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+4)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
			case(1): {
				vi = new VecInt();			
				vi.push(-(tIndex+2)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+3)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+4)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
			case(2): {
				vi = new VecInt();			
				vi.push(-(tIndex+1)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+3)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+4)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
			case(3): {
				vi = new VecInt();			
				vi.push(-(tIndex+1)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+2)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+4)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
			case(4): {
				vi = new VecInt();			
				vi.push(-(tIndex+1)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+2)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+3)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
			case(5): {
				vi = new VecInt();			
				vi.push(-(tIndex+1)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+2)); 
				vi.push(0); 
				clauses.add(vi);
				vi = new VecInt();
				vi.push(-(tIndex+3)); 
				vi.push(0); 
				clauses.add(vi); 
				break;
			}
		}
		
	}

	public void createBackwardClauses() {
		int targetOffset = 0;
		//System.out.println("Creating backward clauses for HJ");
		for (HumanJudgement hj : wrapper.getHumanJudgements()) {
			if (hj.isEnabled()) {			
				findIndexes(hj);
				
				EvaluationLabel targetLabel = wrapper.getInitialEvaluationLable();
			
				targetOffset = getLabelOffset(targetLabel);
			
				//Target(e)-> AND of all judgments
				backwardClauses.addAll(addAndImplication(tIndex + targetOffset, sourceIndexes));
				
				if (targetOffset == 0) {
					backwardClauses.addAll(addAndImplication(tIndex + 1, sourceIndexes));
				}
				
				if (targetOffset == 5) {
					backwardClauses.addAll(addAndImplication(tIndex + 4, sourceIndexes));
				}
			}
		}		
		addRestrictions(targetOffset, forwardClauses);
	}
	
	private int getLabelOffset(EvaluationLabel targetLabel) {
		if (targetLabel == EvaluationLabel.SATISFIED)
			return 0;
		if (targetLabel == EvaluationLabel.WEAKLY_SATISFIED)
			return 1;
		if (targetLabel == EvaluationLabel.UNKNOWN)
			return 2;
		if (targetLabel == EvaluationLabel.CONFLICT)
			return 3;
		if (targetLabel == EvaluationLabel.WEAKLY_DENIED)
			return 4;
		if (targetLabel == EvaluationLabel.DENIED)
			return 5;
		return 0;
	}



	
	
	public void addWrapper(IntQualIntentionWrapper w) {
		wrapper = w;
	}

}
