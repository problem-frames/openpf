package edu.toronto.cs.openome_model.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CopyToClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.GroupRequest;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.ui.action.global.GlobalActionId;
import org.eclipse.gmf.runtime.common.ui.services.action.global.IGlobalActionContext;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.render.clipboard.AWTClipboardHelper;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.commands.CopyImageCommand;
import org.eclipse.gmf.runtime.diagram.ui.render.internal.providers.ImageSupportGlobalActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.requests.PasteViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.ui.properties.actions.PropertyPageViewAction;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPart;

import edu.toronto.cs.openome_model.Association;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.Decomposition;
import edu.toronto.cs.openome_model.Dependable;
import edu.toronto.cs.openome_model.Dependency;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.edit.commands.GoalCreateCommand;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentAgentCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AgentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ModelEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PositionPositionCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.RoleRoleCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;
import edu.toronto.cs.openome_model.impl.ActorImpl;
import edu.toronto.cs.openome_model.impl.AgentImpl;
import edu.toronto.cs.openome_model.impl.AndContributionImpl;
import edu.toronto.cs.openome_model.impl.AndDecompositionImpl;
import edu.toronto.cs.openome_model.impl.AssociationImpl;
import edu.toronto.cs.openome_model.impl.BreakContributionImpl;
import edu.toronto.cs.openome_model.impl.ContainerImpl;
import edu.toronto.cs.openome_model.impl.ContributionImpl;
import edu.toronto.cs.openome_model.impl.CoversAssociationImpl;
import edu.toronto.cs.openome_model.impl.DecompositionImpl;
import edu.toronto.cs.openome_model.impl.DependencyImpl;
import edu.toronto.cs.openome_model.impl.GoalImpl;
import edu.toronto.cs.openome_model.impl.HelpContributionImpl;
import edu.toronto.cs.openome_model.impl.HurtContributionImpl;
import edu.toronto.cs.openome_model.impl.INSAssociationImpl;
import edu.toronto.cs.openome_model.impl.IntentionImpl;
import edu.toronto.cs.openome_model.impl.IsAAssociationImpl;
import edu.toronto.cs.openome_model.impl.IsPartOfAssociationImpl;
import edu.toronto.cs.openome_model.impl.LinkImpl;
import edu.toronto.cs.openome_model.impl.MakeContributionImpl;
import edu.toronto.cs.openome_model.impl.ModelImpl;
import edu.toronto.cs.openome_model.impl.OccupiesAssociationImpl;
import edu.toronto.cs.openome_model.impl.OrContributionImpl;
import edu.toronto.cs.openome_model.impl.OrDecompositionImpl;
import edu.toronto.cs.openome_model.impl.PlaysAssociationImpl;
import edu.toronto.cs.openome_model.impl.PositionImpl;
import edu.toronto.cs.openome_model.impl.ResourceImpl;
import edu.toronto.cs.openome_model.impl.RoleImpl;
import edu.toronto.cs.openome_model.impl.SoftgoalImpl;
import edu.toronto.cs.openome_model.impl.SomeMinusContributionImpl;
import edu.toronto.cs.openome_model.impl.SomePlusContributionImpl;
import edu.toronto.cs.openome_model.impl.TaskImpl;
import edu.toronto.cs.openome_model.impl.UnknownContributionImpl;

public class Openome_modelImageSupportGlobalActionHandler extends ImageSupportGlobalActionHandler {
	
	protected static List<EditPart> editPartClipboard = new ArrayList<EditPart>();
	protected static List<EObject> cutClipboard = new ArrayList<EObject>();
	
	private boolean cutDeleted = true;
	
	/**
	 * Maps original elements to duplicated element
	 * for use in cross-diagram paste only
	 */
	protected static HashMap<EObject, EObject> map = new HashMap<EObject, EObject>(); 
	
	/**
	 * Constructor
	 */
	public Openome_modelImageSupportGlobalActionHandler(){
		super();
	}
	
	/**
	 * Modified version of canCopy that allows copying of an Actor
	 */
	protected boolean canCopy(IGlobalActionContext cntxt){	
		// allows copying of a compartment
		for(Object o : ((IStructuredSelection) cntxt.getSelection()).toArray()){
			if (o instanceof ShapeCompartmentEditPart){
				return true;
			}
		}	
		return super.canCopy(cntxt);	
	}
	
	protected ICommand getCopyCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart, final boolean isUndoable){
		return super.getCopyCommand(cntxt, diagramPart, isUndoable);
	}
	
	/**
	 * Provides the commmand
	 * We shall modify it a bit to modify behaviour of paste
	 */
	public ICommand getCommand(IGlobalActionContext cntxt) {
		/* Check if the active part is a IDiagramWorkbenchPart */
		IWorkbenchPart part = cntxt.getActivePart();
		if (!(part instanceof IDiagramWorkbenchPart)) {
			return null;
		}

		/* Get the model operation context */
		IDiagramWorkbenchPart diagramPart = (IDiagramWorkbenchPart) part;

		/* Create a command */
		ICommand command = null;

		/* Check the action id */
		String actionId = cntxt.getActionId();
		if (actionId.equals(GlobalActionId.DELETE)) {
			//visibility problem
			super.getCommand(cntxt);
			
		} else if (actionId.equals(GlobalActionId.COPY)) {
			command = getCopyCommand(cntxt, diagramPart, false);
			
			//Fill our own clipboard
			editPartClipboard.clear();
			cutClipboard.clear();
			/* Get the selected edit parts */
			Object[] objects = ((IStructuredSelection) cntxt.getSelection())
				.toArray();
			
			for (Object o : objects){
				editPartClipboard.add((EditPart) o);
			}
			
		} else if (actionId.equals(GlobalActionId.CUT)) {
			command = getCutCommand(cntxt, diagramPart);
			
			// need to keep track of copies correspondence
			HashMap<EObject, EObject> m = new HashMap<EObject, EObject>(); 
			
			//Fill our own clipboard
			editPartClipboard.clear();
			cutClipboard.clear();
			/* Get the selected edit parts */
			Object[] objects2 = ((IStructuredSelection) cntxt.getSelection())
				.toArray();
			
			for (Object ep : objects2){
				editPartClipboard.add((EditPart) ep);
				final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();
				cutClipboard.add(o);
				m.put(o, cutClipboard.get(cutClipboard.indexOf(o)));
			}
			cutDeleted = false;
	
		}else if (actionId.equals(GlobalActionId.OPEN)) {
			// Open command: use the previously cached command.
			// visibility problem
			super.getCommand(cntxt);
		} else if (actionId.equals(GlobalActionId.PASTE)) {

			PasteViewRequest pasteReq = createPasteViewRequest();

			/* Get the selected edit parts */
			Object[] objects = ((IStructuredSelection) cntxt.getSelection())
				.toArray();
			
			if (objects.length == 1) {
				
				Command paste;
				
				/* Send the request to the currently selected part, however if the selection is a container
				 * then we must redirect the request to its compartment
				 * 
				 *  This enables us to just select a container and click paste on it
				 */
				EditPart ep = (EditPart) objects[0];
				if ( objects[0] instanceof ActorEditPart){
					ep = ((ActorEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(ActorActorCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof AgentEditPart){
					ep = ((AgentEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(AgentAgentCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof RoleEditPart){
					ep = ((RoleEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(RoleRoleCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else if ( objects[0] instanceof PositionEditPart){
					ep = ((PositionEditPart) objects[0]).getChildBySemanticHint(Integer
							.toString(PositionPositionCompartmentEditPart.VISUAL_ID));
					paste = ep.getCommand(pasteReq);
				} else{
					paste = ((EditPart) objects[0]).getCommand(pasteReq);
				}
				
				if (paste != null) {
					/* Set the command */
					CommandStack cs = diagramPart.getDiagramEditDomain()
						.getDiagramCommandStack();
					
					TransactionalEditingDomain copyFromDomain = ((IGraphicalEditPart)editPartClipboard.get(0)).getEditingDomain();
					TransactionalEditingDomain pasteToDomain = ((IGraphicalEditPart) ep).getEditingDomain();
						
					// So since we cannot duplicate, we should add to the destination diagram
					EObject container = ((IGraphicalEditPart) ep).getNotationView().getElement();
					List<CreateElementCommand> commandList = getCreateCommandList(pasteToDomain, container);
						
					map.clear();
						
					// "Duplicate" all the selected elements
					for (CreateElementCommand c : commandList){
						ICommandProxy create = new ICommandProxy(c);
						cs.execute(create);
						map.put(((CreateDuplicateElementCommand) c).getOriginal(), 
									((CreateDuplicateElementCommand) c).getDuplicate()); 
						}
					
					// Now delete the invisible elements that had been cut
					if (!cutClipboard.isEmpty() && !cutDeleted){
						CompositeTransactionalCommand delete = new CompositeTransactionalCommand(copyFromDomain, cntxt
					            .getLabel());
						for (EditPart editPart : editPartClipboard){
							/* Create the delete request */
							GroupRequest deleteReq = new GroupRequest(
								RequestConstants.REQ_DELETE);

							/* Send the request to the edit part */
							Command deleteCommand = editPart.getCommand(deleteReq);

							/* Add to the compound command */
							if (deleteCommand != null) {
								delete.compose(new CommandProxy(deleteCommand));
							}
						}
						
						// Now we repoint the paste source to the elements we just pasted
						cutClipboard.clear();
						for(EObject e :map.keySet()){
							cutClipboard.add(map.get(e));
						}
						cutDeleted = true;
						return delete;
					}

					//Adds to the diagram
					//cs.execute(paste); // we don't want to have double paste
					diagramPart.getDiagramEditPart().getFigure().invalidate();
					diagramPart.getDiagramEditPart().getFigure().validate();
					selectAddedObject(diagramPart.getDiagramGraphicalViewer(),
						DiagramCommandStack.getReturnValues(paste));
					return null;
				}
			}
		} else if (actionId.equals(GlobalActionId.SAVE)) {
			part.getSite().getPage().saveEditor((IEditorPart) diagramPart,
				false);
		} else if (actionId.equals(GlobalActionId.PROPERTIES)) {
			new PropertyPageViewAction().run();
		} else {
			System.out.println("actionID is : " + actionId);
		}

		return command;
	}
	
	/**
	 * Returns a list of CreateElementCommand that can create every element in the clipboard
	 * @param domain
	 * @param container
	 * @return
	 */
	private List<CreateElementCommand> getCreateCommandList(TransactionalEditingDomain domain, EObject container) {
		List<CreateElementCommand> commandList = new ArrayList<CreateElementCommand>();
		CreateElementCommand c;
		
		List<EObject> tmp = new ArrayList<EObject>();
		List<EObject> tmp2 = new ArrayList<EObject>();
		
		// First get all the actors and intentions
		if (!cutClipboard.isEmpty()){
			for (EObject o : cutClipboard){
				if (o instanceof LinkImpl){
					continue;
				}
				tmp.add(o);
				tmp2.add(o);
			}
		} else{
			for (EditPart ep: editPartClipboard){
				final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();
				if (o instanceof LinkImpl){
					continue;
				}
				tmp.add(o);
				tmp2.add(o);
			}
		}
		
		//then delete all doubled intentions
		for (EObject o : tmp){
			if (o instanceof Intention){
				if (tmp2.contains(o.eContainer())){
					tmp2.remove(o);
				}
			}
		}
		
		// Now create the series of commands
		for (EObject o : tmp2){
			c = getCreateCommand(domain, o, container);
			if (c != null)
				commandList.add(c);
		}
		
		List<EObject> done = new ArrayList<EObject>();

		// then append the commands to create links
		// this is because it does not make sense to create links without the sources and targets
		
		if (!cutClipboard.isEmpty()){
			for (EObject o : cutClipboard){
				if (o instanceof LinkImpl && !done.contains(o)){
					c = getCreateLinkCommand(domain, o, container);
					if (c != null)
						commandList.add(c);
						done.add(o);
				}
			}
		} else {
			for (EditPart ep: editPartClipboard){
				final EObject o = ((IGraphicalEditPart) ep).getNotationView().getElement();

				if (o instanceof LinkImpl && !done.contains(o)){
					c = getCreateLinkCommand(domain, o, container);
					if (c != null)
						commandList.add(c);
						done.add(o);
				}
			}
		}
		
		return commandList;
		
	}

	private static CreateElementCommand getCreateLinkCommand(TransactionalEditingDomain domain, EObject o, EObject container) {
		CreateElementRequest req = null;
		if (o instanceof AndDecompositionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.AndDecomposition_3002);
		}
		else if (o instanceof OrDecompositionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.OrDecomposition_3003);
		}
		else if (o instanceof DependencyImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Dependency_3001);
		}
		else if (o instanceof MakeContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.MakeContribution_3006);
		}
		else if (o instanceof SomePlusContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.SomePlusContribution_3008);
		}
		else if (o instanceof HelpContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.HelpContribution_3004);
		}
		else if (o instanceof UnknownContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.UnknownContribution_3010);
		}
		else if (o instanceof HurtContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.HurtContribution_3005);
		}
		else if (o instanceof SomeMinusContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.SomeMinusContribution_3009);
		}
		else if (o instanceof BreakContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.BreakContribution_3007);
		}
		else if (o instanceof AndContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.AndContribution_3011);
		}
		else if (o instanceof OrContributionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.OrContribution_3012);
		}
		else if (o instanceof CoversAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.CoversAssociation_3014);
		}
		else if (o instanceof INSAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.INSAssociation_3018);
		}
		else if (o instanceof IsAAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.IsAAssociation_3013);
		}
		else if (o instanceof IsPartOfAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.IsPartOfAssociation_3016);
		}
		else if (o instanceof PlaysAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.PlaysAssociation_3017);
		}
		else if (o instanceof OccupiesAssociationImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.OccupiesAssociation_3015);
		}
		else {
			return null;
		}
		
		return new CreateDuplicateElementCommand(req, o);
		
	}

	private static CreateElementCommand getCreateCommand(TransactionalEditingDomain domain, EObject o, EObject container) {
		CreateElementRequest req = null;
		if (o instanceof GoalImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Goal_2001);
		}
		else if (o instanceof TaskImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Task_1007);
		}
		else if (o instanceof SoftgoalImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Softgoal_1006);
		} 
		else if (o instanceof ResourceImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Resource_1008);
		}
		else if (o instanceof ActorImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Actor_1001);
		}
		else if (o instanceof AgentImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Agent_1002);
		}
		else if (o instanceof RoleImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Role_1004);
		}
		else if (o instanceof PositionImpl){
			req = new CreateElementRequest(domain, container, Openome_modelElementTypes.Position_1003);
		}
		else {
			return null;
		}
		
		return new CreateDuplicateElementCommand(req, o);
	}
	
	/**
	 * A Command to add a model element to a diagram, based on an existing element
	 * @author johan
	 */
	private static class CreateDuplicateElementCommand extends CreateElementCommand{
		
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

		public CreateDuplicateElementCommand(CreateElementRequest request, EObject original) {
			super(request);
			elementType = request.getElementType();
			oldElement = original;
		}
		
		public EObject getOriginal(){
			return oldElement;
		}
		
		public EObject getDuplicate(){
			return getCreateRequest().getNewElement();
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
	        if (newElement instanceof IntentionImpl){
	        	((IntentionImpl) newElement).setName(((IntentionImpl) oldElement).getName());
	        	((IntentionImpl) newElement).setQualitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQualitativeReasoningCombinedLabel());
	        	((IntentionImpl) newElement).setQualitativeReasoningDenialLabel(((IntentionImpl) oldElement).getQualitativeReasoningDenialLabel());
	        	((IntentionImpl) newElement).setQualitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQualitativeReasoningSatisfiedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningCombinedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningCombinedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningDeniedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningDeniedLabel());
	        	((IntentionImpl) newElement).setQuantitativeReasoningSatisfiedLabel(((IntentionImpl) oldElement).getQuantitativeReasoningSatisfiedLabel());
	        } 
	        else if (newElement instanceof ContainerImpl){
	        	((ContainerImpl) newElement).setName( ((ContainerImpl)oldElement).getName());
	        	
	        	/*THIS COPIES THE CONTENT OF THE ACTOR AS WELL*/
	        	//Create the intentions within this actor
				for(Intention intention : ((ContainerImpl)oldElement).getIntentions()){
					CreateDuplicateElementCommand createChild = (CreateDuplicateElementCommand) getCreateCommand(getCreateRequest().getEditingDomain(), intention, newElement);
					createChild.execute(monitor, info);
					map.put(createChild.getOriginal(), createChild.getDuplicate());
					}
				
				for(Intention intention : ((ContainerImpl)oldElement).getIntentions()){
					
					//Create the links within the actor
					for(Contribution contribution : intention.getContributesTo()){
						CreateElementCommand createContribution = getCreateLinkCommand(getCreateRequest().getEditingDomain(), contribution, newElement.eContainer());
						createContribution.execute(monitor, info);
					}
					for(Decomposition decomposition : intention.getDecompositionsTo()){
						CreateElementCommand createDecomposition= getCreateLinkCommand(getCreateRequest().getEditingDomain(), decomposition, newElement.eContainer());
						createDecomposition.execute(monitor, info);
					}
					for(Dependency dependency : intention.getDependencyFrom()){
						CreateElementCommand createDependency= getCreateLinkCommand(getCreateRequest().getEditingDomain(), dependency, newElement.eContainer());
						createDependency.execute(monitor, info);
					}
				}
				
	        }
	        else if(newElement instanceof LinkImpl){
	        	
	        	EObject source = null;
	        	EObject target = null;
	        	
	        	if (oldElement instanceof DecompositionImpl){
					source = ((DecompositionImpl) oldElement).getSource();
					target = ((DecompositionImpl) oldElement).getTarget();
				}
				else if (oldElement instanceof ContributionImpl){
					source = ((ContributionImpl) oldElement).getSource();
					target = ((ContributionImpl) oldElement).getTarget();
				}
				else if (oldElement instanceof AssociationImpl){
					source = ((AssociationImpl) oldElement).getSource();
					target = ((AssociationImpl) oldElement).getTarget();
				}
				else if (oldElement instanceof DependencyImpl){
					// the order is inverted because of the definition of a Dependency relation
					target = ((DependencyImpl) oldElement).getDependencyFrom();
					source = ((DependencyImpl) oldElement).getDependencyTo();
				}
	        	
	        	// Get the source and target in the destination diagram
	        	// preconditions: the duplicated source and target already exists in the destination diagram
	        	source = map.get(source);
	        	target = map.get(target);
	        	
	        	if (newElement instanceof DecompositionImpl){
					((DecompositionImpl) newElement).setSource((Intention)source);
					((DecompositionImpl) newElement).setTarget((Intention)target);
				} 
				else if (newElement instanceof ContributionImpl){
					((ContributionImpl) newElement).setSource((Intention) source);
					((ContributionImpl) newElement).setTarget((Intention) target);
				}
				else if (newElement instanceof AssociationImpl){
					((AssociationImpl) newElement).setSource((Container) source);
					((AssociationImpl) newElement).setTarget((Container) target);
				}
				else if (newElement instanceof DependencyImpl){
					((DependencyImpl) newElement).setDependencyFrom((Dependable) target);
					((DependencyImpl) newElement).setDependencyTo((Dependable) source);
				}
	        }

	        // Put the newly created element in the request so that the
	        // 'after' commands have access to it.
	        getCreateRequest().setNewElement(newElement);

	        return (configureStatus == null) ? 
	        		CommandResult.newOKCommandResult(newElement) : 
	        		new CommandResult(configureStatus, newElement);
		}
		
	}
	
	protected ICommand getCutCommand(IGlobalActionContext cntxt,
			IDiagramWorkbenchPart diagramPart) {
		
		TransactionalEditingDomain editingDomain = getEditingDomain(diagramPart);
		
        if (editingDomain == null) {
            return null;
        }
        
        CompositeTransactionalCommand cut = new CompositeTransactionalCommand(editingDomain, cntxt
            .getLabel());

		// Add a copy command - the cut must be undoable/redoable
		cut.compose(getCopyCommand(cntxt, diagramPart, true));

		/* Get the selected edit parts */
		Object[] objects = ((IStructuredSelection) cntxt.getSelection())
			.toArray();
		for (int i = 0; i < objects.length; i++) {
			/* Get the next part */
			EditPart editPart = (EditPart) objects[i];
			
			//make myself invisible and unselectable
			((IGraphicalEditPart) editPart).getFigure().setVisible(false);
			
			//make all incoming and outgoing links invisible as well
			for (Object e : ((IGraphicalEditPart) editPart).getSourceConnections()){
				((ConnectionNodeEditPart) e).getFigure().setVisible(false);
			}
			for (Object e : ((IGraphicalEditPart) editPart).getTargetConnections()){
				((ConnectionNodeEditPart) e).getFigure().setVisible(false);
			}
			
			if (editPart instanceof ShapeCompartmentEditPart){
				
			}
		}
        
		if (cut.canExecute()){
			return cut;
		}

		return null;
	}
	
    private TransactionalEditingDomain getEditingDomain(
            IDiagramWorkbenchPart part) {

        TransactionalEditingDomain result = null;

        IEditingDomainProvider provider = (IEditingDomainProvider) part
            .getAdapter(IEditingDomainProvider.class);

        if (provider != null) {
            EditingDomain domain = provider.getEditingDomain();

            if (domain != null && domain instanceof TransactionalEditingDomain) {
                result = (TransactionalEditingDomain) domain;
}        }

        return result;
    }
    
	protected boolean canCut(IGlobalActionContext cntxt) {
//		String actionId = cntxt.getActionId();
//		if (actionId.equals(GlobalActionId.CUT)) {
//			ICommand command = getCommand(cntxt);
//			if (command != null && command.canExecute()) {
//				return canCopy(cntxt);
//			}
//		}
//		return false;
		return true;
	}
	
}