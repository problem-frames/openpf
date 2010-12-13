package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorActorCompartmentEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposDiagramEditorPlugin;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.tools.CreateCompositionTool;
import it.unitn.disi.sistar.tools.CreateContributionTool;
import it.unitn.disi.sistar.tools.CreateServiceTool;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;

public class ActorActorCompartmentGraphicalNodeEditPolicy extends TroposGraphicalNodeEditPolicy {

	@Override
	public Command getCommand(Request request) {
		if(REQ_CONNECTION_START.equals(request.getType())||REQ_RECONNECT_TARGET.equals(request.getType())||(REQ_RECONNECT_SOURCE.equals(request.getType())))
		{
			return null;
		}else
			return super.getCommand(request);
	}
	@Override
	protected Command getConnectionAndRelationshipCompleteCommand(CreateConnectionViewAndElementRequest request) {
		return getConnectionCompleteCommand(request);
	}
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		CompoundCommand cc = new CompoundCommand(null);
		Map extendedData = request.getExtendedData();
		if((extendedData.containsKey(CreateContributionTool.CONTRIBUTION_TYPE)||extendedData.containsKey(CreateCompositionTool.COMPOSITION_TYPE))&& request.getType().equals(RequestConstants.REQ_CONNECTION_END) 
				&& request.getSourceEditPart() instanceof ServiceEditPart && request.getTargetEditPart() instanceof ActorActorCompartmentEditPart)
		{
			DiagramEditPart diagramEditPart = (DiagramEditPart)getHost().getRoot().getContents();
			CreateViewAndElementRequest midServiceRequest = (CreateViewAndElementRequest)
			CreateViewRequestFactory.getCreateShapeRequest(TroposElementTypes.Service_2001, TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			
			boolean isContribution = extendedData.containsKey(CreateContributionTool.CONTRIBUTION_TYPE);
			
			int serviceWidth = PreferenceUtil.getIntegerPreference(PreferenceConstants.WIDTH_SERVICE);
			int serviceHeight = PreferenceUtil.getIntegerPreference(PreferenceConstants.HEIGHT_SERVICE);
			
			Point middlePoint = request.getLocation();
			middlePoint.x -= serviceWidth/4;
			middlePoint.y -= serviceHeight/4;
			
			IAdaptable midServiceAdaptable= (IAdaptable) ((List)midServiceRequest.getNewObject()).get(0);
			
			Service sourceService = (Service)((ServiceEditPart)request.getSourceEditPart()).getPrimaryView().getElement();
			
			Map midServiceExtendedData = midServiceRequest.getExtendedData();
			midServiceExtendedData.put(CreateServiceTool.SERVICE_TYPE, sourceService.getServiceType());
			midServiceRequest.setExtendedData(midServiceExtendedData);
			midServiceRequest.setLocation(middlePoint);
			
			CreateConnectionViewAndElementRequest firstLinkRequest =  (CreateConnectionViewAndElementRequest)
			CreateViewRequestFactory.getCreateConnectionRequest
			(isContribution?TroposElementTypes.Contribution_3002:TroposElementTypes.Composition_3003, 
					TroposDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);

			Map firstLinkExtendedData = firstLinkRequest.getExtendedData();
			if(isContribution)
			{
				firstLinkExtendedData.put(CreateContributionTool.CONTRIBUTION_TYPE, 
				request.getExtendedData().get(CreateContributionTool.CONTRIBUTION_TYPE));
				if(request.getExtendedData().get(CreateContributionTool.RELATIONSHIP_TYPE)!= null &&
						((ERelationshipType)request.getExtendedData().get(CreateContributionTool.RELATIONSHIP_TYPE)!= ERelationshipType.ALLEVIATION_LITERAL))
					firstLinkExtendedData.put(CreateContributionTool.RELATIONSHIP_TYPE, 
						request.getExtendedData().get(CreateContributionTool.RELATIONSHIP_TYPE));
				else
					return null;
			}
			else
				firstLinkExtendedData.put(CreateCompositionTool.COMPOSITION_TYPE, 
						request.getExtendedData().get(CreateCompositionTool.COMPOSITION_TYPE));
			firstLinkRequest.setExtendedData(firstLinkExtendedData);
			
			Command midServiceCommand =  getHost().getCommand(midServiceRequest);
			DeferredCreateConnectionViewAndElementCommand firstLinkCommand = 
				new DeferredCreateConnectionViewAndElementCommand(firstLinkRequest, (IAdaptable)
						(isContribution?TroposElementTypes.Contribution_3002:TroposElementTypes.Composition_3003), 
						new EObjectAdapter(((ServiceEditPart)request.getSourceEditPart()).getPrimaryView()), 
						midServiceAdaptable,getHost().getViewer());
			cc.add(midServiceCommand);
			
			Command firstLinkCommandWrapper =  new ICommandProxy(firstLinkCommand);
			cc.add(firstLinkCommandWrapper);
		}else
			return super.getConnectionCompleteCommand(request);
		return cc;
	}
}
