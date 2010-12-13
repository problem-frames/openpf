package it.unitn.disi.sistar.modeling.tropos.diagram.part;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorActorCompartmentEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.AssociationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CompositionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.MeansEndEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.OwnershipEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TroposDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case ActorActorCompartmentEditPart.VISUAL_ID:
			return getActorActorCompartment_5001SemanticChildren(view);
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActorActorCompartment_5001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Actor modelElement = (Actor) containerView.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getServices().iterator(); it.hasNext();) {
			Service childElement = (Service) it.next();
			int visualID = TroposVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ServiceEditPart.VISUAL_ID) {
				result.add(new TroposNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getObject().iterator(); it.hasNext();) {
			GraphicalObject childElement = (GraphicalObject) it.next();
			int visualID = TroposVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ActorEditPart.VISUAL_ID) {
				result.add(new TroposNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Service2EditPart.VISUAL_ID) {
				result.add(new TroposNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_79ContainedLinks(view);
		case ActorEditPart.VISUAL_ID:
			return getActor_1001ContainedLinks(view);
		case Service2EditPart.VISUAL_ID:
			return getService_1002ContainedLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001ContainedLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3001ContainedLinks(view);
		case ContributionEditPart.VISUAL_ID:
			return getContribution_3002ContainedLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_3003ContainedLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3004ContainedLinks(view);
		case OwnershipEditPart.VISUAL_ID:
			return getOwnership_3005ContainedLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_3006ContainedLinks(view);
		case CustomRelationEditPart.VISUAL_ID:
			return getCustomRelation_3007ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_1001IncomingLinks(view);
		case Service2EditPart.VISUAL_ID:
			return getService_1002IncomingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001IncomingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3001IncomingLinks(view);
		case ContributionEditPart.VISUAL_ID:
			return getContribution_3002IncomingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_3003IncomingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3004IncomingLinks(view);
		case OwnershipEditPart.VISUAL_ID:
			return getOwnership_3005IncomingLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_3006IncomingLinks(view);
		case CustomRelationEditPart.VISUAL_ID:
			return getCustomRelation_3007IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (TroposVisualIDRegistry.getVisualID(view)) {
		case ActorEditPart.VISUAL_ID:
			return getActor_1001OutgoingLinks(view);
		case Service2EditPart.VISUAL_ID:
			return getService_1002OutgoingLinks(view);
		case ServiceEditPart.VISUAL_ID:
			return getService_2001OutgoingLinks(view);
		case AssociationEditPart.VISUAL_ID:
			return getAssociation_3001OutgoingLinks(view);
		case ContributionEditPart.VISUAL_ID:
			return getContribution_3002OutgoingLinks(view);
		case CompositionEditPart.VISUAL_ID:
			return getComposition_3003OutgoingLinks(view);
		case DependencyEditPart.VISUAL_ID:
			return getDependency_3004OutgoingLinks(view);
		case OwnershipEditPart.VISUAL_ID:
			return getOwnership_3005OutgoingLinks(view);
		case MeansEndEditPart.VISUAL_ID:
			return getMeansEnd_3006OutgoingLinks(view);
		case CustomRelationEditPart.VISUAL_ID:
			return getCustomRelation_3007OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDiagram_79ContainedLinks(View view) {
		Diagram modelElement = (Diagram) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getService_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getService_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getContribution_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getComposition_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOwnership_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMeansEnd_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCustomRelation_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001IncomingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_1002IncomingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_2001IncomingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3001IncomingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContribution_3002IncomingLinks(View view) {
		Contribution modelElement = (Contribution) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComposition_3003IncomingLinks(View view) {
		Composition modelElement = (Composition) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3004IncomingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwnership_3005IncomingLinks(View view) {
		Ownership modelElement = (Ownership) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMeansEnd_3006IncomingLinks(View view) {
		MeansEnd modelElement = (MeansEnd) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomRelation_3007IncomingLinks(View view) {
		CustomRelation modelElement = (CustomRelation) view.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Association_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Contribution_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Composition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Ownership_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MeansEnd_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CustomRelation_3007(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001OutgoingLinks(View view) {
		Actor modelElement = (Actor) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_1002OutgoingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getService_2001OutgoingLinks(View view) {
		Service modelElement = (Service) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAssociation_3001OutgoingLinks(View view) {
		Association modelElement = (Association) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContribution_3002OutgoingLinks(View view) {
		Contribution modelElement = (Contribution) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getComposition_3003OutgoingLinks(View view) {
		Composition modelElement = (Composition) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3004OutgoingLinks(View view) {
		Dependency modelElement = (Dependency) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getOwnership_3005OutgoingLinks(View view) {
		Ownership modelElement = (Ownership) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getMeansEnd_3006OutgoingLinks(View view) {
		MeansEnd modelElement = (MeansEnd) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getCustomRelation_3007OutgoingLinks(View view) {
		CustomRelation modelElement = (CustomRelation) view.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Association_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Contribution_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Composition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_Ownership_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MeansEnd_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CustomRelation_3007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Association_3001(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Association_3001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Contribution_3002(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Contribution) {
				continue;
			}
			Contribution link = (Contribution) linkObject;
			if (ContributionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Contribution_3002,
					ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Composition_3003(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Composition_3003,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_3004(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Dependency_3004,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Ownership_3005(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Ownership) {
				continue;
			}
			Ownership link = (Ownership) linkObject;
			if (OwnershipEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Ownership_3005,
					OwnershipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MeansEnd_3006(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) linkObject;
			if (MeansEndEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.MeansEnd_3006,
					MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_CustomRelation_3007(
			Diagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CustomRelation) {
				continue;
			}
			CustomRelation link = (CustomRelation) linkObject;
			if (CustomRelationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.CustomRelation_3007,
					CustomRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Association_3001(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof Association) {
				continue;
			}
			Association link = (Association) setting.getEObject();
			if (AssociationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.Association_3001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Contribution_3002(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof Contribution) {
				continue;
			}
			Contribution link = (Contribution) setting.getEObject();
			if (ContributionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.Contribution_3002,
					ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Composition_3003(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof Composition) {
				continue;
			}
			Composition link = (Composition) setting.getEObject();
			if (CompositionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.Composition_3003,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_3004(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) setting.getEObject();
			if (DependencyEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.Dependency_3004,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Ownership_3005(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof Ownership) {
				continue;
			}
			Ownership link = (Ownership) setting.getEObject();
			if (OwnershipEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.Ownership_3005,
					OwnershipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MeansEnd_3006(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) setting.getEObject();
			if (MeansEndEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.MeansEnd_3006,
					MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_CustomRelation_3007(
			GraphicalObject target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != TroposPackage.eINSTANCE
					.getRelation_Target()
					|| false == setting.getEObject() instanceof CustomRelation) {
				continue;
			}
			CustomRelation link = (CustomRelation) setting.getEObject();
			if (CustomRelationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject src = link.getSource();
			result.add(new TroposLinkDescriptor(src, target, link,
					TroposElementTypes.CustomRelation_3007,
					CustomRelationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Association_3001(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Association) {
				continue;
			}
			Association link = (Association) linkObject;
			if (AssociationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Association_3001,
					AssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Contribution_3002(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Contribution) {
				continue;
			}
			Contribution link = (Contribution) linkObject;
			if (ContributionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Contribution_3002,
					ContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Composition_3003(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Composition) {
				continue;
			}
			Composition link = (Composition) linkObject;
			if (CompositionEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Composition_3003,
					CompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_3004(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Dependency) {
				continue;
			}
			Dependency link = (Dependency) linkObject;
			if (DependencyEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Dependency_3004,
					DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Ownership_3005(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Ownership) {
				continue;
			}
			Ownership link = (Ownership) linkObject;
			if (OwnershipEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.Ownership_3005,
					OwnershipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MeansEnd_3006(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MeansEnd) {
				continue;
			}
			MeansEnd link = (MeansEnd) linkObject;
			if (MeansEndEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.MeansEnd_3006,
					MeansEndEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_CustomRelation_3007(
			GraphicalObject source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getObject().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof CustomRelation) {
				continue;
			}
			CustomRelation link = (CustomRelation) linkObject;
			if (CustomRelationEditPart.VISUAL_ID != TroposVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			GraphicalObject dst = link.getTarget();
			GraphicalObject src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new TroposLinkDescriptor(src, dst, link,
					TroposElementTypes.CustomRelation_3007,
					CustomRelationEditPart.VISUAL_ID));
		}
		return result;
	}

}
