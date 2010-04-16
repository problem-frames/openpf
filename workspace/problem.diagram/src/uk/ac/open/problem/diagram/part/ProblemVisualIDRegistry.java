package uk.ac.open.problem.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import uk.ac.open.problem.diagram.edit.parts.Link2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Link3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.LinkEditPart;
import uk.ac.open.problem.diagram.edit.parts.Node2EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node3EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node4EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node5EditPart;
import uk.ac.open.problem.diagram.edit.parts.Node6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription5EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescription6EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeDescriptionEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeEditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName2EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName3EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName4EditPart;
import uk.ac.open.problem.diagram.edit.parts.NodeName5EditPart;
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
	private static ProblemAbstractExpression Node_2001_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Node_2002_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Node_2003_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Node_2004_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Node_2005_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Node_2006_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Link_4001_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Link_4002_Constraint;

	/**
	 * @generated
	 */
	private static ProblemAbstractExpression Link_4003_Constraint;

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
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getProblemDiagram()
				.isSuperTypeOf(domainElement.eClass())
				&& isDiagram((uk.ac.open.problem.ProblemDiagram) domainElement)) {
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
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2001((uk.ac.open.problem.Node) domainElement)) {
				return NodeEditPart.VISUAL_ID;
			}
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2002((uk.ac.open.problem.Node) domainElement)) {
				return Node2EditPart.VISUAL_ID;
			}
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2003((uk.ac.open.problem.Node) domainElement)) {
				return Node3EditPart.VISUAL_ID;
			}
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2004((uk.ac.open.problem.Node) domainElement)) {
				return Node4EditPart.VISUAL_ID;
			}
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2005((uk.ac.open.problem.Node) domainElement)) {
				return Node5EditPart.VISUAL_ID;
			}
			if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()
					.isSuperTypeOf(domainElement.eClass())
					&& isNode_2006((uk.ac.open.problem.Node) domainElement)) {
				return Node6EditPart.VISUAL_ID;
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
		if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4001((uk.ac.open.problem.Link) domainElement)) {
			return LinkEditPart.VISUAL_ID;
		}
		if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4002((uk.ac.open.problem.Link) domainElement)) {
			return Link2EditPart.VISUAL_ID;
		}
		if (uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink().isSuperTypeOf(
				domainElement.eClass())
				&& isLink_4003((uk.ac.open.problem.Link) domainElement)) {
			return Link3EditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(uk.ac.open.problem.ProblemDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2001(uk.ac.open.problem.Node domainElement) {
		if (Node_2001_Constraint == null) { // lazy initialization
			Node_2001_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::REQUIREMENT", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2002(uk.ac.open.problem.Node domainElement) {
		if (Node_2002_Constraint == null) { // lazy initialization
			Node_2002_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::LEXICAL", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2003(uk.ac.open.problem.Node domainElement) {
		if (Node_2003_Constraint == null) { // lazy initialization
			Node_2003_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::MACHINE", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2004(uk.ac.open.problem.Node domainElement) {
		if (Node_2004_Constraint == null) { // lazy initialization
			Node_2004_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::DESIGNED", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2004_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2005(uk.ac.open.problem.Node domainElement) {
		if (Node_2005_Constraint == null) { // lazy initialization
			Node_2005_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::BIDDABLE", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2005_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isNode_2006(uk.ac.open.problem.Node domainElement) {
		if (Node_2006_Constraint == null) { // lazy initialization
			Node_2006_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = NodeType::CAUSAL", uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode()); //$NON-NLS-1$
		}
		Object result = Node_2006_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4001(uk.ac.open.problem.Link domainElement) {
		if (Link_4001_Constraint == null) { // lazy initialization
			Link_4001_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = LinkType::CONSTRAINT", uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink()); //$NON-NLS-1$
		}
		Object result = Link_4001_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4002(uk.ac.open.problem.Link domainElement) {
		if (Link_4002_Constraint == null) { // lazy initialization
			Link_4002_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = LinkType::REFERENCE", uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink()); //$NON-NLS-1$
		}
		Object result = Link_4002_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLink_4003(uk.ac.open.problem.Link domainElement) {
		if (Link_4003_Constraint == null) { // lazy initialization
			Link_4003_Constraint = ProblemOCLFactory
					.getExpression(
							"self.type = LinkType::INTERFACE", uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink()); //$NON-NLS-1$
		}
		Object result = Link_4003_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

}
