/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.doDelegationDirect
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
 * Generated automatically from pattern secmer.ontology.doDelegationDirect
 */
public class PatternBuilderFordoDelegationDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.doDelegationDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.doDelegationDirect");
		
		final Address<? extends Receiver> var_584 = buildable.patternCollector("secmer.ontology.doDelegationDirect");
		final Stub<Address<? extends Supplier>> var_585 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_586 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "DependencyType", "Dependum"}), "secmer.ontology.dependency");
		final TupleMask var_587 = new TupleMask(new int[] {}, 0);
		final TupleMask var_588 = new TupleMask(new int[] {}, 4);
		final TupleMask var_589 = new TupleMask(new int[] {0, 1, 2, 3}, 4);
		final Stub<Address<? extends Supplier>> var_590 = buildable.buildBetaNode(var_585, var_586, var_587, var_588, var_589, false);
		final AbstractEvaluator var_591 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(2).toString(),"DELEGATION_EXECUTION");
			}
		};
		final Stub<Address<? extends Supplier>> var_592 = buildable.buildPredicateChecker(var_591, null, new int[] {2}, var_590);
		final TupleMask var_593 = new TupleMask(new int[] {0, 1, 3}, 4);
		final Stub<Address<? extends Supplier>> var_594 = buildable.buildTrimmer(var_592, var_593);
		buildable.buildConnection(var_594, var_584);
		return var_584;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.doDelegationDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Act1", 0);
			posMapping.put("Act2", 1);
			posMapping.put("Dependum", 2);

		}
		return posMapping;
	}
}
