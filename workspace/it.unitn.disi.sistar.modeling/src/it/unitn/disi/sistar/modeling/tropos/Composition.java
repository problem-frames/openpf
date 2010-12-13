/**
 * <copyright>
 * </copyright>
 *
 * $Id: Composition.java,v 1.1.1.1 2007/02/24 23:59:02 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Composition#getCompositionType <em>Composition Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Relation {
	/**
	 * Returns the value of the '<em><b>Composition Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.ECompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composition Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composition Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ECompositionType
	 * @see #setCompositionType(ECompositionType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getComposition_CompositionType()
	 * @model default="AND" required="true"
	 * @generated
	 */
	ECompositionType getCompositionType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Composition#getCompositionType <em>Composition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.ECompositionType
	 * @see #getCompositionType()
	 * @generated
	 */
	void setCompositionType(ECompositionType value);

} // Composition