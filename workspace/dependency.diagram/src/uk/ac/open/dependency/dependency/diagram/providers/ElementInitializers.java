package uk.ac.open.dependency.dependency.diagram.providers;

import uk.ac.open.dependency.dependency.diagram.part.DependencyDiagramEditorPlugin;

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
		ElementInitializers cached = DependencyDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			DependencyDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
