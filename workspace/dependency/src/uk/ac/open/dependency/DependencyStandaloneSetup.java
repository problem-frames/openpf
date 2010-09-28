
package uk.ac.open.dependency;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DependencyStandaloneSetup extends DependencyStandaloneSetupGenerated{

	public static void doSetup() {
		new DependencyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

