
package uk.ac.open.argument;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArgumentStandaloneSetup extends ArgumentStandaloneSetupGenerated{

	public static void doSetup() {
		new ArgumentStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

