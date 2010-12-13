package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.element.configuration.util.TroposElementConfiguration;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
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

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ContributionItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ContributionItemSemanticEditPolicy() {
		super(TroposElementTypes.Contribution_3002);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected Command getDestroyElementCommand(DestroyElementRequest req) {

		CompoundCommand compoundCommand = new CompoundCommand(null);

		ContributionEditPart editPart = (ContributionEditPart) getHost();
		
		final Contribution rel = (Contribution) req.getElementToDestroy();
		
		//need to delete alleviation
		List targetConnections = editPart.getTargetConnections();
		for (Iterator iter = targetConnections.iterator(); iter.hasNext();) {
			ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iter
					.next();
			if (connectionEditPart.getPrimaryView().getElement() != null) {
				DestroyElementRequest request = new DestroyElementRequest(
						connectionEditPart.getPrimaryView().getElement(), false);
				compoundCommand.add(connectionEditPart
						.getCommand(new EditCommandRequestWrapper(request)));
			}
		}
		compoundCommand.add(getGEFWrapper(new DestroyElementCommand(req)));
		
		return compoundCommand;
	}

	@Override
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {

		if (TroposElementTypes.Contribution_3002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingContribution3002Command(req)
					: getCreateCompleteIncomingContribution3002Command(req);
		}
		return super.getCreateRelationshipCommand(req);
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

	/**
	 * @generated NOT
	 */
	protected Command getCreateStartOutgoingContribution3002Command(
			CreateRelationshipRequest req) {
		return new Command() {
		};
	}

	/**
	 * @generated NOT
	 */
	protected Command getCreateCompleteIncomingContribution3002Command(
			CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof GraphicalObject)) {
			return UnexecutableCommand.INSTANCE;
		}
		final Diagram element = (Diagram) getRelationshipContainer(req
				.getSource(), TroposPackage.eINSTANCE.getDiagram(), req
				.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(TroposPackage.eINSTANCE
					.getDiagram_Object());
		}
		return getGEFWrapper(new CreateIncomingContribution3002Command(req) {

			/**
			 * @generated NOT
			 */
			@Override
			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated NOT
	 */
	private static class CreateIncomingContribution3002Command extends
			CreateRelationshipCommand {

		/**
		 * @generated NOT
		 */
		public CreateIncomingContribution3002Command(
				CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated NOT
		 */
		@Override
		protected EClass getEClassToEdit() {
			return TroposPackage.eINSTANCE.getDiagram();
		};

		/**
		 * @generated NOT
		 */
		@Override
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated NOT
		 */
		@Override
		protected EObject doDefaultElementCreation() {
			Contribution newElement = (Contribution) super
					.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setTarget((GraphicalObject) getTarget());
				newElement.setSource((GraphicalObject) getSource());
			}

			return TroposElementConfiguration.configureContribution(newElement,
					getRequest());
		}
	}

}
