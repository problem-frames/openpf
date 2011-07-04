package argument.argument.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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

import argument.argument.diagram.edit.parts.Argument2EditPart;
import argument.argument.diagram.edit.parts.Argument3EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartment2EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartment3EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartmentEditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartment2EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartment3EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartmentEditPart;
import argument.argument.diagram.edit.parts.ArgumentDiagramEditPart;
import argument.argument.diagram.edit.parts.ArgumentEditPart;
import argument.argument.diagram.edit.parts.ArgumentReplacesEditPart;
import argument.argument.diagram.edit.parts.MitigatesEditPart;
import argument.argument.diagram.edit.parts.MitigatesRestoresEditPart;
import argument.argument.diagram.edit.parts.RebutsDeniesEditPart;
import argument.argument.diagram.edit.parts.RebutsEditPart;
import argument.argument.diagram.part.ArgumentVisualIDRegistry;
import argument.argument.diagram.part.Messages;

/**
 * @generated
 */
public class ArgumentNavigatorContentProvider implements ICommonContentProvider {

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
	public ArgumentNavigatorContentProvider() {
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
			ArrayList<ArgumentNavigatorItem> result = new ArrayList<ArgumentNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews,
							ArgumentDiagramEditPart.MODEL_ID), file, false));
			return result.toArray();
		}

		if (parentElement instanceof ArgumentNavigatorGroup) {
			ArgumentNavigatorGroup group = (ArgumentNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof ArgumentNavigatorItem) {
			ArgumentNavigatorItem navigatorItem = (ArgumentNavigatorItem) parentElement;
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
		switch (ArgumentVisualIDRegistry.getVisualID(view)) {

		case ArgumentReplacesEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArgumentNavigatorGroup target = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentReplaces_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup source = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentReplaces_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
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

		case RebutsDeniesEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArgumentNavigatorGroup target = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_RebutsDenies_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup source = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_RebutsDenies_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case ArgumentDiagramEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			ArgumentNavigatorGroup links = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_ArgumentDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(RebutsDeniesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesRestoresEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case Argument3EditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArgumentNavigatorGroup incominglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup outgoinglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentGroundsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentWarrantsCompartment3EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(RebutsDeniesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesRestoresEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
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

		case Argument2EditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArgumentNavigatorGroup incominglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup outgoinglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(RebutsDeniesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesRestoresEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
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

		case ArgumentEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Node sv = (Node) view;
			ArgumentNavigatorGroup incominglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup outgoinglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Argument_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(
					Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry.getType(RebutsEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(RebutsDeniesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(MitigatesRestoresEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentReplacesEditPart.VISUAL_ID));
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

		case MitigatesRestoresEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArgumentNavigatorGroup target = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_MitigatesRestores_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup source = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_MitigatesRestores_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case RebutsEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArgumentNavigatorGroup target = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Rebuts_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup source = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Rebuts_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup outgoinglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Rebuts_4001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MitigatesEditPart.VISUAL_ID: {
			LinkedList<ArgumentAbstractNavigatorItem> result = new LinkedList<ArgumentAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			ArgumentNavigatorGroup target = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Mitigates_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup source = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Mitigates_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			ArgumentNavigatorGroup outgoinglinks = new ArgumentNavigatorGroup(
					Messages.NavigatorGroupName_Mitigates_4002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(ArgumentEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					ArgumentVisualIDRegistry
							.getType(Argument3EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
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

	// TODO refactor as static method
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
		return ArgumentDiagramEditPart.MODEL_ID.equals(ArgumentVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<ArgumentNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<ArgumentNavigatorItem> result = new ArrayList<ArgumentNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new ArgumentNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof ArgumentAbstractNavigatorItem) {
			ArgumentAbstractNavigatorItem abstractNavigatorItem = (ArgumentAbstractNavigatorItem) element;
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
