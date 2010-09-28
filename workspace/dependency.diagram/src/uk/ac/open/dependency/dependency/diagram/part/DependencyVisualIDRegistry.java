package uk.ac.open.dependency.dependency.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.dependency.dependency.DependencyPackage;
import uk.ac.open.dependency.dependency.Model;
import uk.ac.open.dependency.dependency.diagram.edit.parts.CouplingEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.ModelEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeNameEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.PrecedenceEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DependencyVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "dependency.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ModelEditPart.MODEL_ID.equals(view.getType())) {
				return ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry
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
				DependencyDiagramEditorPlugin.getInstance().logError(
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
		if (DependencyPackage.eINSTANCE.getModel().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Model) domainElement)) {
			return ModelEditPart.VISUAL_ID;
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
		String containerModelID = uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (DependencyPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())) {
				return NodeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ModelEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
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
		if (DependencyPackage.eINSTANCE.getCoupling().isSuperTypeOf(
				domainElement.eClass())) {
			return CouplingEditPart.VISUAL_ID;
		}
		if (DependencyPackage.eINSTANCE.getPrecedence().isSuperTypeOf(
				domainElement.eClass())) {
			return PrecedenceEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Model element) {
		return true;
	}

}
