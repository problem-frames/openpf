
package uk.ac.open;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ProblemStandaloneSetup extends ProblemStandaloneSetupGenerated{

	public static void doSetup() {
		new ProblemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

