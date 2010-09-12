
package eu.securechange;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class OntologyStandaloneSetup extends OntologyStandaloneSetupGenerated{

	public static void doSetup() {
		new OntologyStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

