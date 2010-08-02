/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decomposes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Decomposes#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getDecomposes()
 * @model
 * @generated
 */
public interface Decomposes extends Relationship
{
  /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.securechange.situation.DecompositionLabel}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.DecompositionLabel
	 * @see #setType(DecompositionLabel)
	 * @see eu.securechange.situation.SituationPackage#getDecomposes_Type()
	 * @model
	 * @generated
	 */
  DecompositionLabel getType();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.Decomposes#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see eu.securechange.situation.DecompositionLabel
	 * @see #getType()
	 * @generated
	 */
  void setType(DecompositionLabel value);

} // Decomposes
