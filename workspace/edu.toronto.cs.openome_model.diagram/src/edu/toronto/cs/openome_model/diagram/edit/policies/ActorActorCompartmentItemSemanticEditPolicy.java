package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActorActorCompartmentItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActorActorCompartmentItemSemanticEditPolicy() {
		super(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Goal2CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Softgoal2CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Resource2CreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.Task2CreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

}
