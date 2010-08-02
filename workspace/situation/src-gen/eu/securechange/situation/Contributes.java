/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Contributes#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getContributes()
 * @model
 * @generated
 */
public interface Contributes extends Relationship
{
  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.securechange.situation.ContributionLabel}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.ContributionLabel
	 * @see #setType(ContributionLabel)
	 * @see eu.securechange.situation.SituationPackage#getContributes_Type()
	 * @model
	 * @generated
	 */
  ContributionLabel getType();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.Contributes#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.ContributionLabel
	 * @see #getType()
	 * @generated
	 */
  void setType(ContributionLabel value);

} // Contributes
