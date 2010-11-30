package uk.ac.open.rbac.rbac.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import uk.ac.open.rbac.rbac.diagram.edit.commands.ObjectCreateCommand;
import uk.ac.open.rbac.rbac.diagram.edit.commands.RoleCreateCommand;
import uk.ac.open.rbac.rbac.diagram.edit.commands.SessionCreateCommand;
import uk.ac.open.rbac.rbac.diagram.edit.commands.UserCreateCommand;
import uk.ac.open.rbac.rbac.diagram.providers.RBACElementTypes;

/**
 * @generated
 */
public class ModelItemSemanticEditPolicy extends RBACBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ModelItemSemanticEditPolicy() {
		super(RBACElementTypes.Model_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (RBACElementTypes.Role_2001 == req.getElementType()) {
			return getGEFWrapper(new RoleCreateCommand(req));
		}
		if (RBACElementTypes.User_2002 == req.getElementType()) {
			return getGEFWrapper(new UserCreateCommand(req));
		}
		if (RBACElementTypes.Session_2003 == req.getElementType()) {
			return getGEFWrapper(new SessionCreateCommand(req));
		}
		if (RBACElementTypes.Object_2004 == req.getElementType()) {
			return getGEFWrapper(new ObjectCreateCommand(req));
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
