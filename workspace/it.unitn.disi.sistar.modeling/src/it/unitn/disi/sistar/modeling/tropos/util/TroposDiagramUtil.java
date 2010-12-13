package it.unitn.disi.sistar.modeling.tropos.util;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

public class TroposDiagramUtil {

	public static List getAllServices(Diagram diagram){
		List serviceList = new ArrayList();
		List contentList = diagram.eContents();
		for (Iterator iter = contentList.iterator(); iter
				.hasNext();) {
			EObject element = (EObject) iter.next();
			if(element instanceof Service)
				serviceList.add(element);
			if(element instanceof Actor)
			{
				for(Iterator iterator = element.eContents().iterator(); iterator.hasNext();)
				{
					EObject innerElement = (EObject)iterator.next();
					if(innerElement instanceof Service)
						serviceList.add(innerElement);
				}
			}
		}
		return serviceList;
	}
	
	public static ConnectionNodeEditPart findConnectionEditPart(DiagramEditPart editPart, EObject element)
	{
		List connectionEditParts = editPart.getConnections();
		for (Iterator iter = connectionEditParts.iterator(); iter.hasNext();) {
			ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iter.next();
			if(connectionEditPart.getModel()== element)
				return connectionEditPart;
		}
		return null;
	}
}
