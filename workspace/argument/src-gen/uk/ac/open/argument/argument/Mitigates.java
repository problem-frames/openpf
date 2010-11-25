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
 *   <li>{@link uk.ac.open.argument.argument.Mitigates#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.Mitigates#getRebuttal <em>Rebuttal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.argument.argument.ArgumentPackage#getMitigates()
 * @model annotation="gmf.link source='from' target='to' label='name' style='solid' width='2' color='0,0,255' target.decoration='arrow'"
 * @generated
 */
public interface Mitigates extends Link
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
	 * @see uk.ac.open.argument.argument.ArgumentPackage#getMitigates_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link uk.ac.open.argument.argument.Mitigates#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

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
