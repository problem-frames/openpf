/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.actorWantsGoal
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
 * Generated automatically from pattern secmer.ontology.actorWantsGoal
 */
public class PatternBuilderForactorWantsGoal implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.actorWantsGoal".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.actorWantsGoal");
		
		final Address<? extends Receiver> var_267 = buildable.patternCollector("secmer.ontology.actorWantsGoal");
		final Stub<Address<? extends Supplier>> var_268 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_269 = buildable.patternCallStub(new FlatTuple(new Object[] {"Actor", "Goal"}), "secmer.ontology.actorWantsGoalDirect");
		final TupleMask var_270 = new TupleMask(new int[] {}, 0);
		final TupleMask var_271 = new TupleMask(new int[] {}, 2);
		final TupleMask var_272 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_273 = buildable.buildBetaNode(var_268, var_269, var_270, var_271, var_272, false);
		final TupleMask var_274 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_275 = buildable.buildTrimmer(var_273, var_274);
		buildable.buildConnection(var_275, var_267);
		final Stub<Address<? extends Supplier>> var_276 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_277 = buildable.patternCallStub(new FlatTuple(new Object[] {"Actor", "GParent"}), "secmer.ontology.actorWantsGoal");
		final TupleMask var_278 = new TupleMask(new int[] {}, 0);
		final TupleMask var_279 = new TupleMask(new int[] {}, 2);
		final TupleMask var_280 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_281 = buildable.buildBetaNode(var_276, var_277, var_278, var_279, var_280, false);
		final Stub<Address<? extends Supplier>> var_282 = buildable.patternCallStub(new FlatTuple(new Object[] {"GParent", "Goal"}), "secmer.ontology.decomposeDirect");
		final TupleMask var_283 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_284 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_285 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_286 = buildable.buildBetaNode(var_281, var_282, var_283, var_284, var_285, false);
		final Stub<Address<? extends Supplier>> var_287 = buildable.buildInjectivityChecker(var_286, 2, new int[] {0});
		final TupleMask var_288 = new TupleMask(new int[] {0, 2}, 3);
		final Stub<Address<? extends Supplier>> var_289 = buildable.buildTrimmer(var_287, var_288);
		buildable.buildConnection(var_289, var_267);
		return var_267;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.actorWantsGoal".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Actor", 0);
			posMapping.put("Goal", 1);

		}
		return posMapping;
	}
}
