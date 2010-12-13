package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands.ServiceCreateCommand;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class ActorActorCompartmentItemSemanticEditPolicy extends
		TroposBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActorActorCompartmentItemSemanticEditPolicy() {
		super(TroposElementTypes.Actor_1001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TroposElementTypes.Service_2001 == req.getElementType()) {
			return getGEFWrapper(new ServiceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
