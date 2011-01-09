/**
 * 
 */
package edu.toronto.cs.openome.evaluation.testing;


import static org.junit.Assert.assertTrue;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

/**
 * @author jenhork
 *
 */
public class TestIntentionLabelPair extends EvaluationTest{

	
	@Test
	public void testEquals() {
		
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
		
		IntentionLabelPair ilp1 = new IntentionLabelPair(elist.get(0), EvaluationLabel.CONFLICT);
		IntentionLabelPair ilp2 = new IntentionLabelPair(elist.get(0), EvaluationLabel.CONFLICT);
		IntentionLabelPair ilp3 = new IntentionLabelPair(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		IntentionLabelPair ilp4 = new IntentionLabelPair(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		
		assertTrue(ilp1.equals(ilp2));
		assertTrue(ilp3.equals(ilp4));
		assertTrue(!ilp1.equals(ilp3));
		assertTrue(!ilp2.equals(ilp4));
		
		
	}

}
