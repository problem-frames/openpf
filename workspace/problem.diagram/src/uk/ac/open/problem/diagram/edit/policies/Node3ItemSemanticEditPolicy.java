package uk.ac.open.problem.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.diagram.edit.commands.Link2CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Link2ReorientCommand;
import uk.ac.open.problem.diagram.edit.commands.Link3CreateCommand;
import uk.ac.open.problem.diagram.edit.commands.Link3ReorientCommand;
import uk.ac.open.problem.diagram.edit.commands.LinkCreateCommand;
import uk.ac.open.problem.diagram.edit.commands.LinkReorientCommand;
import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry;
import uk.ac.open.problem.diagram.providers.ProblemElementTypes;

/**
 * @generated
 */
public class Node3ItemSemanticEditPolicy extends
		ProblemBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Node3ItemSemanticEditPolicy() {
		super(ProblemElementTypes.Node_2003);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ProblemVisualIDRegistry.getVisualID(incomingLink) == LinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProblemVisualIDRegistry.getVisualID(incomingLink) == Link2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ProblemVisualIDRegistry.getVisualID(incomingLink) == Link3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ProblemVisualIDRegistry.getVisualID(outgoingLink) == LinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProblemVisualIDRegistry.getVisualID(outgoingLink) == Link2EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ProblemVisualIDRegistry.getVisualID(outgoingLink) == Link3EditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ProblemElementTypes.Link_4001 == req.getElementType()) {
			return getGEFWrapper(new LinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProblemElementTypes.Link_4002 == req.getElementType()) {
			return getGEFWrapper(new Link2CreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProblemElementTypes.Link_4003 == req.getElementType()) {
			return getGEFWrapper(new Link3CreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ProblemElementTypes.Link_4001 == req.getElementType()) {
			return getGEFWrapper(new LinkCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProblemElementTypes.Link_4002 == req.getElementType()) {
			return getGEFWrapper(new Link2CreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ProblemElementTypes.Link_4003 == req.getElementType()) {
			return getGEFWrapper(new Link3CreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case LinkEditPart.VISUAL_ID:
			return getGEFWrapper(new LinkReorientCommand(req));
		case Link2EditPart.VISUAL_ID:
			return getGEFWrapper(new Link2ReorientCommand(req));
		case Link3EditPart.VISUAL_ID:
			return getGEFWrapper(new Link3ReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
