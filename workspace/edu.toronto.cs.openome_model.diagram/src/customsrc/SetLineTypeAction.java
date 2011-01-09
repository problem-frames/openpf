package customsrc;

import java.util.Iterator;
import java.util.Map;

import javax.swing.text.View;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EReferenceImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.actions.DiagramAction;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.LabelEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.commands.ToggleCanonicalModeCommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramGraphicalViewer;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.ViewActionBars;

import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Openome_modelPackage;
import edu.toronto.cs.openome_model.diagram.edit.commands.*;
import edu.toronto.cs.openome_model.diagram.edit.parts.ActorActorCompartmentEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AndContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.AndDecompositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.BreakContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.CoversAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.DependencyEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.GoalEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.HelpContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.HurtContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.INSAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsAAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.IsPartOfAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.MakeContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OccupiesAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.OrDecompositionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.PlaysAssociationEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.ResourceEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.Softgoal2EditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomeMinusContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionContributionTypeEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.SomePlusContributionEditPart;
import edu.toronto.cs.openome_model.diagram.edit.parts.UnknownContributionEditPart;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

import edu.toronto.cs.openome_model.impl.*;

public class SetLineTypeAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected String commandName = "";
	protected String changeTo = ""; // what we want to change into
	private String imageFile = "contribution.png";

	protected SetLineTypeAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
		// default line icon
		setImageDescriptor(Openome_modelDiagramEditorPlugin.getBundledImageDescriptor("../openome_model/icons/" + imageFile));
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
		
		Object[] connections = selection.toArray();
		int selectionSize = connections.length;
		
		for (int i = 0; i < selectionSize; i++) {
			Object connection = connections[i];
			final EObject object = ((IGraphicalEditPart)connections[i]).getNotationView().getElement();
			// determine what type of connection it is, then cast it appropriately 
			
			// DEPENDENCY and DECOMPOSITIONS
			
			if (connection instanceof DependencyEditPart) {				
				DependencyEditPart part = (DependencyEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((DependencyEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			} 
			else if (connection instanceof AndDecompositionEditPart) {				
				AndDecompositionEditPart part = (AndDecompositionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				//doTypeSwitch(part, object, progressMonitor, dcs);
				doTypeSwitch(part, object, progressMonitor, dcs);

			}
			else if (connection instanceof OrDecompositionEditPart) {				
				OrDecompositionEditPart part = (OrDecompositionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			
			// CONTRIBUTIONS
			else if (connection instanceof AndContributionEditPart) {
				AndContributionEditPart part = (AndContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((AndContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof BreakContributionEditPart) {				
				BreakContributionEditPart part = (BreakContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((BreakContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof HelpContributionEditPart) {				
				HelpContributionEditPart part = (HelpContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((HelpContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof HurtContributionEditPart) {				
				HurtContributionEditPart part = (HurtContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof MakeContributionEditPart) {				
				MakeContributionEditPart part = (MakeContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((MakeContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof OrContributionEditPart) {				
				OrContributionEditPart part = (OrContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((OrContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof SomePlusContributionEditPart) {				
				SomePlusContributionEditPart part = (SomePlusContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((SomePlusContributionEditPart) connection).straightenLine();				
						
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof SomeMinusContributionEditPart) {				
				SomeMinusContributionEditPart part = (SomeMinusContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((SomeMinusContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof UnknownContributionEditPart) {				
				UnknownContributionEditPart part = (UnknownContributionEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((UnknownContributionEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			
			// ASSOCIATIONS
			else if (connection instanceof CoversAssociationEditPart) {				
				CoversAssociationEditPart part = (CoversAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((CoversAssociationEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof INSAssociationEditPart) {				
				INSAssociationEditPart part = (INSAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((INSAssociationEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof IsAAssociationEditPart) {				
				IsAAssociationEditPart part = (IsAAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((IsAAssociationEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof IsPartOfAssociationEditPart) {				
				IsPartOfAssociationEditPart part = (IsPartOfAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof OccupiesAssociationEditPart) {				
				OccupiesAssociationEditPart part = (OccupiesAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((OccupiesAssociationEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			else if (connection instanceof PlaysAssociationEditPart) {				
				PlaysAssociationEditPart part = (PlaysAssociationEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				// Straighten line so changing to Decomposition does not crash
				((PlaysAssociationEditPart) connection).straightenLine();
				
				doTypeSwitch(part, object, progressMonitor, dcs);
			}
			
		}
	}
		
	@SuppressWarnings("restriction")
	public void doTypeSwitch(final ConnectionNodeEditPart oldPart, final EObject object, IProgressMonitor progressMonitor, DiagramCommandStack dcs){
		// command to create the new element
		EObject source = null;
		EObject target = null;
		if (object instanceof DecompositionImpl){
			source = ((DecompositionImpl) object).getSource();
			target = ((DecompositionImpl) object).getTarget();
		}
		else if (object instanceof ContributionImpl){
			source = ((ContributionImpl) object).getSource();
			target = ((ContributionImpl) object).getTarget();
		}
		else if (object instanceof AssociationImpl){
			source = ((AssociationImpl) object).getSource();
			target = ((AssociationImpl) object).getTarget();
		}
		else if (object instanceof DependencyImpl){
			// the order is inverted because of the definition of a Dependency relation
			target = ((DependencyImpl) object).getDependencyFrom();
			source = ((DependencyImpl) object).getDependencyTo();
		}
		
		EditElementCommand createNew = selectCreateCommand(oldPart, source, target);
		ICommandProxy createNewCommand = new ICommandProxy(createNew);
		
		
		// command to destroy the old element
		DestroyElementRequest destroyReq = new DestroyElementRequest(null, object, false);
		DestroyElementCommand destroy = new DestroyElementCommand(destroyReq);
		ICommandProxy destroyOld = new ICommandProxy(destroy);
		//command to delete the old element's view
		DeleteCommand delete = new DeleteCommand(oldPart.getNotationView());
		ICommandProxy deleteOld = new ICommandProxy(delete);
		
		// Execute all the commands, so create new and destroy old element
		dcs.execute(deleteOld.chain(destroyOld), progressMonitor);
		dcs.execute(createNewCommand, progressMonitor);
	}
	
	/**
	 * Returns the correct subclass of CreateElementCommand
	 * @param oldPart
	 * @param source
	 * @param target
	 * @return
	 */
	private EditElementCommand selectCreateCommand(ConnectionNodeEditPart oldPart, EObject source, EObject target){
		if (changeTo.equals("And")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.AndDecomposition_3002);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new AndDecompositionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Or")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.OrDecomposition_3003);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new OrDecompositionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Dependency")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.Dependency_3001);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new DependencyCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Make")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.MakeContribution_3006);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new MakeContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Some+")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.SomePlusContribution_3008);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new SomePlusContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Help")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.HelpContribution_3004);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new HelpContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Unknown")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.UnknownContribution_3010);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new UnknownContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Hurt")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.HurtContribution_3005);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new HurtContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Some-")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.SomeMinusContribution_3009);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new SomeMinusContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Break")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.BreakContribution_3007);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new BreakContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("AND")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.AndContribution_3011);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new AndContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("OR")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.OrContribution_3012);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new OrContributionCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("ISA")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.IsAAssociation_3013);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new IsAAssociationCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Covers")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.CoversAssociation_3014);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new CoversAssociationCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Is part of")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.IsPartOfAssociation_3016);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new IsPartOfAssociationCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Occupies")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.OccupiesAssociation_3015);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new OccupiesAssociationCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("Plays")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.PlaysAssociation_3017);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new PlaysAssociationCreateCommand(createReq, source, target);	
		}
		else if (changeTo.equals("INS")){
			CreateRelationshipRequest createReq = new CreateRelationshipRequest(source, target, Openome_modelElementTypes.INSAssociation_3018);
			createReq.setEditingDomain(oldPart.getEditingDomain());
			return new INSAssociationCreateCommand(createReq, source, target);	
		}
		else{
			return null;
		}
	}

	
	private abstract class MyCommand extends AbstractTransactionalCommand {
		public MyCommand(EObject elt) {
			super((TransactionalEditingDomain) AdapterFactoryEditingDomain.
					getEditingDomainFor(elt),
					commandName,
					getWorkspaceFiles(elt));
		}
	}

	public void refresh() {
		
		
	}

}
