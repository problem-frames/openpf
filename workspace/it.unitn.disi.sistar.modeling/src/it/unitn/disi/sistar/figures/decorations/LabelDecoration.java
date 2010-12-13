package it.unitn.disi.sistar.figures.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;

public class LabelDecoration extends PolygonDecoration{

	private static int size = 6;
	public static final PointList DEFAULT_TIP = new PointList();
	private String label;
	static {
		DEFAULT_TIP.addPoint(size -2, 2*size);
		DEFAULT_TIP.addPoint(size -2, -size);
		DEFAULT_TIP.addPoint(-size +2, -size);
		DEFAULT_TIP.addPoint(-size +2, 2*size);
	}
	public LabelDecoration(String label) 
	{
		super();
		this.label = label;
		this.setTemplate(DEFAULT_TIP);
	}
	
	@Override
	protected void fillShape(Graphics g) {
	}
	@Override
	protected void outlineShape(Graphics g) {
		//super.outlineShape(g);
		Rectangle r = Rectangle.SINGLETON;
		r.setBounds(getBounds());

		if(label != null && label.length() > 0)
			g.drawString(label, r.x , r.y );
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	}

