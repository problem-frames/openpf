package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import it.unitn.disi.sistar.modeling.tropos.TroposFactory;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.sistar.transform.ActorNewToTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import secmertool.troposAspect.TroposAspectFactory;
import signatures.secmer.sistar.transform.ActorNewToTroposSignature;
import eu.securechange.secmer.casetool.core.rules.IEvolutionRule;
import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

public class ActorNewToTropos extends BaseTroposForallRule<ActorNewToTroposSignature> 
implements IEvolutionRule {

	@Override
	protected IncQueryMatcher<ActorNewToTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorNewToTroposMatcher(resourceSet);
	}
	@Override
	protected void react(ActorNewToTroposSignature signature) {
		eu.securechange.ontology.ontology.Actor actor = 
			(eu.securechange.ontology.ontology.Actor) signature.getActor();
		
		it.unitn.disi.sistar.modeling.tropos.Actor troposActor = TroposFactory.eINSTANCE.createActor();
		getTroposModel().getObject().add(troposActor);
		troposActor.setName(actor.getName());
		
		TroposActorLink troposActorLink = TroposAspectFactory.eINSTANCE.createTroposActorLink();
		getReferenceModel().getLinks().add(troposActorLink);
		troposActorLink.setSecmer(actor);
		troposActorLink.setTropos(troposActor);		
		troposActorLink.setName(actor.getName());
	}

}
