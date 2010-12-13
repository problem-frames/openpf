package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.figures.connections.HideableRelationFigure;
import it.unitn.disi.sistar.modeling.diagram.filters.util.DiagramFilterUtil;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.util.TroposDiagramUtil;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.action.IAction;

public class PermissionTrustModelFilter extends AbstractFilter{
	
	public PermissionTrustModelFilter() {
		super();
	}

	public void run(IAction action) {
		manipulateAllAndNoneButton();
		uncheckIfChecked(TroposModelFilter.class.getCanonicalName(), action.isChecked());
	
		if(getEditor() instanceof DiagramDocumentEditor)
		{
			DiagramDocumentEditor troposEditor = (DiagramDocumentEditor)getEditor();
			DiagramEditPart diagramEditPart = troposEditor.getDiagramEditPart();
			EList edgesList = troposEditor.getDiagramDocument().getDiagram().getEdges();
				for (Iterator iter = edgesList.iterator(); iter.hasNext();) {
					Edge edge = (Edge) iter.next();
					EObject element = edge.getElement();
					if(element instanceof Dependency)
					{
						Dependency dependencyEdge = (Dependency)element;
						EDependencyType dependencyType = dependencyEdge.getDependencyType();
						if(dependencyType.equals(EDependencyType.TRUST_PERMISSION_LITERAL)
								||dependencyType.equals(EDependencyType.DISTRUST_PERMISSION_LITERAL)
								||dependencyType.equals(EDependencyType.TRUST_MONITOR_LITERAL)
								||dependencyType.equals(EDependencyType.MONITORING_PERMISSION_LITERAL))
						{
							ConnectionNodeEditPart editPart = TroposDiagramUtil.findConnectionEditPart(diagramEditPart, edge);
							if(dependencyType.equals(EDependencyType.TRUST_MONITOR_LITERAL))
							{
								AbstractFilter filter = (AbstractFilter)DiagramFilterUtil.getFilterMap().get(ExecutionTrustModelFilter.class.getCanonicalName());
								if(filter!= null && filter.getAction().isChecked() && !getAction().isChecked())
									continue;
							}
							if(editPart != null)
								((HideableRelationFigure)editPart.getConnectionFigure()).setHiddenValue(!getAction().isChecked());
						}	
					}
				}
		}
	}
}