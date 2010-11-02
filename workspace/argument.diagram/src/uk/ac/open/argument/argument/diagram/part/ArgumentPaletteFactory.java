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
		paletteContainer.add(createFact2CreationTool());
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
		paletteContainer.add(createRebuts2CreationTool());
		paletteContainer.add(createRestores3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgument1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ArgumentElementTypes.Argument_2001);
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
	private ToolEntry createFact2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ArgumentElementTypes.Fact_3001);
		types.add(ArgumentElementTypes.Fact_3003);
		types.add(ArgumentElementTypes.Fact_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Fact2CreationTool_title,
				Messages.Fact2CreationTool_desc, types);
		entry.setId("createFact2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Fact_3001));
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
	private ToolEntry createRebuts2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Rebuts2CreationTool_title,
				Messages.Rebuts2CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Rebuts_4001));
		entry.setId("createRebuts2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Rebuts_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRestores3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Restores3CreationTool_title,
				Messages.Restores3CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Restores_4003));
		entry.setId("createRestores3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Restores_4003));
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
