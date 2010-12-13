package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.CustomRelationFigure;
import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.CustomRelationItemSemanticEditPolicy;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class CustomRelationEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3007;

	/**
	 * @generated
	 */
	public CustomRelationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CustomRelationItemSemanticEditPolicy());
	}

	protected Connection createConnectionFigure() {
		CustomRelationFigure connection = new CustomRelationFigure();
		ConnectorDecoration decorationStyle = (ConnectorDecoration) getEdge()
				.getStyle(CustomStylePackage.eINSTANCE.getConnectorDecoration());
		if (decorationStyle != null) {
			connection.setSourceDecorationType(decorationStyle
					.getDecorationSource());
			connection.setTargetDecorationType(decorationStyle
					.getDecorationTarget());
			connection.setMidDecorationType(decorationStyle
					.getDecorationMiddle());
			connection.setConnectionLineStyle(decorationStyle
					.getConnectionLineStyle());
			connection.setDecorationMiddleText(decorationStyle
					.getDecorationMiddleText());
			connection.setTextSource(decorationStyle.getTextSource());
			connection.setTextMiddle(decorationStyle.getTextMiddle());
			connection.setTextTarget(decorationStyle.getTextTarget());
		}
		return connection;
	}

	/**
	 * @generated
	 */
	public CustomRelationFigure getPrimaryShape() {
		return (CustomRelationFigure) getFigure();
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);

		Object feature = notification.getFeature();
		if (feature instanceof EAttribute) {
			if ("decorationSource".equals(((EAttribute) feature).getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection
						.setSourceDecorationType((EEndDecorationType) notification
								.getNewValue());
				connection.refreshLine();
			} else if ("decorationTarget".equals(((EAttribute) feature)
					.getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection
						.setTargetDecorationType((EEndDecorationType) notification
								.getNewValue());
				connection.refreshLine();
			} else if ("decorationMiddle".equals(((EAttribute) feature)
					.getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection
						.setMidDecorationType((EMidDecorationType) notification
								.getNewValue());
				connection.refreshLine();
			} else if ("connectionLineStyle".equals(((EAttribute) feature)
					.getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection
						.setConnectionLineStyle((EConnectionLineStyle) notification
								.getNewValue());
				connection.refreshLine();
			} else if ("decorationMiddleText".equals(((EAttribute) feature)
					.getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection.setDecorationMiddleText(notification
						.getNewStringValue());
				connection.refreshLine();
			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				getConnectionFigure().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			} else if ("textSource".equals(((EAttribute) feature).getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection.setTextSource(notification.getNewStringValue());
			} else if ("textMiddle".equals(((EAttribute) feature).getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection.setTextMiddle(notification.getNewStringValue());
			} else if ("textTarget".equals(((EAttribute) feature).getName())) {
				CustomRelationFigure connection = (CustomRelationFigure) getConnectionFigure();
				connection.setTextTarget(notification.getNewStringValue());
			}
		}
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

}
