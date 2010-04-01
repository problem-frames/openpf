package uk.ac.open.problem.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.policies.Link2ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Link2EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public Link2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Link2ItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LinkDescription2EditPart) {
			((LinkDescription2EditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureReferenceNameFigure());
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
		if (childEditPart instanceof LinkDescription2EditPart) {
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
		return new ReferenceFigure();
	}

	/**
	 * @generated
	 */
	public ReferenceFigure getPrimaryShape() {
		return (ReferenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ReferenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureReferenceNameFigure;

		/**
		 * @generated
		 */
		public ReferenceFigure() {
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureReferenceNameFigure = new WrappingLabel();
			fFigureReferenceNameFigure.setText("");

			this.add(fFigureReferenceNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureReferenceNameFigure() {
			return fFigureReferenceNameFigure;
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

}
