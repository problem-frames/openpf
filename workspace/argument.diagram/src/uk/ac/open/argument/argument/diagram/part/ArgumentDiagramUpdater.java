package uk.ac.open.argument.argument.diagram.part;

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

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Fact;
import uk.ac.open.argument.argument.Mitigates;
import uk.ac.open.argument.argument.Node;
import uk.ac.open.argument.argument.Rebuts;
import uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartment2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartmentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartment2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartmentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.MitigatesEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.RebutsEditPart;
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
		case ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID:
			return getArgumentArgumentGroundsCompartment_7001SemanticChildren(view);
		case ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID:
			return getArgumentArgumentWarrantsCompartment_7002SemanticChildren(view);
		case ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID:
			return getArgumentArgumentGroundsCompartment_7003SemanticChildren(view);
		case ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID:
			return getArgumentArgumentWarrantsCompartment_7004SemanticChildren(view);
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
			if (visualID == ArgumentEditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FactEditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getArgumentArgumentGroundsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Argument modelElement = (Argument) containerView.getElement();
		LinkedList<ArgumentNodeDescriptor> result = new LinkedList<ArgumentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGrounds().iterator(); it
				.hasNext();) {
			Fact childElement = (Fact) it.next();
			int visualID = ArgumentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Fact2EditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getArgumentArgumentWarrantsCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Argument modelElement = (Argument) containerView.getElement();
		LinkedList<ArgumentNodeDescriptor> result = new LinkedList<ArgumentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWarrants().iterator(); it
				.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = ArgumentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Argument2EditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fact3EditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getArgumentArgumentGroundsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Argument modelElement = (Argument) containerView.getElement();
		LinkedList<ArgumentNodeDescriptor> result = new LinkedList<ArgumentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getGrounds().iterator(); it
				.hasNext();) {
			Fact childElement = (Fact) it.next();
			int visualID = ArgumentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Fact2EditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentNodeDescriptor> getArgumentArgumentWarrantsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Argument modelElement = (Argument) containerView.getElement();
		LinkedList<ArgumentNodeDescriptor> result = new LinkedList<ArgumentNodeDescriptor>();
		for (Iterator<?> it = modelElement.getWarrants().iterator(); it
				.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = ArgumentVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == Argument2EditPart.VISUAL_ID) {
				result.add(new ArgumentNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == Fact3EditPart.VISUAL_ID) {
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
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001ContainedLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_2002ContainedLinks(view);
		case Fact2EditPart.VISUAL_ID:
			return getFact_3001ContainedLinks(view);
		case Argument2EditPart.VISUAL_ID:
			return getArgument_3002ContainedLinks(view);
		case Fact3EditPart.VISUAL_ID:
			return getFact_3003ContainedLinks(view);
		case RebutsEditPart.VISUAL_ID:
			return getRebuts_4001ContainedLinks(view);
		case MitigatesEditPart.VISUAL_ID:
			return getMitigates_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getIncomingLinks(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001IncomingLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_2002IncomingLinks(view);
		case Fact2EditPart.VISUAL_ID:
			return getFact_3001IncomingLinks(view);
		case Argument2EditPart.VISUAL_ID:
			return getArgument_3002IncomingLinks(view);
		case Fact3EditPart.VISUAL_ID:
			return getFact_3003IncomingLinks(view);
		case RebutsEditPart.VISUAL_ID:
			return getRebuts_4001IncomingLinks(view);
		case MitigatesEditPart.VISUAL_ID:
			return getMitigates_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getOutgoingLinks(View view) {
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {
		case ArgumentEditPart.VISUAL_ID:
			return getArgument_2001OutgoingLinks(view);
		case FactEditPart.VISUAL_ID:
			return getFact_2002OutgoingLinks(view);
		case Fact2EditPart.VISUAL_ID:
			return getFact_3001OutgoingLinks(view);
		case Argument2EditPart.VISUAL_ID:
			return getArgument_3002OutgoingLinks(view);
		case Fact3EditPart.VISUAL_ID:
			return getFact_3003OutgoingLinks(view);
		case RebutsEditPart.VISUAL_ID:
			return getRebuts_4001OutgoingLinks(view);
		case MitigatesEditPart.VISUAL_ID:
			return getMitigates_4002OutgoingLinks(view);
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
		result.addAll(getContainedTypeModelFacetLinks_Rebuts_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_Mitigates_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getRebuts_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getMitigates_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_2001IncomingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Rebuts_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mitigates_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_3002IncomingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Rebuts_4001(modelElement,
				crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Mitigates_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getRebuts_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getMitigates_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_2001OutgoingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Rebuts_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Mitigates_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getArgument_3002OutgoingLinks(
			View view) {
		Argument modelElement = (Argument) view.getElement();
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Rebuts_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_Mitigates_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getFact_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getRebuts_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ArgumentLinkDescriptor> getMitigates_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getContainedTypeModelFacetLinks_Rebuts_4001(
			ArgumentDiagram container) {
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Rebuts) {
				continue;
			}
			Rebuts link = (Rebuts) linkObject;
			if (RebutsEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument dst = link.getTo();
			Argument src = link.getFrom();
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Rebuts_4001, RebutsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getContainedTypeModelFacetLinks_Mitigates_4002(
			ArgumentDiagram container) {
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Mitigates) {
				continue;
			}
			Mitigates link = (Mitigates) linkObject;
			if (MitigatesEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument dst = link.getTo();
			Argument src = link.getFrom();
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Mitigates_4002,
					MitigatesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getIncomingTypeModelFacetLinks_Rebuts_4001(
			Argument target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArgumentPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof Rebuts) {
				continue;
			}
			Rebuts link = (Rebuts) setting.getEObject();
			if (RebutsEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument src = link.getFrom();
			result.add(new ArgumentLinkDescriptor(src, target, link,
					ArgumentElementTypes.Rebuts_4001, RebutsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getIncomingTypeModelFacetLinks_Mitigates_4002(
			Argument target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ArgumentLinkDescriptor> result = new LinkedList<ArgumentLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ArgumentPackage.eINSTANCE
					.getLink_To()
					|| false == setting.getEObject() instanceof Mitigates) {
				continue;
			}
			Mitigates link = (Mitigates) setting.getEObject();
			if (MitigatesEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument src = link.getFrom();
			result.add(new ArgumentLinkDescriptor(src, target, link,
					ArgumentElementTypes.Mitigates_4002,
					MitigatesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getOutgoingTypeModelFacetLinks_Rebuts_4001(
			Argument source) {
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
			if (false == linkObject instanceof Rebuts) {
				continue;
			}
			Rebuts link = (Rebuts) linkObject;
			if (RebutsEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument dst = link.getTo();
			Argument src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Rebuts_4001, RebutsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ArgumentLinkDescriptor> getOutgoingTypeModelFacetLinks_Mitigates_4002(
			Argument source) {
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
			if (false == linkObject instanceof Mitigates) {
				continue;
			}
			Mitigates link = (Mitigates) linkObject;
			if (MitigatesEditPart.VISUAL_ID != ArgumentVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Argument dst = link.getTo();
			Argument src = link.getFrom();
			if (src != source) {
				continue;
			}
			result.add(new ArgumentLinkDescriptor(src, dst, link,
					ArgumentElementTypes.Mitigates_4002,
					MitigatesEditPart.VISUAL_ID));
		}
		return result;
	}

}
