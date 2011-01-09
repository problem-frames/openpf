package edu.toronto.cs.openome_model.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Openome_modelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "edu.toronto.cs.openome_model.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Actor_1001_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Agent_1002_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Goal_1005_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Softgoal_1006_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Task_1007_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Resource_1008_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Goal_2001_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Softgoal_2002_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Resource_2003_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Task_2004_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Goal_2005_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Softgoal_2006_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Resource_2007_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Task_2008_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Goal_2009_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Softgoal_2010_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Resource_2011_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Task_2012_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Goal_2013_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Softgoal_2014_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Resource_2015_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression Task_2016_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression AndDecomposition_3002_Constraint;

	/**
	 * @generated
	 */
	private static edu.toronto.cs.openome_model.diagram.expressions.Openome_modelAbstractExpression OrDecomposition_3003_Constraint;

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
					.equals(view.getType())) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
						.getInstance().logError(
								"Unable to parse view type as a visualID number: "
										+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getModel().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((edu.toronto.cs.openome_model.Model) domainElement)) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getModelID(containerView);
		if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())
					&& isGoal_2001((edu.toronto.cs.openome_model.Goal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())
					&& isSoftgoal_2002((edu.toronto.cs.openome_model.Softgoal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())
					&& isResource_2003((edu.toronto.cs.openome_model.Resource) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getTask().isSuperTypeOf(domainElement.eClass())
					&& isTask_2004((edu.toronto.cs.openome_model.Task) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())
					&& isGoal_2005((edu.toronto.cs.openome_model.Goal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())
					&& isSoftgoal_2006((edu.toronto.cs.openome_model.Softgoal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())
					&& isResource_2007((edu.toronto.cs.openome_model.Resource) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getTask().isSuperTypeOf(domainElement.eClass())
					&& isTask_2008((edu.toronto.cs.openome_model.Task) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())
					&& isGoal_2009((edu.toronto.cs.openome_model.Goal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())
					&& isSoftgoal_2010((edu.toronto.cs.openome_model.Softgoal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())
					&& isResource_2011((edu.toronto.cs.openome_model.Resource) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getTask().isSuperTypeOf(domainElement.eClass())
					&& isTask_2012((edu.toronto.cs.openome_model.Task) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())
					&& isGoal_2013((edu.toronto.cs.openome_model.Goal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())
					&& isSoftgoal_2014((edu.toronto.cs.openome_model.Softgoal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())
					&& isResource_2015((edu.toronto.cs.openome_model.Resource) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getTask().isSuperTypeOf(domainElement.eClass())
					&& isTask_2016((edu.toronto.cs.openome_model.Task) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getActor().isSuperTypeOf(domainElement.eClass())
					&& isActor_1001((edu.toronto.cs.openome_model.Actor) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAgent().isSuperTypeOf(domainElement.eClass())
					&& isAgent_1002((edu.toronto.cs.openome_model.Agent) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getPosition().isSuperTypeOf(domainElement.eClass())) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getRole().isSuperTypeOf(domainElement.eClass())) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getGoal().isSuperTypeOf(domainElement.eClass())
					&& isGoal_1005((edu.toronto.cs.openome_model.Goal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSoftgoal().isSuperTypeOf(domainElement.eClass())
					&& isSoftgoal_1006((edu.toronto.cs.openome_model.Softgoal) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getTask().isSuperTypeOf(domainElement.eClass())
					&& isTask_1007((edu.toronto.cs.openome_model.Task) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID;
			}
			if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getResource().isSuperTypeOf(domainElement.eClass())
					&& isResource_1008((edu.toronto.cs.openome_model.Resource) domainElement)) {
				return edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getModelID(containerView);
		if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(containerModelID)) {
			containerVisualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningComEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningComEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningComEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID:
			if (edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getDependency().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getAndDecomposition().isSuperTypeOf(domainElement.eClass())
				&& isAndDecomposition_3002((edu.toronto.cs.openome_model.AndDecomposition) domainElement)) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getOrDecomposition().isSuperTypeOf(domainElement.eClass())
				&& isOrDecomposition_3003((edu.toronto.cs.openome_model.OrDecomposition) domainElement)) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getHelpContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getHurtContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getMakeContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getBreakContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getSomePlusContribution()
				.isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getSomeMinusContribution().isSuperTypeOf(
						domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getUnknownContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getAndContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getOrContribution().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getIsAAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getCoversAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getOccupiesAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getIsPartOfAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getPlaysAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID;
		}
		if (edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
				.getINSAssociation().isSuperTypeOf(domainElement.eClass())) {
			return edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(edu.toronto.cs.openome_model.Model element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isActor_1001(
			edu.toronto.cs.openome_model.Actor domainElement) {
		if (Actor_1001_Constraint == null) { // lazy initialization
			Actor_1001_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Actor)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getActor()); //$NON-NLS-1$
		}
		Object result = Actor_1001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAgent_1002(
			edu.toronto.cs.openome_model.Agent domainElement) {
		if (Agent_1002_Constraint == null) { // lazy initialization
			Agent_1002_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Agent)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getAgent()); //$NON-NLS-1$
		}
		Object result = Agent_1002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGoal_1005(
			edu.toronto.cs.openome_model.Goal domainElement) {
		if (Goal_1005_Constraint == null) { // lazy initialization
			Goal_1005_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Goal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
		}
		Object result = Goal_1005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSoftgoal_1006(
			edu.toronto.cs.openome_model.Softgoal domainElement) {
		if (Softgoal_1006_Constraint == null) { // lazy initialization
			Softgoal_1006_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Softgoal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
		}
		Object result = Softgoal_1006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTask_1007(
			edu.toronto.cs.openome_model.Task domainElement) {
		if (Task_1007_Constraint == null) { // lazy initialization
			Task_1007_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Task)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getTask()); //$NON-NLS-1$
		}
		Object result = Task_1007_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isResource_1008(
			edu.toronto.cs.openome_model.Resource domainElement) {
		if (Resource_1008_Constraint == null) { // lazy initialization
			Resource_1008_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Resource)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getResource()); //$NON-NLS-1$
		}
		Object result = Resource_1008_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGoal_2001(
			edu.toronto.cs.openome_model.Goal domainElement) {
		if (Goal_2001_Constraint == null) { // lazy initialization
			Goal_2001_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Goal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
		}
		Object result = Goal_2001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSoftgoal_2002(
			edu.toronto.cs.openome_model.Softgoal domainElement) {
		if (Softgoal_2002_Constraint == null) { // lazy initialization
			Softgoal_2002_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Softgoal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
		}
		Object result = Softgoal_2002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isResource_2003(
			edu.toronto.cs.openome_model.Resource domainElement) {
		if (Resource_2003_Constraint == null) { // lazy initialization
			Resource_2003_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Resource)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getResource()); //$NON-NLS-1$
		}
		Object result = Resource_2003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTask_2004(
			edu.toronto.cs.openome_model.Task domainElement) {
		if (Task_2004_Constraint == null) { // lazy initialization
			Task_2004_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Task)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getTask()); //$NON-NLS-1$
		}
		Object result = Task_2004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGoal_2005(
			edu.toronto.cs.openome_model.Goal domainElement) {
		if (Goal_2005_Constraint == null) { // lazy initialization
			Goal_2005_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Goal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
		}
		Object result = Goal_2005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSoftgoal_2006(
			edu.toronto.cs.openome_model.Softgoal domainElement) {
		if (Softgoal_2006_Constraint == null) { // lazy initialization
			Softgoal_2006_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Softgoal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
		}
		Object result = Softgoal_2006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isResource_2007(
			edu.toronto.cs.openome_model.Resource domainElement) {
		if (Resource_2007_Constraint == null) { // lazy initialization
			Resource_2007_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Resource)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getResource()); //$NON-NLS-1$
		}
		Object result = Resource_2007_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTask_2008(
			edu.toronto.cs.openome_model.Task domainElement) {
		if (Task_2008_Constraint == null) { // lazy initialization
			Task_2008_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Task)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getTask()); //$NON-NLS-1$
		}
		Object result = Task_2008_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGoal_2009(
			edu.toronto.cs.openome_model.Goal domainElement) {
		if (Goal_2009_Constraint == null) { // lazy initialization
			Goal_2009_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Goal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
		}
		Object result = Goal_2009_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSoftgoal_2010(
			edu.toronto.cs.openome_model.Softgoal domainElement) {
		if (Softgoal_2010_Constraint == null) { // lazy initialization
			Softgoal_2010_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Softgoal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
		}
		Object result = Softgoal_2010_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isResource_2011(
			edu.toronto.cs.openome_model.Resource domainElement) {
		if (Resource_2011_Constraint == null) { // lazy initialization
			Resource_2011_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Resource)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getResource()); //$NON-NLS-1$
		}
		Object result = Resource_2011_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTask_2012(
			edu.toronto.cs.openome_model.Task domainElement) {
		if (Task_2012_Constraint == null) { // lazy initialization
			Task_2012_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Task)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getTask()); //$NON-NLS-1$
		}
		Object result = Task_2012_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isGoal_2013(
			edu.toronto.cs.openome_model.Goal domainElement) {
		if (Goal_2013_Constraint == null) { // lazy initialization
			Goal_2013_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Goal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getGoal()); //$NON-NLS-1$
		}
		Object result = Goal_2013_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSoftgoal_2014(
			edu.toronto.cs.openome_model.Softgoal domainElement) {
		if (Softgoal_2014_Constraint == null) { // lazy initialization
			Softgoal_2014_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Softgoal)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getSoftgoal()); //$NON-NLS-1$
		}
		Object result = Softgoal_2014_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isResource_2015(
			edu.toronto.cs.openome_model.Resource domainElement) {
		if (Resource_2015_Constraint == null) { // lazy initialization
			Resource_2015_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Resource)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getResource()); //$NON-NLS-1$
		}
		Object result = Resource_2015_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isTask_2016(
			edu.toronto.cs.openome_model.Task domainElement) {
		if (Task_2016_Constraint == null) { // lazy initialization
			Task_2016_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(Task)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getTask()); //$NON-NLS-1$
		}
		Object result = Task_2016_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAndDecomposition_3002(
			edu.toronto.cs.openome_model.AndDecomposition domainElement) {
		if (AndDecomposition_3002_Constraint == null) { // lazy initialization
			AndDecomposition_3002_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(AndDecomposition)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getAndDecomposition()); //$NON-NLS-1$
		}
		Object result = AndDecomposition_3002_Constraint
				.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isOrDecomposition_3003(
			edu.toronto.cs.openome_model.OrDecomposition domainElement) {
		if (OrDecomposition_3003_Constraint == null) { // lazy initialization
			OrDecomposition_3003_Constraint = edu.toronto.cs.openome_model.diagram.expressions.Openome_modelOCLFactory
					.getExpression(
							"oclIsKindOf(OrDecomposition)", edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE.getOrDecomposition()); //$NON-NLS-1$
		}
		Object result = OrDecomposition_3003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
