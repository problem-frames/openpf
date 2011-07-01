/*
 * 
 */
package argument.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import argument.diagram.part.ArgumentVisualIDRegistry;

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
	private static final int SHORTCUTS_CATEGORY = 7007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof ArgumentNavigatorItem) {
			ArgumentNavigatorItem item = (ArgumentNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return ArgumentVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
