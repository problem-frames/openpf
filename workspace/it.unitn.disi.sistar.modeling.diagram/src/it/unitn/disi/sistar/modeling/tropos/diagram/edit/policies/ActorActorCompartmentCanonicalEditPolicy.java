package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramUpdater;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposNodeDescriptor;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationUtil;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActorActorCompartmentCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = TroposDiagramUpdater
				.getActorActorCompartment_5001SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
			result.add(((TroposNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = TroposVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ServiceEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean shouldHandleNotificationEvent(Notification event) {
		Object element = event.getNotifier();
		if (element instanceof EObject && !(element instanceof View)
				&& NotificationUtil.isSlotModified(event))
			return true;
		return super.shouldHandleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(TroposPackage.eINSTANCE
					.getActor_Services());
		}
		return myFeaturesToSynchronize;
	}

}
