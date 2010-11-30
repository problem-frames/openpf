package uk.ac.open.rbac.rbac.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import uk.ac.open.rbac.rbac.diagram.edit.commands.SessionAssignmentsCreateCommand;
import uk.ac.open.rbac.rbac.diagram.edit.commands.SessionAssignmentsReorientCommand;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionAssignmentsEditPart;
import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class UserRoleAssignmentItemSemanticEditPolicy extends
		RBACBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public UserRoleAssignmentItemSemanticEditPolicy() {
		super(RBACElementTypes.UserRoleAssignment_4001);
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
		if (RBACElementTypes.SessionAssignments_4005 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (RBACElementTypes.SessionAssignments_4005 == req.getElementType()) {
			return getGEFWrapper(new SessionAssignmentsCreateCommand(req,
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
		case SessionAssignmentsEditPart.VISUAL_ID:
			return getGEFWrapper(new SessionAssignmentsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
