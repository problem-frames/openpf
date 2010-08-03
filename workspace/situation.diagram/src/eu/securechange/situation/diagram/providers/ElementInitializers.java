/*
 * 
 */
package eu.securechange.situation.diagram.providers;

import eu.securechange.situation.diagram.part.SituationDiagramEditorPlugin;

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
		ElementInitializers cached = SituationDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SituationDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
