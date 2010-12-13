package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.HideableRelationFigure;
import it.unitn.disi.sistar.figures.decorations.LabelDecoration;
import it.unitn.disi.sistar.mapping.AssociationTypeMapper;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.AssociationItemSemanticEditPolicy;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class AssociationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	private LabelDecoration label;

	/**
	 * @generated
	 */
	public AssociationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new AssociationItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
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
		AssociationFigure figure = new AssociationFigure();
		return figure;
	}

	/**
	 * @generated
	 */
	public AssociationFigure getPrimaryShape() {
		return (AssociationFigure) getFigure();
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

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute)
			if ("associationType".equals(((EAttribute) feature).getName())) {
				((WrapLabel) getConnectionFigure().getChildren().get(0))
						.setText(AssociationTypeMapper
								.mapAttribute((EAssociationType) notification
										.getNewValue()));
				label.setLabel(AssociationTypeMapper
						.mapAttribute((EAssociationType) notification
								.getNewValue()));
				label.repaint();

			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				getConnectionFigure().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			}
	}

	/**
	 * @generated NOT
	 */
	public class AssociationFigure extends HideableRelationFigure {

		/**
		 * @generated NOT
		 */
		public AssociationFigure() {
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);
			setTargetDecoration(createTargetDecoration());
			LabelDecoration f = new LabelDecoration(AssociationTypeMapper
					.mapAttribute(((Association) getPrimaryView().getElement())
							.getAssociationType()));

			//RotatableObjectLocator locator = new RotatableObjectLocator(this,
			//		ConnectionLocator.MIDDLE);
			//add(f, locator);
			label = f;
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(1);
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(2));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(-2));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

}
