/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rebuts</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.Rebuts#getDenies <em>Denies</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getRebuts()
 * @model annotation="gmf.link source='from' target='to' style='dot' width='2' color='255,0,0' target.decoration='arrow'"
 * @generated
 */
public interface Rebuts extends Link
{
  /**
	 * Returns the value of the '<em><b>Denies</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Denies</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Denies</em>' reference.
	 * @see #setDenies(Argument)
	 * @see argument.argument.ArgumentPackage#getRebuts_Denies()
	 * @model annotation="gmf.link target='denies' style='dashed' width='1' color='255,105,180' target.decoration='arrow'"
	 * @generated
	 */
  Argument getDenies();

  /**
	 * Sets the value of the '{@link argument.argument.Rebuts#getDenies <em>Denies</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denies</em>' reference.
	 * @see #getDenies()
	 * @generated
	 */
  void setDenies(Argument value);

} // Rebuts
