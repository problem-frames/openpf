/*
 * 
 */
package eu.securechange.situation.diagram.part;

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

import eu.securechange.situation.Domain;
import eu.securechange.situation.Entity;
import eu.securechange.situation.Relationship;
import eu.securechange.situation.Situation;
import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.Thing;
import eu.securechange.situation.diagram.edit.parts.DomainEditPart;
import eu.securechange.situation.diagram.edit.parts.EntityEditPart;
import eu.securechange.situation.diagram.edit.parts.RelationshipEditPart;
import eu.securechange.situation.diagram.edit.parts.SituationEditPart;
import eu.securechange.situation.diagram.providers.SituationElementTypes;

/**
 * @generated
 */
public class SituationDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<SituationNodeDescriptor> getSemanticChildren(View view) {
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case SituationEditPart.VISUAL_ID:
			return getSituation_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationNodeDescriptor> getSituation_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Situation modelElement = (Situation) view.getElement();
		LinkedList<SituationNodeDescriptor> result = new LinkedList<SituationNodeDescriptor>();
		for (Iterator<?> it = modelElement.getThings().iterator(); it.hasNext();) {
			Thing childElement = (Thing) it.next();
			int visualID = SituationVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EntityEditPart.VISUAL_ID) {
				result.add(new SituationNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DomainEditPart.VISUAL_ID) {
				result.add(new SituationNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getContainedLinks(View view) {
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case SituationEditPart.VISUAL_ID:
			return getSituation_1000ContainedLinks(view);
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001ContainedLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002ContainedLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getIncomingLinks(View view) {
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001IncomingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002IncomingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getOutgoingLinks(View view) {
		switch (SituationVisualIDRegistry.getVisualID(view)) {
		case EntityEditPart.VISUAL_ID:
			return getEntity_2001OutgoingLinks(view);
		case DomainEditPart.VISUAL_ID:
			return getDomain_2002OutgoingLinks(view);
		case RelationshipEditPart.VISUAL_ID:
			return getRelationship_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getSituation_1000ContainedLinks(
			View view) {
		Situation modelElement = (Situation) view.getElement();
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getEntity_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getDomain_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getRelationship_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getEntity_2001IncomingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getDomain_2002IncomingLinks(
			View view) {
		Domain modelElement = (Domain) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getRelationship_4001IncomingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Relationship_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getEntity_2001OutgoingLinks(
			View view) {
		Entity modelElement = (Entity) view.getElement();
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getDomain_2002OutgoingLinks(
			View view) {
		Domain modelElement = (Domain) view.getElement();
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SituationLinkDescriptor> getRelationship_4001OutgoingLinks(
			View view) {
		Relationship modelElement = (Relationship) view.getElement();
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Relationship_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SituationLinkDescriptor> getContainedTypeModelFacetLinks_Relationship_4001(
			Situation container) {
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		for (Iterator<?> links = container.getThings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != SituationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Thing dst = link.getTarget();
			Thing src = link.getSource();
			result.add(new SituationLinkDescriptor(src, dst, link,
					SituationElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SituationLinkDescriptor> getIncomingTypeModelFacetLinks_Relationship_4001(
			Thing target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != SituationPackage.eINSTANCE
					.getRelationship_Target()
					|| false == setting.getEObject() instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) setting.getEObject();
			if (RelationshipEditPart.VISUAL_ID != SituationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Thing src = link.getSource();
			result.add(new SituationLinkDescriptor(src, target, link,
					SituationElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SituationLinkDescriptor> getOutgoingTypeModelFacetLinks_Relationship_4001(
			Thing source) {
		Situation container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Situation) {
				container = (Situation) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<SituationLinkDescriptor> result = new LinkedList<SituationLinkDescriptor>();
		for (Iterator<?> links = container.getThings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Relationship) {
				continue;
			}
			Relationship link = (Relationship) linkObject;
			if (RelationshipEditPart.VISUAL_ID != SituationVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Thing dst = link.getTarget();
			Thing src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new SituationLinkDescriptor(src, dst, link,
					SituationElementTypes.Relationship_4001,
					RelationshipEditPart.VISUAL_ID));
		}
		return result;
	}

}
