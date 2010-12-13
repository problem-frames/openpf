package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.anchors.ServiceAnchor;
import it.unitn.disi.sistar.figures.labels.CustomWrapLabel;
import it.unitn.disi.sistar.modeling.api.editparts.IServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ServiceItemSemanticEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.DiagramCreatorUtil;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ColorSchemaUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramColorRegistry;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated NOT
 */
public class ServiceEditPart extends ShapeNodeEditPart implements IServiceEditPart {

	private String remarks;

	private String alternateRemarks;

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ServiceEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ServiceItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			@Override
			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			@Override
			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			@Override
			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ServiceFigure figure = new ServiceFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ServiceFigure getPrimaryShape() {
		return (ServiceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceNameEditPart) {
			((ServiceNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureServiceNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	@Override
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);

		contentPane = setupContentPane(shape);
		getPrimaryShape()
				.setWidth(
						PreferenceUtil
								.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE));
		getPrimaryShape()
				.setHeight(
						PreferenceUtil
								.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE));
		getPrimaryShape().setType(
				((Service) getPrimaryView().getElement()).getServiceType());
		DescriptionStyle description = (DescriptionStyle) getPrimaryView()
				.getStyle(NotationPackage.eINSTANCE.getDescriptionStyle());
		if (description != null) {
			getPrimaryShape().setToolTip(
					new Label(description.getDescription()));
		}
		assignColor();
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	@Override
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * modified by minhsang
	 * @generated NOT
	 */
	@Override
	protected void setForegroundColor(Color color) {
		super.setForegroundColor(color);
		/*if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}*/
	}

	/**
	 * modified by minhsang
	 * @generated NOT
	 */
	@Override
	protected void setBackgroundColor(Color color) {
		super.setBackgroundColor(color);
		/*if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}*/
	}

	/**
	 * @generated
	 */
	@Override
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	@Override
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	@Override
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TroposVisualIDRegistry
				.getType(ServiceNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(TroposElementTypes.Association_3001);
		types.add(TroposElementTypes.Contribution_3002);
		types.add(TroposElementTypes.Composition_3003);
		types.add(TroposElementTypes.Dependency_3004);
		types.add(TroposElementTypes.Ownership_3005);
		types.add(TroposElementTypes.MeansEnd_3006);
		types.add(TroposElementTypes.CustomRelation_3007);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Service_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(TroposElementTypes.Association_3001);
		types.add(TroposElementTypes.Contribution_3002);
		types.add(TroposElementTypes.Composition_3003);
		types.add(TroposElementTypes.Dependency_3004);
		types.add(TroposElementTypes.Ownership_3005);
		types.add(TroposElementTypes.MeansEnd_3006);
		types.add(TroposElementTypes.CustomRelation_3007);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Association_3001) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Contribution_3002) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Composition_3003) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Dependency_3004) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.Ownership_3005) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.MeansEnd_3006) {
			types.add(TroposElementTypes.Service_2001);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Actor_1001);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Service_1002);
		}
		if (relationshipType == TroposElementTypes.CustomRelation_3007) {
			types.add(TroposElementTypes.Service_2001);
		}
		return types;
	}

	/**
	 * @generated
	 */
	@Override
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	@Override
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	@Override
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		return getContentPane();
	}

	public void assignColor() {
		FillStyle style = (FillStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFillStyle());

		EServiceType serviceType = getPrimaryShape().getType();
		String colorType = PreferenceConstants.COLOR_SERVICE;

		if (serviceType.equals(EServiceType.GOAL_LITERAL))
			colorType = PreferenceConstants.COLOR_GOAL;
		else if (serviceType.equals(EServiceType.SOFTGOAL_LITERAL))
			colorType = PreferenceConstants.COLOR_SOFTGOAL;
		else if (serviceType.equals(EServiceType.TASK_LITERAL))
			colorType = PreferenceConstants.COLOR_TASK;
		else if (serviceType.equals(EServiceType.RESOURCE_LITERAL))
			colorType = PreferenceConstants.COLOR_RESOURCE;
		else if (serviceType.equals(EServiceType.EVENT_LITERAL))
			colorType = PreferenceConstants.COLOR_EVENT;

		Color bgColor = null;
		if (style.eIsSet(NotationPackage.eINSTANCE.getFillStyle_FillColor()))
			bgColor = DiagramColorRegistry.getInstance().getColor(
					new Integer(style.getFillColor()));
		getPrimaryShape().setBackgroundColor(
				ColorSchemaUtil.getColorPreference(colorType, bgColor));
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		Object feature = notification.getFeature();
		if (feature instanceof EAttribute)
			if ("serviceType".equals(((EAttribute) feature).getName())) {
				getPrimaryShape().setType(
						(EServiceType) notification.getNewValue());

				List connections = getModelSourceConnections();
				for (Iterator iter = connections.iterator(); iter.hasNext();) {
					Edge element = (Edge) iter.next();
					EObject target = (EObject) ((Node) element.getTarget())
							.getElement();
					if (target instanceof Actor) {
						List services = ((Actor) target).getServices();
						for (Iterator iterator = services.iterator(); iterator
								.hasNext();) {
							Service service = (Service) iterator.next();
							if (service.getName().equals(
									((Service) getPrimaryView().getElement())
											.getName()))
								service
										.setServiceType((EServiceType) notification
												.getNewValue());
						}
					}
				}
				Service element = (Service) getPrimaryView().getElement();
				if (element.eContainer() instanceof Actor) {
					Actor parentActor = (Actor) element.eContainer();
					ActorEditPart parentActorEditPart = (ActorEditPart) ((DiagramEditPart) getRoot()
							.getContents()).findEditPart(null, parentActor);
					List connectionEditPartList = parentActorEditPart
							.getTargetConnections();
					for (Iterator iter = connectionEditPartList.iterator(); iter
							.hasNext();) {
						ConnectionEditPart connectionEditPart = (ConnectionEditPart) iter
								.next();
						if (connectionEditPart instanceof DependencyEditPart
								&& connectionEditPart.getSource() instanceof ServiceEditPart) {
							Dependency dependency = (Dependency) ((Edge) connectionEditPart
									.getModel()).getElement();
							if (dependency
									.getDependencyType()
									.equals(
											EDependencyType.DELEGATION_EXECUTION_LITERAL)
									|| dependency
											.getDependencyType()
											.equals(
													EDependencyType.DELEGATION_PERMISSION_LITERAL)) {
								Service affectedService = (Service) ((ServiceEditPart) connectionEditPart
										.getSource()).getPrimaryView()
										.getElement();
								if (affectedService.getName().equals(
										((Service) getPrimaryView()
												.getElement()).getName()))
									affectedService
											.setServiceType((EServiceType) notification
													.getNewValue());
							}
						}
					}
				}
				assignColor();
				getPrimaryShape().repaint();
				DiagramCreatorUtil.refreshConnectionAnchor(
						(DiagramEditPart) getRoot().getContents(),
						getPrimaryView());
			} else if ("name".equals(((EAttribute) feature).getName())) {
				List connections = getModelSourceConnections();
				for (Iterator iter = connections.iterator(); iter.hasNext();) {
					Edge element = (Edge) iter.next();
					EObject target = (EObject) ((Node) element.getTarget())
							.getElement();
					if (target instanceof Actor) {
						List services = ((Actor) target).getServices();
						for (Iterator iterator = services.iterator(); iterator
								.hasNext();) {
							Service service = (Service) iterator.next();
							if (service.getName().equals(
									notification.getOldStringValue()))
								service.setName(notification
										.getNewStringValue());
						}
					}
				}
				Service element = (Service) getPrimaryView().getElement();
				if (element.eContainer() instanceof Actor) {
					Actor parentActor = (Actor) element.eContainer();
					ActorEditPart parentActorEditPart = (ActorEditPart) ((DiagramEditPart) getRoot()
							.getContents()).findEditPart(null, parentActor);
					List connectionEditPartList = parentActorEditPart
							.getTargetConnections();
					for (Iterator iter = connectionEditPartList.iterator(); iter
							.hasNext();) {
						ConnectionEditPart connectionEditPart = (ConnectionEditPart) iter
								.next();
						if (connectionEditPart instanceof DependencyEditPart
								&& connectionEditPart.getSource() instanceof ServiceEditPart) {
							Dependency dependency = (Dependency) ((Edge) connectionEditPart
									.getModel()).getElement();
							if (dependency
									.getDependencyType()
									.equals(
											EDependencyType.DELEGATION_EXECUTION_LITERAL)
									|| dependency
											.getDependencyType()
											.equals(
													EDependencyType.DELEGATION_PERMISSION_LITERAL)) {
								Service affectedService = (Service) ((ServiceEditPart) connectionEditPart
										.getSource()).getPrimaryView()
										.getElement();
								if (affectedService.getName().equals(
										notification.getOldStringValue()))
									affectedService.setName(notification
											.getNewStringValue());
							}
						}
					}
				}
				assignColor();
				getPrimaryShape().repaint();
			} else if ("fillColor".equals(((EAttribute) feature).getName())) {
				getPrimaryShape().setBackgroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			} else if ("description".equals(((EAttribute) feature).getName())) {
				getPrimaryShape().setToolTip(
						new Label(notification.getNewStringValue()));
			}
	}

	public void setRemarks(String remarks, String alternateRemarks) {
		this.remarks = remarks;
		this.alternateRemarks = alternateRemarks;
	}

	public void showRemarks(boolean show, boolean alternate) {
		if (show && alternate)
			getPrimaryShape().setRemarks(alternateRemarks);
		else if (show && !alternate)
			getPrimaryShape().setRemarks(remarks);
		else
			getPrimaryShape().setRemarks(null);

		/*ServiceRemarksLabelEditPart editPart = (ServiceRemarksLabelEditPart)getChildBySemanticHint(TroposVisualIDRegistry
		 .getType(ServiceRemarksLabelEditPart.VISUAL_ID));
		 
		 if(editPart!= null)
		 {
		 System.out.println("edit part not null");
		 if (show && alternate)
		 editPart.setLabelText(alternateRemarks);
		 else if (show && !alternate)
		 editPart.setLabelText(remarks);
		 else
		 editPart.setLabelText("");
		 }*/
	}

	public String getRemarks() {
		return getPrimaryShape().getRemarks();
	}

	public void showAnalysisResult(Color color) {
		getPrimaryShape().setOverlayColor(color);

	}

	public void hideAnalysisResult() {
		getPrimaryShape().setOverlayColor(null);
	}

	public Service getElement() {
		return (Service) getPrimaryView().getElement();
	}

	/**
	 * @generated
	 */
	public class ServiceFigure extends
			it.unitn.disi.sistar.figures.nodes.ServiceFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureServiceNameFigure;

		/**
		 * @generated NOT
		 */
		public ServiceFigure() {

			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);
			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {
			CustomWrapLabel fig_0 = new CustomWrapLabel();
			fig_0.setTextWrap(true);
			fig_0.setTextWrapAlignment(PositionConstants.CENTER);
			setLabelFigure(fig_0);
			//setFigureServiceNameFigure(fig_0);
			fFigureServiceNameFigure = fig_0;

			Object layData0 = null;

			this.add(fig_0, layData0);
			setLabelFigure(fig_0);
			getImageBound();
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureServiceNameFigure() {
			return fFigureServiceNameFigure;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		@Override
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_BACK = new Color(null, 110, 139, 61);

	/**
	 * @generated NOT
	 */
	public static final org.eclipse.swt.graphics.Color SERVICEFIGURE_BACK = new org.eclipse.swt.graphics.Color(
			null, 110, 139, 61);

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return new ServiceAnchor(primaryShape);

	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return new ServiceAnchor(primaryShape);

	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return new ServiceAnchor(primaryShape);

	}

	/**
	 * @generated NOT
	 */
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return new ServiceAnchor(primaryShape);

	}
}
