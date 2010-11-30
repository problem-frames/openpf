package uk.ac.open.rbac.rbac.diagram.part;

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

import uk.ac.open.rbac.rbac.Model;
import uk.ac.open.rbac.rbac.Object;
import uk.ac.open.rbac.rbac.Permission;
import uk.ac.open.rbac.rbac.RbacPackage;
import uk.ac.open.rbac.rbac.Role;
import uk.ac.open.rbac.rbac.RolePermissionAssignment;
import uk.ac.open.rbac.rbac.Session;
import uk.ac.open.rbac.rbac.User;
import uk.ac.open.rbac.rbac.UserRoleAssignment;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ModelEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.PermissionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RolePermissionsEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionAssignmentsEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserRoleAssignmentEditPart;
import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class RBACDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<RBACNodeDescriptor> getSemanticChildren(View view) {
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACNodeDescriptor> getModel_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Model modelElement = (Model) view.getElement();
		LinkedList<RBACNodeDescriptor> result = new LinkedList<RBACNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			Role childElement = (Role) it.next();
			int visualID = RBACVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == RoleEditPart.VISUAL_ID) {
				result.add(new RBACNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getUsers().iterator(); it.hasNext();) {
			User childElement = (User) it.next();
			int visualID = RBACVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == UserEditPart.VISUAL_ID) {
				result.add(new RBACNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getSessions().iterator(); it
				.hasNext();) {
			Session childElement = (Session) it.next();
			int visualID = RBACVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SessionEditPart.VISUAL_ID) {
				result.add(new RBACNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getObjects().iterator(); it
				.hasNext();) {
			Object childElement = (Object) it.next();
			int visualID = RBACVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ObjectEditPart.VISUAL_ID) {
				result.add(new RBACNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getContainedLinks(View view) {
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case ModelEditPart.VISUAL_ID:
			return getModel_1000ContainedLinks(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2001ContainedLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2002ContainedLinks(view);
		case SessionEditPart.VISUAL_ID:
			return getSession_2003ContainedLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2004ContainedLinks(view);
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return getUserRoleAssignment_4001ContainedLinks(view);
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return getRolePermissionAssignment_4002ContainedLinks(view);
		case PermissionEditPart.VISUAL_ID:
			return getPermission_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getIncomingLinks(View view) {
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_2001IncomingLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2002IncomingLinks(view);
		case SessionEditPart.VISUAL_ID:
			return getSession_2003IncomingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2004IncomingLinks(view);
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return getUserRoleAssignment_4001IncomingLinks(view);
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return getRolePermissionAssignment_4002IncomingLinks(view);
		case PermissionEditPart.VISUAL_ID:
			return getPermission_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getOutgoingLinks(View view) {
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case RoleEditPart.VISUAL_ID:
			return getRole_2001OutgoingLinks(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2002OutgoingLinks(view);
		case SessionEditPart.VISUAL_ID:
			return getSession_2003OutgoingLinks(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2004OutgoingLinks(view);
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return getUserRoleAssignment_4001OutgoingLinks(view);
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return getRolePermissionAssignment_4002OutgoingLinks(view);
		case PermissionEditPart.VISUAL_ID:
			return getPermission_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getModel_1000ContainedLinks(View view) {
		Model modelElement = (Model) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Permission_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRole_2001ContainedLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_RolePermissionAssignment_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Permissions_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUser_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getSession_2003ContainedLinks(
			View view) {
		Session modelElement = (Session) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_UserRoleAssignment_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Session_Assignments_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getObject_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUserRoleAssignment_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRolePermissionAssignment_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getPermission_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRole_2001IncomingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_UserRoleAssignment_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_Permission_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUser_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getSession_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getObject_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUserRoleAssignment_4001IncomingLinks(
			View view) {
		UserRoleAssignment modelElement = (UserRoleAssignment) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Session_Assignments_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRolePermissionAssignment_4002IncomingLinks(
			View view) {
		RolePermissionAssignment modelElement = (RolePermissionAssignment) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Role_Permissions_4004(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getPermission_4003IncomingLinks(
			View view) {
		Permission modelElement = (Permission) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_RolePermissionAssignment_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRole_2001OutgoingLinks(View view) {
		Role modelElement = (Role) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_RolePermissionAssignment_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Role_Permissions_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUser_2002OutgoingLinks(View view) {
		User modelElement = (User) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_UserRoleAssignment_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getSession_2003OutgoingLinks(
			View view) {
		Session modelElement = (Session) view.getElement();
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Session_Assignments_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getObject_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getUserRoleAssignment_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getRolePermissionAssignment_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<RBACLinkDescriptor> getPermission_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getContainedTypeModelFacetLinks_UserRoleAssignment_4001(
			Session container) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> links = container.getAssignments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UserRoleAssignment) {
				continue;
			}
			UserRoleAssignment link = (UserRoleAssignment) linkObject;
			if (UserRoleAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getRole();
			User src = link.getUser();
			result.add(new RBACLinkDescriptor(src, dst, link,
					RBACElementTypes.UserRoleAssignment_4001,
					UserRoleAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getContainedTypeModelFacetLinks_RolePermissionAssignment_4002(
			Role container) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> links = container.getPermissions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RolePermissionAssignment) {
				continue;
			}
			RolePermissionAssignment link = (RolePermissionAssignment) linkObject;
			if (RolePermissionAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Permission dst = link.getPermission();
			Role src = link.getRole();
			result.add(new RBACLinkDescriptor(src, dst, link,
					RBACElementTypes.RolePermissionAssignment_4002,
					RolePermissionAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getContainedTypeModelFacetLinks_Permission_4003(
			Model container) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> links = container.getPermissions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Permission) {
				continue;
			}
			Permission link = (Permission) linkObject;
			if (PermissionEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getRole();
			result.add(new RBACLinkDescriptor(container, dst, link,
					RBACElementTypes.Permission_4003,
					PermissionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getIncomingTypeModelFacetLinks_UserRoleAssignment_4001(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RbacPackage.eINSTANCE
					.getUserRoleAssignment_Role()
					|| false == setting.getEObject() instanceof UserRoleAssignment) {
				continue;
			}
			UserRoleAssignment link = (UserRoleAssignment) setting.getEObject();
			if (UserRoleAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			User src = link.getUser();
			result.add(new RBACLinkDescriptor(src, target, link,
					RBACElementTypes.UserRoleAssignment_4001,
					UserRoleAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getIncomingTypeModelFacetLinks_RolePermissionAssignment_4002(
			Permission target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RbacPackage.eINSTANCE
					.getRolePermissionAssignment_Permission()
					|| false == setting.getEObject() instanceof RolePermissionAssignment) {
				continue;
			}
			RolePermissionAssignment link = (RolePermissionAssignment) setting
					.getEObject();
			if (RolePermissionAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role src = link.getRole();
			result.add(new RBACLinkDescriptor(src, target, link,
					RBACElementTypes.RolePermissionAssignment_4002,
					RolePermissionAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getIncomingTypeModelFacetLinks_Permission_4003(
			Role target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != RbacPackage.eINSTANCE
					.getPermission_Role()
					|| false == setting.getEObject() instanceof Permission) {
				continue;
			}
			Permission link = (Permission) setting.getEObject();
			if (PermissionEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			if (false == link.eContainer() instanceof Model) {
				continue;
			}
			Model container = (Model) link.eContainer();
			result.add(new RBACLinkDescriptor(container, target, link,
					RBACElementTypes.Permission_4003,
					PermissionEditPart.VISUAL_ID));

		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getIncomingFeatureModelFacetLinks_Role_Permissions_4004(
			RolePermissionAssignment target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RbacPackage.eINSTANCE
					.getRole_Permissions()) {
				result.add(new RBACLinkDescriptor(setting.getEObject(), target,
						RBACElementTypes.RolePermissions_4004,
						RolePermissionsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getIncomingFeatureModelFacetLinks_Session_Assignments_4005(
			UserRoleAssignment target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == RbacPackage.eINSTANCE
					.getSession_Assignments()) {
				result.add(new RBACLinkDescriptor(setting.getEObject(), target,
						RBACElementTypes.SessionAssignments_4005,
						SessionAssignmentsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getOutgoingTypeModelFacetLinks_UserRoleAssignment_4001(
			User source) {
		Session container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Session) {
				container = (Session) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> links = container.getAssignments().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof UserRoleAssignment) {
				continue;
			}
			UserRoleAssignment link = (UserRoleAssignment) linkObject;
			if (UserRoleAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Role dst = link.getRole();
			User src = link.getUser();
			if (src != source) {
				continue;
			}
			result.add(new RBACLinkDescriptor(src, dst, link,
					RBACElementTypes.UserRoleAssignment_4001,
					UserRoleAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getOutgoingTypeModelFacetLinks_RolePermissionAssignment_4002(
			Role source) {
		Role container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Role) {
				container = (Role) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> links = container.getPermissions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof RolePermissionAssignment) {
				continue;
			}
			RolePermissionAssignment link = (RolePermissionAssignment) linkObject;
			if (RolePermissionAssignmentEditPart.VISUAL_ID != RBACVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Permission dst = link.getPermission();
			Role src = link.getRole();
			if (src != source) {
				continue;
			}
			result.add(new RBACLinkDescriptor(src, dst, link,
					RBACElementTypes.RolePermissionAssignment_4002,
					RolePermissionAssignmentEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getOutgoingFeatureModelFacetLinks_Role_Permissions_4004(
			Role source) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> destinations = source.getPermissions().iterator(); destinations
				.hasNext();) {
			RolePermissionAssignment destination = (RolePermissionAssignment) destinations
					.next();
			result.add(new RBACLinkDescriptor(source, destination,
					RBACElementTypes.RolePermissions_4004,
					RolePermissionsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<RBACLinkDescriptor> getOutgoingFeatureModelFacetLinks_Session_Assignments_4005(
			Session source) {
		LinkedList<RBACLinkDescriptor> result = new LinkedList<RBACLinkDescriptor>();
		for (Iterator<?> destinations = source.getAssignments().iterator(); destinations
				.hasNext();) {
			UserRoleAssignment destination = (UserRoleAssignment) destinations
					.next();
			result.add(new RBACLinkDescriptor(source, destination,
					RBACElementTypes.SessionAssignments_4005,
					SessionAssignmentsEditPart.VISUAL_ID));
		}
		return result;
	}

}
