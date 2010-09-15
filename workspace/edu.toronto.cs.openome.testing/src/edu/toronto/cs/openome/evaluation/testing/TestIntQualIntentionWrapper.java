/**
 * 
 */
package edu.toronto.cs.openome.evaluation.testing;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;

/**
 * @author jenhork
 *
 */
public class TestIntQualIntentionWrapper extends EvaluationTest {

	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper#findExistingResult()}.
	 */
	@Test
	public void testFindExistingResult() {
		LabelBag lb1 = new LabelBag();
		
				
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
		
		IntQualIntentionWrapper w = new IntQualIntentionWrapper(elist.get(4));
					
		w.addtoLabelBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		w.addtoLabelBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		w.addtoLabelBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
				
		w.addHumanJudgement(EvaluationLabel.SATISFIED);
		
		assert(w.findExistingResult().equals(EvaluationLabel.SATISFIED));
		
		w.addtoLabelBag(elist.get(3), EvaluationLabel.WEAKLY_SATISFIED);
		
		assert(w.findExistingResult().equals(EvaluationLabel.SATISFIED));
		
		w.addtoLabelBag(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		
		assert(w.findExistingResult() == null);
		
		w.addHumanJudgement(EvaluationLabel.DENIED);
		
		w.addtoLabelBag(elist.get(4), EvaluationLabel.DENIED);
		
		assert(w.findExistingResult().equals(EvaluationLabel.DENIED));
		
		w.addtoLabelBag(elist.get(3), EvaluationLabel.WEAKLY_SATISFIED);
		
		assert(w.findExistingResult().equals(EvaluationLabel.DENIED));
		
		w.addtoLabelBag(elist.get(4), EvaluationLabel.SATISFIED);
		
		assert(w.findExistingResult() == null);
				
	}

}
