
/*
 * generated by Xtext
 */
 
package uk.ac.open.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class ProblemExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return uk.ac.open.ui.internal.ProblemActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return uk.ac.open.ui.internal.ProblemActivator.getInstance().getInjector("uk.ac.open.Problem");
	}
	
}