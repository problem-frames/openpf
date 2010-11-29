package uk.ac.open.problem.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import uk.ac.open.problem.diagram.edit.commands.Node2CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node3CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node4CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node5CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node6CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node7CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Node8CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.NodeCreateCommand;
import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class ProblemDiagramItemSemanticEditPolicy extends
		ProblemBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProblemDiagramItemSemanticEditPolicy() {
		super(ProblemElementTypes.ProblemDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ProblemElementTypes.Node_2001 == req.getElementType()) {
			return getGEFWrapper(new NodeCreateCommand(req));
		}
		if (ProblemElementTypes.Node_2002 == req.getElementType()) {
			return getGEFWrapper(new Node2CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2003 == req.getElementType()) {
			return getGEFWrapper(new Node3CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2004 == req.getElementType()) {
			return getGEFWrapper(new Node4CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2005 == req.getElementType()) {
			return getGEFWrapper(new Node5CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2006 == req.getElementType()) {
			return getGEFWrapper(new Node6CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2007 == req.getElementType()) {
			return getGEFWrapper(new Node7CreateCommand(req));
		}
		if (ProblemElementTypes.Node_2008 == req.getElementType()) {
			return getGEFWrapper(new Node8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
