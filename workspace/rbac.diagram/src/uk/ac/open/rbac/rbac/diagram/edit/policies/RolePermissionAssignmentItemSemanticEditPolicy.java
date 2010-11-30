package uk.ac.open.rbac.rbac.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class RolePermissionAssignmentItemSemanticEditPolicy extends
		RBACBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RolePermissionAssignmentItemSemanticEditPolicy() {
		super(RBACElementTypes.RolePermissionAssignment_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
