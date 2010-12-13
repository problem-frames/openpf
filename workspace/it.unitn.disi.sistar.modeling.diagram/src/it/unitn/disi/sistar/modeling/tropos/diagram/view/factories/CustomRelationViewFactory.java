package it.unitn.disi.sistar.modeling.tropos.diagram.view.factories;

import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStyleFactory;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EConnectionLineStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.EEndDecorationType;
import it.unitn.disi.sistar.modeling.styles.customStyle.EMidDecorationType;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.gmf.runtime.diagram.ui.view.factories.ConnectionViewFactory;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class CustomRelationViewFactory extends ConnectionViewFactory {

	/**
	 * @generated NOT
	 */
	protected List createStyles(View view) {
		List styles = new ArrayList();
		styles.add(NotationFactory.eINSTANCE.createRoutingStyle());
		styles.add(NotationFactory.eINSTANCE.createFontStyle());
		styles.add(NotationFactory.eINSTANCE.createLineStyle());
		styles.add(CustomStyleFactory.eINSTANCE.createConnectorDecoration());
		return styles;
	}
	
	/**
	 * @generated NOT
	 */
	protected void decorateView(View containerView, View view,
			IAdaptable semanticAdapter, String semanticHint, int index,
			boolean persisted) {
		
		CustomRelation customRelation = (CustomRelation)semanticAdapter.getAdapter(EObject.class);
		Map parameterMap = customRelation.getParameterMap();
		if (semanticHint == null) {
			semanticHint = TroposVisualIDRegistry
					.getType(it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.CustomRelationEditPart.VISUAL_ID);
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
		
		ConnectorDecoration decoration = (ConnectorDecoration)view.getStyle(CustomStylePackage.eINSTANCE.getConnectorDecoration());
		String attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_DECORATION_SOURCE);
		if(attribute!=null)
			decoration.setDecorationSource(EEndDecorationType.get(attribute));
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_DECORATION_TARGET);
		if(attribute!=null)
			decoration.setDecorationTarget(EEndDecorationType.get(attribute));
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_DECORATION_MIDDLE);
		if(attribute!=null)
			decoration.setDecorationMiddle(EMidDecorationType.get(attribute));
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_CONNECTION_LINESTYLE);
		if(attribute!=null)
			decoration.setConnectionLineStyle(EConnectionLineStyle.get(attribute));
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_DECORATION_MIDDLE_TEXT);
		if(attribute!=null)
			decoration.setDecorationMiddleText(attribute);
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_TEXT_SOURCE);
		if(attribute!=null)
			decoration.setTextSource(attribute);
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_TEXT_MIDDLE);
		if(attribute!=null)
			decoration.setTextMiddle(attribute);
		attribute = (String)parameterMap.get(PropertyConfig.CUSTREL_TEXT_TARGET);
		if(attribute!=null)
			decoration.setTextTarget(attribute);
		
	
	}

}
