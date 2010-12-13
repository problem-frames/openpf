/*******************************************************************************
 * EMF Specific API of the secmer.sistar.wrap.decomposeDirectOR pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.secmer.sistar.wrap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.BaseGeneratedMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.secmer.sistar.wrap.DecomposeDirectORSignature;

/**
 * Generated domain-specific pattern matcher API of of the secmer.sistar.wrap.decomposeDirectOR pattern
 */
public class DecomposeDirectORMatcher extends BaseGeneratedMatcher<DecomposeDirectORSignature> implements IncQueryMatcher<DecomposeDirectORSignature>{

	/**
	 * Initializes the pattern matcher over a given EMF root. 
	 * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon updates from the given EMF root and below.
	 * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
	 * @param numThreads 0 for single-threaded execution (recommended), 
	 *   or a positive number of separate threads of pattern matter execution (experimental).
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public DecomposeDirectORMatcher(Notifier emfRoot, int numThreads) 
			throws ViatraCompiledRuntimeException {
		super(emfRoot, numThreads);
	}

	/**
	 * Initializes the pattern matcher over a given EMF root. 
	 * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon updates from the given EMF root and below.
	 * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public DecomposeDirectORMatcher(Notifier emfRoot) 
			throws ViatraCompiledRuntimeException {
		super(emfRoot);
	}

	/**
	 * Initializes the pattern matcher over a given EMF transactional editing domain. 
	 * If a pattern matcher is already constructed with the same editing domain, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon committed EMF transactions.
	 * @param trDomain the EMF transactional editing domain over which the pattern matcher will operate.
	 * @param numThreads 0 for single-threaded execution (recommended), 
	 *  or a positive number of separate threads of pattern matter execution (experimental).
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public DecomposeDirectORMatcher(TransactionalEditingDomain trDomain, int numThreads) 
			throws ViatraCompiledRuntimeException {
		super(trDomain, numThreads);
	}

	/**
	 * Initializes the pattern matcher over a given EMF transactional editing domain. 
	 * If a pattern matcher is already constructed with the same editing domain, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon committed EMF transactions.
	 * @param trDomain the EMF transactional editing domain over which the pattern matcher will operate.
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public DecomposeDirectORMatcher(TransactionalEditingDomain trDomain)
			throws ViatraCompiledRuntimeException {
		super(trDomain);
	}
	
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object Parent, Object Child) {
		return getAllMatchesAsArray(new Object[] {Parent, Child});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return matches represented as a DecomposeDirectORSignature object.
	 */
	public Collection<DecomposeDirectORSignature> getAllMatchesAsObject(Object Parent, Object Child) {
		return getAllMatchesAsObject(new Object[] {Parent, Child});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object Parent, Object Child) {
		return getOneMatchAsArray(new Object[] {Parent, Child});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return a match represented as a DecomposeDirectORSignature object, or null if no match is found.
	 */
	public DecomposeDirectORSignature getOneMatchAsObject(Object Parent, Object Child) {
		return getOneMatchAsObject(new Object[] {Parent, Child});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object Parent, Object Child) {
		return hasMatch(new Object[] {Parent, Child});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param Parent the fixed value of pattern parameter Parent, or null if not bound.
	 * @param Child the fixed value of pattern parameter Child, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object Parent, Object Child) {
		return countMatches(new Object[] {Parent, Child});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "secmer.sistar.wrap.decomposeDirectOR";
	}

	private static final String[] paramNames = new String[] {"Parent", "Child"};
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#getParameterNames()
	 */
	@Override
	public String[] getParameterNames() {
		return paramNames;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.BaseGeneratedMatcher#tupleToSignature(org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple)
	 */
	@Override
	protected DecomposeDirectORSignature tupleToSignature(Tuple t) {
		return new DecomposeDirectORSignature(t.get(0), t.get(1));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public DecomposeDirectORSignature arrayToSignature(Object[] signature) {
		return new DecomposeDirectORSignature(signature[0], signature[1]);
	}	
		
}
