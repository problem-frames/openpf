package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.Service2ItemSemanticEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
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
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class Service2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1002;

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
	public Service2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Service2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

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
		if (childEditPart instanceof ServiceName2EditPart) {
			((ServiceName2EditPart) childEditPart).setLabel(getPrimaryShape()
					.getFigureServiceNameFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ServiceName2EditPart) {
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
	 * modified by minhsang
	 * @generated NOT
	 */
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
	protected void setBackgroundColor(Color color) {
		super.setBackgroundColor(color);
		/*if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}*/
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
		return getChildBySemanticHint(TroposVisualIDRegistry
				.getType(ServiceName2EditPart.VISUAL_ID));
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
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Association_3001);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Contribution_3002);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Composition_3003);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Dependency_3004);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.Ownership_3005);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof ServiceEditPart) {
			types.add(TroposElementTypes.MeansEnd_3006);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(TroposElementTypes.CustomRelation_3007);
		}
		if (targetEditPart instanceof it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.Service2EditPart) {
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
	public class ServiceFigure extends
			it.unitn.disi.sistar.figures.nodes.ServiceFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureServiceNameFigure;

		/**
		 * @generated
		 */
		public ServiceFigure() {

			this.setForegroundColor(ColorConstants.black);
			this.setBackgroundColor(THIS_BACK);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureServiceNameFigure = new WrappingLabel();
			fFigureServiceNameFigure.setText("Goal");

			this.add(fFigureServiceNameFigure);

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

}
