/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.actorProvidesResource
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
 * Generated automatically from pattern secmer.ontology.actorProvidesResource
 */
public class PatternBuilderForactorProvidesResource implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.actorProvidesResource".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.actorProvidesResource");
		
		final Address<? extends Receiver> var_354 = buildable.patternCollector("secmer.ontology.actorProvidesResource");
		final Stub<Address<? extends Supplier>> var_355 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_356 = EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Actor");
		final Stub<Address<? extends Supplier>> var_357 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"Actor"}), var_356);
		final TupleMask var_358 = new TupleMask(new int[] {}, 0);
		final TupleMask var_359 = new TupleMask(new int[] {}, 1);
		final TupleMask var_360 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_361 = buildable.buildBetaNode(var_355, var_357, var_358, var_359, var_360, false);
		final Object var_362 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Provides"))).getEStructuralFeature("source");
		final Stub<Address<? extends Supplier>> var_363 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Provides", "Actor"}), var_362);
		final TupleMask var_364 = new TupleMask(new int[] {0}, 1);
		final TupleMask var_365 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_366 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_367 = buildable.buildBetaNode(var_361, var_363, var_364, var_365, var_366, false);
		final Stub<Address<? extends Supplier>> var_368 = buildable.buildInjectivityChecker(var_367, 1, new int[] {0});
		final Object var_369 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Provides"))).getEStructuralFeature("target");
		final Stub<Address<? extends Supplier>> var_370 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Provides", "Resource"}), var_369);
		final TupleMask var_371 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_372 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_373 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_374 = buildable.buildBetaNode(var_368, var_370, var_371, var_372, var_373, false);
		final Stub<Address<? extends Supplier>> var_375 = buildable.buildInjectivityChecker(var_374, 2, new int[] {0, 1});
		final TupleMask var_376 = new TupleMask(new int[] {0, 2}, 3);
		final Stub<Address<? extends Supplier>> var_377 = buildable.buildTrimmer(var_375, var_376);
		buildable.buildConnection(var_377, var_354);
		return var_354;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.actorProvidesResource".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Actor", 0);
			posMapping.put("Resource", 1);

		}
		return posMapping;
	}
}