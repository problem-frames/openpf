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
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Binding#getScopeBinding <em>Scope Binding</em>}</li>
 *   <li>{@link org.w3.namespace.Binding#getChannelBinding <em>Channel Binding</em>}</li>
 *   <li>{@link org.w3.namespace.Binding#getConstantBinding <em>Constant Binding</em>}</li>
 *   <li>{@link org.w3.namespace.Binding#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.Binding#getNameInChild <em>Name In Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getBinding()
 * @model extendedMetaData="name='binding_._type' kind='elementOnly'"
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Scope Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope Binding</em>' containment reference.
	 * @see #setScopeBinding(ScopeBinding)
	 * @see org.w3.namespace.NamespacePackage#getBinding_ScopeBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scope-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ScopeBinding getScopeBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Binding#getScopeBinding <em>Scope Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope Binding</em>' containment reference.
	 * @see #getScopeBinding()
	 * @generated
	 */
	void setScopeBinding(ScopeBinding value);

	/**
	 * Returns the value of the '<em><b>Channel Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Binding</em>' containment reference.
	 * @see #setChannelBinding(ChannelBinding)
	 * @see org.w3.namespace.NamespacePackage#getBinding_ChannelBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='channel-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ChannelBinding getChannelBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Binding#getChannelBinding <em>Channel Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Binding</em>' containment reference.
	 * @see #getChannelBinding()
	 * @generated
	 */
	void setChannelBinding(ChannelBinding value);

	/**
	 * Returns the value of the '<em><b>Constant Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Binding</em>' containment reference.
	 * @see #setConstantBinding(ConstantBinding)
	 * @see org.w3.namespace.NamespacePackage#getBinding_ConstantBinding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='constant-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	ConstantBinding getConstantBinding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Binding#getConstantBinding <em>Constant Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Binding</em>' containment reference.
	 * @see #getConstantBinding()
	 * @generated
	 */
	void setConstantBinding(ConstantBinding value);

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
	 * @see org.w3.namespace.NamespacePackage#getBinding_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Binding#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name In Child</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name In Child</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name In Child</em>' attribute.
	 * @see #setNameInChild(String)
	 * @see org.w3.namespace.NamespacePackage#getBinding_NameInChild()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name-in-child'"
	 * @generated
	 */
	String getNameInChild();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Binding#getNameInChild <em>Name In Child</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name In Child</em>' attribute.
	 * @see #getNameInChild()
	 * @generated
	 */
	void setNameInChild(String value);

} // Binding
