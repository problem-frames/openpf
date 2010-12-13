package it.unitn.disi.sistar.preferences.table;

import java.util.List;

public class ItemWrapper {

	private List item;

	public List getItem() {
		return item;
	}

	public void setItem(List items) {
		this.item = items;
	}
	
	public void setItemValue(int index, Object value)
	{
		item.set(index, value);
	}
	
}
