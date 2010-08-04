/*
 * 
 */
package eu.securechange.situation.diagram.part;

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

import eu.securechange.situation.diagram.providers.SituationElementTypes;

/**
 * @generated
 */
public class SituationPaletteFactory {

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
		paletteContainer.add(createDomain1CreationTool());
		paletteContainer.add(createEntity2CreationTool());
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
		paletteContainer.add(createRelationship1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Domain1CreationTool_title,
				Messages.Domain1CreationTool_desc,
				Collections.singletonList(SituationElementTypes.Domain_2002));
		entry.setId("createDomain1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SituationElementTypes
				.getImageDescriptor(SituationElementTypes.Domain_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntity2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SituationElementTypes.Entity_2001);
		types.add(SituationElementTypes.Entity_3001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Entity2CreationTool_title,
				Messages.Entity2CreationTool_desc, types);
		entry.setId("createEntity2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SituationElementTypes
				.getImageDescriptor(SituationElementTypes.Entity_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRelationship1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Relationship1CreationTool_title,
				Messages.Relationship1CreationTool_desc,
				Collections
						.singletonList(SituationElementTypes.Relationship_4001));
		entry.setId("createRelationship1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SituationElementTypes
				.getImageDescriptor(SituationElementTypes.Relationship_4001));
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
