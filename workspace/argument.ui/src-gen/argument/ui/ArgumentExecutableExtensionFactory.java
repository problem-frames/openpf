
/*
 * generated by Xtext
 */
 
package argument.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 *@generated
 */
public class ArgumentExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return argument.ui.internal.ArgumentActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return argument.ui.internal.ArgumentActivator.getInstance().getInjector("argument.Argument");
	}
	
}