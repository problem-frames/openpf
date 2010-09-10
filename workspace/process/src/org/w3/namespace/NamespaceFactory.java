/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage
 * @generated
 */
public interface NamespaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NamespaceFactory eINSTANCE = org.w3.namespace.impl.NamespaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aborter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aborter</em>'.
	 * @generated
	 */
	Aborter createAborter();

	/**
	 * Returns a new object of class '<em>Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate</em>'.
	 * @generated
	 */
	Aggregate createAggregate();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding</em>'.
	 * @generated
	 */
	Binding createBinding();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	Cardinality createCardinality();

	/**
	 * Returns a new object of class '<em>Channel Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel Binding</em>'.
	 * @generated
	 */
	ChannelBinding createChannelBinding();

	/**
	 * Returns a new object of class '<em>Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector</em>'.
	 * @generated
	 */
	Connector createConnector();

	/**
	 * Returns a new object of class '<em>Constant Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Binding</em>'.
	 * @generated
	 */
	ConstantBinding createConstantBinding();

	/**
	 * Returns a new object of class '<em>Control Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Parameter</em>'.
	 * @generated
	 */
	ControlParameter createControlParameter();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	Diagram createDiagram();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Export</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Export</em>'.
	 * @generated
	 */
	Export createExport();

	/**
	 * Returns a new object of class '<em>External Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Object</em>'.
	 * @generated
	 */
	ExternalObject createExternalObject();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Handler Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Handler Connector</em>'.
	 * @generated
	 */
	HandlerConnector createHandlerConnector();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Interface Decl</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Decl</em>'.
	 * @generated
	 */
	InterfaceDecl createInterfaceDecl();

	/**
	 * Returns a new object of class '<em>Littlejil</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Littlejil</em>'.
	 * @generated
	 */
	Littlejil createLittlejil();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata</em>'.
	 * @generated
	 */
	Metadata createMetadata();

	/**
	 * Returns a new object of class '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Module</em>'.
	 * @generated
	 */
	Module createModule();

	/**
	 * Returns a new object of class '<em>Null Aggregate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Aggregate</em>'.
	 * @generated
	 */
	NullAggregate createNullAggregate();

	/**
	 * Returns a new object of class '<em>Post It</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Post It</em>'.
	 * @generated
	 */
	PostIt createPostIt();

	/**
	 * Returns a new object of class '<em>Predicate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Expression</em>'.
	 * @generated
	 */
	PredicateExpression createPredicateExpression();

	/**
	 * Returns a new object of class '<em>Reaction Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reaction Connector</em>'.
	 * @generated
	 */
	ReactionConnector createReactionConnector();

	/**
	 * Returns a new object of class '<em>Requisite Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requisite Connector</em>'.
	 * @generated
	 */
	RequisiteConnector createRequisiteConnector();

	/**
	 * Returns a new object of class '<em>Scope Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Binding</em>'.
	 * @generated
	 */
	ScopeBinding createScopeBinding();

	/**
	 * Returns a new object of class '<em>Simple Requisite Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Requisite Connector</em>'.
	 * @generated
	 */
	SimpleRequisiteConnector createSimpleRequisiteConnector();

	/**
	 * Returns a new object of class '<em>Step Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Declaration</em>'.
	 * @generated
	 */
	StepDeclaration createStepDeclaration();

	/**
	 * Returns a new object of class '<em>Step Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step Reference</em>'.
	 * @generated
	 */
	StepReference createStepReference();

	/**
	 * Returns a new object of class '<em>Substep Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substep Connector</em>'.
	 * @generated
	 */
	SubstepConnector createSubstepConnector();

	/**
	 * Returns a new object of class '<em>Tagged Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tagged Location</em>'.
	 * @generated
	 */
	TaggedLocation createTaggedLocation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NamespacePackage getNamespacePackage();

} //NamespaceFactory
