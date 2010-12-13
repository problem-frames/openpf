/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.carryOutDirect
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
 * Generated automatically from pattern secmer.ontology.carryOutDirect
 */
public class PatternBuilderForcarryOutDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.carryOutDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.carryOutDirect");
		
		final Address<? extends Receiver> var_677 = buildable.patternCollector("secmer.ontology.carryOutDirect");
		final Stub<Address<? extends Supplier>> var_678 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_679 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Does"))).getEStructuralFeature("target");
		final Stub<Address<? extends Supplier>> var_680 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Does", "Activity"}), var_679);
		final TupleMask var_681 = new TupleMask(new int[] {}, 0);
		final TupleMask var_682 = new TupleMask(new int[] {}, 2);
		final TupleMask var_683 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_684 = buildable.buildBetaNode(var_678, var_680, var_681, var_682, var_683, false);
		final Stub<Address<? extends Supplier>> var_685 = buildable.buildInjectivityChecker(var_684, 1, new int[] {0});
		final Object var_686 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("Does"))).getEStructuralFeature("source");
		final Stub<Address<? extends Supplier>> var_687 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"Does", "Actor"}), var_686);
		final TupleMask var_688 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_689 = new TupleMask(new int[] {0}, 2);
		final TupleMask var_690 = new TupleMask(new int[] {1}, 2);
		final Stub<Address<? extends Supplier>> var_691 = buildable.buildBetaNode(var_685, var_687, var_688, var_689, var_690, false);
		final Stub<Address<? extends Supplier>> var_692 = buildable.buildInjectivityChecker(var_691, 2, new int[] {0, 1});
		final TupleMask var_693 = new TupleMask(new int[] {2, 1}, 3);
		final Stub<Address<? extends Supplier>> var_694 = buildable.buildTrimmer(var_692, var_693);
		buildable.buildConnection(var_694, var_677);
		return var_677;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.carryOutDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Actor", 0);
			posMapping.put("Activity", 1);

		}
		return posMapping;
	}
}
