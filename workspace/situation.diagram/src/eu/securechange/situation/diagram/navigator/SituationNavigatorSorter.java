/*
 * 
 */
package eu.securechange.situation.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import eu.securechange.situation.diagram.part.SituationVisualIDRegistry;

/**
 * @generated
 */
public class SituationNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	private static final int SHORTCUTS_CATEGORY = 7002;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SituationNavigatorItem) {
			SituationNavigatorItem item = (SituationNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return SituationVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
