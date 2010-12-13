package it.unitn.disi.sistar.figures.connections;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.Rectangle;

public class CompositionGroupFigure extends Shape{
	private double angleOffset;
	private double angleBetween;
	private Rectangle innerBound;
	private String label;
	
	private boolean visibility;
	public boolean isVisibility() {
		return visibility;
	}
	public void setVisibility(boolean visibility) {
		this.visibility = visibility;
	}
	@Override
	protected void outlineShape(Graphics g) {
		if(isVisibility())
		{
			g.drawArc(getInnerBound(), (int)angleOffset, (int)angleBetween + 1);
			g.drawString(label, getInnerBound().getBottomLeft());
		}
	}
	@Override
	protected void fillShape(Graphics graphics) {
	}
	public double getAngleBetween() {
		return angleBetween;
	}
	public void setAngleBetween(double angleBetween) {
		this.angleBetween = angleBetween;
	}
	public double getAngleOffset() {
		return angleOffset;
	}
	public void setAngleOffset(double angleOffset) {
		this.angleOffset = angleOffset;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Rectangle getInnerBound() {
		return innerBound;
	}
	public void setInnerBound(Rectangle innerBound) {
		this.innerBound = innerBound;
	}

}
