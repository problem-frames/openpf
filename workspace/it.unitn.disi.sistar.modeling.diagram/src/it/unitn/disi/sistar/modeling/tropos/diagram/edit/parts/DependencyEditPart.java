package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.connections.DependencyRelationFigure;
import it.unitn.disi.sistar.figures.decorations.HideableDecoration;
import it.unitn.disi.sistar.modeling.api.editparts.IDependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.DependencyItemSemanticEditPolicy;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ColorSchemaUtil;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.FontStyle;
import org.eclipse.gmf.runtime.notation.LineStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated NOT
 */
public class DependencyEditPart extends ConnectionNodeEditPart implements
		IDependencyEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	public DependencyEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DependencyItemSemanticEditPolicy());
	}

	//minh sang: apply font for dependency
	@Override
	protected void refreshFont() {
		super.refreshFont();
		HideableDecoration decoration = ((DependencyRelationFigure) getConnectionFigure()).getDependencyDecoration();
		decoration.setFont(getFigure().getFont());
		decoration.repaint();
		
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
			((DependencyRelationFigure) getConnectionFigure())
					.getDependencyDecoration().setBackgroundColor(
							ColorConstants.white);
		else {
			//minh sang: the following code set fill color for dependency decorator
			Dependency dep = this.getElement();
			String colorDependency = PreferenceConstants.COLOR_DEPENDENCY;
			
			switch (dep.getDependencyType().getValue()) {
			case EDependencyType.DELEGATION_EXECUTION:
				break;
			case EDependencyType.DELEGATION_PERMISSION:
				colorDependency = PreferenceConstants.COLOR_DP_DEPENDENCY;
				break;
			case EDependencyType.DISTRUST_EXECUTION:
				colorDependency = PreferenceConstants.COLOR_SE_DEPENDENCY;
				break;
			case EDependencyType.DISTRUST_PERMISSION:
				colorDependency = PreferenceConstants.COLOR_SP_DEPENDENCY;
				break;
			case EDependencyType.MONITORING_EXECUTION:
				colorDependency = PreferenceConstants.COLOR_ME_DEPENDENCY;
				break;
			case EDependencyType.MONITORING_PERMISSION:
				colorDependency = PreferenceConstants.COLOR_MP_DEPENDENCY;
				break;
			case EDependencyType.TRUST_EXECUTION:
				colorDependency = PreferenceConstants.COLOR_TE_DEPENDENCY;
				break;
			case EDependencyType.TRUST_PERMISSION:
				colorDependency = PreferenceConstants.COLOR_TP_DEPENDENCY;
				break;
			case EDependencyType.TRUST_MONITOR:
				colorDependency = PreferenceConstants.COLOR_TM_DEPENDENCY;
				break;
			}
			
			Color decorationBackgroundColor = ColorSchemaUtil
					.getColorPreference(colorDependency,
							fillColor);
			getConnectionFigure().setBackgroundColor(decorationBackgroundColor);
			
			FontStyle fs = (FontStyle) getPrimaryView().getStyle(NotationPackage.eINSTANCE.getFontStyle());
			
			if (fs != null)
				((DependencyRelationFigure) getConnectionFigure())  // minh sang: update decorator foreground
				.getDependencyDecoration().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(fs.getFontColor()));
			
			((DependencyRelationFigure) getConnectionFigure())
					.getDependencyDecoration().setBackgroundColor(
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
			if (NotationPackage.eINSTANCE.getFontStyle_FontColor().equals(feature)) { //minh sang: to adjust font color
				Integer c = (Integer) notification.getNewValue();
				HideableDecoration decoration = ((DependencyRelationFigure) getConnectionFigure()).getDependencyDecoration();
				decoration.setForegroundColor(DiagramColorRegistry.getInstance().getColor(c));
			} 
			else if ("dependencyType".equals(((EAttribute) feature).getName())) {
				((DependencyRelationFigure) getConnectionFigure())
						.setDependencyType((EDependencyType) notification
								.getNewValue());
			} else if ("lineColor".equals(((EAttribute) feature).getName())) {
				getConnectionFigure().setForegroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			} else if ("fillColor".equals(((EAttribute) feature).getName())) {
				Color color = DiagramColorRegistry.getInstance().getColor(
						new Integer(notification.getNewIntValue()));
				getConnectionFigure().setBackgroundColor(color);
				((DependencyRelationFigure) getConnectionFigure())
						.getDependencyDecoration().setBackgroundColor(color);
			} else if ("dependencyProperties".equals(((EAttribute) feature)
					.getName())) {
				Dependency thisLink = (Dependency) getPrimaryView()
						.getElement();
				Dependency correspondingLink = getCorrespondingLinks();
				if (correspondingLink != null)
					correspondingLink.setDependencyProperties(notification
							.getNewStringValue());
			}
	}

	public Dependency getElement() {
		return (Dependency) getPrimaryView().getElement();
	}

	public Dependency getCorrespondingLinks() {
		Edge thisEdge = (Edge) getPrimaryView();
		Dependency thisLink = (Dependency) getPrimaryView().getElement();
		if (thisEdge.getTarget().getElement() instanceof Service) {
			List links = thisEdge.getTarget().getSourceEdges();
			for (Iterator iter = links.iterator(); iter.hasNext();) {
				Edge nextLink = (Edge) iter.next();
				if (nextLink.getElement() instanceof Dependency) {
					Dependency nextDependency = (Dependency) nextLink
							.getElement();
					if (nextDependency.getDependencyType() == thisLink
							.getDependencyType()) {
						return nextDependency;
					}
				}
			}
		} else if (thisEdge.getSource().getElement() instanceof Service) {
			List links = thisEdge.getSource().getTargetEdges();
			for (Iterator iter = links.iterator(); iter.hasNext();) {
				Edge previousLink = (Edge) iter.next();
				if (previousLink.getElement() instanceof Dependency) {
					Dependency nextDependency = (Dependency) previousLink
							.getElement();
					if (nextDependency.getDependencyType() == thisLink
							.getDependencyType()) {
						return nextDependency;
					}
				}
			}
		}
		return null;
	}

	public void changeRepresentation(boolean useTroposModel) {
		((DependencyRelationFigure) getConnectionFigure())
				.setUseTroposModel(useTroposModel);

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
		Dependency elementObject = (Dependency) getPrimaryView().getElement();
		return new DependencyRelationFigure(elementObject.getDependencyType());
	}

}
