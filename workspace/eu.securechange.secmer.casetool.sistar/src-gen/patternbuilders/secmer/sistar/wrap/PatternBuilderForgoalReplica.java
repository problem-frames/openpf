/*******************************************************************************
 * Pattern builder for pattern secmer.sistar.wrap.goalReplica
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
 * Generated automatically from pattern secmer.sistar.wrap.goalReplica
 */
public class PatternBuilderForgoalReplica implements IStatelessGeneratedRetePatternBuilder {
	@Override
	public Address<? extends Receiver> construct(
			ReteContainerBuildable<String> buildable,
			IPatternMatcherContext<String> context, String gtPattern)
			throws RetePatternBuildException {
		assert("secmer.sistar.wrap.goalReplica".equals(gtPattern));
		buildable = buildable.getNextContainer().putOnTab("secmer.sistar.wrap.goalReplica");
		
		final Address<? extends Receiver> var_183 = buildable.patternCollector("secmer.sistar.wrap.goalReplica");
		final Stub<Address<? extends Supplier>> var_184 = buildable.buildStartStub(new Object[] {}, new Object[] {});
		final Stub<Address<? extends Supplier>> var_185 = buildable.patternCallStub(new FlatTuple(new Object[] {"G1", "Name"}), "secmer.sistar.wrap.goalName");
		final TupleMask var_186 = new TupleMask(new int[] {}, 0);
		final TupleMask var_187 = new TupleMask(new int[] {}, 2);
		final TupleMask var_188 = new TupleMask(new int[] {0, 1}, 2);
		final Stub<Address<? extends Supplier>> var_189 = buildable.buildBetaNode(var_184, var_185, var_186, var_187, var_188, false);
		final Stub<Address<? extends Supplier>> var_190 = buildable.patternCallStub(new FlatTuple(new Object[] {"G2", "Name"}), "secmer.sistar.wrap.goalName");
		final TupleMask var_191 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_192 = new TupleMask(new int[] {1}, 2);
		final TupleMask var_193 = new TupleMask(new int[] {0}, 2);
		final Stub<Address<? extends Supplier>> var_194 = buildable.buildBetaNode(var_189, var_190, var_191, var_192, var_193, false);
		final TupleMask var_195 = new TupleMask(new int[] {0, 2}, 3);
		final Stub<Address<? extends Supplier>> var_196 = buildable.buildTrimmer(var_194, var_195);
		buildable.buildConnection(var_196, var_183);
		return var_183;

	}
	
	HashMap<Object, Integer> posMapping;
	@Override
	public HashMap<Object, Integer> getPosMapping(String gtPattern) {
		assert("secmer.sistar.wrap.goalReplica".equals(gtPattern));
		if (posMapping == null) {
			posMapping = new HashMap<Object, Integer>();
			
			posMapping.put("G1", 0);
			posMapping.put("G2", 1);

		}
		return posMapping;
	}
}