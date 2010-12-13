package it.unitn.disi.sistar.editors.scenario.viewers;
import it.unitn.disi.sistar.objects.GoalSolver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ScenarioOptionList {

	private List scenarios = new ArrayList();
	private Set changeListeners = new HashSet();

	static final String[] SELECTION = { "AUTO", "YES", "NO"};
	
	/**
	 * Constructor
	 */
	public ScenarioOptionList() {
		super();
	}
	
	public String[] getChoiceSelection() {
		return SELECTION;
	}
	
	public void add(GoalSolver scenario) {
		scenarios.add(scenarios.size(), scenario);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IScenarioListener) iterator.next()).add(scenario);
	}

	public void remove(GoalSolver scenario) {
		scenarios.remove(scenario);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IScenarioListener) iterator.next()).remove(scenario);
	}

	public void scenarioChanged(GoalSolver scenario) {
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IScenarioListener) iterator.next()).update(scenario);
	}

	public void removeChangeListener(IScenarioListener listener) {
		changeListeners.remove(listener);
	}

	public void addChangeListener(IScenarioListener listener) {
		changeListeners.add(listener);
	}

	public List getScenarios() {
		return scenarios;
	}

	public void setScenarios(List scenarios) {
		this.scenarios = scenarios;
	}

}
