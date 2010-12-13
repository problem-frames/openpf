package eu.securechange.secmer.casetool.core;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.viatra2.compiled.emf.runtime.exception.ViatraCompiledRuntimeException;

import eu.securechange.secmer.casetool.core.rules.IEvolutionRule;

public class EditingDomainFactory implements TransactionalEditingDomain.Factory {

	@Override
	public TransactionalEditingDomain createEditingDomain() {
		return setup(DiagramEditingDomainFactory.getInstance().createEditingDomain());
	}

	@Override
	public TransactionalEditingDomain createEditingDomain(ResourceSet rset) {
		return setup(DiagramEditingDomainFactory.getInstance().createEditingDomain(rset));
	}

	@Override
	public TransactionalEditingDomain getEditingDomain(ResourceSet rset) {
		return DiagramEditingDomainFactory.getInstance().getEditingDomain(rset);
	}

	private TransactionalEditingDomain setup(TransactionalEditingDomain domain) {
		for (IEvolutionRule rule : Activator.getDefault().getEvolutionRules()) {
			try {
				rule.install(domain);
			} catch (ViatraCompiledRuntimeException e) {
				Activator.getDefault().getLog().log(
						new Status(IStatus.ERROR, Activator.PLUGIN_ID, 
								"Error during the initialization of Evolution Rule: "
									+ rule.getClass().getName(), 
								e));
			}
		}
//		try {
//			new ActorFromTropos(domain);
//		} catch (ViatraCompiledRuntimeException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return domain;
	}

}
