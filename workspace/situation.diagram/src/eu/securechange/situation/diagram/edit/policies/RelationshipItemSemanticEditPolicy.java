/*
 * 
 */
package eu.securechange.situation.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import eu.securechange.situation.diagram.edit.commands.RelationshipCreateCommand;
import eu.securechange.situation.diagram.edit.commands.RelationshipReorientCommand;
import eu.securechange.situation.diagram.edit.parts.RelationshipEditPart;
import eu.securechange.situation.diagram.providers.SituationElementTypes;

/**
 * @generated
 */
public class RelationshipItemSemanticEditPolicy extends
		SituationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RelationshipItemSemanticEditPolicy() {
		super(SituationElementTypes.Relationship_4001);
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
		if (SituationElementTypes.Relationship_4001 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SituationElementTypes.Relationship_4001 == req.getElementType()) {
			return getGEFWrapper(new RelationshipCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RelationshipEditPart.VISUAL_ID:
			return getGEFWrapper(new RelationshipReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
