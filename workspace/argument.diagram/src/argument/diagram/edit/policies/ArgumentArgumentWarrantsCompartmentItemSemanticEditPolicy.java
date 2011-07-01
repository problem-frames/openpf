/*
 * 
 */
package argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import argument.diagram.edit.commands.Argument3CreateCommand;
import argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentArgumentWarrantsCompartmentItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentWarrantsCompartmentItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArgumentElementTypes.Argument_3002 == req.getElementType()) {
			return getGEFWrapper(new Argument3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
