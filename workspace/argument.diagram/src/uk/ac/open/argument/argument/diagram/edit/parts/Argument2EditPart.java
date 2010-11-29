package uk.ac.open.argument.argument.diagram.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.diagram.edit.policies.Argument2ItemSemanticEditPolicy;
import uk.ac.open.argument.argument.diagram.edit.policies.OpenDiagramEditPolicy;
import uk.ac.open.argument.argument.diagram.part.ArgumentVisualIDRegistry;
import uk.ac.open.argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class Argument2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	Argument node;

	/**
	 * @generated NOT
	 */
	public Argument2EditPart(View view) {
		super(view);
		node = (Argument) view.getElement();
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Argument2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		return primaryShape = new ArgumentFigure(node);
	}

	/**
	 * @generated
	 */
	public ArgumentFigure getPrimaryShape() {
		return (ArgumentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArgumentNameDescriptionRoundExp2EditPart) {
			((ArgumentNameDescriptionRoundExp2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureArgumentLabelFigure());
			return true;
		}
		if (childEditPart instanceof ArgumentArgumentGroundsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getArgumentGroundsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ArgumentArgumentGroundsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ArgumentArgumentWarrantsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getArgumentWarrantsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ArgumentArgumentWarrantsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArgumentNameDescriptionRoundExp2EditPart) {
			return true;
		}
		if (childEditPart instanceof ArgumentArgumentGroundsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getArgumentGroundsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ArgumentArgumentGroundsCompartment2EditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ArgumentArgumentWarrantsCompartment2EditPart) {
			IFigure pane = getPrimaryShape()
					.getArgumentWarrantsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ArgumentArgumentWarrantsCompartment2EditPart) childEditPart)
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
		if (editPart instanceof ArgumentArgumentGroundsCompartment2EditPart) {
			return getPrimaryShape().getArgumentGroundsCompartmentFigure();
		}
		if (editPart instanceof ArgumentArgumentWarrantsCompartment2EditPart) {
			return getPrimaryShape().getArgumentWarrantsCompartmentFigure();
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
		return getChildBySemanticHint(ArgumentVisualIDRegistry
				.getType(ArgumentNameDescriptionRoundExp2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ArgumentElementTypes.Rebuts_4001);
		types.add(ArgumentElementTypes.Mitigates_4002);
		types.add(ArgumentElementTypes.ArgumentOrigin_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(
			IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ArgumentElementTypes.Rebuts_4001);
		}
		if (targetEditPart instanceof uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart) {
			types.add(ArgumentElementTypes.Rebuts_4001);
		}
		if (targetEditPart instanceof Argument3EditPart) {
			types.add(ArgumentElementTypes.Rebuts_4001);
		}
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ArgumentElementTypes.Mitigates_4002);
		}
		if (targetEditPart instanceof uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart) {
			types.add(ArgumentElementTypes.Mitigates_4002);
		}
		if (targetEditPart instanceof Argument3EditPart) {
			types.add(ArgumentElementTypes.Mitigates_4002);
		}
		if (targetEditPart instanceof ArgumentEditPart) {
			types.add(ArgumentElementTypes.ArgumentOrigin_4003);
		}
		if (targetEditPart instanceof uk.ac.open.argument.argument.diagram.edit.parts.Argument2EditPart) {
			types.add(ArgumentElementTypes.ArgumentOrigin_4003);
		}
		if (targetEditPart instanceof Argument3EditPart) {
			types.add(ArgumentElementTypes.ArgumentOrigin_4003);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ArgumentElementTypes.Rebuts_4001) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		} else if (relationshipType == ArgumentElementTypes.Mitigates_4002) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		} else if (relationshipType == ArgumentElementTypes.ArgumentOrigin_4003) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(3);
		types.add(ArgumentElementTypes.Rebuts_4001);
		types.add(ArgumentElementTypes.Mitigates_4002);
		types.add(ArgumentElementTypes.ArgumentOrigin_4003);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == ArgumentElementTypes.Rebuts_4001) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		} else if (relationshipType == ArgumentElementTypes.Mitigates_4002) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		} else if (relationshipType == ArgumentElementTypes.ArgumentOrigin_4003) {
			types.add(ArgumentElementTypes.Argument_2001);
			types.add(ArgumentElementTypes.Argument_3001);
			types.add(ArgumentElementTypes.Argument_3002);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public class ArgumentFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureArgumentLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fArgumentGroundsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fArgumentWarrantsCompartmentFigure;

		/**
		 * @generated
		 */
		public ArgumentFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @param node 
		 * @generated NOT
		 */
		public ArgumentFigure(Argument node) {
			this();
			if (node != null)
				if (node.getGrounds().size() + node.getWarrants().size() == 0) {
					fArgumentGroundsCompartmentFigure.setVisible(false);
					fArgumentWarrantsCompartmentFigure.setVisible(false);
				}
		}

		/**
		 * @generated NOT
		 */
		private void createContents() {

			fFigureArgumentLabelFigure = new WrappingLabel();
			fFigureArgumentLabelFigure.setText("Argument");
			fFigureArgumentLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));
			fFigureArgumentLabelFigure.setTextWrap(true);

			GridData constraintFFigureEntityName = new GridData();
			constraintFFigureEntityName.verticalAlignment = GridData.BEGINNING;
			constraintFFigureEntityName.horizontalAlignment = GridData.CENTER;
			constraintFFigureEntityName.horizontalIndent = 40;
			constraintFFigureEntityName.horizontalSpan = 1;
			constraintFFigureEntityName.verticalSpan = 1;
			constraintFFigureEntityName.grabExcessHorizontalSpace = true;
			constraintFFigureEntityName.grabExcessVerticalSpace = true;
			this.add(fFigureArgumentLabelFigure, constraintFFigureEntityName);

			fArgumentGroundsCompartmentFigure = new RectangleFigure();
			fArgumentGroundsCompartmentFigure.setOutline(false);

			this.add(fArgumentGroundsCompartmentFigure);

			fArgumentWarrantsCompartmentFigure = new RectangleFigure();
			fArgumentWarrantsCompartmentFigure.setOutline(false);

			this.add(fArgumentWarrantsCompartmentFigure);
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureArgumentLabelFigure() {
			return fFigureArgumentLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getArgumentGroundsCompartmentFigure() {
			return fArgumentGroundsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getArgumentWarrantsCompartmentFigure() {
			return fArgumentWarrantsCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREARGUMENTLABELFIGURE_FONT = new Font(
			Display.getCurrent(), Display.getDefault().getSystemFont()
					.getFontData()[0].getName(), 9, SWT.BOLD);

}
