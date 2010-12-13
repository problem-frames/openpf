package it.unitn.disi.sistar.modeling.tropos.diagram.providers;

import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.ConnectorDecoration;
import it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation;
import it.unitn.disi.sistar.modeling.styles.customStyle.provider.ActorStyleItemProvider;
import it.unitn.disi.sistar.modeling.styles.customStyle.provider.ConnectorDecorationItemProvider;
import it.unitn.disi.sistar.modeling.styles.customStyle.provider.CoreLocationItemProvider;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.properties.GetPropertySourceOperation;
import org.eclipse.gmf.runtime.common.ui.services.properties.ICompositePropertySource;
import org.eclipse.gmf.runtime.common.ui.services.properties.IPropertiesProvider;
import org.eclipse.gmf.runtime.emf.ui.properties.providers.GenericEMFPropertiesProvider;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TroposPropertyProvider extends GenericEMFPropertiesProvider
		implements IPropertiesProvider {

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetPropertySourceOperation) {
			Object object = ((GetPropertySourceOperation) operation)
					.getObject();
			return getSemanticElement(object) != null;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	public ICompositePropertySource getPropertySource(Object object) {
		EObject element = getSemanticElement(object);
		if (element != null) {
			ICompositePropertySource source = super.getPropertySource(element);
			if (source == null)
				if (object instanceof ActorStyle)
					return createPropertySource(object,
							new ActorStyleItemProvider(
									getAdapterFactory(object)));
				else if (object instanceof CoreLocation)
					return createPropertySource(object,
							new CoreLocationItemProvider(
									getAdapterFactory(object)));
				else if (object instanceof ConnectorDecoration)
					return createPropertySource(object,
							new ConnectorDecorationItemProvider(
									getAdapterFactory(object)));

			return source;
		}
		return null;
	}

	/**
	 * @generated NOT
	 */
	protected EObject getSemanticElement(Object object) {
		View view = null;

		if (object instanceof View) {
			view = (View) object;
		} else if (object instanceof EditPart) {
			EditPart editPart = (EditPart) object;
			if (editPart.getModel() instanceof View) {
				view = (View) editPart.getModel();
			}
		}

		if (object instanceof Style) {
			return (Style) object;
		}
		if (view != null
				&& DiagramEditPart.MODEL_ID.equals(TroposVisualIDRegistry
						.getModelID(view))) {
			return view.getElement();
		}
		return null;
	}

}
