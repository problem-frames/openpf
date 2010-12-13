package it.unitn.disi.sistar.modeling.tropos.diagram.view.factories;

import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceNameEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.AbstractShapeViewFactory;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ServiceViewFactory extends AbstractShapeViewFactory {

	/**
	 * @generated  NOT
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		styles.add(NotationFactory.eINSTANCE.createDescriptionStyle());
		styles.add(NotationFactory.eINSTANCE.createFillStyle());
		styles.add(NotationFactory.eINSTANCE.createLineStyle());
		return styles;
	}

	/**
	 * @generated NOT
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		if (semanticHint == null) {
			semanticHint = TroposVisualIDRegistry
					.getType(it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart.VISUAL_ID);
			view.setType(semanticHint);
		}
		super.decorateView(containerView, view, semanticAdapter, semanticHint,
				index, persisted);
		if (!DiagramEditPart.MODEL_ID.equals(TroposVisualIDRegistry
				.getModelID(containerView))) {
			EAnnotation shortcutAnnotation = EcoreFactory.eINSTANCE
					.createEAnnotation();
			shortcutAnnotation.setSource("Shortcut"); //$NON-NLS-1$
			shortcutAnnotation.getDetails().put(
					"modelID", DiagramEditPart.MODEL_ID); //$NON-NLS-1$
			view.getEAnnotations().add(shortcutAnnotation);
		}
		getViewService().createNode(semanticAdapter, view,
				TroposVisualIDRegistry.getType(ServiceNameEditPart.VISUAL_ID),
				ViewUtil.APPEND, true, getPreferencesHint());

		if (containerView instanceof Node) {
			Node container = (Node) containerView;
			DrawerStyle drawerStyle = (DrawerStyle) container
					.getStyle(NotationPackage.Literals.DRAWER_STYLE);
			if (drawerStyle.isCollapsed()) {

				Bounds constraint = (Bounds) ((Node) view)
						.getLayoutConstraint();
				constraint.setX(100);
				constraint.setY(100);
				((Node) view).setLayoutConstraint(constraint);
				view.setVisible(false);
			}
		}
		/*getViewService().createNode(
		 semanticAdapter,
		 view,
		 TroposVisualIDRegistry
		 .getType(ServiceRemarksLabelEditPart.VISUAL_ID),
		 ViewUtil.APPEND, true, getPreferencesHint());*/
	}

}
