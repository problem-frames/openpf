package it.unitn.disi.sistar.editors.scenario.viewers;

public interface IScenarioListener {
	public void add(Object goal);
	public void remove(Object goal);
	public void update(Object goal);
}
