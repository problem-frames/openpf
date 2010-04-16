package uk.ac.open;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class ProblemStandaloneSetup implements ISetup {

	public static void doSetup() {
		new ProblemStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		org.eclipse.xtext.common.TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new uk.ac.open.ProblemRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://open.ac.uk/problem")) {
		EPackage.Registry.INSTANCE.put("http://open.ac.uk/problem", uk.ac.open.problem.ProblemPackage.eINSTANCE);
	}

		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("pf", resourceFactory);
		



	}
}
