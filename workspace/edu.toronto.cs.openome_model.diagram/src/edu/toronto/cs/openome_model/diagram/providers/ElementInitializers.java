package edu.toronto.cs.openome_model.diagram.providers;

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
		ElementInitializers cached = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().setElementInitializers(
							cached = new ElementInitializers());
		}
		return cached;
	}

}
