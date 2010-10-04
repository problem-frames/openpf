
package org.xtext.example.mydsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ArgumentsStandaloneSetup extends ArgumentsStandaloneSetupGenerated{

	public static void doSetup() {
		new ArgumentsStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

