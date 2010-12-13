package eu.securechange.secmer.casetool.sistar.synch.rules.actor;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.viatra2.compiled.emf.runtime.api.IncQueryMatcher;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.sistar.transform.ActorNewFromTroposMatcher;
import secmertool.troposAspect.TroposActorLink;
import secmertool.troposAspect.TroposAspectFactory;
import signatures.secmer.sistar.transform.ActorNewFromTroposSignature;
import eu.securechange.ontology.ontology.OntologyFactory;
import eu.securechange.secmer.casetool.sistar.synch.rules.BaseTroposForallRule;

public class ActorNewFromTropos extends BaseTroposForallRule<ActorNewFromTroposSignature> {
	@Override
	protected IncQueryMatcher<ActorNewFromTroposSignature> initMatcher(
			ResourceSet resourceSet) throws ViatraCompiledRuntimeException {
		return new ActorNewFromTroposMatcher(resourceSet);
	}
	
	@Override
	protected void react(ActorNewFromTroposSignature signature) {
		it.unitn.disi.sistar.modeling.tropos.Actor troposActor = 
			(it.unitn.disi.sistar.modeling.tropos.Actor) signature.getTroposActor();
		
		eu.securechange.ontology.ontology.Actor actor = OntologyFactory.eINSTANCE.createActor();
		actor.setName(troposActor.getName());
		getSituationModel().getWorld().getEntities().add(actor);
		
		TroposActorLink troposActorLink = TroposAspectFactory.eINSTANCE.createTroposActorLink();
		getReferenceModel().getLinks().add(troposActorLink);
		troposActorLink.setSecmer(actor);
		troposActorLink.setTropos(troposActor);		
		troposActorLink.setName(actor.getName());
	}
}
