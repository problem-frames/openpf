package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.open.argument.argument.diagram.edit.commands.Fact2CreateCommand;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentArgumentGroundsCompartmentItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentGroundsCompartmentItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArgumentElementTypes.Fact_3002 == req.getElementType()) {
			return getGEFWrapper(new Fact2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
