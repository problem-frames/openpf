package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.sistar.transform.ActorNameToTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import signatures.secmer.sistar.transform.ActorNameToTroposSignature;
import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

public class ActorNameToTropos extends BaseTroposForallRule<ActorNameToTroposSignature> {

	@Override
	protected IncQueryMatcher<ActorNameToTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorNameToTroposMatcher(resourceSet);
	}

	@Override
	protected void react(ActorNameToTroposSignature signature) {
		eu.securechange.ontology.ontology.Actor actor = 
			(eu.securechange.ontology.ontology.Actor) signature.getActor();
		TroposActorLink troposActorLink = (TroposActorLink) signature.getLink();
		it.unitn.disi.sistar.modeling.tropos.Actor troposActor = 
			(it.unitn.disi.sistar.modeling.tropos.Actor) signature.getTroposActor();

		troposActorLink.setName(actor.getName());
		troposActor.setName(actor.getName());
	}

}
