package it.unitn.disi.sistar.modeling.tropos.diagram.edit.commands;

import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.Relation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;

public class CreateTroposRelationshipCommand  extends CreateRelationshipCommand{

	public CreateTroposRelationshipCommand(CreateRelationshipRequest request)
	{
		super(request);
	}
	@Override
	protected EObject doDefaultElementCreation() {
		Relation newElement = (Relation) super
		.doDefaultElementCreation();
		if (newElement != null) {
			newElement.setTarget((GraphicalObject) getTarget());
			newElement.setSource((GraphicalObject) getSource());
		}
		
		return newElement;
	}
}
