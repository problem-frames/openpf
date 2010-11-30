package uk.ac.open.rbac.rbac.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import uk.ac.open.rbac.rbac.diagram.edit.commands.RolePermissionsCreateCommand;
import uk.ac.open.rbac.rbac.diagram.edit.commands.RolePermissionsReorientCommand;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionsEditPart;
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

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RBACElementTypes.RolePermissions_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RBACElementTypes.RolePermissions_4004 == req.getElementType()) {
			return getGEFWrapper(new RolePermissionsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RolePermissionsEditPart.VISUAL_ID:
			return getGEFWrapper(new RolePermissionsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
