package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import uk.ac.open.argument.argument.diagram.edit.commands.Argument2CreateCommand;
import uk.ac.open.argument.argument.diagram.edit.commands.Fact3CreateCommand;
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
		super(ArgumentElementTypes.Argument_3002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ArgumentElementTypes.Argument_3002 == req.getElementType()) {
			return getGEFWrapper(new Argument2CreateCommand(req));
		}
		if (ArgumentElementTypes.Fact_3003 == req.getElementType()) {
			return getGEFWrapper(new Fact3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
