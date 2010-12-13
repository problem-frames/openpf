package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.decorations.DecompositionDecoration;
import it.unitn.disi.sistar.figures.locators.RotatableObjectLocator;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;

import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;

public class CompositionRelationFigure extends PolylineConnectionEx {
	
	private ECompositionType compositionType = ECompositionType.AND_LITERAL;
	private Point lastPoint;
	private CompositionGroupFigure figure;
	public Point getLastPoint() {
		return lastPoint;
	}
	public void setLastPoint(Point nextPoint) {
		this.lastPoint = nextPoint;
		if(nextPoint == null)
			figure.setVisibility(false);
		else
			figure.setVisibility(true);
		
		figure.repaint();
	}
public CompositionRelationFigure() {
	Figure f = new DecompositionDecoration();
	RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.TARGET);
	add(f, locator);
	figure = new CompositionGroupFigure();
	add(figure);
}	

@Override
protected void outlineShape(Graphics g) {
	super.outlineShape(g);
	
	if(lastPoint!= null)
	{
		//g.drawRectangle(getBounds().getCopy());
	
		if(getPoints().size() < 2)
			return;
		Point myPoint = PointListUtilities.calculatePointRelativeToLine(getPoints(), 0, 10, false);
		Point startPoint = getPoints().getFirstPoint();
		int h = 30;
		int w = 30;
		Rectangle r = new Rectangle();

		//.setForegroundColor(ColorConstants.blue);
		//g.drawLine(startPoint, getPoints().getLastPoint());
		//g.setForegroundColor(ColorConstants.cyan);
		//g.drawLine(startPoint, lastPoint);
		//g.setForegroundColor(ColorConstants.black);
		r.setLocation(startPoint.x - w/2, startPoint.y - h/2);
		r.setSize(w, h);
		Point testPoint = myPoint.getTranslated(startPoint.getNegated());
		Point testPoint2 = lastPoint.getTranslated(startPoint.getNegated());
		//System.out.println("lastpoint:" + lastPoint + "startPoint:" + startPoint) ;
		//System.out.println("testPoint:" + testPoint + "testPoint2:" + testPoint2) ;
		double angle1 = Math.toDegrees(Math.atan2(testPoint.y, testPoint.x));
		double angle2 = Math.toDegrees(Math.atan2(testPoint2.y, testPoint2.x));
		//System.out.println(angle1 + "  " + angle2);
			
		double primaryAngle = angle1;// > angle2? angle1:angle2;
		double secondaryAngle = angle2;// > angle2? angle2:angle1;
		double angleOffset = 360 - primaryAngle;
		double angleBetween = primaryAngle - secondaryAngle;
		//System.out.println("offset:" + angleOffset + "  " + angleBetween);
		
		figure.setAngleBetween(angleBetween);
		figure.setAngleOffset(angleOffset);
		figure.setInnerBound(r.getCopy());
		Rectangle rect = r.getCopy();
		rect.height +=20;
		rect.width +=10;
		figure.setBounds(rect);
		figure.setLabel(compositionType.getLiteral());
		//figure.repaint();
		//g.drawArc(r, (int)angleOffset, (int)angleBetween);
		//g.drawString(compositionType.getLiteral(), r.getBottomLeft());
	}
}
public ECompositionType getCompositionType() {
	return compositionType;
}
public void setCompositionType(ECompositionType compositionType) {
	this.compositionType = compositionType;
}
}
