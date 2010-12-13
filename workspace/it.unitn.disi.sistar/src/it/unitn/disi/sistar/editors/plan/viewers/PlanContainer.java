package it.unitn.disi.sistar.editors.plan.viewers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanContainer extends Model {
	protected List children;
	protected Map data;
	
	@Override
	public String toString() {
		return getName() + children.toString() + data.toString();
	}
	
	public PlanContainer() {
		children = new ArrayList();
	}
	
	public PlanContainer(String name) {
		this();
		this.name = name;
		data = new HashMap();
	}
	
	public List getChildren() {
		return children;
	}
	
	public void setChildren(List children) {
		this.children = children;
	}
	
	public void add(PlanContainer container) {
		children.add(container);
		container.parent = this;
		fireAdd(container);
	}
	
	public void remove(PlanContainer container) {
		children.remove(container);
		container.addListener(NullDeltaListener.getSoleInstance());
		fireRemove(container);
	}

	public int size() {
		return getChildren().size();
	}

	public Map getData() {
		return data;
	}

	public void setData(Map data) {
		this.data = data;
	}
	
	public void addAttribute(String name, Object value)
	{
		List container = null;
		if(data.get(name) == null)
		{
			container = new ArrayList();
			
		}else
		{
			container = (List)data.get(name);
		}
		container.add(value);
		data.put(name, container);
	}
	
	public List getAttribute(String name)
	{
		if(data.get(name) == null)
			return new ArrayList();
		else
			return (List)data.get(name);
	}
	
	public void removeAttribute(String name, Object value)
	{
		List list = getAttribute(name);
		list.remove(value);
	}
}
