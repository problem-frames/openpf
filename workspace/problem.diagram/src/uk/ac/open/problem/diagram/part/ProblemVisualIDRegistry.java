package uk.ac.open.problem.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.Link;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link4EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription4EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node7EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node8EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription7EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription8EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName7EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeNameEditPart;
import uk.ac.open.problem.diagram.edit.parts.ProblemDiagramEditPart;
import uk.ac.open.problem.diagram.expressions.ProblemAbstractExpression;
import uk.ac.open.problem.diagram.expressions.ProblemOCLFactory;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ProblemVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "problem.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ProblemDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ProblemDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ProblemDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ProblemPackage.eINSTANCE.getProblemDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ProblemDiagram) domainElement)) {
			return ProblemDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry
				.getModelID(containerView);
		if (!ProblemDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ProblemDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProblemDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ProblemDiagramEditPart.VISUAL_ID:
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2001((Node) domainElement)) {
				return NodeEditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2002((Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2003((Node) domainElement)) {
				return Node3EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2004((Node) domainElement)) {
				return Node4EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2005((Node) domainElement)) {
				return Node5EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2006((Node) domainElement)) {
				return Node6EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2007((Node) domainElement)) {
				return Node7EditPart.VISUAL_ID;
			}
			if (ProblemPackage.eINSTANCE.getNode().isSuperTypeOf(
					domainElement.eClass())
					&& isNode_2009((Node) domainElement)) {
				return Node8EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry
				.getModelID(containerView);
		if (!ProblemDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ProblemDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = uk.ac.open.problem.diagram.part.ProblemVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ProblemDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ProblemDiagramEditPart.VISUAL_ID:
			if (NodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Node8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case NodeEditPart.VISUAL_ID:
			if (NodeNameDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node2EditPart.VISUAL_ID:
			if (NodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node3EditPart.VISUAL_ID:
			if (NodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node4EditPart.VISUAL_ID:
			if (NodeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node5EditPart.VISUAL_ID:
			if (NodeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node6EditPart.VISUAL_ID:
			if (NodeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node7EditPart.VISUAL_ID:
			if (NodeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Node8EditPart.VISUAL_ID:
			if (NodeName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (NodeDescription8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LinkEditPart.VISUAL_ID:
			if (LinkDescriptionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Link2EditPart.VISUAL_ID:
			if (LinkDescription2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Link3EditPart.VISUAL_ID:
			if (LinkDescription3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Link4EditPart.VISUAL_ID:
			if (LinkDescription4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4001((Link) domainElement)) {
			return LinkEditPart.VISUAL_ID;
		}
		if (ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4002((Link) domainElement)) {
			return Link2EditPart.VISUAL_ID;
		}
		if (ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4003((Link) domainElement)) {
			return Link3EditPart.VISUAL_ID;
		}
		if (ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4004((Link) domainElement)) {
			return Link4EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ProblemDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2001(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(0,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2002(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(2,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2003(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(4,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2004(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(6,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2005(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(8,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2006(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(10,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2007(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(12,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2009(Node domainElement) {
		Object result = ProblemOCLFactory.getExpression(14,
				ProblemPackage.eINSTANCE.getNode(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4001(Link domainElement) {
		Object result = ProblemOCLFactory.getExpression(16,
				ProblemPackage.eINSTANCE.getLink(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4002(Link domainElement) {
		Object result = ProblemOCLFactory.getExpression(18,
				ProblemPackage.eINSTANCE.getLink(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4003(Link domainElement) {
		Object result = ProblemOCLFactory.getExpression(20,
				ProblemPackage.eINSTANCE.getLink(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4004(Link domainElement) {
		Object result = ProblemOCLFactory.getExpression(22,
				ProblemPackage.eINSTANCE.getLink(), null).evaluate(
				domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
