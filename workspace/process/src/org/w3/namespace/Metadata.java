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
 * A representation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Metadata#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.Metadata#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.w3.namespace.Metadata#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getMetadata()
 * @model extendedMetaData="name='metadata_._type' kind='elementOnly'"
 * @generated
 */
public interface Metadata extends EObject {
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
	 * @see org.w3.namespace.NamespacePackage#getMetadata_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Annotation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getMetadata_Annotation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='annotation' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Annotation> getAnnotation();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Diagram}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getMetadata_Diagram()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='diagram' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Diagram> getDiagram();

} // Metadata
