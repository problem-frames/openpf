package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import java.util.Vector;

import edu.toronto.cs.openome_model.Intention;

/**
 * 
 * @author Jenhork
 * 
 * This class keeps a set of softgoals which need to have their label bag resolved.  
 * It shouldn't have repeats and we need to be able to figure out whether a Wrapper in the set wraps
 * a particular element.
 * 
 * I've tried subclassing AbstractSet, but give up as I needed to implement my own iterator with remove()
 * which I didn't need.  Having an internal vector is uglier but easier.
 *
 */
public class SoftgoalWrappers {
	Vector<IntQualIntentionWrapper> set;

	public SoftgoalWrappers() {
		set = new Vector<IntQualIntentionWrapper>();
	}
	
	public IntQualIntentionWrapper findIntention(Intention intention) {
		if (set.isEmpty())
			return null;
		
		for (IntQualIntentionWrapper wrapper: set) {
			if (wrapper.getIntention().equals(intention))
				return wrapper;
		}
		return null;
	}
	
	public boolean add(IntQualIntentionWrapper wrapper){
		if (findIntention(wrapper.getIntention()) == null)
			return set.add(wrapper);		
		else
			return false;
	}
	
	public Vector<IntQualIntentionWrapper> getSet() {
		return set;
	}
	
	public int size() {
		return set.size();		
	}
	
	public void empty() {
		set.clear();
	}

}
