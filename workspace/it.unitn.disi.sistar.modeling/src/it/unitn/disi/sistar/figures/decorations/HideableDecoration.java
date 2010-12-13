package it.unitn.disi.sistar.figures.decorations;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;

public class HideableDecoration extends PolygonDecoration{
	protected boolean isHidden;
	protected boolean isOverrideHidden = false;
	public void setHiddenValue(boolean isHidden)
	{
		
		this.isHidden = isHidden;
		repaint();
	}
	
	public boolean getHiddenValue()
	{
		return isHidden;
	}
	@Override
	protected void outlineShape(Graphics g) {
		if(isHidden||isOverrideHidden)
			return;
		super.outlineShape(g);
	}
	
	@Override
	protected void fillShape(Graphics g) {
		if(isHidden || isOverrideHidden)
			return;
		super.fillShape(g);
	}

	public boolean isOverrideHidden() {
		return isOverrideHidden;
	}

	public void setOverrideHidden(boolean isOverrideHidden) {
		this.isOverrideHidden = isOverrideHidden;
		repaint();
	}
}
