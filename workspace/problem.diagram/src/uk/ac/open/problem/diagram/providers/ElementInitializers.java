package uk.ac.open.problem.diagram.providers;

import uk.ac.open.problem.Link;
import uk.ac.open.problem.LinkType;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemPackage;
import uk.ac.open.problem.diagram.expressions.ProblemAbstractExpression;
import uk.ac.open.problem.diagram.expressions.ProblemOCLFactory;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_Node_2001(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::REQUIREMENT",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Node_2002(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::LEXICAL",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Node_2003(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::MACHINE",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Node_2004(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::DESIGNED",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Node_2005(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::BIDDABLE",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Node_2006(uk.ac.open.problem.Node instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"NodeType::CAUSAL",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNode())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getNodeType());
			instance.setType((uk.ac.open.problem.NodeType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Link_4001(uk.ac.open.problem.Link instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"LinkType::CONSTRAINT",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLinkType());
			instance.setType((uk.ac.open.problem.LinkType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Link_4002(uk.ac.open.problem.Link instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"LinkType::REFERENCE",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLinkType());
			instance.setType((uk.ac.open.problem.LinkType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_Link_4003(uk.ac.open.problem.Link instance) {
		try {
			Object value_0 = ProblemOCLFactory.getExpression(
					"LinkType::INTERFACE",
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLink())
					.evaluate(instance);

			value_0 = ProblemAbstractExpression.performCast(value_0,
					uk.ac.open.problem.ProblemPackage.eINSTANCE.getLinkType());
			instance.setType((uk.ac.open.problem.LinkType) value_0);
		} catch (RuntimeException e) {
			ProblemDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
