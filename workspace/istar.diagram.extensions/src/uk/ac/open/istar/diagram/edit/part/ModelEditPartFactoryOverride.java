/*
 * 
 */
package uk.ac.open.istar.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Openome_modelEditPartFactory;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry;

public class ModelEditPartFactoryOverride extends Openome_modelEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Openome_modelVisualIDRegistry.getVisualID(view)) {
			case ModelEditPart.VISUAL_ID:
				return new ModelEditPartOverride(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
