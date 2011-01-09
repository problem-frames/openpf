package customsrc;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SoftgoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Task5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.TaskEditPart;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.IntentionImpl;

public class SetActorTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected EvaluationLabel evalField = null;
	protected String evalLabel = "";
	protected String commandName = "";
	
	/*What we wish to change into*/
	protected String changeTo = "";

	protected SetActorTypeAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
	}
	
	public void setChangeTo(String change){
		changeTo = change;
	}

	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		IStructuredSelection selection = getStructuredSelection();
		
		if (selection == null || (selection.isEmpty())) {
			return;
		}
		
		Object[] actors = selection.toArray();
		int selectionSize = actors.length;
		
		for (int i = 0; i < selectionSize; i++) {
			Object actor = actors[i];
			// determine what type of actor it is, then cast it appropriately 
			// and apply the appropriate label to it
			
			GraphicalEditPart part = (GraphicalEditPart) selection.getFirstElement();
			IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
			DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
			
			doTypeSwitch(actor, dcs, progressMonitor);
			
		}
		
	}
	
	private void doTypeSwitch(Object originalEditPart, DiagramCommandStack dcs,	IProgressMonitor progressMonitor) {
		final EObject originalImpl = ((IGraphicalEditPart)originalEditPart).getNotationView().getElement();
		TransactionalEditingDomain domain = ((IGraphicalEditPart)originalEditPart).getEditingDomain();
		
		//Create new element (automatically sync info as well)
		CreateElementCommand create = selectCreateActorCommand(originalImpl, domain);
		dcs.execute(new ICommandProxy(create));
		
		//Before deleting the old element we should copy the children

		//Delete old element
		DestroyElementCommand destroy = new DestroyElementCommand(new DestroyElementRequest(domain, originalImpl, false));
		dcs.execute(new ICommandProxy(destroy));
		
	}

	private CreateElementCommand selectCreateActorCommand(
			EObject originalImpl, TransactionalEditingDomain domain) {
		CreateElementRequest req = null;
		
		if (changeTo.equals("Actor")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Actor_1001);
		}
		else if (changeTo.equals("Agent")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Agent_1002);
		}
		else if (changeTo.equals("Position")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Position_1003);
		}
		else if (changeTo.equals("Role")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Role_1004);
		}
		return new CreateNewActorTypeCommand(req, originalImpl);
	}
	
	private static class CreateNewActorTypeCommand extends CreateElementCommand {
		/**
		 * The newly created element.
		 */
		private EObject newElement;
		
		/**
		 * The element the duplicate is based on
		 */
		private EObject oldElement;
		
		/**
		 * The element type to be created.
		 */
		private final IElementType elementType;

		public CreateNewActorTypeCommand(CreateElementRequest request, EObject original) {
			super(request);
			elementType = request.getElementType();
			oldElement = original;
		}
		
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
	            IAdaptable info)
	        throws ExecutionException {
			
			 // Do the default element creation
	        newElement = doDefaultElementCreation();
	        
	        if (!getDefaultElementCreationStatus().isOK()) {
	        	return new CommandResult(getDefaultElementCreationStatus());
	        }

	        // Configure the new element
	        ConfigureRequest configureRequest = createConfigureRequest();

	        ICommand configureCommand = elementType
	            .getEditCommand(configureRequest);
	        
	        IStatus configureStatus = null;
	        
	        if (configureCommand != null && configureCommand.canExecute()) {
	        	configureStatus = configureCommand.execute(monitor, info);
	        }
	        
	        //Copy the metadata
	        ((Container) newElement).setName(((Container) oldElement).getName());
	        
	        // Now we should also copy children 
	        
	        
	        
	        // Put the newly created element in the request so that the
	        // 'after' commands have access to it.
	        getCreateRequest().setNewElement(newElement);
	        
			return (configureStatus == null) ? 
	        		CommandResult.newOKCommandResult(newElement) : 
	        		new CommandResult(configureStatus, newElement);
			
		}
	}

	public void refresh() {
		// TODO Auto-generated method stub
		
	}

}
