package it.unitn.disi.sistar.modeling.tropos.diagram.navigator;

import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TroposNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 5003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TroposNavigatorItem) {
			TroposNavigatorItem item = (TroposNavigatorItem) element;
			return TroposVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
