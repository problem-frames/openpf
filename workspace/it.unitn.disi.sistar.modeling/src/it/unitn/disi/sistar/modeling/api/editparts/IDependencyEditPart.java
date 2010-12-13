package it.unitn.disi.sistar.modeling.api.editparts;

import it.unitn.disi.sistar.modeling.tropos.Dependency;

public interface IDependencyEditPart {
	public void changeRepresentation(boolean useTroposModel);
	
	public Dependency getElement();
}
