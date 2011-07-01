/*
 * 
 */
package argument.argument.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import argument.argument.diagram.edit.commands.RebutsOriginCreateCommand;
import argument.argument.diagram.edit.commands.RebutsOriginReorientCommand;
import argument.argument.diagram.edit.parts.RebutsOriginEditPart;
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
		if (ArgumentElementTypes.RebutsOrigin_4003 == req.getElementType()) {
			return getGEFWrapper(new RebutsOriginCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ArgumentElementTypes.RebutsOrigin_4003 == req.getElementType()) {
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
		case RebutsOriginEditPart.VISUAL_ID:
			return getGEFWrapper(new RebutsOriginReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
