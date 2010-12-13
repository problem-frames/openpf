package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.mapping.ContributionTypeMapper;
import it.unitn.disi.sistar.modeling.api.editparts.IContributionEditPart;
import it.unitn.disi.sistar.modeling.api.editparts.IServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;


public class QuantitativeQualitativeFilter implements IEditorActionDelegate{
	private IEditorPart editor;

	public IEditorPart getEditor() {
		return editor;
	}
	public QuantitativeQualitativeFilter() {
			super();
	}

	public void run(IAction action) {
		
		if(getEditor() instanceof DiagramDocumentEditor)
		{
			DiagramDocumentEditor troposEditor = (DiagramDocumentEditor)getEditor();
			List connectionEditPartList = troposEditor.getDiagramEditPart().getConnections();
			EList edgesList = troposEditor.getDiagramDocument().getDiagram().getEdges();
				for (Iterator iter = connectionEditPartList.iterator(); iter.hasNext();) {
					ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart)iter.next();
					Edge edge = (Edge) connectionEditPart.getPrimaryView();
					EObject element = edge.getElement();
					ContributionTypeMapper.setQuantitativeView(action.isChecked());
					if(element instanceof Contribution)
					{
						IContributionEditPart editPart = (IContributionEditPart) connectionEditPart;
						Contribution contribution =((Contribution)element);
						if(editPart!= null)
							editPart.refreshLabels();
					}	
				}
				
			List elementList  = ((Diagram)troposEditor.getDiagramDocument().getDiagram().getElement()).getObject();
			List serviceList = new ArrayList();
			for (Iterator iter = elementList.iterator(); iter.hasNext();) {
				EObject element = (EObject) iter.next();
				if(element instanceof Actor)
				{
					serviceList.addAll(((Actor)element).getServices());
				}else if (element instanceof Service)
					serviceList.add(element);
			}
			
			for (Iterator iter = serviceList.iterator(); iter.hasNext();) {
				Service element = (Service) iter.next();
				IServiceEditPart editPart = (IServiceEditPart)troposEditor.getDiagramEditPart().findEditPart(null, element);
				if(editPart.getRemarks()!= null)
				{
					if(ContributionTypeMapper.isQuantitativeView())
						editPart.showRemarks(true, false);
					else
						editPart.showRemarks(true, true);
				}
			}
		}
	}
	public void selectionChanged(IAction action, ISelection selection) {	
	}
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = targetEditor;
		action.setChecked(ContributionTypeMapper.isQuantitativeView());
	}
}