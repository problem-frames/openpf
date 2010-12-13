package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
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
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CompositionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.MeansEndEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.OwnershipEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServiceItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ServiceItemSemanticEditPolicy() {
		super(TroposElementTypes.Service_2001);
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand compoundCommand = new CompoundCommand(null);

		List deletedServicesList = (List) req.getParameter("LIST");
		if (deletedServicesList == null)
			deletedServicesList = new ArrayList();
		Service goalToDestroy = (Service) req.getElementToDestroy();
		DiagramEditPart diagramEditPart = (DiagramEditPart) getHost().getRoot()
				.getChildren().get(0);
		ServiceEditPart editPart = (ServiceEditPart) diagramEditPart
				.findEditPart(null, goalToDestroy);

		List sourceConnections = editPart.getSourceConnections();
		List targetConnections = editPart.getTargetConnections();

		//	for backward link
		if (goalToDestroy.eContainer() instanceof Actor
				&& req.getParameter("CLEANUP") == null) {
			Actor containingActor = (Actor) goalToDestroy.eContainer();
			ActorEditPart actorEditPart = (ActorEditPart) diagramEditPart
					.findEditPart(null, containingActor);
			List actorSourceConnections = actorEditPart.getTargetConnections();
			for (Iterator iter = actorSourceConnections.iterator(); iter
					.hasNext();) {
				ConnectionNodeEditPart connectionNode = (ConnectionNodeEditPart) iter
						.next();
				if (connectionNode instanceof DependencyEditPart
						&& connectionNode.getSource() instanceof ServiceEditPart) {
					EDependencyType dependencyType = ((Dependency) ((Edge) connectionNode
							.getModel()).getElement()).getDependencyType();
					if (EDependencyType.isDelegation(dependencyType)) {
						Service relatedGoal = (Service) ((ServiceEditPart) connectionNode
								.getSource()).getPrimaryView().getElement();
						if (connectionNode instanceof DependencyEditPart
								&& relatedGoal.getName().equals(
										goalToDestroy.getName())) {
							DestroyElementRequest request = new DestroyElementRequest(
									connectionNode.getPrimaryView()
											.getElement(), false);
							compoundCommand.add(connectionNode
									.getCommand(new EditCommandRequestWrapper(
											request)));
							/*
							 DestroyElementRequest request = new DestroyElementRequest(relatedGoal, false);
							 Map map = new HashMap();
							 map.put("CLEANUP", "true");
							 request.addParameters(map);
							 
							 compoundCommand.add(((ServiceEditPart)connectionNode.getSource()).getCommand(new EditCommandRequestWrapper(request)));
							 return compoundCommand;*/
						}
					}
				}
			}
		}

		//deleting related goal
		for (Iterator iter = sourceConnections.iterator(); iter.hasNext();) {
			ConnectionEditPart connection = (ConnectionEditPart) iter.next();
			if (connection instanceof DependencyEditPart
					&& connection.getTarget() instanceof ActorEditPart) {
				if (EDependencyType
						.isDelegation(((Dependency) (((Edge) connection
								.getModel()).getElement())).getDependencyType())) {
					Actor actor = (Actor) ((ActorEditPart) connection
							.getTarget()).getPrimaryView().getElement();
					List services = actor.getServices();
					for (Iterator iterator = services.iterator(); iterator
							.hasNext();) {
						Service element = (Service) iterator.next();
						if (element.getName().equals(goalToDestroy.getName())) {
							DestroyElementRequest request = new DestroyElementRequest(
									element, false);
							ServiceEditPart relatedElementEditPart = (ServiceEditPart) diagramEditPart
									.findEditPart(null, element);

							if (relatedElementEditPart != null
									&& !deletedServicesList.contains(element)) {
								deletedServicesList.add(element);
								Map map = new HashMap();
								map.put("CLEANUP", "true");

								map.put("LIST", deletedServicesList);
								request.addParameters(map);
								Command nextCommand = relatedElementEditPart
										.getCommand(new EditCommandRequestWrapper(
												request));

								compoundCommand.add(nextCommand);
							}
						}
					}
				}
			}
		}
		Map map = new HashMap();
		map.put("CLEANUP", "true");
		for (Iterator iter = sourceConnections.iterator(); iter.hasNext();) {
			ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iter
					.next();
			DestroyElementRequest request = new DestroyElementRequest(
					connectionEditPart.getPrimaryView().getElement(), false);
			request.addParameters(map);
			compoundCommand.add(connectionEditPart
					.getCommand(new EditCommandRequestWrapper(request, map)));
		}
		for (Iterator iter = targetConnections.iterator(); iter.hasNext();) {
			ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iter
					.next();
			DestroyElementRequest request = new DestroyElementRequest(
					connectionEditPart.getPrimaryView().getElement(), false);
			request.addParameters(map);
			compoundCommand.add(connectionEditPart
					.getCommand(new EditCommandRequestWrapper(request, map)));
		}

		Command c = getGEFWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
		compoundCommand.add(c);

		return compoundCommand;
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
