/*
 * 
 */
package argument.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import argument.argument.Argument;
import argument.argument.ArgumentDiagram;
import argument.argument.Rebuts;
import argument.diagram.edit.policies.ArgumentBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RebutsReorientCommand extends EditElementCommand {

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
	public RebutsReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof argument.argument.Rebuts) {
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
		if (!(oldEnd instanceof argument.argument.Argument && newEnd instanceof argument.argument.Argument)) {
			return false;
		}
		argument.argument.Argument target = getLink().getTo();
		if (!(getLink().eContainer() instanceof argument.argument.ArgumentDiagram)) {
			return false;
		}
		argument.argument.ArgumentDiagram container = (argument.argument.ArgumentDiagram) getLink()
				.eContainer();
		return ArgumentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRebuts_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof argument.argument.Argument && newEnd instanceof argument.argument.Argument)) {
			return false;
		}
		argument.argument.Argument source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof argument.argument.ArgumentDiagram)) {
			return false;
		}
		argument.argument.ArgumentDiagram container = (argument.argument.ArgumentDiagram) getLink()
				.eContainer();
		return ArgumentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRebuts_4001(container, getLink(), source,
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
		getLink().setFrom(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTo(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected argument.argument.Rebuts getLink() {
		return (argument.argument.Rebuts) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected argument.argument.Argument getOldSource() {
		return (argument.argument.Argument) oldEnd;
	}

	/**
	 * @generated
	 */
	protected argument.argument.Argument getNewSource() {
		return (argument.argument.Argument) newEnd;
	}

	/**
	 * @generated
	 */
	protected argument.argument.Argument getOldTarget() {
		return (argument.argument.Argument) oldEnd;
	}

	/**
	 * @generated
	 */
	protected argument.argument.Argument getNewTarget() {
		return (argument.argument.Argument) newEnd;
	}
}
