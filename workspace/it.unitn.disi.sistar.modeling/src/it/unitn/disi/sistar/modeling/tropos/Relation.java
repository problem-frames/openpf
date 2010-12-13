/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relation.java,v 1.1.1.1 2007/02/25 22:46:39 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Relation#getSource <em>Source</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends GraphicalObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(GraphicalObject)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getRelation_Source()
	 * @model required="true"
	 * @generated
	 */
	GraphicalObject getSource();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Relation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(GraphicalObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(GraphicalObject)
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getRelation_Target()
	 * @model required="true"
	 * @generated
	 */
	GraphicalObject getTarget();

	/**
	 * Sets the value of the '{@link it.unitn.disi.sistar.modeling.tropos.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(GraphicalObject value);

} // Relation