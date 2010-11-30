/*
 * 
 */
package uk.ac.open.rbac.diagram.edit.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.rbac.rbac.diagram.edit.parts.ModelEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.ObjectEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.PermissionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RBACEditPartFactory;
import uk.ac.open.rbac.rbac.diagram.edit.parts.RoleEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.SessionEditPart;
import uk.ac.open.rbac.rbac.diagram.edit.parts.UserEditPart;
import uk.ac.open.rbac.rbac.diagram.part.RBACVisualIDRegistry;

public class RBACEditPartFactoryOverride extends
		RBACEditPartFactory {
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (RBACVisualIDRegistry.getVisualID(view)) {
			case ModelEditPart.VISUAL_ID:
				return new ModelEditPartOverride(view);
			case PermissionEditPart.VISUAL_ID:
				return new PermissionEditPartOverride(view);			
			case RoleEditPart.VISUAL_ID:
				return new RoleEditPartOverride(view);			
			case SessionEditPart.VISUAL_ID:
				return new SessionEditPartOverride(view);			
			case UserEditPart.VISUAL_ID:
				return new UserEditPartOverride(view);			
			case ObjectEditPart.VISUAL_ID:
				return new ObjectEditPartOverride(view);			
			}
		}
		return super.createEditPart(context, model);
	}
}
