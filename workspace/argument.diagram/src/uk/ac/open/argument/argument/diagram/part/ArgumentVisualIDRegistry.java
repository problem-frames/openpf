package uk.ac.open.argument.argument.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartment2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartmentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartment2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartmentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDescriptionRound2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDescriptionRoundEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameDescriptionRound2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameDescriptionRoundEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.ArgumentNameEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.Fact3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactName2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactName3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactNameDescription2EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactNameDescription3EditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactNameDescriptionEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.FactNameEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.MitigatesEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.RebutsEditPart;
import uk.ac.open.argument.argument.diagram.edit.parts.RestoresEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ArgumentVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "argument.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ArgumentDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ArgumentDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArgumentPackage.eINSTANCE.getArgumentDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ArgumentDiagram) domainElement)) {
			return ArgumentDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			if (ArgumentPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return ArgumentEditPart.VISUAL_ID;
			}
			if (ArgumentPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return FactEditPart.VISUAL_ID;
			}
			break;
		case ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID:
			if (ArgumentPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return Fact2EditPart.VISUAL_ID;
			}
			break;
		case ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID:
			if (ArgumentPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return Argument2EditPart.VISUAL_ID;
			}
			if (ArgumentPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return Fact3EditPart.VISUAL_ID;
			}
			break;
		case ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID:
			if (ArgumentPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return Fact2EditPart.VISUAL_ID;
			}
			break;
		case ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID:
			if (ArgumentPackage.eINSTANCE.getArgument().isSuperTypeOf(
					domainElement.eClass())) {
				return Argument2EditPart.VISUAL_ID;
			}
			if (ArgumentPackage.eINSTANCE.getFact().isSuperTypeOf(
					domainElement.eClass())) {
				return Fact3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry
				.getModelID(containerView);
		if (!ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ArgumentDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ArgumentDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ArgumentDiagramEditPart.VISUAL_ID:
			if (ArgumentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FactEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentEditPart.VISUAL_ID:
			if (ArgumentNameDescriptionRoundEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FactEditPart.VISUAL_ID:
			if (FactNameDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fact2EditPart.VISUAL_ID:
			if (FactNameDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Argument2EditPart.VISUAL_ID:
			if (ArgumentNameDescriptionRound2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Fact3EditPart.VISUAL_ID:
			if (FactNameDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID:
			if (Fact2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID:
			if (Argument2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fact3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID:
			if (Fact2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID:
			if (Argument2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Fact3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ArgumentPackage.eINSTANCE.getRebuts().isSuperTypeOf(
				domainElement.eClass())) {
			return RebutsEditPart.VISUAL_ID;
		}
		if (ArgumentPackage.eINSTANCE.getMitigates().isSuperTypeOf(
				domainElement.eClass())) {
			return MitigatesEditPart.VISUAL_ID;
		}
		if (ArgumentPackage.eINSTANCE.getRestores().isSuperTypeOf(
				domainElement.eClass())) {
			return RestoresEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ArgumentDiagram element) {
		return true;
	}

}
