package filesystem.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import filesystem.diagram.part.FilesystemVisualIDRegistry;

/**
 * @generated
 */
public class FilesystemNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7005;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof FilesystemNavigatorItem) {
			FilesystemNavigatorItem item = (FilesystemNavigatorItem) element;
			return FilesystemVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
