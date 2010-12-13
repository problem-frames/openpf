package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.AssociationCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.AssociationReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.CompositionCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.CompositionReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.ContributionCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.ContributionReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.CustomRelationCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.CustomRelationReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.DependencyCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.DependencyReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.MeansEndCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.MeansEndReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.OwnershipCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.OwnershipReorientCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CompositionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.MeansEndEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.OwnershipEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class CompositionItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositionItemSemanticEditPolicy() {
		super(TroposElementTypes.Composition_3003);
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
		if (TroposElementTypes.Association_3001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Contribution_3002 == req.getElementType()) {
			return getGEFWrapper(new ContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Composition_3003 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Dependency_3004 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Ownership_3005 == req.getElementType()) {
			return getGEFWrapper(new OwnershipCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.MeansEnd_3006 == req.getElementType()) {
			return getGEFWrapper(new MeansEndCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.CustomRelation_3007 == req.getElementType()) {
			return getGEFWrapper(new CustomRelationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (TroposElementTypes.Association_3001 == req.getElementType()) {
			return getGEFWrapper(new AssociationCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Contribution_3002 == req.getElementType()) {
			return getGEFWrapper(new ContributionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Composition_3003 == req.getElementType()) {
			return getGEFWrapper(new CompositionCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Dependency_3004 == req.getElementType()) {
			return getGEFWrapper(new DependencyCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.Ownership_3005 == req.getElementType()) {
			return getGEFWrapper(new OwnershipCreateCommand(req, req
					.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.MeansEnd_3006 == req.getElementType()) {
			return getGEFWrapper(new MeansEndCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (TroposElementTypes.CustomRelation_3007 == req.getElementType()) {
			return getGEFWrapper(new CustomRelationCreateCommand(req, req
					.getSource(), req.getTarget()));
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
		case AssociationEditPart.VISUAL_ID:
			return getGEFWrapper(new AssociationReorientCommand(req));
		case ContributionEditPart.VISUAL_ID:
			return getGEFWrapper(new ContributionReorientCommand(req));
		case CompositionEditPart.VISUAL_ID:
			return getGEFWrapper(new CompositionReorientCommand(req));
		case DependencyEditPart.VISUAL_ID:
			return getGEFWrapper(new DependencyReorientCommand(req));
		case OwnershipEditPart.VISUAL_ID:
			return getGEFWrapper(new OwnershipReorientCommand(req));
		case MeansEndEditPart.VISUAL_ID:
			return getGEFWrapper(new MeansEndReorientCommand(req));
		case CustomRelationEditPart.VISUAL_ID:
			return getGEFWrapper(new CustomRelationReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}
}
