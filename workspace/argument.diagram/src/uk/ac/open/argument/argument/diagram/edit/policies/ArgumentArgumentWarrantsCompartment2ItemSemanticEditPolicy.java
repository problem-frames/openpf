package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.open.argument.argument.diagram.edit.commands.Argument3CreateCommand;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentArgumentWarrantsCompartment2ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentWarrantsCompartment2ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_3001);
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
