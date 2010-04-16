package uk.ac.open.problem.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.policies.Link3ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Link3EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public Link3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Link3ItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LinkDescription3EditPart) {
			((LinkDescription3EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureInterfaceNameFigure());
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
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LinkDescription3EditPart) {
			return true;
		}
		return false;
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
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new InterfaceFigure();
	}

	/**
	 * @generated
	 */
	public InterfaceFigure getPrimaryShape() {
		return (InterfaceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class InterfaceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInterfaceNameFigure;

		/**
		 * @generated
		 */
		public InterfaceFigure() {
			this.setLineWidth(1);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInterfaceNameFigure = new WrappingLabel();
			fFigureInterfaceNameFigure.setText("");

			this.add(fFigureInterfaceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInterfaceNameFigure() {
			return fFigureInterfaceNameFigure;
		}

	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		Object feature = notification.getFeature();
		if (ProblemPackage.eINSTANCE.getNode().equals(feature)) {
			getPrimaryShape().repaint();
		} else
			super.handleNotificationEvent(notification);
	}

	/**
	 * @generated NOT
	 * @author yy66
	 * This is a very subtle bug: the reason is the parent class
	 * cast to the NodeEditPart class in org.eclipse.gef, rather 
	 * than the local NodeEditPart generated from our GMFgraph 
	 * definition. So remove the import org.eclipse.gef.NodeEditPart
	 * and override the parent method solves the problem!
	 */
	@Override
	protected ConnectionAnchor getSourceConnectionAnchor() {
		if (getSource() != null
				&& getSource() instanceof uk.ac.open.problem.diagram.edit.parts.NodeEditPart) {
			uk.ac.open.problem.diagram.edit.parts.NodeEditPart editPart = (uk.ac.open.problem.diagram.edit.parts.NodeEditPart) getSource();
			return editPart.getSourceConnectionAnchor(this);
		}
		return super.getSourceConnectionAnchor();
	}

	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		if (getTarget() instanceof uk.ac.open.problem.diagram.edit.parts.NodeEditPart) {
			uk.ac.open.problem.diagram.edit.parts.NodeEditPart editPart = (uk.ac.open.problem.diagram.edit.parts.NodeEditPart) getTarget();
			return editPart.getTargetConnectionAnchor(this);
		}
		return super.getTargetConnectionAnchor();
	}
}
