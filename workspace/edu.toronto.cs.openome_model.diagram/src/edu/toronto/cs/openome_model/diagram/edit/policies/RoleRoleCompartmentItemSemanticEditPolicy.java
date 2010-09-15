package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class RoleRoleCompartmentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RoleRoleCompartmentItemSemanticEditPolicy() {
		super(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Goal5CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Softgoal5CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Resource5CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Task5CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
