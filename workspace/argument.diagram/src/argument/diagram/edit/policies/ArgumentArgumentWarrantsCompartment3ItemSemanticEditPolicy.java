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
public class ArgumentArgumentWarrantsCompartment3ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentArgumentWarrantsCompartment3ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_3002);
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
