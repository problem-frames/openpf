package uk.ac.open.problem.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class ProblemPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNode1Group());
		paletteRoot.add(createLink2Group());
	}

	/**
	 * Creates "node" palette tool group
	 * @generated
	 */
	private PaletteContainer createNode1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Node1Group_title);
		paletteContainer.setId("createNode1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Node1Group_desc);
		paletteContainer.add(createMachine1CreationTool());
		paletteContainer.add(createDomain2CreationTool());
		paletteContainer.add(createBiddableDomain3CreationTool());
		paletteContainer.add(createCausalDomain4CreationTool());
		paletteContainer.add(createLexicalDomain5CreationTool());
		paletteContainer.add(createRequirement6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "link" palette tool group
	 * @generated
	 */
	private PaletteContainer createLink2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Link2Group_title);
		paletteContainer.setId("createLink2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Link2Group_desc);
		paletteContainer.add(createInterface1CreationTool());
		paletteContainer.add(createReference2CreationTool());
		paletteContainer.add(createConstraint3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMachine1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Machine1CreationTool_title,
				Messages.Machine1CreationTool_desc, types);
		entry.setId("createMachine1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/mch_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/mch_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDomain2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Domain2CreationTool_title,
				Messages.Domain2CreationTool_desc, types);
		entry.setId("createDomain2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/dom_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/dom_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBiddableDomain3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.BiddableDomain3CreationTool_title,
				Messages.BiddableDomain3CreationTool_desc, types);
		entry.setId("createBiddableDomain3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/bdm_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/bdm_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCausalDomain4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CausalDomain4CreationTool_title,
				Messages.CausalDomain4CreationTool_desc, types);
		entry.setId("createCausalDomain4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/cdm_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/cdm_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLexicalDomain5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LexicalDomain5CreationTool_title,
				Messages.LexicalDomain5CreationTool_desc, types);
		entry.setId("createLexicalDomain5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/ldm_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/ldm_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequirement6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Node_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Requirement6CreationTool_title,
				Messages.Requirement6CreationTool_desc, types);
		entry.setId("createRequirement6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rq_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rq_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Link_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Interface1CreationTool_title,
				Messages.Interface1CreationTool_desc, types);
		entry.setId("createInterface1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/int_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/int_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createReference2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Link_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Reference2CreationTool_title,
				Messages.Reference2CreationTool_desc, types);
		entry.setId("createReference2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rqr_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rqr_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ProblemElementTypes.Link_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Constraint3CreationTool_title,
				Messages.Constraint3CreationTool_desc, types);
		entry.setId("createConstraint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rqc_obj.gif")); //$NON-NLS-1$
		entry.setLargeIcon(ProblemDiagramEditorPlugin
				.findImageDescriptor("/problem/icons/obj16/rqc_obj.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
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
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
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
