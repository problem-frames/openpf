package it.unitn.disi.sistar.editors.plan.viewers;
public interface IDeltaListener {
	public void add(DeltaEvent event);
	public void remove(DeltaEvent event);
}
