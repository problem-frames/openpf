package it.unitn.disi.sistar.figures.anchors;

import it.unitn.disi.sistar.figures.nodes.BaseFigure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class FixedEllipseAnchor extends AbstractConnectionAnchor{
	
	public FixedEllipseAnchor(IFigure figure)
	{
		super(figure);
	}
	
	public Point getLocation(Point reference) {
		Rectangle r = Rectangle.SINGLETON;
		 
		if(getOwner() instanceof BaseFigure)
			r.setBounds(((BaseFigure)getOwner()).getImageBound());
		else
			r.setBounds(getOwner().getBounds());
		r.translate(-1, -1);
		r.resize(1, 1);
		getOwner().translateToAbsolute(r);
		Point ref = r.getCenter().negate().translate(reference);
		
		if (ref.x == 0)
			return new Point(reference.x, (ref.y > 0) ? r.bottom() : r.y);
		if (ref.y == 0)
			return new Point((ref.x > 0) ? r.right() : r.x, reference.y);
		
		float dx = (ref.x > 0) ? 0.5f : -0.5f;
		float dy = (ref.y > 0) ? 0.5f : -0.5f;
		  
		// ref.x, ref.y, r.width, r.height != 0 => safe to proceed
		  
		float k = (float)(ref.y * r.width) / (ref.x * r.height);
		k = k * k;
		  
		return r.getCenter().translate((int)(r.width * dx / Math.sqrt(1 + k)),
		                                (int)(r.height * dy / Math.sqrt(1 + 1 / k)));
	}
	@Override
	public Point getReferencePoint() {
		if(getOwner() instanceof BaseFigure)
		{
			Point ref = ((BaseFigure)getOwner()).getImageBound().getCenter();
			getOwner().translateToAbsolute(ref);
			return ref;
		}
		return super.getReferencePoint();
	}
}
