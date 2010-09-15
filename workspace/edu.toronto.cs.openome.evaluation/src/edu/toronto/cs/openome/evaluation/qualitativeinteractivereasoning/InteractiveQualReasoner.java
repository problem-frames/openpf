package edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning;

import org.eclipse.swt.graphics.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import edu.toronto.cs.openome.evaluation.commands.ForwardHJWindowCommand;
import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome.evaluation.qualitativeautomaticreasoning.AutomaticQualReasoner;
import edu.toronto.cs.openome.evaluation.reasoning.Reasoner;
import edu.toronto.cs.openome.evaluation.views.AlternativesView;
import edu.toronto.cs.openome_model.AndDecomposition;
import edu.toronto.cs.openome_model.BreakContribution;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.HelpContribution;
import edu.toronto.cs.openome_model.HurtContribution;
import edu.toronto.cs.openome_model.Intention;

import edu.toronto.cs.openome_model.OrDecomposition;
import edu.toronto.cs.openome_model.Softgoal;
import edu.toronto.cs.openome_model.UnknownContribution;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.ModelImpl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateOrSelectElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.PopupMenuCommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.dialogs.ViewContentProvider;


import edu.toronto.cs.openome_model.EvaluationLabel;


/**
 * @author jenhork
 * This is a child of the Reasoner class, a specific type of reasoner.  Specifically, it implements qualitative, interactive reasoning.
 * 
 */
public class InteractiveQualReasoner extends Reasoner {
	
	//The queue of labels to propagage
	private LabelQueue lq;
	
	//Some extra info needs to be stored with softgoals, so we have a wrapper class, and we have another class
	//which stores a list of these wrappers, this is that class
	private SoftgoalWrappers softgoalWrappers;
	//Hard intentions (non-softgoals:  goal, task, resource) which have been in each iteration of the algorithm.  
	//We keep track of this  to avoid resolving one multiple times in an iteration
	private Vector<Intention> resolvedHardIntentions;
	
	//diagram command stack
	private DiagramCommandStack dcs;

	/**
	 * @author jenhork
	 * Constructor, takes in a ModelImpl (how the model is stored) a CommandStack, to execute commands, also a diagram Command stack
	 */
	public InteractiveQualReasoner(ModelImpl m, CommandStack com, DiagramCommandStack d) {
		super(m, com);
		
		dcs = d;
		
		lq = new LabelQueue();
		softgoalWrappers = new SoftgoalWrappers();
		resolvedHardIntentions = new Vector<Intention>();
	}
	
	/**
	 * @author jenhork
	 * The major method for qualitative, interactive reasoning.  This is like the "main" method.  Where most of the
	 * stuff starts from.
	 */
	public void reason() {
		
		//DEBUGGING stuff, delete eventually
		
		System.out.println("Qualitative Interactive Reasoning - Ahoy!");
//		for (Intention i : model.getAllIntentions()) {
//									
//			System.out.println(i.getName());
//			
//			setQualCombinedLabel(i, EvaluationLabel.SATISFIED);
//						
//		}
		
		//Initialize the label queue (obviously).  This grabs all the labels on the model and puts them in the queue
		initLabelQueue();
		
		//DEBUGGING  print out the label queue
		System.out.println("Label Queue");
		lq.print();
		
		//while there are lables in the label queue
		while (lq.size() > 0)  {
			
			//do step one of the algorithm, this is where all the labels are propagated one step and labels are added
			//to label bags
			step1();
			
			resolvedHardIntentions.clear();
			
			//DEBUGGING, print out the list of softgoals which have label bags that need resolving
			System.out.println("Softgoals to resolve");
			
			for(IntQualIntentionWrapper w: softgoalWrappers.getSet()) {
				if (w.bagNeedResolve()) {
					System.out.println(w.getIntention().getName());
					w.printLabelBag();		
				}
			}
						
			//do step two.  If not step 2, i.e. the user has pressed cancel, stop the entire algorithm
			if (!step2())
				return;
			
			
			//DEBUGGING, at the end of each iteration, print out the label queue
			System.out.println("Label Queue");
			lq.print();
			System.out.println(lq.size());
			
			//DEBUGGING LQ Dialog for debugging
//			String [] labels = {"Ok", "Stop"};
//			Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
//
//			Image i = new Image(Display.getCurrent(), "C:\\face.gif");
//
//			MessageDialog outputD = new MessageDialog(ar[0], "Label Queue", i, lq.toString(), 0, labels, 0);
//			
//			outputD.open();
			
		}
	}
	
	/**
	 * @author jenhork
	 * This looks through all the intentions and finds the ones with evaluation labels.  They must be propagated
	 * so the intention is added to the label queue.
	 */
	private void initLabelQueue() {
		//DEBUGGING
		System.out.println("Init");
		
		//For every intention in the model
		for (Intention i : model.getAllIntentions()) {
	
			//grab the label from the intention
			EvaluationLabel initvalue = i.getQualitativeReasoningCombinedLabel();
	
			//if the intention actually has a real label
			if (initvalue != EvaluationLabel.NONE) {
			
				//create a new intention wrapper for the intention, used to store extra stuff
				IntQualIntentionWrapper iqi = new IntQualIntentionWrapper(i);
				
				//Add the new wrapper to the label queue
				if (!lq.offer(iqi))		{	
					System.out.println("Cannot add to label queue");
					return;
				}				
						
				//store the initial value separately from the actual value of the intention
				iqi.setInitialEvaluationLabel(initvalue);	
				
				//if the intention is a softgoal, add the initial value to the label bag for a softgoal
				if (i instanceof Softgoal) {
					try {
						//For initial values, the source element in the label bag is the element itself
						iqi.addtoLabelBag(i, initvalue);
					}
					catch (Exception e) {
						System.out.println("couldn't add to bag");
					}
				}
			}						
		}
	}
	
	/**
	 * @author jenhork
	 * This method propagates everything in the label queue at this time, including adding labels to softgoal bags.
	 */
	private void step1() {
		//DEBUGGING
		System.out.println("Step 1");
		
		int starting_size = lq.size();
		
		//For each intention in the label queue	
		for (int i = 0; i < starting_size; i++) {
			//DEBUGGING
			//System.out.println("At: " + i);
			
			//make a new wrapper
			IntQualIntentionWrapper currWrapper = null;
			
			//try to grab the right element from the queue and put it in the wrapper
			//it's a queue so add to the end, take from the front
			try {
				currWrapper = lq.poll();
			}
			catch (Exception e) {
				System.out.println("Couldn't poll label queue");
				return;
			}
			
			//Get the actual intention in the wrapper
			Intention current = currWrapper.getIntention();
			
			//DEBUGGING
			System.out.println("propagating for " + current.getName());
			
			//Propagate the contribution links from this element
			propagateContributions(current);
			
			//propagate through the decomposition and means-ends links from this element
			propagateDecompositions(current);
			
			//propagate through the dependency links from this element
			propagateDependencies(current);
		}
	}
	
	/**
	 * @author jenhork
	 * Takes an intention which has a label, as it comes from the label queue, and propagates the current label through
	 * all of the contributions links coming from that intention, i.e. with that intention as a source.
	 */
	private void propagateContributions(Intention intention) {
		//DEBUGGING
		//System.out.println("propagate Contributions for " + intention.getName());
		
		//Get all the intentions that this intention contributes to via contribution links
		for (Contribution c: intention.getContributesTo())  {
			//get the target intention
			Intention target = c.getTarget();
			
			//DEBUGGING
			//System.out.println("Target: " + target.getName());
			
			//System.out.println(softgoalsToResolve.size());
			
			//apply the contribution rules to get the result
			EvaluationLabel result = applyContributionRules(c, intention.getQualitativeReasoningCombinedLabel());
			
			//DEBUGGING
			//System.out.println("Result: " + result.getName());
			
			//Add the softgoal to a list of softgoals to resolve via human judgment
			addSoftgoalToResolve(target, intention, result);			
		}
	}
	
	/**
	 * @author jenhork
	 * Add the softgoal to a list of softgoals to resolve via human judgment
	 */
	private void addSoftgoalToResolve(Intention target, Intention source, EvaluationLabel result) {
		IntQualIntentionWrapper targetWrapper = null;
		
		//find existing wrapper in the list of softgoals to resolve, if there is one
		//this avoids having mulitple wrappers pointing to the same softgoal
		try {
			targetWrapper = softgoalWrappers.findIntention(target);
			
		}
		catch (Exception e) {
			System.out.println("Find Intention exception");
		}
		
		//There isn't one for this softgoal, so make a new one
		if (targetWrapper == null)
			targetWrapper = new IntQualIntentionWrapper(target);
		else
			System.out.println("Found wrapper: " + targetWrapper.getIntention().getName());
		
		//Add the source and result to the label bag for this intention
		try {
			targetWrapper.addtoLabelBag(source, result);
		}
		catch (Exception e) {
			System.out.println("Can't add to bag");
		}
		
		//Add the wrapper to the list of softgoal wrappers
		//will only add it if it's not already there, as it's a Set
		try {
			softgoalWrappers.add(targetWrapper);				
		}
		catch (Exception e) {
			System.out.println("Can't add to list of softgoals to resolve");
			if (e instanceof UnsupportedOperationException)
				System.out.println("unsupported operation");
			if (e instanceof NullPointerException)
				System.out.println("NullPointerException");
			if (e instanceof ClassCastException)
				System.out.println("ClassCastException");
			if (e instanceof IllegalArgumentException)
				System.out.println("IllegalArgumentException");
		}
			
	}
	
	/**
	 * @author jenhork
	 * This implements the contribution link table in my evaluation work. 
	 * See table 3 here:  http://istar.rwth-aachen.de/tiki-index.php?page_ref_id=260
	 *  
	 */
	private EvaluationLabel applyContributionRules(Contribution c, EvaluationLabel l) {	
		if (l == EvaluationLabel.UNKNOWN || l == EvaluationLabel.CONFLICT)
			return l;
		
		if (c instanceof HelpContribution) {
			if (l == EvaluationLabel.SATISFIED || l == EvaluationLabel.WEAKLY_SATISFIED)
				return EvaluationLabel.WEAKLY_SATISFIED;
			if (l == EvaluationLabel.DENIED || l == EvaluationLabel.WEAKLY_DENIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}			
		}
		
		if (c instanceof UnknownContribution)
			return EvaluationLabel.UNKNOWN;
		
		if (c instanceof HurtContribution) {
			if (l == EvaluationLabel.SATISFIED || l == EvaluationLabel.WEAKLY_SATISFIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}
			if (l == EvaluationLabel.DENIED || l == EvaluationLabel.WEAKLY_DENIED) {
				return EvaluationLabel.WEAKLY_SATISFIED;
			}
		}
		
		if (c instanceof BreakContribution) {
			if (l == EvaluationLabel.WEAKLY_SATISFIED) {
				return EvaluationLabel.WEAKLY_DENIED;
			}
			if (l == EvaluationLabel.SATISFIED) {
				return EvaluationLabel.DENIED;
			}
			if (l == EvaluationLabel.WEAKLY_DENIED || l == EvaluationLabel.DENIED) {
				return EvaluationLabel.WEAKLY_SATISFIED;
			}			
		}
		
		//it's a MakeContribution
		return l;
	}
	
	/**
	 * @author jenhork
	 *  Propagates values through decompositions and means-ends links coming from this intention, i.e., the intention
	 *  is the child of the relationships 
	 */
	private void propagateDecompositions(Intention intention) {
		//DEBUGGING
		System.out.println("Propagating Decompositions for " + intention.getName());
		
		//For each decomposition link coming "from" an intention (i.e.) the intention is the child
		for (Decomposition d: intention.getDecompositionsFrom()) {
			//get the target or parent
			Intention target = d.getTarget();	
			//If the target has not already been resolve in this iteration, resolve it
			if (!resolvedHardIntentions.contains(target)) {
				//DEBUGGING
				System.out.println("Finding label for " + target.getName());
				
				//add the target to the list of hard intentions that have been resolved
				resolvedHardIntentions.add(target);			
				
				//Now actually find the value for the target.  This has to be mixed with dependencies to account
				//for intentions which have a mixture of decompositions and dependencies
				resolveDecompositionsAndDependencies(target, intention);		
			}
		}
	}
	
	/**
	 * @author jenhork
	 * Propagates values through dependency links coming from this intention, i.e., the intention
	 *  is the source or dependee
	 *  
	 */
	private void propagateDependencies(Intention intention) {
		//DEBUGGING
		//System.out.println("Propagating Dependencies for " + intention.getName());
		
		//For each target or depender
		for (Dependency d: intention.getDependencyTo()) {
			//get the target
			Dependable dependable = d.getDependencyTo();
			
			//If the target is not an actor, like in an SD diagram
			if (!(dependable instanceof Container)) {
				//if the target has not already been resolved in this round of propagation
				if (!resolvedHardIntentions.contains(dependable)) {
					//DEBUGGING
					//System.out.println("Finding label for " + ((Intention) dependable).getName());
					
					//Now actually find the value for the target.  This has to be mixed with dependencies to account
					//for intentions which have a mixture of decompositions and dependencies
					resolveDecompositionsAndDependencies((Intention) dependable, intention);
					
					//Add the intention to the list of hard intentions resolved in this round
					resolvedHardIntentions.add((Intention) dependable);	
				}
				
			}
		}
	}
	
	/**
	 * @author jenhork
	 *  Actually find a value for a hard intention.  We need to take into accound decompositions, means-ends
	 *  and dependencies, so we look at them all at once in one method. 
	 */
	private void resolveDecompositionsAndDependencies(Intention target, Intention source){
		EvaluationLabel result;
		
		//variables to hold the incoming AND and OR labels
		Vector<EvaluationLabel> ANDDecomps = new Vector<EvaluationLabel>();
		Vector<EvaluationLabel> ORDecomps = new Vector<EvaluationLabel>();
		
		//Go through all of the outgoing decomposition links and gather in incoming values
		//So it finds all of the children of the target via decomposition or means-ends links
		//and grabs their labels
		for (Decomposition dc: target.getDecompositionsTo()) {
			if (dc instanceof AndDecomposition) {
				ANDDecomps.add(dc.getSource().getQualitativeReasoningCombinedLabel());
			}
			if (dc instanceof OrDecomposition) {
				ORDecomps.add(dc.getSource().getQualitativeReasoningCombinedLabel());
			}
		}
		
		//DEBUGGING
		System.out.println(ANDDecomps.toString());
		System.out.println(ORDecomps.toString());
		
		//Do the same for dependencies, find all the incoming labels via dependencies
		Vector<EvaluationLabel> dependencies = new Vector<EvaluationLabel>();
		
		//For each incoming dependency, grab the label
		for (Dependency dep: target.getDependencyFrom()) {
			Dependable dependable = dep.getDependencyFrom();
			
			//Make sure it's not coming from an actor, if it is, it won't have a label
			if (!(dependable instanceof Container)) {
				result = ((Intention) dependable).getQualitativeReasoningCombinedLabel();
				dependencies.add(result);
				
				//If the intention we are resolving is a softgoal, add the values from dependency links
				//to the softgoals label bag
				if (target instanceof Softgoal) {
					addSoftgoalToResolve(target, (Intention) dependable, result);
				}
			}
		}
				
		//DEBUGGING
		System.out.println(dependencies.toString());
		System.out.println(ANDDecomps.size() + ", " + ORDecomps.size() + ", " + dependencies.size());
		
		//An element probably shouldn't have both an AND and an OR Decomposition, doesn't
		//make much sense, but, in case it does, I will do something.  I will AND the results
		//of both as long as they are not NONE
		//So this variable holds the AND and OR results
		Vector<EvaluationLabel> both = new Vector<EvaluationLabel>();
		
		if (ANDDecomps.size() > 0) {
			both.add(resolveAND(ANDDecomps));			
		}
		if (ORDecomps.size() > 0) {
			both.add(resolveOR(ORDecomps));
		}
		
		//if the target is a softgoal, add the AND of the AND and OR results to it's label bag, if it's not none
		if (target instanceof Softgoal) {
			if (both.size() > 0)  {
				result = resolveAND(both);
			
				if (result != EvaluationLabel.NONE)
					addSoftgoalToResolve(target, source, result);
			}
		}
		//target is not a softgoal
		else {
			//there are dependencies, so add in the dependency results to the both variable (which should now be called
			// "all three" I guess)
			if (dependencies.size() > 0) {
				both.add(resolveAND(dependencies));
			}	
			
			//Now AND together the results of AND, OR and dependency, this is the final answer
			result = resolveAND(both);
			
			if (result != EvaluationLabel.NONE) {
				//set the label
				setQualCombinedLabel(target, result);
			
				//make a new wrapper and add it to the queue
				//I guess we don't need to check if it's already in the queue, the resolvedHardIntentions list
				//should have taken care of that.  Also, if we have a repeat in the queue, it's not that big of a 
				//deal, just inefficient.
				IntQualIntentionWrapper targetWrapper = new IntQualIntentionWrapper(target);
			
				lq.add(targetWrapper);
			}
			
			//DEBUGGING
			System.out.println(result.getName());
		}
		
	}
	
	/**
	 * @author jenhork
	 *  Takes in a vector of evaluation labels and "ANDs" them, finds the smallest and returns it.
	 *  See http://istar.rwth-aachen.de/tiki-index.php?page_ref_id=260 for the ordering of labels.
	 */
	private EvaluationLabel resolveAND(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the smallest, start it with the biggest
		EvaluationLabel smallest = EvaluationLabel.SATISFIED;
		
		for (EvaluationLabel l: list) {
			//DEBUGGING, System.out.println("Is " + l.getName() + " less than " + smallest.getName() + "?");
			if (l.isLessThan(smallest)) {
				//DEBUGGING, System.out.println("Yes");
				smallest = l;
			}
			//DEBUGGING, else {System.out.println("No");}
		}
		
		return smallest;
	}
	
	/**
	 * @author jenhork
	 *  Takes in a vector of evaluation labels and "ORs" them, finds the largest and returns it.
	 *  See http://istar.rwth-aachen.de/tiki-index.php?page_ref_id=260 for the ordering of labels.
	 */
	private EvaluationLabel resolveOR(Vector<EvaluationLabel> list) {
		if (list.size() == 0)
			return EvaluationLabel.NONE;
		
		//find the biggest, start it with the smallest
		EvaluationLabel biggest = EvaluationLabel.NONE;
		
		for (EvaluationLabel l: list) {
			//DEBUGGING, System.out.println("Is " + l.getName() + " greater than " + biggest.getName() + "?");
			if (l.isGreaterThan(biggest)) {
				//DEBUGGING, System.out.println("Yes");
				biggest = l;
			}
			//DEBUGGING, else {System.out.println("No");}
		}
		
		return biggest;
	}
	
	/**
	 * @author jenhork
	 *  Step 2!
	 *  In step two we go through all the unresolved softgoals and call for human judgment on them.
	 *  The results are taken and added into the label queue for the next iteration
	 */
	private boolean step2() {
		//DEBUGGING
		System.out.println("Step 2");
		
		EvaluationLabel result; 
		
		//Go through all the softgoal wrappers
		for (IntQualIntentionWrapper w: softgoalWrappers.getSet())  {
			//if the softgoals' label bag needs to be resolved
			if (w.bagNeedResolve()) {
				//First see if we can get the answer using our automatic cases
				result = applyAutomaticSoftgoalCases(w);
				
				//DEBUGGING
				System.out.println("Resolving: " + w.getIntention().getName());
				if (result != null) System.out.println("Automatic result: " + result.getName());
				
				//Can't get automatic result, need human judgment
				if (result == null)  {				
					//get human judgment
						result = resolveOtherCases(w);
										
					//the result will be null if they cancel the window, which means they want to quit evaluating
					if (result == null) {
						return false;
					}
					
				}
			
				//Set the label to the result
				setQualCombinedLabel(w.getIntention(), result);
				
				//add it to the queue
				lq.add(w);		
				
				//mark the bag as resolved
				w.bagResolved();
			}	
			
		}	
		//the user didn't exit
		return true;
		
	}
	
	/**
	 * @author jenhork
	 *  Apply the cases where softgoal label bags can be resolved automatically.  See Table 4 here for a list:
	 *  http://istar.rwth-aachen.de/tiki-index.php?page_ref_id=260
	 */
	private EvaluationLabel applyAutomaticSoftgoalCases(IntQualIntentionWrapper w) {
		//case 1, there is only one label in the bag
		if (w.bagSize() == 1) {
			IntentionLabelPair ilp = w.getFirstFromBag();
			return ilp.getEvaluationLabel();
		}
		
		//case 2 & 3		
		if (w.bagHasSatisfied() && w.isBagPositive())
			return EvaluationLabel.SATISFIED;
		if (w.bagHasDenied() && w.isBagNegative())
			return EvaluationLabel.DENIED;
		//new cases
		if (w.bagIsUnknown())
			return EvaluationLabel.UNKNOWN;
		if (w.bagIsConflict())
			return EvaluationLabel.CONFLICT;
		
		//case 4, null if it doesn't apply
		//This looks to see if the user has already answered this question
		return w.findExistingResult();				
	}
	
	/**
	 * @author jenhork
	*
	 */
	protected EvaluationLabel resolveOtherCases(IntQualIntentionWrapper w) {
	
		Shell [] ar = PlatformUI.getWorkbench().getDisplay().getShells();
		
	//	Shell theShell = null;
											
	//	for (Shell s: ar) {
	//		System.out.println(s.toString());
	//		if (s.isFocusControl())  {
	//			theShell = s;
	//			System.out.println("Focus: " + s.toString());
	//		}
	//		
	//	}
		
				
		ForwardHJWindowCommand wincom = new ForwardHJWindowCommand(ar[0], w);
			
				
		cs.execute(wincom);
				
	
		if (wincom.cancelled()) {
			return null;
		}
		
		EvaluationLabel result = wincom.getEvalResult();		
		
		HumanJudgement hj = w.addHumanJudgement(result);
		
		System.out.println("Human Judgement result: " + result.getName());
		
		return result;
	
	}
	
	public SoftgoalWrappers getSoftgoalWrappers(){
		return softgoalWrappers;
	}
	
}
