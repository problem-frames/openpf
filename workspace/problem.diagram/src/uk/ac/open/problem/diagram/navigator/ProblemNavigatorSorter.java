package uk.ac.open.problem.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;

/**
 * @generated
 */
public class ProblemNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ProblemNavigatorItem) {
			ProblemNavigatorItem item = (ProblemNavigatorItem) element;
			return ProblemVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
