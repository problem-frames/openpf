package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.OwnershipRelationFigure;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.OwnershipItemSemanticEditPolicy;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class OwnershipEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3005;

	/**
	 * @generated
	 */
	public OwnershipEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new OwnershipItemSemanticEditPolicy());
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
		Color fillColor = null;
		FillStyle fillStyle = (FillStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFillStyle());

		if (fillStyle != null
				&& fillStyle.eIsSet(NotationPackage.eINSTANCE
						.getFillStyle_FillColor()))
			fillColor = DiagramColorRegistry.getInstance().getColor(
					new Integer(fillStyle.getFillColor()));
		if (ColorSchemaUtil.isBlackAndWhite())
			((OwnershipRelationFigure) getConnectionFigure())
					.getOwnershipDecoration().setBackgroundColor(
							ColorConstants.white);
		else {
			Color decorationBackgroundColor = ColorSchemaUtil
					.getColorPreference(PreferenceConstants.COLOR_OWNERSHIP,
							fillColor);
			getConnectionFigure().setBackgroundColor(decorationBackgroundColor);
			((OwnershipRelationFigure) getConnectionFigure())
					.getOwnershipDecoration().setBackgroundColor(
							decorationBackgroundColor);
		}
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute)
			if ("ownershipType".equals(((EAttribute) feature).getName())) {
				((OwnershipRelationFigure) getConnectionFigure())
						.setOwnershipType(((EOwnershipType) notification
								.getNewValue()));
			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				getConnectionFigure().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			} else if ("fillColor".equals(((EAttribute) feature).getName())) {
				Color color = DiagramColorRegistry.getInstance().getColor(
						new Integer(notification.getNewIntValue()));
				getConnectionFigure().setBackgroundColor(color);
				((OwnershipRelationFigure) getConnectionFigure())
						.getOwnershipDecoration().setBackgroundColor(color);
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
		Ownership elementObject = (Ownership) getPrimaryView().getElement();
		return new OwnershipRelationFigure(elementObject.getOwnershipType());
	}

	/**
	 * @generated
	 */
	public OwnershipRelationFigure getPrimaryShape() {
		return (OwnershipRelationFigure) getFigure();
	}

}
