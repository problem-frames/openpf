package uk.ac.open.problem;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;

public class EntityFigure extends Shape {

	private Node node;
	static final Font FFIGUREENTITYNAME_FONT = new Font(Display.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 9,
			SWT.NORMAL);

	static final Font FFIGUREENTITYDESCRIPTION_FONT = new Font(Display
			.getCurrent(),
			Display.getDefault().getSystemFont().getFontData()[0].getName(), 6,
			SWT.ITALIC);
	
	private WrappingLabel fFigureEntityName;
	private WrappingLabel fFigureEntityDescription;
	
	@Override
	public boolean containsPoint(int x, int y) {
		if (node.getType().equals(NodeType.REQUIREMENT)) {
			// Ellipse in fact
			if (!super.containsPoint(x, y)) {
				return false;
			} else {
				Rectangle r = getBounds();
				long ux = x - r.x - r.width / 2;
				long uy = y - r.y - r.height / 2;
				return ((ux * ux) << 10) / (r.width * r.width) 
					 + ((uy * uy) << 10) / (r.height * r.height) <= 256;
			}
		} 
		return super.containsPoint(x, y);
	}

	@Override
	protected void fillShape(Graphics graphics) {
		if (node.getType().equals(NodeType.REQUIREMENT)) {
			/**
			 * Fills the ellipse.
			 * @see org.eclipse.draw2d.Shape#fillShape(org.eclipse.draw2d.Graphics)
			 */
			graphics.fillOval(getBounds());
		} else {
			graphics.fillRectangle(getBounds());
		}
	}	
	
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
		fFigureEntityDescription.setTextWrap(true);
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

	private boolean myUseLocalCoordinates = false;

	protected boolean useLocalCoordinates() {
		return myUseLocalCoordinates;
	}
	protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
		myUseLocalCoordinates = useLocalCoordinates;
	}
	public WrappingLabel getFigureEntityName() {
		return fFigureEntityName;
	}
	public WrappingLabel getFigureEntityDescription() {
		return fFigureEntityDescription;
	}

	public EntityFigure(Node node) {
		GridLayout layoutThis = new GridLayout();
		layoutThis.numColumns = 1;
		layoutThis.makeColumnsEqualWidth = true;
		this.setLayoutManager(layoutThis);

		this.setLineWidth(1);
		this.setLineStyle(Graphics.LINE_DASH);
		this.node = node;
		createContents();
	}
	/**
	 * @generated NOT
	 */
	@Override
	protected void outlineShape(Graphics graphics) {

		float lineInset = Math.max(1.0f, getLineWidthFloat()) / 2.0f;
		int inset1 = (int) Math.floor(lineInset);
		int inset2 = (int) Math.ceil(lineInset);

		Rectangle r = Rectangle.SINGLETON.setBounds(getBounds());
		r.x += inset1;
		r.y += inset1;
		r.width -= inset1 + inset2;
		r.height -= inset1 + inset2;

//		System.out.println(node.getType().getName());
		if (node != null && node.getType() == NodeType.REQUIREMENT) {
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);
			graphics.drawOval(r);
		} else {
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			// draw the line for designed domain
			if (node != null && node.getType() == NodeType.DESIGNED)
				graphics.drawLine(r.x + 15, r.y, r.x + 15, r.y + r.height);
			Rectangle t = new Rectangle();
			t.height = 22;
			t.width = 22;
			t.x = r.x + r.width - 22;
			t.y = r.y + r.height - 22;
			if (node != null && node.getType() != NodeType.REQUIREMENT) {
				graphics.drawRectangle(r);
				if (node.getType() == NodeType.MACHINE) {
					r.x += inset1;
					r.y += inset1;
					r.width -= inset1 + inset2;
					r.height -= inset1 + inset2;					
					graphics.drawLine(r.x + 10, r.y, r.x + 10, r.y
							+ r.height);
					graphics.drawLine(r.x + 20, r.y, r.x + 20, r.y
							+ r.height);
				} else if (node.getType() == NodeType.CAUSAL) {
					// draw the C to this customer border
					graphics.drawLine(t.x + 10, t.y + 6, t.x + 16, t.y + 6);
					graphics.drawLine(t.x + 6, t.y + 8, t.x + 10, t.y + 6);
					graphics.drawLine(t.x + 6, t.y + 8, t.x + 6, t.y + 16);
					graphics
							.drawLine(t.x + 6, t.y + 16, t.x + 10, t.y + 18);
					graphics.drawLine(t.x + 10, t.y + 18, t.x + 16,
							t.y + 18);
					graphics.drawRectangle(t);
				} else if (node.getType() == NodeType.LEXICAL) {
					// draw the X to this customer border
					graphics.drawLine(t.x + 5, t.y + 4, t.x + 17, t.y + 18);
					graphics.drawLine(t.x + 5, t.y + 18, t.x + 17, t.y + 4);
					graphics.drawRectangle(t);
				} else if (node.getType() == NodeType.BIDDABLE) {
					// draw the B to this customer border
					// main vertical line
					graphics.drawLine(t.x + 6, t.y + 5, t.x + 6, t.y + 19);
					// three horizontal line
					graphics.drawLine(t.x + 6, t.y + 6, t.x + 14, t.y + 6);
					graphics
							.drawLine(t.x + 6, t.y + 12, t.x + 14, t.y + 12);
					graphics
							.drawLine(t.x + 6, t.y + 18, t.x + 14, t.y + 18);
					// the angles
					graphics.drawLine(t.x + 16, t.y + 8, t.x + 14, t.y + 6);
					graphics.drawLine(t.x + 16, t.y + 10, t.x + 14,
							t.y + 12);
					graphics.drawLine(t.x + 16, t.y + 14, t.x + 14,
							t.y + 12);
					graphics.drawLine(t.x + 16, t.y + 16, t.x + 14,
							t.y + 18);
					// the other vertical
					graphics
							.drawLine(t.x + 16, t.y + 8, t.x + 16, t.y + 10);
					graphics.drawLine(t.x + 16, t.y + 14, t.x + 16,
							t.y + 16);
					graphics.drawRectangle(t);
				}
			}
		}
	}

}
