package uk.ac.open.rbac.diagram.edit.part;

import uk.ac.open.rbac.rbac.diagram.providers.RBACEditPartProvider;


public class RBACEditPartProviderOverride extends RBACEditPartProvider {

	public RBACEditPartProviderOverride() {
		setFactory(new RBACEditPartFactoryOverride());
	}
}
