package uk.ac.open.rbac.rbac.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.open.rbac.rbac.Session;
import uk.ac.open.rbac.rbac.UserRoleAssignment;
import uk.ac.open.rbac.rbac.diagram.edit.policies.RBACBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RolePermissionsReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject referenceOwner;

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
	public RolePermissionsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == referenceOwner instanceof Session) {
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
		if (!(oldEnd instanceof UserRoleAssignment && newEnd instanceof Session)) {
			return false;
		}
		return RBACBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSessionAssignments_4003(getNewSource(), getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof UserRoleAssignment && newEnd instanceof UserRoleAssignment)) {
			return false;
		}
		return RBACBaseItemSemanticEditPolicy
				.getLinkConstraints()
				.canExistSessionAssignments_4003(getOldSource(), getNewTarget());
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
		getOldSource().getAssignments().remove(getOldTarget());
		getNewSource().getAssignments().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getAssignments().remove(getOldTarget());
		getOldSource().getAssignments().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected Session getOldSource() {
		return (Session) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected Session getNewSource() {
		return (Session) newEnd;
	}

	/**
	 * @generated
	 */
	protected UserRoleAssignment getOldTarget() {
		return (UserRoleAssignment) oldEnd;
	}

	/**
	 * @generated
	 */
	protected UserRoleAssignment getNewTarget() {
		return (UserRoleAssignment) newEnd;
	}
}
