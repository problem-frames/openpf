package uk.ac.open.rbac.rbac.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.rbac.rbac.Model;
import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ModelEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.PermissionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.PermissionTypeEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionsEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionAssignmentsEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserNameEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserRoleAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.WrappingLabel2EditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class RBACVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "rbac.diagram/debug/visualID"; //$NON-NLS-1$

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
		return uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry
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
				RBACDiagramEditorPlugin.getInstance().logError(
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
		if (RbacPackage.eINSTANCE.getModel().isSuperTypeOf(
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
		String containerModelID = uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry
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
			if (RbacPackage.eINSTANCE.getRole().isSuperTypeOf(
					domainElement.eClass())) {
				return RoleEditPart.VISUAL_ID;
			}
			if (RbacPackage.eINSTANCE.getUser().isSuperTypeOf(
					domainElement.eClass())) {
				return UserEditPart.VISUAL_ID;
			}
			if (RbacPackage.eINSTANCE.getSession().isSuperTypeOf(
					domainElement.eClass())) {
				return SessionEditPart.VISUAL_ID;
			}
			if (RbacPackage.eINSTANCE.getObject().isSuperTypeOf(
					domainElement.eClass())) {
				return ObjectEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry
				.getModelID(containerView);
		if (!ModelEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ModelEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry
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
			if (RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UserEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SessionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RoleEditPart.VISUAL_ID:
			if (RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case UserEditPart.VISUAL_ID:
			if (UserNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SessionEditPart.VISUAL_ID:
			if (SessionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectEditPart.VISUAL_ID:
			if (ObjectNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PermissionEditPart.VISUAL_ID:
			if (PermissionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case RolePermissionsEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SessionAssignmentsEditPart.VISUAL_ID:
			if (WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
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
		if (RbacPackage.eINSTANCE.getUserRoleAssignment().isSuperTypeOf(
				domainElement.eClass())) {
			return UserRoleAssignmentEditPart.VISUAL_ID;
		}
		if (RbacPackage.eINSTANCE.getRolePermissionAssignment().isSuperTypeOf(
				domainElement.eClass())) {
			return RolePermissionAssignmentEditPart.VISUAL_ID;
		}
		if (RbacPackage.eINSTANCE.getPermission().isSuperTypeOf(
				domainElement.eClass())) {
			return PermissionEditPart.VISUAL_ID;
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
