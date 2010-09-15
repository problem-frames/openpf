/**
 * 
 */
package edu.toronto.cs.openome.evaluation.testing;

import static org.junit.Assert.*;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.impl.TransactionChangeRecorder;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.junit.Before;
import org.junit.Test;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;

/**
 * @author jenhork
 *
 */
public class TestHumanJudgement extends EvaluationTest {
	
	
	/**
	 * Test method for {@link edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement#findOrImplies(edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag)}.
	 */
	@Test
	public void testFindOrImplies() {
		LabelBag lb1 = new LabelBag();
		LabelBag lb2 = new LabelBag();
		LabelBag lb3 = new LabelBag();
		LabelBag lb4 = new LabelBag();
		
		EList<Intention> elist = model.getIntentions();
		
		assertTrue(!elist.isEmpty());
					
		lb1.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb1.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb1.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		lb2.addToBag(elist.get(0), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(1), EvaluationLabel.WEAKLY_SATISFIED);
		lb2.addToBag(elist.get(2), EvaluationLabel.WEAKLY_DENIED);
		
		HumanJudgement hj1 = new HumanJudgement(lb1, EvaluationLabel.SATISFIED);
		
		assertTrue(hj1.findOrImplies(lb2).equals(EvaluationLabel.SATISFIED));
		
		HumanJudgement hj2 = new HumanJudgement(lb2, EvaluationLabel.SATISFIED);
		
		assertTrue(hj2.findOrImplies(lb1).equals(EvaluationLabel.SATISFIED));
		
		lb2.addToBag(elist.get(3), EvaluationLabel.WEAKLY_SATISFIED);
		
		HumanJudgement hj3 = new HumanJudgement(lb2, EvaluationLabel.SATISFIED);
		
		assertTrue(hj1.findOrImplies(lb2).equals(EvaluationLabel.SATISFIED));
		
		//lb1.printBag();
		//lb2.printBag();
		assertTrue(hj3.findOrImplies(lb1).equals(EvaluationLabel.SATISFIED));
		
		lb2.addToBag(elist.get(4), EvaluationLabel.WEAKLY_DENIED);
		
		lb1.printBag();
		lb2.printBag();
		
		EvaluationLabel r = hj1.findOrImplies(lb2) ;
		//if (r == null)
		//	System.out.println("null");
		//else System.out.println(r.getName());
		
		assertTrue(hj1.findOrImplies(lb2) == null);
		
		//because the bag is copied
		assertTrue(hj3.findOrImplies(lb1).equals(EvaluationLabel.SATISFIED));
		
		HumanJudgement hja = new HumanJudgement(lb2, EvaluationLabel.SATISFIED);
		
		assertTrue(hja.findOrImplies(lb1) == null);
		
		lb3.addToBag(elist.get(0), EvaluationLabel.WEAKLY_DENIED);
		lb3.addToBag(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		lb3.addToBag(elist.get(2), EvaluationLabel.CONFLICT);
		
		lb4.addToBag(elist.get(0), EvaluationLabel.WEAKLY_DENIED);
		lb4.addToBag(elist.get(1), EvaluationLabel.WEAKLY_DENIED);
		lb4.addToBag(elist.get(2), EvaluationLabel.CONFLICT);
		
		HumanJudgement hj4 = new HumanJudgement(lb3, EvaluationLabel.DENIED);
		
		assertTrue(hj4.findOrImplies(lb4).equals(EvaluationLabel.DENIED));
		
		HumanJudgement hj5 = new HumanJudgement(lb4, EvaluationLabel.DENIED);
		
		assertTrue(hj5.findOrImplies(lb3).equals(EvaluationLabel.DENIED));
		
		lb3.addToBag(elist.get(3), EvaluationLabel.DENIED);
		lb3.addToBag(elist.get(4), EvaluationLabel.DENIED);
		
		assertTrue(hj4.findOrImplies(lb3).equals(EvaluationLabel.DENIED));
		
		HumanJudgement hj6 = new HumanJudgement(lb3, EvaluationLabel.DENIED);
		
		assertTrue(hj6.findOrImplies(lb4).equals(EvaluationLabel.DENIED));
		
	}

}
