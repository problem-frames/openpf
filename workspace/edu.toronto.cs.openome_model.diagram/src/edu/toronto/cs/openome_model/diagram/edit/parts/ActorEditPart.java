package edu.toronto.cs.openome_model.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import openome_model.figures.ActorAnchor;
import openome_model.figures.ConstrainedResizeShapeEditPolicy;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.openome_model.diagram.part.Openome_modelContainerAnchor;

/**
 * @generated
 */
public class ActorEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1001;

	/**
	 * @generated NOT
	 */
	private ConnectionAnchor actorAnchor;

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
	public ActorEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	public boolean isActorBodyCompartmentCollapsed() {
		IGraphicalEditPart actorCompartment = getChildBySemanticHint(Integer
				.toString(ActorActorCompartmentEditPart.VISUAL_ID));
		return actorCompartment != null
				&& ((Boolean) actorCompartment
						.getStructuralFeatureValue(NotationPackage.eINSTANCE
								.getDrawerStyle_Collapsed())).booleanValue();

	}

	public double getZoomLevel() {
		double zoom = ((RenderedDiagramRootEditPart) this.getParent()
				.getParent()).getZoomManager().getZoom();
		return zoom;
	}

	/**
	 * @generated NOT
	 */
	protected ConnectionAnchor getConnectionAnchor() {
		if (actorAnchor == null) {
			actorAnchor = new Openome_modelContainerAnchor(getFigure());
		}
		double zoom = getZoomLevel();
		((Openome_modelContainerAnchor) actorAnchor).setZoom(zoom);
		return actorAnchor;
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		//@see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		//@see org.eclipse.gef.NodeEditPart#getSourceConnectionAnchor(org.eclipse.gef.Request)
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		//@see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.ConnectionEditPart)
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		//@see org.eclipse.gef.NodeEditPart#getTargetConnectionAnchor(org.eclipse.gef.Request)
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT 
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		// use the constrained resize shape edit policy
		// to ensure that aspect ratio is maintained
		// when the figure is being resized
		ConstrainedResizeShapeEditPolicy ep = new ConstrainedResizeShapeEditPolicy(
				this);
		ep.setIsUsedForActor(true);
		return ep;
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.ActorItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

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
		ActorFigure figure = new ActorFigure();
		figure.setEditPart(this);
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
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureActorNameFigure());
			return true;
		}
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActorBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart) {
			return true;
		}
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureActorBoundaryFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart) {
			return getPrimaryShape().getFigureActorBoundaryFigure();
		}
		return getContentPane();
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
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
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
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.ActorNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017);
		types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsAAssociation_3013) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.CoversAssociation_3014) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OccupiesAssociation_3015) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.IsPartOfAssociation_3016) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.PlaysAssociation_3017) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		} else if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.INSAssociation_3018) {
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
			types.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ActorFigure extends Ellipse {

		private ActorEditPart myEditPart;

		/**
		 * @generated
		 */
		private Ellipse fFigureActorBoundaryFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureActorNameFigure;

		/**
		 * This Container's minimum contraction
		 * default 100x100
		 */
		private Dimension contraction = new Dimension(100, 100);

		/**
		 * @generated
		 */
		public ActorFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setLineWidth(0);
			createContents();
		}

		public void setEditPart(ActorEditPart ep) {
			myEditPart = ep;
		}

		public ActorEditPart getEditPart() {
			return myEditPart;
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActorBoundaryFigure = new Ellipse();
			fFigureActorBoundaryFigure.setLineWidth(3);
			fFigureActorBoundaryFigure.setLineStyle(Graphics.LINE_DASHDOTDOT);
			fFigureActorBoundaryFigure
					.setBackgroundColor(FFIGUREACTORBOUNDARYFIGURE_BACK);
			fFigureActorBoundaryFigure.setPreferredSize(new Dimension(
					getMapMode().DPtoLP(450), getMapMode().DPtoLP(450)));
			fFigureActorBoundaryFigure.setMinimumSize(new Dimension(
					getMapMode().DPtoLP(100), getMapMode().DPtoLP(100)));

			this.add(fFigureActorBoundaryFigure, BorderLayout.CENTER);
			fFigureActorBoundaryFigure.setLayoutManager(new StackLayout());

			openome_model.figures.ActorSVGFigure actorSVGFigure1 = new openome_model.figures.ActorSVGFigure();

			fFigureActorBoundaryFigure.add(actorSVGFigure1);

			fFigureActorNameFigure = new WrappingLabel();
			fFigureActorNameFigure.setText("");

			fFigureActorNameFigure.setFont(FFIGUREACTORNAMEFIGURE_FONT);

			actorSVGFigure1.add(fFigureActorNameFigure);

		}

		/*
		 * Sets the minimum size that the container may contract to
		 */
		public void setMinimumContraction(Dimension d) {
			contraction = d;

			// get the zoom level

			// set the minimum size
			fFigureActorBoundaryFigure.setMinimumSize(d);
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public Ellipse getFigureActorBoundaryFigure() {
			return fFigureActorBoundaryFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureActorNameFigure() {
			return fFigureActorNameFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color FFIGUREACTORBOUNDARYFIGURE_BACK = new Color(null, 236,
			236, 236);

	/**
	 * @generated
	 */
	static final Font FFIGUREACTORNAMEFIGURE_FONT = new Font(
			Display.getCurrent(), "Arial", 12, SWT.BOLD);

}
