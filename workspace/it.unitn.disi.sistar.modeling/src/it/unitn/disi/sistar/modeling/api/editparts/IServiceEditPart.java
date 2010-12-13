package it.unitn.disi.sistar.modeling.api.editparts;

import it.unitn.disi.sistar.modeling.tropos.Service;

import org.eclipse.swt.graphics.Color;

public interface IServiceEditPart extends IObjectEditPart{

	public void showAnalysisResult(Color color);
	
	public void hideAnalysisResult();
	
	public Service getElement();
	
	public void setRemarks(String remarks, String alternateRemarks);
	
	public void showRemarks(boolean show, boolean alternate);
	public String getRemarks();
	
}
