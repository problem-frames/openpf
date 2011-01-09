package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class AgentAgentCompartmentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public AgentAgentCompartmentItemSemanticEditPolicy() {
		super(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Goal3CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Softgoal3CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Resource3CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Task3CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
