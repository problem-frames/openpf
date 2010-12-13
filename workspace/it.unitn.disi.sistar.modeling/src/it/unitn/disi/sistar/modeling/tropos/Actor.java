/**
 * <copyright>
 * </copyright>
 *
 * $Id: Actor.java,v 1.1.1.1 2007/06/11 20:55:16 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Actor#getActorType <em>Actor Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Actor#getServices <em>Services</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends GraphicalObject {
	/**
	 * Returns the value of the '<em><b>Actor Type</b></em>' attribute.
	 * The default value is <code>"AGENT"</code>.
	 * The literals are from the enumeration {@link it.unitn.disi.sistar.modeling.tropos.EActorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EActorType
	 * @see #setActorType(EActorType)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getActor_ActorType()
	 * @model default="AGENT" required="true"
	 * @generated
	 */
	EActorType getActorType();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Actor#getActorType <em>Actor Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor Type</em>' attribute.
	 * @see it.unitn.disi.sistar.modeling.tropos.EActorType
	 * @see #getActorType()
	 * @generated
	 */
	void setActorType(EActorType value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link it.unitn.disi.sistar.modeling.tropos.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getActor_Services()
	 * @model type="it.unitn.disi.sistar.modeling.tropos.Service" containment="true"
	 * @generated
	 */
	EList getServices();

} // Actor