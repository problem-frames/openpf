package it.unitn.disi.sistar.modeling.tropos.diagram.part;

import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.modeling.SistarModelingPlugin;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.tools.CreateActorTool;
import it.unitn.disi.sistar.tools.CreateAssociationTool;
import it.unitn.disi.sistar.tools.CreateCompositionTool;
import it.unitn.disi.sistar.tools.CreateContributionTool;
import it.unitn.disi.sistar.tools.CreateCustomTool;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.tools.CreateMeansEndTool;
import it.unitn.disi.sistar.tools.CreateOwnershipTool;
import it.unitn.disi.sistar.tools.CreateServiceTool;

import java.io.File;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;

public class CustomPaletteFactory {

	public PaletteContainer createActorGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Actor");
		paletteContainer.setDescription("Actor ToolGroup");
		//paletteContainer.add(createActorCreationTool("Actor", "Actor Creation",
		//		EActorType.ACTOR_LITERAL, "icons/a-actor.png"));
		paletteContainer.add(createActorCreationTool("Agent", "Agent Creation",
				EActorType.AGENT_LITERAL, "icons/a-agent.png"));
		paletteContainer.add(createActorCreationTool("Role", "Role Creation",
				EActorType.ROLE_LITERAL, "icons/a-role.png"));
		//paletteContainer.add(createActorCreationTool("Position",
		//		"Position Creation", EActorType.POSITION_LITERAL,
		//		"icons/a-position.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	public PaletteContainer createServiceGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Service");
		paletteContainer.setDescription("Service ToolGroup");
		paletteContainer.add(createServiceCreationTool("Goal", "Goal Creation",
				EServiceType.GOAL_LITERAL, "icons/s-goal.png"));
		paletteContainer.add(createServiceCreationTool("Softgoal",
				"Softgoal Creation", EServiceType.SOFTGOAL_LITERAL,
				"icons/s-softg.png"));
		paletteContainer.add(createServiceCreationTool("Task", "Task Creation",
				EServiceType.TASK_LITERAL, "icons/s-task.png"));
		paletteContainer.add(createServiceCreationTool("Resource",
				"Resource Creation", EServiceType.RESOURCE_LITERAL,
				"icons/s-res.png"));
		paletteContainer
				.add(createServiceCreationTool("Event", "Event Creation",
						EServiceType.EVENT_LITERAL, "icons/s-event.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	public PaletteContainer createAssociationGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Association");
		paletteContainer.setDescription("Association");
		paletteContainer.add(createAssociationCreationTool("Is Part Of",
				"Is Part Of Creation", EAssociationType.IS_PART_OF_LITERAL,
				"icons/r-assoc.png"));
		paletteContainer.add(createAssociationCreationTool("Is A",
				"Is A Creation", EAssociationType.IS_A_LITERAL,
				"icons/r-assoc.png"));
		//paletteContainer.add(createAssociationCreationTool("Cover",
		//		"Cover Creation", EAssociationType.COVER_LITERAL,
		//		"icons/r-assoc.png"));
		paletteContainer.add(createAssociationCreationTool("Play",
				"Play Creation", EAssociationType.PLAY_LITERAL,
				"icons/r-assoc.png"));
		paletteContainer.add(createAssociationCreationTool("Supervise",
				"Supervise Creation", EAssociationType.SUPERVISE_LITERAL,
				"icons/r-assoc.png"));
		//paletteContainer.add(createAssociationCreationTool("Occupy",
		//		"Occupy Creation", EAssociationType.OCCUPY_LITERAL,
		//		"icons/r-assoc.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	public PaletteContainer createContributionGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Relationships");
		paletteContainer.setDescription("Relationships");
		paletteContainer.add(createContributionCreationTool("Contribution",
				"Contribution Creation", EContributionType.P_LITERAL,ERelationshipType.CONTRIBUTION_LITERAL,
				"icons/new-contribution.png"));
		paletteContainer.add(createContributionCreationTool("Impact",
				"Impact Creation", EContributionType.M_LITERAL,ERelationshipType.IMPACT_LITERAL,
				"icons/new-impact.png"));
		paletteContainer.add(createContributionCreationTool("Alleviation",
				"Alleviation Creation", EContributionType.M_LITERAL,ERelationshipType.ALLEVIATION_LITERAL,
				"icons/new-alleviation2.png"));
		paletteContainer.add(createCompositionCreationTool("Composition", 
				"Composition Creation", ECompositionType.AND_LITERAL, "icons/newRelSub.png"));
		paletteContainer.add(createMeansEndCreationTool("Means End", 
				"Means End Creation","MEANS_END", "icons/r-assoc.png"));
		
		paletteContainer.add(createCustomCreationTool("Custom", 
				"Custom Creation","CUSTOM", "icons/customRel.png", new HashMap()));
		
		return paletteContainer;
	}

	public PaletteContainer createCustomRelationGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Custom Relationships");
		PropertyConfig config = PropertyConfig.getInstance();
		try {
			config.load();
		} catch (Exception e) {
			e.printStackTrace();
		}
		List customConnectionList = config.getCustomConnectionList();
		for (Iterator iter = customConnectionList.iterator(); iter.hasNext();) {
			Map connectionMap = (Map) iter.next();
			paletteContainer.add(createCustomCreationTool((String)connectionMap.get(PropertyConfig.CUSTREL_NAME), 
					(String)connectionMap.get(PropertyConfig.CUSTREL_DESCRIPTION),
					(String)connectionMap.get(PropertyConfig.CUSTREL_ID), (String)connectionMap.get(PropertyConfig.CUSTREL_ICON), connectionMap));
			
		}
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}

	/*public PaletteContainer createCompositionGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Composition");
		paletteContainer.setDescription("Composition");
		paletteContainer.add(createCompositionCreationTool("Composition", "Composition", ECompositionType.AND_LITERAL, "icons/newRelSub.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}*/

	public PaletteContainer createDependencyGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Dependency");
		paletteContainer.setDescription("Dependency");
		//paletteContainer.add(createDependencyCreationTool("Dependency", 
		//		"Dependency", EDependencyType.DEPENDENCY_LITERAL, "icons/r-dep.png"));
		paletteContainer.add(createDependencyCreationTool("Delegation Execution", 
				"Delegation Execution Creation", EDependencyType.DELEGATION_EXECUTION_LITERAL, "icons/r-de.png"));
		paletteContainer.add(createDependencyCreationTool("Delegation Permission", 
				"Delegation Permission Creation", EDependencyType.DELEGATION_PERMISSION_LITERAL, "icons/r-dp.png"));
		paletteContainer.add(createDependencyCreationTool("Trust Execution", 
				"Trust Execution Creation", EDependencyType.TRUST_EXECUTION_LITERAL, "icons/r-truste.png"));
		paletteContainer.add(createDependencyCreationTool("Trust Permission", 
				"Trust Permission Creation", EDependencyType.TRUST_PERMISSION_LITERAL, "icons/r-trustp.png"));
		paletteContainer.add(createDependencyCreationTool("Distrust Execution", 
				"Distrust Execution Creation", EDependencyType.DISTRUST_EXECUTION_LITERAL, "icons/r-dtruste.png"));
		paletteContainer.add(createDependencyCreationTool("Distrust Permission", 
				"Distrust Permission Creation", EDependencyType.DISTRUST_PERMISSION_LITERAL, "icons/r-dtrustp.png"));
		paletteContainer.add(createDependencyCreationTool("Monitoring Execution", 
				"Monitoring Execution Creation", EDependencyType.MONITORING_EXECUTION_LITERAL, "icons/r-me.png"));
		paletteContainer.add(createDependencyCreationTool("Monitoring Permission", 
				"Monitoring Permission Creation", EDependencyType.MONITORING_PERMISSION_LITERAL, "icons/r-mp.png"));
		paletteContainer.add(createDependencyCreationTool("Trust Monitor", 
				"Trust Monitor Creation", EDependencyType.TRUST_MONITOR_LITERAL, "icons/r-trustmon.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}
	
	public PaletteContainer createOwnershipGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("ECO Model");
		paletteContainer.setDescription("ECO Model");
		paletteContainer.add(createOwnershipCreationTool("Ownership", 
				"Ownership Creation", EOwnershipType.OWN_LITERAL, "icons/r-own.png"));
		paletteContainer.add(createOwnershipCreationTool("Request", 
				"Request Creation", EOwnershipType.REQUEST_LITERAL, "icons/r-r.png"));
		paletteContainer.add(createOwnershipCreationTool("Provide", 
				"Provide Creation", EOwnershipType.PROVIDE_LITERAL, "icons/r-pv.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}
	
	/*public PaletteContainer createOtherGroup() {
		PaletteContainer paletteContainer = new PaletteDrawer("Others");
		paletteContainer.setDescription("Others");
		paletteContainer.add(createMeansEndCreationTool("Means End", 
				"Means End","MEANS_END", "icons/r-assoc.png"));
		((PaletteDrawer)paletteContainer).setInitialState(PaletteDrawer.INITIAL_STATE_CLOSED);
		return paletteContainer;
	}*/
	
	private ToolEntry createActorCreationTool(String title, String description,
			EActorType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;
 
		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Actor_1001);
		ToolEntry result = new NodeActorToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}

	private ToolEntry createServiceCreationTool(String title,
			String description, EServiceType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Service_2001);
		ToolEntry result = new NodeServiceToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}

	private ToolEntry createAssociationCreationTool(String title,
			String description, EAssociationType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Association_3001);
		ToolEntry result = new LinkAssociationToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}

	private ToolEntry createContributionCreationTool(String title,
			String description, EContributionType type, ERelationshipType relationshipType, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Contribution_3002);
		ToolEntry result = new LinkContributionToolEntry(title, description,
				smallImage, largeImage, elementTypes, type, relationshipType);

		return result;
	}

	private ToolEntry createCompositionCreationTool(String title,
			String description, ECompositionType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Composition_3003);
		ToolEntry result = new LinkCompositionToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}
	

	private ToolEntry createDependencyCreationTool(String title,
			String description, EDependencyType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Dependency_3004);
		ToolEntry result = new LinkDependencyToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}


	private ToolEntry createOwnershipCreationTool(String title,
			String description, EOwnershipType type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		final List elementTypes = new ArrayList();
		elementTypes.add(TroposElementTypes.Ownership_3005);
		ToolEntry result = new LinkOwnershipToolEntry(title, description,
				smallImage, largeImage, elementTypes, type);

		return result;
	}
	
	private ToolEntry createMeansEndCreationTool(String title,
			String description, String type, String iconPath) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);

		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);
		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(TroposElementTypes.MeansEnd_3006);
		ToolEntry result = new LinkMeansEndToolEntry(title, description,
				smallImage, largeImage, relationshipTypes, type);

		return result;
	}
	
	private ToolEntry createCustomCreationTool(String title,
			String description, String type, String iconPath, Map params) {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = SistarModelingPlugin.findImageDescriptor(iconPath);
		
		largeImage = SistarModelingPlugin.findImageDescriptor(iconPath);
		
		try {
			if(smallImage == null)
				smallImage = ImageDescriptor.createFromURL(new File(iconPath).toURL());
			if(largeImage == null)
				largeImage = ImageDescriptor.createFromURL(new File(iconPath).toURL());
//			System.out.println(new File(iconPath).toURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(TroposElementTypes.CustomRelation_3007);
		ToolEntry result = new LinkCustomToolEntry(title, description,
				smallImage, largeImage, relationshipTypes, type, params);

		return result;
	}
	
	private static class NodeActorToolEntry extends ToolEntry {

		private final List elementTypes;

		private final EActorType type;

		private NodeActorToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List elementTypes, EActorType type) {
			super(title, description, smallIcon, largeIcon);
			this.elementTypes = elementTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateActorTool(elementTypes, type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	private static class NodeServiceToolEntry extends ToolEntry {

		private final List elementTypes;

		private final EServiceType type;

		private NodeServiceToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List elementTypes, EServiceType type) {
			super(title, description, smallIcon, largeIcon);
			this.elementTypes = elementTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateServiceTool(elementTypes, type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	private static class LinkAssociationToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final EAssociationType type;

		private LinkAssociationToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, EAssociationType type) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateAssociationTool(
					(IElementType) relationshipTypes.get(0), type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	private static class LinkContributionToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final EContributionType type;
		private final ERelationshipType	relationshipType;

		private LinkContributionToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, EContributionType type, ERelationshipType relationshipType) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
			this.relationshipType = relationshipType;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateContributionTool(
					(IElementType) relationshipTypes.get(0), type, relationshipType);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	private static class LinkCompositionToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final ECompositionType type;

		private LinkCompositionToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, ECompositionType type) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateCompositionTool(
					(IElementType) relationshipTypes.get(0), type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	

	/**
	 * @generated NOT
	 */
	private static class LinkDependencyToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final EDependencyType type;

		private LinkDependencyToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, EDependencyType type) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateDependencyTool(
					(IElementType) relationshipTypes.get(0), type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
	/**
	 * @generated NOT
	 */
	private static class LinkOwnershipToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final EOwnershipType type;

		private LinkOwnershipToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, EOwnershipType type) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateOwnershipTool(
					(IElementType) relationshipTypes.get(0), type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	private static class LinkMeansEndToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final String type;

		private LinkMeansEndToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, String type) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateMeansEndTool(
					(IElementType) relationshipTypes.get(0), type);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	private static class LinkCustomToolEntry extends ToolEntry {

		private final List relationshipTypes;

		private final String type;
		private final Map params;

		private LinkCustomToolEntry(String title, String description,
				ImageDescriptor smallIcon, ImageDescriptor largeIcon,
				List relationshipTypes, String type, Map params) {
			super(title, description, smallIcon, largeIcon);
			this.relationshipTypes = relationshipTypes;
			this.type = type;
			this.params = params;
		}

		@Override
		public Tool createTool() {
			Tool tool = new CreateCustomTool(
					(IElementType) relationshipTypes.get(0), type, params);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

}
