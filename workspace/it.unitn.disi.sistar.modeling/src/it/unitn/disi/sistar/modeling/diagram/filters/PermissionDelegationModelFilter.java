package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.figures.connections.HideableRelationFigure;
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
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class PermissionDelegationModelFilter extends AbstractFilter{

	public PermissionDelegationModelFilter() {
		super();
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		manipulateAllAndNoneButton();
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
						if(dependencyType.equals(EDependencyType.DELEGATION_PERMISSION_LITERAL))
						{
							ConnectionNodeEditPart editPart = TroposDiagramUtil.findConnectionEditPart(diagramEditPart, edge);
							if(editPart != null)
								((HideableRelationFigure)editPart.getConnectionFigure()).setHiddenValue(!getAction().isChecked());
						}	
					}
				}
		}
	}
}