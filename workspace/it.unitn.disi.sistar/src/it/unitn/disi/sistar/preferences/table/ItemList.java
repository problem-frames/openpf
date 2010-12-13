package it.unitn.disi.sistar.preferences.table;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ItemList {
	private List items = new ArrayList();
	private Set changeListeners = new HashSet();
	public ItemList() {
		super();
	}
	
	public void add(ItemWrapper item) {
		items.add(items.size(), item);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IItemListener) iterator.next()).add(item);
	}

	public void remove(ItemWrapper item) {
		items.remove(item);
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IItemListener) iterator.next()).remove(item);
	}

	public void planChanged(ItemWrapper item) {
		Iterator iterator = changeListeners.iterator();
		while (iterator.hasNext())
			((IItemListener) iterator.next()).update(item);
	}

	public void removeChangeListener(IItemListener listener) {
		changeListeners.remove(listener);
	}
	public void addChangeListener(IItemListener listener) {
		changeListeners.add(listener);
	}

	public List getItems() {
		return items;
	}

	public void setItems(List items) {
		this.items = items;
	}

}
