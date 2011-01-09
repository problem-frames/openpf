package edu.toronto.cs.openome.evaluation.SATSolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Vector;

import org.sat4j.core.VecInt;
import org.sat4j.specs.IteratorInt;

import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Link;
import edu.toronto.cs.openome_model.MakeContribution;
import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.SomeMinusContribution;
import edu.toronto.cs.openome_model.SomePlusContribution;
import edu.toronto.cs.openome_model.UnknownContribution;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.SoftgoalImpl;
import edu.toronto.cs.openome_model.Intention;

public class ModeltoAxiomsConverter {
	ModelImpl model;
	Dimacs cnf;
	Vector<Link> done;
	AxiomsFactory axiomsFactory;
	DualHashMap<Integer, Intention> intentionIndex;
	
	public ModeltoAxiomsConverter(ModelImpl m) {
		model = m;
		intentionIndex = new DualHashMap<Integer, Intention>();
		createIntentionIndex();
		done = new Vector<Link>();
		axiomsFactory = new AxiomsFactory();
	}
	
	private void createIntentionIndex() {
		int sixCount = 1;
		//System.out.println("creating intentionIndex");
		for (Intention i : model.getAllIntentions()) {
			//System.out.println("put: " + sixCount + ", " + i.getName());
			intentionIndex.put(new Integer(sixCount), i);
			sixCount += 6;
		}		
	}
	
	private void reset(String filename) {
		done = new Vector<Link>();
		cnf = new Dimacs(filename);
	}
	
	public DualHashMap<Integer, Intention> getIntentionIndex() {
		return intentionIndex;
	}

	public Dimacs convertBothDirections(String filename)  {
		reset(filename);
		
		convertContributions(1);
		//System.out.println("done contributions");
		convertDependencies(1);
		//System.out.println("done dependencies");
		convertDecompositions(1);
		//System.out.println("done decompositions");
		createTargets(1);
		//System.out.println("done targets");
		createInvariants();
		//System.out.println("done invariants");
		createConstraints(1);
		//System.out.println("done constraints");
		
		return cnf;
	}
	
	public Dimacs convertForward(String filename) {
		reset(filename);
		convertContributions(2);
		convertDependencies(2);
		convertDecompositions(2);
		createTargets(2);
		createInvariants();
		createConstraints(2);

		return cnf;
	}
	
	public Dimacs convertBackward(String filename) {
		reset(filename);
		convertContributions(3);
		convertDependencies(3);
		convertDecompositions(3);
		createTargets(3);
		createInvariants();
		createConstraints(3);

		return cnf;
	}

	private void convertDecompositions(int dir) {
		//System.out.println(model.getDecompositions().size());
		for (Decomposition dec : model.getDecompositions()) {
			//System.out.println("decomposition: " + dec.toString());
			if (!done.contains(dec)) {
				//System.out.println("not done: " + dec.toString());
				Intention target = dec.getTarget();
				//System.out.println("decomposition target: " + target.getName());
				
				if (target != null) {
									
					Vector<Link> links = new Vector<Link>();
					Vector<Intention> sources = new Vector<Intention>();
					for (Decomposition sibling: target.getDecompositionsTo()){
						//System.out.println("done " + sibling.toString());
						done.add(sibling);
						links.add(sibling);
						Intention source = sibling.getSource();
						if (source != null) {	
							//System.out.println("decomposition source is not null for: " + dec.toString());
							sources.add(source);
						} else {
							//System.out.println("decomposition source is null for: " + dec.toString());
						}
						//System.out.println("decomposition source: " + sibling.getSource().getName());
					}
					//System.out.println(sources.size());
					if (sources.size() > 0) {
						//System.out.println("decomposition source and target not null for: " + target.getName());
						String description = "Decomposition to: " + target.getName();
						LinkAxioms la = null;
						if (dec instanceof AndDecomposition)
							la = axiomsFactory.createLinkAxiom(sources, target, links, "Decomposition", intentionIndex, description);
						if (dec instanceof OrDecomposition) {
							//System.out.println("Ordecomp");
							la = axiomsFactory.createLinkAxiom(sources, target, links, "Means Ends", intentionIndex, description);
						}
							
						
						if (la != null) {
							switch (dir) {
								case 1: la.createAllClauses(); break;
								case 2: la.createForwardClauses(); break;
								case 3: la.createBackwardClauses(); break;
								default: la.createAllClauses();  break;
							}	
						}
						
						cnf.addAxioms(la);
					}
				}
			}			
			else { 
				//System.out.println("already done " + dec.toString());
				}
			
			//System.out.println("done " + dec.toString());
			done.add(dec);
						
		}		
	}	

	private void convertDependencies(int dir) {
		for (Dependency dep : model.getDependencies()) {
						
			if (!done.contains(dep)) {
				Intention sourceInt = null;
				Intention targetInt = null;	
				
				//this is the source in forward evaluation, the dependee
				Dependable source = dep.getDependencyFrom();
					
				//if it's not an actor
				if (!(source instanceof Container))  {
					//This is the target?
					sourceInt = (Intention) source;
					//System.out.println("dependency to " + sourceInt.getName());
				}
				
				//this is the target in forward evaluation, the depender
				Dependable target = dep.getDependencyTo();
				
				//if it's not an actor
				if (!(target instanceof Container))  {
					targetInt = (Intention) target;
					//System.out.println("dependency from " + targetInt.getName());
				}
				
				//it's a dependency from an intention to an intention
				if (targetInt != null && sourceInt != null) {
					Vector<Link> link = new Vector<Link>();
					link.add(dep);
					Vector<Intention> sources = new Vector<Intention>();
					sources.add(sourceInt);
					//intentionIndex.print();
					String description = "Dependency: " + targetInt.getName();
					LinkAxioms la = axiomsFactory.createLinkAxiom(sources, targetInt, link, "Dependency", intentionIndex, description);
					
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}
					//la.createAllClauses();
					cnf.addAxioms(la);
				}
			}
			else {
				//System.out.println("already done " + dep.toString());
				}
			
			//System.out.println("done " + dep.toString());
			done.add(dep);						
		}		
	}	

	private void convertContributions(int dir) {
		//System.out.println("converting contributions");	
		
		for (Contribution cont : model.getContributions()) {
			if (!done.contains(cont)) {
							
				//this is the source in forward evaluation
				Intention source = cont.getSource();					
				
				//System.out.println("contribuion from " + source.getName());
								
				//this is the target in forward evaluation
				Intention target = cont.getTarget();
					
				//System.out.println("contribuion to " + target.getName());
				
				if (source != null & target != null) {
					Vector<Link> links = new Vector<Link>();
					Vector<Intention> sources = new Vector<Intention>();
					for (Contribution sibling: target.getContributesFrom()){
						//System.out.println("done " + sibling.toString());
						done.add(sibling);
						links.add(sibling);
						sources.add(sibling.getSource());
						//System.out.println("contribution source: " + sibling.getSource().getName());
						/*if (sibling instanceof MakeContribution) 
							System.out.println("Make");
						if (sibling instanceof HelpContribution)
							System.out.println("Help");
						if (sibling instanceof SomePlusContribution)
							System.out.println("SomePlus");
						if (sibling instanceof UnknownContribution)
							System.out.println("Unknown");
						if (sibling instanceof SomeMinusContribution)
							System.out.println("SomeMinus");
						if (sibling instanceof HurtContribution)
							System.out.println("Hurt");
						if (sibling instanceof BreakContribution)
							System.out.println("Break");*/
					}				
								
					//intentionIndex.print();
					
					LinkAxioms la = null;
					
					String description = "Contriubtion to: " + target.getName();
					
					la = axiomsFactory.createLinkAxiom(sources, target, links, "Contribution", intentionIndex, description);
						
					switch (dir) {
						case 1: la.createAllClauses(); break;
						case 2: la.createForwardClauses(); break;
						case 3: la.createBackwardClauses(); break;
						default: la.createAllClauses();  break;
					}
					//la.createAllClauses();
					cnf.addAxioms(la);
				}
				
			}
			else {
				//System.out.println("already done " + cont.toString());
				}
			
			//System.out.println("done " + cont.toString());
			done.add(cont);
						
		}
		
	}
	
	private void createConstraints(int dir) {
		for (Intention intention : model.getAllIntentions()) {
			Vector<Intention> sources = new Vector<Intention>();
			sources.add(intention);
			String description = "Constraints for: " + intention.getName();
			ConstraintAxioms ia = new ConstraintAxioms(intention,intentionIndex, description);
			if (intention.isLeaf()) {				
			
				ia.createLeafClauses(); 
				cnf.addAxioms(ia);	
				
			} 
			//if (dir == 3) {
			//else if (intention.getContributesFrom().size() < 2 ) { //& !(intention instanceof SoftgoalImpl)) {
			//		ia.createAllClauses();
			//		cnf.addAxioms(ia);	
			//}
			//}
				
			
		}
		
	}

	private void createInvariants() {
		
		for (Intention intention : model.getAllIntentions()) {
			Vector<Intention> sources = new Vector<Intention>();
			sources.add(intention);
			String description = "Invariants for: " + intention.getName();
			IntentionAxioms ia = axiomsFactory.createIntentionAxiom(intention, "Invariant", intentionIndex, description);
			
			ia.createAllClauses(); 
						
			cnf.addAxioms(ia);			
		}
					
	}

	private void createTargets(int dir) {
		for (Intention intention : model.getAllIntentions()) {
			if (intention.getQualitativeReasoningCombinedLabel() != EvaluationLabel.NONE) {
				Vector<Intention> sources = new Vector<Intention>();
				sources.add(intention);
				String description = "Target for: " + intention.getName();
				TargetAxioms ia = new TargetAxioms(intention, intentionIndex, description);
			
				/*switch (dir) {
					case 1: ia.createAllClauses(); break;
					case 2: ia.createAllClauses(); break;
					case 3: ia.createBackwardClauses(); break;
					default: ia.createAllClauses();  break;
				}*/
				
				ia.createAllClauses();
						
				cnf.addAxioms(ia);		
			}
		}
		
	}

	public HashMap<Intention, int[]> convertResults(Vector<Integer> intResults) {
		HashMap<Intention, int[]> map = new HashMap<Intention, int[]>();
		int[] list;
		/*for (int i : intResults) {
			Intention intention = (Intention) intentionIndex.getForward(new Integer(i));
			if (intention != null) {
				
			}
		}*/
		
		for (Object obj : intentionIndex.keySetForward()) {
			Integer integer = (Integer) obj;
			
			int index = intResults.indexOf(integer);
			
			if (index < 0) {
				index = intResults.indexOf(new Integer(integer.intValue() * -1));				
			}
			if (index >= 0) {
				list = new int[6];
				for (int i=0; i<6; i++) {
					list[i] = intResults.get(index + i).intValue();
				}
				
				map.put((Intention) intentionIndex.getForward(integer), list);
			}				
		}
		return map;
	}
	
	public Vector<String> convertMinResults(Vector<Integer> intResults, Dimacs cnf) {
		//HashMap<Intention, int[]> map = new HashMap<Intention, int[]>();
		
		Vector<String> values = new Vector<String>();
		//intentionIndex.print();
		for (int i =0; i< cnf.getNumClauses();i++) {
			int index = intResults.indexOf(new Integer(i));
			
			if (index < 0) {
				System.out.println("index: " + index + " for " + i);
				VecInt vi = cnf.getClauseByIndex(i);
				if (vi != null)
					values.add(convertToString(vi));
				else
					System.out.println("couldn't find clause by index in conversion");
			}
			
		}
		
		return values;
		
		//ugh
		/*Vector<Vector<Object []>> resultClauses = new Vector<Vector<Object []>>(clauses.size());
		
		Object [] tuple = new Object[2];
		
		for (Object obj : intentionIndex.keySetForward()) {
			Integer integer = (Integer) obj;
			
			for (VecInt vi : clauses)  {
				IteratorInt it = vi.iterator();
				while (it.hasNext()) {
					int j = it.next(); 
					if (j == integer.intValue()) {
						
					}
				}
			}
			
			if (i == null)  {
				System.out.println("couln't find clause by index");
				return null;
			}
			
			
			
			for (int j : clause) {
				intentionIndex
			}
			
			
		}
		return map;
		*/
	
	}
	
	private String convertToString(VecInt vi) {
		IteratorInt it = vi.iterator();
		System.out.println("Converting to string: " + vi.toString());
		//Vector<String> strings = new Vector<String>();
		String str = "";
		boolean neg = false;
		int count = 0;
		while(it.hasNext()) {
			int var = it.next();
			for (int i = 0; i< 6; i++) {				
				//System.out.println(var);
				if (var != 0) {
					if (var < 0) {
						var = var * -1;
						neg = true;
					}
					Intention intention = (Intention) intentionIndex.getForward(new Integer(var - i));
					if (intention != null) {
						//System.out.println("Got intention: " + intention.getName());
						switch (i) {
							case(0): if (neg) {str += "not ";} str += "S(" + intention.getName() + ")"; break; 
							case(1): if (neg) {str += "not ";} str += "PS(" + intention.getName() + ")"; break;
							case(2): if (neg) {str += "not ";} str += "U(" + intention.getName() + ")"; break;
							case(3): if (neg) {str += "not ";} str += "C(" + intention.getName() + ")"; break;
							case(4): if (neg) {str += "not ";} str += "PD(" + intention.getName() + ")"; break;
							case(5): if (neg) {str += "not ";} str += "D(" + intention.getName() + ")"; break;
						}
						if (count < (vi.size() - 2))
							str += " OR ";
						//System.out.println(str);
						//break out of the for loop
						i = 6;
						neg = false;
					}
				}
			}
			count++;
			
		}
		return str;
	}

	public Dimacs addHumanJudgment(Dimacs cnf, IntQualIntentionWrapper w, int dir) {
		//Disable old clauses
		//cnf.disableAxioms(links);		
		
		String description = "Human judgment for intention " + w.getIntention().getName();
		
		Vector<Intention>  sources = new Vector<Intention>();
		Vector<Link> links = new Vector<Link>();
		
		ListIterator<IntentionLabelPair> it = w.getHumanJudgements().get(0).getLabelBag().listIterator();
		while (it.hasNext()) {
			IntentionLabelPair ilp =  it.next();
			sources.add(ilp.getIntention());
			//System.out.println("source: " + ilp.getIntention().getName());
			for (Contribution cont : ilp.getIntention().getContributesTo()) {
				if (cont.getTarget().equals(w.getIntention())) {
					links.add(cont);
					//System.out.println("link: " + cont.getContributionType());
				}				
			}
		}
		
		Vector<Axioms> axs = cnf.getAxioms(links);
		
		for (Axioms ax : axs) {
			if (ax instanceof HumanJudgmentLinkAxioms) {
				cnf.removeAxiom(ax);
				System.out.println("shouldn't happen?");
			}
			else {
				cnf.disableAxiom(ax);
			}
		}
		
		Intention target = w.getIntention();
		
		HumanJudgmentLinkAxioms hja = new HumanJudgmentLinkAxioms(sources, target, links, intentionIndex, description);
		
		//hja.addLabelBag(lb);
		hja.addWrapper(w);
		
		//both directions
		if (dir == 0) {			
			hja.createAllClauses();			
		}
		//forwards
		else if (dir == 1) {
			hja.createForwardClauses();
		} 
		//backwards
		else if (dir == -1) {
			hja.createBackwardClauses();
		}
		
		cnf.addAxioms(hja);	
		
		return cnf;
		
	}
	
	public Dimacs backtrackHumanJudgment(Dimacs cnf, IntQualIntentionWrapper w, int i) {
		//System.out.println("Converter backtracking for " + w.getIntention().getName());
		for (HumanJudgement hj : w.getHumanJudgements()) {
			hj.disable();
		}
		
		Vector<Link> links = new Vector<Link>();
		
		ListIterator<IntentionLabelPair> it = w.getHumanJudgements().get(0).getLabelBag().listIterator();
		while (it.hasNext()) {
			IntentionLabelPair ilp =  it.next();
			//System.out.println("source: " + ilp.getIntention().getName());
			for (Contribution cont : ilp.getIntention().getContributesTo()) {
				if (cont.getTarget().equals(w.getIntention())) {
					links.add(cont);
					//System.out.println("link: " + cont.getContributionType());
				}				
			}
		}
		
		Vector<Axioms> axs = cnf.getAxioms(links);
		//System.out.println(axs.size());
		
		for (Axioms ax : axs) {
			System.out.println(ax.getDescription());
			if (ax instanceof HumanJudgmentLinkAxioms) {
				cnf.removeAxiom(ax);
			}
			else {
				//System.out.println("trying to enable axiom.");
				cnf.enableAxiom(ax);
			}
		}
		
		//System.out.println("Converter backtracked for " + w.getIntention().getName());
		return cnf;
	}

	
	
}
