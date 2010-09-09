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
 * A representation of the model object '<em><b>Composite Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.pf.pF.CompositeObject#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.pf.pF.PFPackage#getCompositeObject()
 * @model
 * @generated
 */
public interface CompositeObject extends EObject
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.open.pf.pF.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see uk.ac.open.pf.pF.PFPackage#getCompositeObject_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // CompositeObject
