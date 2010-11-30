package uk.ac.open.rbac.rbac.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

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
import uk.ac.open.rbac.rbac.diagram.part.RBACDiagramEditorPlugin;
import uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry;
import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;
import uk.ac.open.rbac.rbac.diagram.providers.RBACParserProvider;

/**
 * @generated
 */
public class RBACNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		RBACDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		RBACDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof RBACNavigatorItem
				&& !isOwnView(((RBACNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof RBACNavigatorGroup) {
			RBACNavigatorGroup group = (RBACNavigatorGroup) element;
			return RBACDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof RBACNavigatorItem) {
			RBACNavigatorItem navigatorItem = (RBACNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case RolePermissionsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.ac.uk.open/rbac/RBAC?Role?permissions", RBACElementTypes.RolePermissions_4004); //$NON-NLS-1$
		case SessionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.ac.uk.open/rbac/RBAC?Session", RBACElementTypes.Session_2003); //$NON-NLS-1$
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.ac.uk.open/rbac/RBAC?RolePermissionAssignment", RBACElementTypes.RolePermissionAssignment_4002); //$NON-NLS-1$
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.ac.uk.open/rbac/RBAC?UserRoleAssignment", RBACElementTypes.UserRoleAssignment_4001); //$NON-NLS-1$
		case ObjectEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.ac.uk.open/rbac/RBAC?Object", RBACElementTypes.Object_2004); //$NON-NLS-1$
		case ModelEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.ac.uk.open/rbac/RBAC?Model", RBACElementTypes.Model_1000); //$NON-NLS-1$
		case PermissionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.ac.uk.open/rbac/RBAC?Permission", RBACElementTypes.Permission_4003); //$NON-NLS-1$
		case UserEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.ac.uk.open/rbac/RBAC?User", RBACElementTypes.User_2002); //$NON-NLS-1$
		case SessionAssignmentsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.ac.uk.open/rbac/RBAC?Session?assignments", RBACElementTypes.SessionAssignments_4005); //$NON-NLS-1$
		case RoleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.ac.uk.open/rbac/RBAC?Role", RBACElementTypes.Role_2001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = RBACDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& RBACElementTypes.isKnownElementType(elementType)) {
			image = RBACElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof RBACNavigatorGroup) {
			RBACNavigatorGroup group = (RBACNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof RBACNavigatorItem) {
			RBACNavigatorItem navigatorItem = (RBACNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (RBACVisualIDRegistry.getVisualID(view)) {
		case RolePermissionsEditPart.VISUAL_ID:
			return getRolePermissions_4004Text(view);
		case SessionEditPart.VISUAL_ID:
			return getSession_2003Text(view);
		case RolePermissionAssignmentEditPart.VISUAL_ID:
			return getRolePermissionAssignment_4002Text(view);
		case UserRoleAssignmentEditPart.VISUAL_ID:
			return getUserRoleAssignment_4001Text(view);
		case ObjectEditPart.VISUAL_ID:
			return getObject_2004Text(view);
		case ModelEditPart.VISUAL_ID:
			return getModel_1000Text(view);
		case PermissionEditPart.VISUAL_ID:
			return getPermission_4003Text(view);
		case UserEditPart.VISUAL_ID:
			return getUser_2002Text(view);
		case SessionAssignmentsEditPart.VISUAL_ID:
			return getSessionAssignments_4005Text(view);
		case RoleEditPart.VISUAL_ID:
			return getRole_2001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getObject_2004Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.Object_2004,
				view.getElement() != null ? view.getElement() : view,
				RBACVisualIDRegistry.getType(ObjectNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPermission_4003Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.Permission_4003,
				view.getElement() != null ? view.getElement() : view,
				RBACVisualIDRegistry.getType(PermissionTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSessionAssignments_4005Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.SessionAssignments_4005,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRolePermissions_4004Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.RolePermissions_4004,
				view.getElement() != null ? view.getElement() : view,
				CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getRolePermissionAssignment_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSession_2003Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.Session_2003,
				view.getElement() != null ? view.getElement() : view,
				RBACVisualIDRegistry.getType(SessionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getModel_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUser_2002Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.User_2002,
				view.getElement() != null ? view.getElement() : view,
				RBACVisualIDRegistry.getType(UserNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUserRoleAssignment_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getRole_2001Text(View view) {
		IParser parser = RBACParserProvider.getParser(
				RBACElementTypes.Role_2001,
				view.getElement() != null ? view.getElement() : view,
				RBACVisualIDRegistry.getType(RoleNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			RBACDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ModelEditPart.MODEL_ID.equals(RBACVisualIDRegistry
				.getModelID(view));
	}

}
