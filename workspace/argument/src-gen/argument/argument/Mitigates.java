/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mitigates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.Mitigates#getRestores <em>Restores</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getMitigates()
 * @model annotation="gmf.link source='from' target='to' style='solid' width='2' color='0,255,0' target.decoration='arrow'"
 * @generated
 */
public interface Mitigates extends Link
{
  /**
	 * Returns the value of the '<em><b>Restores</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Restores</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Restores</em>' reference.
	 * @see #setRestores(Argument)
	 * @see argument.argument.ArgumentPackage#getMitigates_Restores()
	 * @model annotation="gmf.link target='restores' style='solid' width='1' color='255,105,180' target.decoration='arrow'"
	 * @generated
	 */
  Argument getRestores();

  /**
	 * Sets the value of the '{@link argument.argument.Mitigates#getRestores <em>Restores</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restores</em>' reference.
	 * @see #getRestores()
	 * @generated
	 */
  void setRestores(Argument value);

} // Mitigates
