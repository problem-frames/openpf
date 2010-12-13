package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.compartments.ActorCompartmentFigure;
import it.unitn.disi.sistar.figures.nodes.ActorFigure;
import it.unitn.disi.sistar.figures.nodes.CompartmentEllipseFigure;
import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorActorCompartmentCanonicalEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorActorCompartmentDragDropEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorActorCompartmentGraphicalNodeEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorActorCompartmentItemSemanticEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.Messages;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutAnimator;
import org.eclipse.draw2d.ScrollPane;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ResizableCompartmentEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class ActorActorCompartmentEditPart extends ShapeCompartmentEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 5001;

	/**
	 * @generated
	 */
	public ActorActorCompartmentEditPart(View view) {
		super(view);
	}

	@Override
	protected void setCollapsed(boolean collapsed, boolean animate) {
		super.setCollapsed(collapsed, animate);
	}

	/**
	 * @generated
	 */
	public String getCompartmentName() {
		return Messages.ActorActorCompartmentEditPart_title;
	}

	/**
	 * @generated NOT
	 */
	public IFigure createFigure() {
		ActorCompartmentFigure result = new ActorCompartmentFigure(
				getCompartmentName(), getMapMode());
		result.getContentPane().setLayoutManager(getLayoutManager());
		result.getContentPane().addLayoutListener(LayoutAnimator.getDefault());
		result.setBorder(null);
		result.setTitleVisibility(false);
		return result;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE,
				new ResizableCompartmentEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActorActorCompartmentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new ActorActorCompartmentDragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ActorActorCompartmentCanonicalEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new ActorActorCompartmentGraphicalNodeEditPolicy());

		EList childrenView = ((Node) getPrimaryView().getChildren().get(1))
				.eContents();
		for (Iterator iter = childrenView.iterator(); iter.hasNext();) {
			Object element = (Object) iter.next();
			if (element instanceof DrawerStyle) {

				boolean isCollapsed = ((DrawerStyle) element).isCollapsed();
				ActorStyle actorStyle = (ActorStyle) getPrimaryView().getStyle(
						CustomStylePackage.eINSTANCE.getActorStyle());
				ActorFigure actorFigure = ((ActorEditPart) getParent())
						.getPrimaryShape();
				if (isCollapsed) {
					((ActorCompartmentFigure) getFigure()).collapse();
					if (actorStyle != null) {
						if (actorStyle.getActorWidth() > 0)
							actorFigure.setWidth(actorStyle.getActorWidth());
						if (actorStyle.getActorHeight() > 0)
							actorFigure.setHeight(actorStyle.getActorHeight());
					}
				} else {
					if (actorStyle != null) {
						actorFigure.setCoreX(actorStyle.getActorX());
						actorFigure.setCoreY(actorStyle.getActorY());
						if (actorStyle.getActorWidth() > 0)
							actorFigure.setWidth(actorStyle.getActorWidth());
						if (actorStyle.getActorHeight() > 0)
							actorFigure.setHeight(actorStyle.getActorHeight());
					}
				}
				break;
			}
		}

	}

	@Override
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);

		Object feature = event.getFeature();
		if (TroposPackage.eINSTANCE.getActor_Services().equals(feature)
				&& event.getNewValue() != null) {
			//Bounds actorBounds = (Bounds)((Node)getPrimaryView()).getLayoutConstraint();
			//Service service = (Service)event.getNewValue();
			//ServiceEditPart serviceEditPart = (ServiceEditPart)((DiagramEditPart)((ActorEditPart)getParent()).getParent()).findEditPart(null, service);
			//((ActorEditPart)getParent()).correctBounds(actorBounds.getWidth(), actorBounds.getHeight(), (Node)serviceEditPart.getPrimaryView());
		}
		if (NotationPackage.eINSTANCE.getDrawerStyle_Collapsed()
				.equals(feature)) {
			Node actorNode = (Node) getPrimaryView();
			ActorFigure actorFigure = ((ActorEditPart) getParent())
					.getPrimaryShape();

			Node compartmentNode = (Node) (actorNode.getChildren().get(1));
			EList childrenNodes = (EList) compartmentNode.getChildren();

			Bounds bounds = (Bounds) actorNode.getLayoutConstraint();

			if (event.getNewBooleanValue()) {
				/* minhsang:
				 * if getNewBooleanValue() returns false, it means that we are collapsing the ActorCompartment
				 * In this case, try to remember current compartment size.
				 * 
				 */
				getCompartmentFigure().getScrollPane()
						.setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				getCompartmentFigure().getScrollPane()
						.setHorizontalScrollBarVisibility(ScrollPane.NEVER);
				actorFigure.setExpandedHeight(bounds.getHeight());
				actorFigure.setExpandedWidth(bounds.getWidth());
				actorFigure.setCollapsed(true);
				bounds.setX(bounds.getX() + actorFigure.getCoreX());
				bounds.setY(bounds.getY() + actorFigure.getCoreY());
				bounds.setWidth(actorFigure.getImageBound().width);
				bounds.setHeight(actorFigure.getImageBound().height);
				actorFigure.setCoreX(0);
				actorFigure.setCoreY(0);
				actorFigure.getBounds().setSize(bounds.getWidth(),
						bounds.getHeight());
				//actorFigure.setBounds(new Rectangle(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight()));
				((CompartmentEllipseFigure) ((ActorEditPart) getParent())
						.getSecondaryShape()).setHidden(true);
			} else {
				getCompartmentFigure().getScrollPane()
						.setHorizontalScrollBarVisibility(ScrollPane.AUTOMATIC);
				getCompartmentFigure().getScrollPane()
						.setHorizontalScrollBarVisibility(ScrollPane.AUTOMATIC);
				bounds.setWidth(actorFigure.getExpandedWidth());
				bounds.setHeight(actorFigure.getExpandedHeight());
				ActorStyle actorStyle = (ActorStyle) actorNode
						.getStyle(CustomStylePackage.eINSTANCE.getActorStyle());
				if (actorStyle != null) {
					if (bounds.getWidth() > actorStyle.getActorX()
							+ actorFigure.getWidth())
						actorFigure.setCoreX(actorStyle.getActorX());
					else
						actorFigure.setCoreX(bounds.getWidth()
								- actorFigure.getWidth());

					if (bounds.getHeight() > actorStyle.getActorY()
							+ actorFigure.getHeight())
						actorFigure.setCoreY(actorStyle.getActorY());
					else
						actorFigure.setCoreY(bounds.getHeight()
								- actorFigure.getHeight());

					bounds.setX(bounds.getX() - actorFigure.getCoreX());
					bounds.setY(bounds.getY() - actorFigure.getCoreY());
				}
				actorFigure.getBounds().setSize(bounds.getWidth(),
						bounds.getHeight());
				//actorFigure.setBounds(new Rectangle(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight()));
				actorFigure.setCollapsed(false);
				((CompartmentEllipseFigure) ((ActorEditPart) getParent())
						.getSecondaryShape()).setHidden(false);
			}
			if (!event.getNewBooleanValue()) {
				DiagramEditPart diagramEditPart = (DiagramEditPart) getRoot()
						.getContents();
				List diagramServices = ((Diagram) diagramEditPart
						.getDiagramView().getElement()).getObject();
				List currentServices = new ArrayList();
				currentServices.addAll(diagramServices);
				for (Iterator iter = currentServices.iterator(); iter.hasNext();) {
					EObject element = (EObject) iter.next();
					if (element instanceof Service) {
						Service serviceElement = (Service) element;
						ServiceEditPart serviceEditPart = (ServiceEditPart) diagramEditPart
								.findEditPart(null, serviceElement);
						List targetConnectionList = serviceEditPart
								.getTargetConnections();
						Bounds serviceElementBounds = (Bounds) ((Node) serviceEditPart
								.getPrimaryView()).getLayoutConstraint();
						if (serviceElementBounds.getX()
								+ serviceElementBounds.getWidth() < bounds
								.getX()
								+ bounds.getWidth()
								&& serviceElementBounds.getY()
										+ serviceElementBounds.getHeight() < bounds
										.getY()
										+ bounds.getHeight()
								&& serviceElementBounds.getX() > bounds.getX()
								&& serviceElementBounds.getY() > bounds.getY()) {
							for (Iterator iterator = targetConnectionList
									.iterator(); iterator.hasNext();) {
								ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iterator
										.next();
								if (connectionEditPart.getSource() == getParent()
										&& connectionEditPart instanceof DependencyEditPart) {
									DependencyEditPart dependencyEditPart = (DependencyEditPart) connectionEditPart;
									DestroyElementRequest deleteLinkRequest = new DestroyElementRequest(
											dependencyEditPart.getPrimaryView()
													.getElement(), false);
									Map parameter = new HashMap();
									parameter.put("CLEANUP", true);
									deleteLinkRequest.addParameters(parameter);
									Command command = dependencyEditPart
											.getCommand(new EditCommandRequestWrapper(
													deleteLinkRequest));
									diagramEditPart.getDiagramEditDomain()
											.getDiagramCommandStack().execute(
													command);

									ChangeBoundsRequest changeBoundsForDragDropRequest = new ChangeBoundsRequest();
									changeBoundsForDragDropRequest
											.setEditParts(serviceEditPart);
									changeBoundsForDragDropRequest
											.setLocation(serviceEditPart
													.getLocation());
									changeBoundsForDragDropRequest
											.setMoveDelta(new Point(0, 0));
									changeBoundsForDragDropRequest
											.setSizeDelta(new Dimension(0, 0));
									changeBoundsForDragDropRequest
											.setType(RequestConstants.REQ_DROP);

									Command changeBoundsForDragDropCommand = getCommand(changeBoundsForDragDropRequest);
									getDiagramEditDomain()
											.getDiagramCommandStack()
											.execute(
													changeBoundsForDragDropCommand);
								}
							}
						}
					}
				}
			}
			List elementList = new ArrayList();
			elementList.addAll(childrenNodes);

			//for auto snap of delegation closed temp
			for (Iterator iter = elementList.iterator(); iter.hasNext();) {
				Node innerServiceNode = (Node) iter.next();
				Service innerService = (Service) innerServiceNode.getElement();
				List sourceEdgeList = innerServiceNode.getSourceEdges();
				boolean needReparent = false;
				Actor targetActor = null;
				EDependencyType type = null;
				for (Iterator iterator = sourceEdgeList.iterator(); iterator
						.hasNext();) {
					Edge element = (Edge) iterator.next();
					if (element.getElement() instanceof Dependency) {
						needReparent = true;
						if (element.getTarget().getElement() instanceof Actor) {
							targetActor = (Actor) element.getTarget()
									.getElement();
							type = ((Dependency) element.getElement())
									.getDependencyType();
						}
					}
				}
				if (needReparent && event.getNewBooleanValue()) {
					DiagramEditPart diagramEditPart = (DiagramEditPart) getRoot()
							.getContents();
					ServiceEditPart serviceEditPart = (ServiceEditPart) diagramEditPart
							.findEditPart(null, innerService);
					if (serviceEditPart != null) {
						ChangeBoundsRequest changeBoundsForDragDropRequest = new ChangeBoundsRequest();
						changeBoundsForDragDropRequest
								.setEditParts(serviceEditPart);
						changeBoundsForDragDropRequest
								.setLocation(serviceEditPart.getLocation());
						changeBoundsForDragDropRequest.setMoveDelta(new Point(
								0, 0));
						changeBoundsForDragDropRequest
								.setSizeDelta(new Dimension(0, 0));
						changeBoundsForDragDropRequest
								.setType(RequestConstants.REQ_DROP);

						Command changeBoundsForDragDropCommand = diagramEditPart
								.getCommand(changeBoundsForDragDropRequest);
						getDiagramEditDomain().getDiagramCommandStack()
								.execute(changeBoundsForDragDropCommand);
						serviceEditPart.getPrimaryView().setVisible(true);

						for (Iterator iterator = serviceEditPart
								.getPrimaryView().getSourceEdges().iterator(); iterator
								.hasNext();) {
							Edge element = (Edge) iterator.next();
							if (element.getTarget().isVisible())
								element.setVisible(true);
							else
								element.setVisible(false);
						}
						for (Iterator iterator = serviceEditPart
								.getPrimaryView().getTargetEdges().iterator(); iterator
								.hasNext();) {
							Edge element = (Edge) iterator.next();
							if (element.getSource().isVisible())
								element.setVisible(true);
							else
								element.setVisible(false);
						}
						final CreateConnectionViewAndElementRequest firstLinkRequest = (CreateConnectionViewAndElementRequest) CreateViewRequestFactory
								.getCreateConnectionRequest(
										TroposElementTypes.Dependency_3004,
										TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

						Map firstLinkExtendedData = firstLinkRequest
								.getExtendedData();
						firstLinkExtendedData.put(
								CreateDependencyTool.DEPENDENCY_TYPE, type);
						firstLinkRequest.setExtendedData(firstLinkExtendedData);
						firstLinkRequest
								.setType(RequestConstants.REQ_CONNECTION_START);
						firstLinkRequest.setSourceEditPart(diagramEditPart
								.findEditPart(null, actorNode.getElement()));
						firstLinkRequest.getSourceEditPart().getCommand(
								firstLinkRequest);
						firstLinkRequest
								.setType(RequestConstants.REQ_CONNECTION_END);
						firstLinkRequest.setTargetEditPart(serviceEditPart);
						Command createLinkCommand = serviceEditPart
								.getCommand(firstLinkRequest);
						getDiagramEditDomain().getDiagramCommandStack()
								.execute(createLinkCommand);
					}
				}
			}

			for (Iterator iter = childrenNodes.iterator(); iter.hasNext();) {
				Node serviceNode = (Node) iter.next();
				serviceNode.setVisible(!event.getNewBooleanValue());

				Bounds serviceNodeBound = ((Bounds) serviceNode
						.getLayoutConstraint());
				if (!event.getNewBooleanValue()) {
					int serviceWidth = serviceNodeBound.getWidth() == -1 ? PreferenceUtil
							.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE)
							: serviceNodeBound.getWidth();
					int serviceHeight = serviceNodeBound.getHeight() == -1 ? PreferenceUtil
							.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE)
							: serviceNodeBound.getHeight();

					if (serviceNodeBound.getX() < 20)
						serviceNodeBound.setX(20);
					if (serviceNodeBound.getY() < 20)
						serviceNodeBound.setY(20);
				}

				EList sourceEdges = serviceNode.getSourceEdges();
				for (Iterator iter1 = sourceEdges.iterator(); iter1.hasNext();) {
					Edge edge = (Edge) iter1.next();
					if (event.getNewBooleanValue()
							&& (!edge.getSource().isVisible() || !edge
									.getTarget().isVisible()))
						edge.setVisible(false);
					else
						edge.setVisible(true);
				}

				EList targetEdges = serviceNode.getTargetEdges();
				for (Iterator iter2 = targetEdges.iterator(); iter2.hasNext();) {
					Edge edge = (Edge) iter2.next();
					if (event.getNewBooleanValue()
							&& (!edge.getSource().isVisible() || !edge
									.getTarget().isVisible()))
						edge.setVisible(false);
					else
						edge.setVisible(true);
				}
			}

			List list = getPrimaryEditParts();
			for (Iterator iter = list.iterator(); iter.hasNext();) {
				Object element = iter.next();
				if (element instanceof ConnectionNodeEditPart) {
					ConnectionNodeEditPart conn = (ConnectionNodeEditPart) element;
					conn.refresh();
				}
			}
			Command command = ((DiagramEditPart) getRoot().getContents())
					.getCommand(new Request(RequestConstants.REQ_REFRESH));
			getDiagramEditDomain().getDiagramCommandStack().execute(command);

		}

	}

	/**
	 * @generated
	 */
	protected void setRatio(Double ratio) {
		if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
			super.setRatio(ratio);
		}
	}
}
