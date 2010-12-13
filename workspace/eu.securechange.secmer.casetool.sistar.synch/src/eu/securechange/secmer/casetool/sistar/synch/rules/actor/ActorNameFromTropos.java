package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.sistar.transform.ActorNameFromTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import signatures.secmer.sistar.transform.ActorNameFromTroposSignature;
import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

public class ActorNameFromTropos extends BaseTroposForallRule<ActorNameFromTroposSignature> {

	@Override
	protected IncQueryMatcher<ActorNameFromTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorNameFromTroposMatcher(resourceSet);
	}

	@Override
	protected void react(ActorNameFromTroposSignature signature) {
		eu.securechange.ontology.ontology.Actor actor = 
			(eu.securechange.ontology.ontology.Actor) signature.getActor();
		TroposActorLink troposActorLink = (TroposActorLink) signature.getLink();
		it.unitn.disi.sistar.modeling.tropos.Actor troposActor = 
			(it.unitn.disi.sistar.modeling.tropos.Actor) signature.getTroposActor();

		troposActorLink.setName(troposActor.getName());
		actor.setName(troposActor.getName());

	}

}
