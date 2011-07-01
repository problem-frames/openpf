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
 *   <li>{@link argument.argument.Rebuts#getOrigin <em>Origin</em>}</li>
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
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Argument)
	 * @see argument.argument.ArgumentPackage#getRebuts_Origin()
	 * @model annotation="gmf.link target='origin' style='dashed' width='1' color='255,105,180' target.decoration='arrow'"
	 * @generated
	 */
  Argument getOrigin();

  /**
	 * Sets the value of the '{@link argument.argument.Rebuts#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
  void setOrigin(Argument value);

} // Rebuts
