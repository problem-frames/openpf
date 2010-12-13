package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.figures.anchors.ServiceAnchor;
import it.unitn.disi.sistar.figures.compartments.ActorCompartmentFigure;
import it.unitn.disi.sistar.figures.labels.CustomWrapLabel;
import it.unitn.disi.sistar.figures.nodes.CompartmentEllipseFigure;
import it.unitn.disi.sistar.modeling.api.editparts.IObjectEditPart;
import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorCanonicalEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.ActorItemSemanticEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.TernaryCreationEditPolicy;
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
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
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
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.DrawerStyle;
import org.eclipse.gmf.runtime.notation.FillStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

//customized
/**
 * @generated NOT
 */
public class ActorEditPart extends ShapeNodeEditPart implements IObjectEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	protected IFigure secondaryShape;

	/**
	 * @generated
	 */
	public ActorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ActorItemSemanticEditPolicy());
		//installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
		//		new ActorGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ActorCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new TernaryCreationEditPolicy());
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
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		CompartmentEllipseFigure figure = new CompartmentEllipseFigure();
		figure.setFill(false);
		figure.setOpaque(false);

		Bounds bounds = ((Bounds) ((Node) getPrimaryView())
				.getLayoutConstraint());

		figure.setBounds(new Rectangle(bounds.getX(), bounds.getY(), bounds
				.getWidth(), bounds.getHeight()));
		//System.out.println(figure.getBounds());
		figure.repaint();
		ActorStyle style = (ActorStyle) getPrimaryView().getStyle(
				CustomStylePackage.eINSTANCE.getActorStyle());
		if (style != null)
			figure
					.setShape(style.getRationaleShape() == EShapeType.OVAL_LITERAL ? CompartmentEllipseFigure.SHAPE_OVAL
							: CompartmentEllipseFigure.SHAPE_RECTANGLE);

		secondaryShape = figure;
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActorFigure getPrimaryShape() {
		return (ActorFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorNameEditPart) {
			((ActorNameEditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureActorNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorNameEditPart) {
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
		CompartmentEllipseFigure shape = (CompartmentEllipseFigure) createNodeShape();
		figure.add(shape);
		shape.setLayoutManager(new StackLayout());

		ActorFigure actor = (ActorFigure) createFixedNodeShape();
		shape.add(actor);
		shape.setMainFigure(actor);

		getPrimaryShape().fFigureActorNameFigure.setTextWrap(true);

		assignColor();
		contentPane = setupContentPane(shape);
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
	 * modified by minh sang
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
	 * modified by minh sang
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
				.getType(ActorNameEditPart.VISUAL_ID));
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
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		if (targetEditPart instanceof Service2EditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		if (targetEditPart instanceof ServiceEditPart) {
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

	/**
	 * @generated NOT
	 */
	public void assignColor() {
		EActorType actorType = getPrimaryShape().getType();
		String colorType = PreferenceConstants.COLOR_ACTOR;

		if (actorType.equals(EActorType.AGENT_LITERAL))
			colorType = PreferenceConstants.COLOR_AGENT;
		else if (actorType.equals(EActorType.ROLE_LITERAL))
			colorType = PreferenceConstants.COLOR_ROLE;
		else if (actorType.equals(EActorType.ACTOR_LITERAL))
			colorType = PreferenceConstants.COLOR_ACTOR;
		else if (actorType.equals(EActorType.POSITION_LITERAL))
			colorType = PreferenceConstants.COLOR_POSITION;

		FillStyle style = (FillStyle) getPrimaryView().getStyle(
				NotationPackage.eINSTANCE.getFillStyle());
		Color bgColor = null;
		if (style.eIsSet(NotationPackage.eINSTANCE.getFillStyle_FillColor()))
			bgColor = DiagramColorRegistry.getInstance().getColor(
					new Integer(style.getFillColor()));
		getPrimaryShape().setBackgroundColor(
				ColorSchemaUtil.getColorPreference(colorType, bgColor));

	}

	/**
	 * @generated NOT
	 */
	protected IFigure createFixedNodeShape() {
		ActorFigure figure = new ActorFigure();
		figure.setType(((Actor) getPrimaryView().getElement()).getActorType());
		figure.setFixedSize(true);
		ActorStyle actorStyle = (ActorStyle) getPrimaryView().getStyle(
				CustomStylePackage.eINSTANCE.getActorStyle());

		if (actorStyle != null) {
			figure.setWidth(actorStyle.getActorWidth());
			figure.setHeight(actorStyle.getActorHeight());
		} else {
			figure.setWidth(PreferenceUtil
					.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
			figure.setHeight(PreferenceUtil
					.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
		}
		DescriptionStyle description = (DescriptionStyle) getPrimaryView()
				.getStyle(NotationPackage.eINSTANCE.getDescriptionStyle());
		if (description != null) {
			figure.setToolTip(new Label(description.getDescription()));
		}
		return primaryShape = figure;
	}

	@Override
	protected void handleNotificationEvent(Notification notification) {

		super.handleNotificationEvent(notification);

		Object feature = notification.getFeature();
		if (feature instanceof EAttribute) {
			DiagramEditPart diagramEditPart = (DiagramEditPart) getParent();
			if ("actorType".equals(((EAttribute) feature).getName())) {
				getPrimaryShape().setType(
						(EActorType) notification.getNewValue());
				assignColor();
				getPrimaryShape().repaint();
				DiagramCreatorUtil.refreshConnectionAnchor(
						(DiagramEditPart) getRoot().getContents(),
						getPrimaryView());
			} else if ("width".equals(((EAttribute) feature).getName())) {
				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (style.isCollapsed())
					getPrimaryShape().setWidth(notification.getNewIntValue());
				correctBounds(notification.getNewIntValue(), -1, null);
				getPrimaryShape().getImageBound();
				getPrimaryShape().repaint();
			} else if ("height".equals(((EAttribute) feature).getName())) {
				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (style.isCollapsed())
					getPrimaryShape().setHeight(notification.getNewIntValue());
				correctBounds(-1, notification.getNewIntValue(), null);
				getPrimaryShape().getImageBound();
				getPrimaryShape().repaint();
			} else if ("fillColor".equals(((EAttribute) feature).getName())) {

				getPrimaryShape().setBackgroundColor(
						DiagramColorRegistry.getInstance().getColor(
								new Integer(notification.getNewIntValue())));
			} else if ("actorX".equals(((EAttribute) feature).getName())
					|| "coreX".equals(((EAttribute) feature).getName())) {
				Bounds actorBounds = (Bounds) ((Node) getPrimaryView())
						.getLayoutConstraint();

				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (!style.isCollapsed()) {
					Rectangle primaryBounds = getPrimaryShape().getBounds()
							.getCopy();
					if (primaryBounds.getSize().width > notification
							.getNewIntValue()
							+ getPrimaryShape().getWidth())
						getPrimaryShape().setCoreX(
								notification.getNewIntValue());
					else
						getPrimaryShape().setCoreX(
								primaryBounds.getSize().width
										- getPrimaryShape().getWidth());
				}

				DiagramCreatorUtil.refreshConnectionAnchor(diagramEditPart,
						getPrimaryView());
			} else if ("actorY".equals(((EAttribute) feature).getName())
					|| "coreY".equals(((EAttribute) feature).getName())) {
				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (!style.isCollapsed()) {
					Rectangle primaryBounds = getPrimaryShape().getBounds()
							.getCopy();
					if (primaryBounds.getSize().height > notification
							.getNewIntValue()
							+ getPrimaryShape().getHeight())
						getPrimaryShape().setCoreY(
								notification.getNewIntValue());
					else
						getPrimaryShape().setCoreY(
								primaryBounds.getSize().height
										- getPrimaryShape().getHeight());
				}
				DiagramCreatorUtil.refreshConnectionAnchor(diagramEditPart,
						getPrimaryView());
			} else if ("actorWidth".equals(((EAttribute) feature).getName())
					|| "coreWidth".equals(((EAttribute) feature).getName())) {
				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (!style.isCollapsed())
					getPrimaryShape().setWidth(notification.getNewIntValue());
				DiagramCreatorUtil.refreshConnectionAnchor(diagramEditPart,
						getPrimaryView());
			} else if ("actorHeight".equals(((EAttribute) feature).getName())
					|| "coreHeight".equals(((EAttribute) feature).getName())) {
				ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
				DrawerStyle style = (DrawerStyle) ((Node) compartmentEditPart
						.getNotationView()).getStyle(NotationPackage.eINSTANCE
						.getDrawerStyle());
				if (!style.isCollapsed())
					getPrimaryShape().setHeight(notification.getNewIntValue());
				DiagramCreatorUtil.refreshConnectionAnchor(diagramEditPart,
						getPrimaryView());
			} else if ("rationaleShape"
					.equals(((EAttribute) feature).getName())) {
				EShapeType value = (EShapeType) notification.getNewValue();
				int shapeType = value == EShapeType.OVAL_LITERAL ? CompartmentEllipseFigure.SHAPE_OVAL
						: CompartmentEllipseFigure.SHAPE_RECTANGLE;
				((CompartmentEllipseFigure) getSecondaryShape())
						.setShape(shapeType);
				getSecondaryShape().repaint();
			} else if ("description".equals(((EAttribute) feature).getName())) {
				/*getPrimaryShape().setToolTip(
						new Label(notification.getNewStringValue()));
				getSecondaryShape().setToolTip(
						new Label(notification.getNewStringValue()));*/
				/*modified by minh sang , minhsang*/
				ActorFigure afig = getPrimaryShape();
				Label label = new Label(notification.getNewStringValue());
			
				afig.setToolTip(label);
				ActorCompartmentFigure fig = (ActorCompartmentFigure) getSecondaryShape().getChildren().get(1);
				fig.setToolTip(notification.getNewStringValue());
			}
		}
	}

	public void correctBounds(int w, int h, Rectangle newService) {
		ActorActorCompartmentEditPart compartmentEditPart = (ActorActorCompartmentEditPart) getChildBySemanticHint(TroposVisualIDRegistry
				.getType(ActorActorCompartmentEditPart.VISUAL_ID));
		ActorCompartmentFigure compartment = (ActorCompartmentFigure) compartmentEditPart
				.getFigure();
		List editParts = compartmentEditPart.getPrimaryEditParts();

		int wHint = 0;
		int hHint = 0;
		int xHint = 0;
		int yHint = 0;

		Bounds nodeBound = ((Bounds) ((Node) getPrimaryView())
				.getLayoutConstraint());
		int defaultServiceWidth = PreferenceUtil
				.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE);
		int defaultServiceHeight = PreferenceUtil
				.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE);

		if (newService != null) {
			int serviceWidth = newService.width == -1 ? defaultServiceWidth
					: newService.width;
			int serviceHeight = newService.height == -1 ? defaultServiceHeight
					: newService.height;
			if (newService.x - nodeBound.getX() + serviceWidth > wHint)
				wHint = newService.x - nodeBound.getX() + serviceWidth;
			if (newService.y - nodeBound.getY() + serviceHeight > hHint)
				hHint = newService.y - nodeBound.getY() + serviceHeight;
			if (newService.x - nodeBound.getX() < xHint)
				xHint = newService.x - nodeBound.getX();
			if (newService.y - nodeBound.getY() < yHint)
				yHint = newService.y - nodeBound.getY();

		}
		for (Iterator iter = editParts.iterator(); iter.hasNext();) {
			EditPart element = (EditPart) iter.next();
			if (element instanceof ServiceEditPart) {
				Bounds serviceBound = ((Bounds) ((Node) ((ServiceEditPart) element)
						.getPrimaryView()).getLayoutConstraint());
				if (serviceBound != null) {
					int serviceWidth = serviceBound.getWidth() == -1 ? defaultServiceWidth
							: serviceBound.getWidth();
					int serviceHeight = serviceBound.getHeight() == -1 ? defaultServiceHeight
							: serviceBound.getHeight();
					if (serviceBound.getX() + serviceWidth > wHint)
						wHint = serviceBound.getX() + serviceWidth;
					if (serviceBound.getY() + serviceHeight > hHint)
						hHint = serviceBound.getY() + serviceHeight;
					if (serviceBound.getX() - nodeBound.getX() < xHint)
						xHint = serviceBound.getX() - nodeBound.getX();
					if (serviceBound.getY() - nodeBound.getY() < yHint)
						yHint = serviceBound.getY() - nodeBound.getY();
				}
			}
		}

		if (h > 0)
			if (compartment.isExpanded() && h < hHint + 10)
				nodeBound.setHeight(hHint + 10);

		if (w > 0)
			if (compartment.isExpanded() && w < wHint + 10)
				nodeBound.setWidth(wHint + 10);

		//System.out.println(nodeBound);
		//System.out.println(xHint + " " + yHint);
		//System.out.println(compartment.getContentPane().getBounds());
		/*if(compartment.isExpanded() && xHint - 10 < -10)
		 {	
		 nodeBound.setX(nodeBound.getX() - xHint -10);
		 nodeBound.setWidth(nodeBound.getWidth() - xHint -10);
		 }*/
		/*if(compartment.isExpanded() &&  yHint -10 < -10)
		 {	
		 nodeBound.setY(nodeBound.getY() - yHint -10);
		 nodeBound.setHeight(nodeBound.getHeight() - yHint -10);
		 }*/
		//System.out.println(nodeBound);
	}

	/**
	 * @generated
	 */
	public class ActorFigure extends
			it.unitn.disi.sistar.figures.nodes.ActorFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureActorNameFigure;

		/**
		 * @generated NOT
		 */
		public ActorFigure() {
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.black

			);

			createContents();
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			CustomWrapLabel fig_0 = new CustomWrapLabel();
			setLabelFigure(fig_0);
			fig_0.setTextWrap(true);
			fig_0.setTextWrapAlignment(PositionConstants.CENTER);
			fFigureActorNameFigure = fig_0;

			Object layData0 = null;

			this.add(fig_0, layData0);

			setLabelFigure(fig_0);
			getImageBound();

			/*fFigureActorNameFigure = new WrappingLabel();
			fFigureActorNameFigure.setText("Actor");

			this.add(fFigureActorNameFigure);*/
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActorNameFigure() {
			return fFigureActorNameFigure;
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
	static final Color THIS_BACK = new Color(null, 205, 92, 92);

	/**
	 * @generated NOT
	 */
	public static final org.eclipse.swt.graphics.Color ACTORFIGURE_BACK = new org.eclipse.swt.graphics.Color(
			null, 205, 92, 92);

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

	public IFigure getSecondaryShape() {
		return secondaryShape;
	}

}
