package uk.ac.open.dependency.dependency.diagram.part;

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

import uk.ac.open.dependency.dependency.diagram.providers.DependencyElementTypes;

/**
 * @generated
 */
public class DependencyPaletteFactory {

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
		paletteContainer.add(createNode1CreationTool());
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
		paletteContainer.add(createCoupling1CreationTool());
		paletteContainer.add(createPrecedence2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node1CreationTool_title,
				Messages.Node1CreationTool_desc,
				Collections.singletonList(DependencyElementTypes.Node_2001));
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DependencyElementTypes
				.getImageDescriptor(DependencyElementTypes.Node_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCoupling1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Coupling1CreationTool_title,
				Messages.Coupling1CreationTool_desc,
				Collections.singletonList(DependencyElementTypes.Coupling_4001));
		entry.setId("createCoupling1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DependencyElementTypes
				.getImageDescriptor(DependencyElementTypes.Coupling_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrecedence2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Precedence2CreationTool_title,
				Messages.Precedence2CreationTool_desc,
				Collections
						.singletonList(DependencyElementTypes.Precedence_4002));
		entry.setId("createPrecedence2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(DependencyElementTypes
				.getImageDescriptor(DependencyElementTypes.Precedence_4002));
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
