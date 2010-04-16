/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.problem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uk.ac.open.problem.OtherLanguage#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.OtherLanguage#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 *
 * @see uk.ac.open.problem.ProblemPackage#getOtherLanguage()
 * @model
 * @generated
 */
public interface OtherLanguage extends EObject
{
  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see uk.ac.open.problem.ProblemPackage#getOtherLanguage_Type()
	 * @model
	 * @generated
	 */
  String getType();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.OtherLanguage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
  void setType(String value);

  /**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Href</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see uk.ac.open.problem.ProblemPackage#getOtherLanguage_Href()
	 * @model
	 * @generated
	 */
  String getHref();

  /**
	 * Sets the value of the '{@link uk.ac.open.problem.OtherLanguage#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
  void setHref(String value);

} // OtherLanguage
