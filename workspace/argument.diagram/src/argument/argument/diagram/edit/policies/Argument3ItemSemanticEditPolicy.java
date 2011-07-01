/*
 * 
 */
package argument.argument.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import argument.argument.diagram.edit.commands.ArgumentOriginCreateCommand;
import argument.argument.diagram.edit.commands.ArgumentOriginReorientCommand;
import argument.argument.diagram.edit.commands.MitigatesCreateCommand;
import argument.argument.diagram.edit.commands.MitigatesRebuttalCreateCommand;
import argument.argument.diagram.edit.commands.MitigatesRebuttalReorientCommand;
import argument.argument.diagram.edit.commands.MitigatesReorientCommand;
import argument.argument.diagram.edit.commands.RebutsCreateCommand;
import argument.argument.diagram.edit.commands.RebutsOriginCreateCommand;
import argument.argument.diagram.edit.commands.RebutsOriginReorientCommand;
import argument.argument.diagram.edit.commands.RebutsReorientCommand;
import argument.argument.diagram.edit.parts.Argument2EditPart;
import argument.argument.diagram.edit.parts.Argument3EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentGroundsCompartment3EditPart;
import argument.argument.diagram.edit.parts.ArgumentArgumentWarrantsCompartment3EditPart;
import argument.argument.diagram.edit.parts.ArgumentOriginEditPart;
import argument.argument.diagram.edit.parts.MitigatesEditPart;
import argument.argument.diagram.edit.parts.MitigatesRebuttalEditPart;
import argument.argument.diagram.edit.parts.RebutsEditPart;
import argument.argument.diagram.edit.parts.RebutsOriginEditPart;
import argument.argument.diagram.part.ArgumentVisualIDRegistry;
import argument.argument.diagram.providers.ArgumentElementTypes;

/**
 * @generated
 */
public class Argument3ItemSemanticEditPolicy extends
		ArgumentBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public Argument3ItemSemanticEditPolicy() {
		super(ArgumentElementTypes.Argument_3002);
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
			if (ArgumentVisualIDRegistry.getVisualID(incomingLink) == RebutsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(incomingLink) == MitigatesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(incomingLink) == RebutsOriginEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(incomingLink) == MitigatesRebuttalEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(incomingLink) == ArgumentOriginEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ArgumentVisualIDRegistry.getVisualID(outgoingLink) == RebutsEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(outgoingLink) == MitigatesEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ArgumentVisualIDRegistry.getVisualID(outgoingLink) == ArgumentOriginEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (ArgumentVisualIDRegistry.getVisualID(node)) {
			case ArgumentArgumentGroundsCompartment3EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ArgumentVisualIDRegistry.getVisualID(cnode)) {
					case Argument2EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == RebutsEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == MitigatesEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == RebutsOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == MitigatesRebuttalEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == ArgumentOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == RebutsEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == MitigatesEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == ArgumentOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case ArgumentArgumentWarrantsCompartment3EditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (ArgumentVisualIDRegistry.getVisualID(cnode)) {
					case Argument3EditPart.VISUAL_ID:
						for (Iterator<?> it = cnode.getTargetEdges().iterator(); it
								.hasNext();) {
							Edge incomingLink = (Edge) it.next();
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == RebutsEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == MitigatesEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										incomingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == RebutsOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == MitigatesRebuttalEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(incomingLink) == ArgumentOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										incomingLink.getSource().getElement(),
										null, incomingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										incomingLink));
								continue;
							}
						}
						for (Iterator<?> it = cnode.getSourceEdges().iterator(); it
								.hasNext();) {
							Edge outgoingLink = (Edge) it.next();
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == RebutsEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == MitigatesEditPart.VISUAL_ID) {
								DestroyElementRequest r = new DestroyElementRequest(
										outgoingLink.getElement(), false);
								cmd.add(new DestroyElementCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
							if (ArgumentVisualIDRegistry
									.getVisualID(outgoingLink) == ArgumentOriginEditPart.VISUAL_ID) {
								DestroyReferenceRequest r = new DestroyReferenceRequest(
										outgoingLink.getSource().getElement(),
										null, outgoingLink.getTarget()
												.getElement(), false);
								cmd.add(new DestroyReferenceCommand(r));
								cmd.add(new DeleteCommand(getEditingDomain(),
										outgoingLink));
								continue;
							}
						}
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(),
										cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
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
		if (ArgumentElementTypes.Rebuts_4001 == req.getElementType()) {
			return getGEFWrapper(new RebutsCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ArgumentElementTypes.Mitigates_4002 == req.getElementType()) {
			return getGEFWrapper(new MitigatesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ArgumentElementTypes.RebutsOrigin_4003 == req.getElementType()) {
			return null;
		}
		if (ArgumentElementTypes.MitigatesRebuttal_4004 == req.getElementType()) {
			return null;
		}
		if (ArgumentElementTypes.ArgumentOrigin_4005 == req.getElementType()) {
			return getGEFWrapper(new ArgumentOriginCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ArgumentElementTypes.Rebuts_4001 == req.getElementType()) {
			return getGEFWrapper(new RebutsCreateCommand(req, req.getSource(),
					req.getTarget()));
		}
		if (ArgumentElementTypes.Mitigates_4002 == req.getElementType()) {
			return getGEFWrapper(new MitigatesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ArgumentElementTypes.RebutsOrigin_4003 == req.getElementType()) {
			return getGEFWrapper(new RebutsOriginCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ArgumentElementTypes.MitigatesRebuttal_4004 == req.getElementType()) {
			return getGEFWrapper(new MitigatesRebuttalCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ArgumentElementTypes.ArgumentOrigin_4005 == req.getElementType()) {
			return getGEFWrapper(new ArgumentOriginCreateCommand(req,
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
		case RebutsEditPart.VISUAL_ID:
			return getGEFWrapper(new RebutsReorientCommand(req));
		case MitigatesEditPart.VISUAL_ID:
			return getGEFWrapper(new MitigatesReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case RebutsOriginEditPart.VISUAL_ID:
			return getGEFWrapper(new RebutsOriginReorientCommand(req));
		case MitigatesRebuttalEditPart.VISUAL_ID:
			return getGEFWrapper(new MitigatesRebuttalReorientCommand(req));
		case ArgumentOriginEditPart.VISUAL_ID:
			return getGEFWrapper(new ArgumentOriginReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
