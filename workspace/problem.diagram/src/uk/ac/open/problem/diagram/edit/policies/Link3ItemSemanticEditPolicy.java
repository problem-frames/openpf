package uk.ac.open.problem.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class Link3ItemSemanticEditPolicy extends
		ProblemBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Link3ItemSemanticEditPolicy() {
		super(ProblemElementTypes.Link_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
