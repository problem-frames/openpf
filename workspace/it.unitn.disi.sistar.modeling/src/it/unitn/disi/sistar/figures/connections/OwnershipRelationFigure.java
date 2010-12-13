package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.decorations.OwnershipDecoration;
import it.unitn.disi.sistar.figures.locators.RotatableObjectLocator;
import it.unitn.disi.sistar.mapping.OwnershipTypeMapper;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class OwnershipRelationFigure extends HideableRelationFigure {

private EOwnershipType ownershipType;
private IFigure ownershipDecoration;

public OwnershipRelationFigure(EOwnershipType type) {
	setForegroundColor(ColorConstants.black);
	setBackgroundColor(ColorConstants.black);
	
	ownershipDecoration = new OwnershipDecoration(OwnershipTypeMapper.mapAttribute(type));
	
	ownershipDecoration.setBackgroundColor(new Color(Display.getCurrent(), 152,251,152));
	ownershipDecoration.setForegroundColor(ColorConstants.black);
	RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.MIDDLE);
	add(ownershipDecoration, locator);
	setOwnershipType(type);
}

public EOwnershipType getOwnershipType() {
	return ownershipType;
}

public void setOwnershipType(EOwnershipType ownershipType) {
	this.ownershipType = ownershipType;
	if(getChildren().get(0) instanceof OwnershipDecoration)
	{ 
		OwnershipDecoration decoration = (OwnershipDecoration)getChildren().get(0);
		decoration.setLabel(OwnershipTypeMapper.mapAttribute(ownershipType));
		decoration.repaint();
	}
}

public IFigure getOwnershipDecoration() {
	return ownershipDecoration;
}

public void setOwnershipDecoration(IFigure ownershipDecoration) {
	this.ownershipDecoration = ownershipDecoration;
}	
}
