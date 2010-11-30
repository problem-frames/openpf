package uk.ac.open.rbac.rbac.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.open.rbac.rbac.Permission;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.RolePermissionAssignment;
import uk.ac.open.rbac.rbac.diagram.edit.policies.RBACBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RolePermissionAssignmentReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public RolePermissionAssignmentReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof RolePermissionAssignment) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		Permission target = getLink().getPermission();
		if (!(getLink().eContainer() instanceof Role)) {
			return false;
		}
		Role container = (Role) getLink().eContainer();
		return RBACBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolePermissionAssignment_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Permission && newEnd instanceof Permission)) {
			return false;
		}
		Role source = getLink().getRole();
		if (!(getLink().eContainer() instanceof Role)) {
			return false;
		}
		Role container = (Role) getLink().eContainer();
		return RBACBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRolePermissionAssignment_4002(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setRole(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setPermission(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected RolePermissionAssignment getLink() {
		return (RolePermissionAssignment) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Role getOldSource() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewSource() {
		return (Role) newEnd;
	}

	/**
	 * @generated
	 */
	protected Permission getOldTarget() {
		return (Permission) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Permission getNewTarget() {
		return (Permission) newEnd;
	}
}
