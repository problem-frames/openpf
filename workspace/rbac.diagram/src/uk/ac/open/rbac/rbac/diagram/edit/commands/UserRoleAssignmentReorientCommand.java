package uk.ac.open.rbac.rbac.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.open.rbac.rbac.Model;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.User;
import uk.ac.open.rbac.rbac.UserRoleAssignment;
import uk.ac.open.rbac.rbac.diagram.edit.policies.RBACBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class UserRoleAssignmentReorientCommand extends EditElementCommand {

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
	public UserRoleAssignmentReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof UserRoleAssignment) {
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
		if (!(oldEnd instanceof User && newEnd instanceof User)) {
			return false;
		}
		Role target = getLink().getRole();
		if (!(getLink().eContainer() instanceof Model)) {
			return false;
		}
		Model container = (Model) getLink().eContainer();
		return RBACBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistUserRoleAssignment_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Role && newEnd instanceof Role)) {
			return false;
		}
		User source = getLink().getUser();
		if (!(getLink().eContainer() instanceof Model)) {
			return false;
		}
		Model container = (Model) getLink().eContainer();
		return RBACBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistUserRoleAssignment_4001(container, getLink(), source,
						getNewTarget());
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
		getLink().setUser(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setRole(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected UserRoleAssignment getLink() {
		return (UserRoleAssignment) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected User getOldSource() {
		return (User) oldEnd;
	}

	/**
	 * @generated
	 */
	protected User getNewSource() {
		return (User) newEnd;
	}

	/**
	 * @generated
	 */
	protected Role getOldTarget() {
		return (Role) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Role getNewTarget() {
		return (Role) newEnd;
	}
}
