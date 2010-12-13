/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.securityGoal
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
 * Generated automatically from pattern secmer.ontology.securityGoal
 */
public class PatternBuilderForsecurityGoal implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.securityGoal".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.securityGoal");
		
		final Address<? extends Receiver> var_195 = buildable.patternCollector("secmer.ontology.securityGoal");
		final Stub<Address<? extends Supplier>> var_196 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_197 = EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/ontology").getEClassifier("SecurityRequirement");
		final Stub<Address<? extends Supplier>> var_198 = buildable.unaryTypeStub(new FlatTuple(new Object[] {"Goal"}), var_197);
		final TupleMask var_199 = new TupleMask(new int[] {}, 0);
		final TupleMask var_200 = new TupleMask(new int[] {}, 1);
		final TupleMask var_201 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_202 = buildable.buildBetaNode(var_196, var_198, var_199, var_200, var_201, false);
		final TupleMask var_203 = new TupleMask(new int[] {0}, 1);
		final Stub<Address<? extends Supplier>> var_204 = buildable.buildTrimmer(var_202, var_203);
		buildable.buildConnection(var_204, var_195);
		return var_195;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.securityGoal".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("Goal", 0);

		}
		return posMapping;
	}
}
