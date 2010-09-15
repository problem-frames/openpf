
package uk.ac.open.istar;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class IstarStandaloneSetup extends IstarStandaloneSetupGenerated{

	public static void doSetup() {
		new IstarStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

