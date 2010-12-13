package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.decorations.HideableDecoration;

import java.util.Iterator;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;

public class HideableRelationFigure extends PolylineConnectionEx{

	protected boolean isHidden;
	public void setHiddenValue(boolean isHidden)
	{
		
		this.isHidden = isHidden;
		for (Iterator iter = getChildren().iterator(); iter.hasNext();) {
			IFigure element = (IFigure) iter.next();
			if(element instanceof HideableDecoration)
			{
				((HideableDecoration)element).setHiddenValue(isHidden);
			}
			if(element instanceof PolylineDecoration||element instanceof PolygonDecoration || element instanceof Label)
			{
				element.setVisible(!isHidden);
			}
		}
		repaint();
	}
	
	public boolean getHiddenValue()
	{
		return isHidden;
	}
	@Override
	protected void outlineShape(Graphics g) {
		if(isHidden)
			return;
		
		super.outlineShape(g);
	}
	
	@Override
	protected void fillShape(Graphics g) {
		if(isHidden)
			return;
		
		super.fillShape(g);
	}
}
