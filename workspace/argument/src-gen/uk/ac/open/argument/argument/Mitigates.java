/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.Mitigates#getRebuttal <em>Rebuttal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getMitigates()
 * @model
 * @generated
 */
public interface Mitigates extends Link
{
  /**
   * Returns the value of the '<em><b>Rebuttal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rebuttal</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rebuttal</em>' reference.
   * @see #setRebuttal(Argument)
   * @see uk.ac.open.argument.argument.ArgumentPackage#getMitigates_Rebuttal()
   * @model
   * @generated
   */
  Argument getRebuttal();

  /**
   * Sets the value of the '{@link uk.ac.open.argument.argument.Mitigates#getRebuttal <em>Rebuttal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rebuttal</em>' reference.
   * @see #getRebuttal()
   * @generated
   */
  void setRebuttal(Argument value);

} // Mitigates
