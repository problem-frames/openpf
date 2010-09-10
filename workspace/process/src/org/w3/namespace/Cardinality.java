/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Cardinality#getControlParameter <em>Control Parameter</em>}</li>
 *   <li>{@link org.w3.namespace.Cardinality#getPredicateExpression <em>Predicate Expression</em>}</li>
 *   <li>{@link org.w3.namespace.Cardinality#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.Cardinality#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.w3.namespace.Cardinality#getUpperBound <em>Upper Bound</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getCardinality()
 * @model extendedMetaData="name='cardinality_._type' kind='elementOnly'"
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Control Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Parameter</em>' containment reference.
	 * @see #setControlParameter(ControlParameter)
	 * @see org.w3.namespace.NamespacePackage#getCardinality_ControlParameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='control-parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ControlParameter getControlParameter();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Cardinality#getControlParameter <em>Control Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Parameter</em>' containment reference.
	 * @see #getControlParameter()
	 * @generated
	 */
	void setControlParameter(ControlParameter value);

	/**
	 * Returns the value of the '<em><b>Predicate Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predicate Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predicate Expression</em>' containment reference.
	 * @see #setPredicateExpression(PredicateExpression)
	 * @see org.w3.namespace.NamespacePackage#getCardinality_PredicateExpression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='predicate-expression' namespace='##targetNamespace'"
	 * @generated
	 */
	PredicateExpression getPredicateExpression();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Cardinality#getPredicateExpression <em>Predicate Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Predicate Expression</em>' containment reference.
	 * @see #getPredicateExpression()
	 * @generated
	 */
	void setPredicateExpression(PredicateExpression value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3.namespace.NamespacePackage#getCardinality_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Cardinality#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(String)
	 * @see org.w3.namespace.NamespacePackage#getCardinality_LowerBound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='lower-bound'"
	 * @generated
	 */
	String getLowerBound();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Cardinality#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(String value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(String)
	 * @see org.w3.namespace.NamespacePackage#getCardinality_UpperBound()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='upper-bound'"
	 * @generated
	 */
	String getUpperBound();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Cardinality#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(String value);

} // Cardinality
