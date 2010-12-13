package it.unitn.disi.sistar.modeling.api.editparts;

import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;

import java.util.List;

import org.eclipse.draw2d.IFigure;

public interface IDiagramEditPart {

	public void refreshMapping();
	public void createDecompositionLink(String parentName, String goalStart, List goalList, ECompositionType type);
	public void createDependencyLink(String delegatorName, String goalName, String delegateeName, EDependencyType type);
	public void createOwnershipLink(String parentName, String goalName, EOwnershipType type);
	public void createAssociationLink(String source, String target, EAssociationType type);
	
	public void hideFailures();
	public void hideFailures(IFigure figure);
	public IFigure showFailures(IFigure figure1, IFigure figure2, IFigure parentFigure1, IFigure parentFigure2);
	
	public void refreshStyles();
}
