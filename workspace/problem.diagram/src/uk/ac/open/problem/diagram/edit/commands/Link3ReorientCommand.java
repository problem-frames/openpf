package uk.ac.open.problem.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import uk.ac.open.problem.diagram.edit.policies.ProblemBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class Link3ReorientCommand extends EditElementCommand {

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
	public Link3ReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof uk.ac.open.problem.Link) {
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
		if (!(oldEnd instanceof uk.ac.open.problem.Node && newEnd instanceof uk.ac.open.problem.Node)) {
			return false;
		}
		uk.ac.open.problem.Node target = getLink().getTo();
		if (!(getLink().eContainer() instanceof uk.ac.open.problem.ProblemDiagram)) {
			return false;
		}
		uk.ac.open.problem.ProblemDiagram container = (uk.ac.open.problem.ProblemDiagram) getLink()
				.eContainer();
		return ProblemBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLink_4003(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof uk.ac.open.problem.Node && newEnd instanceof uk.ac.open.problem.Node)) {
			return false;
		}
		uk.ac.open.problem.Node source = getLink().getFrom();
		if (!(getLink().eContainer() instanceof uk.ac.open.problem.ProblemDiagram)) {
			return false;
		}
		uk.ac.open.problem.ProblemDiagram container = (uk.ac.open.problem.ProblemDiagram) getLink()
				.eContainer();
		return ProblemBaseItemSemanticEditPolicy.LinkConstraints
				.canExistLink_4003(container, source, getNewTarget());
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
	protected uk.ac.open.problem.Link getLink() {
		return (uk.ac.open.problem.Link) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected uk.ac.open.problem.Node getOldSource() {
		return (uk.ac.open.problem.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected uk.ac.open.problem.Node getNewSource() {
		return (uk.ac.open.problem.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected uk.ac.open.problem.Node getOldTarget() {
		return (uk.ac.open.problem.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected uk.ac.open.problem.Node getNewTarget() {
		return (uk.ac.open.problem.Node) newEnd;
	}
}
