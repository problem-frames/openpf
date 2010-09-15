package edu.toronto.cs.openome_model.diagram.edit.policies;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IEditHelperContext;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Openome_modelBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * 
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected Openome_modelBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						edu.toronto.cs.openome_model.diagram.part.Openome_modelVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * 
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(
					edu.toronto.cs.openome_model.diagram.edit.helpers.Openome_modelBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(
				edu.toronto.cs.openome_model.diagram.edit.helpers.Openome_modelBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(
				edu.toronto.cs.openome_model.diagram.edit.helpers.Openome_modelBaseEditHelper.EDIT_POLICY_COMMAND,
				null);
		request.setParameter(
				edu.toronto.cs.openome_model.diagram.edit.helpers.Openome_modelBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * 
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorPlugin
					.getInstance().setLinkConstraints(
							cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateDependency_3001(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Dependable source,
				edu.toronto.cs.openome_model.Dependable target) {
			return canExistDependency_3001(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAndDecomposition_3002(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistAndDecomposition_3002(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOrDecomposition_3003(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistOrDecomposition_3003(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHelpContribution_3004(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistHelpContribution_3004(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateHurtContribution_3005(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistHurtContribution_3005(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMakeContribution_3006(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistMakeContribution_3006(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateBreakContribution_3007(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistBreakContribution_3007(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomePlusContribution_3008(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistSomePlusContribution_3008(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSomeMinusContribution_3009(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistSomeMinusContribution_3009(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnknownContribution_3010(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistUnknownContribution_3010(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAndContribution_3011(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistAndContribution_3011(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOrContribution_3012(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return canExistOrContribution_3012(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateIsAAssociation_3013(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistIsAAssociation_3013(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCoversAssociation_3014(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistCoversAssociation_3014(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateOccupiesAssociation_3015(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistOccupiesAssociation_3015(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateIsPartOfAssociation_3016(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistIsPartOfAssociation_3016(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePlaysAssociation_3017(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistPlaysAssociation_3017(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateINSAssociation_3018(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return canExistINSAssociation_3018(container, null, source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistDependency_3001(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.Dependency linkInstance,
				edu.toronto.cs.openome_model.Dependable source,
				edu.toronto.cs.openome_model.Dependable target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAndDecomposition_3002(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.AndDecomposition linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOrDecomposition_3003(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.OrDecomposition linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHelpContribution_3004(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.HelpContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistHurtContribution_3005(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.HurtContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistMakeContribution_3006(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.MakeContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistBreakContribution_3007(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.BreakContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSomePlusContribution_3008(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.SomePlusContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSomeMinusContribution_3009(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.SomeMinusContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistUnknownContribution_3010(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.UnknownContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAndContribution_3011(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.AndContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOrContribution_3012(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.OrContribution linkInstance,
				edu.toronto.cs.openome_model.Intention source,
				edu.toronto.cs.openome_model.Intention target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistIsAAssociation_3013(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.IsAAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCoversAssociation_3014(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.CoversAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistOccupiesAssociation_3015(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.OccupiesAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistIsPartOfAssociation_3016(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.IsPartOfAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPlaysAssociation_3017(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.PlaysAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistINSAssociation_3018(
				edu.toronto.cs.openome_model.Model container,
				edu.toronto.cs.openome_model.INSAssociation linkInstance,
				edu.toronto.cs.openome_model.Container source,
				edu.toronto.cs.openome_model.Container target) {
			return true;
		}
	}

}
