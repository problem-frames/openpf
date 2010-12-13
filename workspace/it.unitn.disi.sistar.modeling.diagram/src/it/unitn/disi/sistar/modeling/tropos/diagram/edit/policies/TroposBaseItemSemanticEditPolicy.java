package it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies;

import it.unitn.disi.sistar.configurations.RelationshipConfig;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.Relation;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.helpers.TroposBaseEditHelper;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.tools.CreateAssociationTool;
import it.unitn.disi.sistar.tools.CreateContributionTool;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.tools.CreateMeansEndTool;
import it.unitn.disi.sistar.tools.CreateOwnershipTool;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
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
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TroposBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
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
	protected TroposBaseItemSemanticEditPolicy(IElementType elementType) {
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
				Integer id = new Integer(TroposVisualIDRegistry
						.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated NOT
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		Object parameter = request.getParameters().get("CLEANUP");
		Object parameter2 = request.getParameters().get("LIST");
		IEditCommandRequest completedRequest = completeRequest(request);
		//		added to deal with stack overflow
		if (request instanceof DestroyRequest) {
			if (parameter != null)
				completedRequest.setParameter("CLEANUP", parameter);
			if (parameter2 != null)
				completedRequest.setParameter("LIST", parameter2);
		}
		Object editHelperContext = completedRequest.getEditHelperContext();
		if (editHelperContext instanceof View
				|| (editHelperContext instanceof IEditHelperContext && ((IEditHelperContext) editHelperContext)
						.getEObject() instanceof View)) {
			// no semantic commands are provided for pure design elements
			return null;
		}
		if (editHelperContext == null) {
			editHelperContext = ViewUtil
					.resolveSemanticElement((View) getHost().getModel());
		}
		IElementType elementType = ElementTypeRegistry.getInstance()
				.getElementType(editHelperContext);
		if (elementType == ElementTypeRegistry.getInstance().getType(
				"org.eclipse.gmf.runtime.emf.type.core.default")) { //$NON-NLS-1$ 
			elementType = null;
		}
		Command epCommand = getSemanticCommandSwitch(completedRequest);
		//System.out.println("command" + epCommand + " request" + completedRequest.getClass().getCanonicalName());
		if (epCommand != null) {
			ICommand command = epCommand instanceof ICommandProxy ? ((ICommandProxy) epCommand)
					.getICommand()
					: new CommandProxy(epCommand);
			completedRequest.setParameter(
					TroposBaseEditHelper.EDIT_POLICY_COMMAND, command);
		}
		Command ehCommand = null;
		if (elementType != null) {
			ICommand command = elementType.getEditCommand(completedRequest);
			if (command != null) {
				if (!(command instanceof CompositeTransactionalCommand)) {
					TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
							.getEditingDomain();
					command = new CompositeTransactionalCommand(editingDomain,
							null).compose(command);
				}
				ehCommand = new ICommandProxy(command);
			}
		}
		boolean shouldProceed = true;
		if (completedRequest instanceof DestroyRequest) {
			shouldProceed = shouldProceed((DestroyRequest) completedRequest);
		}
		if (shouldProceed) {
			if (completedRequest instanceof DestroyRequest) {
				TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
						.getEditingDomain();
				Command deleteViewCommand = new ICommandProxy(
						new DeleteCommand(editingDomain, (View) getHost()
								.getModel()));
				ehCommand = ehCommand == null ? deleteViewCommand : ehCommand
						.chain(deleteViewCommand);
			}
			return ehCommand;
		}
		return null;
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
					.getICommand()
					: new CommandProxy(editPolicyCommand);
			request.setParameter(TroposBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(TroposBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(TroposBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(TroposBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
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
		IElementType requestContextElementType = TroposElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	private String getObjectName(EObject object) {
		String result = null;
		if (object instanceof Service) {
			Service service = (Service) object;
			result = service.getServiceType().getLiteral();
		}

		if (object instanceof Actor) {
			Actor actor = (Actor) object;
			result = actor.getActorType().getLiteral();
		}
		if (object instanceof Contribution) {
			Contribution contribution = (Contribution) object;
			result = contribution.getRelationshipType().getLiteral();
		}
		if (result != null)
			result.toUpperCase();

		return result;
	}

	private String getRelationName(EClass eclass, Map parameters) {
		try {
			String result;
			if (parameters.get(CreateAssociationTool.ASSOCIATION_TYPE) != null) {
				result = ((EAssociationType) parameters
						.get(CreateAssociationTool.ASSOCIATION_TYPE))
						.getLiteral();
			} else if (parameters.get(CreateDependencyTool.DEPENDENCY_TYPE) != null) {
				result = ((EDependencyType) parameters
						.get(CreateDependencyTool.DEPENDENCY_TYPE))
						.getLiteral();
			} else if (parameters.get(CreateOwnershipTool.OWNERSHIP_TYPE) != null) {
				result = ((EOwnershipType) parameters
						.get(CreateOwnershipTool.OWNERSHIP_TYPE)).getLiteral();
			} else if (parameters.get(CreateMeansEndTool.RELATION_TYPE) != null) {
				result = ((String) parameters
						.get(CreateMeansEndTool.RELATION_TYPE));
			} else if (parameters.get(CreateContributionTool.RELATIONSHIP_TYPE) != null) {
				result = ((ERelationshipType) parameters
						.get(CreateContributionTool.RELATIONSHIP_TYPE))
						.getLiteral();
			} else
				result = eclass.getName();
			if (result != null)
				result.toUpperCase();

			return result;
		} catch (Throwable e) {
			ConsoleUtil.printExceptionToConsole(e);
			return null;
		}
	}

	/**
	 * @generated NOT
	 */
	private Command checkRelationConstraints(IEditCommandRequest req) {
		CreateRelationshipRequest request = ((CreateRelationshipRequest) req);
		String relationName = getRelationName(request.getElementType()
				.getEClass(), request.getParameters());
		boolean isStart = request.getTarget() == null;
		String thisName = isStart ? getObjectName(request.getSource())
				: getObjectName(request.getTarget());
		String otherName = isStart ? null : getObjectName(request.getSource());

		//restriction for actor-service relation
		if (!isStart
				&& request.getElementType().equals(
						TroposElementTypes.Dependency_3004)) {
			if (request.getSource() instanceof Actor
					&& request.getTarget() instanceof Service
					&& request.getTarget().eContainer() instanceof Actor) {
				return null;
			}
		}

		boolean isAllowed = new RelationshipConfig().checkTroposRelation(
				relationName, null, isStart, thisName, otherName);

		if (isAllowed) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		}
		return null;
	}

	private boolean checkRelationConstraintsForReconnect(IEditCommandRequest req) {
		ReorientRelationshipRequest request = ((ReorientRelationshipRequest) req);
		Map parameters = request.getParameters();
		if (request.getRelationship() instanceof Association)
			parameters.put(CreateAssociationTool.ASSOCIATION_TYPE,
					((Association) request.getRelationship())
							.getAssociationType());
		else if (request.getRelationship() instanceof Dependency)
			parameters.put(CreateDependencyTool.DEPENDENCY_TYPE,
					((Dependency) request.getRelationship())
							.getDependencyType());
		else if (request.getRelationship() instanceof Ownership)
			parameters.put(CreateOwnershipTool.OWNERSHIP_TYPE,
					((Ownership) request.getRelationship()).getOwnershipType());
		else if (request.getRelationship() instanceof Contribution)
			parameters.put(CreateContributionTool.RELATIONSHIP_TYPE,
					((Contribution) request.getRelationship())
							.getRelationshipType());
		else if (request.getRelationship() instanceof MeansEnd)
			parameters.put(CreateMeansEndTool.RELATION_TYPE, "MEANS_END");

		String relationName = getRelationName(request.getRelationship()
				.eClass(), request.getParameters());
		EObject thisObject = request.getDirection() == ReorientRequest.REORIENT_TARGET ? request
				.getNewRelationshipEnd()
				: ((Relation) request.getRelationship()).getTarget();
		String thisName = getObjectName(thisObject);

		EObject otherObject = request.getDirection() == ReorientRequest.REORIENT_TARGET ? ((Relation) request
				.getRelationship()).getSource()
				: request.getNewRelationshipEnd();
		String otherName = getObjectName(otherObject);

		EObject oldSource = request.getDirection() == ReorientRequest.REORIENT_TARGET ? ((Relation) request
				.getRelationship()).getSource()
				: request.getOldRelationshipEnd();
		EObject oldTarget = request.getDirection() == ReorientRequest.REORIENT_TARGET ? request
				.getOldRelationshipEnd()
				: ((Relation) request.getRelationship()).getTarget();

		if (request.getRelationship() instanceof Dependency
				&& oldSource instanceof Actor && oldTarget instanceof Service
				&& oldTarget.eContainer() instanceof Diagram)
			return false;
		if (request.getRelationship() instanceof Dependency
				&& oldSource instanceof Service && oldTarget instanceof Actor
				&& oldSource.eContainer() instanceof Diagram)
			return false;

		if (request.getRelationship() instanceof Dependency
				&& otherObject instanceof Actor
				&& thisObject instanceof Service
				&& thisObject.eContainer() instanceof Actor)
			return false;

		//System.out.println("reconnect" + relationName + " " + null + " " + thisName + " " + otherName);
		if (new RelationshipConfig().checkTroposRelation(relationName, null,
				false, thisName, otherName)) {
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return checkRelationConstraints(req);
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
	 * @generated NOT
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		if (!checkRelationConstraintsForReconnect(req)) {
			return UnexecutableCommand.INSTANCE;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
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
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		private static final String OPPOSITE_END_VAR = "oppositeEnd"; //$NON-NLS-1$

		/**
		 * @generated
		 */
		public static boolean canCreateAssociation_3001(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistAssociation_3001(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateContribution_3002(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistContribution_3002(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateComposition_3003(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistComposition_3003(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateDependency_3004(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistDependency_3004(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateOwnership_3005(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistOwnership_3005(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateMeansEnd_3006(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistMeansEnd_3006(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canCreateCustomRelation_3007(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return canExistCustomRelation_3007(container, source, target);
		}

		/**
		 * @generated
		 */
		public static boolean canExistAssociation_3001(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistContribution_3002(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistComposition_3003(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistDependency_3004(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistOwnership_3005(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistMeansEnd_3006(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}

		/**
		 * @generated
		 */
		public static boolean canExistCustomRelation_3007(Diagram container,
				GraphicalObject source, GraphicalObject target) {
			return true;
		}
	}

	/**
	 * Finds container element for the new relationship of the specified type.
	 * Default implementation goes up by containment hierarchy starting from
	 * the specified element and returns the first element that is instance of
	 * the specified container class.
	 * 
	 */
	protected EObject getRelationshipContainer(EObject element,
			EClass containerClass, IElementType relationshipType) {
		for (; element != null; element = element.eContainer()) {
			if (containerClass.isSuperTypeOf(element.eClass())) {
				return element;
			}
		}
		return null;
	}

	/**
	 */
	protected EObject getSemanticElement() {
		return ViewUtil.resolveSemanticElement((View) getHost().getModel());
	}
}
