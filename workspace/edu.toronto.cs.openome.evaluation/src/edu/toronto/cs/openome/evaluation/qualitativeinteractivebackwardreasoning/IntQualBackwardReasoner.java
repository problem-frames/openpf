package edu.toronto.cs.openome.evaluation.qualitativeinteractivebackwardreasoning;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sat4j.core.VecInt;

import edu.toronto.cs.openome.evaluation.SATSolver.Dimacs;
import edu.toronto.cs.openome.evaluation.SATSolver.ModeltoAxiomsConverter;
import edu.toronto.cs.openome.evaluation.SATSolver.zChaffSolver;
import edu.toronto.cs.openome.evaluation.SATSolver.zMinimalSolver;
import edu.toronto.cs.openome.evaluation.commands.BackwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.ForwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.SoftgoalWrappers;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class IntQualBackwardReasoner extends Reasoner {
	//Some extra info needs to be stored with softgoals, so we have a wrapper class, and we have another class
	//which stores a list of these wrappers, this is that class
	private SoftgoalWrappers softgoalWrappers;
	private HashMap <Intention, Integer> minDistances;
	private Dimacs cnf;
	private Dimacs cnfBack;
	zChaffSolver solver;
	zMinimalSolver minSolver;
	ModeltoAxiomsConverter converter;
	Stack<Vector<Intention>> hjStack;
	/**
	 * @author jenhork
	 * Constructor, takes in a ModelImpl (how the model is stored) a CommandStack, to execute commands, also a diagram Command stack
	 */
	public IntQualBackwardReasoner(ModelImpl m, CommandStack com) {
		super(m, com);
		
		softgoalWrappers = new SoftgoalWrappers();
		minDistances = new HashMap<Intention, Integer>();
		solver = new zChaffSolver();
		minSolver = new zMinimalSolver();
		converter = new ModeltoAxiomsConverter(model);
		hjStack = new Stack<Vector<Intention>>();
		initializeMinDistances();
		//System.out.println("finished constructor");
	}
	
	/**
	 * @author jenhork
	 * The major method for qualitative, interactive reasoning.  This is like the "main" method.  Where most of the
	 * stuff starts from.
	 */
	public void reason() {
		//DEBUGGING stuff, delete eventually
		
		System.out.println("Qualitative Interactive Backward Reasoning - !yohA");
		
		//First, translate the model into a form that the SAT solver can read
						
		cnf = converter.convertBothDirections("Dimacs.cnf");
				
		cnfBack = converter.convertBackward("backDimacs.cnf");
		
		//System.out.println("Done conversion");
		
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		Shell shell = ar[0];
		
		while( true )  {
			int result = solver.solve(cnf);		
			
			if (result ==1) {
				
				Vector<Integer> intResults = solver.getResults();
				
				HashMap<Intention, int[]> results = converter.convertResults(intResults);
			
				System.out.println("Results HashMap");
				//System.out.println(intResults.size());
				for (Intention intention : results.keySet()) {
					System.out.println(intention.getName());
					int [] ints = results.get(intention);
					for (int i : ints) {
						System.out.print(i + " ");
					}
					System.out.println("");				
				}
				
				Vector<Intention> needHJ = processAndDisplayResults(results);	
				
				if (needHJ.size() == 0) {
					//we are done, problem is SAT, HJ not needed
					
					showMessage("Success: backward evaluation complete!", shell);
					return;
				}
				
				//System.out.println("The following intentions need human judgment: ");
				//for (Intention i : needHJ) {
				//	System.out.println(i.getName());
				//}
				
				Vector<Intention> topMostConflict = findTopMostConflict(needHJ);
				
				//System.out.println(cnf.getNumClauses());
				
				int hjresult = addHumanJudgement(topMostConflict); //, results);
				
				//user has cancelled
				if (hjresult == -1)
					return;
				//user has no more hj to add
				if (hjresult == 0) {
					int bresult = backtrack();
					
					if (bresult == -1) {
						return;
					}
				}
				if (hjresult == 1) {
					hjStack.push(topMostConflict);
				}
				
				//System.out.println(cnf.getNumClauses());
				
				//remove me later
				//result = solver.solve(cnf);
				//result = solver.solve(cnfBack);	
				
				
			}
			else if (result == 0) {
				if (hjStack.size() > 0) {
					//temporarily disable unsat results
					//String unsatMessage = getUnsatCoreString(cnf);
					
					//showMessage("Target(s) unsatisfiable\n" + unsatMessage + "backtracking...", shell);
					showMessage("Target(s) unsatisfiable\n" + "backtracking...", shell);
				}
				
				int bresult = backtrack();
				
				if (bresult == -1) {
					return;
				}		
			}
			else {
				System.out.println("zChaff failed");
				
				return;
			}
		}
		
	
		//cnf = converter.convertForward();
		
		//solver.solve(cnf);
		
		//cnf = converter.convertBackward();
		
		//solver.solve(cnf);
		
	}
	
	private int backtrack() {
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		Shell shell = ar[0];			
		
		if (hjStack.size() > 0) {				
					
			Vector<Intention> needHJ = hjStack.pop();
			
			for (Intention i: needHJ) {
				System.out.println(i.getName() + " needs human judgment in backtrack");
				
				IntQualIntentionWrapper w = softgoalWrappers.findIntention(i);
				
				cnf = converter.backtrackHumanJudgment(cnf, w, 0);
				cnfBack = converter.backtrackHumanJudgment(cnfBack, w, -1);
			}
			
			/*int result = solver.solve(cnf);		
			
			if (result == 1) {
				
				Vector<Integer> intResults = solver.getResults();
				
				HashMap<Intention, int[]> results = converter.convertResults(intResults);
						
				int hjresult = addHumanJudgement(needHJ, results);
				
				//user has cancelled
				if (hjresult == -1)
					return -1;
				//user has no more hj to add
				else if (hjresult == 0) {
					
					int bresult = backtrack();
					
					if (bresult == -1) {
						return -1;
					}
					
				} else if (hjresult == 1)  {
					hjStack.push(needHJ);
				}
				
				return 1;
			}
			else {
				int bresult = backtrack();
				
				if (bresult == -1) {
					return -1;
				}
			}*/
			return 1;
		}
		else {
			//temporarily disable unsat results
			//String unsatMessage = getUnsatCoreString(cnf);
			//showMessage("Target(s) unsatisfiable, no more judgments to backtrack over.\n" + unsatMessage + "Ending.", shell);
			showMessage("Target(s) unsatisfiable, no more judgments to backtrack over.\n" + "Ending.", shell);

			
			return -1;
		}
		
	}

	private String getUnsatCoreString(Dimacs cnf2) {
		int minResult = minSolver.solve(cnf);	
		
		if (minResult == 1) {				
			Vector<Integer> intResults = minSolver.getResults();
		
			System.out.println(intResults.size());
			
			Vector<String> results = converter.convertMinResults(intResults, cnf);
			
			/*System.out.println("The following intention labels are conflicting:");
			System.out.println(results.size());
			for (String str: results) {
				System.out.println(str);			
			}*/
			
			String message = "The following intention clauses are conflicting:\n";
			for (String str: results) {
				message += str + "\n";			
			}
			
			return message;
		}
		else
			return "";
		
	}

	private int addHumanJudgement(Vector<Intention> topMostConflict) { //, HashMap<Intention, int[]> results) {
		int hjresult = 0;
		int result = solver.solve(cnfBack);					
		
		if (result == 1) {
			
			Vector<Integer> intBackResults = solver.getResults();
		
			HashMap<Intention, int[]> backResults = converter.convertResults(intBackResults);
		
			for (Intention i: topMostConflict)  {
				System.out.println("The following intentions are getting human judgment: " + i.getName());			
				
				/*System.out.println("Backward Results HashMap");
				//System.out.println(intResults.size());
				for (Intention intention : backResults.keySet()) {
					System.out.println(intention.getName());
					int [] ints = backResults.get(intention);
					for (int j : ints) {
						System.out.print(j + " ");
					}
					System.out.println("");				
				}*/
			
				//backwards eval to find targets?
				IntQualIntentionWrapper w =softgoalWrappers.findIntention(i);
				if (w == null) {
					w = new IntQualIntentionWrapper(i);
					softgoalWrappers.add(w);
				}				
							
				//LabelBag lb = promptForHumanJudgment(w, backResults.get(i));
				LabelBag lb = promptForHumanJudgment(w, backResults.get(i));
				
				//user has pressed cancel, quit everything
				if (lb == null) {
					return -1;
				//no combinations 
				} else if (lb.size() == 0) {
					return 0;
				} else if (lb.size() > 0) {
					//System.out.println("r is 1");
					//lb.printBag();
					//do something with the bag
					
					System.out.println("human judgements:");
					for (HumanJudgement hj : w.getHumanJudgements()) {
						hj.getLabelBag().printBag();
						System.out.println("Target: " + hj.getJudgement().toString());
					}	
					
					cnf = converter.addHumanJudgment(cnf, w, 0);
					cnfBack = converter.addHumanJudgment(cnfBack, w, -1);
					
					hjresult = 1;
				}
			}
		} else {
			System.out.println("Couldn't find backward target");
			return 0;
		}
		return hjresult;		
	}

	private LabelBag promptForHumanJudgment(IntQualIntentionWrapper w, int[] js) {
		System.out.println(w.getIntention().getName() + " needs human judgment.  Target is: ");
		for (int j: js)
			System.out.print(j + " ");
		System.out.println();
		
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
		
		if (js[0] > 0 ) { //& (js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.SATISFIED);
		}		
		else if (js[1] > 0 ) { //& (js[2] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_SATISFIED);
		}	
		else if (js[2] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[3] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.UNKNOWN);
		}		
		else if (js[3] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[4] < 0 & js[5] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.CONFLICT);
		}
		else if (js[4] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.WEAKLY_DENIED);
		}			
		else if (js[5] > 0 ) { //& (js[0] < 0 & js[1] < 0 & js[2] < 0 & js[3] < 0 & js[4]<0)) {
			w.setInitialEvaluationLabel(EvaluationLabel.DENIED);
		}
		else {
			//System.out.println("Backward target not clear for " + w.getIntention().getName());
			//return new LabelBag();
			w.setInitialEvaluationLabel(EvaluationLabel.NONE);
		}
		
		
		BackwardHJWindowCommand wincom = new BackwardHJWindowCommand(ar[0], w);
				
		cs.execute(wincom);
		
		
		
		if (wincom.noCombinations()) {
			return new LabelBag();
		}
		
		if (wincom.done()) {
			//System.out.println("Window was done");
			return wincom.getBagResult();			
		}
		
		// was cancelled
		return null;
	}

	private Vector<Intention> findTopMostConflict(Vector<Intention> needHJ) {
		// find distance from top goals for each intention
		
		Vector<Intention> topMost = new Vector<Intention>();
		
		int smallest = model.getAllIntentions().size();
		
		for (Intention i: needHJ) {
			int distance = minDistances.get(i).intValue();
			if (distance < smallest) {
				smallest = distance;
			}
		}
		
		for (Intention i: needHJ) {
			if (smallest == minDistances.get(i).intValue())
				topMost.add(i);
		}
		
		return topMost;
	}
	
	private void initializeMinDistances() {
		if (minDistances.size() == 0)
		{
			//System.out.println("initialize min distances");
			//initialize data structure
			for (Intention i : model.getAllIntentions()) {
				//second argument is the largest possible value for distance
				minDistances.put(i, new Integer(model.getAllIntentions().size()));
			}
			//find top intentions
			for (Intention i : model.getAllIntentions()) {
				if (i.isRoot()) {
					//dusted off my algorithms book (seriously)
					//I guess this is a breadth-first search for all intentions,
					//keeping track of the distance from root
					int distance = 0;
					findMinDistance(distance, i, minDistances);
				}
			}
			//for (Intention i: minDistances.keySet()) {
			//	System.out.println(i.getName() + " distance: " + minDistances.get(i).intValue());
			//}
		}
		
	}

	private void findMinDistance(int distance, Intention root, HashMap<Intention, Integer> hashMap) {
		
		if (hashMap.get(root).intValue() > distance)
				hashMap.put(root, new Integer(distance));
		
		//System.out.println("finding distance for " + root.getName() + " " + distance);
		distance++;
		
		
		//base case, root is leaf
		if (root.isLeaf())   {	
			//System.out.println("is leaf");
			return;// hashMap;
		}
		else {			
			for (Intention child : root.getChildren()) {
				//System.out.println("child: " + child.getName());
				findMinDistance(distance, child, hashMap);
			}
		}
		
		return;
	}

	private Vector<Intention> processAndDisplayResults(HashMap<Intention, int[]> results) {
		Vector<Intention> needHJ = new Vector<Intention>();
		
		for (Intention intention : results.keySet()) {
			//System.out.println("Displaying for: " + intention.getName());
			int [] ints = results.get(intention);
			
			if (ints[0] > 0 & (ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.SATISFIED);
			}
			
			else if (ints[1] > 0 & (ints[0] < 0 & ints[2] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				//if (intention.getContributesFrom().size() < 2)
					setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_SATISFIED);
			}
			
			else if (ints[2] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[3] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
			}
			
			else if (ints[3] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[4] < 0 & ints[5] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
			}
			
			else if (ints[4] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0 & ints[5] < 0)) {
				//if (intention.getContributesFrom().size() < 2)
					setQualCombinedLabel(intention, EvaluationLabel.WEAKLY_DENIED);
			}
			
			else if (ints[5] > 0 & (ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0)) {
				setQualCombinedLabel(intention, EvaluationLabel.DENIED);
			}
			else if (ints[4] < 0 & ints[5] < 0 & ints[0] < 0 & ints[1] < 0 & ints[2] < 0 & ints[3] < 0) {
				setQualCombinedLabel(intention, EvaluationLabel.NONE);
			}
			/*!!
			 * I'm missing a case here where there is more than one PS or more than one PD value.  
			 * This isn't actually possible, but if the value is only PS or only PD and there is more than one incoming
			 * contribution link then...  maybe this is it?
			 */
			else {
				if (intention.getContributesFrom().size() > 1) {
					setQualCombinedLabel(intention, EvaluationLabel.UNKNOWN);
					needHJ.add(intention);
				}
				else {
					setQualCombinedLabel(intention, EvaluationLabel.CONFLICT);
				}					
			}
		}
		
		return needHJ;
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}
	
	/**
	 * Shows a message in a dialog box with an OK button 
	 * @param message
	 */
	private void showMessage(String message, Shell shell) {
		MessageDialog.openInformation(
			shell,
			"Interactive Qualitative Backward Reasoning",
			message);
	}

}
