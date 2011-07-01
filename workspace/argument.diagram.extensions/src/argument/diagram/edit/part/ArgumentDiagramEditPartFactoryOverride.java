/*
 * 
 */
package argument.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import argument.diagram.edit.parts.ArgumentDiagramEditPart;
import argument.diagram.edit.parts.ArgumentEditPart;
import argument.diagram.edit.parts.ArgumentEditPartFactory;
import argument.diagram.part.ArgumentVisualIDRegistry;

public class ArgumentDiagramEditPartFactoryOverride extends
		ArgumentEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ArgumentVisualIDRegistry.getVisualID(view)) {
			case ArgumentDiagramEditPart.VISUAL_ID:
				return new ArgumentDiagramEditPartOverride(view);
			case ArgumentEditPart.VISUAL_ID:
				return new ArgumentEditPartOverride(view);			
			}
		}
		return super.createEditPart(context, model);
	}
}
