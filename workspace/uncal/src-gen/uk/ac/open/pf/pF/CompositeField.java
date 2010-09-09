/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.pf.pF;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.pf.pF.CompositeField#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.pf.pF.PFPackage#getCompositeField()
 * @model
 * @generated
 */
public interface CompositeField extends Field
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(CompositeObject)
   * @see uk.ac.open.pf.pF.PFPackage#getCompositeField_Value()
   * @model containment="true"
   * @generated
   */
  CompositeObject getValue();

  /**
   * Sets the value of the '{@link uk.ac.open.pf.pF.CompositeField#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(CompositeObject value);

} // CompositeField
