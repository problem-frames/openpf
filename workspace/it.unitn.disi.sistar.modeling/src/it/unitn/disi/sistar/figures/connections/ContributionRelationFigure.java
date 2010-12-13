package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.swt.SWT;

public class ContributionRelationFigure extends PolylineConnectionEx {
	private static PointList CONTRIBUTION_TEMPLATE = new PointList();
	private static PointList ALLEVIATION_TEMPLATE = new PointList();
	private PolygonDecoration decoration;
	
	private boolean decorationFill;
	
	static{
		CONTRIBUTION_TEMPLATE.addPoint(-1, 2);
		CONTRIBUTION_TEMPLATE.addPoint(0, 0);
		CONTRIBUTION_TEMPLATE.addPoint(-1, -2);
		
		ALLEVIATION_TEMPLATE.addPoint(-1, 2);
		ALLEVIATION_TEMPLATE.addPoint(0, 0);
		ALLEVIATION_TEMPLATE.addPoint(-1, -2);
		ALLEVIATION_TEMPLATE.addPoint(-1, 0);
	}
	private boolean isDashed;
	
	private ERelationshipType relationshipType = ERelationshipType.CONTRIBUTION_LITERAL;
	public ContributionRelationFigure(ERelationshipType type) {
		decoration = new PolygonDecoration();
		setRelationshipType(type);
	}	
@Override
protected void outlineShape(Graphics g) {
	
	if(getBackgroundColor() !=  decoration.getBackgroundColor())
		decoration.setBackgroundColor(getBackgroundColor());
	decoration.setFill(decorationFill);
	if(isDashed)
	{
		g.setLineStyle(SWT.LINE_DASH);
		g.setLineDash(new int[]{5,5,5,5});
	}
	else
	{
		g.setLineStyle(SWT.LINE_SOLID);
		//g.setLineDash(new int[]{});
	}
	super.outlineShape(g);
}

public ERelationshipType getRelationshipType() {
	return relationshipType;
}

public void setRelationshipType(ERelationshipType relationshipType) {
	this.relationshipType = relationshipType;
	
	
	if(relationshipType== ERelationshipType.IMPACT_LITERAL)
	{
		decoration.setTemplate(ALLEVIATION_TEMPLATE);
		decoration.setBackgroundColor(ColorConstants.white);
		decorationFill = true;
		setBackgroundColor(ColorConstants.white);
		isDashed = true;

	}else if(relationshipType== ERelationshipType.ALLEVIATION_LITERAL)
	{
		decoration.setTemplate(ALLEVIATION_TEMPLATE);
		decoration.setBackgroundColor(ColorConstants.white);

		setBackgroundColor(ColorConstants.white);
		decorationFill = true;
		isDashed = false;
	}else
	{
		decoration.setTemplate(CONTRIBUTION_TEMPLATE);
		decoration.setBackgroundColor(ColorConstants.black);
		decorationFill = true;
		isDashed = false;
		setBackgroundColor(ColorConstants.black);
	}
	setTargetDecoration(decoration);
	repaint();
}
public PolygonDecoration getDecoration() {
	return decoration;
}
public void setDecoration(PolygonDecoration decoration) {
	this.decoration = decoration;
}
}
