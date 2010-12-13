package it.unitn.disi.sistar.figures.nodes;

import it.unitn.disi.sistar.modeling.tropos.EServiceType;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Polygon;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class ServiceFigure extends BaseFigure{

	private EServiceType type = EServiceType.GOAL_LITERAL;


	public EServiceType getType() {
		return type;
	}

	public void setType(EServiceType type) {
		if(type == EServiceType.TASK_LITERAL)
		{
			labelShrinkRight = 0.2;
			labelShrinkLeft = 0.2;
			labelShrinkTop = 0.04;
			labelShrinkBottom = 0.04;
		}else if(type == EServiceType.SOFTGOAL_LITERAL)
		{
			labelShrinkRight = 0.18;
			labelShrinkLeft = 0.18;
			labelShrinkTop = 0.1;
			labelShrinkBottom = 0.1;
		}else if(type == EServiceType.EVENT_LITERAL)
		{
			labelShrinkTop = 0.2;
			labelShrinkRight = 0.04;
			labelShrinkLeft = 0.04;
			labelShrinkBottom = 0.04;
		}else
		{
			labelShrinkRight = 0.04;
			labelShrinkLeft = 0.04;
			labelShrinkTop = 0.04;
			labelShrinkBottom = 0.04;
		}
		
		//System.out.println("label left:" + labelShrinkLeft + "label right:" + labelShrinkRight);
		this.type = type;
	}


	@Override
	public boolean containsPoint(int x, int y) {
		if(isHidden())
			return false;

		if(type.equals(EServiceType.GOAL_LITERAL))
			return containsGoalPoint(x, y);
		else if(type.equals(EServiceType.SOFTGOAL_LITERAL))
			return containsSoftGoalPoint(x, y);
		else if(type.equals(EServiceType.TASK_LITERAL))
			return containsTaskPoint(x, y);
		else if(type.equals(EServiceType.RESOURCE_LITERAL))
			return super.containsPoint(x, y);
		else if(type.equals(EServiceType.EVENT_LITERAL))
			return containsEventPoint(x, y);

		return false;
	}
	@Override
	protected void fillShape(Graphics graphics) {
		if(isHidden())
			return;
		if(overlayColor != null)
		{
			originalColor = graphics.getBackgroundColor();
			graphics.setBackgroundColor(overlayColor);
		}
		
		if(type.equals(EServiceType.GOAL_LITERAL))
			fillGoalShape(graphics);
		else if(type.equals(EServiceType.SOFTGOAL_LITERAL))
			fillSoftgoalShape(graphics);
		else if(type.equals(EServiceType.TASK_LITERAL))
			fillTaskShape(graphics);
		else if(type.equals(EServiceType.RESOURCE_LITERAL))
			fillResourceShape(graphics);
		else if(type.equals(EServiceType.EVENT_LITERAL))
			fillEventShape(graphics);

		if(overlayColor != null)
		{
			graphics.setBackgroundColor(originalColor);
		}
	}

	@Override
	protected void outlineShape(Graphics graphics) {
		if(isHidden())
			return;
		
		if(remarks != null)
		{
			graphics.drawString(remarks, getImageBound().getTopLeft());
		}
		if(type.equals(EServiceType.GOAL_LITERAL))
		;	//outlineGoalShape(graphics);
		else if(type.equals(EServiceType.SOFTGOAL_LITERAL))
		;	//outlineSoftgoalShape(graphics);
		else if(type.equals(EServiceType.TASK_LITERAL))
		;//	outlineTaskShape(graphics);
		else if(type.equals(EServiceType.RESOURCE_LITERAL))
		;//	super.outlineShape(graphics);
		else if(type.equals(EServiceType.EVENT_LITERAL))
		;//	outlineEventShape(graphics);
	}

	protected void outlineGoalShape(Graphics graphics) {
		Rectangle r = getImageBound().getCopy();
		graphics.drawRoundRectangle(r, r.height*3/4, r.height*3/4);
	}
	protected void fillGoalShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		graphics.setBackgroundColor(graphics.getForegroundColor());
		graphics.fillRoundRectangle(r, r.height*3/4, r.height*3/4);
		graphics.setBackgroundColor(bgColor);
		graphics.fillRoundRectangle(r.shrink(lineWidth, lineWidth), r.height*3/4 - lineWidth, 
				r.height*3/4 - lineWidth);
	}
	protected void fillSoftgoalShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		Color fgColor = graphics.getForegroundColor();
		
		graphics.setBackgroundColor(fgColor);
		Rectangle leftRect = new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2);
		graphics.fillArc(leftRect, 90, 330) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(leftRect.shrink(lineWidth, lineWidth), 100,360 ) ;
		
		graphics.setBackgroundColor(fgColor);
		Rectangle rightRect = new Rectangle(r.x + r.width/2, r.y + r.height/4, r.width/2, r.height/2);
		graphics.fillArc(rightRect, 240, 330) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(rightRect.shrink(lineWidth, lineWidth), 280,360 ) ;

		graphics.setBackgroundColor(fgColor);
		Rectangle upperRect1 = new Rectangle(r.x + r.width/6, r.y, 5*r.width/12, r.height/2);
		graphics.fillArc(upperRect1, 30, 175) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(upperRect1.shrink(lineWidth, lineWidth), 55,360 ) ;
		
		graphics.setBackgroundColor(fgColor);
		Rectangle upperRect2 = new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y, 5*r.width/12, r.height/2);
		graphics.fillArc(upperRect2, -15, 180) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(upperRect2.shrink(lineWidth, lineWidth), 0, 360 ) ;
		
		graphics.setBackgroundColor(fgColor);
		Rectangle bottomRect2 = new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y+ r.height/2, 5*r.width/12, r.height/2);
		graphics.fillArc(bottomRect2,  230, 150) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(bottomRect2.shrink(lineWidth, lineWidth), 235, 360) ;
		
		graphics.setBackgroundColor(fgColor);
		Rectangle bottomRect1 = new Rectangle(r.x + r.width/6, r.y + r.height/2, 5*r.width/12, r.height/2);
		graphics.fillArc(bottomRect1, 150, 190) ;
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(bottomRect1.shrink(lineWidth, lineWidth), 180, 360 ) ;

		graphics.setBackgroundColor(fgColor);
		Rectangle centerRect = r.shrink(r.width/3, r.height/3);
		graphics.fillRectangle(centerRect);
		graphics.setBackgroundColor(bgColor);
		graphics.fillRectangle(centerRect);
	}

	protected void outlineSoftgoalShape(Graphics graphics) {
		Rectangle r = getImageBound();

		Rectangle leftRect = new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2);
		graphics.drawArc(leftRect, 100, 160) ;
		Rectangle rightRect = new Rectangle(r.x + r.width/2, r.y + r.height/4, r.width/2, r.height/2);
		graphics.drawArc(rightRect, 280, 160) ;

		Rectangle upperRect1 = new Rectangle(r.x + r.width/6, r.y, 5*r.width/12, r.height/2);
		graphics.drawArc(upperRect1, 55, 125) ;
		Rectangle upperRect2 = new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y, 5*r.width/12, r.height/2);
		graphics.drawArc(upperRect2, 0, 155) ;

		Rectangle bottomRect1 = new Rectangle(r.x + r.width/6, r.y + r.height/2, 5*r.width/12, r.height/2);
		graphics.drawArc(bottomRect1, 180, 150) ;
		Rectangle bottomRect2 = new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y+ r.height/2, 5*r.width/12, r.height/2);
		graphics.drawArc(bottomRect2, 235, 125) ;
	}
	public boolean containsSoftGoalPoint(int x, int y) {
		Rectangle r = getImageBound();
		
		Ellipse leftRect = new Ellipse();
		leftRect.setBounds(new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;
		
		leftRect.setBounds(new Rectangle(r.x + r.width/2, r.y + r.height/4, r.width/2, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;

		leftRect.setBounds(new Rectangle(r.x + r.width/6, r.y, 5*r.width/12, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;

		leftRect.setBounds(new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y, 5*r.width/12, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;
		
		leftRect.setBounds(new Rectangle(r.x + r.width/6, r.y + r.height/2, 5*r.width/12, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;
		
		leftRect.setBounds(new Rectangle(r.x + 2*r.width/4 - r.width/12, r.y+ r.height/2, 5*r.width/12, r.height/2));
		if(leftRect.containsPoint(x, y)) return true;
		
		return false;
	}
	
	public boolean containsGoalPoint(int x, int y) {
		boolean superTest = super.containsPoint(x, y);
		
		Rectangle bounds = this.getImageBound().getCopy();
		
		Ellipse corner = new Ellipse();
		corner.setBounds(bounds);
		corner.setSize(bounds.height*3/4, bounds.height*3/4);
		boolean corner1Test = corner.containsPoint(x, y);
		if(corner1Test) return true;
		
		corner.setLocation(new Point(corner.getLocation().x + bounds.width -bounds.height*3/4,corner.getLocation().y));
		boolean corner2Test = corner.containsPoint(x, y);
		if(corner2Test) return true;
		
		corner.setLocation(new Point(corner.getLocation().x, corner.getLocation().y + bounds.height -bounds.height*3/4));
		boolean corner3Test = corner.containsPoint(x, y);
		if(corner3Test) return true;
		
		corner.setLocation(new Point(corner.getLocation().x-bounds.width +bounds.height*3/4,corner.getLocation().y));
		boolean corner4Test = corner.containsPoint(x, y);
		if(corner4Test) return true;
		
		Rectangle rectangle = bounds.shrink(bounds.height*3/8, 0);
		boolean rect1Test = rectangle.contains(x, y);
		if(rect1Test) return true;
		
		bounds = this.getImageBound().getCopy();
		rectangle = bounds.shrink(0,bounds.height*3/8);
		boolean rect2Test = rectangle.contains(x, y);
		if(rect2Test) return true;
		
		return false;
	}
	public boolean containsTaskPoint(int x, int y) {
		Polygon polygon = new Polygon();
		PointList points = new PointList();
		Rectangle r = getImageBound();
		points.addPoint(r.x, r.y + r.height/2);
		points.addPoint(r.x + r.width/4, r.y);
		points.addPoint(r.x + 3*r.width/4, r.y);
		points.addPoint(r.x + r.width, r.y + r.height/2);
		points.addPoint(r.x + 3*r.width/4, r.y + r.height);
		points.addPoint(r.x + r.width/4, r.y + r.height);
		polygon.setPoints(points);
		return polygon.containsPoint(x,y);
	}

	protected void fillTaskShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		Color fgColor = graphics.getForegroundColor();
		graphics.setBackgroundColor(fgColor);
		PointList points = new PointList();
		points.addPoint(r.x, r.y + r.height/2);
		points.addPoint(r.x + r.width/4 -lineWidth, r.y);
		points.addPoint(r.x + 3*r.width/4 + lineWidth, r.y);
		points.addPoint(r.x + r.width, r.y + r.height/2);
		points.addPoint(r.x + 3*r.width/4 + lineWidth, r.y + r.height );
		points.addPoint(r.x + r.width/4 -lineWidth, r.y + r.height);
		graphics.fillPolygon(points);
		
		graphics.setBackgroundColor(bgColor);
		PointList pointsOutline = new PointList();
		r.shrink(lineWidth, lineWidth);
		pointsOutline.addPoint(r.x, r.y + r.height/2);
		pointsOutline.addPoint(r.x + r.width/4, r.y);
		pointsOutline.addPoint(r.x + 3*r.width/4 , r.y);
		pointsOutline.addPoint(r.x + r.width, r.y + r.height/2);
		pointsOutline.addPoint(r.x + 3*r.width/4, r.y + r.height);
		pointsOutline.addPoint(r.x + r.width/4, r.y + r.height);
		graphics.fillPolygon(pointsOutline);
		
		
	}
	protected void outlineTaskShape(Graphics graphics) {
		Rectangle r = getImageBound().getCopy();
		
		PointList points = new PointList();
		points.addPoint(r.x, r.y + r.height/2);
		points.addPoint(r.x + r.width/4, r.y);
		points.addPoint(r.x + 3*r.width/4, r.y);
		points.addPoint(r.x + r.width, r.y + r.height/2);
		points.addPoint(r.x + 3*r.width/4, r.y + r.height);
		points.addPoint(r.x + r.width/4, r.y + r.height);

		graphics.drawPolygon(points);
	}
	
	public boolean containsEventPoint(int x, int y) {
		Polygon polygon = new Polygon();
		PointList points = new PointList();
		Rectangle r = getImageBound();
		points.addPoint(r.x, r.y + r.height/3);
		points.addPoint(r.x  + r.width/2, r.y);
		points.addPoint(r.x + r.width, r.y + r.height/3);
		points.addPoint(r.x + r.width, r.y + r.height);
		points.addPoint(r.x , r.y + r.height);
		polygon.setPoints(points);
		return polygon.containsPoint(x,y);
	}
	
	protected void fillEventShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		Color fgColor = graphics.getForegroundColor();
		graphics.setBackgroundColor(fgColor);
		
		PointList points = new PointList();
		points.addPoint(r.x, r.y + r.height/3 );
		points.addPoint(r.x  + r.width/2, r.y + lineWidth);
		points.addPoint(r.x + r.width, r.y + r.height/3 );
		points.addPoint(r.x + r.width, r.y + r.height);
		points.addPoint(r.x , r.y + r.height);

		graphics.fillPolygon(points);
		
		graphics.setBackgroundColor(bgColor);
		PointList pointsOutline = new PointList();
		r.shrink(lineWidth, lineWidth);
		pointsOutline.addPoint(r.x, r.y + r.height/3 + lineWidth);
		pointsOutline.addPoint(r.x  + r.width/2, r.y + lineWidth);
		pointsOutline.addPoint(r.x + r.width, r.y + r.height/3 + lineWidth);
		pointsOutline.addPoint(r.x + r.width, r.y + r.height);
		pointsOutline.addPoint(r.x , r.y + r.height);
		graphics.fillPolygon(pointsOutline);
		
	}
	
	protected void outlineEventShape(Graphics graphics) {
		Rectangle r = getImageBound();
		PointList points = new PointList();
		points.addPoint(r.x, r.y + r.height/3);
		points.addPoint(r.x  + r.width/2, r.y);
		points.addPoint(r.x + r.width, r.y + r.height/3);
		points.addPoint(r.x + r.width, r.y + r.height);
		points.addPoint(r.x , r.y + r.height);

		graphics.drawPolygon(points);
	}
	
	protected void fillResourceShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		Color fgColor = graphics.getForegroundColor();
		graphics.setBackgroundColor(fgColor);

		graphics.fillRectangle(r);

		graphics.setBackgroundColor(bgColor);
		graphics.fillRectangle(r.shrink(lineWidth, lineWidth));
		
	}

}
