package it.unitn.disi.sistar.editors.plan.viewers.table;

public interface IPlanListener {
	public void add(Object plan);
	public void remove(Object plan);
	public void update(Object plan);
}
