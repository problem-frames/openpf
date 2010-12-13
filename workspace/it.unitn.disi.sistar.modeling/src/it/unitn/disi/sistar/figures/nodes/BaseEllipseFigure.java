package it.unitn.disi.sistar.figures.nodes;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Rectangle;

public class BaseEllipseFigure extends BaseFigure{

	
	@Override
	public boolean containsPoint(int x, int y) {
		if(isHidden()||isEmptySize())
			return false;
		
		Rectangle r = getImageBound();
		long ux = x - r.x - r.width / 2;
		long uy = y - r.y - r.height / 2;
		
		if(r.width == 0 ||r.height == 0)
			return false;
			
		return ((ux * ux) << 10) / (r.width * r.width) 
			 + ((uy * uy) << 10) / (r.height * r.height) <= 256;
	}
	@Override
	protected void fillShape(Graphics graphics) {
		if(isHidden())
			return;
		
		Rectangle r = getImageBound().getCopy();
		graphics.fillOval(r);
			
	}
	@Override
	protected void outlineShape(Graphics graphics) {
		if(isHidden())
			return;
		
		Rectangle r = getImageBound().getCopy();
		r.shrink(lineWidth, lineWidth);
		graphics.drawOval(r);
	}
}
