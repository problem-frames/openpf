/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.decomposeDirectWithType
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
 * Generated automatically from pattern secmer.ontology.decomposeDirectWithType
 */
public class PatternBuilderFordecomposeDirectWithType implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.decomposeDirectWithType".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.decomposeDirectWithType");
		
		final Address<? extends Receiver> var_742 = buildable.patternCollector("secmer.ontology.decomposeDirectWithType");
		final Stub<Address<? extends Supplier>> var_743 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_744 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Decomposes"))).getEStructuralFeature("source");
		final Stub<Address<? extends Supplier>> var_745 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Decomposes", "Child"}), var_744);
		final TupleMask var_746 = new TupleMask(new int[] {}, 0);
		final TupleMask var_747 = new TupleMask(new int[] {}, 2);
		final TupleMask var_748 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_749 = buildable.buildBetaNode(var_743, var_745, var_746, var_747, var_748, false);
		final Stub<Address<? extends Supplier>> var_750 = buildable.buildInjectivityChecker(var_749, 1, new int[] {0});
		final Object var_751 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Decomposes"))).getEStructuralFeature("type");
		final Stub<Address<? extends Supplier>> var_752 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Decomposes", "CompositionType"}), var_751);
		final TupleMask var_753 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_754 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_755 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_756 = buildable.buildBetaNode(var_750, var_752, var_753, var_754, var_755, false);
		final Stub<Address<? extends Supplier>> var_757 = buildable.buildInjectivityChecker(var_756, 2, new int[] {0, 1});
		final Object var_758 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Decomposes"))).getEStructuralFeature("target");
		final Stub<Address<? extends Supplier>> var_759 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Decomposes", "Parent"}), var_758);
		final TupleMask var_760 = new TupleMask(new int[] {0}, 3);
		final TupleMask var_761 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_762 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_763 = buildable.buildBetaNode(var_757, var_759, var_760, var_761, var_762, false);
		final Stub<Address<? extends Supplier>> var_764 = buildable.buildInjectivityChecker(var_763, 3, new int[] {0, 1, 2});
		final TupleMask var_765 = new TupleMask(new int[] {3, 1, 2}, 4);
		final Stub<Address<? extends Supplier>> var_766 = buildable.buildTrimmer(var_764, var_765);
		buildable.buildConnection(var_766, var_742);
		return var_742;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.decomposeDirectWithType".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Parent", 0);
			posMapping.put("Child", 1);
			posMapping.put("CompositionType", 2);

		}
		return posMapping;
	}
}