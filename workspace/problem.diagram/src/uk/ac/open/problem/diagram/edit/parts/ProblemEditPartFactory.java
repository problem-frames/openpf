package uk.ac.open.problem.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;

/**
 * @generated
 */
public class ProblemEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ProblemVisualIDRegistry.getVisualID(view)) {

			case ProblemDiagramEditPart.VISUAL_ID:
				return new ProblemDiagramEditPart(view);

			case NodeEditPart.VISUAL_ID:
				return new NodeEditPart(view);

			case NodeNameDescriptionEditPart.VISUAL_ID:
				return new NodeNameDescriptionEditPart(view);

			case NodeDescriptionEditPart.VISUAL_ID:
				return new NodeDescriptionEditPart(view);

			case Node2EditPart.VISUAL_ID:
				return new Node2EditPart(view);

			case NodeNameEditPart.VISUAL_ID:
				return new NodeNameEditPart(view);

			case NodeDescription2EditPart.VISUAL_ID:
				return new NodeDescription2EditPart(view);

			case Node3EditPart.VISUAL_ID:
				return new Node3EditPart(view);

			case NodeName2EditPart.VISUAL_ID:
				return new NodeName2EditPart(view);

			case NodeDescription3EditPart.VISUAL_ID:
				return new NodeDescription3EditPart(view);

			case Node4EditPart.VISUAL_ID:
				return new Node4EditPart(view);

			case NodeName3EditPart.VISUAL_ID:
				return new NodeName3EditPart(view);

			case NodeDescription4EditPart.VISUAL_ID:
				return new NodeDescription4EditPart(view);

			case Node5EditPart.VISUAL_ID:
				return new Node5EditPart(view);

			case NodeName4EditPart.VISUAL_ID:
				return new NodeName4EditPart(view);

			case NodeDescription5EditPart.VISUAL_ID:
				return new NodeDescription5EditPart(view);

			case Node6EditPart.VISUAL_ID:
				return new Node6EditPart(view);

			case NodeName5EditPart.VISUAL_ID:
				return new NodeName5EditPart(view);

			case NodeDescription6EditPart.VISUAL_ID:
				return new NodeDescription6EditPart(view);

			case LinkEditPart.VISUAL_ID:
				return new LinkEditPart(view);

			case LinkDescriptionEditPart.VISUAL_ID:
				return new LinkDescriptionEditPart(view);

			case Link2EditPart.VISUAL_ID:
				return new Link2EditPart(view);

			case LinkDescription2EditPart.VISUAL_ID:
				return new LinkDescription2EditPart(view);

			case Link3EditPart.VISUAL_ID:
				return new Link3EditPart(view);

			case LinkDescription3EditPart.VISUAL_ID:
				return new LinkDescription3EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
