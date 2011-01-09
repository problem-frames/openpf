package edu.toronto.cs.openome_model.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser actorName_4009Parser;

	/**
	 * @generated
	 */
	private IParser getActorName_4009Parser() {
		if (actorName_4009Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContainer_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			actorName_4009Parser = parser;
		}
		return actorName_4009Parser;
	}

	/**
	 * @generated
	 */
	private IParser agentName_4018Parser;

	/**
	 * @generated
	 */
	private IParser getAgentName_4018Parser() {
		if (agentName_4018Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContainer_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			agentName_4018Parser = parser;
		}
		return agentName_4018Parser;
	}

	/**
	 * @generated
	 */
	private IParser positionName_4027Parser;

	/**
	 * @generated
	 */
	private IParser getPositionName_4027Parser() {
		if (positionName_4027Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContainer_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			positionName_4027Parser = parser;
		}
		return positionName_4027Parser;
	}

	/**
	 * @generated
	 */
	private IParser roleName_4036Parser;

	/**
	 * @generated
	 */
	private IParser getRoleName_4036Parser() {
		if (roleName_4036Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getContainer_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			roleName_4036Parser = parser;
		}
		return roleName_4036Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4037Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4037Parser() {
		if (goalName_4037Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalName_4037Parser = parser;
		}
		return goalName_4037Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4038Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4038Parser() {
		if (goalQualitativeReasoningCombinedLabel_4038Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalQualitativeReasoningCombinedLabel_4038Parser = parser;
		}
		return goalQualitativeReasoningCombinedLabel_4038Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4039Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4039Parser() {
		if (softgoalName_4039Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_4039Parser = parser;
		}
		return softgoalName_4039Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4040Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4040Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4040Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalQualitativeReasoningCombinedLabel_4040Parser = parser;
		}
		return softgoalQualitativeReasoningCombinedLabel_4040Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4041Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4041Parser() {
		if (taskName_4041Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskName_4041Parser = parser;
		}
		return taskName_4041Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4042Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4042Parser() {
		if (taskQualitativeReasoningCombinedLabel_4042Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskQualitativeReasoningCombinedLabel_4042Parser = parser;
		}
		return taskQualitativeReasoningCombinedLabel_4042Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4043Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4043Parser() {
		if (resourceName_4043Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceName_4043Parser = parser;
		}
		return resourceName_4043Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4044Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4044Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4044Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceQualitativeReasoningCombinedLabel_4044Parser = parser;
		}
		return resourceQualitativeReasoningCombinedLabel_4044Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4001Parser() {
		if (goalName_4001Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalName_4001Parser = parser;
		}
		return goalName_4001Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4002Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4002Parser() {
		if (goalQualitativeReasoningCombinedLabel_4002Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalQualitativeReasoningCombinedLabel_4002Parser = parser;
		}
		return goalQualitativeReasoningCombinedLabel_4002Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4003Parser() {
		if (softgoalName_4003Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_4003Parser = parser;
		}
		return softgoalName_4003Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4004Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4004Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4004Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalQualitativeReasoningCombinedLabel_4004Parser = parser;
		}
		return softgoalQualitativeReasoningCombinedLabel_4004Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4005Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4005Parser() {
		if (resourceName_4005Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceName_4005Parser = parser;
		}
		return resourceName_4005Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4006Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4006Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4006Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceQualitativeReasoningCombinedLabel_4006Parser = parser;
		}
		return resourceQualitativeReasoningCombinedLabel_4006Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4007Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4007Parser() {
		if (taskName_4007Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskName_4007Parser = parser;
		}
		return taskName_4007Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4008Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4008Parser() {
		if (taskQualitativeReasoningCombinedLabel_4008Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskQualitativeReasoningCombinedLabel_4008Parser = parser;
		}
		return taskQualitativeReasoningCombinedLabel_4008Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4010Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4010Parser() {
		if (goalName_4010Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalName_4010Parser = parser;
		}
		return goalName_4010Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4011Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4011Parser() {
		if (goalQualitativeReasoningCombinedLabel_4011Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalQualitativeReasoningCombinedLabel_4011Parser = parser;
		}
		return goalQualitativeReasoningCombinedLabel_4011Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4012Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4012Parser() {
		if (softgoalName_4012Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_4012Parser = parser;
		}
		return softgoalName_4012Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4013Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4013Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4013Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalQualitativeReasoningCombinedLabel_4013Parser = parser;
		}
		return softgoalQualitativeReasoningCombinedLabel_4013Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4014Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4014Parser() {
		if (resourceName_4014Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceName_4014Parser = parser;
		}
		return resourceName_4014Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4015Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4015Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4015Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceQualitativeReasoningCombinedLabel_4015Parser = parser;
		}
		return resourceQualitativeReasoningCombinedLabel_4015Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4016Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4016Parser() {
		if (taskName_4016Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskName_4016Parser = parser;
		}
		return taskName_4016Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4017Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4017Parser() {
		if (taskQualitativeReasoningCombinedLabel_4017Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskQualitativeReasoningCombinedLabel_4017Parser = parser;
		}
		return taskQualitativeReasoningCombinedLabel_4017Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4019Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4019Parser() {
		if (goalName_4019Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalName_4019Parser = parser;
		}
		return goalName_4019Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4020Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4020Parser() {
		if (goalQualitativeReasoningCombinedLabel_4020Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalQualitativeReasoningCombinedLabel_4020Parser = parser;
		}
		return goalQualitativeReasoningCombinedLabel_4020Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4021Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4021Parser() {
		if (softgoalName_4021Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_4021Parser = parser;
		}
		return softgoalName_4021Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4022Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4022Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4022Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalQualitativeReasoningCombinedLabel_4022Parser = parser;
		}
		return softgoalQualitativeReasoningCombinedLabel_4022Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4023Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4023Parser() {
		if (resourceName_4023Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceName_4023Parser = parser;
		}
		return resourceName_4023Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4024Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4024Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4024Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceQualitativeReasoningCombinedLabel_4024Parser = parser;
		}
		return resourceQualitativeReasoningCombinedLabel_4024Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4025Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4025Parser() {
		if (taskName_4025Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskName_4025Parser = parser;
		}
		return taskName_4025Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4026Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4026Parser() {
		if (taskQualitativeReasoningCombinedLabel_4026Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskQualitativeReasoningCombinedLabel_4026Parser = parser;
		}
		return taskQualitativeReasoningCombinedLabel_4026Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalName_4028Parser;

	/**
	 * @generated
	 */
	private IParser getGoalName_4028Parser() {
		if (goalName_4028Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalName_4028Parser = parser;
		}
		return goalName_4028Parser;
	}

	/**
	 * @generated
	 */
	private IParser goalQualitativeReasoningCombinedLabel_4029Parser;

	/**
	 * @generated
	 */
	private IParser getGoalQualitativeReasoningCombinedLabel_4029Parser() {
		if (goalQualitativeReasoningCombinedLabel_4029Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			goalQualitativeReasoningCombinedLabel_4029Parser = parser;
		}
		return goalQualitativeReasoningCombinedLabel_4029Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalName_4030Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalName_4030Parser() {
		if (softgoalName_4030Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalName_4030Parser = parser;
		}
		return softgoalName_4030Parser;
	}

	/**
	 * @generated
	 */
	private IParser softgoalQualitativeReasoningCombinedLabel_4031Parser;

	/**
	 * @generated
	 */
	private IParser getSoftgoalQualitativeReasoningCombinedLabel_4031Parser() {
		if (softgoalQualitativeReasoningCombinedLabel_4031Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			softgoalQualitativeReasoningCombinedLabel_4031Parser = parser;
		}
		return softgoalQualitativeReasoningCombinedLabel_4031Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceName_4032Parser;

	/**
	 * @generated
	 */
	private IParser getResourceName_4032Parser() {
		if (resourceName_4032Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceName_4032Parser = parser;
		}
		return resourceName_4032Parser;
	}

	/**
	 * @generated
	 */
	private IParser resourceQualitativeReasoningCombinedLabel_4033Parser;

	/**
	 * @generated
	 */
	private IParser getResourceQualitativeReasoningCombinedLabel_4033Parser() {
		if (resourceQualitativeReasoningCombinedLabel_4033Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			resourceQualitativeReasoningCombinedLabel_4033Parser = parser;
		}
		return resourceQualitativeReasoningCombinedLabel_4033Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskName_4034Parser;

	/**
	 * @generated
	 */
	private IParser getTaskName_4034Parser() {
		if (taskName_4034Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_Name() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskName_4034Parser = parser;
		}
		return taskName_4034Parser;
	}

	/**
	 * @generated
	 */
	private IParser taskQualitativeReasoningCombinedLabel_4035Parser;

	/**
	 * @generated
	 */
	private IParser getTaskQualitativeReasoningCombinedLabel_4035Parser() {
		if (taskQualitativeReasoningCombinedLabel_4035Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIntention_QualitativeReasoningCombinedLabel() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			taskQualitativeReasoningCombinedLabel_4035Parser = parser;
		}
		return taskQualitativeReasoningCombinedLabel_4035Parser;
	}

	/**
	 * @generated
	 */
	private IParser helpContributionContributionType_4045Parser;

	/**
	 * @generated
	 */
	private IParser getHelpContributionContributionType_4045Parser() {
		if (helpContributionContributionType_4045Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getHelpContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			helpContributionContributionType_4045Parser = parser;
		}
		return helpContributionContributionType_4045Parser;
	}

	/**
	 * @generated
	 */
	private IParser hurtContributionContributionType_4046Parser;

	/**
	 * @generated
	 */
	private IParser getHurtContributionContributionType_4046Parser() {
		if (hurtContributionContributionType_4046Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getHurtContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			hurtContributionContributionType_4046Parser = parser;
		}
		return hurtContributionContributionType_4046Parser;
	}

	/**
	 * @generated
	 */
	private IParser makeContributionContributionType_4047Parser;

	/**
	 * @generated
	 */
	private IParser getMakeContributionContributionType_4047Parser() {
		if (makeContributionContributionType_4047Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getMakeContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			makeContributionContributionType_4047Parser = parser;
		}
		return makeContributionContributionType_4047Parser;
	}

	/**
	 * @generated
	 */
	private IParser breakContributionContributionType_4048Parser;

	/**
	 * @generated
	 */
	private IParser getBreakContributionContributionType_4048Parser() {
		if (breakContributionContributionType_4048Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getBreakContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			breakContributionContributionType_4048Parser = parser;
		}
		return breakContributionContributionType_4048Parser;
	}

	/**
	 * @generated
	 */
	private IParser somePlusContributionContributionType_4049Parser;

	/**
	 * @generated
	 */
	private IParser getSomePlusContributionContributionType_4049Parser() {
		if (somePlusContributionContributionType_4049Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSomePlusContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			somePlusContributionContributionType_4049Parser = parser;
		}
		return somePlusContributionContributionType_4049Parser;
	}

	/**
	 * @generated
	 */
	private IParser someMinusContributionContributionType_4050Parser;

	/**
	 * @generated
	 */
	private IParser getSomeMinusContributionContributionType_4050Parser() {
		if (someMinusContributionContributionType_4050Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getSomeMinusContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			someMinusContributionContributionType_4050Parser = parser;
		}
		return someMinusContributionContributionType_4050Parser;
	}

	/**
	 * @generated
	 */
	private IParser unknownContributionContributionType_4051Parser;

	/**
	 * @generated
	 */
	private IParser getUnknownContributionContributionType_4051Parser() {
		if (unknownContributionContributionType_4051Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getUnknownContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			unknownContributionContributionType_4051Parser = parser;
		}
		return unknownContributionContributionType_4051Parser;
	}

	/**
	 * @generated
	 */
	private IParser andContributionContributionType_4052Parser;

	/**
	 * @generated
	 */
	private IParser getAndContributionContributionType_4052Parser() {
		if (andContributionContributionType_4052Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getAndContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			andContributionContributionType_4052Parser = parser;
		}
		return andContributionContributionType_4052Parser;
	}

	/**
	 * @generated
	 */
	private IParser orContributionContributionType_4053Parser;

	/**
	 * @generated
	 */
	private IParser getOrContributionContributionType_4053Parser() {
		if (orContributionContributionType_4053Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getOrContribution_ContributionType() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			orContributionContributionType_4053Parser = parser;
		}
		return orContributionContributionType_4053Parser;
	}

	/**
	 * @generated
	 */
	private IParser isAAssociationLabel_4054Parser;

	/**
	 * @generated
	 */
	private IParser getIsAAssociationLabel_4054Parser() {
		if (isAAssociationLabel_4054Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIsAAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			isAAssociationLabel_4054Parser = parser;
		}
		return isAAssociationLabel_4054Parser;
	}

	/**
	 * @generated
	 */
	private IParser coversAssociationLabel_4055Parser;

	/**
	 * @generated
	 */
	private IParser getCoversAssociationLabel_4055Parser() {
		if (coversAssociationLabel_4055Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getCoversAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			coversAssociationLabel_4055Parser = parser;
		}
		return coversAssociationLabel_4055Parser;
	}

	/**
	 * @generated
	 */
	private IParser occupiesAssociationLabel_4056Parser;

	/**
	 * @generated
	 */
	private IParser getOccupiesAssociationLabel_4056Parser() {
		if (occupiesAssociationLabel_4056Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getOccupiesAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			occupiesAssociationLabel_4056Parser = parser;
		}
		return occupiesAssociationLabel_4056Parser;
	}

	/**
	 * @generated
	 */
	private IParser isPartOfAssociationLabel_4057Parser;

	/**
	 * @generated
	 */
	private IParser getIsPartOfAssociationLabel_4057Parser() {
		if (isPartOfAssociationLabel_4057Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getIsPartOfAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			isPartOfAssociationLabel_4057Parser = parser;
		}
		return isPartOfAssociationLabel_4057Parser;
	}

	/**
	 * @generated
	 */
	private IParser playsAssociationLabel_4058Parser;

	/**
	 * @generated
	 */
	private IParser getPlaysAssociationLabel_4058Parser() {
		if (playsAssociationLabel_4058Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getPlaysAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			playsAssociationLabel_4058Parser = parser;
		}
		return playsAssociationLabel_4058Parser;
	}

	/**
	 * @generated
	 */
	private IParser iNSAssociationLabel_4059Parser;

	/**
	 * @generated
	 */
	private IParser getINSAssociationLabel_4059Parser() {
		if (iNSAssociationLabel_4059Parser == null) {
			EAttribute[] features = new EAttribute[] { edu.toronto.cs.openome_model.Openome_modelPackage.eINSTANCE
					.getINSAssociation_Label() };
			edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser parser = new edu.toronto.cs.openome_model.diagram.parsers.MessageFormatParser(
					features);
			iNSAssociationLabel_4059Parser = parser;
		}
		return iNSAssociationLabel_4059Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID:
			return getActorName_4009Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentNameEditPart.VISUAL_ID:
			return getAgentName_4018Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionNameEditPart.VISUAL_ID:
			return getPositionName_4027Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleNameEditPart.VISUAL_ID:
			return getRoleName_4036Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalNameEditPart.VISUAL_ID:
			return getGoalName_4037Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4038Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalNameEditPart.VISUAL_ID:
			return getSoftgoalName_4039Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningComEditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4040Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskNameEditPart.VISUAL_ID:
			return getTaskName_4041Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningComEditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4042Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceNameEditPart.VISUAL_ID:
			return getResourceName_4043Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningComEditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4044Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName2EditPart.VISUAL_ID:
			return getGoalName_4001Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4002Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName2EditPart.VISUAL_ID:
			return getSoftgoalName_4003Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4004Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName2EditPart.VISUAL_ID:
			return getResourceName_4005Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4006Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName2EditPart.VISUAL_ID:
			return getTaskName_4007Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom2EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4008Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName3EditPart.VISUAL_ID:
			return getGoalName_4010Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4011Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName3EditPart.VISUAL_ID:
			return getSoftgoalName_4012Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4013Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName3EditPart.VISUAL_ID:
			return getResourceName_4014Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4015Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName3EditPart.VISUAL_ID:
			return getTaskName_4016Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom3EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4017Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName4EditPart.VISUAL_ID:
			return getGoalName_4019Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4020Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName4EditPart.VISUAL_ID:
			return getSoftgoalName_4021Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4022Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName4EditPart.VISUAL_ID:
			return getResourceName_4023Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4024Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID:
			return getTaskName_4025Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4026Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalName5EditPart.VISUAL_ID:
			return getGoalName_4028Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getGoalQualitativeReasoningCombinedLabel_4029Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalName5EditPart.VISUAL_ID:
			return getSoftgoalName_4030Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getSoftgoalQualitativeReasoningCombinedLabel_4031Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceName5EditPart.VISUAL_ID:
			return getResourceName_4032Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getResourceQualitativeReasoningCombinedLabel_4033Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskName5EditPart.VISUAL_ID:
			return getTaskName_4034Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom5EditPart.VISUAL_ID:
			return getTaskQualitativeReasoningCombinedLabel_4035Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionContributionTypeEditPart.VISUAL_ID:
			return getHelpContributionContributionType_4045Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionContributionTypeEditPart.VISUAL_ID:
			return getHurtContributionContributionType_4046Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionContributionTypeEditPart.VISUAL_ID:
			return getMakeContributionContributionType_4047Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionContributionTypeEditPart.VISUAL_ID:
			return getBreakContributionContributionType_4048Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomePlusContributionContributionType_4049Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionContributionTypeEditPart.VISUAL_ID:
			return getSomeMinusContributionContributionType_4050Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionContributionTypeEditPart.VISUAL_ID:
			return getUnknownContributionContributionType_4051Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionContributionTypeEditPart.VISUAL_ID:
			return getAndContributionContributionType_4052Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionContributionTypeEditPart.VISUAL_ID:
			return getOrContributionContributionType_4053Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationLabelEditPart.VISUAL_ID:
			return getIsAAssociationLabel_4054Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationLabelEditPart.VISUAL_ID:
			return getCoversAssociationLabel_4055Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationLabelEditPart.VISUAL_ID:
			return getOccupiesAssociationLabel_4056Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationLabelEditPart.VISUAL_ID:
			return getIsPartOfAssociationLabel_4057Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationLabelEditPart.VISUAL_ID:
			return getPlaysAssociationLabel_4058Parser();
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationLabelEditPart.VISUAL_ID:
			return getINSAssociationLabel_4059Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
					.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
