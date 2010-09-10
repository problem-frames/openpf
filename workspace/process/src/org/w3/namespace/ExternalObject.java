/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.ExternalObject#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3.namespace.ExternalObject#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.ExternalObject#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.w3.namespace.ExternalObject#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.w3.namespace.ExternalObject#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getExternalObject()
 * @model extendedMetaData="name='external-object_._type' kind='mixed'"
 * @generated
 */
public interface ExternalObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3.namespace.NamespacePackage#getExternalObject_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3.namespace.NamespacePackage#getExternalObject_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Aggregate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregate</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getExternalObject_Aggregate()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<Aggregate> getAggregate();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3.namespace.Encoding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see org.w3.namespace.Encoding
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #setEncoding(Encoding)
	 * @see org.w3.namespace.NamespacePackage#getExternalObject_Encoding()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	Encoding getEncoding();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ExternalObject#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see org.w3.namespace.Encoding
	 * @see #isSetEncoding()
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(Encoding value);

	/**
	 * Unsets the value of the '{@link org.w3.namespace.ExternalObject#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(Encoding)
	 * @generated
	 */
	void unsetEncoding();

	/**
	 * Returns whether the value of the '{@link org.w3.namespace.ExternalObject#getEncoding <em>Encoding</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding</em>' attribute is set.
	 * @see #unsetEncoding()
	 * @see #getEncoding()
	 * @see #setEncoding(Encoding)
	 * @generated
	 */
	boolean isSetEncoding();

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
	 * @see org.w3.namespace.NamespacePackage#getExternalObject_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.ExternalObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // ExternalObject
