/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Argument#getWarrants <em>Warrants</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument()
 * @model
 * @generated
 */
public interface Argument extends Node
{
  /**
   * Returns the value of the '<em><b>Round</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Round</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Round</em>' attribute.
   * @see #setRound(String)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getArgument_Round()
   * @model
   * @generated
   */
  String getRound();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Argument#getRound <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Round</em>' attribute.
   * @see #getRound()
   * @generated
   */
  void setRound(String value);

  /**
   * Returns the value of the '<em><b>Grounds</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Fact}.
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
  EList<Fact> getGrounds();

  /**
   * Returns the value of the '<em><b>Warrants</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.argument.argument.Argument}.
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
  EList<Argument> getWarrants();

} // Argument
