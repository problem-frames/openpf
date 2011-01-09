package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentOrigin2ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentOrigin2ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.ArgumentOrigin_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
