/*
 * 
 */
package eu.securechange.situation.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import eu.securechange.situation.diagram.edit.commands.Entity2CreateCommand;
import eu.securechange.situation.diagram.providers.SituationElementTypes;

/**
 * @generated
 */
public class DomainDomainPropertiesCompartmentItemSemanticEditPolicy extends
		SituationBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DomainDomainPropertiesCompartmentItemSemanticEditPolicy() {
		super(SituationElementTypes.Domain_2002);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SituationElementTypes.Entity_3001 == req.getElementType()) {
			return getGEFWrapper(new Entity2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
