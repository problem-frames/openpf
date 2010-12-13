/*******************************************************************************
 * Pattern builder for pattern secmer.sistar.wrap.goalName
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
 * Generated automatically from pattern secmer.sistar.wrap.goalName
 */
public class PatternBuilderForgoalName implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.sistar.wrap.goalName".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.sistar.wrap.goalName");
		
		final Address<? extends Receiver> var_374 = buildable.patternCollector("secmer.sistar.wrap.goalName");
		final Stub<Address<? extends Supplier>> var_375 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_376 = buildable.patternCallStub(new FlatTuple(new Object[] {"Goal"}), "secmer.sistar.wrap.goal");
		final TupleMask var_377 = new TupleMask(new int[] {}, 0);
		final TupleMask var_378 = new TupleMask(new int[] {}, 1);
		final TupleMask var_379 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_380 = buildable.buildBetaNode(var_375, var_376, var_377, var_378, var_379, false);
		final Stub<Address<? extends Supplier>> var_381 = buildable.patternCallStub(new FlatTuple(new Object[] {"Goal", "Name"}), "secmer.sistar.wrap.objectName");
		final TupleMask var_382 = new TupleMask(new int[] {0}, 1);
		final TupleMask var_383 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_384 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_385 = buildable.buildBetaNode(var_380, var_381, var_382, var_383, var_384, false);
		final TupleMask var_386 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_387 = buildable.buildTrimmer(var_385, var_386);
		buildable.buildConnection(var_387, var_374);
		return var_374;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.sistar.wrap.goalName".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Goal", 0);
			posMapping.put("Name", 1);

		}
		return posMapping;
	}
}
