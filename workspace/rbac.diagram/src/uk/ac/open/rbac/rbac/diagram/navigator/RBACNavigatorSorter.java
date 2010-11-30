package uk.ac.open.rbac.rbac.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry;

/**
 * @generated
 */
public class RBACNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof RBACNavigatorItem) {
			RBACNavigatorItem item = (RBACNavigatorItem) element;
			return RBACVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
