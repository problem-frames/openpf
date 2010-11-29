package uk.ac.open.problem.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.EllipseAnchor;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.policies.Node3ItemSemanticEditPolicy;
import uk.ac.open.problem.diagram.edit.policies.OpenDiagramEditPolicy;
import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;
import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class Node3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated NOT
	 */
	public Node3EditPart(View view) {
		super(view);
		node = (Node) view.getElement();
	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Node3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
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
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NodeName2EditPart) {
			((NodeName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureEntityName());
			return true;
		}
		if (childEditPart instanceof NodeDescription3EditPart) {
			((NodeDescription3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureEntityDescription());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NodeName2EditPart) {
			return true;
		}
		if (childEditPart instanceof NodeDescription3EditPart) {
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
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(100, 62);
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
		return getChildBySemanticHint(ProblemVisualIDRegistry
				.getType(NodeName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ProblemElementTypes.Link_4001);
		types.add(ProblemElementTypes.Link_4002);
		types.add(ProblemElementTypes.Link_4003);
		types.add(ProblemElementTypes.Link_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof NodeEditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof uk.ac.open.problem.diagram.edit.parts.Node3EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node4EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node5EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node6EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node7EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof Node8EditPart) {
			types.add(ProblemElementTypes.Link_4001);
		}
		if (targetEditPart instanceof NodeEditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof uk.ac.open.problem.diagram.edit.parts.Node3EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node4EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node5EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node6EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node7EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof Node8EditPart) {
			types.add(ProblemElementTypes.Link_4002);
		}
		if (targetEditPart instanceof NodeEditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof uk.ac.open.problem.diagram.edit.parts.Node3EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node4EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node5EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node6EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node7EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof Node8EditPart) {
			types.add(ProblemElementTypes.Link_4003);
		}
		if (targetEditPart instanceof NodeEditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node2EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof uk.ac.open.problem.diagram.edit.parts.Node3EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node4EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node5EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node6EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node7EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		if (targetEditPart instanceof Node8EditPart) {
			types.add(ProblemElementTypes.Link_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ProblemElementTypes.Link_4001) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4002) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4003) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4004) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(ProblemElementTypes.Link_4001);
		types.add(ProblemElementTypes.Link_4002);
		types.add(ProblemElementTypes.Link_4003);
		types.add(ProblemElementTypes.Link_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ProblemElementTypes.Link_4001) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4002) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4003) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		} else if (relationshipType == ProblemElementTypes.Link_4004) {
			types.add(ProblemElementTypes.Node_2001);
			types.add(ProblemElementTypes.Node_2002);
			types.add(ProblemElementTypes.Node_2003);
			types.add(ProblemElementTypes.Node_2004);
			types.add(ProblemElementTypes.Node_2005);
			types.add(ProblemElementTypes.Node_2006);
			types.add(ProblemElementTypes.Node_2007);
			types.add(ProblemElementTypes.Node_2008);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class EntityFigure extends Ellipse {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityName;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureEntityDescription;

		/**
		 * @generated
		 */
		public EntityFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureEntityName = new WrappingLabel();
			fFigureEntityName.setText("");

			fFigureEntityName.setFont(FFIGUREENTITYNAME_FONT);

			GridData constraintFFigureEntityName = new GridData();
			constraintFFigureEntityName.verticalAlignment = GridData.BEGINNING;
			constraintFFigureEntityName.horizontalAlignment = GridData.CENTER;
			constraintFFigureEntityName.horizontalIndent = 40;
			constraintFFigureEntityName.horizontalSpan = 1;
			constraintFFigureEntityName.verticalSpan = 1;
			constraintFFigureEntityName.grabExcessHorizontalSpace = true;
			constraintFFigureEntityName.grabExcessVerticalSpace = true;
			this.add(fFigureEntityName, constraintFFigureEntityName);

			fFigureEntityDescription = new WrappingLabel();
			fFigureEntityDescription.setText("");

			fFigureEntityDescription.setFont(FFIGUREENTITYDESCRIPTION_FONT);

			GridData constraintFFigureEntityDescription = new GridData();
			constraintFFigureEntityDescription.verticalAlignment = GridData.CENTER;
			constraintFFigureEntityDescription.horizontalAlignment = GridData.CENTER;
			constraintFFigureEntityDescription.horizontalIndent = 40;
			constraintFFigureEntityDescription.horizontalSpan = 1;
			constraintFFigureEntityDescription.verticalSpan = 2;
			constraintFFigureEntityDescription.grabExcessHorizontalSpace = true;
			constraintFFigureEntityDescription.grabExcessVerticalSpace = true;
			this.add(fFigureEntityDescription,
					constraintFFigureEntityDescription);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityName() {
			return fFigureEntityName;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureEntityDescription() {
			return fFigureEntityDescription;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREENTITYNAME_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGUREENTITYDESCRIPTION_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 6, SWT.ITALIC);

	/**
	 * @generated NOT
	 */
	Node node;

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		uk.ac.open.problem.figures.EntityFigure figure = new uk.ac.open.problem.figures.EntityFigure(
				node);
		return primaryShape = figure;
	}

	/**
	 * @generated NOT
	 */
	public uk.ac.open.problem.figures.EntityFigure getPrimaryShape() {
		return (uk.ac.open.problem.figures.EntityFigure) primaryShape;
	}

	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (ProblemPackage.eINSTANCE.getNode().equals(feature)) {
			getPrimaryShape().repaint();
		} else
			super.handleNotificationEvent(notification);
	}

	ConnectionAnchor anchor;

	/**
	 * @generated NOT
	 */
	protected ConnectionAnchor getConnectionAnchor() {
		if (anchor == null) {
			if (node.getType().equals(NodeType.REQUIREMENT))
				anchor = new EllipseAnchor(getFigure());
			else
				anchor = new ChopboxAnchor(getFigure());
		}
		return anchor;
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return getConnectionAnchor();
	}

	/**
	 * @generated NOT
	 */
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connEditPart) {
		return getConnectionAnchor();
	}

}
