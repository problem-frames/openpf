package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.figures.nodes.CompartmentEllipseFigure;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorActorCompartmentEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ActorEditPart;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts.ServiceEditPart;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;

public class ActorActorCompartmentDragDropEditPolicy extends DiagramDragDropEditPolicy{
	
	
	@Override
	protected Command getDropCommand(ChangeBoundsRequest request) {
		final ChangeBoundsRequest innerRequest = request;
		CompoundCommand command = new CompoundCommand(null);
		command.add(super.getDropCommand(request));
		if(request.getEditParts().get(0) instanceof ServiceEditPart)
			command.add(new Command()
			{
			@Override
			public void execute() {
				final Bounds actorBounds = (Bounds)((Node)((ActorActorCompartmentEditPart)getHost()).getPrimaryView()).getLayoutConstraint();
				ServiceEditPart serviceEditPart = (ServiceEditPart)innerRequest.getEditParts().get(0);
				Bounds serviceBounds = (Bounds)((Node)serviceEditPart.getPrimaryView()).getLayoutConstraint();
				
				final Rectangle newService = new Rectangle(innerRequest.getLocation().x, innerRequest.getLocation().y, serviceBounds.getHeight(), serviceBounds.getWidth());
				TransactionalEditingDomain domain = ((ActorActorCompartmentEditPart)getHost()).getEditingDomain();
				domain.getCommandStack().execute(new RecordingCommand(domain) {
					protected void doExecute() {
							((ActorEditPart)getHost().getParent()).correctBounds(actorBounds.getWidth(), actorBounds.getHeight(), newService);
					}
				});
				
			
				}
			});
		return command;
	}
		public void showTargetFeedback(Request request) {
			Command c = getCommand(request);
			if (c != null && c.canExecute()) {
				if (revertColor == null) {
					CompartmentEllipseFigure figure = (CompartmentEllipseFigure)((ActorEditPart)(
								(ActorActorCompartmentEditPart)getHost()).getParent()).getSecondaryShape();
					revertColor = figure.getForegroundColor();
					opacity = figure.isOpaque();
					figure.setForegroundColor(ColorConstants.red);
				}
			}
		}

		/**
		 * @see org.eclipse.gef.EditPolicy#eraseTargetFeedback(org.eclipse.gef.Request)
		 */
		public void eraseTargetFeedback(Request request) {
			if (revertColor != null) {
				CompartmentEllipseFigure figure = (CompartmentEllipseFigure)((ActorEditPart)(
						(ActorActorCompartmentEditPart)getHost()).getParent()).getSecondaryShape();
				
				figure.setForegroundColor(revertColor);
				revertColor = null;
			}
		}
}
