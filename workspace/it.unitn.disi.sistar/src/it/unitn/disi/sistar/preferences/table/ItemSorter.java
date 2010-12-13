package it.unitn.disi.sistar.preferences.table;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

public class ItemSorter extends ViewerSorter {

	private int criteria;

	public ItemSorter(int criteria) {
		super();
		this.criteria = criteria;
	}

	public int compare(Viewer viewer, Object o1, Object o2) {

		ItemWrapper item1 = (ItemWrapper) o1;
		ItemWrapper item2 = (ItemWrapper) o2;
		return collator.compare(item1.getItem().get(criteria), 
				item2.getItem().get(criteria));
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

	public int getCriteria() {
		return criteria;
	}
}
