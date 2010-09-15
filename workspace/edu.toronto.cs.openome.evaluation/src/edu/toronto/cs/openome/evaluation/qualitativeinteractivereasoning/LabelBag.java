package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.ListIterator;
import java.util.Vector;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

public class LabelBag {
	private Vector<IntentionLabelPair> bag;
	private boolean isPositive;
	private boolean isNegative;
	private boolean hasFullPos;
	private boolean hasFullNeg;
	private boolean hasUnk;
	private boolean hasCon;
	private boolean isUnk;
	private boolean isCon;
	private boolean toResolve;
	
	public LabelBag() {
		bag = new Vector<IntentionLabelPair>();
		init();
	}

	public LabelBag(LabelBag b) {
		bag = (Vector<IntentionLabelPair>) b.bag.clone();
		init();
	}
	
	private LabelBag(Vector<IntentionLabelPair> v) {
		bag = v;
		init();
	}
	
	private void init() {
		toResolve = true;
		isPositive = false;
		isNegative = false;
		hasFullPos = false;
		hasFullNeg = false;
		hasUnk = false;
		hasCon = false;
		isUnk = false;
		isCon = false;
	}

	public void addToBag(Intention i, EvaluationLabel l) {				
				
		IntentionLabelPair ilp = new IntentionLabelPair(i, l);
		
		int index = findIntention(i);
		//System.out.println("Found intention in bag with index: " + index);
		
		if (index >= 0) 
			bag.removeElementAt(index);
		
		bag.add(ilp);	
	
	}
	
	public void printBag() {
		for (IntentionLabelPair ilp: bag) {
			System.out.print("(" + ilp.getIntention().getName() + ", " + ilp.getEvaluationLabel().getName() + "), ");
			System.out.println("");
		}
	}
	
	public String toString() {
		String str = "";
		for (IntentionLabelPair ilp: bag) {
			str += "(" + ilp.getIntention().getName() + ", " + ilp.getEvaluationLabel().getName() + ") ";			
		}
		return str;
	}
	
	private int findIntention(Intention i) {
		for (IntentionLabelPair ilp: bag) {
			if (ilp.getIntention().equals(i)) {
				return bag.indexOf(ilp);
			}
		}
		return -1;
		
	}
	
	public int size() {
		return bag.size();
	}
	
	public ListIterator<IntentionLabelPair> listIterator() {	
		return bag.listIterator();
	}
	
	public IntentionLabelPair getFirst() {
		return bag.firstElement();
	}
	
	public Object[] toArray() {
		
		return  bag.toArray();
	}

	/*
	 * I would like to do this using removeAll, but it seems to not work, even though it is 
	 * calling my implementation of equals for IntentionLabelPair, which also works.
	 * So again, I will do this the hard way.
	 */
	public LabelBag diff(LabelBag lb) {
		Vector<IntentionLabelPair> diff = new Vector<IntentionLabelPair>();
		boolean found = false;
		
		for (IntentionLabelPair ilp: bag)	{
			found = false;
			for (IntentionLabelPair ilp2: lb.bag) {
				if (ilp.equals(ilp2))
					found = true;
			}
			if (!found)
				diff.add(ilp);
		}
		//and again...
		for (IntentionLabelPair ilp: lb.bag)	{
			found = false;
			for (IntentionLabelPair ilp2: bag) {
				if (ilp.equals(ilp2))
					found = true;
			}
			if (!found)
				diff.add(ilp);
		}
		return new LabelBag(diff);
	}

	private void assessBag() {
		
		if (!toResolve)
			return;
		
		ListIterator<IntentionLabelPair> it = listIterator();		
		
		isPositive = true;
		isNegative = true;
		hasFullPos = false;
		hasFullNeg = false;
		hasCon = false;
		hasUnk = false;
		isCon = true;
		isUnk = true;
		
		while (it.hasNext()) {
			IntentionLabelPair ilp = it.next();
			EvaluationLabel label = ilp.getEvaluationLabel();
			
			if (label == EvaluationLabel.SATISFIED) {
				hasFullPos = true;
				isNegative = false;
				isCon = false;
				isUnk = false;
			}
			if (label == EvaluationLabel.WEAKLY_SATISFIED)  {
				isNegative = false;
				isCon = false;
				isUnk = false;
			}
			if (label == EvaluationLabel.CONFLICT) {
				hasCon = true;
				isNegative = false;
				isPositive = false;
				isUnk = false;
			}				
		    if (label == EvaluationLabel.UNKNOWN) {
				hasUnk = true;
				isNegative = false;
				isPositive = false;
				isCon = false;
			}
			if (label == EvaluationLabel.WEAKLY_DENIED) {
				isPositive = false;
				isCon = false;
				isUnk = false;
			}
			if (label == EvaluationLabel.DENIED) {
				hasFullNeg = true;
				isPositive = false;
				isCon = false;
				isUnk = false;
			}
		}
		if (hasCon && isCon)
			isCon = true;
		else isCon = false;
		if (hasUnk && isUnk)
			isUnk = true;
		else isUnk = false;
		
	}

	public boolean isPositive() {
		assessBag();
		return isPositive;
	}
	
	public boolean isNegative() {
		assessBag();
		return isNegative;
	}
	
	public boolean hasSatisfied() {
		assessBag();
		return hasFullPos;
	}
	
	public boolean hasDenied() {
		assessBag();
		return hasFullNeg;
	}
	
	public boolean hasUnknown() {
		assessBag();
		return hasUnk;
	}
	
	public boolean hasConflict() {
		assessBag();
		return hasCon;
	}
	
	public boolean isUnknown() {
		assessBag();
		return isUnk;
	}
	
	public boolean isConflict() {
		assessBag();
		return isCon;
	}
	public void resolved() {
		toResolve = false;
	}

	public void toResolve() {
		toResolve = true;		
	}

	public boolean needResolve() {
		return toResolve;
	}
	
	/*
	 * Test for equality without caring about order.
	 * I can't use the default vector equals or index of because it only checks for object equality 
	 * and doesn't seem to call my overridden equals function for IntentionLabelPair.
	 * So I'm doing this the ugly way, annoying
	 */
	public boolean equals(LabelBag other) {
		boolean found = false;
		for (IntentionLabelPair ilp: bag)	{
			found = false;
			for (IntentionLabelPair ilp2: other.bag) {
				if (ilp.equals(ilp2))
					found = true;
			}
			if (!found)
				return false;
		}
		
		for (IntentionLabelPair ilp: other.bag)	{
			found = false;
			for (IntentionLabelPair ilp2: bag) {
				if (ilp.equals(ilp2))
					found = true;
			}
			if (!found)
				return false;
		}
		return true;
	}
	
	
}
