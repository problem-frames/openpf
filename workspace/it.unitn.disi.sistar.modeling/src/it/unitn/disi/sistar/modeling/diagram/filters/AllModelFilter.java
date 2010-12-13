package it.unitn.disi.sistar.modeling.diagram.filters;

import org.eclipse.jface.action.IAction;


public class AllModelFilter extends AbstractFilter{

	public AllModelFilter() {
			super();
	}

	public void run(IAction action) {
			checkIfChecked(ExecutionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
			checkIfChecked(PermissionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
			checkIfChecked(ExecutionTrustModelFilter.class.getCanonicalName(), action.isChecked());
			checkIfChecked(PermissionTrustModelFilter.class.getCanonicalName(), action.isChecked());
			checkIfChecked(OrganizationalChartModelFilter.class.getCanonicalName(), action.isChecked());
			
			uncheckIfUnchecked(ExecutionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
			uncheckIfUnchecked(PermissionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
			uncheckIfUnchecked(ExecutionTrustModelFilter.class.getCanonicalName(), action.isChecked());
			uncheckIfUnchecked(PermissionTrustModelFilter.class.getCanonicalName(), action.isChecked());
			uncheckIfUnchecked(OrganizationalChartModelFilter.class.getCanonicalName(), action.isChecked());
			
			uncheckIfChecked(TroposModelFilter.class.getCanonicalName(), action.isChecked());
	}
}