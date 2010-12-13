package it.unitn.disi.sistar.figures.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class OwnershipDecoration extends HideableDecoration{

	/** Template for a default tip that points to the right when the rotation angle is 0 */
	public static final PointList DEFAULT_TIP = new PointList();

	private String label;
	static {
		DEFAULT_TIP.addPoint(1, 3);
		DEFAULT_TIP.addPoint(-2, 3);
		DEFAULT_TIP.addPoint(-2, -3);
		DEFAULT_TIP.addPoint(1, -3);

	}
	
	public OwnershipDecoration(String label) 
	{
		super();
		this.label = label;
		this.setTemplate(DEFAULT_TIP);
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		if(isHidden)
			return;
			
		super.outlineShape(g);
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBounds());
		r.width--;
		r.height--;
		r.shrink((lineWidth - 1) / 2, (lineWidth - 1) / 2);

		g.drawString(label, 
				r.x + (r.width-g.getFontMetrics().getAverageCharWidth()* label.length())/2, 
				r.y + (r.height-g.getFontMetrics().getHeight())/2);
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	}

