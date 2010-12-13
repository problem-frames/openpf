package it.unitn.disi.sistar.editors.plan.viewers;
public abstract class Model {
	protected PlanContainer parent;
	protected String name;
	protected IDeltaListener listener = NullDeltaListener.getSoleInstance();
	
	protected void fireAdd(Object added) {
		listener.add(new DeltaEvent(added));
	}

	protected void fireRemove(Object removed) {
		listener.remove(new DeltaEvent(removed));
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public PlanContainer getParent() {
		return parent;
	}

	public String getName() {
		return name;
	}
	
	public void addListener(IDeltaListener listener) {
		this.listener = listener;
	}
	
	public Model(String title) {
		this.name = title;
	}
	
	public Model() {
	}	
	
	public void removeListener(IDeltaListener listener) {
		if(this.listener.equals(listener)) {
			this.listener = NullDeltaListener.getSoleInstance();
		}
	}
	public String getTitle() {
		return name;
	}


}
