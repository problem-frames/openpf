package edu.toronto.cs.openome_model.diagram.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import openome_model.figures.ConstrainedResizeShapeEditPolicy;
import openome_model.figures.OpenOMEBorderItemLocator;
import openome_model.figures.TaskAnchor;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Task4EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2012;

	/**
	 * @generated NOT
	 */
	private ConnectionAnchor anchor;

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
	public Task4EditPart(View view) {
		super(view);
	}

	/**
	 * Tells this intention figure to redirect it's anchor points to the actor
	 * symbol, rather than the intention.
	 * @generated NOT
	 */
	public void setIsCollapsed(boolean isCollapsed) {
		// if the goal is inside of a collapsed actor, we want all of it's
		// anchor points to point to the actor symbol instead now, rather than the intention
		((TaskAnchor) (this.getConnectionAnchor())).setIsCollapsed(isCollapsed);
	}

	/**
	 * @generated NOT
	 */
	protected ConnectionAnchor getConnectionAnchor() {
		if (anchor == null) {
			anchor = new TaskAnchor(getFigure());
		}
		return anchor;
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
		return new ConstrainedResizeShapeEditPolicy(this);
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(
				EditPolicyRoles.SEMANTIC_ROLE,
				new edu.toronto.cs.openome_model.diagram.edit.policies.Task4ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
						.getVisualID(childView)) {
				case edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle(
									(GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
				}
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		TaskSVGFigure figure = new TaskSVGFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public TaskSVGFigure getPrimaryShape() {
		return (TaskSVGFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart) {
			((edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureTaskNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart) {
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated NOT
	 */
	protected void addBorderItem(IFigure borderItemContainer,
			IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskQualitativeReasoningCom4EditPart) {

			OpenOMEBorderItemLocator locator = new OpenOMEBorderItemLocator(
					getMainFigure(), PositionConstants.NORTH_EAST);

			locator.setCurrentSideOfParent(PositionConstants.NORTH_EAST);
			locator.setBorderItemOffset(new Dimension(15, 43));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
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
	protected NodeFigure createMainFigure() {
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
				.getType(edu.toronto.cs.openome_model.diagram.edit.parts.TaskName4EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		if (targetEditPart instanceof edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011);
		types
				.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(
			IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Actor_1001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Agent_1002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Position_1003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Role_1004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Dependency_3001) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndDecomposition_3002) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrDecomposition_3003) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HelpContribution_3004) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.HurtContribution_3005) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.MakeContribution_3006) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.BreakContribution_3007) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomePlusContribution_3008) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.SomeMinusContribution_3009) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.UnknownContribution_3010) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.AndContribution_3011) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_1005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_1006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_1007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_1008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2001);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2002);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2003);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2004);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2005);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2006);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2007);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2008);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2009);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2010);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2011);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2012);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Goal_2013);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Softgoal_2014);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Resource_2015);
		}
		if (relationshipType == edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.OrContribution_3012) {
			types
					.add(edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes.Task_2016);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class TaskSVGFigure extends openome_model.figures.TaskSVGFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTaskNameFigure;

		/**
		 * @generated
		 */
		public TaskSVGFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTaskNameFigure = new WrappingLabel();
			fFigureTaskNameFigure.setText("");

			this.add(fFigureTaskNameFigure);

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
		public WrappingLabel getFigureTaskNameFigure() {
			return fFigureTaskNameFigure;
		}

	}

}
