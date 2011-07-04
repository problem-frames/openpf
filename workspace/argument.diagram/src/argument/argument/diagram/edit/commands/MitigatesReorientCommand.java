package argument.argument.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import argument.argument.Argument;
import argument.argument.ArgumentDiagram;
import argument.argument.Mitigates;
import argument.argument.diagram.edit.policies.ArgumentBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MitigatesReorientCommand extends EditElementCommand {

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
	public MitigatesReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Mitigates) {
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
		if (!(oldEnd instanceof Argument && newEnd instanceof Argument)) {
			return false;
		}
		Argument target = getLink().getTo();
		if (!(getLink().eContainer() instanceof ArgumentDiagram)) {
			return false;
		}
		ArgumentDiagram container = (ArgumentDiagram) getLink().eContainer();
		return ArgumentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMitigates_4002(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Argument && newEnd instanceof Argument)) {
			return false;
		}
		Argument source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof ArgumentDiagram)) {
			return false;
		}
		ArgumentDiagram container = (ArgumentDiagram) getLink().eContainer();
		return ArgumentBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMitigates_4002(container, getLink(), source,
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
	protected Mitigates getLink() {
		return (Mitigates) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Argument getOldSource() {
		return (Argument) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Argument getNewSource() {
		return (Argument) newEnd;
	}

	/**
	 * @generated
	 */
	protected Argument getOldTarget() {
		return (Argument) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Argument getNewTarget() {
		return (Argument) newEnd;
	}
}
