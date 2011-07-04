package argument.argument.diagram.part;

import java.util.ArrayList;
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

import argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentPaletteFactory {

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
		paletteContainer.add(createArgument1CreationTool());
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
		paletteContainer.add(createDenies1CreationTool());
		paletteContainer.add(createLink2CreationTool());
		paletteContainer.add(createMitigates3CreationTool());
		paletteContainer.add(createRebuts4CreationTool());
		paletteContainer.add(createReplaces5CreationTool());
		paletteContainer.add(createRestores6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgument1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ArgumentElementTypes.Argument_2001);
		types.add(ArgumentElementTypes.Argument_3001);
		types.add(ArgumentElementTypes.Argument_3002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Argument1CreationTool_title,
				Messages.Argument1CreationTool_desc, types);
		entry.setId("createArgument1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Argument_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDenies1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Denies1CreationTool_title,
				Messages.Denies1CreationTool_desc,
				Collections
						.singletonList(ArgumentElementTypes.RebutsDenies_4004));
		entry.setId("createDenies1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.RebutsDenies_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLink2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Link2CreationTool_title,
				Messages.Link2CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Link_4003));
		entry.setId("createLink2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Link_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMitigates3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Mitigates3CreationTool_title,
				Messages.Mitigates3CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Mitigates_4002));
		entry.setId("createMitigates3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Mitigates_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRebuts4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Rebuts4CreationTool_title,
				Messages.Rebuts4CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Rebuts_4001));
		entry.setId("createRebuts4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Rebuts_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReplaces5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Replaces5CreationTool_title,
				Messages.Replaces5CreationTool_desc,
				Collections
						.singletonList(ArgumentElementTypes.ArgumentReplaces_4006));
		entry.setId("createReplaces5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.ArgumentReplaces_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestores6CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Restores6CreationTool_title,
				Messages.Restores6CreationTool_desc,
				Collections
						.singletonList(ArgumentElementTypes.MitigatesRestores_4005));
		entry.setId("createRestores6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.MitigatesRestores_4005));
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
