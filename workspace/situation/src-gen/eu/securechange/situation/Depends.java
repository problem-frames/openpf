/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.securechange.situation.Depends#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.securechange.situation.SituationPackage#getDepends()
 * @model
 * @generated
 */
public interface Depends extends Relationship
{
  /**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link eu.securechange.situation.DependencyType}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see eu.securechange.situation.DependencyType
	 * @see #setKind(DependencyType)
	 * @see eu.securechange.situation.SituationPackage#getDepends_Kind()
	 * @model
	 * @generated
	 */
  DependencyType getKind();

  /**
	 * Sets the value of the '{@link eu.securechange.situation.Depends#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see eu.securechange.situation.DependencyType
	 * @see #getKind()
	 * @generated
	 */
  void setKind(DependencyType value);

} // Depends
