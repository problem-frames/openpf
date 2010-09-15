package edu.toronto.cs.openome_model.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy
		extends
		edu.toronto.cs.openome_model.diagram.edit.policies.Openome_modelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelItemSemanticEditPolicy() {
		super(
				edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Model_79);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ActorCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.AgentCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.PositionCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.RoleCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.SoftgoalCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.TaskCreateCommand(
					req));
		}
		if (edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008 == req
				.getElementType()) {
			return getGEFWrapper(new edu.toronto.cs.openome_model.diagram.edit.commands.ResourceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
