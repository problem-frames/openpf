/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.canDelegationDirect
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.compiled.emf.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.secmer.ontology;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra2.compiled.emf.runtime.IStatelessGeneratedRetePatternBuilder;
import org.eclipse.viatra2.compiled.emf.runtime.term.VPMTermEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.boundary.AbstractEvaluator;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.ReteContainerBuildable;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.RetePatternBuildException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.construction.Stub;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.matcher.IPatternMatcherContext;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Receiver;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.network.Supplier;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.remote.Address;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.FlatTuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.Tuple;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.tuple.TupleMask;

/**
 * Generated automatically from pattern secmer.ontology.canDelegationDirect
 */
public class PatternBuilderForcanDelegationDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.canDelegationDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.canDelegationDirect");
		
		final Address<? extends Receiver> var_225 = buildable.patternCollector("secmer.ontology.canDelegationDirect");
		final Stub<Address<? extends Supplier>> var_226 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_227 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "DependencyType", "Dependum"}), "secmer.ontology.dependency");
		final TupleMask var_228 = new TupleMask(new int[] {}, 0);
		final TupleMask var_229 = new TupleMask(new int[] {}, 4);
		final TupleMask var_230 = new TupleMask(new int[] {0, 1, 2, 3}, 4);
		final Stub<Address<? extends Supplier>> var_231 = buildable.buildBetaNode(var_226, var_227, var_228, var_229, var_230, false);
		final AbstractEvaluator var_232 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(2).toString(),"DELEGATION_PERMISSION");
			}
		};
		final Stub<Address<? extends Supplier>> var_233 = buildable.buildPredicateChecker(var_232, null, new int[] {2}, var_231);
		final TupleMask var_234 = new TupleMask(new int[] {0, 1, 3}, 4);
		final Stub<Address<? extends Supplier>> var_235 = buildable.buildTrimmer(var_233, var_234);
		buildable.buildConnection(var_235, var_225);
		return var_225;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.canDelegationDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Act1", 0);
			posMapping.put("Act2", 1);
			posMapping.put("Dependum", 2);

		}
		return posMapping;
	}
}
