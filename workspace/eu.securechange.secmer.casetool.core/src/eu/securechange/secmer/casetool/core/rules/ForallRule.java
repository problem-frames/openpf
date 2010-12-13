package eu.securechange.secmer.casetool.core.rules;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

public abstract class ForallRule<GuardSignature extends IPatternSignature> extends BaseEvolutionRule<GuardSignature> {

	@Override
	protected Command applyRule() {
		final Collection<GuardSignature> allMatches = matcher.getAllMatchesAsObject();
		if (allMatches == null || allMatches.isEmpty()) {
			return null;
		} else {
			String ruleName = getClass().getSimpleName() + " (forall)"; 
			return new RecordingCommand(trDomain, ruleName) {
				@Override
				protected void doExecute() {
					for(final GuardSignature signature: allMatches) {		
						if (matcher.hasMatch(signature)) 
							react(signature);
					}
				}
			};
		}
	}
	
	@Override
	public void install(TransactionalEditingDomain trDomain)
			throws ViatraCompiledRuntimeException {
		super.install(trDomain);

		Command initialApplication = applyRule();
		trDomain.getCommandStack().execute(initialApplication);
	}

}