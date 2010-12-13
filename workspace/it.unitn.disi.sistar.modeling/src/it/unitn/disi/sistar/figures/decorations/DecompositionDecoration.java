package it.unitn.disi.sistar.figures.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;

public class DecompositionDecoration extends PolygonDecoration{

	/** Template for a default tip that points to the right when the rotation angle is 0 */
	public static final PointList DEFAULT_TIP = new PointList();
	static {
		DEFAULT_TIP.addPoint(-3, 0);
		DEFAULT_TIP.addPoint(3, 0);
	}
	
	public DecompositionDecoration() 
	{
		super();
		this.setTemplate(DEFAULT_TIP);
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		super.outlineShape(g);

	}
	
	@Override
	public void setRotation(double angle) {
		super.setRotation(0);
	}
	}

