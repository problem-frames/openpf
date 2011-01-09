package customsrc;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.ui.action.AbstractActionHandler;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramCommandStack;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;

import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
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

public class SetEvaluationLabelAction extends AbstractActionHandler {
	
	protected String ID = ""; //$NON-NLS-1$
	protected EvaluationLabel evalField = null;
	protected String evalLabel = "";

	protected SetEvaluationLabelAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage);
		// TODO Auto-generated constructor stub
	}
	
	public String getID() {
		return ID;
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
			final EObject object = ((IGraphicalEditPart)intentions[i]).getNotationView().getElement();
			Object intention = intentions[i];
			// determine what type of intention it is, then cast it appropriately 
			// and apply the appropriate label to it

			// GOALS
			
			if (intention instanceof GoalEditPart) {
				GoalEditPart part = (GoalEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Goal2EditPart) {
				Goal2EditPart part = (Goal2EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Goal3EditPart) {
				Goal3EditPart part = (Goal3EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Goal4EditPart) {
				Goal4EditPart part = (Goal4EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Goal5EditPart) {
				Goal5EditPart part = (Goal5EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} 
			
			
			
			// SOFTGOALS
			
			else if (intention instanceof SoftgoalEditPart) {
				SoftgoalEditPart part = (SoftgoalEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Softgoal2EditPart) {
				Softgoal2EditPart part = (Softgoal2EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Softgoal3EditPart) {
				Softgoal3EditPart part = (Softgoal3EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Softgoal4EditPart) {
				Softgoal4EditPart part = (Softgoal4EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Softgoal5EditPart) {
				Softgoal5EditPart part = (Softgoal5EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} 
			
			
			// TASKS
			
			else if (intention instanceof TaskEditPart) {
				TaskEditPart part = (TaskEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Task2EditPart) {
				Task2EditPart part = (Task2EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Task3EditPart) {
				Task3EditPart part = (Task3EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Task4EditPart) {
				Task4EditPart part = (Task4EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Task5EditPart) {
				Task5EditPart part = (Task5EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} 
			
			
			// RESOURCES
			
			else if (intention instanceof ResourceEditPart) {
				ResourceEditPart part = (ResourceEditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Resource2EditPart) {
				Resource2EditPart part = (Resource2EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Resource3EditPart) {
				Resource3EditPart part = (Resource3EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Resource4EditPart) {
				Resource4EditPart part = (Resource4EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} else if (intention instanceof Resource5EditPart) {
				Resource5EditPart part = (Resource5EditPart) selection.getFirstElement();
				IDiagramEditDomain partEditDomain = part.getDiagramEditDomain();
				DiagramCommandStack dcs = partEditDomain.getDiagramCommandStack();
				
				applyEvalLabel(selection, object, progressMonitor, dcs);
				
			} 
			
			
		}
	}
	
	public void applyEvalLabel(IStructuredSelection selection, final EObject object, IProgressMonitor progressMonitor, DiagramCommandStack dcs) {
		
		MyCommand applyLabel = new MyCommand(object) {

			@Override
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				if (object instanceof Intention) {
					((Intention) object).setQualitativeReasoningCombinedLabel(evalField);
				}
				return CommandResult.newOKCommandResult();
			}};
		
		ICommandProxy command = new ICommandProxy(applyLabel);
		dcs.execute(command, progressMonitor);
		

	}
	
	public void refresh() {
		// TODO Auto-generated method stub
		
	}
	
	

	
	private abstract class MyCommand extends AbstractTransactionalCommand {
		public MyCommand(EObject elt) {
			super((TransactionalEditingDomain) AdapterFactoryEditingDomain.
					getEditingDomainFor(elt),
					evalLabel,
					getWorkspaceFiles(elt));
		}
	}

}
