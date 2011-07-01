
package argument.argument;

import argument.ArgumentStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArgumentStandaloneSetup extends ArgumentStandaloneSetupGenerated{

	public static void doSetup() {
		new ArgumentStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

