package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.element.configuration.util.TroposElementConfiguration;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorActorCompartmentEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.tools.CreateServiceTool;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.draw2d.ui.geometry.PointListUtilities;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

public class TernaryCreationEditPolicy extends TroposGraphicalNodeEditPolicy{
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest requestOrig) {
		CompoundCommand cc = new CompoundCommand(DiagramUIMessages.AddCommand_Label);
		Command origCommand = super.getConnectionCompleteCommand(requestOrig);
		Map extendedData = requestOrig.getExtendedData();
		
		if(extendedData.containsKey(CreateDependencyTool.DEPENDENCY_TYPE)&& 
				requestOrig.getSourceEditPart() instanceof ActorEditPart && requestOrig.getTargetEditPart() instanceof ActorEditPart)
		{
			if(requestOrig.getType().equals(RequestConstants.REQ_CONNECTION_END))
			{
				ActorEditPart sourceEditPart = (ActorEditPart)requestOrig.getSourceEditPart();
				ActorEditPart targetEditPart = (ActorEditPart)requestOrig.getTargetEditPart();
									
				CreateViewAndElementRequest midServiceRequest = (CreateViewAndElementRequest)
				CreateViewRequestFactory.getCreateShapeRequest(TroposElementTypes.Service_2001, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

				Point sourceEndPoint = sourceEditPart.getPrimaryShape().getBounds().getTopLeft();
				sourceEditPart.getPrimaryShape().translateToAbsolute(sourceEndPoint);
				Point targetEndPoint = targetEditPart.getPrimaryShape().getBounds().getTopLeft();
				targetEditPart.getPrimaryShape().translateToAbsolute(targetEndPoint);
				Dimension sourceSize = new Dimension(sourceEditPart.getPrimaryShape().getWidth(), sourceEditPart.getPrimaryShape().getHeight());
				Dimension targetSize = new Dimension(targetEditPart.getPrimaryShape().getWidth(), targetEditPart.getPrimaryShape().getHeight());

				Point sourceEndPointCenter = new Rectangle(sourceEndPoint, sourceSize).getCenter();
				Point targetEndPointCenter = new Rectangle(targetEndPoint, targetSize).getCenter();
				PointList list = new PointList();
				list.addPoint(sourceEndPointCenter);
				list.addPoint(targetEndPointCenter);
				
				int serviceWidth = PreferenceUtil.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE);
				int serviceHeight = PreferenceUtil.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE);
				
				Point middlePoint = PointListUtilities.calculatePointRelativeToLine(list, 0, 50, true);
				middlePoint.x -= serviceWidth/2;
				middlePoint.y -= serviceHeight/2;
				IAdaptable midServiceAdaptable= (IAdaptable) ((List)midServiceRequest.getNewObject()).get(0);

				Map midServiceExtendedData = midServiceRequest.getExtendedData();
				midServiceExtendedData.put(CreateServiceTool.SERVICE_TYPE, EServiceType.GOAL_LITERAL);
				midServiceExtendedData.put(TroposElementConfiguration.NAME_PARAM, "goal");
				midServiceExtendedData.put("SAME_OBJECT", true);
				midServiceRequest.setExtendedData(midServiceExtendedData);
				midServiceRequest.setLocation(middlePoint);
				
				final CreateConnectionViewAndElementRequest firstLinkRequest =  (CreateConnectionViewAndElementRequest)
				CreateViewRequestFactory.getCreateConnectionRequest
				(TroposElementTypes.Dependency_3004, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

				Map firstLinkExtendedData = firstLinkRequest.getExtendedData();
				firstLinkExtendedData.put(CreateDependencyTool.DEPENDENCY_TYPE, requestOrig.getExtendedData().get(CreateDependencyTool.DEPENDENCY_TYPE));
				firstLinkRequest.setExtendedData(firstLinkExtendedData);
				
				CreateConnectionViewAndElementRequest secondLinkRequest =  (CreateConnectionViewAndElementRequest)
				CreateViewRequestFactory.getCreateConnectionRequest
				(TroposElementTypes.Dependency_3004, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				
				Map secondLinkExtendedData = secondLinkRequest.getExtendedData();
				secondLinkExtendedData.put(CreateDependencyTool.DEPENDENCY_TYPE, requestOrig.getExtendedData().get(CreateDependencyTool.DEPENDENCY_TYPE));
				secondLinkRequest.setExtendedData(secondLinkExtendedData);
				
				Command midServiceCommand = ((DiagramEditPart)getHost().getParent()).getCommand(midServiceRequest);
				
				DeferredCreateConnectionViewAndElementCommand firstLinkCommand = 
					new DeferredCreateConnectionViewAndElementCommand(firstLinkRequest, (IAdaptable)TroposElementTypes.Dependency_3004, 
							new EObjectAdapter(((ActorEditPart)requestOrig.getSourceEditPart()).getPrimaryView()), midServiceAdaptable,getHost().getViewer())
				{
					@Override
					public IStatus execute(IProgressMonitor progressMonitor, IAdaptable info) throws ExecutionException {
						IStatus status = super.execute(progressMonitor, info);
						return status;
					}
				};
				
				DeferredCreateConnectionViewAndElementCommand secondLinkCommand = 
					new DeferredCreateConnectionViewAndElementCommand(secondLinkRequest, (IAdaptable)TroposElementTypes.Dependency_3004, 
							midServiceAdaptable, new EObjectAdapter(((ActorEditPart)requestOrig.getTargetEditPart()).getPrimaryView()),getHost().getViewer());
				
				cc.add(midServiceCommand);
				
				Command firstLinkCommandWrapper =  new ICommandProxy(firstLinkCommand);
				Command secondLinkCommandWrapper =  new ICommandProxy(secondLinkCommand);
				
				cc.add(firstLinkCommandWrapper);
				cc.add(secondLinkCommandWrapper);
			}
		}else if(requestOrig.getExtendedData().containsKey(CreateDependencyTool.DEPENDENCY_TYPE)&& 
				requestOrig.getSourceEditPart() instanceof ServiceEditPart && requestOrig.getTargetEditPart() instanceof ActorEditPart)
		{
			if(requestOrig.getType().equals(RequestConstants.REQ_CONNECTION_END))
			{
				ServiceEditPart sourceEditPart = (ServiceEditPart)requestOrig.getSourceEditPart();
				ActorEditPart targetEditPart = (ActorEditPart)requestOrig.getTargetEditPart();
				
				CreateViewAndElementRequest endServiceRequest = (CreateViewAndElementRequest)
				CreateViewRequestFactory.getCreateShapeRequest(TroposElementTypes.Service_2001, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				
				Point sourceEndPoint = sourceEditPart.getPrimaryShape().getBounds().getTopLeft();
				sourceEditPart.getPrimaryShape().translateToAbsolute(sourceEndPoint);
				Point targetEndPoint = targetEditPart.getPrimaryShape().getBounds().getTopLeft();
				targetEditPart.getPrimaryShape().translateToAbsolute(targetEndPoint);
				Dimension sourceSize = new Dimension(sourceEditPart.getPrimaryShape().getWidth(), sourceEditPart.getPrimaryShape().getHeight());
				Dimension targetSize = new Dimension(targetEditPart.getPrimaryShape().getWidth(), targetEditPart.getPrimaryShape().getHeight());

				Point sourceEndPointCenter = new Rectangle(sourceEndPoint, sourceSize).getCenter();
				Point targetEndPointCenter = new Rectangle(targetEndPoint, targetSize).getCenter();
				PointList list = new PointList();
				list.addPoint(sourceEndPointCenter);
				list.addPoint(targetEndPointCenter);
				
				int serviceWidth = PreferenceUtil.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE);
				int serviceHeight = PreferenceUtil.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE);
				
				Point endPoint = targetEditPart.getSecondaryShape().getBounds().getCenter();
				
				endPoint.x -= serviceWidth/2;
				endPoint.y -= serviceHeight/2;
				targetEditPart.getSecondaryShape().translateToAbsolute(endPoint);
								
				String goalName = ((Service)sourceEditPart.getPrimaryView().getElement()).getName();
				Map endServiceExtendedData = endServiceRequest.getExtendedData();
				endServiceExtendedData.put(CreateServiceTool.SERVICE_TYPE, ((Service)sourceEditPart.getPrimaryView().getElement()).getServiceType());
				endServiceExtendedData.put(TroposElementConfiguration.EXACT_NAME, goalName);
				endServiceRequest.setExtendedData(endServiceExtendedData);
				endServiceRequest.setLocation(endPoint);

				Command endServiceCommand = ((ActorActorCompartmentEditPart)getHost().getChildren().get(1)).getCommand(endServiceRequest);
				cc.add(origCommand);
				if(EDependencyType.isDelegation((EDependencyType)extendedData.get(CreateDependencyTool.DEPENDENCY_TYPE)))
				{
					// if the target already has the element, don't create
					Actor actor = (Actor)targetEditPart.getPrimaryView().getElement();
					List services = actor.getServices();
					boolean isAlreadyCreated = false;
					for (Iterator iter = services.iterator(); iter.hasNext();) {
						Service service = (Service) iter.next();
						if(goalName.equals(service.getName()))
							isAlreadyCreated = true;
						
					}
					if(!isAlreadyCreated)
						cc.add(endServiceCommand);
				}
			}
		}else
			cc.add(origCommand);
		//System.out.println("commands:" + cc.getCommands());
		return cc;
	}
	
}
