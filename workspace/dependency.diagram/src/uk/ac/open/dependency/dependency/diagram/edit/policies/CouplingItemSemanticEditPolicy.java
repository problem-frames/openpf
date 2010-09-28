package uk.ac.open.dependency.dependency.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import uk.ac.open.dependency.dependency.diagram.providers.DependencyElementTypes;

/**
 * @generated
 */
public class CouplingItemSemanticEditPolicy extends
		DependencyBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CouplingItemSemanticEditPolicy() {
		super(DependencyElementTypes.Coupling_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
