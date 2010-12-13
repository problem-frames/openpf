package it.unitn.disi.sistar.figures.nodes;

import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

public class BaseFigure  extends Shape{
	protected int coreX;
	protected int coreY;
	protected int width = PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR);
	protected int height = PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR);
	private boolean hidden = false;
	private boolean fixedSize = false;
	private boolean emptySize = false;
	private boolean isCollapsed = false;
	protected double labelShrinkLeft = 0.04;
	protected double labelShrinkRight = 0.04;
	protected double labelShrinkTop = 0.04;
	protected double labelShrinkBottom = 0.04;
	protected Color overlayColor;
	protected Color originalColor;
	protected List failureList;

	private IFigure labelFigure; 
	
	protected String remarks;
	public BaseFigure(){
	}
	
	public BaseFigure(int width, int height)
	{
		this.width = width;	
		this.height = height;
	}
	@Override
	public Dimension getPreferredSize(int wHint, int hHint) {
		return new Dimension(width, height);
	}
	@Override
	public Dimension getMaximumSize() {
		
		return new Dimension(width, height);
	}
	@Override
	public Dimension getMinimumSize(int wHint, int hHint) {
		
		return new Dimension(width, height);
	}
	
	@Override
	public boolean containsPoint(int x, int y) {
		if(isHidden())
			return false;
		
		Rectangle r = getImageBound();
		return r.contains(x,y);
	}
	@Override
	protected void fillShape(Graphics graphics) {
		if(isHidden())
			return;
		
		Rectangle r = getImageBound();
		graphics.fillRectangle(r);
		
	}
	@Override
	protected void outlineShape(Graphics graphics) {
		if(!isHidden())
		{
			Rectangle r = getImageBound();
			graphics.drawRectangle(r);
		}
	}
	
	public Rectangle getImageBound()
	{
		Rectangle r = Rectangle.SINGLETON;
		Point location = new Point(0,0);
		if(isFixedSize())
		{	
			int width = getSize().width < this.width? getSize().width:this.width; //+ (getSize().width-this.width)/10;
			int height = getSize().height < this.height? getSize().height:this.height;// + (getSize().height-this.height)/20;
			location = getBounds().getTopLeft().getCopy();
			location.x += coreX;
			location.y += coreY;
			//location.x +=  getSize().width < this.width||isCollapsed? 0:(getSize().width-this.width)/15;
			//location.y += getSize().height < this.height||isCollapsed?0:(getSize().height-this.height)/15;
			r.setLocation(location);
			r.setSize(width, height);
		}else
		{
			r.setBounds(getBounds().getCopy());
		}
		if(isEmptySize())
			r.setBounds(new Rectangle(0,0,0,0));
		
		r.shrink(lineWidth / 2, lineWidth  / 2);
		
		XYLayout layout = new XYLayout();
		Rectangle labelConstraint = r.getCopy();
		labelConstraint.setLocation(r.getLocation().translate(getBounds().getTopLeft().getNegated()));
		
		//System.out.println("shrink " + getBounds().width*(labelShrinkWidth/100) +" : " + getBounds().height*(labelShrinkHeight/100));
		//labelConstraint.shrink((int)(getBounds().width*labelShrinkWidth), (int)(getBounds().height*labelShrinkHeight));
		//System.out.println("before:" + labelConstraint);
		labelConstraint.x += getBounds().width*labelShrinkLeft;
		labelConstraint.width -= getBounds().width*labelShrinkLeft;
		labelConstraint.y += getBounds().width*labelShrinkTop;
		labelConstraint.height -= getBounds().width*labelShrinkTop;
		labelConstraint.width -= getBounds().width*labelShrinkRight;
		labelConstraint.height -= getBounds().width*labelShrinkBottom;
		//System.out.println(getClass().getCanonicalName() + "constraint: " + labelConstraint);
		layout.setConstraint(getLabelFigure(), labelConstraint);
		for (Iterator iter = getChildren().iterator(); iter.hasNext();) {
			IFigure element = (IFigure) iter.next();
			if(!(element instanceof BaseFigure) && layout.getConstraint((IFigure)element)==null)
				layout.setConstraint(element, new Rectangle(0,0, element.getSize().width, element.getSize().height));
		}
		this.setLayoutManager(layout);
		return r;
	}

	
	public boolean isFixedSize() {
		return fixedSize;
	}

	public void setFixedSize(boolean fixedSize) {
		this.fixedSize = fixedSize;
	}

	public int getHeight() {
		
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
		repaint();
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public int getWidth() {
		
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		repaint();
	}

	public IFigure getLabelFigure() {
		return labelFigure;
	}

	public void setLabelFigure(IFigure labelFigure) {
		this.labelFigure = labelFigure;
	}

	public boolean isEmptySize() {
		return emptySize;
	}

	public void setEmptySize(boolean emptySize) {
		this.emptySize = emptySize;
	}

	public List getFailureList() {
		return failureList;
	}

	public void setFailureList(List failureList) {
		this.failureList = failureList;
	}

	public Color getOverlayColor() {
		return overlayColor;
	}

	public void setOverlayColor(Color overlayColor) {
		this.overlayColor = overlayColor;
		this.repaint();
	}

	public boolean isCollapsed() {
		return isCollapsed;
	}

	public void setCollapsed(boolean isCollapsed) {
		this.isCollapsed = isCollapsed;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public int getCoreX() {
		return coreX;
	}

	public void setCoreX(int coreX) {
		this.coreX = coreX;
		repaint();
	}

	public int getCoreY() {
		return coreY;
	}

	public void setCoreY(int coreY) {
		this.coreY = coreY;
		repaint();
	}

}
