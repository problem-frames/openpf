package uk.ac.open.argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import uk.ac.open.argument.argument.diagram.edit.commands.ArgumentOriginCreateCommand;
import uk.ac.open.argument.argument.diagram.edit.commands.ArgumentOriginReorientCommand;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentOriginEditPart;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class MitigatesItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MitigatesItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Mitigates_4002);
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
		if (ArgumentElementTypes.MitigatesRebuttal_4003 == req.getElementType()) {
			return getGEFWrapper(new ArgumentOriginCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ArgumentElementTypes.MitigatesRebuttal_4003 == req.getElementType()) {
			return null;
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
		case ArgumentOriginEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentOriginReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
