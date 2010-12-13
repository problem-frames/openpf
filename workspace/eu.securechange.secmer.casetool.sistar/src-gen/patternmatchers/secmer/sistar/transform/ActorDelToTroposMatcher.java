/*******************************************************************************
 * EMF Specific API of the secmer.sistar.transform.actorDelToTropos pattern
 * Generated by EMF-IncQuery
 *******************************************************************************/

package patternmatchers.secmer.sistar.transform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.BaseGeneratedMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;

import signatures.secmer.sistar.transform.ActorDelToTroposSignature;

/**
 * Generated domain-specific pattern matcher API of of the secmer.sistar.transform.actorDelToTropos pattern
 */
public class ActorDelToTroposMatcher extends BaseGeneratedMatcher<ActorDelToTroposSignature> implements IncQueryMatcher<ActorDelToTroposSignature>{

	/**
	 * Initializes the pattern matcher over a given EMF root. 
	 * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
	 * The match set will be incrementally refreshed upon updates from the given EMF root and below.
	 * @param emfRoot the root of the EMF tree where the pattern matcher will operate. Recommended: Resource or ResourceSet.
	 * @param numThreads 0 for single-threaded execution (recommended), 
	 *   or a positive number of separate threads of pattern matter execution (experimental).
	 * @throws ViatraCompiledRuntimeException if an error occurs during pattern matcher creation
	 */
	public ActorDelToTroposMatcher(Notifier emfRoot, int numThreads) 
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
	public ActorDelToTroposMatcher(Notifier emfRoot) 
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
	public ActorDelToTroposMatcher(TransactionalEditingDomain trDomain, int numThreads) 
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
	public ActorDelToTroposMatcher(TransactionalEditingDomain trDomain)
			throws ViatraCompiledRuntimeException {
		super(trDomain);
	}
	
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return matches represented as an array containing the values of each parameter.
	 */
	public Collection<Object[]> getAllMatchesAsArray(Object Link, Object TroposActor) {
		return getAllMatchesAsArray(new Object[] {Link, TroposActor});
	}
	
	/** 
	 * Returns the set of all pattern matches given some fixed parameters.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return matches represented as a ActorDelToTroposSignature object.
	 */
	public Collection<ActorDelToTroposSignature> getAllMatchesAsObject(Object Link, Object TroposActor) {
		return getAllMatchesAsObject(new Object[] {Link, TroposActor});
	}

	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return a match represented as an array containing the values of each parameter, or null if no match is found.
	 */
	public Object[] getOneMatchAsArray(Object Link, Object TroposActor) {
		return getOneMatchAsArray(new Object[] {Link, TroposActor});
	}
	
	/** 
	 * Returns an arbitrary pattern match given some fixed parameters.
	 * Neither determinism nor randomness of selection is guaranteed.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return a match represented as a ActorDelToTroposSignature object, or null if no match is found.
	 */
	public ActorDelToTroposSignature getOneMatchAsObject(Object Link, Object TroposActor) {
		return getOneMatchAsObject(new Object[] {Link, TroposActor});
	}
	
	/**
	 * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
	 * 	under any possible substitution of the unspecified parameters.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return true if the input is a valid (partial) match of the pattern.
	 */
	public boolean hasMatch(Object Link, Object TroposActor) {
		return hasMatch(new Object[] {Link, TroposActor});
	}
	
	/** 
	 * Returns the number of all pattern matches given some fixed parameters.
	 * @param Link the fixed value of pattern parameter Link, or null if not bound.
	 * @param TroposActor the fixed value of pattern parameter TroposActor, or null if not bound.
	 * @return the number of pattern matches found.
	 */	
	public int countMatches(Object Link, Object TroposActor) {
		return countMatches(new Object[] {Link, TroposActor});
	}
	


	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#getPatternName()
	 */
	@Override
	public String getPatternName() {
		return "secmer.sistar.transform.actorDelToTropos";
	}

	private static final String[] paramNames = new String[] {"Link", "TroposActor"};
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
	protected ActorDelToTroposSignature tupleToSignature(Tuple t) {
		return new ActorDelToTroposSignature(t.get(0), t.get(1));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher#arrayToSignature(java.lang.Object[])
	 */
	@Override
	public ActorDelToTroposSignature arrayToSignature(Object[] signature) {
		return new ActorDelToTroposSignature(signature[0], signature[1]);
	}	
		
}
