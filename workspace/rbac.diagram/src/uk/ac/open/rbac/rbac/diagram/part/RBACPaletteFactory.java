package uk.ac.open.rbac.rbac.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class RBACPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createObject1CreationTool());
		paletteContainer.add(createRole2CreationTool());
		paletteContainer.add(createSession3CreationTool());
		paletteContainer.add(createUser4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Connections" palette tool group
	 * @generated
	 */
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAssignments1CreationTool());
		paletteContainer.add(createRolePermissionAssignment2CreationTool());
		paletteContainer.add(createUserRoleAssignment3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObject1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Object1CreationTool_title,
				Messages.Object1CreationTool_desc,
				Collections.singletonList(RBACElementTypes.Object_2004));
		entry.setId("createObject1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.Object_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Role2CreationTool_title,
				Messages.Role2CreationTool_desc,
				Collections.singletonList(RBACElementTypes.Role_2001));
		entry.setId("createRole2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.Role_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSession3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Session3CreationTool_title,
				Messages.Session3CreationTool_desc,
				Collections.singletonList(RBACElementTypes.Session_2003));
		entry.setId("createSession3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.Session_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUser4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.User4CreationTool_title,
				Messages.User4CreationTool_desc,
				Collections.singletonList(RBACElementTypes.User_2002));
		entry.setId("createUser4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.User_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssignments1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Assignments1CreationTool_title,
				Messages.Assignments1CreationTool_desc,
				Collections
						.singletonList(RBACElementTypes.SessionAssignments_4003));
		entry.setId("createAssignments1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.SessionAssignments_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRolePermissionAssignment2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.RolePermissionAssignment2CreationTool_title,
				Messages.RolePermissionAssignment2CreationTool_desc,
				Collections
						.singletonList(RBACElementTypes.RolePermissionAssignment_4002));
		entry.setId("createRolePermissionAssignment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.RolePermissionAssignment_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUserRoleAssignment3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UserRoleAssignment3CreationTool_title,
				Messages.UserRoleAssignment3CreationTool_desc,
				Collections
						.singletonList(RBACElementTypes.UserRoleAssignment_4001));
		entry.setId("createUserRoleAssignment3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(RBACElementTypes
				.getImageDescriptor(RBACElementTypes.UserRoleAssignment_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
