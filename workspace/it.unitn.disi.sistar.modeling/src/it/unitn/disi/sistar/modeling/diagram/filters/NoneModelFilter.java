package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.figures.connections.HideableRelationFigure;
import it.unitn.disi.sistar.modeling.diagram.filters.util.DiagramFilterUtil;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
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

/**
 * Our sample action implements workbench action delegate.
 * The action proxy will be created by the workbench and
 * shown in the UI. When the user tries to use the action,
 * this delegate will be created and execution will be 
 * delegated to it.
 * @see IWorkbenchWindowActionDelegate
 */
public class NoneModelFilter extends AbstractFilter{

	public NoneModelFilter() {
		super();
	}

	public void run(IAction action) {
		for (Iterator iter = DiagramFilterUtil.getFilterMap().values().iterator(); iter.hasNext();) {
				AbstractFilter element = (AbstractFilter) iter.next();
				if(action.isChecked() && element.getAction().isChecked() && element!= this)
					element.getAction().setChecked(false);
				else if(!action.isChecked() && !element.getAction().isChecked() && element!= this)
					element.getAction().setChecked(true);
		}
			
		if(getEditor() instanceof DiagramDocumentEditor)
		{
			DiagramDocumentEditor troposEditor = (DiagramDocumentEditor)getEditor();
			DiagramEditPart diagramEditPart = troposEditor.getDiagramEditPart();
			EList edgesList = troposEditor.getDiagramDocument().getDiagram().getEdges();
				for (Iterator iter = edgesList.iterator(); iter.hasNext();) {
					Edge edge = (Edge) iter.next();
					EObject element = edge.getElement();
					if(element instanceof Dependency||element instanceof Ownership)
					{
						ConnectionNodeEditPart editPart = TroposDiagramUtil.findConnectionEditPart(diagramEditPart, edge);
						if(editPart != null)
							((HideableRelationFigure)editPart.getConnectionFigure()).setHiddenValue(getAction().isChecked());
					
					}
				}
				
		}
	}
}