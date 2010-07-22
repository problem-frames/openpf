/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.pf.pF;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.pf.pF.RootDiagram#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.pf.pF.RootDiagram#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.pf.pF.PFPackage#getRootDiagram()
 * @model
 * @generated
 */
public interface RootDiagram extends EObject
{
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
   * @see uk.ac.open.pf.pF.PFPackage#getRootDiagram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.open.pf.pF.RootDiagram#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.pf.pF.Node}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see uk.ac.open.pf.pF.PFPackage#getRootDiagram_Objects()
   * @model containment="true"
   * @generated
   */
  EList<Node> getObjects();

} // RootDiagram
