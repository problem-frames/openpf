package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

import patternmatchers.secmer.sistar.transform.ActorDelToTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import signatures.secmer.sistar.transform.ActorDelToTroposSignature;

public class ActorDelToTropos extends BaseTroposForallRule<ActorDelToTroposSignature> {

	@Override
	protected IncQueryMatcher<ActorDelToTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorDelToTroposMatcher(resourceSet);
	}

	@Override
	protected void react(ActorDelToTroposSignature signature) {
		it.unitn.disi.sistar.modeling.tropos.Actor troposActor = 
			(it.unitn.disi.sistar.modeling.tropos.Actor) signature.getTroposActor();
		TroposActorLink troposActorLink = (TroposActorLink) signature.getLink();
		
		EcoreUtil.delete(troposActor, true);
		EcoreUtil.delete(troposActorLink, true);	
	}

}
