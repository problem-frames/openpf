package uk.ac.open.dependency.dependency.diagram.edit.policies;

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

import uk.ac.open.dependency.dependency.diagram.edit.commands.CouplingCreateCommand;
import uk.ac.open.dependency.dependency.diagram.edit.commands.CouplingReorientCommand;
import uk.ac.open.dependency.dependency.diagram.edit.commands.PrecedenceCreateCommand;
import uk.ac.open.dependency.dependency.diagram.edit.commands.PrecedenceReorientCommand;
import uk.ac.open.dependency.dependency.diagram.edit.parts.CouplingEditPart;
import uk.ac.open.dependency.dependency.diagram.edit.parts.PrecedenceEditPart;
import uk.ac.open.dependency.dependency.diagram.part.DependencyVisualIDRegistry;
import uk.ac.open.dependency.dependency.diagram.providers.DependencyElementTypes;

/**
 * @generated
 */
public class NodeItemSemanticEditPolicy extends
		DependencyBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public NodeItemSemanticEditPolicy() {
		super(DependencyElementTypes.Node_2001);
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
			if (DependencyVisualIDRegistry.getVisualID(incomingLink) == CouplingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (DependencyVisualIDRegistry.getVisualID(incomingLink) == PrecedenceEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (DependencyVisualIDRegistry.getVisualID(outgoingLink) == CouplingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (DependencyVisualIDRegistry.getVisualID(outgoingLink) == PrecedenceEditPart.VISUAL_ID) {
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
		if (DependencyElementTypes.Coupling_4001 == req.getElementType()) {
			return getGEFWrapper(new CouplingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DependencyElementTypes.Precedence_4002 == req.getElementType()) {
			return getGEFWrapper(new PrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (DependencyElementTypes.Coupling_4001 == req.getElementType()) {
			return getGEFWrapper(new CouplingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (DependencyElementTypes.Precedence_4002 == req.getElementType()) {
			return getGEFWrapper(new PrecedenceCreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case CouplingEditPart.VISUAL_ID:
			return getGEFWrapper(new CouplingReorientCommand(req));
		case PrecedenceEditPart.VISUAL_ID:
			return getGEFWrapper(new PrecedenceReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
