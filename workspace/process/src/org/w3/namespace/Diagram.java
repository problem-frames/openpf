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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Diagram#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3.namespace.Diagram#getPostIt <em>Post It</em>}</li>
 *   <li>{@link org.w3.namespace.Diagram#getLocation <em>Location</em>}</li>
 *   <li>{@link org.w3.namespace.Diagram#getTaggedLocation <em>Tagged Location</em>}</li>
 *   <li>{@link org.w3.namespace.Diagram#getId <em>Id</em>}</li>
 *   <li>{@link org.w3.namespace.Diagram#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getDiagram()
 * @model extendedMetaData="name='diagram_._type' kind='elementOnly'"
 * @generated
 */
public interface Diagram extends EObject {
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
	 * @see org.w3.namespace.NamespacePackage#getDiagram_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Post It</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.PostIt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post It</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post It</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getDiagram_PostIt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='post-it' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PostIt> getPostIt();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Location}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getDiagram_Location()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Tagged Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.TaggedLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tagged Location</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tagged Location</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getDiagram_TaggedLocation()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tagged-location' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<TaggedLocation> getTaggedLocation();

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
	 * @see org.w3.namespace.NamespacePackage#getDiagram_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Diagram#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.w3.namespace.NamespacePackage#getDiagram_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Diagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Diagram
