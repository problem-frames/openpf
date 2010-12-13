package it.unitn.disi.sistar.modeling.tropos.diagram.part;

import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

/**
 * @generated
 */
public class TroposPaletteFactory {

	/**
	 * @generated NOT
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		CustomPaletteFactory factory = new CustomPaletteFactory();
		paletteRoot.add(factory.createActorGroup());
		paletteRoot.add(factory.createServiceGroup());
		paletteRoot.add(factory.createAssociationGroup());
		paletteRoot.add(factory.createContributionGroup());
		paletteRoot.add(factory.createCustomRelationGroup());
		//paletteRoot.add(factory.createCompositionGroup());
		paletteRoot.add(factory.createDependencyGroup());
		paletteRoot.add(factory.createOwnershipGroup());
		//paletteRoot.add(factory.createOtherGroup());
	}

	/**
	 * @generated
	 */
	private PaletteContainer createActor1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Actor1Group_title);
		paletteContainer.setId("createActor1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Actor1Group_desc);
		paletteContainer.add(createActorCreation1CreationTool());
		paletteContainer.add(createAgentCreation2CreationTool());
		paletteContainer.add(createRoleCreation3CreationTool());
		paletteContainer.add(createPositionCreation4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createService2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Service2Group_title);
		paletteContainer.setId("createService2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Service2Group_desc);
		paletteContainer.add(createGoalCreation1CreationTool());
		paletteContainer.add(createSoftgoalCreation2CreationTool());
		paletteContainer.add(createTaskCreation3CreationTool());
		paletteContainer.add(createResourceCreation4CreationTool());
		paletteContainer.add(createEventCreation5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createAssociation3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Association3Group_title);
		paletteContainer.setId("createAssociation3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Association3Group_desc);
		paletteContainer.add(createAssociationCreation1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createContribution4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Contribution4Group_title);
		paletteContainer.setId("createContribution4Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Contribution4Group_desc);
		paletteContainer.add(createContribution1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createComposition5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Composition5Group_title);
		paletteContainer.setId("createComposition5Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Composition5Group_desc);
		paletteContainer.add(createComposition1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createDependency6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Dependency6Group_title);
		paletteContainer.setId("createDependency6Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Dependency6Group_desc);
		paletteContainer.add(createDependency1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createOwnership7Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Ownership7Group_title);
		paletteContainer.setId("createOwnership7Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Ownership7Group_desc);
		paletteContainer.add(createOwnership1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createOthers8Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Others8Group_title);
		paletteContainer.setId("createOthers8Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Others8Group_desc);
		paletteContainer.add(createMeansEnd1CreationTool());
		paletteContainer.add(createCustom2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActorCreation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Actor_1001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ActorCreation1CreationTool_title,
				Messages.ActorCreation1CreationTool_desc, types);
		entry.setId("createActorCreation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-actor.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-actor.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAgentCreation2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.AgentCreation2CreationTool_title,
				Messages.AgentCreation2CreationTool_desc, null, null) {
		};
		entry.setId("createAgentCreation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-agent.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-agent.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleCreation3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.RoleCreation3CreationTool_title,
				Messages.RoleCreation3CreationTool_desc, null, null) {
		};
		entry.setId("createRoleCreation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-role.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-role.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPositionCreation4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.PositionCreation4CreationTool_title,
				Messages.PositionCreation4CreationTool_desc, null, null) {
		};
		entry.setId("createPositionCreation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-position.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/a-position.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGoalCreation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(TroposElementTypes.Service_2001);
		types.add(TroposElementTypes.Service_1002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GoalCreation1CreationTool_title,
				Messages.GoalCreation1CreationTool_desc, types);
		entry.setId("createGoalCreation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-goal.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-goal.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSoftgoalCreation2CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SoftgoalCreation2CreationTool_title,
				Messages.SoftgoalCreation2CreationTool_desc, null, null) {
		};
		entry.setId("createSoftgoalCreation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-softg.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-softg.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTaskCreation3CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.TaskCreation3CreationTool_title,
				Messages.TaskCreation3CreationTool_desc, null, null) {
		};
		entry.setId("createTaskCreation3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-task.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-task.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createResourceCreation4CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ResourceCreation4CreationTool_title,
				Messages.ResourceCreation4CreationTool_desc, null, null) {
		};
		entry.setId("createResourceCreation4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-res.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-res.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEventCreation5CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.EventCreation5CreationTool_title,
				Messages.EventCreation5CreationTool_desc, null, null) {
		};
		entry.setId("createEventCreation5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-res.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/s-res.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociationCreation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Association_3001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.AssociationCreation1CreationTool_title,
				Messages.AssociationCreation1CreationTool_desc, types);
		entry.setId("createAssociationCreation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createContribution1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Contribution_3002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Contribution1CreationTool_title,
				Messages.Contribution1CreationTool_desc, types);
		entry.setId("createContribution1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/newRel.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/newRel.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComposition1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Composition_3003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Composition1CreationTool_title,
				Messages.Composition1CreationTool_desc, types);
		entry.setId("createComposition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/newRelSub.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/newRelSub.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Dependency_3004);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Dependency1CreationTool_title,
				Messages.Dependency1CreationTool_desc, types);
		entry.setId("createDependency1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-dep.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-dep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOwnership1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.Ownership_3005);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Ownership1CreationTool_title,
				Messages.Ownership1CreationTool_desc, types);
		entry.setId("createOwnership1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-dep.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-dep.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMeansEnd1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.MeansEnd_3006);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MeansEnd1CreationTool_title,
				Messages.MeansEnd1CreationTool_desc, types);
		entry.setId("createMeansEnd1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCustom2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TroposElementTypes.CustomRelation_3007);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Custom2CreationTool_title,
				Messages.Custom2CreationTool_desc, types);
		entry.setId("createCustom2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
		entry.setLargeIcon(TroposDiagramEditorPlugin
				.findImageDescriptor("icons/r-assoc.png")); //$NON-NLS-1$
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
		@Override
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
		@Override
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
