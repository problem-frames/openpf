/*
 * 
 */
package argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import argument.argument.diagram.edit.commands.Argument2CreateCommand;
import argument.argument.diagram.providers.ArgumentElementTypes;

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
		if (ArgumentElementTypes.Argument_3001 == req.getElementType()) {
			return getGEFWrapper(new Argument2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
