package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.ActorCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.Service2CreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.tools.CreateServiceTool;
import it.unitn.disi.sistar.util.PreferenceUtil;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiagramItemSemanticEditPolicy() {
		super(TroposElementTypes.Diagram_79);
	}

	/**
	 * customized
	 * @generated NOT
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TroposElementTypes.Actor_1001 == req.getElementType()) {
			return getGEFWrapper(new ActorCreateCommand(req));
		}
		// minhsang - begin
		if (TroposElementTypes.Service_2001 == req.getElementType()) {
			if (req.getParameter("SAME_OBJECT") != null
					|| EServiceType.EVENT_LITERAL.equals(req
							.getParameter(CreateServiceTool.SERVICE_TYPE))
					|| PreferenceUtil.getPreference(
							PreferenceConstants.FREE_GOAL).equals("true")) {
				// minhsang - end
				return getGEFWrapper(new Service2CreateCommand(req));
			}
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
