package eu.securechange.secmer.casetool.core.rules;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.ResourceSetListenerImpl;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

/**
 * TODO PROBLEM: what if installed on multiple editing domains at once?
 * @author Bergmann Gábor
 *
 * @param <GuardSignature>
 */
public abstract class BaseEvolutionRule<GuardSignature extends IPatternSignature> implements IEvolutionRule {

	protected IncQueryMatcher<GuardSignature> matcher;
	protected TransactionalEditingDomain trDomain;

	protected abstract Command applyRule();
	protected abstract IncQueryMatcher<GuardSignature> initMatcher(ResourceSet resourceSet)
			throws ViatraCompiledRuntimeException;
	
	// Are the conditions safe to operate? E.g. after model loading. Feel free to override.
	protected abstract boolean isSafe();
	// How to react to a single signature
	protected abstract void react(GuardSignature signature);


	public BaseEvolutionRule() {
		super();
	}

	/* (non-Javadoc)
	 * @see eu.securechange.secmer.casetool.core.rules.EvolutionRule#install(org.eclipse.emf.transaction.TransactionalEditingDomain)
	 */
	@Override
	public void install(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException {
		this.trDomain = trDomain;
		this.matcher = initMatcher(trDomain.getResourceSet());
		trDomain.addResourceSetListener(hook);
	}
	
	@Override
	public void uninstall(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException {
		trDomain.removeResourceSetListener(hook);
	}
	
	protected ResourceSetListener hook = 
		new ResourceSetListenerImpl() {
			@Override
			public Command transactionAboutToCommit(ResourceSetChangeEvent event) throws RollbackException {
				return (isSafe()) ? applyRule() : null;
			}
		};


}