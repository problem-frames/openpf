/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.event.eventcalculus.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.open.event.eventcalculus.*;

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
 * @see uk.ac.open.event.eventcalculus.EventcalculusPackage
 * @generated
 */
public class EventcalculusSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EventcalculusPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventcalculusSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EventcalculusPackage.eINSTANCE;
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
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
    switch (classifierID)
    {
      case EventcalculusPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DECLARATION:
      {
        Declaration declaration = (Declaration)theEObject;
        T result = caseDeclaration(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEF_SORT:
      {
        DefSort defSort = (DefSort)theEObject;
        T result = caseDefSort(defSort);
        if (result == null) result = caseDeclaration(defSort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEF_RANGE:
      {
        DefRange defRange = (DefRange)theEObject;
        T result = caseDefRange(defRange);
        if (result == null) result = caseDeclaration(defRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEF_OPTION:
      {
        DefOption defOption = (DefOption)theEObject;
        T result = caseDefOption(defOption);
        if (result == null) result = caseDeclaration(defOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEF_COMPLETION:
      {
        DefCompletion defCompletion = (DefCompletion)theEObject;
        T result = caseDefCompletion(defCompletion);
        if (result == null) result = caseDeclaration(defCompletion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEF_NON_INERTIA:
      {
        DefNonInertia defNonInertia = (DefNonInertia)theEObject;
        T result = caseDefNonInertia(defNonInertia);
        if (result == null) result = caseDeclaration(defNonInertia);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.SORT_DEFINITION:
      {
        SortDefinition sortDefinition = (SortDefinition)theEObject;
        T result = caseSortDefinition(sortDefinition);
        if (result == null) result = caseStatement(sortDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DECLARED_PARAMETER:
      {
        DeclaredParameter declaredParameter = (DeclaredParameter)theEObject;
        T result = caseDeclaredParameter(declaredParameter);
        if (result == null) result = caseExpression(declaredParameter);
        if (result == null) result = caseStatement(declaredParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseStatement(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.QUALIFIER:
      {
        Qualifier qualifier = (Qualifier)theEObject;
        T result = caseQualifier(qualifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.EXISTS:
      {
        Exists exists = (Exists)theEObject;
        T result = caseExists(exists);
        if (result == null) result = caseQualifier(exists);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.FORALL:
      {
        Forall forall = (Forall)theEObject;
        T result = caseForall(forall);
        if (result == null) result = caseQualifier(forall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.TERMINAL_EXPRESSION:
      {
        TerminalExpression terminalExpression = (TerminalExpression)theEObject;
        T result = caseTerminalExpression(terminalExpression);
        if (result == null) result = caseExpression(terminalExpression);
        if (result == null) result = caseStatement(terminalExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.ASSIGN_PLUS:
      {
        AssignPlus assignPlus = (AssignPlus)theEObject;
        T result = caseAssignPlus(assignPlus);
        if (result == null) result = caseExpression(assignPlus);
        if (result == null) result = caseStatement(assignPlus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.ASSIGN_MIN:
      {
        AssignMin assignMin = (AssignMin)theEObject;
        T result = caseAssignMin(assignMin);
        if (result == null) result = caseExpression(assignMin);
        if (result == null) result = caseStatement(assignMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = caseStatement(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = caseStatement(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_NOT_EQ:
      {
        RelNotEq relNotEq = (RelNotEq)theEObject;
        T result = caseRelNotEq(relNotEq);
        if (result == null) result = caseExpression(relNotEq);
        if (result == null) result = caseStatement(relNotEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_EQ_EQ:
      {
        RelEqEq relEqEq = (RelEqEq)theEObject;
        T result = caseRelEqEq(relEqEq);
        if (result == null) result = caseExpression(relEqEq);
        if (result == null) result = caseStatement(relEqEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_LT_EQ:
      {
        RelLtEq relLtEq = (RelLtEq)theEObject;
        T result = caseRelLtEq(relLtEq);
        if (result == null) result = caseExpression(relLtEq);
        if (result == null) result = caseStatement(relLtEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_GT_EQ:
      {
        RelGtEq relGtEq = (RelGtEq)theEObject;
        T result = caseRelGtEq(relGtEq);
        if (result == null) result = caseExpression(relGtEq);
        if (result == null) result = caseStatement(relGtEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_EQ:
      {
        RelEq relEq = (RelEq)theEObject;
        T result = caseRelEq(relEq);
        if (result == null) result = caseExpression(relEq);
        if (result == null) result = caseStatement(relEq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_LT:
      {
        RelLt relLt = (RelLt)theEObject;
        T result = caseRelLt(relLt);
        if (result == null) result = caseExpression(relLt);
        if (result == null) result = caseStatement(relLt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.REL_GT:
      {
        RelGt relGt = (RelGt)theEObject;
        T result = caseRelGt(relGt);
        if (result == null) result = caseExpression(relGt);
        if (result == null) result = caseStatement(relGt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = caseStatement(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = caseStatement(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = caseStatement(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseExpression(div);
        if (result == null) result = caseStatement(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.POW:
      {
        Pow pow = (Pow)theEObject;
        T result = casePow(pow);
        if (result == null) result = caseExpression(pow);
        if (result == null) result = caseStatement(pow);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.FUNCTION_REF:
      {
        FunctionRef functionRef = (FunctionRef)theEObject;
        T result = caseFunctionRef(functionRef);
        if (result == null) result = caseExpression(functionRef);
        if (result == null) result = caseStatement(functionRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.INT_LITERAL:
      {
        IntLiteral intLiteral = (IntLiteral)theEObject;
        T result = caseIntLiteral(intLiteral);
        if (result == null) result = caseTerminalExpression(intLiteral);
        if (result == null) result = caseExpression(intLiteral);
        if (result == null) result = caseStatement(intLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseTerminalExpression(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseStatement(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EventcalculusPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseTerminalExpression(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = caseStatement(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaration(Declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Sort</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Sort</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefSort(DefSort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefRange(DefRange object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefOption(DefOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Completion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Completion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefCompletion(DefCompletion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Def Non Inertia</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Def Non Inertia</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefNonInertia(DefNonInertia object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sort Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSortDefinition(SortDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Declared Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeclaredParameter(DeclaredParameter object)
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
   * Returns the result of interpreting the object as an instance of '<em>Qualifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifier(Qualifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exists</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exists</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExists(Exists object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Forall</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Forall</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForall(Forall object)
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
   * Returns the result of interpreting the object as an instance of '<em>Function Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionRef(FunctionRef object)
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
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
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

} //EventcalculusSwitch
