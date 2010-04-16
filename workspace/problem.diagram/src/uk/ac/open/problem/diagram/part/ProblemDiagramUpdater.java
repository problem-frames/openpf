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

import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
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
	public static List getSemanticChildren(View view) {
		switch (ProblemVisualIDRegistry.getVisualID(view)) {
		case ProblemDiagramEditPart.VISUAL_ID:
			return getProblemDiagram_1000SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProblemDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		uk.ac.open.problem.ProblemDiagram modelElement = (uk.ac.open.problem.ProblemDiagram) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getNodes().iterator(); it.hasNext();) {
			uk.ac.open.problem.Node childElement = (uk.ac.open.problem.Node) it
					.next();
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
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
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
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002ContainedLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
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
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002IncomingLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
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
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		case Link2EditPart.VISUAL_ID:
			return getLink_4002OutgoingLinks(view);
		case Link3EditPart.VISUAL_ID:
			return getLink_4003OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getProblemDiagram_1000ContainedLinks(View view) {
		uk.ac.open.problem.ProblemDiagram modelElement = (uk.ac.open.problem.ProblemDiagram) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2001IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getNode_2002IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getNode_2003IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getNode_2004IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getNode_2005IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getNode_2006IncomingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
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
	public static List getLink_4001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getNode_2001OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2002OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2003OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2004OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2005OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getNode_2006OutgoingLinks(View view) {
		uk.ac.open.problem.Node modelElement = (uk.ac.open.problem.Node) view
				.getElement();
		List result = new LinkedList();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getLink_4001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getLink_4003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Link_4001(
			uk.ac.open.problem.ProblemDiagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Link_4002(
			uk.ac.open.problem.ProblemDiagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4002, Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Link_4003(
			uk.ac.open.problem.ProblemDiagram container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Link_4001(
			uk.ac.open.problem.Node target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != uk.ac.open.problem.ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) setting
					.getEObject();
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Link_4002(
			uk.ac.open.problem.Node target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != uk.ac.open.problem.ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) setting
					.getEObject();
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4002, Link2EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Link_4003(
			uk.ac.open.problem.Node target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != uk.ac.open.problem.ProblemPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) setting
					.getEObject();
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node src = link.getFrom();
			result.add(new ProblemLinkDescriptor(src, target, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Link_4001(
			uk.ac.open.problem.Node source) {
		uk.ac.open.problem.ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof uk.ac.open.problem.ProblemDiagram) {
				container = (uk.ac.open.problem.ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
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
	private static Collection getOutgoingTypeModelFacetLinks_Link_4002(
			uk.ac.open.problem.Node source) {
		uk.ac.open.problem.ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof uk.ac.open.problem.ProblemDiagram) {
				container = (uk.ac.open.problem.ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (Link2EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
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
	private static Collection getOutgoingTypeModelFacetLinks_Link_4003(
			uk.ac.open.problem.Node source) {
		uk.ac.open.problem.ProblemDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof uk.ac.open.problem.ProblemDiagram) {
				container = (uk.ac.open.problem.ProblemDiagram) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof uk.ac.open.problem.Link) {
				continue;
			}
			uk.ac.open.problem.Link link = (uk.ac.open.problem.Link) linkObject;
			if (Link3EditPart.VISUAL_ID != ProblemVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			uk.ac.open.problem.Node dst = link.getTo();
			uk.ac.open.problem.Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ProblemLinkDescriptor(src, dst, link,
					ProblemElementTypes.Link_4003, Link3EditPart.VISUAL_ID));
		}
		return result;
	}

}
