package edu.toronto.cs.openome_model.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelDiagramUpdater {

	/**
	 * @generated
	 */
	public static List getSemanticChildren(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
			return getActorActorCompartment_5001SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
			return getAgentAgentCompartment_5002SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
			return getPositionPositionCompartment_5003SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
			return getRoleRoleCompartment_5004SemanticChildren(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_79SemanticChildren(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActorActorCompartment_5001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgentAgentCompartment_5002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPositionPositionCompartment_5003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRoleRoleCompartment_5004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.EMPTY_LIST;
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) containerView
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getModel_79SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.EMPTY_LIST;
		}
		edu.toronto.cs.openome_model.Model modelElement = (edu.toronto.cs.openome_model.Model) view
				.getElement();
		List result = new LinkedList();
		for (Iterator it = modelElement.getContainers().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Container childElement = (edu.toronto.cs.openome_model.Container) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		for (Iterator it = modelElement.getIntentions().iterator(); it
				.hasNext();) {
			edu.toronto.cs.openome_model.Intention childElement = (edu.toronto.cs.openome_model.Intention) it
					.next();
			int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
			if (visualID == edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID) {
				result
						.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor(
								childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List getContainedLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			return getModel_79ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_1001ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_1002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_1003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_1004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_1005ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1006ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_1007ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_1008ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_2001ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_2003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_2004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_2005ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_2007ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_2008ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_2009ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_2011ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_2012ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_2013ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_2015ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_2016ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_3001ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3004ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3005ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3006ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return getSomePlusContribution_3008ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return getSomeMinusContribution_3009ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			return getUnknownContribution_3010ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			return getAndContribution_3011ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			return getOrContribution_3012ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return getIsAAssociation_3013ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return getCoversAssociation_3014ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return getOccupiesAssociation_3015ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return getIsPartOfAssociation_3016ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return getPlaysAssociation_3017ContainedLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return getINSAssociation_3018ContainedLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIncomingLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_1001IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_1002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_1003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_1004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_1005IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1006IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_1007IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_1008IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_2001IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_2003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_2004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_2005IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_2007IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_2008IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_2009IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_2011IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_2012IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_2013IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_2015IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_2016IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_3001IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3004IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3005IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3006IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return getSomePlusContribution_3008IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return getSomeMinusContribution_3009IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			return getUnknownContribution_3010IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			return getAndContribution_3011IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			return getOrContribution_3012IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return getIsAAssociation_3013IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return getCoversAssociation_3014IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return getOccupiesAssociation_3015IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return getIsPartOfAssociation_3016IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return getPlaysAssociation_3017IncomingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return getINSAssociation_3018IncomingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOutgoingLinks(View view) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			return getActor_1001OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			return getAgent_1002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			return getPosition_1003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			return getRole_1004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			return getGoal_1005OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			return getSoftgoal_1006OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			return getTask_1007OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return getResource_1008OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			return getGoal_2001OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			return getSoftgoal_2002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			return getResource_2003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			return getTask_2004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			return getGoal_2005OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			return getSoftgoal_2006OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			return getResource_2007OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			return getTask_2008OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			return getGoal_2009OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			return getSoftgoal_2010OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			return getResource_2011OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			return getTask_2012OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			return getGoal_2013OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			return getSoftgoal_2014OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			return getResource_2015OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			return getTask_2016OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID:
			return getDependency_3001OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID:
			return getAndDecomposition_3002OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID:
			return getOrDecomposition_3003OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			return getHelpContribution_3004OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			return getHurtContribution_3005OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			return getMakeContribution_3006OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			return getBreakContribution_3007OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			return getSomePlusContribution_3008OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			return getSomeMinusContribution_3009OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			return getUnknownContribution_3010OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			return getAndContribution_3011OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			return getOrContribution_3012OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			return getIsAAssociation_3013OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			return getCoversAssociation_3014OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			return getOccupiesAssociation_3015OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			return getIsPartOfAssociation_3016OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			return getPlaysAssociation_3017OutgoingLinks(view);
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			return getINSAssociation_3018OutgoingLinks(view);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getModel_79ContainedLinks(View view) {
		edu.toronto.cs.openome_model.Model modelElement = (edu.toronto.cs.openome_model.Model) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getContainedTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OrContribution_3012(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_IsAAssociation_3013(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_CoversAssociation_3014(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_OccupiesAssociation_3015(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_IsPartOfAssociation_3016(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_PlaysAssociation_3017(modelElement));
		result
				.addAll(getContainedTypeModelFacetLinks_INSAssociation_3018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_1007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_1008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3004ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3005ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3006ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomePlusContribution_3008ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomeMinusContribution_3009ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUnknownContribution_3010ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndContribution_3011ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrContribution_3012ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAAssociation_3013ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCoversAssociation_3014ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOccupiesAssociation_3015ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsPartOfAssociation_3016ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlaysAssociation_3017ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getINSAssociation_3018ContainedLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsAAssociation_3013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CoversAssociation_3014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OccupiesAssociation_3015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsPartOfAssociation_3016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PlaysAssociation_3017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_INSAssociation_3018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsAAssociation_3013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CoversAssociation_3014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OccupiesAssociation_3015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsPartOfAssociation_3016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PlaysAssociation_3017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_INSAssociation_3018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsAAssociation_3013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CoversAssociation_3014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OccupiesAssociation_3015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsPartOfAssociation_3016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PlaysAssociation_3017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_INSAssociation_3018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsAAssociation_3013(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_CoversAssociation_3014(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OccupiesAssociation_3015(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_IsPartOfAssociation_3016(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_PlaysAssociation_3017(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_INSAssociation_3018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1005IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1006IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_1007IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_1008IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2007IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016IncomingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		Map crossReferences = EcoreUtil.CrossReferencer.find(view.eResource()
				.getResourceSet().getResources());
		List result = new LinkedList();
		result.addAll(getIncomingTypeModelFacetLinks_Dependency_3001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndDecomposition_3002(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrDecomposition_3003(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HelpContribution_3004(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_HurtContribution_3005(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MakeContribution_3006(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_BreakContribution_3007(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
				modelElement, crossReferences));
		result
				.addAll(getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
						modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_UnknownContribution_3010(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_AndContribution_3011(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_OrContribution_3012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3004IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3005IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3006IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomePlusContribution_3008IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomeMinusContribution_3009IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUnknownContribution_3010IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndContribution_3011IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrContribution_3012IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAAssociation_3013IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCoversAssociation_3014IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOccupiesAssociation_3015IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsPartOfAssociation_3016IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlaysAssociation_3017IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getINSAssociation_3018IncomingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getActor_1001OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Actor modelElement = (edu.toronto.cs.openome_model.Actor) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsAAssociation_3013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CoversAssociation_3014(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OccupiesAssociation_3015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsPartOfAssociation_3016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_PlaysAssociation_3017(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_INSAssociation_3018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getAgent_1002OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Agent modelElement = (edu.toronto.cs.openome_model.Agent) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsAAssociation_3013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CoversAssociation_3014(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OccupiesAssociation_3015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsPartOfAssociation_3016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_PlaysAssociation_3017(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_INSAssociation_3018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getPosition_1003OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Position modelElement = (edu.toronto.cs.openome_model.Position) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsAAssociation_3013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CoversAssociation_3014(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OccupiesAssociation_3015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsPartOfAssociation_3016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_PlaysAssociation_3017(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_INSAssociation_3018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getRole_1004OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Role modelElement = (edu.toronto.cs.openome_model.Role) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsAAssociation_3013(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_CoversAssociation_3014(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OccupiesAssociation_3015(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_IsPartOfAssociation_3016(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_PlaysAssociation_3017(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_INSAssociation_3018(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_1005OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_1006OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_1007OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_1008OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2001OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2002OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2003OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2004OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2005OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2006OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2007OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2008OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2009OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2010OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2011OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2012OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getGoal_2013OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Goal modelElement = (edu.toronto.cs.openome_model.Goal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getSoftgoal_2014OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Softgoal modelElement = (edu.toronto.cs.openome_model.Softgoal) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getResource_2015OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Resource modelElement = (edu.toronto.cs.openome_model.Resource) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getTask_2016OutgoingLinks(View view) {
		edu.toronto.cs.openome_model.Task modelElement = (edu.toronto.cs.openome_model.Task) view
				.getElement();
		List result = new LinkedList();
		result
				.addAll(getOutgoingTypeModelFacetLinks_Dependency_3001(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndDecomposition_3002(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrDecomposition_3003(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HelpContribution_3004(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_HurtContribution_3005(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_MakeContribution_3006(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_BreakContribution_3007(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_UnknownContribution_3010(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_AndContribution_3011(modelElement));
		result
				.addAll(getOutgoingTypeModelFacetLinks_OrContribution_3012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List getDependency_3001OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndDecomposition_3002OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrDecomposition_3003OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHelpContribution_3004OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getHurtContribution_3005OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getMakeContribution_3006OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getBreakContribution_3007OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomePlusContribution_3008OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getSomeMinusContribution_3009OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getUnknownContribution_3010OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getAndContribution_3011OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOrContribution_3012OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsAAssociation_3013OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getCoversAssociation_3014OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getOccupiesAssociation_3015OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getIsPartOfAssociation_3016OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getPlaysAssociation_3017OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public static List getINSAssociation_3018OutgoingLinks(View view) {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_Dependency_3001(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependable dst = link
					.getDependencyFrom();
			edu.toronto.cs.openome_model.Dependable src = link
					.getDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_AndDecomposition_3002(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OrDecomposition_3003(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HelpContribution_3004(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.HelpContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HelpContribution link = (edu.toronto.cs.openome_model.HelpContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004,
							edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_HurtContribution_3005(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.HurtContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HurtContribution link = (edu.toronto.cs.openome_model.HurtContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005,
							edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_MakeContribution_3006(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.MakeContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.MakeContribution link = (edu.toronto.cs.openome_model.MakeContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006,
							edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_BreakContribution_3007(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.BreakContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.BreakContribution link = (edu.toronto.cs.openome_model.BreakContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007,
							edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SomePlusContribution_3008(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.SomePlusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomePlusContribution link = (edu.toronto.cs.openome_model.SomePlusContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_SomeMinusContribution_3009(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.SomeMinusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomeMinusContribution link = (edu.toronto.cs.openome_model.SomeMinusContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_UnknownContribution_3010(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.UnknownContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.UnknownContribution link = (edu.toronto.cs.openome_model.UnknownContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010,
							edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_AndContribution_3011(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.AndContribution link = (edu.toronto.cs.openome_model.AndContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OrContribution_3012(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.OrContribution link = (edu.toronto.cs.openome_model.OrContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_IsAAssociation_3013(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.IsAAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsAAssociation link = (edu.toronto.cs.openome_model.IsAAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_CoversAssociation_3014(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.CoversAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.CoversAssociation link = (edu.toronto.cs.openome_model.CoversAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014,
							edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_OccupiesAssociation_3015(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OccupiesAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.OccupiesAssociation link = (edu.toronto.cs.openome_model.OccupiesAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015,
							edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_IsPartOfAssociation_3016(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.IsPartOfAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsPartOfAssociation link = (edu.toronto.cs.openome_model.IsPartOfAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_PlaysAssociation_3017(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.PlaysAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.PlaysAssociation link = (edu.toronto.cs.openome_model.PlaysAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017,
							edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getContainedTypeModelFacetLinks_INSAssociation_3018(
			edu.toronto.cs.openome_model.Model container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.INSAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.INSAssociation link = (edu.toronto.cs.openome_model.INSAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018,
							edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_Dependency_3001(
			edu.toronto.cs.openome_model.Dependable target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getDependency_DependencyFrom()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependable src = link
					.getDependencyTo();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_AndDecomposition_3002(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OrDecomposition_3003(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getDecomposition_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HelpContribution_3004(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.HelpContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HelpContribution link = (edu.toronto.cs.openome_model.HelpContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004,
							edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_HurtContribution_3005(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.HurtContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HurtContribution link = (edu.toronto.cs.openome_model.HurtContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005,
							edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_MakeContribution_3006(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.MakeContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.MakeContribution link = (edu.toronto.cs.openome_model.MakeContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006,
							edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_BreakContribution_3007(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.BreakContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.BreakContribution link = (edu.toronto.cs.openome_model.BreakContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007,
							edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SomePlusContribution_3008(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.SomePlusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomePlusContribution link = (edu.toronto.cs.openome_model.SomePlusContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_SomeMinusContribution_3009(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.SomeMinusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomeMinusContribution link = (edu.toronto.cs.openome_model.SomeMinusContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_UnknownContribution_3010(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.UnknownContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.UnknownContribution link = (edu.toronto.cs.openome_model.UnknownContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010,
							edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_AndContribution_3011(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.AndContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.AndContribution link = (edu.toronto.cs.openome_model.AndContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OrContribution_3012(
			edu.toronto.cs.openome_model.Intention target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContribution_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.OrContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.OrContribution link = (edu.toronto.cs.openome_model.OrContribution) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_IsAAssociation_3013(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.IsAAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsAAssociation link = (edu.toronto.cs.openome_model.IsAAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_CoversAssociation_3014(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.CoversAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.CoversAssociation link = (edu.toronto.cs.openome_model.CoversAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014,
							edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_OccupiesAssociation_3015(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.OccupiesAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.OccupiesAssociation link = (edu.toronto.cs.openome_model.OccupiesAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015,
							edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_IsPartOfAssociation_3016(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.IsPartOfAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsPartOfAssociation link = (edu.toronto.cs.openome_model.IsPartOfAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_PlaysAssociation_3017(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.PlaysAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.PlaysAssociation link = (edu.toronto.cs.openome_model.PlaysAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017,
							edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getIncomingTypeModelFacetLinks_INSAssociation_3018(
			edu.toronto.cs.openome_model.Container target, Map crossReferences) {
		Collection result = new LinkedList();
		Collection settings = (Collection) crossReferences.get(target);
		for (Iterator it = settings.iterator(); it.hasNext();) {
			EStructuralFeature.Setting setting = (EStructuralFeature.Setting) it
					.next();
			if (setting.getEStructuralFeature() != edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAssociation_Target()
					|| false == setting.getEObject() instanceof edu.toronto.cs.openome_model.INSAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.INSAssociation link = (edu.toronto.cs.openome_model.INSAssociation) setting
					.getEObject();
			if (edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container src = link.getSource();
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							target,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018,
							edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_Dependency_3001(
			edu.toronto.cs.openome_model.Dependable source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDependencies().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.Dependency) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependency link = (edu.toronto.cs.openome_model.Dependency) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Dependable dst = link
					.getDependencyFrom();
			edu.toronto.cs.openome_model.Dependable src = link
					.getDependencyTo();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001,
							edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_AndDecomposition_3002(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.AndDecomposition link = (edu.toronto.cs.openome_model.AndDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OrDecomposition_3003(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getDecompositions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrDecomposition) {
				continue;
			}
			edu.toronto.cs.openome_model.OrDecomposition link = (edu.toronto.cs.openome_model.OrDecomposition) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HelpContribution_3004(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.HelpContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HelpContribution link = (edu.toronto.cs.openome_model.HelpContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004,
							edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_HurtContribution_3005(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.HurtContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.HurtContribution link = (edu.toronto.cs.openome_model.HurtContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005,
							edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_MakeContribution_3006(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.MakeContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.MakeContribution link = (edu.toronto.cs.openome_model.MakeContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006,
							edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_BreakContribution_3007(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.BreakContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.BreakContribution link = (edu.toronto.cs.openome_model.BreakContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007,
							edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SomePlusContribution_3008(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.SomePlusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomePlusContribution link = (edu.toronto.cs.openome_model.SomePlusContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_SomeMinusContribution_3009(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.SomeMinusContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.SomeMinusContribution link = (edu.toronto.cs.openome_model.SomeMinusContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009,
							edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_UnknownContribution_3010(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.UnknownContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.UnknownContribution link = (edu.toronto.cs.openome_model.UnknownContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010,
							edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_AndContribution_3011(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.AndContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.AndContribution link = (edu.toronto.cs.openome_model.AndContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011,
							edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OrContribution_3012(
			edu.toronto.cs.openome_model.Intention source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getContributions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OrContribution) {
				continue;
			}
			edu.toronto.cs.openome_model.OrContribution link = (edu.toronto.cs.openome_model.OrContribution) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Intention dst = link.getTarget();
			edu.toronto.cs.openome_model.Intention src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012,
							edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_IsAAssociation_3013(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.IsAAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsAAssociation link = (edu.toronto.cs.openome_model.IsAAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_CoversAssociation_3014(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.CoversAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.CoversAssociation link = (edu.toronto.cs.openome_model.CoversAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014,
							edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_OccupiesAssociation_3015(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.OccupiesAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.OccupiesAssociation link = (edu.toronto.cs.openome_model.OccupiesAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015,
							edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_IsPartOfAssociation_3016(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.IsPartOfAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.IsPartOfAssociation link = (edu.toronto.cs.openome_model.IsPartOfAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016,
							edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_PlaysAssociation_3017(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.PlaysAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.PlaysAssociation link = (edu.toronto.cs.openome_model.PlaysAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017,
							edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection getOutgoingTypeModelFacetLinks_INSAssociation_3018(
			edu.toronto.cs.openome_model.Container source) {
		edu.toronto.cs.openome_model.Model container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof edu.toronto.cs.openome_model.Model) {
				container = (edu.toronto.cs.openome_model.Model) element;
			}
		}
		if (container == null) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		for (Iterator links = container.getAssociations().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof edu.toronto.cs.openome_model.INSAssociation) {
				continue;
			}
			edu.toronto.cs.openome_model.INSAssociation link = (edu.toronto.cs.openome_model.INSAssociation) linkObject;
			if (edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID != edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			edu.toronto.cs.openome_model.Container dst = link.getTarget();
			edu.toronto.cs.openome_model.Container src = link.getSource();
			if (src != source) {
				continue;
			}
			result
					.add(new edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor(
							src,
							dst,
							link,
							edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018,
							edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
		}
		return result;
	}

}
