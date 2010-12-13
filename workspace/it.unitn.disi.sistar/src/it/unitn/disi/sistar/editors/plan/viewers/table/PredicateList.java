package it.unitn.disi.sistar.editors.plan.viewers.table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class PredicateList {
	private List plans = new ArrayList();
	private Set changeListeners = new HashSet();
	public PredicateList() {
		super();
	}
	
	public void add(PlanPredicate plan) {
		plans.add(plans.size(), plan);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IPlanListener) iterator.next()).add(plan);
	}

	public void remove(PlanPredicate plan) {
		plans.remove(plan);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IPlanListener) iterator.next()).remove(plan);
	}

	public void planChanged(PlanPredicate plan) {
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IPlanListener) iterator.next()).update(plan);
	}

	public void removeChangeListener(IPlanListener listener) {
		changeListeners.remove(listener);
	}
	public void addChangeListener(IPlanListener listener) {
		changeListeners.add(listener);
	}

	public List getPlans() {
		return plans;
	}

	public void setPlans(List plans) {
		this.plans = plans;
	}

}
