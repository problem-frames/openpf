package it.unitn.disi.sistar.figures.nodes;

import it.unitn.disi.sistar.modeling.tropos.EActorType;

import java.util.Iterator;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class ActorFigure extends BaseEllipseFigure
{
	private EActorType type = EActorType.AGENT_LITERAL;
	private int expandedWidth = 300;
	private int expandedHeight = 300;
	public ActorFigure()
	{
		labelShrinkLeft = 0;
		labelShrinkRight = 0;
		labelShrinkTop = 0;
		labelShrinkBottom = 0;
	}
	
	public int getExpandedHeight() {
		return expandedHeight;
	}
	public void setExpandedHeight(int expandedHeight) {
		this.expandedHeight = expandedHeight;
	}
	public int getExpandedWidth() {
		return expandedWidth;
	}
	public void setExpandedWidth(int expandedWidth) {
		this.expandedWidth = expandedWidth;
	}
	@Override
	protected void fillShape(Graphics graphics) {
		if(isHidden()) 
			return;
		if(type.equals(EActorType.ACTOR_LITERAL))
			fillEllipseShape(graphics);
		else if(type.equals(EActorType.AGENT_LITERAL))
			fillEllipseShape(graphics);
		else if(type.equals(EActorType.POSITION_LITERAL))
			fillPositionShape(graphics);
		else if(type.equals(EActorType.ROLE_LITERAL))
			fillEllipseShape(graphics);
		
	}

	@Override
	public boolean containsPoint(int x, int y) {
		if(isHidden()||isEmptySize())
			return false;
		
		if(type.equals(EActorType.POSITION_LITERAL))
		{
			boolean isContainPoint = false;
			Rectangle r = getImageBound();
			Rectangle upperRect = new Rectangle(r.x + r.width/4, r.y, r.width/2, r.height/2);
			Rectangle leftRect = new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2);
			Rectangle bottomRect = new Rectangle(r.x + r.width/4, r.y + 2*r.height/4, r.width/2, r.height/2);
			Rectangle rightRect = new Rectangle(r.x + 2*r.width/4, r.y + r.height/4, r.width/2, r.height/2);
			
			Ellipse testEllipse = new Ellipse();
			testEllipse.setBounds(upperRect.shrink(lineWidth, lineWidth));
			isContainPoint |=testEllipse.containsPoint(x, y);
			testEllipse.setBounds(leftRect.shrink(lineWidth, lineWidth));
			isContainPoint |=testEllipse.containsPoint(x, y);
			testEllipse.setBounds(bottomRect.shrink(lineWidth, lineWidth));
			isContainPoint |=testEllipse.containsPoint(x, y);
			testEllipse.setBounds(rightRect.shrink(lineWidth, lineWidth));
			isContainPoint |=testEllipse.containsPoint(x, y);
			return isContainPoint;
		}
		return super.containsPoint(x, y);
	}
	protected void fillEllipseShape(Graphics graphics)
	{
		Rectangle r = getImageBound();
		Color bgColor = graphics.getBackgroundColor();
		graphics.setBackgroundColor(graphics.getForegroundColor());
		graphics.fillOval(r);
		
		graphics.setBackgroundColor(bgColor);
		graphics.fillOval(r.shrink(lineWidth, lineWidth));
		
		//graphics.fillOval(getImageBound().getCopy());
	}
	
	@Override
	protected void outlineShape(Graphics graphics) {
		if(isHidden()) 
			return;
		
		if(type.equals(EActorType.ACTOR_LITERAL))
		;//	super.outlineShape(graphics);
		else if(type.equals(EActorType.AGENT_LITERAL))
			outlineAgentShape(graphics);
		else if(type.equals(EActorType.POSITION_LITERAL))
		;//	outlinePositionShape(graphics);
		else if(type.equals(EActorType.ROLE_LITERAL))
			outlineRoleShape(graphics);
		
		if(failureList != null)
		{
			for (Iterator iter = failureList.iterator(); iter.hasNext();) {
				IFigure element = (IFigure) iter.next();
				
				element.repaint();
			}
		}
	}
	
	protected void outlineAgentShape(Graphics graphics) {
		Rectangle r = getImageBound().getCopy();
		
		/*r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
		graphics.drawOval(r);*/
		//graphics.drawOval(r);
		//graphics.setLineWidth(lineWidth+1);
		graphics.drawLine(new Point(r.x + 0.08* r.width, r.y + (r.height*0.25)), new Point(r.x + 0.92*r.width, r.y + (r.height*0.25)));
		//graphics.setLineWidth(lineWidth);
	}

	protected void fillPositionShape(Graphics graphics) {
		Rectangle r = getImageBound();
		
		Color bgColor = graphics.getBackgroundColor();
		graphics.setBackgroundColor(graphics.getForegroundColor());
		
		Rectangle upperRect = new Rectangle(r.x + r.width/4, r.y, r.width/2, r.height/2);
		graphics.fillArc(upperRect, 0, 360) ;
		Rectangle leftRect = new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2);
		graphics.fillArc(leftRect, 90, 360) ;
		Rectangle bottomRect = new Rectangle(r.x + r.width/4, r.y + 2*r.height/4, r.width/2, r.height/2);
		graphics.fillArc(bottomRect, 180, 360) ;
		Rectangle rightRect = new Rectangle(r.x + 2*r.width/4, r.y + r.height/4, r.width/2, r.height/2);
		graphics.fillArc(rightRect, 270, 360) ;
		
		graphics.setBackgroundColor(bgColor);
		graphics.fillArc(upperRect.shrink(lineWidth, lineWidth), 0, 360) ;
		graphics.fillArc(leftRect.shrink(lineWidth, lineWidth), 90, 360) ;
		graphics.fillArc(bottomRect.shrink(lineWidth, lineWidth), 180, 360) ;
		graphics.fillArc(rightRect.shrink(lineWidth, lineWidth), 270, 360) ;
		graphics.fillRectangle(r.shrink(r.width/3, r.height/3)) ;
		
		
	}

	protected void outlinePositionShape(Graphics graphics) {
		Rectangle r = getImageBound().getCopy();
		
		r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
		graphics.drawOval(r);
		Rectangle upperRect = new Rectangle(r.x + r.width/4, r.y, r.width/2, r.height/2);
		graphics.drawArc(upperRect, 0, 180) ;
		Rectangle leftRect = new Rectangle(r.x , r.y + r.height/4, r.width/2, r.height/2);
		graphics.drawArc(leftRect, 90, 180) ;
		Rectangle bottomRect = new Rectangle(r.x + r.width/4, r.y + 2*r.height/4, r.width/2, r.height/2);
		graphics.drawArc(bottomRect, 180, 180) ;
		Rectangle rightRect = new Rectangle(r.x + 2*r.width/4, r.y + r.height/4, r.width/2, r.height/2);
		graphics.drawArc(rightRect, 270, 180) ;
	}
	protected void outlineRoleShape(Graphics graphics) {
		Rectangle r = getImageBound().getCopy();
		
		r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);
		//graphics.drawOval(r);*/
		//graphics.setLineWidth(lineWidth+1);
		graphics.drawArc(r.x , r.y + (r.height/6),  r.width,2* r.height/3  , 180, 180);
		//graphics.setLineWidth(lineWidth);
		//graphics.drawOval(r);
	}
	
	
	public EActorType getType() {
		return type;
	}

	public void setType(EActorType type) {
		this.type = type;
	}
}
