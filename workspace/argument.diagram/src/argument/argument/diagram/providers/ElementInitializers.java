/*
 * 
 */
package argument.argument.diagram.providers;

import argument.argument.diagram.part.ArgumentDiagramEditorPlugin;

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
		ElementInitializers cached = ArgumentDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ArgumentDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
