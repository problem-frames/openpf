package edu.toronto.cs.openome_model.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import java.util.LinkedList;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class Openome_modelNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Openome_modelNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem> result = new ArrayList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(
							topViews,
							edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup group = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem navigatorItem = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getVisualID(view)) {

		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_HelpContribution_3004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_HelpContribution_3004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_1005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_1005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_AndContribution_3011_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_AndContribution_3011_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup links = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Model_79_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Dependency_3001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Dependency_3001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OrContribution_3012_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OrContribution_3012_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_PlaysAssociation_3017_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_PlaysAssociation_3017_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_HurtContribution_3005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_HurtContribution_3005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_IsAAssociation_3013_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_IsAAssociation_3013_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_UnknownContribution_3010_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_UnknownContribution_3010_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Agent_1002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Agent_1002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_INSAssociation_3018_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_INSAssociation_3018_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_AndDecomposition_3002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_AndDecomposition_3002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_SomePlusContribution_3008_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_SomePlusContribution_3008_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_1007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_1007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_1006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_1006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_CoversAssociation_3014_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_CoversAssociation_3014_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_2007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OrDecomposition_3003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OrDecomposition_3003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_1008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Resource_1008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_MakeContribution_3006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_MakeContribution_3006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Role_1004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Role_1004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_IsPartOfAssociation_3016_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_IsPartOfAssociation_3016_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_SomeMinusContribution_3009_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_SomeMinusContribution_3009_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_BreakContribution_3007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_BreakContribution_3007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2005_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Goal_2005_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2008_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Actor_1001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Actor_1001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup target = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OccupiesAssociation_3015_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup source = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_OccupiesAssociation_3015_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2004_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Task_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Position_1003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Position_1003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(
					connectedViews,
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart.VISUAL_ID: {
			LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem> result = new LinkedList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem>();
			Node sv = (Node) view;
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup incominglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup outgoinglinks = new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorGroup(
					edu.toronto.cs.openome_model.diagram.part.Messages.NavigatorGroupName_Softgoal_2010_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
							.getType(edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart.MODEL_ID
				.equals(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem> result = new ArrayList<edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new edu.toronto.cs.openome_model.diagram.navigator.Openome_modelNavigatorItem(
					nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem) {
			edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem abstractNavigatorItem = (edu.toronto.cs.openome_model.diagram.navigator.Openome_modelAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
