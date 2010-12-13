/**
 * <copyright>
 * </copyright>
 *
 * $Id: Contribution.java,v 1.1.1.1 2007/05/17 22:03:42 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getSatType <em>Sat Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getContribution()
 * @model
 * @generated
 */
public interface Contribution extends Relation {
	/**
	 * Returns the value of the '<em><b>Contribution Type</b></em>' attribute.
	 * The default value is <code>"PP"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EContributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contribution Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contribution Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EContributionType
	 * @see #setContributionType(EContributionType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getContribution_ContributionType()
	 * @model default="PP" required="true"
	 * @generated
	 */
	EContributionType getContributionType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getContributionType <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contribution Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EContributionType
	 * @see #getContributionType()
	 * @generated
	 */
	void setContributionType(EContributionType value);

	/**
	 * Returns the value of the '<em><b>Sat Type</b></em>' attribute.
	 * The default value is <code>"NA"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.ESATType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sat Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sat Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ESATType
	 * @see #setSatType(ESATType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getContribution_SatType()
	 * @model default="NA" required="true"
	 * @generated
	 */
	ESATType getSatType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getSatType <em>Sat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sat Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ESATType
	 * @see #getSatType()
	 * @generated
	 */
	void setSatType(ESATType value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getContribution_Weight()
	 * @model default="0" required="true"
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * The default value is <code>"CONTRIBUTION"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.ERelationshipType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ERelationshipType
	 * @see #setRelationshipType(ERelationshipType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getContribution_RelationshipType()
	 * @model default="CONTRIBUTION" required="true"
	 * @generated
	 */
	ERelationshipType getRelationshipType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ERelationshipType
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(ERelationshipType value);

} // Contribution