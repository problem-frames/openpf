/*
 * 
 */
package uk.ac.open.dependency.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.dependency.dependency.diagram.edit.parts.DependencyEditPartFactory;
import uk.ac.open.dependency.dependency.diagram.edit.parts.ModelEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.NodeEditPart;
import uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry;

public class DependencyDiagramEditPartFactoryOverride extends
		DependencyEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DependencyVisualIDRegistry.getVisualID(view)) {
			case ModelEditPart.VISUAL_ID:
				return new ModelEditPartOverride(view);
			case NodeEditPart.VISUAL_ID:
				return new NodeEditPartOverride(view);			
			}
		}
		return super.createEditPart(context, model);
	}
}
