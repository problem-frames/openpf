package argument.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class ArgumentPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createExpression1CreationTool());
		paletteContainer.add(createNode2CreationTool());
		paletteContainer.add(createNodeLiteral3CreationTool());
		paletteContainer.add(createSplitCommas4CreationTool());
		paletteContainer.add(createSplitConnective5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExpression1CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Expression1CreationTool_title,
				Messages.Expression1CreationTool_desc, null, null) {
		};
		entry.setId("createExpression1CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node2CreationTool_title,
				Messages.Node2CreationTool_desc,
				Collections.singletonList(ArgumentElementTypes.Node_2001));
		entry.setId("createNode2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ArgumentElementTypes
				.getImageDescriptor(ArgumentElementTypes.Node_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNodeLiteral3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.NodeLiteral3CreationTool_title,
				Messages.NodeLiteral3CreationTool_desc, null, null) {
		};
		entry.setId("createNodeLiteral3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplitCommas4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SplitCommas4CreationTool_title,
				Messages.SplitCommas4CreationTool_desc, null, null) {
		};
		entry.setId("createSplitCommas4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSplitConnective5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SplitConnective5CreationTool_title,
				Messages.SplitConnective5CreationTool_desc, null, null) {
		};
		entry.setId("createSplitConnective5CreationTool"); //$NON-NLS-1$
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
}
