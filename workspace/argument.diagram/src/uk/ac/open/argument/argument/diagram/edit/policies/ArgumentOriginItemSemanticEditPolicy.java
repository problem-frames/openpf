package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentOriginItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ArgumentOriginItemSemanticEditPolicy() {
		super(ArgumentElementTypes.MitigatesRebuttal_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
