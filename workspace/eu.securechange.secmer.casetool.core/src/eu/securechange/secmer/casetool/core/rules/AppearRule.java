package eu.securechange.secmer.casetool.core.rules;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;
import org.eclipse.viatra2.gtasm.patternmatcher.incremental.rete.misc.DeltaMonitor;

public abstract class AppearRule<GuardSignature extends IPatternSignature> extends BaseEvolutionRule<GuardSignature> {

	protected DeltaMonitor<GuardSignature> deltaMonitor;
	
	@Override
	protected Command applyRule() {
		final Collection<GuardSignature> allAppearances = 
			new ArrayList<GuardSignature>(deltaMonitor.matchFoundEvents);
		deltaMonitor.matchFoundEvents.clear();
		
		if (allAppearances.isEmpty()) {
			return null;
		} else {
			String ruleName = getClass().getSimpleName() + " (appear)"; 
			return new RecordingCommand(trDomain, ruleName) {
				@Override
				protected void doExecute() {
					for(final GuardSignature signature: allAppearances) {		
						react(signature);
					}
				}
			};
		}
	}

	@Override
	public void install(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException {
		super.install(trDomain);
		deltaMonitor = matcher.newDeltaMonitor(true);
	}

}
