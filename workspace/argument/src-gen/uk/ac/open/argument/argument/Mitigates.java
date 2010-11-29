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
 * @model annotation="gmf.link source='from' target='to' label='name' style='solid' width='2' color='0,255,0' target.decoration='arrow'"
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
	 * @model annotation="gmf.link target='rebuttal' label='name' style='dashed' width='1' color='255,105,180' target.decoration='arrow'"
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
