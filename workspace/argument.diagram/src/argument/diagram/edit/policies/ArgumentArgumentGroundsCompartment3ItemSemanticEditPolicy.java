/*
 * 
 */
package argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import argument.diagram.edit.commands.Argument2CreateCommand;
import argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentArgumentGroundsCompartment3ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentGroundsCompartment3ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_3002);
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
