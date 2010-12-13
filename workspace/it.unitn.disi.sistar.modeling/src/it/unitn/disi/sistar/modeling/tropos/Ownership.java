/**
 * <copyright>
 * </copyright>
 *
 * $Id: Ownership.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getOwnershipType <em>Ownership Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getInstantiation <em>Instantiation</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getOwnership()
 * @model
 * @generated
 */
public interface Ownership extends Relation {
	/**
	 * Returns the value of the '<em><b>Ownership Type</b></em>' attribute.
	 * The default value is <code>"OWN"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EOwnershipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ownership Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ownership Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EOwnershipType
	 * @see #setOwnershipType(EOwnershipType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getOwnership_OwnershipType()
	 * @model default="OWN" required="true"
	 * @generated
	 */
	EOwnershipType getOwnershipType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getOwnershipType <em>Ownership Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EOwnershipType
	 * @see #getOwnershipType()
	 * @generated
	 */
	void setOwnershipType(EOwnershipType value);

	/**
	 * Returns the value of the '<em><b>Instantiation</b></em>' attribute.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EInstantiationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiation</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EInstantiationType
	 * @see #setInstantiation(EInstantiationType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getOwnership_Instantiation()
	 * @model required="true"
	 * @generated
	 */
	EInstantiationType getInstantiation();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getInstantiation <em>Instantiation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiation</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EInstantiationType
	 * @see #getInstantiation()
	 * @generated
	 */
	void setInstantiation(EInstantiationType value);

} // Ownership