package uk.ac.open.problem.diagram.providers;

import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

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
		ElementInitializers cached = ProblemDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			ProblemDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}

}
