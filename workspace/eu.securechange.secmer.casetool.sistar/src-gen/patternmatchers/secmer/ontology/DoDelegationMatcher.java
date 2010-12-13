/*******************************************************************************
 * EMF Specific API of the secmer.ontology.doDelegation pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.secmer.ontology;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.BaseGeneratedMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.secmer.ontology.DoDelegationSignature;

/**
 * Generated domain-specific pattern matcher API of of the secmer.ontology.doDelegation pattern
 */
public class DoDelegationMatcher extends BaseGeneratedMatcher<DoDelegationSignature> implements IncQueryMatcher<DoDelegationSignature>{

	/**
	 * Initializes the pattern matcher over a given EMF root. 
	 * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon updates from the given EMF root and below.
	 * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
	 * @param numThreads 0 for single-threaded execution (recommended), 
	 *   or a positive number of separate threads of pattern matter execution (experimental).
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public DoDelegationMatcher(Notifier emfRoot, int numThreads) 
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
	public DoDelegationMatcher(Notifier emfRoot) 
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
	public DoDelegationMatcher(TransactionalEditingDomain trDomain, int numThreads) 
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
	public DoDelegationMatcher(TransactionalEditingDomain trDomain)
			throws ViatraCompiledRuntimeException {
		super(trDomain);
	}
	
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object Act1, Object Act2, Object Dependum) {
		return getAllMatchesAsArray(new Object[] {Act1, Act2, Dependum});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return matches represented as a DoDelegationSignature object.
	 */
	public Collection<DoDelegationSignature> getAllMatchesAsObject(Object Act1, Object Act2, Object Dependum) {
		return getAllMatchesAsObject(new Object[] {Act1, Act2, Dependum});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object Act1, Object Act2, Object Dependum) {
		return getOneMatchAsArray(new Object[] {Act1, Act2, Dependum});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return a match represented as a DoDelegationSignature object, or null if no match is found.
	 */
	public DoDelegationSignature getOneMatchAsObject(Object Act1, Object Act2, Object Dependum) {
		return getOneMatchAsObject(new Object[] {Act1, Act2, Dependum});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object Act1, Object Act2, Object Dependum) {
		return hasMatch(new Object[] {Act1, Act2, Dependum});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param Act1 the fixed value of pattern parameter Act1, or null if not bound.
	 * @param Act2 the fixed value of pattern parameter Act2, or null if not bound.
	 * @param Dependum the fixed value of pattern parameter Dependum, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object Act1, Object Act2, Object Dependum) {
		return countMatches(new Object[] {Act1, Act2, Dependum});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "secmer.ontology.doDelegation";
	}

	private static final String[] paramNames = new String[] {"Act1", "Act2", "Dependum"};
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
	protected DoDelegationSignature tupleToSignature(Tuple t) {
		return new DoDelegationSignature(t.get(0), t.get(1), t.get(2));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public DoDelegationSignature arrayToSignature(Object[] signature) {
		return new DoDelegationSignature(signature[0], signature[1], signature[2]);
	}	
		
}
