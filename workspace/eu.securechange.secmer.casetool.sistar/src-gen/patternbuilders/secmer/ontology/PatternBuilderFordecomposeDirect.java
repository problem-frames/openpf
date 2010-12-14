/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.decomposeDirect
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
 * Generated automatically from pattern secmer.ontology.decomposeDirect
 */
public class PatternBuilderFordecomposeDirect implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.decomposeDirect".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.decomposeDirect");
		
		final Address<? extends Receiver> var_0 = buildable.patternCollector("secmer.ontology.decomposeDirect");
		final Stub<Address<? extends Supplier>> var_1 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_2 = buildable.patternCallStub(new FlatTuple(new Object[] {"Parent", "Child", "CompositionType"}), "secmer.ontology.decomposeDirectWithType");
		final TupleMask var_3 = new TupleMask(new int[] {}, 0);
		final TupleMask var_4 = new TupleMask(new int[] {}, 3);
		final TupleMask var_5 = new TupleMask(new int[] {0, 1, 2}, 3);
		final Stub<Address<? extends Supplier>> var_6 = buildable.buildBetaNode(var_1, var_2, var_3, var_4, var_5, false);
		final TupleMask var_7 = new TupleMask(new int[] {0, 1}, 3);
		final Stub<Address<? extends Supplier>> var_8 = buildable.buildTrimmer(var_6, var_7);
		buildable.buildConnection(var_8, var_0);
		return var_0;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.decomposeDirect".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Parent", 0);
			posMapping.put("Child", 1);

		}
		return posMapping;
	}
}