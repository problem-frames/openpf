package it.unitn.disi.sistar.modeling.tropos.diagram.part;

import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.CoreLocation;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStyleFactory;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.DiagramEditPart;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest.ViewAndElementDescriptor;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;

public class DiagramCreatorUtil {
	private static Map map = new HashMap();
	
	public static void refreshMap(Diagram diagram)
	{
		map = new HashMap();
		List children = diagram.getObject();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			EObject element = (EObject) iter.next();
			if(element instanceof Actor)
			{
				Actor actor = (Actor)element;
				map.put(actor.getName(), element);
				for (Iterator iterator = actor.getServices().iterator(); iterator
						.hasNext();) {
					Service service = (Service) iterator.next();
					map.put(actor.getName() + "." + service.getName(), service);
				}
			}
			else if (element instanceof Service)
			{
				Service service = (Service)element;
				map.put(service.getName(), element);
			}
		}
	}
	
	public static void dragAndDrop(DiagramEditPart editPart, EObject object, EditPart dropTargetEditPart, EditPart parentEditPart)
	{
		ShapeNodeEditPart targetEditPart = (ShapeNodeEditPart)editPart.findEditPart(null, object);
		if(targetEditPart == null || parentEditPart == null)
		{	
			ConsoleUtil.printToConsole("object: " + object + "target edit part:" + targetEditPart);
			ConsoleUtil.printToConsole("parent edit part:" + parentEditPart);
			return;
		}
		ChangeBoundsRequest changeBoundsForDragDropRequest =  new ChangeBoundsRequest();
		changeBoundsForDragDropRequest.setEditParts(targetEditPart);
		Node parentNode = (Node)((ShapeNodeEditPart)parentEditPart).getPrimaryView();
		Bounds bound = (Bounds)parentNode.getLayoutConstraint();
		Point location = new Point(bound.getX() + bound.getWidth()/2, bound.getY() + bound.getHeight()/2);
		changeBoundsForDragDropRequest.setLocation(new Point(200, 200));
		Node targetNode = (Node)((ShapeNodeEditPart)parentEditPart).getPrimaryView();
		Bounds targetBound = (Bounds)targetNode.getLayoutConstraint();
		changeBoundsForDragDropRequest.setSizeDelta(new Dimension(0,0));
		changeBoundsForDragDropRequest.setType(RequestConstants.REQ_DROP);

		Command changeBoundsForDragDropCommand = dropTargetEditPart.getCommand(changeBoundsForDragDropRequest);
		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(changeBoundsForDragDropCommand);
	}
	
	public static EObject createElement(IElementType elementType, Map data, DiagramEditPart diagramEditPart, EditPart editPart, Point location)
	{
		CreateViewAndElementRequest createElementRequest = (CreateViewAndElementRequest)
		CreateViewRequestFactory.getCreateShapeRequest(elementType, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		createElementRequest.setExtendedData(data);
		createElementRequest.setLocation(location);
		Command command = editPart.getCommand(createElementRequest);
		diagramEditPart.getDiagramEditDomain().getDiagramCommandStack().execute(command);
		return (EObject)((ViewAndElementDescriptor)((List)createElementRequest.getNewObject()).get(0)).getElementAdapter().getAdapter(EObject.class);
		
	}
	
	public static void createConnection(IElementType elementType, Map data, DiagramEditPart editPart, EObject object1, EObject object2)
	{
		final CreateConnectionViewAndElementRequest linkRequest =  (CreateConnectionViewAndElementRequest)
		CreateViewRequestFactory.getCreateConnectionRequest
		(elementType, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		linkRequest.setExtendedData(data);
		linkRequest.setType(RequestConstants.REQ_CONNECTION_START);
		if(editPart.findEditPart(null, object1) == null || editPart.findEditPart(null, object2) == null)
		{
			ConsoleUtil.printToConsole("object1 " + object1 + "editpart1:" + editPart.findEditPart(null, object1));
			ConsoleUtil.printToConsole("object2 " + object2 + "editpart2:" + editPart.findEditPart(null, object2));
			return;
		}
		linkRequest.setSourceEditPart(editPart.findEditPart(null, object1));
	    linkRequest.getSourceEditPart().getCommand(linkRequest);
		linkRequest.setType(RequestConstants.REQ_CONNECTION_END);
		EditPart targetEditPart = editPart.findEditPart(null, object2);
		linkRequest.setTargetEditPart(targetEditPart);
		Command createLinkCommand = targetEditPart.getCommand(linkRequest);
		editPart.getDiagramEditDomain().getDiagramCommandStack().execute(createLinkCommand);
	}
	
	public static void expandActor(DiagramEditPart diagramEditPart, Rectangle contentBound, Actor actor)
	{
		int buffer = 50;
		final ActorEditPart actorEditPart = (ActorEditPart)diagramEditPart.findEditPart(null, actor);
		final Node actorNode = (Node)actorEditPart.getPrimaryView();
		final Bounds actorBounds = (Bounds)actorNode.getLayoutConstraint();
		final org.eclipse.gmf.runtime.notation.Diagram diagramView = diagramEditPart.getDiagramView();
		if(contentBound.x + contentBound.width > actorBounds.getX() + actorBounds.getWidth())
		{
			final int shift = contentBound.x + contentBound.width + buffer - (actorBounds.getX() + actorBounds.getWidth());
			diagramEditPart.getEditingDomain().getCommandStack().execute(new RecordingCommand(diagramEditPart.getEditingDomain()) {
				protected void doExecute() {
					actorBounds.setWidth(actorBounds.getWidth() + shift);
					for (Iterator iterator = diagramView.getChildren().iterator(); iterator
							.hasNext();) 
					{
						View view = (View)iterator.next();
						if(view instanceof Node && view.getElement() instanceof Actor)
						{
							Node node = (Node)view;
							Bounds nodeBound = (Bounds)node.getLayoutConstraint();
							
							if(nodeBound.getX() > actorBounds.getX() && nodeBound.getY() >= actorBounds.getY() 
									&& nodeBound.getY() <= actorBounds.getY() + actorBounds.getHeight())
							{
								nodeBound.setX(nodeBound.getX() + shift);
							}		
						}			
					}
				}
			});
		 }
		if(contentBound.y + contentBound.height> actorBounds.getY() + actorBounds.getHeight())
		{
			final int shift = contentBound.y + contentBound.height + buffer - (actorBounds.getY() + actorBounds.getHeight());
			diagramEditPart.getEditingDomain().getCommandStack().execute(new RecordingCommand(diagramEditPart.getEditingDomain()) {
				protected void doExecute() {
					actorBounds.setHeight(actorBounds.getHeight() + shift);
					for (Iterator iterator = diagramView.getChildren().iterator(); iterator
							.hasNext();) 
					{
						View view = (View)iterator.next();
						if(view instanceof Node && view.getElement() instanceof Actor)
						{
							Node node = (Node)view;
							Bounds nodeBound = (Bounds)node.getLayoutConstraint();
							
							if(nodeBound.getY() > actorBounds.getY() && nodeBound.getX() >= actorBounds.getX() 
									&& nodeBound.getX() <= actorBounds.getX() + actorBounds.getWidth( ))
							{
								nodeBound.setY(nodeBound.getY() + shift);
							}
						}			
					}
				}
			});
		 }
	}
	public static Map getMap() {
		return map;
	}

	public static void setMap(Map map) {
		DiagramCreatorUtil.map = map;
	}
	
	public static Bounds getBoundsFromNode(Object view)
	{
		if(view instanceof Node)
			return (Bounds)((Node)view).getLayoutConstraint();
		return null;
	}
	
	public static void addStyle(final ShapeNodeEditPart editPart, final EClass eClass)
	{
		editPart.getEditingDomain().getCommandStack().execute(new RecordingCommand(editPart.getEditingDomain()) {
			protected void doExecute() {
					if(editPart.getPrimaryView().getStyle(eClass)== null)
					{
						Style style = (Style)CustomStyleFactory.eINSTANCE.create(eClass);
						if(style instanceof ActorStyle && editPart.getPrimaryView().getStyle(CustomStylePackage.eINSTANCE.getCoreLocation())!= null)
						{
							CoreLocation coreLocation = (CoreLocation)editPart.getPrimaryView().getStyle(CustomStylePackage.eINSTANCE.getCoreLocation());
							((ActorStyle)style).setActorHeight(coreLocation.getCoreHeight()!=0?coreLocation.getCoreHeight():PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
							((ActorStyle)style).setActorWidth(coreLocation.getCoreWidth()!=0?coreLocation.getCoreWidth():PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
							((ActorStyle)style).setActorX(coreLocation.getCoreX());
							((ActorStyle)style).setActorY(coreLocation.getCoreY());
						}else
						{
							((ActorStyle)style).setActorHeight(PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
							((ActorStyle)style).setActorWidth(PreferenceUtil.getIntegerPreference(PreferenceConstants.SIZE_ACTOR));
							((ActorStyle)style).setActorX(0);
							((ActorStyle)style).setActorY(0);
						}
						editPart.getPrimaryView().getStyles().add(style);
					}
				}
			});
	}
	public static void removeStyle(final ShapeNodeEditPart editPart, final EClass eClass)
	{
		editPart.getEditingDomain().getCommandStack().execute(new RecordingCommand(editPart.getEditingDomain()) {
			protected void doExecute() {
				if(editPart.getPrimaryView().getStyle(eClass)!= null)
					editPart.getPrimaryView().getStyles().remove(editPart.getPrimaryView().getStyle(eClass));
				}
			});
	}
	
	public static void refreshConnectionAnchor(DiagramEditPart diagramEditPart, View objectView)
	{
		List connections = diagramEditPart.getConnections();
		for (Iterator iter = connections.iterator(); iter.hasNext();) {
			ConnectionNodeEditPart connectionEditpart = (ConnectionNodeEditPart) iter.next();
			Edge edge = (Edge)connectionEditpart.getPrimaryView();
			if(edge.getSource() == objectView || edge.getTarget() == objectView)
				connectionEditpart.anchorChange();
		}
	}
	
	public static void createViewElement(DiagramEditPart editPart, final View view, final EObject element, final int visualId)
	{
		List children = view.getChildren();
		for (Iterator iter = children.iterator(); iter.hasNext();) {
			View child = (View) iter.next();
			if(child.getType().equals(String.valueOf(visualId)))
				return;
		}
		editPart.getEditingDomain().getCommandStack().execute(new RecordingCommand(editPart.getEditingDomain()) {
			protected void doExecute() {
				ViewService.getInstance().createNode(
						new EObjectAdapter(element),
						view,
						TroposVisualIDRegistry
								.getType(visualId),
						ViewUtil.APPEND, true, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				}
			});
	}
}
