/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument.util;

import argument.argument.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see argument.argument.ArgumentPackage
 * @generated
 */
public class ArgumentSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ArgumentPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ArgumentSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ArgumentPackage.eINSTANCE;
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public T doSwitch(EObject theEObject)
  {
		return doSwitch(theEObject.eClass(), theEObject);
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ArgumentPackage.ARGUMENT_DIAGRAM: {
				ArgumentDiagram argumentDiagram = (ArgumentDiagram)theEObject;
				T result = caseArgumentDiagram(argumentDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.LINK: {
				Link link = (Link)theEObject;
				T result = caseLink(link);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REBUTS: {
				Rebuts rebuts = (Rebuts)theEObject;
				T result = caseRebuts(rebuts);
				if (result == null) result = caseLink(rebuts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.MITIGATES: {
				Mitigates mitigates = (Mitigates)theEObject;
				T result = caseMitigates(mitigates);
				if (result == null) result = caseLink(mitigates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseTerminalExpression(argument);
				if (result == null) result = casePrePrimaryExpr(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = casePrePrimaryExpr(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.ASSIGNMENT_OP: {
				AssignmentOp assignmentOp = (AssignmentOp)theEObject;
				T result = caseAssignmentOp(assignmentOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.OR_EXP: {
				OrExp orExp = (OrExp)theEObject;
				T result = caseOrExp(orExp);
				if (result == null) result = caseAssignmentOp(orExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.AND_EXP: {
				AndExp andExp = (AndExp)theEObject;
				T result = caseAndExp(andExp);
				if (result == null) result = caseOrExp(andExp);
				if (result == null) result = caseAssignmentOp(andExp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.RELATIONAL: {
				Relational relational = (Relational)theEObject;
				T result = caseRelational(relational);
				if (result == null) result = caseAndExp(relational);
				if (result == null) result = caseOrExp(relational);
				if (result == null) result = caseAssignmentOp(relational);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.ADDITION: {
				Addition addition = (Addition)theEObject;
				T result = caseAddition(addition);
				if (result == null) result = caseRelational(addition);
				if (result == null) result = caseAndExp(addition);
				if (result == null) result = caseOrExp(addition);
				if (result == null) result = caseAssignmentOp(addition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.MULTIPLICATION: {
				Multiplication multiplication = (Multiplication)theEObject;
				T result = caseMultiplication(multiplication);
				if (result == null) result = caseAddition(multiplication);
				if (result == null) result = caseRelational(multiplication);
				if (result == null) result = caseAndExp(multiplication);
				if (result == null) result = caseOrExp(multiplication);
				if (result == null) result = caseAssignmentOp(multiplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.POWER: {
				Power power = (Power)theEObject;
				T result = casePower(power);
				if (result == null) result = caseMultiplication(power);
				if (result == null) result = caseAddition(power);
				if (result == null) result = caseRelational(power);
				if (result == null) result = caseAndExp(power);
				if (result == null) result = caseOrExp(power);
				if (result == null) result = caseAssignmentOp(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.UNARY_EXPR: {
				UnaryExpr unaryExpr = (UnaryExpr)theEObject;
				T result = caseUnaryExpr(unaryExpr);
				if (result == null) result = casePower(unaryExpr);
				if (result == null) result = caseMultiplication(unaryExpr);
				if (result == null) result = caseAddition(unaryExpr);
				if (result == null) result = caseRelational(unaryExpr);
				if (result == null) result = caseAndExp(unaryExpr);
				if (result == null) result = caseOrExp(unaryExpr);
				if (result == null) result = caseAssignmentOp(unaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.PRE_PRIMARY_EXPR: {
				PrePrimaryExpr prePrimaryExpr = (PrePrimaryExpr)theEObject;
				T result = casePrePrimaryExpr(prePrimaryExpr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.TERMINAL_EXPRESSION: {
				TerminalExpression terminalExpression = (TerminalExpression)theEObject;
				T result = caseTerminalExpression(terminalExpression);
				if (result == null) result = casePrePrimaryExpr(terminalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.ASSIGN_PLUS: {
				AssignPlus assignPlus = (AssignPlus)theEObject;
				T result = caseAssignPlus(assignPlus);
				if (result == null) result = caseAssignmentOp(assignPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.ASSIGN_MIN: {
				AssignMin assignMin = (AssignMin)theEObject;
				T result = caseAssignMin(assignMin);
				if (result == null) result = caseAssignmentOp(assignMin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = caseOrExp(or);
				if (result == null) result = caseAssignmentOp(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = caseAndExp(and);
				if (result == null) result = caseOrExp(and);
				if (result == null) result = caseAssignmentOp(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_NOT_EQ: {
				RelNotEq relNotEq = (RelNotEq)theEObject;
				T result = caseRelNotEq(relNotEq);
				if (result == null) result = caseRelational(relNotEq);
				if (result == null) result = caseAndExp(relNotEq);
				if (result == null) result = caseOrExp(relNotEq);
				if (result == null) result = caseAssignmentOp(relNotEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_EQ_EQ: {
				RelEqEq relEqEq = (RelEqEq)theEObject;
				T result = caseRelEqEq(relEqEq);
				if (result == null) result = caseRelational(relEqEq);
				if (result == null) result = caseAndExp(relEqEq);
				if (result == null) result = caseOrExp(relEqEq);
				if (result == null) result = caseAssignmentOp(relEqEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_LT_EQ: {
				RelLtEq relLtEq = (RelLtEq)theEObject;
				T result = caseRelLtEq(relLtEq);
				if (result == null) result = caseRelational(relLtEq);
				if (result == null) result = caseAndExp(relLtEq);
				if (result == null) result = caseOrExp(relLtEq);
				if (result == null) result = caseAssignmentOp(relLtEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_GT_EQ: {
				RelGtEq relGtEq = (RelGtEq)theEObject;
				T result = caseRelGtEq(relGtEq);
				if (result == null) result = caseRelational(relGtEq);
				if (result == null) result = caseAndExp(relGtEq);
				if (result == null) result = caseOrExp(relGtEq);
				if (result == null) result = caseAssignmentOp(relGtEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_EQ: {
				RelEq relEq = (RelEq)theEObject;
				T result = caseRelEq(relEq);
				if (result == null) result = caseRelational(relEq);
				if (result == null) result = caseAndExp(relEq);
				if (result == null) result = caseOrExp(relEq);
				if (result == null) result = caseAssignmentOp(relEq);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_LT: {
				RelLt relLt = (RelLt)theEObject;
				T result = caseRelLt(relLt);
				if (result == null) result = caseRelational(relLt);
				if (result == null) result = caseAndExp(relLt);
				if (result == null) result = caseOrExp(relLt);
				if (result == null) result = caseAssignmentOp(relLt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.REL_GT: {
				RelGt relGt = (RelGt)theEObject;
				T result = caseRelGt(relGt);
				if (result == null) result = caseRelational(relGt);
				if (result == null) result = caseAndExp(relGt);
				if (result == null) result = caseOrExp(relGt);
				if (result == null) result = caseAssignmentOp(relGt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.PLUS: {
				Plus plus = (Plus)theEObject;
				T result = casePlus(plus);
				if (result == null) result = caseAddition(plus);
				if (result == null) result = caseRelational(plus);
				if (result == null) result = caseAndExp(plus);
				if (result == null) result = caseOrExp(plus);
				if (result == null) result = caseAssignmentOp(plus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.MINUS: {
				Minus minus = (Minus)theEObject;
				T result = caseMinus(minus);
				if (result == null) result = caseAddition(minus);
				if (result == null) result = caseRelational(minus);
				if (result == null) result = caseAndExp(minus);
				if (result == null) result = caseOrExp(minus);
				if (result == null) result = caseAssignmentOp(minus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.MULTI: {
				Multi multi = (Multi)theEObject;
				T result = caseMulti(multi);
				if (result == null) result = caseMultiplication(multi);
				if (result == null) result = caseAddition(multi);
				if (result == null) result = caseRelational(multi);
				if (result == null) result = caseAndExp(multi);
				if (result == null) result = caseOrExp(multi);
				if (result == null) result = caseAssignmentOp(multi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.DIV: {
				Div div = (Div)theEObject;
				T result = caseDiv(div);
				if (result == null) result = caseMultiplication(div);
				if (result == null) result = caseAddition(div);
				if (result == null) result = caseRelational(div);
				if (result == null) result = caseAndExp(div);
				if (result == null) result = caseOrExp(div);
				if (result == null) result = caseAssignmentOp(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.POW: {
				Pow pow = (Pow)theEObject;
				T result = casePow(pow);
				if (result == null) result = casePower(pow);
				if (result == null) result = caseMultiplication(pow);
				if (result == null) result = caseAddition(pow);
				if (result == null) result = caseRelational(pow);
				if (result == null) result = caseAndExp(pow);
				if (result == null) result = caseOrExp(pow);
				if (result == null) result = caseAssignmentOp(pow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.INT_LITERAL: {
				IntLiteral intLiteral = (IntLiteral)theEObject;
				T result = caseIntLiteral(intLiteral);
				if (result == null) result = caseTerminalExpression(intLiteral);
				if (result == null) result = casePrePrimaryExpr(intLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ArgumentPackage.BOOLEAN_LITERAL: {
				BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
				T result = caseBooleanLiteral(booleanLiteral);
				if (result == null) result = caseTerminalExpression(booleanLiteral);
				if (result == null) result = casePrePrimaryExpr(booleanLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgumentDiagram(ArgumentDiagram object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLink(Link object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rebuts</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rebuts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRebuts(Rebuts object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Mitigates</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mitigates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMitigates(Mitigates object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgument(Argument object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExpression(Expression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Assignment Op</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAssignmentOp(AssignmentOp object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Or Exp</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOrExp(OrExp object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>And Exp</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Exp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAndExp(AndExp object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelational(Relational object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAddition(Addition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMultiplication(Multiplication object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Power</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePower(Power object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseUnaryExpr(UnaryExpr object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Primary Expr</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Primary Expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePrePrimaryExpr(PrePrimaryExpr object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTerminalExpression(TerminalExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Plus</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAssignPlus(AssignPlus object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Assign Min</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assign Min</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAssignMin(AssignMin object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOr(Or object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAnd(And object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Not Eq</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Not Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelNotEq(RelNotEq object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Eq Eq</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Eq Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelEqEq(RelEqEq object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Lt Eq</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Lt Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelLtEq(RelLtEq object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Gt Eq</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Gt Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelGtEq(RelGtEq object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Eq</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Eq</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelEq(RelEq object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Lt</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Lt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelLt(RelLt object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rel Gt</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rel Gt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelGt(RelGt object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePlus(Plus object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMinus(Minus object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMulti(Multi object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDiv(Div object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Pow</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePow(Pow object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseIntLiteral(IntLiteral object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ArgumentSwitch
