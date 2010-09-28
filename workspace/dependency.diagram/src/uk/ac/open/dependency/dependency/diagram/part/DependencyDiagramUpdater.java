package uk.ac.open.dependency.dependency.diagram.part;

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

import uk.ac.open.dependency.dependency.Coupling;
import uk.ac.open.dependency.dependency.DependencyPackage;
import uk.ac.open.dependency.dependency.Model;
import uk.ac.open.dependency.dependency.Node;
import uk.ac.open.dependency.dependency.Precedence;
import uk.ac.open.dependency.dependency.diagram.edit.parts.CouplingEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.ModelEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.PrecedenceEditPart;
import uk.ac.open.dependency.dependency.diagram.providers.DependencyElementTypes;

/**
 * @generated
 */
public class DependencyDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<DependencyNodeDescriptor> getSemanticChildren(View view) {
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<DependencyNodeDescriptor> result = new LinkedList<DependencyNodeDescriptor>();
		for (Iterator<?> it = modelElement.getNodes().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = DependencyVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == NodeEditPart.VISUAL_ID) {
				result.add(new DependencyNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getContainedLinks(View view) {
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case NodeEditPart.VISUAL_ID:
			return getNode_2001ContainedLinks(view);
		case CouplingEditPart.VISUAL_ID:
			return getCoupling_4001ContainedLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getIncomingLinks(View view) {
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001IncomingLinks(view);
		case CouplingEditPart.VISUAL_ID:
			return getCoupling_4001IncomingLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getOutgoingLinks(View view) {
		switch (DependencyVisualIDRegistry.getVisualID(view)) {
		case NodeEditPart.VISUAL_ID:
			return getNode_2001OutgoingLinks(view);
		case CouplingEditPart.VISUAL_ID:
			return getCoupling_4001OutgoingLinks(view);
		case PrecedenceEditPart.VISUAL_ID:
			return getPrecedence_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getModel_1000ContainedLinks(
			View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Coupling_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Precedence_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getCoupling_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getPrecedence_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getNode_2001IncomingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Coupling_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Precedence_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getCoupling_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getPrecedence_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getNode_2001OutgoingLinks(
			View view) {
		Node modelElement = (Node) view.getElement();
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Coupling_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Precedence_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getCoupling_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<DependencyLinkDescriptor> getPrecedence_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getContainedTypeModelFacetLinks_Coupling_4001(
			Model container) {
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Coupling) {
				continue;
			}
			Coupling link = (Coupling) linkObject;
			if (CouplingEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			result.add(new DependencyLinkDescriptor(src, dst, link,
					DependencyElementTypes.Coupling_4001,
					CouplingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getContainedTypeModelFacetLinks_Precedence_4002(
			Model container) {
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) linkObject;
			if (PrecedenceEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			result.add(new DependencyLinkDescriptor(src, dst, link,
					DependencyElementTypes.Precedence_4002,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getIncomingTypeModelFacetLinks_Coupling_4001(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DependencyPackage.eINSTANCE
					.getDependency_To()
					|| false == setting.getEObject() instanceof Coupling) {
				continue;
			}
			Coupling link = (Coupling) setting.getEObject();
			if (CouplingEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getFrom();
			result.add(new DependencyLinkDescriptor(src, target, link,
					DependencyElementTypes.Coupling_4001,
					CouplingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getIncomingTypeModelFacetLinks_Precedence_4002(
			Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != DependencyPackage.eINSTANCE
					.getDependency_To()
					|| false == setting.getEObject() instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) setting.getEObject();
			if (PrecedenceEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getFrom();
			result.add(new DependencyLinkDescriptor(src, target, link,
					DependencyElementTypes.Precedence_4002,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getOutgoingTypeModelFacetLinks_Coupling_4001(
			Node source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Coupling) {
				continue;
			}
			Coupling link = (Coupling) linkObject;
			if (CouplingEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new DependencyLinkDescriptor(src, dst, link,
					DependencyElementTypes.Coupling_4001,
					CouplingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<DependencyLinkDescriptor> getOutgoingTypeModelFacetLinks_Precedence_4002(
			Node source) {
		Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Model) {
				container = (Model) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<DependencyLinkDescriptor> result = new LinkedList<DependencyLinkDescriptor>();
		for (Iterator<?> links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Precedence) {
				continue;
			}
			Precedence link = (Precedence) linkObject;
			if (PrecedenceEditPart.VISUAL_ID != DependencyVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTo();
			Node src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new DependencyLinkDescriptor(src, dst, link,
					DependencyElementTypes.Precedence_4002,
					PrecedenceEditPart.VISUAL_ID));
		}
		return result;
	}

}
