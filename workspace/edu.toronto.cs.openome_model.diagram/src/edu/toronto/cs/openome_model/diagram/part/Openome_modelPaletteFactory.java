package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class Openome_modelPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createDefault1Group());
		paletteRoot.add(createContributions2Group());
		paletteRoot.add(createAssociations3Group());
	}

	/**
	 * Creates "Default" palette tool group
	 * @generated
	 */
	private PaletteContainer createDefault1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				edu.toronto.cs.openome_model.diagram.part.Messages.Default1Group_title);
		paletteContainer.setId("createDefault1Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Default1Group_desc);
		paletteContainer.add(createActor1CreationTool());
		paletteContainer.add(createAgent2CreationTool());
		paletteContainer.add(createPosition3CreationTool());
		paletteContainer.add(createRole4CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createHardgoal6CreationTool());
		paletteContainer.add(createSoftgoal7CreationTool());
		paletteContainer.add(createTask8CreationTool());
		paletteContainer.add(createResource9CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createDependency11CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createAnd13CreationTool());
		paletteContainer.add(createOr14CreationTool());
		paletteContainer.add(new PaletteSeparator());
		return paletteContainer;
	}

	/**
	 * Creates "Contributions" palette tool group
	 * @generated
	 */
	private PaletteContainer createContributions2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				edu.toronto.cs.openome_model.diagram.part.Messages.Contributions2Group_title);
		paletteContainer.setId("createContributions2Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Contributions2Group_desc);
		paletteContainer.add(createMake1CreationTool());
		paletteContainer.add(createSome2CreationTool());
		paletteContainer.add(createHelp3CreationTool());
		paletteContainer.add(createUnknown4CreationTool());
		paletteContainer.add(createHurt5CreationTool());
		paletteContainer.add(createSome6CreationTool());
		paletteContainer.add(createBreak7CreationTool());
		paletteContainer.add(createAND8CreationTool());
		paletteContainer.add(createOR9CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Associations" palette tool group
	 * @generated
	 */
	private PaletteContainer createAssociations3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				edu.toronto.cs.openome_model.diagram.part.Messages.Associations3Group_title);
		paletteContainer.setId("createAssociations3Group"); //$NON-NLS-1$
		paletteContainer
				.setDescription(edu.toronto.cs.openome_model.diagram.part.Messages.Associations3Group_desc);
		paletteContainer.add(createISA1CreationTool());
		paletteContainer.add(createCovers2CreationTool());
		paletteContainer.add(createIspartof3CreationTool());
		paletteContainer.add(createOccupies4CreationTool());
		paletteContainer.add(createPlays5CreationTool());
		paletteContainer.add(createINS6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActor1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Actor1CreationTool_desc,
				types);
		entry.setId("createActor1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/actor.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/actor.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Agent2CreationTool_desc,
				types);
		entry.setId("createAgent2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/agent.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/agent.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPosition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Position3CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Position3CreationTool_desc,
				types);
		entry.setId("createPosition3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/position.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/position.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Role4CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Role4CreationTool_desc,
				types);
		entry.setId("createRole4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/role.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/role.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHardgoal6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal6CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hardgoal6CreationTool_desc,
				types);
		entry.setId("createHardgoal6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hardgoal.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/hardgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoal7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal7CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Softgoal7CreationTool_desc,
				types);
		entry.setId("createSoftgoal7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/softgoal.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/softgoal.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTask8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Task8CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Task8CreationTool_desc,
				types);
		entry.setId("createTask8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/task.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/task.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResource9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		NodeToolEntry entry = new NodeToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource9CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Resource9CreationTool_desc,
				types);
		entry.setId("createResource9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/resource.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/resource.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency11CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Dependency11CreationTool_desc,
				types);
		entry.setId("createDependency11CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/dependency.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/dependency.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnd13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.And13CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.And13CreationTool_desc,
				types);
		entry.setId("createAnd13CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/anddecomposition.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/anddecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOr14CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Or14CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Or14CreationTool_desc,
				types);
		entry.setId("createOr14CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/ordecomposition.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/ordecomposition.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMake1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Make1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Make1CreationTool_desc,
				types);
		entry.setId("createMake1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSome2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Some2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Some2CreationTool_desc,
				types);
		entry.setId("createSome2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHelp3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Help3CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Help3CreationTool_desc,
				types);
		entry.setId("createHelp3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnknown4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Unknown4CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Unknown4CreationTool_desc,
				types);
		entry.setId("createUnknown4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createHurt5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt5CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Hurt5CreationTool_desc,
				types);
		entry.setId("createHurt5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSome6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Some6CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Some6CreationTool_desc,
				types);
		entry.setId("createSome6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBreak7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Break7CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Break7CreationTool_desc,
				types);
		entry.setId("createBreak7CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAND8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.AND8CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.AND8CreationTool_desc,
				types);
		entry.setId("createAND8CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOR9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.OR9CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.OR9CreationTool_desc,
				types);
		entry.setId("createOR9CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createISA1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.ISA1CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.ISA1CreationTool_desc,
				types);
		entry.setId("createISA1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCovers2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Covers2CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Covers2CreationTool_desc,
				types);
		entry.setId("createCovers2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createIspartof3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Ispartof3CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Ispartof3CreationTool_desc,
				types);
		entry.setId("createIspartof3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccupies4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Occupies4CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Occupies4CreationTool_desc,
				types);
		entry.setId("createOccupies4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPlays5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.Plays5CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.Plays5CreationTool_desc,
				types);
		entry.setId("createPlays5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createINS6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		LinkToolEntry entry = new LinkToolEntry(
				edu.toronto.cs.openome_model.diagram.part.Messages.INS6CreationTool_title,
				edu.toronto.cs.openome_model.diagram.part.Messages.INS6CreationTool_desc,
				types);
		entry.setId("createINS6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.findImageDescriptor("/openome_model/icons/contribution.png")); //$NON-NLS-1$
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
