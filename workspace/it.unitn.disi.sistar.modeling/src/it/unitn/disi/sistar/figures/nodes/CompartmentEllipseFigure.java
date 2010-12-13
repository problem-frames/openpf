package it.unitn.disi.sistar.figures.nodes;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Rectangle;

public class CompartmentEllipseFigure extends BaseEllipseFigure{
	public static int SHAPE_OVAL = 1;
	public static int SHAPE_RECTANGLE = 2;
	private int shape = SHAPE_OVAL;
	
	private IFigure mainFigure;
	
	public IFigure getMainFigure() {
		return mainFigure;
	}

	public void setMainFigure(IFigure mainFigure) {
		this.mainFigure = mainFigure;
	}
	@Override
	protected void outlineShape(Graphics graphics) {
		if(isHidden())
			return;
		
		Rectangle r = getBounds().getCopy();
		r.shrink(lineWidth, lineWidth);
		if(shape == SHAPE_OVAL)
			graphics.drawOval(r);
		else if(shape == SHAPE_RECTANGLE)
		{
			r.shrink(15, 15);
			graphics.drawRectangle(r);
		}else
			System.out.println("shape:" + shape);
	}

	@Override
	public boolean containsPoint(int x, int y) {
		boolean returnValue = false;
		
		if(isHidden())
			return false;
		
		if(mainFigure!= null)
			if(mainFigure.containsPoint(x, y))
				return false;
		
		//returnValue = getBounds().contains(x, y);

		Rectangle r = getImageBound();
		long ux = x - r.x - r.width / 2;
		long uy = y - r.y - r.height / 2;
		
		if(r.width == 0 ||r.height == 0)
			return false;
			
		returnValue =  ((ux * ux) << 10) / (r.width * r.width) 
			 + ((uy * uy) << 10) / (r.height * r.height) <= 256;
		
		//System.out.println("return value" + returnValue);
		return returnValue;
	}
	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}
}
