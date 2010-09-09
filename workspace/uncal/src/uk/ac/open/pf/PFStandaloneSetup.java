
package uk.ac.open.pf;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PFStandaloneSetup extends PFStandaloneSetupGenerated{

	public static void doSetup() {
		new PFStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

