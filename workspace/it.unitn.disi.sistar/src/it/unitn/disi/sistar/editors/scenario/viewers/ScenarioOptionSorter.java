package it.unitn.disi.sistar.editors.scenario.viewers;
import it.unitn.disi.sistar.objects.GoalSolver;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class ScenarioOptionSorter extends ViewerSorter {

	private String criteria;

	public ScenarioOptionSorter(String criteria) {
		super();
		this.criteria = criteria;
	}

	public int compare(Viewer viewer, Object o1, Object o2) {

		GoalSolver goal1 = (GoalSolver) o1;
		GoalSolver goal2 = (GoalSolver) o2;
		return collator.compare(goal1.getFieldByName(criteria), goal2.getFieldByName(criteria));
	}
	
	public int compareDouble(double d1, double d2)
	{
		if(d1 > d2)
			return 1;
		else if(d1 < d2)
			return -1;
		else 
			return 0;
	}

	public String getCriteria() {
		return criteria;
	}
}
