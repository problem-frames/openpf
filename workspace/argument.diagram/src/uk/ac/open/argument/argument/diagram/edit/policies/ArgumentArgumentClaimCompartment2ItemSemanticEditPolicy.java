package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.open.argument.argument.diagram.edit.commands.Claim2CreateCommand;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentArgumentClaimCompartment2ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentClaimCompartment2ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArgumentElementTypes.Claim_3001 == req.getElementType()) {
			return getGEFWrapper(new Claim2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
