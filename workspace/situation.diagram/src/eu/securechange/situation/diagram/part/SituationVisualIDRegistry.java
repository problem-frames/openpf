/*
 * 
 */
package eu.securechange.situation.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import eu.securechange.situation.Situation;
import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.diagram.edit.parts.DomainDomainPropertiesCompartmentEditPart;
import eu.securechange.situation.diagram.edit.parts.DomainEditPart;
import eu.securechange.situation.diagram.edit.parts.DomainTypeEditPart;
import eu.securechange.situation.diagram.edit.parts.Entity2EditPart;
import eu.securechange.situation.diagram.edit.parts.EntityEditPart;
import eu.securechange.situation.diagram.edit.parts.EntityName2EditPart;
import eu.securechange.situation.diagram.edit.parts.EntityNameEditPart;
import eu.securechange.situation.diagram.edit.parts.RelationshipEditPart;
import eu.securechange.situation.diagram.edit.parts.RelationshipTypeEditPart;
import eu.securechange.situation.diagram.edit.parts.SituationEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SituationVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "situation.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SituationEditPart.MODEL_ID.equals(view.getType())) {
				return SituationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return eu.securechange.situation.diagram.part.SituationVisualIDRegistry
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
				SituationDiagramEditorPlugin.getInstance().logError(
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
		if (SituationPackage.eINSTANCE.getSituation().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Situation) domainElement)) {
			return SituationEditPart.VISUAL_ID;
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
		String containerModelID = eu.securechange.situation.diagram.part.SituationVisualIDRegistry
				.getModelID(containerView);
		if (!SituationEditPart.MODEL_ID.equals(containerModelID)
				&& !"situation".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (SituationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eu.securechange.situation.diagram.part.SituationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SituationEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SituationEditPart.VISUAL_ID:
			if (SituationPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return EntityEditPart.VISUAL_ID;
			}
			if (SituationPackage.eINSTANCE.getDomain().isSuperTypeOf(
					domainElement.eClass())) {
				return DomainEditPart.VISUAL_ID;
			}
			break;
		case DomainDomainPropertiesCompartmentEditPart.VISUAL_ID:
			if (SituationPackage.eINSTANCE.getEntity().isSuperTypeOf(
					domainElement.eClass())) {
				return Entity2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = eu.securechange.situation.diagram.part.SituationVisualIDRegistry
				.getModelID(containerView);
		if (!SituationEditPart.MODEL_ID.equals(containerModelID)
				&& !"situation".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (SituationEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = eu.securechange.situation.diagram.part.SituationVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SituationEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SituationEditPart.VISUAL_ID:
			if (EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EntityEditPart.VISUAL_ID:
			if (EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainEditPart.VISUAL_ID:
			if (DomainTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DomainDomainPropertiesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Entity2EditPart.VISUAL_ID:
			if (EntityName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DomainDomainPropertiesCompartmentEditPart.VISUAL_ID:
			if (Entity2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RelationshipEditPart.VISUAL_ID:
			if (RelationshipTypeEditPart.VISUAL_ID == nodeVisualID) {
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
		if (SituationPackage.eINSTANCE.getRelationship().isSuperTypeOf(
				domainElement.eClass())) {
			return RelationshipEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Situation element) {
		return true;
	}

}
