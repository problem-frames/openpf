/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.pf.pF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.pf.pF.RootDiagram#getObjects <em>Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.pf.pF.PFPackage#getRootDiagram()
 * @model
 * @generated
 */
public interface RootDiagram extends Node
{
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
