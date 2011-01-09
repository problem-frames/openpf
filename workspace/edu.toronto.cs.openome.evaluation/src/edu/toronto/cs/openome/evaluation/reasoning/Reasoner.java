/**
 * 
 */
package edu.toronto.cs.openome.evaluation.reasoning;

import org.eclipse.emf.common.command.CommandStack;

import edu.toronto.cs.openome.evaluation.commands.SetQualitativeEvaluationLabelCommand;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.impl.ModelImpl;

/**
 * @author jenhork
 * The parent reasoner class, defines the possible actions that all reasoners must have.
 * This class also holds the ModelImplementation and CommandStack that all reasoners will need to communicate with the model
 * 
 *
 */
public class Reasoner {
	protected ModelImpl model;
	protected CommandStack cs;
	
	/**
	 * @author jenhork
	 * Default constructor, does nothing
	 */
	public Reasoner() {
		model = null;
		cs = null;
	}
	
	/**
	 * @author jenhork
	 * Default constructor, sets the model implementation and the command stack
	 */
	public Reasoner(ModelImpl mod, CommandStack com) {
		model = mod;
		cs = com;	
	}
		
	/**
	 * @author jenhork
	 * This is where the reasoning actually occurs; however, it should be overridden by it's childen, as this is a general type of reasoner. 
	 * It's not clear what the parent reasoner should do.
	 */
	public void reason() {
		//This one does nothing, should be overridden
	}
	
	/**
	 * @author jenhork
	 * This method sets the QualitativeCombinedLabel attribute of a model element.
	 * It has to do this using a command.  It creates a new command then executes the command.
	 * The parameters passed in are the intention for which the label is changing and the new label to change it to.
	 */
	public void setQualCombinedLabel(Intention i, EvaluationLabel l) {
		//make a new command with the intention and label.
		SetQualitativeEvaluationLabelCommand setLabel = new SetQualitativeEvaluationLabelCommand(i, l);
		
		//put this command on the command stack (cs).  The application will execute the command for us.
		//We define the execute method for this type of command in SetQualitativeEvaluationLabelCommand
		cs.execute(setLabel);
		
		//put something here to slow it down?
	}
	
}
