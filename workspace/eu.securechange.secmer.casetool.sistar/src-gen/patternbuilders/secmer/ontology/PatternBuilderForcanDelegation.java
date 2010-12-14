/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.canDelegation
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
 * Generated automatically from pattern secmer.ontology.canDelegation
 */
public class PatternBuilderForcanDelegation implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.canDelegation".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.canDelegation");
		
		final Address<? extends Receiver> var_560 = buildable.patternCollector("secmer.ontology.canDelegation");
		final Stub<Address<? extends Supplier>> var_561 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_562 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "Dependum"}), "secmer.ontology.canDelegationDirect");
		final TupleMask var_563 = new TupleMask(new int[] {}, 0);
		final TupleMask var_564 = new TupleMask(new int[] {}, 3);
		final TupleMask var_565 = new TupleMask(new int[] {0, 1, 2}, 3);
		final Stub<Address<? extends Supplier>> var_566 = buildable.buildBetaNode(var_561, var_562, var_563, var_564, var_565, false);
		final TupleMask var_567 = new TupleMask(new int[] {0, 1, 2}, 3);
		final Stub<Address<? extends Supplier>> var_568 = buildable.buildTrimmer(var_566, var_567);
		buildable.buildConnection(var_568, var_560);
		final Stub<Address<? extends Supplier>> var_569 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_570 = buildable.patternCallStub(new FlatTuple(new Object[] {"SuperDependum", "Dependum"}), "secmer.ontology.decomposeDirect");
		final TupleMask var_571 = new TupleMask(new int[] {}, 0);
		final TupleMask var_572 = new TupleMask(new int[] {}, 2);
		final TupleMask var_573 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_574 = buildable.buildBetaNode(var_569, var_570, var_571, var_572, var_573, false);
		final Stub<Address<? extends Supplier>> var_575 = buildable.patternCallStub(new FlatTuple(new Object[] {"Act1", "Act2", "SuperDependum"}), "secmer.ontology.canDelegation");
		final TupleMask var_576 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_577 = new TupleMask(new int[] {2}, 3);
		final TupleMask var_578 = new TupleMask(new int[] {0, 1}, 3);
		final Stub<Address<? extends Supplier>> var_579 = buildable.buildBetaNode(var_574, var_575, var_576, var_577, var_578, false);
		final Stub<Address<? extends Supplier>> var_580 = buildable.buildInjectivityChecker(var_579, 2, new int[] {1});
		final Stub<Address<? extends Supplier>> var_581 = buildable.buildInjectivityChecker(var_580, 3, new int[] {1});
		final TupleMask var_582 = new TupleMask(new int[] {2, 3, 1}, 4);
		final Stub<Address<? extends Supplier>> var_583 = buildable.buildTrimmer(var_581, var_582);
		buildable.buildConnection(var_583, var_560);
		return var_560;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.canDelegation".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Act1", 0);
			posMapping.put("Act2", 1);
			posMapping.put("Dependum", 2);

		}
		return posMapping;
	}
}