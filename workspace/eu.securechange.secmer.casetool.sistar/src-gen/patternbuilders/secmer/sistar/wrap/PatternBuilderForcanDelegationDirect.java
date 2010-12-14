/*******************************************************************************
 * Pattern builder for pattern secmer.sistar.wrap.canDelegationDirect
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
 * Generated automatically from pattern secmer.sistar.wrap.canDelegationDirect
 */
public class PatternBuilderForcanDelegationDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.sistar.wrap.canDelegationDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.sistar.wrap.canDelegationDirect");
		
		final Address<? extends Receiver> var_32 = buildable.patternCollector("secmer.sistar.wrap.canDelegationDirect");
		final Stub<Address<? extends Supplier>> var_33 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_34 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "DependencyType"}), "secmer.sistar.wrap.dependency");
		final TupleMask var_35 = new TupleMask(new int[] {}, 0);
		final TupleMask var_36 = new TupleMask(new int[] {}, 3);
		final TupleMask var_37 = new TupleMask(new int[] {0, 1, 2}, 3);
		final Stub<Address<? extends Supplier>> var_38 = buildable.buildBetaNode(var_33, var_34, var_35, var_36, var_37, false);
		final AbstractEvaluator var_39 = new AbstractEvaluator(){ 
			@Override 
			public Object doEvaluate(Tuple tuple) throws Exception { 
				return VPMTermEvaluator.equals(tuple.get(2).toString(),"DELEGATION_PERMISSION");
			}
		};
		final Stub<Address<? extends Supplier>> var_40 = buildable.buildPredicateChecker(var_39, null, new int[] {2}, var_38);
		final TupleMask var_41 = new TupleMask(new int[] {0, 1}, 3);
		final Stub<Address<? extends Supplier>> var_42 = buildable.buildTrimmer(var_40, var_41);
		buildable.buildConnection(var_42, var_32);
		return var_32;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.sistar.wrap.canDelegationDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Act1", 0);
			posMapping.put("Act2", 1);

		}
		return posMapping;
	}
}