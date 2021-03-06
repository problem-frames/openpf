package argument.argument.diagram.edit.parts;

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

import argument.argument.diagram.part.ArgumentVisualIDRegistry;

/**
 * @generated
 */
public class ArgumentEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ArgumentVisualIDRegistry.getVisualID(view)) {

			case ArgumentDiagramEditPart.VISUAL_ID:
				return new ArgumentDiagramEditPart(view);

			case ArgumentEditPart.VISUAL_ID:
				return new ArgumentEditPart(view);

			case ArgumentNameDescriptionRoundEditPart.VISUAL_ID:
				return new ArgumentNameDescriptionRoundEditPart(view);

			case Argument2EditPart.VISUAL_ID:
				return new Argument2EditPart(view);

			case ArgumentNameDescriptionRound2EditPart.VISUAL_ID:
				return new ArgumentNameDescriptionRound2EditPart(view);

			case Argument3EditPart.VISUAL_ID:
				return new Argument3EditPart(view);

			case ArgumentNameDescriptionRound3EditPart.VISUAL_ID:
				return new ArgumentNameDescriptionRound3EditPart(view);

			case ArgumentArgumentGroundsCompartmentEditPart.VISUAL_ID:
				return new ArgumentArgumentGroundsCompartmentEditPart(view);

			case ArgumentArgumentWarrantsCompartmentEditPart.VISUAL_ID:
				return new ArgumentArgumentWarrantsCompartmentEditPart(view);

			case ArgumentArgumentGroundsCompartment2EditPart.VISUAL_ID:
				return new ArgumentArgumentGroundsCompartment2EditPart(view);

			case ArgumentArgumentWarrantsCompartment2EditPart.VISUAL_ID:
				return new ArgumentArgumentWarrantsCompartment2EditPart(view);

			case ArgumentArgumentGroundsCompartment3EditPart.VISUAL_ID:
				return new ArgumentArgumentGroundsCompartment3EditPart(view);

			case ArgumentArgumentWarrantsCompartment3EditPart.VISUAL_ID:
				return new ArgumentArgumentWarrantsCompartment3EditPart(view);

			case RebutsEditPart.VISUAL_ID:
				return new RebutsEditPart(view);

			case MitigatesEditPart.VISUAL_ID:
				return new MitigatesEditPart(view);

			case RebutsDeniesEditPart.VISUAL_ID:
				return new RebutsDeniesEditPart(view);

			case WrappingLabelEditPart.VISUAL_ID:
				return new WrappingLabelEditPart(view);

			case MitigatesRestoresEditPart.VISUAL_ID:
				return new MitigatesRestoresEditPart(view);

			case WrappingLabel2EditPart.VISUAL_ID:
				return new WrappingLabel2EditPart(view);

			case ArgumentReplacesEditPart.VISUAL_ID:
				return new ArgumentReplacesEditPart(view);

			case WrappingLabel3EditPart.VISUAL_ID:
				return new WrappingLabel3EditPart(view);

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
			if (!text.getFont().isDisposed()) {
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
			if (!text.getFont().isDisposed()) {
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
}
