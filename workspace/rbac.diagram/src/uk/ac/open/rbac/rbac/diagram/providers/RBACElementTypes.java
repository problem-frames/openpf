package uk.ac.open.rbac.rbac.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ModelEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionsEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserRoleAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.part.RBACDiagramEditorPlugin;

/**
 * @generated
 */
public class RBACElementTypes {

	/**
	 * @generated
	 */
	private RBACElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Model_1000 = getElementType("rbac.diagram.Model_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Role_2001 = getElementType("rbac.diagram.Role_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType User_2002 = getElementType("rbac.diagram.User_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Session_2003 = getElementType("rbac.diagram.Session_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Object_2004 = getElementType("rbac.diagram.Object_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UserRoleAssignment_4001 = getElementType("rbac.diagram.UserRoleAssignment_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RolePermissionAssignment_4002 = getElementType("rbac.diagram.RolePermissionAssignment_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SessionAssignments_4003 = getElementType("rbac.diagram.SessionAssignments_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return RBACDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Model_1000, RbacPackage.eINSTANCE.getModel());

			elements.put(Role_2001, RbacPackage.eINSTANCE.getRole());

			elements.put(User_2002, RbacPackage.eINSTANCE.getUser());

			elements.put(Session_2003, RbacPackage.eINSTANCE.getSession());

			elements.put(Object_2004, RbacPackage.eINSTANCE.getObject());

			elements.put(UserRoleAssignment_4001,
					RbacPackage.eINSTANCE.getUserRoleAssignment());

			elements.put(RolePermissionAssignment_4002,
					RbacPackage.eINSTANCE.getRolePermissionAssignment());

			elements.put(SessionAssignments_4003,
					RbacPackage.eINSTANCE.getSession_Assignments());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Model_1000);
			KNOWN_ELEMENT_TYPES.add(Role_2001);
			KNOWN_ELEMENT_TYPES.add(User_2002);
			KNOWN_ELEMENT_TYPES.add(Session_2003);
			KNOWN_ELEMENT_TYPES.add(Object_2004);
			KNOWN_ELEMENT_TYPES.add(UserRoleAssignment_4001);
			KNOWN_ELEMENT_TYPES.add(RolePermissionAssignment_4002);
			KNOWN_ELEMENT_TYPES.add(SessionAssignments_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ModelEditPart.VISUAL_ID:
			return Model_1000;
		case RoleEditPart.VISUAL_ID:
			return Role_2001;
		case UserEditPart.VISUAL_ID:
			return User_2002;
		case SessionEditPart.VISUAL_ID:
			return Session_2003;
		case ObjectEditPart.VISUAL_ID:
			return Object_2004;
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return UserRoleAssignment_4001;
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return RolePermissionAssignment_4002;
		case RolePermissionsEditPart.VISUAL_ID:
			return SessionAssignments_4003;
		}
		return null;
	}

}
