package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.figures.connections.HideableRelationFigure;
import it.unitn.disi.sistar.modeling.api.editparts.IDependencyEditPart;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramUtil;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.action.IAction;

public class TroposModelFilter extends AbstractFilter{

	public TroposModelFilter() {
		super();
	}

	public void run(IAction action) {
		//manipulateAllAndNoneButton();
		
		uncheckIfChecked(ExecutionTrustModelFilter.class.getCanonicalName(), action.isChecked());
		uncheckIfChecked(PermissionTrustModelFilter.class.getCanonicalName(), action.isChecked());
		
		checkIfChecked(PermissionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
		checkIfChecked(ExecutionDelegationModelFilter.class.getCanonicalName(), action.isChecked());
		checkIfChecked(OrganizationalChartModelFilter.class.getCanonicalName(), action.isChecked());
	
		if(getEditor() instanceof DiagramDocumentEditor)
		{
			DiagramDocumentEditor troposEditor = (DiagramDocumentEditor)getEditor();
			EList edgesList = troposEditor.getDiagramDocument().getDiagram().getEdges();
				for (Iterator iter = edgesList.iterator(); iter.hasNext();) {
					Edge edge = (Edge) iter.next();
					EObject element = edge.getElement();
					ConnectionNodeEditPart editPart = TroposDiagramUtil.findConnectionEditPart(troposEditor.getDiagramEditPart(), edge);
					if(element instanceof Dependency)
					{
						Dependency dependencyEdge = (Dependency)element;
						EDependencyType dependencyType = dependencyEdge.getDependencyType();
						if(dependencyType.equals(EDependencyType.TRUST_EXECUTION_LITERAL)
								||dependencyType.equals(EDependencyType.DISTRUST_EXECUTION_LITERAL)
								  ||dependencyType.equals(EDependencyType.TRUST_MONITOR_LITERAL)
								  ||dependencyType.equals(EDependencyType.MONITORING_EXECUTION_LITERAL))
						{
							
							if(editPart != null)
								((HideableRelationFigure)editPart.getConnectionFigure()).setHiddenValue(getAction().isChecked());
						}else
						{
							if(editPart != null)
								((IDependencyEditPart)editPart).changeRepresentation(getAction().isChecked());
						}
					}else if(element instanceof Ownership)
					{
						if(editPart != null)
							((HideableRelationFigure)editPart.getConnectionFigure()).setHiddenValue(getAction().isChecked());
					}
					EditPart source = troposEditor.getDiagramEditPart().findEditPart(null, edge.getSource().getElement());
					if(source!= null)source.refresh();
					
					EditPart target = troposEditor.getDiagramEditPart().findEditPart(null, edge.getTarget().getElement());
					if(target!= null)target.refresh();
				}
		}
	}
}