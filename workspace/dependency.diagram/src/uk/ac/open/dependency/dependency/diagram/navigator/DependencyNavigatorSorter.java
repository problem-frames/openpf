package uk.ac.open.dependency.dependency.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry;

/**
 * @generated
 */
public class DependencyNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof DependencyNavigatorItem) {
			DependencyNavigatorItem item = (DependencyNavigatorItem) element;
			return DependencyVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
