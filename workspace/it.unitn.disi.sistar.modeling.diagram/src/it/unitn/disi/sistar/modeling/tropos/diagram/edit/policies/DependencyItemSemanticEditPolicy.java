package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Service;
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
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class DependencyItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DependencyItemSemanticEditPolicy() {
		super(TroposElementTypes.Dependency_3004);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {

		CompoundCommand command = new CompoundCommand(null);
		Dependency elementToDelete = (Dependency) req.getElementToDestroy();
		if (req.getParameter("CLEANUP") == null) {
			EObject middleGoal = elementToDelete.getSource() instanceof Service ? 
					elementToDelete.getSource()
					: elementToDelete.getTarget() instanceof Service ? 
							elementToDelete.getTarget()	: null;

			if (elementToDelete.getSource() instanceof Service
					&& elementToDelete.getSource().eContainer() instanceof Actor
					&& elementToDelete.getTarget() instanceof Actor) {
				
				// minhsang: if the delegation is De or Dp then removes the middle goal in the 
				// target actor. 
				// minhsang: we should only do this if there is no other De or Dp from the source
				// goal to target actor. To check this condition, we count the number of relations
				// between source and target, in which the dependency type is Delegation. If this number
				// is 1, go ahead with deletion of middle goal, otherwise, leave it as is.
				
				if (EDependencyType.isDelegation(elementToDelete.getDependencyType()) 
						&& coundDelegationRelations(elementToDelete.getSource(), elementToDelete.getTarget()) <= 1) {
					command.add(getGEFWrapper(new DestroyElementCommand(req)));
					Actor target = (Actor) elementToDelete.getTarget();
					List targetChild = target.eContents();
					for (Iterator iter = targetChild.iterator(); iter.hasNext();) {
						Service service = (Service) iter.next();
						if (service.getName().equals(
								((Service) middleGoal).getName())) {
							DiagramEditPart diagramEP = (DiagramEditPart) getHost()
									.getRoot().getContents();
							EditPart editPart = diagramEP.findEditPart(null,
									service);
							DestroyElementRequest deleteContainerGoalRequest = new DestroyElementRequest(
									service, false);
							Map map = new HashMap();
							map.put("CLEANUP", "true");
							deleteContainerGoalRequest.addParameters(map);
							command.add(editPart
									.getCommand(new EditCommandRequestWrapper(
											deleteContainerGoalRequest)));
						}
					}
					return command;
				} else {
					command.add(getGEFWrapper(new DestroyElementCommand(req)));
					return command;
				}
			}
			EditPart editPart = (EditPart) (elementToDelete.getSource() instanceof Service ? ((DependencyEditPart) getHost())
					.getSource()
					: elementToDelete.getTarget() instanceof Service ? ((DependencyEditPart) getHost())
							.getTarget()
							: null);
			if (editPart instanceof ServiceEditPart) {
				DestroyElementRequest deleteOtherLink = new DestroyElementRequest(
						middleGoal, false);
				command.add(editPart.getCommand(new EditCommandRequestWrapper(
						deleteOtherLink)));
			} else
				command.add(getGEFWrapper(new DestroyElementCommand(req)));
		} else {
			command.add(getGEFWrapper(new DestroyElementCommand(req)));
		}
		return command;
	}

	//minhsang: This function support the deletion of delegation dependency.
	// It returns the number of delegation dependency between source and target.
	private int coundDelegationRelations(GraphicalObject source,
			GraphicalObject target) {
		if (source == null || target == null)
			return -1; // source and target should not be null
		// retrieve the Diagram object
		EObject diagramObj = target.eContainer();
		while (!(diagramObj instanceof Diagram))
			diagramObj = diagramObj.eContainer();
		int result = 0;
		for (Object obj: ((Diagram) diagramObj).getObject())
			if (obj instanceof Dependency) {
				Dependency dep = (Dependency) obj;
				if	(dep.getSource() == source && dep.getTarget() == target && EDependencyType.isDelegation(dep.getDependencyType())) 
				result++;
			}
		return result;
	}
	

	/**
	 * @generated
	 */
	@Override
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
	@Override
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
