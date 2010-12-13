package eu.securechange.secmer.casetool.sistar.synch.rules;

import it.unitn.disi.sistar.modeling.tropos.Diagram;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.viatra2.compiled.emf.runtime.api.IPatternSignature;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import patternmatchers.secmer.core.IntegrationModelMatcher;
import patternmatchers.secmer.sistar.transform.ModelMappingTroposMatcher;
import patternmatchers.secmer.sistar.transform.TroposReferenceModelMatcher;
import secmertool.SecMERIntegrationModel;
import secmertool.troposAspect.TroposReferenceModel;
import signatures.secmer.sistar.transform.ModelMappingTroposSignature;
import eu.securechange.ontology.ontology.Situation;
import eu.securechange.secmer.casetool.core.rules.ForallRule;

public abstract class BaseTroposForallRule<GuardSignature extends IPatternSignature> 
	extends ForallRule<GuardSignature> 
{
	private TroposReferenceModelMatcher referenceModelMatcher;
	private ModelMappingTroposMatcher modelMappingTroposMatcher;
	private IntegrationModelMatcher integrationModelMatcher;
	
	@Override
	protected boolean isSafe() {
		return getIntegrationModel() != null && 
		getReferenceModel() != null &&
		getSituationModel() != null &&
		getSituationModel().getWorld() != null &&
		getTroposModel() != null;
	}
		
	@Override
	public void install(TransactionalEditingDomain trDomain) throws ViatraCompiledRuntimeException {
		// if (true) return;
		super.install(trDomain);
		referenceModelMatcher = new TroposReferenceModelMatcher(trDomain.getResourceSet());
		modelMappingTroposMatcher = new ModelMappingTroposMatcher(trDomain.getResourceSet());
		integrationModelMatcher = new IntegrationModelMatcher(trDomain.getResourceSet());
	}
	
	protected SecMERIntegrationModel getIntegrationModel() {
		Object[] match = integrationModelMatcher.getOneMatchAsArray();
		return (match==null) ? null : (SecMERIntegrationModel) match[0];
	}
	protected TroposReferenceModel getReferenceModel() {
		Object[] match = referenceModelMatcher.getOneMatchAsArray();
		return (match==null) ? null : (TroposReferenceModel) match[0];
//		else {
//			SecMERIntegrationModel integrationModel = getIntegrationModel();
//			if (integrationModel==null) return null;
//			TroposReferenceModel troposReferenceModel = TroposAspectFactory.eINSTANCE.createTroposReferenceModel();
//			integrationModel.getReferenceModels().add(troposReferenceModel);
//			return troposReferenceModel;
//		}
	}
	protected Situation getSituationModel() {
		ModelMappingTroposSignature match = modelMappingTroposMatcher.getOneMatchAsObject();
		if (match != null) return (Situation) match.getSituation();
		else return null;
	}
	protected Diagram getTroposModel() {
		ModelMappingTroposSignature match = modelMappingTroposMatcher.getOneMatchAsObject();
		if (match != null) return (Diagram) match.getTroposDiagram();
		else return null;
	}

}
