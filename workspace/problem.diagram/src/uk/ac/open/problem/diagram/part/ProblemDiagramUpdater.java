package uk.ac.open.problem.diagram.part;

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

import uk.ac.open.problem.Link;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node7EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class ProblemDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ProblemNodeDescriptor> getSemanticChildren(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case ProblemDiagramEditPart.VISUAL_ID:
			return getProblemDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemNodeDescriptor> getProblemDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ProblemDiagram modelElement = (ProblemDiagram) view.getElement();
		LinkedList<ProblemNodeDescriptor> result = new LinkedList<ProblemNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = ProblemVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node2EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node3EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node4EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node5EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node6EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Node7EditPart.VISUAL_ID) {
				result.add(new ProblemNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getContainedLinks(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case ProblemDiagramEditPart.VISUAL_ID:
			return getProblemDiagram_1000ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2002ContainedLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_2003ContainedLinks(view);
		case Node4EditPart.VISUAL_ID:
			return getNode_2004ContainedLinks(view);
		case Node5EditPart.VISUAL_ID:
			return getNode_2005ContainedLinks(view);
		case Node6EditPart.VISUAL_ID:
			return getNode_2006ContainedLinks(view);
		case Node7EditPart.VISUAL_ID:
			return getNode_2007ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002ContainedLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getIncomingLinks(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2002IncomingLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_2003IncomingLinks(view);
		case Node4EditPart.VISUAL_ID:
			return getNode_2004IncomingLinks(view);
		case Node5EditPart.VISUAL_ID:
			return getNode_2005IncomingLinks(view);
		case Node6EditPart.VISUAL_ID:
			return getNode_2006IncomingLinks(view);
		case Node7EditPart.VISUAL_ID:
			return getNode_2007IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002IncomingLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getOutgoingLinks(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case Node2EditPart.VISUAL_ID:
			return getNode_2002OutgoingLinks(view);
		case Node3EditPart.VISUAL_ID:
			return getNode_2003OutgoingLinks(view);
		case Node4EditPart.VISUAL_ID:
			return getNode_2004OutgoingLinks(view);
		case Node5EditPart.VISUAL_ID:
			return getNode_2005OutgoingLinks(view);
		case Node6EditPart.VISUAL_ID:
			return getNode_2006OutgoingLinks(view);
		case Node7EditPart.VISUAL_ID:
			return getNode_2007OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002OutgoingLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getProblemDiagram_1000ContainedLinks(
			View view) {
		ProblemDiagram modelElement = (ProblemDiagram) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2002IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2003IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2004IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2005IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2006IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2007IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4002(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Link_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2002OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2003OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2004OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2005OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2006OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getNode_2007OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ProblemLinkDescriptor> getLink_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			ProblemDiagram container) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getContainedTypeModelFacetLinks_Link_4002(
			ProblemDiagram container) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4002, Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getContainedTypeModelFacetLinks_Link_4003(
			ProblemDiagram container) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4002(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4002, Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4003(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof Link) {
				continue;
			}
			Link link = (Link) setting.getEObject();
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(
			Node source) {
		ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ProblemDiagram) {
				container = (ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4002(
			Node source) {
		ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ProblemDiagram) {
				container = (ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4002, Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ProblemLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4003(
			Node source) {
		ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ProblemDiagram) {
				container = (ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ProblemLinkDescriptor> result = new LinkedList<ProblemLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

}
