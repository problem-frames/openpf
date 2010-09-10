/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3.namespace.Connector#getRequisiteConnector <em>Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getSubstepConnector <em>Substep Connector</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getReactionConnector <em>Reaction Connector</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getHandlerConnector <em>Handler Connector</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getStepDeclaration <em>Step Declaration</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getStepReference <em>Step Reference</em>}</li>
 *   <li>{@link org.w3.namespace.Connector#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3.namespace.NamespacePackage#getConnector()
 * @model extendedMetaData="name='connector_._type' kind='elementOnly'"
 * @generated
 */
public interface Connector extends EObject {
	/**
	 * Returns the value of the '<em><b>Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requisite Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requisite Connector</em>' containment reference.
	 * @see #setRequisiteConnector(RequisiteConnector)
	 * @see org.w3.namespace.NamespacePackage#getConnector_RequisiteConnector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requisite-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	RequisiteConnector getRequisiteConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getRequisiteConnector <em>Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requisite Connector</em>' containment reference.
	 * @see #getRequisiteConnector()
	 * @generated
	 */
	void setRequisiteConnector(RequisiteConnector value);

	/**
	 * Returns the value of the '<em><b>Simple Requisite Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple Requisite Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple Requisite Connector</em>' containment reference.
	 * @see #setSimpleRequisiteConnector(SimpleRequisiteConnector)
	 * @see org.w3.namespace.NamespacePackage#getConnector_SimpleRequisiteConnector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simple-requisite-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleRequisiteConnector getSimpleRequisiteConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getSimpleRequisiteConnector <em>Simple Requisite Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Requisite Connector</em>' containment reference.
	 * @see #getSimpleRequisiteConnector()
	 * @generated
	 */
	void setSimpleRequisiteConnector(SimpleRequisiteConnector value);

	/**
	 * Returns the value of the '<em><b>Substep Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Substep Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Substep Connector</em>' containment reference.
	 * @see #setSubstepConnector(SubstepConnector)
	 * @see org.w3.namespace.NamespacePackage#getConnector_SubstepConnector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='substep-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	SubstepConnector getSubstepConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getSubstepConnector <em>Substep Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substep Connector</em>' containment reference.
	 * @see #getSubstepConnector()
	 * @generated
	 */
	void setSubstepConnector(SubstepConnector value);

	/**
	 * Returns the value of the '<em><b>Reaction Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reaction Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reaction Connector</em>' containment reference.
	 * @see #setReactionConnector(ReactionConnector)
	 * @see org.w3.namespace.NamespacePackage#getConnector_ReactionConnector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reaction-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	ReactionConnector getReactionConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getReactionConnector <em>Reaction Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaction Connector</em>' containment reference.
	 * @see #getReactionConnector()
	 * @generated
	 */
	void setReactionConnector(ReactionConnector value);

	/**
	 * Returns the value of the '<em><b>Handler Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Connector</em>' containment reference.
	 * @see #setHandlerConnector(HandlerConnector)
	 * @see org.w3.namespace.NamespacePackage#getConnector_HandlerConnector()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='handler-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	HandlerConnector getHandlerConnector();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getHandlerConnector <em>Handler Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Connector</em>' containment reference.
	 * @see #getHandlerConnector()
	 * @generated
	 */
	void setHandlerConnector(HandlerConnector value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3.namespace.Binding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see org.w3.namespace.NamespacePackage#getConnector_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Step Declaration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Declaration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Declaration</em>' containment reference.
	 * @see #setStepDeclaration(StepDeclaration)
	 * @see org.w3.namespace.NamespacePackage#getConnector_StepDeclaration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step-declaration' namespace='##targetNamespace'"
	 * @generated
	 */
	StepDeclaration getStepDeclaration();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getStepDeclaration <em>Step Declaration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Declaration</em>' containment reference.
	 * @see #getStepDeclaration()
	 * @generated
	 */
	void setStepDeclaration(StepDeclaration value);

	/**
	 * Returns the value of the '<em><b>Step Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step Reference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Reference</em>' containment reference.
	 * @see #setStepReference(StepReference)
	 * @see org.w3.namespace.NamespacePackage#getConnector_StepReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='step-reference' namespace='##targetNamespace'"
	 * @generated
	 */
	StepReference getStepReference();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getStepReference <em>Step Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Reference</em>' containment reference.
	 * @see #getStepReference()
	 * @generated
	 */
	void setStepReference(StepReference value);

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
	 * @see org.w3.namespace.NamespacePackage#getConnector_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3.namespace.Connector#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Connector
