package uk.ac.open.rbac.rbac.diagram.providers;

import uk.ac.open.rbac.rbac.diagram.part.RBACDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = RBACDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			RBACDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
