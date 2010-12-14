/*******************************************************************************
 * Pattern builder for pattern secmer.sistar.wrap.doDelegationDirect
 * Generated by EMF-IncQuery
 * Should contribute a pattern-builder to extension point
 * org.eclipse.viatra2.compiled.emf.patternmatcher.builder 
 *******************************************************************************/

package patternbuilders.secmer.sistar.wrap;

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
 * Generated automatically from pattern secmer.sistar.wrap.doDelegationDirect
 */
public class PatternBuilderFordoDelegationDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.sistar.wrap.doDelegationDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.sistar.wrap.doDelegationDirect");
		
		final Address<? extends Receiver> var_96 = buildable.patternCollector("secmer.sistar.wrap.doDelegationDirect");
		final Stub<Address<? extends Supplier>> var_97 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_98 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "DependencyType"}), "secmer.sistar.wrap.dependency");
		final TupleMask var_99 = new TupleMask(new int[] {}, 0);
		final TupleMask var_100 = new TupleMask(new int[] {}, 3);
		final TupleMask var_101 = new TupleMask(new int[] {0, 1, 2}, 3);
		final Stub<Address<? extends Supplier>> var_102 = buildable.buildBetaNode(var_97, var_98, var_99, var_100, var_101, false);
		final AbstractEvaluator var_103 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(2).toString(),"DELEGATION_EXECUTION");
			}
		};
		final Stub<Address<? extends Supplier>> var_104 = buildable.buildPredicateChecker(var_103, null, new int[] {2}, var_102);
		final TupleMask var_105 = new TupleMask(new int[] {0, 1}, 3);
		final Stub<Address<? extends Supplier>> var_106 = buildable.buildTrimmer(var_104, var_105);
		buildable.buildConnection(var_106, var_96);
		return var_96;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.sistar.wrap.doDelegationDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Act1", 0);
			posMapping.put("Act2", 1);

		}
		return posMapping;
	}
}