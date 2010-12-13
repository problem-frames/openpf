package eu.securechange.secmer.casetool.core.rules;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

public interface IEvolutionRule {
	public abstract void install(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException;
	public abstract void uninstall(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException;
}