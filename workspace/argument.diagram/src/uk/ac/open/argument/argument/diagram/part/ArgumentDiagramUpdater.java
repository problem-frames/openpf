package uk.ac.open.argument.argument.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.Link;
import uk.ac.open.argument.argument.Node;
import uk.ac.open.argument.argument.SplitCommas;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.LinkEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.NodeEditPart;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getSemanticChildren(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getArgumentDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<ArgumentNodeDescriptor> result = new LinkedList<ArgumentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = ArgumentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getContainedLinks(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			return getArgumentDiagram_1000ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getIncomingLinks(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgumentDiagram_1000ContainedLinks(
			View view) {
		ArgumentDiagram modelElement = (ArgumentDiagram) view.getElement();
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			ArgumentDiagram container) {
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SplitCommas dst = link.getToNode1();
			Node src = link.getAfrom();
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(
			Node source) {
		ArgumentDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ArgumentDiagram) {
				container = (ArgumentDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Link) {
				continue;
			}
			Link link = (Link) linkObject;
			if (LinkEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SplitCommas dst = link.getToNode1();
			Node src = link.getAfrom();
			if (src != source) {
				continue;
			}
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Link_4001, LinkEditPart.VISUAL_ID));
		}
		return result;
	}

}
