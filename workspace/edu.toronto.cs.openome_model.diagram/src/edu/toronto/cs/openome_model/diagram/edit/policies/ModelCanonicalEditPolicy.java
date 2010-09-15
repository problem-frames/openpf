package edu.toronto.cs.openome_model.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetViewMutabilityCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ModelCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	private Set<EStructuralFeature> myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	@SuppressWarnings("rawtypes")
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		LinkedList<EObject> result = new LinkedList<EObject>();
		List<edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor> childDescriptors = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
				.getModel_79SemanticChildren(viewObject);
		for (edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor d : childDescriptors) {
			result.add(d.getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection<EObject> semanticChildren,
			final View view) {
		return isMyDiagramElement(view)
				&& !semanticChildren.contains(view.getElement());
	}

	/**
	 * @generated
	 */
	private boolean isMyDiagramElement(View view) {
		int visualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view);
		switch (visualID) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID:
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID:
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet<EStructuralFeature>();
			myFeaturesToSynchronize
					.add(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getModel_Containers());
			myFeaturesToSynchronize
					.add(edu.toronto.cs.openome_model.openome_modelPackage.eINSTANCE
							.getModel_Intentions());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		if (resolveSemanticElement() == null) {
			return;
		}
		LinkedList<IAdaptable> createdViews = new LinkedList<IAdaptable>();
		List<edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor> childDescriptors = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
				.getModel_79SemanticChildren((View) getHost().getModel());
		LinkedList<View> orphaned = new LinkedList<View>();
		// we care to check only views we recognize as ours
		LinkedList<View> knownViewChildren = new LinkedList<View>();
		for (View v : getViewChildren()) {
			if (isMyDiagramElement(v)) {
				knownViewChildren.add(v);
			}
		}
		// alternative to #cleanCanonicalSemanticChildren(getViewChildren(), semanticChildren)
		//
		// iteration happens over list of desired semantic elements, trying to find best matching View, while original CEP
		// iterates views, potentially losing view (size/bounds) information - i.e. if there are few views to reference same EObject, only last one 
		// to answer isOrphaned == true will be used for the domain element representation, see #cleanCanonicalSemanticChildren()
		for (Iterator<edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor> descriptorsIterator = childDescriptors
				.iterator(); descriptorsIterator.hasNext();) {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor next = descriptorsIterator
					.next();
			String hint = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getType(next.getVisualID());
			LinkedList<View> perfectMatch = new LinkedList<View>(); // both semanticElement and hint match that of NodeDescriptor
			for (View childView : getViewChildren()) {
				EObject semanticElement = childView.getElement();
				if (next.getModelElement().equals(semanticElement)) {
					if (hint.equals(childView.getType())) {
						perfectMatch.add(childView);
						// actually, can stop iteration over view children here, but
						// may want to use not the first view but last one as a 'real' match (the way original CEP does
						// with its trick with viewToSemanticMap inside #cleanCanonicalSemanticChildren
					}
				}
			}
			if (perfectMatch.size() > 0) {
				descriptorsIterator.remove(); // precise match found no need to create anything for the NodeDescriptor
				// use only one view (first or last?), keep rest as orphaned for further consideration
				knownViewChildren.remove(perfectMatch.getFirst());
			}
		}
		// those left in knownViewChildren are subject to removal - they are our diagram elements we didn't find match to,
		// or those we have potential matches to, and thus need to be recreated, preserving size/location information.
		orphaned.addAll(knownViewChildren);
		//
		ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>(
				childDescriptors.size());
		for (edu.toronto.cs.openome_model.diagram.part.Openome_modelNodeDescriptor next : childDescriptors) {
			String hint = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getType(next.getVisualID());
			IAdaptable elementAdapter = new CanonicalElementAdapter(
					next.getModelElement(), hint);
			CreateViewRequest.ViewDescriptor descriptor = new CreateViewRequest.ViewDescriptor(
					elementAdapter, Node.class, hint, ViewUtil.APPEND, false,
					host().getDiagramPreferencesHint());
			viewDescriptors.add(descriptor);
		}

		boolean changed = deleteViews(orphaned.iterator());
		//
		CreateViewRequest request = getCreateViewRequest(viewDescriptors);
		Command cmd = getCreateViewCommand(request);
		if (cmd != null && cmd.canExecute()) {
			SetViewMutabilityCommand.makeMutable(
					new EObjectAdapter(host().getNotationView())).execute();
			executeCommand(cmd);
			@SuppressWarnings("unchecked")
			List<IAdaptable> nl = (List<IAdaptable>) request.getNewObject();
			createdViews.addAll(nl);
		}
		if (changed || createdViews.size() > 0) {
			postProcessRefreshSemantic(createdViews);
		}

		Collection<IAdaptable> createdConnectionViews = refreshConnections();

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);

		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> refreshConnections() {
		Map<EObject, View> domain2NotationMap = new HashMap<EObject, View>();
		Collection<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor> linkDescriptors = collectAllLinks(
				getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			int diagramLinkVisualID = edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
					.getVisualID(nextDiagramLink);
			if (diagramLinkVisualID == -1) {
				if (nextDiagramLink.getSource() != null
						&& nextDiagramLink.getTarget() != null) {
					linksIterator.remove();
				}
				continue;
			}
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			for (Iterator<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor> linkDescriptorsIterator = linkDescriptors
					.iterator(); linkDescriptorsIterator.hasNext();) {
				edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor nextLinkDescriptor = linkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					linkDescriptorsIterator.remove();
					break;
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor> collectAllLinks(
			View view, Map<EObject, View> domain2NotationMap) {
		if (!edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getModelID(view))) {
			return Collections.emptyList();
		}
		LinkedList<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor> result = new LinkedList<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor>();
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {
		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getModel_79ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getActor_1001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getAgent_1002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getPosition_1003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getRole_1004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getGoal_1005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSoftgoal_1006ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getTask_1007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getResource_1008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getGoal_2001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSoftgoal_2002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getResource_2003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getTask_2004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getGoal_2005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSoftgoal_2006ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getResource_2007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getTask_2008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getGoal_2009ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSoftgoal_2010ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getResource_2011ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getTask_2012ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getGoal_2013ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSoftgoal_2014ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getResource_2015ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getTask_2016ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getDependency_3001ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getAndDecomposition_3002ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getOrDecomposition_3003ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getHelpContribution_3004ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getHurtContribution_3005ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getMakeContribution_3006ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getBreakContribution_3007ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSomePlusContribution_3008ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getSomeMinusContribution_3009ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getUnknownContribution_3010ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getAndContribution_3011ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getOrContribution_3012ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getIsAAssociation_3013ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getCoversAssociation_3014ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getOccupiesAssociation_3015ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getIsPartOfAssociation_3016ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getPlaysAssociation_3017ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID: {
			if (!domain2NotationMap.containsKey(view.getElement())) {
				result.addAll(edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramUpdater
						.getINSAssociation_3018ContainedLinks(view));
			}
			if (!domain2NotationMap.containsKey(view.getElement())
					|| view.getEAnnotation("Shortcut") == null) { //$NON-NLS-1$
				domain2NotationMap.put(view.getElement(), view);
			}
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<IAdaptable> createConnections(
			Collection<edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor> linkDescriptors,
			Map<EObject, View> domain2NotationMap) {
		LinkedList<IAdaptable> adapters = new LinkedList<IAdaptable>();
		for (edu.toronto.cs.openome_model.diagram.part.Openome_modelLinkDescriptor nextLinkDescriptor : linkDescriptors) {
			EditPart sourceEditPart = getEditPart(
					nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(
					nextLinkDescriptor.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(nextLinkDescriptor.getVisualID()),
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map<EObject, View> domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry()
					.get(view);
		}
		return null;
	}
}
