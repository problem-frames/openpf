package it.unitn.disi.sistar.figures.connections;

import it.unitn.disi.sistar.figures.decorations.DependencyDecoration;
import it.unitn.disi.sistar.figures.decorations.HideableDecoration;
import it.unitn.disi.sistar.figures.locators.RotatableObjectLocator;
import it.unitn.disi.sistar.mapping.DependencyTypeMapper;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionLocator;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class DependencyRelationFigure extends HideableRelationFigure {
	private static PointList ARROW_TEMPLATE = new PointList();
	static{
		ARROW_TEMPLATE.addPoint(-2, 4);
		ARROW_TEMPLATE.addPoint(0, 0);
		ARROW_TEMPLATE.addPoint(-2, -4);
	}
private EDependencyType dependencyType;
private HideableDecoration dependencyDecoration;
private HideableDecoration troposModelDecoration;
private boolean useTroposModel = false;

public DependencyRelationFigure(EDependencyType type) {
	setForegroundColor(ColorConstants.black);
	setBackgroundColor(ColorConstants.black);
	
	dependencyDecoration = new DependencyDecoration(DependencyTypeMapper.mapAttribute(type));
	
	dependencyDecoration.setBackgroundColor(new Color(Display.getCurrent(), 152,251,152));
	dependencyDecoration.setForegroundColor(ColorConstants.black);
	
	troposModelDecoration = new HideableDecoration();
	troposModelDecoration.setTemplate(ARROW_TEMPLATE);
	troposModelDecoration.setOverrideHidden(true);
	
	RotatableObjectLocator locator = new RotatableObjectLocator(this, ConnectionLocator.MIDDLE);
	add(dependencyDecoration, locator);
	add(troposModelDecoration, locator);
	
	
	setDependencyType(type);
}

public EDependencyType getDependencyType() {
	return dependencyType;
}

public void setDependencyType(EDependencyType dependencyType) {
	this.dependencyType = dependencyType;
	if(getChildren().get(0) instanceof DependencyDecoration)
	{
		DependencyDecoration decoration = (DependencyDecoration)getChildren().get(0);
		decoration.setLabel(DependencyTypeMapper.mapAttribute(dependencyType));
		decoration.repaint();
	}
}

public boolean isUseTroposModel() {
	return useTroposModel;
}

public void setUseTroposModel(boolean useTroposModel) {
	this.useTroposModel = useTroposModel;
	if(useTroposModel)
	{
		troposModelDecoration.setOverrideHidden(false);
		dependencyDecoration.setOverrideHidden(true);
	}else
	{
		troposModelDecoration.setOverrideHidden(true);
		dependencyDecoration.setOverrideHidden(false);
	}
}

public HideableDecoration getDependencyDecoration() {
	return dependencyDecoration;
}

public void setDependencyDecoration(HideableDecoration dependencyDecoration) {
	this.dependencyDecoration = dependencyDecoration;
}
}
