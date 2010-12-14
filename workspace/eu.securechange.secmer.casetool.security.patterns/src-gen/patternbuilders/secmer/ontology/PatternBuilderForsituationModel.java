/*******************************************************************************
 * Pattern builder for pattern secmer.ontology.situationModel
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
 * Generated automatically from pattern secmer.ontology.situationModel
 */
public class PatternBuilderForsituationModel implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.ontology.situationModel".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.ontology.situationModel");
		
		final Address<? extends Receiver> var_205 = buildable.patternCollector("secmer.ontology.situationModel");
		final Stub<Address<? extends Supplier>> var_206 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Object var_207 = ((EClass) (EPackage.Registry.INSTANCE.getEPackage("http://securechange.eu/secmer/tool").getEClassifier("SecMERIntegrationModel"))).getEStructuralFeature("SituationModel");
		final Stub<Address<? extends Supplier>> var_208 = buildable.binaryEdgeTypeStub(new FlatTuple(new Object[] {"SecMERIntegrationModel", "Situation"}), var_207);
		final TupleMask var_209 = new TupleMask(new int[] {}, 0);
		final TupleMask var_210 = new TupleMask(new int[] {}, 2);
		final TupleMask var_211 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_212 = buildable.buildBetaNode(var_206, var_208, var_209, var_210, var_211, false);
		final Stub<Address<? extends Supplier>> var_213 = buildable.buildInjectivityChecker(var_212, 1, new int[] {0});
		final TupleMask var_214 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_215 = buildable.buildTrimmer(var_213, var_214);
		buildable.buildConnection(var_215, var_205);
		return var_205;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.ontology.situationModel".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("SecMERIntegrationModel", 0);
			posMapping.put("Situation", 1);

		}
		return posMapping;
	}
}