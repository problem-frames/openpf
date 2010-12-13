package eu.securechange.secmer.casetool.security.rules;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.security.UntrustedDelegationMatcher;
import signatures.secmer.security.UntrustedDelegationSignature;
import eu.securechange.secmer.casetool.core.rules.AppearRule;

public class UntrustedDelegation extends AppearRule<UntrustedDelegationSignature> {

	@Override
	protected IncQueryMatcher<UntrustedDelegationSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new UntrustedDelegationMatcher(resourceSet);
	}

	@Override
	protected boolean isSafe() {
		return true;
	}

	@Override
	protected void react(final UntrustedDelegationSignature signature) {
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				MessageDialog.openWarning(null, getClass().getSimpleName(), signature.toString());
			}
		});
	}

}
