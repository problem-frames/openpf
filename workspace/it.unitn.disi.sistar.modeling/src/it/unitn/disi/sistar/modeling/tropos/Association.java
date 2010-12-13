/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.1.1.1 2007/02/24 23:59:02 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Association#getAssociationType <em>Association Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Relation {
	/**
	 * Returns the value of the '<em><b>Association Type</b></em>' attribute.
	 * The default value is <code>"IS_PART_OF"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EAssociationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EAssociationType
	 * @see #setAssociationType(EAssociationType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getAssociation_AssociationType()
	 * @model default="IS_PART_OF" required="true"
	 * @generated
	 */
	EAssociationType getAssociationType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Association#getAssociationType <em>Association Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EAssociationType
	 * @see #getAssociationType()
	 * @generated
	 */
	void setAssociationType(EAssociationType value);

} // Association