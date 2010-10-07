/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getWarrants <em>Warrants</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getStr <em>Str</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getRebutts <em>Rebutts</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends EObject
{
  /**
   * Returns the value of the '<em><b>Grounds</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grounds</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grounds</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Grounds()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getGrounds();

  /**
   * Returns the value of the '<em><b>Warrants</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Warrants</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Warrants</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Warrants()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getWarrants();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Str</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Str</em>' attribute.
   * @see #setStr(String)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Str()
   * @model
   * @generated
   */
  String getStr();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getStr <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Str</em>' attribute.
   * @see #getStr()
   * @generated
   */
  void setStr(String value);

  /**
   * Returns the value of the '<em><b>Rebutts</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rebutts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rebutts</em>' containment reference list.
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Rebutts()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getRebutts();

} // Argument
