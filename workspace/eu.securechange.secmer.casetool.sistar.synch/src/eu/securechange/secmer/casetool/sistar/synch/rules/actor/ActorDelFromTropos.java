package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

import patternmatchers.secmer.sistar.transform.ActorDelFromTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import signatures.secmer.sistar.transform.ActorDelFromTroposSignature;

public class ActorDelFromTropos extends BaseTroposForallRule<ActorDelFromTroposSignature> {

	@Override
	protected IncQueryMatcher<ActorDelFromTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorDelFromTroposMatcher(resourceSet);
	}

	@Override
	protected void react(ActorDelFromTroposSignature signature) {
		eu.securechange.ontology.ontology.Actor actor = 
			(eu.securechange.ontology.ontology.Actor) signature.getActor();
		TroposActorLink troposActorLink = (TroposActorLink) signature.getLink();
		
		EcoreUtil.delete(actor, true);
		EcoreUtil.delete(troposActorLink, true);
	}

}
