package argument.argument.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import argument.argument.diagram.part.ArgumentVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ArgumentNavigatorItem) {
			ArgumentNavigatorItem item = (ArgumentNavigatorItem) element;
			return ArgumentVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
