package uk.ac.open.argument.argument.diagram.part;

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

import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

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
		paletteContainer.add(createMitigates1CreationTool());
		paletteContainer.add(createOrigin2CreationTool());
		paletteContainer.add(createRebuts3CreationTool());
		paletteContainer.add(createRebuttal4CreationTool());
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
	private ToolEntry createMitigates1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Mitigates1CreationTool_title,
				Messages.Mitigates1CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Mitigates_4002));
		entry.setId("createMitigates1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Mitigates_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOrigin2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Origin2CreationTool_title,
				Messages.Origin2CreationTool_desc,
				Collections
						.singletonList(ArgumentElementTypes.ArgumentOrigin_4003));
		entry.setId("createOrigin2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.ArgumentOrigin_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRebuts3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Rebuts3CreationTool_title,
				Messages.Rebuts3CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Rebuts_4001));
		entry.setId("createRebuts3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Rebuts_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRebuttal4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Rebuttal4CreationTool_title,
				Messages.Rebuttal4CreationTool_desc,
				Collections
						.singletonList(ArgumentElementTypes.MitigatesRebuttal_4004));
		entry.setId("createRebuttal4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.MitigatesRebuttal_4004));
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
