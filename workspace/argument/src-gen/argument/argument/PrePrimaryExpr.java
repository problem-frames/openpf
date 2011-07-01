/**
 * <copyright>
 * </copyright>
 *
 */
package argument.argument;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Primary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link argument.argument.PrePrimaryExpr#getN <em>N</em>}</li>
 * </ul>
 * </p>
 *
 * @see argument.argument.ArgumentPackage#getPrePrimaryExpr()
 * @model
 * @generated
 */
public interface PrePrimaryExpr extends EObject
{
  /**
	 * Returns the value of the '<em><b>N</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>N</em>' attribute.
	 * @see #setN(int)
	 * @see argument.argument.ArgumentPackage#getPrePrimaryExpr_N()
	 * @model
	 * @generated
	 */
  int getN();

  /**
	 * Sets the value of the '{@link argument.argument.PrePrimaryExpr#getN <em>N</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>N</em>' attribute.
	 * @see #getN()
	 * @generated
	 */
  void setN(int value);

} // PrePrimaryExpr
