package edu.toronto.cs.openome.evaluation.testing;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Test;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome_model.Intention;

public class TestSoftgoalWrappers extends EvaluationTest{

	@Test
	public void testFindIntention() {
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
		
		SoftgoalWrappers ws = new SoftgoalWrappers();
		
		IntQualIntentionWrapper w1 = new IntQualIntentionWrapper(elist.get(0));
		IntQualIntentionWrapper w2 = new IntQualIntentionWrapper(elist.get(1));
		IntQualIntentionWrapper w3 = new IntQualIntentionWrapper(elist.get(2));
		
		ws.add(w1);
		ws.add(w2);
		ws.add(w3);
		
		assert(ws.findIntention(elist.get(0)).equals(w1));
		assert(ws.findIntention(elist.get(1)).equals(w2));
		assert(ws.findIntention(elist.get(2)).equals(w3));
		
		assert(ws.findIntention(elist.get(3)) == null);
		assert(ws.findIntention(elist.get(4)) == null);
		assert(!ws.findIntention(elist.get(0)).equals(w2));
		assert(!ws.findIntention(elist.get(2)).equals(w1));
	}

}
