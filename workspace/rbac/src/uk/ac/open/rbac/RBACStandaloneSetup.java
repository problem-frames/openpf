
package uk.ac.open.rbac;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RBACStandaloneSetup extends RBACStandaloneSetupGenerated{

	public static void doSetup() {
		new RBACStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

