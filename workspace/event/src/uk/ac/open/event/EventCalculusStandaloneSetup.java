
package uk.ac.open.event;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class EventCalculusStandaloneSetup extends EventCalculusStandaloneSetupGenerated{

	public static void doSetup() {
		new EventCalculusStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

