package customsrc;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
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

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.commands.ResourceCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.commands.SoftgoalCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.commands.TaskCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Goal5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource3EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource4EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Resource5EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
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
import edu.toronto.cs.openome_model.impl.ModelImpl;

public class SetIntentionTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected EvaluationLabel evalField = null;
	protected String evalLabel = "";
	protected String commandName = "";
	
	/*What we wish to change into*/
	protected String changeTo = "";

	protected SetIntentionTypeAction(IWorkbenchPage workbenchPage) {
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
		
		Object[] intentions = selection.toArray();
		int selectionSize = intentions.length;
		
		for (int i = 0; i < selectionSize; i++) {
			Object intention = intentions[i];
			// determine what type of intention it is, then cast it appropriately 
			// and apply the appropriate label to it
			
			GraphicalEditPart part = (GraphicalEditPart) selection.getFirstElement();
			IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
			DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
			
			doTypeSwitch(intention, dcs, progressMonitor);
			
		}
	}
	
	public void doTypeSwitch(Object originalEditPart, DiagramCommandStack dcs, IProgressMonitor progressMonitor) {
		final EObject originalImpl = ((IGraphicalEditPart)originalEditPart).getNotationView().getElement();
		TransactionalEditingDomain domain = ((IGraphicalEditPart)originalEditPart).getEditingDomain();
		
		//Create new element (automatically sync info as well)
		CreateElementCommand create = selectCreateIntentionCommand(originalImpl, domain);
		dcs.execute(new ICommandProxy(create));

		//Delete old element
		DestroyElementCommand destroy = new DestroyElementCommand(new DestroyElementRequest(domain, originalImpl, false));
		dcs.execute(new ICommandProxy(destroy));
	}

	/**
	 * Returns the appropriate CreateElementCommand
	 * @param originalImpl
	 * @return
	 */
	private CreateElementCommand selectCreateIntentionCommand(EObject originalImpl, TransactionalEditingDomain domain) {
		CreateElementRequest req = null;
		
		if (changeTo.equals("Hardgoal")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Goal_1005);
		}
		else if (changeTo.equals("Softgoal")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Softgoal_1006);
		}
		else if (changeTo.equals("Task")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Task_1007);
		}
		else if (changeTo.equals("Resource")){
			req = new CreateElementRequest(domain, originalImpl.eContainer(), Openome_modelElementTypes.Resource_1008);
		}
		return new CreateNewIntentionTypeCommand(req, originalImpl);
	}
	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	private static class CreateNewIntentionTypeCommand extends CreateElementCommand{
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

		public CreateNewIntentionTypeCommand(CreateElementRequest request, EObject original) {
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
	        ((IntentionImpl) newElement).setName(((IntentionImpl) oldElement).getName());
	        
        	((IntentionImpl) newElement).setQualitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQualitativeReasoningCombinedLabel());
        	((IntentionImpl) newElement).setQualitativeReasoningDenialLabel(((IntentionImpl) oldElement).getQualitativeReasoningDenialLabel());
        	((IntentionImpl) newElement).setQualitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQualitativeReasoningSatisfiedLabel());
        	((IntentionImpl) newElement).setQuantitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningCombinedLabel());
        	((IntentionImpl) newElement).setQuantitativeReasoningDeniedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningDeniedLabel());
        	((IntentionImpl) newElement).setQuantitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningSatisfiedLabel());
        	
        	((IntentionImpl) newElement).getContributesFrom().addAll(((IntentionImpl) oldElement).getContributesFrom());
        	((IntentionImpl) newElement).getContributesTo().addAll(((IntentionImpl) oldElement).getContributesTo());
        	((IntentionImpl) newElement).getDecompositions().addAll(((IntentionImpl) oldElement).getDecompositions());
        	((IntentionImpl) newElement).getDecompositionsFrom().addAll(((IntentionImpl) oldElement).getDecompositionsFrom());
        	((IntentionImpl) newElement).getDecompositionsTo().addAll(((IntentionImpl) oldElement).getDecompositionsTo());
        	((IntentionImpl) newElement).getDependencyFrom().addAll(((IntentionImpl) oldElement).getDependencyFrom());
        	((IntentionImpl) newElement).getDependencyTo().addAll(((IntentionImpl) oldElement).getDependencyTo());
	        
	        // Put the newly created element in the request so that the
	        // 'after' commands have access to it.
	        getCreateRequest().setNewElement(newElement);
	        
			return (configureStatus == null) ? 
	        		CommandResult.newOKCommandResult(newElement) : 
	        		new CommandResult(configureStatus, newElement);
			
		}
	}

}
