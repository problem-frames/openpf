package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConnectionBendpointEditPolicy;

public class TroposConnectionBendpointEditPolicy extends ConnectionBendpointEditPolicy{

	@Override
	public Command getCommand(Request request) {
		System.out.println("get command " + request.getClass().getCanonicalName());
		return super.getCommand(request);
	}
}
