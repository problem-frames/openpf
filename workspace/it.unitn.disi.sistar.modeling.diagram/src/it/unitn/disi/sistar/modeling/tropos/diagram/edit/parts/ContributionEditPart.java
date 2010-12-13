package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.ContributionRelationFigure;
import it.unitn.disi.sistar.mapping.ContributionTypeMapper;
import it.unitn.disi.sistar.modeling.api.editparts.IContributionEditPart;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.ESATType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ContributionItemSemanticEditPolicy;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated NOT
 */
public class ContributionEditPart extends ConnectionNodeEditPart implements
		IContributionEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

	/**
	 * @generated
	 */
	public ContributionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ContributionItemSemanticEditPolicy());
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute) {
			Contribution contribution = (Contribution) getPrimaryView()
					.getElement();
			if ("contributionType".equals(((EAttribute) feature).getName())) {
				((WrapLabel) getConnectionFigure().getChildren().get(0))
						.setText(ContributionTypeMapper.mapAttribute(
								(EContributionType) notification.getNewValue(),
								contribution.getSatType(), contribution
										.getWeight()));
			} else if ("relationshipType".equals(((EAttribute) feature)
					.getName())) {
				((ContributionRelationFigure) getConnectionFigure())
						.setRelationshipType((ERelationshipType) notification
								.getNewValue());
			} else if ("satType".equals(((EAttribute) feature).getName())) {
				((WrapLabel) getConnectionFigure().getChildren().get(0))
						.setText(ContributionTypeMapper.mapAttribute(
								contribution.getContributionType(),
								(ESATType) notification.getNewValue(),
								contribution.getWeight()));
			} else if ("weight".equals(((EAttribute) feature).getName())) {
				((WrapLabel) getConnectionFigure().getChildren().get(0))
						.setText(ContributionTypeMapper.mapAttribute(
								contribution.getContributionType(),
								contribution.getSatType(), notification
										.getNewDoubleValue()));
			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				Color color = DiagramColorRegistry.getInstance().getColor(
						new Integer(notification.getNewIntValue()));
				getConnectionFigure().setForegroundColor(color);
				getConnectionFigure().setBackgroundColor(color);
				((ContributionFigure) getConnectionFigure()).getDecoration()
						.setBackgroundColor(color);
			}
		}
	}

	public void refreshLabels() {
		Contribution contribution = (Contribution) getPrimaryView()
				.getElement();
		((WrapLabel) getConnectionFigure().getChildren().get(0))
				.setText(ContributionTypeMapper.mapAttribute(contribution
						.getContributionType(), contribution.getSatType(),
						contribution.getWeight()));
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
		Color color = ColorSchemaUtil.getLineColorPreference(
				ColorConstants.black, bgColor);
		getConnectionFigure().setForegroundColor(color);
		((ContributionFigure) getConnectionFigure()).getDecoration()
				.setBackgroundColor(color);
	}

	protected Connection createConnectionFigure() {

		Contribution element = (Contribution) getPrimaryView().getElement();

		ContributionRelationFigure contributionFigure = new ContributionFigure(
				element.getRelationshipType());
		return contributionFigure;
	}

	/**
	 * @generated NOT
	 */
	public class ContributionFigure extends ContributionRelationFigure {

		/**
		 * @generated NOT
		 */
		public ContributionFigure(ERelationshipType type) {
			super(type);
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black);
		}

	}

}
