
package eu.securechange;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SituationStandaloneSetup extends SituationStandaloneSetupGenerated{

	public static void doSetup() {
		new SituationStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

