/**
 * 
 */
package edu.toronto.cs.openome.evaluation.testing;

import static org.junit.Assert.*;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

/**
 * @author jenhork
 *
 */
public class TestLabelBag extends EvaluationTest{

	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag#addToBag(edu.toronto.cs.openome_model.Intention, edu.toronto.cs.openome_model.EvaluationLabel)}.
	 */
	@Test
	public void testAddToBag() {
		LabelBag lb1 = new LabelBag();
				
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
		
		lb1.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		
		assertTrue(lb1.size() == 1);
		assertTrue(lb1.getFirst().equals(new IntentionLabelPair(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED)));
		
		lb1.addToBag(elist.get(1), EvaluationLabel.DENIED);
		
		assertTrue(lb1.size() == 2);
		
		lb1.addToBag(elist.get(1), EvaluationLabel.UNKNOWN);
		
		assertTrue(lb1.size() == 2);
		
		lb1.addToBag(elist.get(2), EvaluationLabel.SATISFIED);
		
		assertTrue(lb1.size() == 3);
		
	}

	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag#diff(edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag)}.
	 */
	@Test
	public void testDiff() {
		LabelBag lb1 = new LabelBag();
		LabelBag lb2 = new LabelBag();
		
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
		
		lb1.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		
		LabelBag d = lb1.diff(lb2);
		assertTrue(d.size() == 1);
		
		assertTrue(d.getFirst().equals(new IntentionLabelPair(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED)));
		
		lb1.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb1.addToBag(elist.get(2), EvaluationLabel.SATISFIED);
		
		lb2.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(3), EvaluationLabel.CONFLICT);
				
		d = lb1.diff(lb2);
		
		assertTrue(d.size() == 2);
		
		LabelBag lb = new LabelBag();
		lb.addToBag(elist.get(2), EvaluationLabel.SATISFIED);
		lb.addToBag(elist.get(3), EvaluationLabel.CONFLICT);
				
		assertTrue(d.equals(lb));
		
		LabelBag lb3 = new LabelBag();
		LabelBag lb4 = new LabelBag();
		
							
		lb3.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb3.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb3.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		lb4.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb4.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb4.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		d = lb3.diff(lb4);
		
		assertTrue(d.size() == 0);
		
		lb4.addToBag(elist.get(3), EvaluationLabel.WEAKLY_SATISFIED);
		
		d = lb3.diff(lb4);
		
		assertTrue(d.size() == 1);
		
		assertTrue(d.getFirst().equals(new IntentionLabelPair(elist.get(3), EvaluationLabel.WEAKLY_SATISFIED)));
		
		lb4.addToBag(elist.get(4), EvaluationLabel.WEAKLY_DENIED);
		
		d = lb3.diff(lb4);
		
		assertTrue(d.size() == 2);
	}

	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag#isPositive()}.
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag#isNegative()}.
	 */
	@Test
	public void testBooleans() {
		LabelBag lb1 = new LabelBag();
		LabelBag lb2 = new LabelBag();
		
		
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
					
		lb1.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		
		assertTrue(lb1.isPositive());
		assertTrue(!lb1.isNegative());
		assertTrue(!lb1.hasSatisfied());
		assertTrue(!lb1.hasDenied());
		assertTrue(!lb1.hasConflict());
		assertTrue(!lb1.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb1.addToBag(elist.get(1), EvaluationLabel.SATISFIED);

		assertTrue(lb1.isPositive());
		assertTrue(!lb1.isNegative());
		assertTrue(lb1.hasSatisfied());
		assertTrue(!lb1.hasDenied());
		assertTrue(!lb1.hasConflict());
		assertTrue(!lb1.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb1.addToBag(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		
		assertTrue(!lb1.isPositive());
		assertTrue(!lb1.isNegative());
		assertTrue(!lb1.hasSatisfied());
		assertTrue(!lb1.hasDenied());
		assertTrue(!lb1.hasConflict());
		assertTrue(!lb1.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb1.addToBag(elist.get(1), EvaluationLabel.UNKNOWN);
		
		assertTrue(!lb1.isPositive());
		assertTrue(!lb1.isNegative());
		assertTrue(!lb1.hasSatisfied());
		assertTrue(!lb1.hasDenied());
		assertTrue(!lb1.hasConflict());
		assertTrue(lb1.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
				
		lb2.addToBag(elist.get(0), EvaluationLabel.WEAKLY_DENIED);
		
		assertTrue(!lb2.isPositive());
		assertTrue(lb2.isNegative());
		assertTrue(!lb2.hasSatisfied());
		assertTrue(!lb2.hasDenied());
		assertTrue(!lb2.hasConflict());
		assertTrue(!lb2.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb2.addToBag(elist.get(1), EvaluationLabel.DENIED);
		
		assertTrue(!lb2.isPositive());
		assertTrue(lb2.isNegative());
		assertTrue(!lb2.hasSatisfied());
		assertTrue(lb2.hasDenied());
		assertTrue(!lb2.hasConflict());
		assertTrue(!lb2.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb2.addToBag(elist.get(2), EvaluationLabel.CONFLICT);
		
		assertTrue(!lb2.isPositive());
		assertTrue(!lb2.isNegative());
		assertTrue(!lb2.hasSatisfied());
		assertTrue(lb2.hasDenied());
		assertTrue(lb2.hasConflict());
		assertTrue(!lb2.hasUnknown());
		assertTrue(!lb1.isUnknown());
		assertTrue(!lb1.isConflict());
		
		lb2.addToBag(elist.get(0), EvaluationLabel.CONFLICT);
		lb2.addToBag(elist.get(1), EvaluationLabel.CONFLICT);
		
		assertTrue(!lb2.isPositive());
		assertTrue(!lb2.isNegative());
		assertTrue(!lb2.hasSatisfied());
		assertTrue(!lb2.hasDenied());
		assertTrue(lb2.hasConflict());
		assertTrue(!lb2.hasUnknown());
		assertTrue(!lb2.isUnknown());
		assertTrue(lb2.isConflict());
		
		lb2.addToBag(elist.get(0), EvaluationLabel.UNKNOWN);
		lb2.addToBag(elist.get(1), EvaluationLabel.UNKNOWN);
		lb2.addToBag(elist.get(2), EvaluationLabel.UNKNOWN);
		
		assertTrue(!lb2.isPositive());
		assertTrue(!lb2.isNegative());
		assertTrue(!lb2.hasSatisfied());
		assertTrue(!lb2.hasDenied());
		assertTrue(!lb2.hasConflict());
		assertTrue(lb2.hasUnknown());
		assertTrue(lb2.isUnknown());
		assertTrue(!lb2.isConflict());
		
	}	

	
	
	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag#equals(edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag)}.
	 */
	@Test
	public void testEqualsLabelBag() {
		LabelBag lb1 = new LabelBag();
		LabelBag lb2 = new LabelBag();
		
		
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
					
		lb1.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb1.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb1.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		lb2.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		assert(lb1.equals(lb2));
		assert(lb2.equals(lb1));
		
		lb1.addToBag(elist.get(0), EvaluationLabel.CONFLICT);
		
		assert(!lb1.equals(lb2));
		assert(!lb2.equals(lb1));
		
		lb2.addToBag(elist.get(0), EvaluationLabel.CONFLICT);
		
		assert(lb1.equals(lb2));
		assert(lb2.equals(lb1));
		
		lb2.addToBag(elist.get(3), EvaluationLabel.UNKNOWN);
		
		assert(!lb1.equals(lb2));
		assert(!lb2.equals(lb1));
	}

}
