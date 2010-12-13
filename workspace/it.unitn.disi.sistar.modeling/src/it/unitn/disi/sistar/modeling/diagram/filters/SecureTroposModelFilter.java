package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.modeling.diagram.filters.util.DiagramFilterUtil;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.Ownership;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.action.IAction;

public class SecureTroposModelFilter extends AbstractFilter{

	public SecureTroposModelFilter() {
		super();
	}

	public void run(IAction action) {
		manipulateAllAndNoneButton();
		if(getEditor() instanceof DiagramDocumentEditor)
		{
			DiagramDocumentEditor troposEditor = (DiagramDocumentEditor)getEditor();
			EList edgesList = troposEditor.getDiagramDocument().getDiagram().getEdges();
				for (Iterator iter = edgesList.iterator(); iter.hasNext();) {
					Edge edge = (Edge) iter.next();
					EObject element = edge.getElement();
					if(element instanceof Ownership)
					{
						DiagramFilterUtil.executeDiagramChange(troposEditor.getEditingDomain(), 
								edge, action.isChecked());	
					}else if(element instanceof Dependency)
					{
						Dependency dependencyEdge = (Dependency)element;
						EDependencyType dependencyType = dependencyEdge.getDependencyType();
						if(dependencyType.equals(EDependencyType.TRUST_EXECUTION_LITERAL)||
						   dependencyType.equals(EDependencyType.TRUST_PERMISSION_LITERAL)	)
						{
							DiagramFilterUtil.executeDiagramChange(troposEditor.getEditingDomain(), 
									edge, action.isChecked());	
						}	
					}else if(element instanceof Association)
					{
						Association associationEdge = (Association)element;
						EAssociationType associationType = associationEdge.getAssociationType();
						if(associationType.equals(EAssociationType.SUPERVISE_LITERAL))
						{
							DiagramFilterUtil.executeDiagramChange(troposEditor.getEditingDomain(), 
									edge, action.isChecked());	
						}
					}
					EditPart source = troposEditor.getDiagramEditPart().findEditPart(null, edge.getSource().getElement());
					if(source!= null)source.refresh();
					
					EditPart target = troposEditor.getDiagramEditPart().findEditPart(null, edge.getTarget().getElement());
					if(target!= null)target.refresh();
				}
		}
	}
}