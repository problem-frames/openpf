/*
 * 
 */
package eu.securechange.situation.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import eu.securechange.situation.Relationship;
import eu.securechange.situation.Situation;
import eu.securechange.situation.Thing;
import eu.securechange.situation.diagram.edit.policies.SituationBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RelationshipReorientCommand extends EditElementCommand {

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
	public RelationshipReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Relationship) {
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
		if (!(oldEnd instanceof Thing && newEnd instanceof Thing)) {
			return false;
		}
		Thing target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof Situation)) {
			return false;
		}
		Situation container = (Situation) getLink().eContainer();
		return SituationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelationship_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Thing && newEnd instanceof Thing)) {
			return false;
		}
		Thing source = getLink().getSource();
		if (!(getLink().eContainer() instanceof Situation)) {
			return false;
		}
		Situation container = (Situation) getLink().eContainer();
		return SituationBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRelationship_4001(container, getLink(), source,
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
	protected Relationship getLink() {
		return (Relationship) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected Thing getOldSource() {
		return (Thing) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Thing getNewSource() {
		return (Thing) newEnd;
	}

	/**
	 * @generated
	 */
	protected Thing getOldTarget() {
		return (Thing) oldEnd;
	}

	/**
	 * @generated
	 */
	protected Thing getNewTarget() {
		return (Thing) newEnd;
	}
}
