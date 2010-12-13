package it.unitn.disi.sistar.figures.anchors;

import it.unitn.disi.sistar.figures.nodes.BaseFigure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class GoalEllipseAnchor extends AbstractConnectionAnchor{
	
	public GoalEllipseAnchor(IFigure figure)
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

		Point bottom = new Point(r.getBottom().x, r.getBottom().y);
		return bottom;
	}
}
