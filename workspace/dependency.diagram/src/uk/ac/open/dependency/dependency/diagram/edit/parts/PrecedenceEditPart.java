package uk.ac.open.dependency.dependency.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.dependency.dependency.diagram.edit.policies.NodeItemSemanticEditPolicy;
import uk.ac.open.dependency.dependency.diagram.edit.policies.OpenDiagramEditPolicy;
import uk.ac.open.dependency.dependency.diagram.edit.policies.PrecedenceItemSemanticEditPolicy;

/**
 * @generated
 */
public class PrecedenceEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public PrecedenceEditPart(View view) {
		super(view);
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
		return new PrecedenceFigure();
	}

	/**
	 * @generated
	 */
	public PrecedenceFigure getPrimaryShape() {
		return (PrecedenceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PrecedenceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public PrecedenceFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

	/**
	 * @generated NOT
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new NodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
	}

}
