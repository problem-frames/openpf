package uk.ac.open.rbac.rbac.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class RolePermissionsItemSemanticEditPolicy extends
		RBACBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RolePermissionsItemSemanticEditPolicy() {
		super(RBACElementTypes.SessionAssignments_4003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
