/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.mydsl.arguments.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.arguments.*;

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
 * @see org.xtext.example.mydsl.arguments.ArgumentsPackage
 * @generated
 */
public class ArgumentsSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ArgumentsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ArgumentsPackage.eINSTANCE;
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
      case ArgumentsPackage.ARGUMENT:
      {
        Argument argument = (Argument)theEObject;
        T result = caseArgument(argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArgumentsPackage.REBUTTAL:
      {
        Rebuttal rebuttal = (Rebuttal)theEObject;
        T result = caseRebuttal(rebuttal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArgumentsPackage.GSTATEMENT:
      {
        gStatement gStatement = (gStatement)theEObject;
        T result = casegStatement(gStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArgumentsPackage.WSTATEMENT:
      {
        wStatement wStatement = (wStatement)theEObject;
        T result = casewStatement(wStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ArgumentsPackage.RSTATEMENT:
      {
        rStatement rStatement = (rStatement)theEObject;
        T result = caserStatement(rStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
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
   * Returns the result of interpreting the object as an instance of '<em>Rebuttal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rebuttal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRebuttal(Rebuttal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>gStatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>gStatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casegStatement(gStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>wStatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>wStatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casewStatement(wStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rStatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rStatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserStatement(rStatement object)
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

} //ArgumentsSwitch