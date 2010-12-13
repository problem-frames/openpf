package it.unitn.disi.sistar.figures.anchors;

import it.unitn.disi.sistar.figures.nodes.BaseFigure;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class ServiceAnchor extends AbstractConnectionAnchor{
	
	public ServiceAnchor(IFigure figure)
	{
		super(figure);
	}
	
	public Point getLocation(Point reference) {
		Rectangle r = Rectangle.SINGLETON;
		 
		//r.setBounds(((BaseFigure)getOwner()).getImageBound());
		if(getOwner() instanceof BaseFigure)
			r.setBounds(((BaseFigure)getOwner()).getImageBound());
		else
			r.setBounds(getOwner().getBounds());
		
		Point theReference = reference.getCopy();
		
        Figure figure = (Figure) getOwner();
        figure.translateToRelative(theReference);
        

        float figureCenterX = r.x + r.width/2;
        float figureCenterY = r.y + r.height/2;
        float anchorPointX = theReference.x;
        float anchorPointY = theReference.y;
        float xDiff = figureCenterX - anchorPointX;
        float yDiff = figureCenterY - anchorPointY;
        while (Math.abs(xDiff) > 1 || Math.abs(yDiff) > 1) {
            xDiff = figureCenterX - anchorPointX;
            yDiff = figureCenterY - anchorPointY;
            float xMiddle = anchorPointX + xDiff/2;
            float yMiddle = anchorPointY + yDiff/2;
            if (figure.containsPoint((int)xMiddle,(int)yMiddle)) {
                figureCenterX = xMiddle;
                figureCenterY = yMiddle;
            }
            else {
                anchorPointX = xMiddle;
                anchorPointY = yMiddle;
            }
        }
			
        Point anchorPoint = new Point((int)anchorPointX,(int)anchorPointY);
        figure.translateToAbsolute(anchorPoint);
		return anchorPoint;
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
