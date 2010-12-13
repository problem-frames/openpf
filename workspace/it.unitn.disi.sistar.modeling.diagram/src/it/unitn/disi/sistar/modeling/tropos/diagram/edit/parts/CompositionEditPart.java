package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.CompositionRelationFigure;
import it.unitn.disi.sistar.figures.routers.CompositionConnectionRouter;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.CompositionItemSemanticEditPolicy;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import java.util.Iterator;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionLayer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.LayerConstants;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.Routing;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class CompositionEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3003;

	/**
	 * @generated
	 */
	public CompositionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CompositionItemSemanticEditPolicy());
	}

	/**
	 * @generated NOT
	 */
	private void setInitialCompositionType() {
		GraphicalObject object = (GraphicalObject) ((Composition) getPrimaryView()
				.getElement()).getSource();

		Composition otherComposition = null;

		EList contents = getPrimaryView().getDiagram().getElement().eContents();
		for (Iterator iter = contents.iterator(); iter.hasNext();) {
			EObject element = (EObject) iter.next();
			if (element instanceof Composition
					&& element != getPrimaryView().getElement()) {
				Composition current = (Composition) element;
				if (current.getSource() == object) {
					otherComposition = current;
					break;
				}
			}

		}
		if (otherComposition != null) {
			//view.getElement().eSet(TroposPackage.eINSTANCE.getComposition_CompositionType(), otherComposition.getCompositionType());
			((Composition) getPrimaryView().getElement())
					.setCompositionType(otherComposition.getCompositionType());
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void installRouter() {
		ConnectionLayer cLayer = (ConnectionLayer) getLayer(LayerConstants.CONNECTION_LAYER);
		RoutingStyle style = (RoutingStyle) ((View) getModel())
				.getStyle(NotationPackage.Literals.ROUTING_STYLE);

		if (style != null && cLayer instanceof ConnectionLayerEx) {

			ConnectionLayerEx cLayerEx = (ConnectionLayerEx) cLayer;
			Routing routing = style.getRouting();
			if (getConnectionFigure() instanceof CompositionFigure)
				getConnectionFigure().setConnectionRouter(
						new CompositionConnectionRouter());
			else if (Routing.MANUAL_LITERAL == routing) {
				getConnectionFigure().setConnectionRouter(
						cLayerEx.getObliqueRouter());
			} else if (Routing.RECTILINEAR_LITERAL == routing) {
				getConnectionFigure().setConnectionRouter(
						cLayerEx.getRectilinearRouter());
			} else if (Routing.TREE_LITERAL == routing) {
				getConnectionFigure().setConnectionRouter(
						cLayerEx.getTreeRouter());
			}

		}

		refreshRouterChange();
	}

	@Override
	protected void refreshForegroundColor() {
		LineStyle style = (LineStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getLineStyle());
		Color bgColor = null;
		if (style != null
				&& style.eIsSet(NotationPackage.eINSTANCE
						.getLineStyle_LineColor()))
			bgColor = DiagramColorRegistry.getInstance().getColor(
					new Integer(style.getLineColor()));
		getConnectionFigure().setForegroundColor(
				ColorSchemaUtil.getLineColorPreference(ColorConstants.black,
						bgColor));
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute)
			if ("compositionType".equals(((EAttribute) feature).getName())) {
				CompositionRelationFigure composition = (CompositionRelationFigure) getConnectionFigure();
				composition.setCompositionType(((ECompositionType) notification
						.getNewValue()));

				Composition comp = (Composition) getPrimaryView().getElement();
				EObject source = comp.getSource();
				EList contents = getDiagramView().getElement().eContents();
				for (Iterator iter = contents.iterator(); iter.hasNext();) {
					EObject element = (EObject) iter.next();
					if (element instanceof Composition) {
						Composition current = (Composition) element;
						if (current.getSource() == source) {
							current
									.setCompositionType((ECompositionType) notification
											.getNewValue());
						}
					}

				}
				composition.repaint();
			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				getConnectionFigure().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			}
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		Composition model = (Composition) getPrimaryView().getElement();
		CompositionFigure figure = new CompositionFigure();
		figure.setCompositionType(model.getCompositionType());
		return figure;
	}

	/**
	 * @generated
	 */
	public CompositionFigure getPrimaryShape() {
		return (CompositionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CompositionFigure extends CompositionRelationFigure {

		/**
		 * @generated
		 */
		public CompositionFigure() {

			this.setForegroundColor(ColorConstants.black);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
