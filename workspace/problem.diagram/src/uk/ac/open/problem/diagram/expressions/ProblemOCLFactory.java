package uk.ac.open.problem.diagram.expressions;

import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.Environment;
import org.eclipse.ocl.EvaluationEnvironment;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreFactory;
import org.eclipse.ocl.ecore.OCL.Helper;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.expressions.OperationCallExp;
import org.eclipse.ocl.expressions.Variable;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.options.ParsingOptions;
import org.eclipse.ocl.utilities.AbstractVisitor;
import org.eclipse.ocl.utilities.PredefinedType;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorPlugin;

/**
 * @generated
 */
public class ProblemOCLFactory {

	/**
	 * @generated
	 */
	private final ProblemAbstractExpression[] expressions;

	/**
	 * @generated
	 */
	protected ProblemOCLFactory() {
		this.expressions = new ProblemAbstractExpression[24];
	}

	/**
	 * @generated
	 */
	public static ProblemAbstractExpression getExpression(int index,
			EClassifier context, Map<String, EClassifier> environment) {
		ProblemOCLFactory cached = ProblemDiagramEditorPlugin.getInstance()
				.getProblemOCLFactory();
		if (cached == null) {
			ProblemDiagramEditorPlugin.getInstance().setProblemOCLFactory(
					cached = new ProblemOCLFactory());
		}
		if (index < 0 || index >= cached.expressions.length) {
			throw new IllegalArgumentException();
		}
		if (cached.expressions[index] == null) {
			final String[] exprBodies = new String[] {
					"self.type = NodeType::REQUIREMENT", //$NON-NLS-1$
					"NodeType::REQUIREMENT", //$NON-NLS-1$
					"self.type = NodeType::LEXICAL", //$NON-NLS-1$
					"NodeType::LEXICAL", //$NON-NLS-1$
					"self.type = NodeType::MACHINE", //$NON-NLS-1$
					"NodeType::MACHINE", //$NON-NLS-1$
					"self.type = NodeType::DESIGNED", //$NON-NLS-1$
					"NodeType::DESIGNED", //$NON-NLS-1$
					"self.type = NodeType::BIDDABLE", //$NON-NLS-1$
					"NodeType::BIDDABLE", //$NON-NLS-1$
					"self.type = NodeType::CAUSAL", //$NON-NLS-1$
					"NodeType::CAUSAL", //$NON-NLS-1$
					"self.type = NodeType::PHYSICAL", //$NON-NLS-1$
					"NodeType::PHYSICAL", //$NON-NLS-1$
					"self.type = NodeType::CONCERN", //$NON-NLS-1$
					"NodeType::CONCERN", //$NON-NLS-1$
					"self.type = LinkType::CONSTRAINT", //$NON-NLS-1$
					"LinkType::CONSTRAINT", //$NON-NLS-1$
					"self.type = LinkType::REFERENCE", //$NON-NLS-1$
					"LinkType::REFERENCE", //$NON-NLS-1$
					"self.type = LinkType::INTERFACE", //$NON-NLS-1$
					"LinkType::INTERFACE", //$NON-NLS-1$
					"self.type = LinkType::CONCERN", //$NON-NLS-1$
					"LinkType::CONCERN", //$NON-NLS-1$
			};
			cached.expressions[index] = getExpression(
					exprBodies[index],
					context,
					environment == null ? Collections
							.<String, EClassifier> emptyMap() : environment);
		}
		return cached.expressions[index];
	}

	/**
	 * @generated
	 */
	public static ProblemAbstractExpression getExpression(String body,
			EClassifier context, Map<String, EClassifier> environment) {
		return new Expression(body, context, environment);
	}

	/**
	 * @generated
	 */
	public static ProblemAbstractExpression getExpression(String body,
			EClassifier context) {
		return getExpression(body, context,
				Collections.<String, EClassifier> emptyMap());
	}

	/**
	 * @generated
	 */
	private static class Expression extends ProblemAbstractExpression {

		/**
		 * @generated
		 */
		private final org.eclipse.ocl.ecore.OCL oclInstance;

		/**
		 * @generated
		 */
		private org.eclipse.ocl.ecore.OCLExpression oclExpression;

		/**
		 * @generated
		 */
		public Expression(String body, EClassifier context,
				Map<String, EClassifier> environment) {
			super(body, context);
			oclInstance = org.eclipse.ocl.ecore.OCL.newInstance();
			initCustomEnv(oclInstance.getEnvironment(), environment);
			Helper oclHelper = oclInstance.createOCLHelper();
			oclHelper.setContext(context());
			try {
				oclExpression = oclHelper.createQuery(body());
				setStatus(IStatus.OK, null, null);
			} catch (ParserException e) {
				setStatus(IStatus.ERROR, e.getMessage(), e);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected Object doEvaluate(Object context, Map env) {
			if (oclExpression == null) {
				return null;
			}
			// on the first call, both evalEnvironment and extentMap are clear, for later we have finally, below.
			EvaluationEnvironment<?, ?, ?, ?, ?> evalEnv = oclInstance
					.getEvaluationEnvironment();
			// initialize environment
			for (Object nextKey : env.keySet()) {
				evalEnv.replace((String) nextKey, env.get(nextKey));
			}
			try {
				Object result = oclInstance.evaluate(context, oclExpression);
				return oclInstance.isInvalid(result) ? null : result;
			} finally {
				evalEnv.clear();
				oclInstance.setExtentMap(null); // clear allInstances cache, and get the oclInstance ready for the next call
			}
		}

		/**
		 * @generated
		 */
		private static void initCustomEnv(
				Environment<?, EClassifier, ?, ?, ?, EParameter, ?, ?, ?, ?, ?, ?> ecoreEnv,
				Map<String, EClassifier> environment) {
			// Use EObject as implicit root class for any object, to allow eContainer() and other EObject operations from OCL expressions
			ParsingOptions.setOption(ecoreEnv,
					ParsingOptions.implicitRootClass(ecoreEnv),
					EcorePackage.eINSTANCE.getEObject());
			for (String varName : environment.keySet()) {
				EClassifier varType = environment.get(varName);
				ecoreEnv.addElement(varName,
						createVar(ecoreEnv, varName, varType), false);
			}
		}

		/**
		 * @generated
		 */
		private static org.eclipse.ocl.ecore.Variable createVar(
				Environment<?, EClassifier, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ecoreEnv,
				String name, EClassifier type) {
			org.eclipse.ocl.ecore.Variable var = EcoreFactory.eINSTANCE
					.createVariable();
			var.setName(name);
			var.setType(ecoreEnv.getUMLReflection().getOCLType(type));
			return var;
		}
	}
}
