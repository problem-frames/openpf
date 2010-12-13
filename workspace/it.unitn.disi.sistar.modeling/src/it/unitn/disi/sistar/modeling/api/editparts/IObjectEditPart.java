package it.unitn.disi.sistar.modeling.api.editparts;

import it.unitn.disi.sistar.figures.nodes.BaseFigure;

import org.eclipse.gmf.runtime.notation.View;

public interface IObjectEditPart {

	public BaseFigure getPrimaryShape();
	
	public View getPrimaryView();
}
