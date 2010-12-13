package it.unitn.disi.sistar.modeling.tropos.diagram.edit.parts;

import it.unitn.disi.sistar.element.configuration.util.TroposElementConfiguration;
import it.unitn.disi.sistar.figures.connections.FailureConnectionFigure;
import it.unitn.disi.sistar.modeling.api.editparts.IDiagramEditPart;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.DiagramCanonicalEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.DiagramGraphicalNodeEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.edit.policies.DiagramItemSemanticEditPolicy;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.DiagramCreatorUtil;
import it.unitn.disi.sistar.modeling.tropos.diagram.part.TroposVisualIDRegistry;
import it.unitn.disi.sistar.modeling.tropos.diagram.providers.TroposElementTypes;
import it.unitn.disi.sistar.tools.CreateAssociationTool;
import it.unitn.disi.sistar.tools.CreateCompositionTool;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.tools.CreateOwnershipTool;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated NOT
 */
public class DiagramEditPart extends
		org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart implements
		IDiagramEditPart {

	/**
	 * @generated
	 */
	public static String MODEL_ID = "Tropos"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 79;

	/**
	 * @generated
	 */
	public DiagramEditPart(View view) {
		super(view);
	}

	/**
	 * @generated NOT
	 */
	@Override
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DiagramCanonicalEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE,
				new DiagramGraphicalNodeEditPolicy());
	}

	public void hideFailures(IFigure figure) {
		List children = getConnectionLayer().getChildren();
		List childToBeRemoved = new ArrayList();

		for (Iterator iter = children.iterator(); iter.hasNext();) {
			IFigure element = (IFigure) iter.next();
			if (element.equals(figure)){
				childToBeRemoved.add(element);
			}
		}
		children.removeAll(childToBeRemoved);
		getConnectionLayer().repaint();
	}

	public void hideFailures() {
		List children = getConnectionLayer().getChildren();
		List childToBeRemoved = new ArrayList();

		for (Iterator iter = children.iterator(); iter.hasNext();) {
			IFigure element = (IFigure) iter.next();
			if (element instanceof FailureConnectionFigure) {
				childToBeRemoved.add(element);
			}
		}
		children.removeAll(childToBeRemoved);
		getConnectionLayer().repaint();
	}

	public IFigure showFailures(IFigure figure1, IFigure figure2,
			IFigure parentFigure1, IFigure parentFigure2) {
		IFigure layer = getConnectionLayer();
		
		//minhsang: to avoid overlap error messages, create only one FailureConnectionFigure for all error message
		
		// find existing FailureConnectionFigure
		FailureConnectionFigure failure = null;
		boolean found = false;
		
		for(Object fig: layer.getChildren())
			if (fig instanceof FailureConnectionFigure) {
				FailureConnectionFigure ffig = (FailureConnectionFigure) fig;
				if (ffig.getStartFigure() == figure1 && ffig.getEndFigure() == figure2) {
					found = true;
					failure = ffig;
				}
			}
		
		if (!found) {
			failure = new FailureConnectionFigure(figure1, figure2, parentFigure1, parentFigure2);
			getConnectionLayer().add(failure);
		}
		
		return failure;
	}

	public void refreshMapping() {
		DiagramCreatorUtil.refreshMap((Diagram) getDiagramView().getElement());
	}

	public void refreshStyles() {
		Diagram diagram = (Diagram) getDiagramView().getElement();
		List objectList = diagram.getObject();
		for (Iterator iter = objectList.iterator(); iter.hasNext();) {
			EObject element = (EObject) iter.next();
			if (element instanceof Actor) {
				Actor actor = (Actor) element;
				ActorEditPart actorEditPart = (ActorEditPart) findEditPart(
						null, actor);
				Node actorNode = (Node) actorEditPart.getPrimaryView();

				DiagramCreatorUtil.addStyle(actorEditPart,
						CustomStylePackage.eINSTANCE.getActorStyle());
				DiagramCreatorUtil.removeStyle(actorEditPart,
						CustomStylePackage.eINSTANCE.getCoreLocation());
			} else if (element instanceof Association) {
				List connectionList = getConnections();
				for (Iterator iterator = connectionList.iterator(); iterator
						.hasNext();) {
					ConnectionNodeEditPart connectionEditPart = (ConnectionNodeEditPart) iterator
							.next();
					if (connectionEditPart.getPrimaryView().getElement() == element) {
						DiagramCreatorUtil.createViewElement(this,
								connectionEditPart.getPrimaryView(), element,
								AssociationNameEditPart.VISUAL_ID);
						break;
					}
				}

			}
		}

	}

	public void createAssociationLink(String source, String target,
			EAssociationType type) {
		DiagramCreatorUtil.refreshMap((Diagram) getDiagramView().getElement());
		Map mapping = DiagramCreatorUtil.getMap();
		EObject sourceO = (EObject) mapping.get(source);
		EObject targetO = (EObject) mapping.get(target);
		//EObject goalObject = (EObject) mapping.get(parentName + "." + goalName);
		ActorEditPart actorEditPart = (ActorEditPart) findEditPart(null,
				sourceO);
		ActorActorCompartmentEditPart compartmentEditpart = (ActorActorCompartmentEditPart) actorEditPart
				.getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
		/*if (goalObject == null)
			goalObject = (EObject) mapping.get(goalName);
		 */

		/*if (goalObject == null) {
			org.eclipse.gmf.runtime.notation.Diagram diagram = (org.eclipse.gmf.runtime.notation.Diagram) getDiagramView();
			for (Iterator iter = diagram.getChildren().iterator(); iter
					.hasNext();) {
				View element = (View) iter.next();

				if (element.getElement() instanceof Actor) {
					EObject candidate = (EObject) mapping.get(((Actor) element
							.getElement()).getName().toUpperCase()
							+ "." + goalName);
					if (candidate != null) {
						ShapeNodeEditPart goalEditPart = (ShapeNodeEditPart) findEditPart(
								null, candidate);
						if (goalEditPart.getSourceConnections().size() == 0)
							goalObject = candidate;
					}
				}
			}
		}
		if (goalObject == null) {
			Map map = new HashMap();
			map.put(TroposElementConfiguration.EXACT_NAME, goalName);
			ActorEditPart parentEditPart = (ActorEditPart) findEditPart(null,
					parent);
			Node actorNode = (Node) parentEditPart.getPrimaryView();
			Bounds actorBounds = (Bounds) actorNode.getLayoutConstraint();
			goalObject = DiagramCreatorUtil.createElement(
					TroposElementTypes.Service_2001, map, this,
					compartmentEditpart, new Point(actorBounds.getX()
							+ Math.random() * 300, actorBounds.getY()
							+ Math.random() * 300));
			if (goalObject == null) {
				ConsoleUtil.printToConsole(goalName + "goal:" + goalObject);
				return;
			}
		}*/
		Map connectionMap = new HashMap();
		connectionMap.put(CreateAssociationTool.ASSOCIATION_TYPE, type);
		DiagramCreatorUtil.createConnection(
				TroposElementTypes.Association_3001, connectionMap, this,
				sourceO, targetO);
	}

	public void createOwnershipLink(String parentName, String goalName,
			EOwnershipType type) {
		DiagramCreatorUtil.refreshMap((Diagram) getDiagramView().getElement());
		Map mapping = DiagramCreatorUtil.getMap();
		EObject parent = (EObject) mapping.get(parentName);
		EObject goalObject = (EObject) mapping.get(parentName + "." + goalName);
		ActorEditPart actorEditPart = (ActorEditPart) findEditPart(null, parent);
		ActorActorCompartmentEditPart compartmentEditpart = (ActorActorCompartmentEditPart) actorEditPart
				.getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));
		if (goalObject == null)
			goalObject = (EObject) mapping.get(goalName);

		if (goalObject == null) {
			org.eclipse.gmf.runtime.notation.Diagram diagram = (org.eclipse.gmf.runtime.notation.Diagram) getDiagramView();
			for (Iterator iter = diagram.getChildren().iterator(); iter
					.hasNext();) {
				View element = (View) iter.next();

				if (element.getElement() instanceof Actor) {
					EObject candidate = (EObject) mapping.get(((Actor) element
							.getElement()).getName().toUpperCase()
							+ "." + goalName);
					if (candidate != null) {
						ShapeNodeEditPart goalEditPart = (ShapeNodeEditPart) findEditPart(
								null, candidate);
						if (goalEditPart.getSourceConnections().size() == 0)
							goalObject = candidate;
					}
				}
			}
		}
		if (goalObject == null) {
			Map map = new HashMap();
			map.put(TroposElementConfiguration.EXACT_NAME, goalName);
			ActorEditPart parentEditPart = (ActorEditPart) findEditPart(null,
					parent);
			Node actorNode = (Node) parentEditPart.getPrimaryView();
			Bounds actorBounds = (Bounds) actorNode.getLayoutConstraint();
			goalObject = DiagramCreatorUtil.createElement(
					TroposElementTypes.Service_2001, map, this,
					compartmentEditpart, new Point(actorBounds.getX()
							+ Math.random() * 300, actorBounds.getY()
							+ Math.random() * 300));
			if (goalObject == null) {
				ConsoleUtil.printToConsole(goalName + "is null goal");
				return;
			}
		}
		Map connectionMap = new HashMap();
		connectionMap.put(CreateOwnershipTool.OWNERSHIP_TYPE, type);
		DiagramCreatorUtil.createConnection(TroposElementTypes.Ownership_3005,
				connectionMap, this, parent, goalObject);
	}

	public void createDecompositionLink(String parentName, String goalStart,
			List goalList, ECompositionType type) {
		DiagramCreatorUtil.refreshMap((Diagram) getDiagramView().getElement());
		Map mapping = DiagramCreatorUtil.getMap();
		EObject parent = (EObject) mapping.get(parentName);

		ActorEditPart actorEditPart = (ActorEditPart) findEditPart(null, parent);
		ActorActorCompartmentEditPart compartmentEditpart = (ActorActorCompartmentEditPart) actorEditPart
				.getChildBySemanticHint(TroposVisualIDRegistry
						.getType(ActorActorCompartmentEditPart.VISUAL_ID));

		EObject goalStartObject = (EObject) mapping.get(parentName + "."
				+ goalStart);

		if (goalStartObject == null) {
			Map map = new HashMap();
			map.put(TroposElementConfiguration.EXACT_NAME, goalStart);
			goalStartObject = DiagramCreatorUtil.createElement(
					TroposElementTypes.Service_2001, map, this,
					compartmentEditpart, new Point(0, 0));
		}

		int index = 0;
		for (Iterator iter = goalList.iterator(); iter.hasNext();) {
			String goalName = (String) iter.next();
			EObject goal = (EObject) mapping.get(goalName);
			boolean needDragDrop = true;
			if (goal == null) {
				goal = (EObject) mapping.get(parentName + "." + goalName);
				needDragDrop = false;
				if (goal == null) {
					Map map = new HashMap();
					ServiceEditPart serviceStartEditPart = (ServiceEditPart) findEditPart(
							null, goalStartObject);
					if (serviceStartEditPart == null) {
						ConsoleUtil
								.printToConsole("service edit part null for:"
										+ goalStartObject);
						return;
					}
					final Bounds bounds = (Bounds) ((Node) actorEditPart
							.getPrimaryView()).getLayoutConstraint();
					Node serviceStartNode = (Node) serviceStartEditPart
							.getPrimaryView();
					final Bounds serviceBound = (Bounds) serviceStartNode
							.getLayoutConstraint();
					int baseX = serviceBound.getX() > bounds.getX() ? serviceBound
							.getX()
							: bounds.getX() + serviceBound.getX();
					int baseY = serviceBound.getY() > bounds.getY() ? serviceBound
							.getY()
							: bounds.getY() + serviceBound.getY();
					final Point basePoint = new Point(baseX, baseY);
					final org.eclipse.gmf.runtime.notation.Diagram diagramView = getDiagramView();
					basePoint.x += (index++) * 150;
					basePoint.y += 150;

					List otherServices = actorEditPart.getPrimaryView()
							.getElement().eContents();
					for (Iterator iterator = otherServices.iterator(); iterator
							.hasNext();) {
						EObject serviceObj = (EObject) iterator.next();
						Node serviceNode = (Node) ((ServiceEditPart) actorEditPart
								.findEditPart(null, serviceObj))
								.getPrimaryView();
						Bounds serBounds1 = (Bounds) serviceNode
								.getLayoutConstraint();
						Rectangle rectangle = new Rectangle(bounds.getX()
								+ serBounds1.getX(), bounds.getY()
								+ serBounds1.getY(), 150, 80);
						Rectangle basePointRectangle = new Rectangle(
								basePoint.x, basePoint.y, 150, 80);
						if (basePointRectangle.contains(rectangle.getCenter())) {
							index++;
							basePoint.x += 150;
							getEditingDomain().getCommandStack().execute(
									new RecordingCommand(getEditingDomain()) {
										@Override
										protected void doExecute() {
											serviceBound.setX(serviceBound
													.getX() + 110);
										}
									});
						}
					}

					Rectangle rectangleBound = new Rectangle(basePoint.x,
							basePoint.y, 160, 120);

					DiagramCreatorUtil
							.expandActor(this, rectangleBound,
									(Actor) actorEditPart.getPrimaryView()
											.getElement());

					map.put(TroposElementConfiguration.EXACT_NAME, goalName);
					goal = DiagramCreatorUtil.createElement(
							TroposElementTypes.Service_2001, map, this,
							compartmentEditpart, basePoint);
					if (goal == null) {
						ConsoleUtil.printToConsole(goalName + "is null goal");
						return;
					}
				}
			}
			if (needDragDrop)
				DiagramCreatorUtil.dragAndDrop(this, goal, compartmentEditpart,
						actorEditPart);
			Map compositionMap = new HashMap();
			compositionMap.put(CreateCompositionTool.COMPOSITION_TYPE, type);
			DiagramCreatorUtil.createConnection(
					TroposElementTypes.Composition_3003, compositionMap, this,
					goalStartObject, goal);
		}
	}

	public void createDependencyLink(String delegatorName, String goalName,
			String delegateeName, EDependencyType type) {
		DiagramCreatorUtil.refreshMap((Diagram) getDiagramView().getElement());
		Map mapping = DiagramCreatorUtil.getMap();
		EObject object0 = (EObject) mapping.get(delegatorName);
		EObject object1 = (EObject) mapping.get(delegatorName + "." + goalName);
		if (object1 == null)
			object1 = (EObject) mapping.get(goalName);
		EObject object2 = (EObject) mapping.get(delegateeName);

		if (object1 == null) {
			Map map = new HashMap();
			map.put(TroposElementConfiguration.EXACT_NAME, goalName);
			object1 = DiagramCreatorUtil.createElement(
					TroposElementTypes.Service_2001, map, this, this,
					new Point(0, 0));
			if (object1 == null) {
				ConsoleUtil.printToConsole(goalName + "is null goal");
				return;
			}
		}

		Map data = new HashMap();
		data.put(CreateDependencyTool.DEPENDENCY_TYPE, type);
		if (object1.eContainer() instanceof Diagram) {

			DiagramCreatorUtil.createConnection(
					TroposElementTypes.Dependency_3004, data, this, object0,
					object1);

			ActorEditPart sourceEditPart = (ActorEditPart) findEditPart(null,
					object0);
			Node sourceNode = (Node) sourceEditPart.getPrimaryView();
			final Bounds sourceBounds = (Bounds) sourceNode
					.getLayoutConstraint();

			ActorEditPart targetEditPart = (ActorEditPart) findEditPart(null,
					object2);
			Node targetNode = (Node) targetEditPart.getPrimaryView();
			final Bounds targetBounds = (Bounds) targetNode
					.getLayoutConstraint();

			ServiceEditPart serviceEditPart = (ServiceEditPart) findEditPart(
					null, object1);
			Node serviceNode = (Node) serviceEditPart.getPrimaryView();
			final Bounds serviceBounds = (Bounds) serviceNode
					.getLayoutConstraint();
			getEditingDomain().getCommandStack().execute(
					new RecordingCommand(getEditingDomain()) {
						@Override
						protected void doExecute() {
							serviceBounds
									.setX((sourceBounds.getX() + targetBounds
											.getX()) / 2);
							serviceBounds
									.setY((sourceBounds.getY() + targetBounds
											.getY()) / 2);
						}
					});

		}
		DiagramCreatorUtil.createConnection(TroposElementTypes.Dependency_3004,
				data, this, object1, object2);
	}
}
