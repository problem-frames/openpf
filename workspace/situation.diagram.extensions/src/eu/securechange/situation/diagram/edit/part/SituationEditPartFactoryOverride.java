/*
 * 
 */
package eu.securechange.situation.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import eu.securechange.situation.diagram.edit.parts.SituationEditPart;
import eu.securechange.situation.diagram.edit.parts.SituationEditPartFactory;
import eu.securechange.situation.diagram.part.SituationVisualIDRegistry;

public class SituationEditPartFactoryOverride extends SituationEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SituationVisualIDRegistry.getVisualID(view)) {
			case SituationEditPart.VISUAL_ID:
				return new SituationEditPartOverride(view);
			}
		}
		return super.createEditPart(context, model);
	}
}
