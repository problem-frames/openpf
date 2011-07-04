package argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import argument.argument.diagram.edit.commands.RebutsDeniesCreateCommand;
import argument.argument.diagram.edit.commands.RebutsDeniesReorientCommand;
import argument.argument.diagram.edit.parts.RebutsDeniesEditPart;
import argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class RebutsItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RebutsItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Rebuts_4001);
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
		if (ArgumentElementTypes.RebutsDenies_4003 == req.getElementType()) {
			return getGEFWrapper(new RebutsDeniesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ArgumentElementTypes.RebutsDenies_4003 == req.getElementType()) {
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
		case RebutsDeniesEditPart.VISUAL_ID:
			return getGEFWrapper(new RebutsDeniesReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
