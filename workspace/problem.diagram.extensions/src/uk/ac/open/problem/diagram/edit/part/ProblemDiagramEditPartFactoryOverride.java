/*
 * 
 */
package uk.ac.open.problem.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemEditPartFactory;
import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;

public class ProblemDiagramEditPartFactoryOverride extends ProblemEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ProblemVisualIDRegistry.getVisualID(view)) {
			case ProblemDiagramEditPart.VISUAL_ID:
				return new ProblemDiagramEditPartOverride(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
