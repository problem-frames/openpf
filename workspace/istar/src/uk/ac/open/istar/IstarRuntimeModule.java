/*
 * generated by Xtext
 */
package uk.ac.open.istar;

import org.eclipse.xtext.example.gmf.resource.QualifiedNameFragmentProvider;
import org.eclipse.xtext.linking.ILinkingService;
import org.eclipse.xtext.parser.antlr.IReferableElementsUnloader;
import org.eclipse.xtext.resource.IFragmentProvider;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.validation.impl.ConcreteSyntaxEValidator;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class IstarRuntimeModule extends uk.ac.open.istar.AbstractIstarRuntimeModule {
	public Class<? extends ILinkingService> bindILinkingService() {
		return IstarIDLinking.class;
	}
	@Override
	public Class<? extends IFragmentProvider> bindIFragmentProvider() {
		return QualifiedNameFragmentProvider.class;
	}

	public Class<? extends IReferableElementsUnloader> bindIReferableElementsUnloader() {
		return IReferableElementsUnloader.GenericUnloader.class;
	}

	@SingletonBinding(eager = true)
	public Class<? extends ConcreteSyntaxEValidator> bindConcreteSyntaxEValidator() {
		return ConcreteSyntaxEValidator.class;
	}
	
	
}