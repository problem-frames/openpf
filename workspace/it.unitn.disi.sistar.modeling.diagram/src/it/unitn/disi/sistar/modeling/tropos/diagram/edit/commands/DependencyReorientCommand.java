package it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands;

import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.TroposBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DependencyReorientCommand extends EditElementCommand {

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
	public DependencyReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Dependency) {
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
		if (!(oldEnd instanceof GraphicalObject && newEnd instanceof GraphicalObject)) {
			return false;
		}
		GraphicalObject target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Diagram)) {
			return false;
		}
		Diagram container = (Diagram) getLink().eContainer();
		return TroposBaseItemSemanticEditPolicy.LinkConstraints
				.canExistDependency_3004(container, getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof GraphicalObject && newEnd instanceof GraphicalObject)) {
			return false;
		}
		GraphicalObject source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Diagram)) {
			return false;
		}
		Diagram container = (Diagram) getLink().eContainer();
		return TroposBaseItemSemanticEditPolicy.LinkConstraints
				.canExistDependency_3004(container, source, getNewTarget());
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
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Dependency getLink() {
		return (Dependency) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected GraphicalObject getOldSource() {
		return (GraphicalObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalObject getNewSource() {
		return (GraphicalObject) newEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalObject getOldTarget() {
		return (GraphicalObject) oldEnd;
	}

	/**
	 * @generated
	 */
	protected GraphicalObject getNewTarget() {
		return (GraphicalObject) newEnd;
	}
}
