/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.w3.namespace.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage
 * @generated
 */
public class NamespaceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NamespacePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NamespacePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceSwitch<Adapter> modelSwitch =
		new NamespaceSwitch<Adapter>() {
			@Override
			public Adapter caseAborter(Aborter object) {
				return createAborterAdapter();
			}
			@Override
			public Adapter caseAggregate(Aggregate object) {
				return createAggregateAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseBinding(Binding object) {
				return createBindingAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter caseChannelBinding(ChannelBinding object) {
				return createChannelBindingAdapter();
			}
			@Override
			public Adapter caseConnector(Connector object) {
				return createConnectorAdapter();
			}
			@Override
			public Adapter caseConstantBinding(ConstantBinding object) {
				return createConstantBindingAdapter();
			}
			@Override
			public Adapter caseControlParameter(ControlParameter object) {
				return createControlParameterAdapter();
			}
			@Override
			public Adapter caseDiagram(Diagram object) {
				return createDiagramAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExport(Export object) {
				return createExportAdapter();
			}
			@Override
			public Adapter caseExternalObject(ExternalObject object) {
				return createExternalObjectAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseHandlerConnector(HandlerConnector object) {
				return createHandlerConnectorAdapter();
			}
			@Override
			public Adapter caseImport(Import object) {
				return createImportAdapter();
			}
			@Override
			public Adapter caseInterfaceDecl(InterfaceDecl object) {
				return createInterfaceDeclAdapter();
			}
			@Override
			public Adapter caseLittlejil(Littlejil object) {
				return createLittlejilAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseMetadata(Metadata object) {
				return createMetadataAdapter();
			}
			@Override
			public Adapter caseModule(Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseNullAggregate(NullAggregate object) {
				return createNullAggregateAdapter();
			}
			@Override
			public Adapter casePostIt(PostIt object) {
				return createPostItAdapter();
			}
			@Override
			public Adapter casePredicateExpression(PredicateExpression object) {
				return createPredicateExpressionAdapter();
			}
			@Override
			public Adapter caseReactionConnector(ReactionConnector object) {
				return createReactionConnectorAdapter();
			}
			@Override
			public Adapter caseRequisiteConnector(RequisiteConnector object) {
				return createRequisiteConnectorAdapter();
			}
			@Override
			public Adapter caseScopeBinding(ScopeBinding object) {
				return createScopeBindingAdapter();
			}
			@Override
			public Adapter caseSimpleRequisiteConnector(SimpleRequisiteConnector object) {
				return createSimpleRequisiteConnectorAdapter();
			}
			@Override
			public Adapter caseStepDeclaration(StepDeclaration object) {
				return createStepDeclarationAdapter();
			}
			@Override
			public Adapter caseStepReference(StepReference object) {
				return createStepReferenceAdapter();
			}
			@Override
			public Adapter caseSubstepConnector(SubstepConnector object) {
				return createSubstepConnectorAdapter();
			}
			@Override
			public Adapter caseTaggedLocation(TaggedLocation object) {
				return createTaggedLocationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Aborter <em>Aborter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Aborter
	 * @generated
	 */
	public Adapter createAborterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Aggregate
	 * @generated
	 */
	public Adapter createAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Binding
	 * @generated
	 */
	public Adapter createBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ChannelBinding <em>Channel Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ChannelBinding
	 * @generated
	 */
	public Adapter createChannelBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Connector
	 * @generated
	 */
	public Adapter createConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ConstantBinding <em>Constant Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ConstantBinding
	 * @generated
	 */
	public Adapter createConstantBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ControlParameter <em>Control Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ControlParameter
	 * @generated
	 */
	public Adapter createControlParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Diagram
	 * @generated
	 */
	public Adapter createDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ExternalObject <em>External Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ExternalObject
	 * @generated
	 */
	public Adapter createExternalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.HandlerConnector <em>Handler Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.HandlerConnector
	 * @generated
	 */
	public Adapter createHandlerConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.InterfaceDecl <em>Interface Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.InterfaceDecl
	 * @generated
	 */
	public Adapter createInterfaceDeclAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Littlejil <em>Littlejil</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Littlejil
	 * @generated
	 */
	public Adapter createLittlejilAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.NullAggregate <em>Null Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.NullAggregate
	 * @generated
	 */
	public Adapter createNullAggregateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.PostIt <em>Post It</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.PostIt
	 * @generated
	 */
	public Adapter createPostItAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.PredicateExpression <em>Predicate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.PredicateExpression
	 * @generated
	 */
	public Adapter createPredicateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ReactionConnector <em>Reaction Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ReactionConnector
	 * @generated
	 */
	public Adapter createReactionConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.RequisiteConnector <em>Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.RequisiteConnector
	 * @generated
	 */
	public Adapter createRequisiteConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.ScopeBinding <em>Scope Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.ScopeBinding
	 * @generated
	 */
	public Adapter createScopeBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.SimpleRequisiteConnector <em>Simple Requisite Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.SimpleRequisiteConnector
	 * @generated
	 */
	public Adapter createSimpleRequisiteConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.StepDeclaration <em>Step Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.StepDeclaration
	 * @generated
	 */
	public Adapter createStepDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.StepReference <em>Step Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.StepReference
	 * @generated
	 */
	public Adapter createStepReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.SubstepConnector <em>Substep Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.SubstepConnector
	 * @generated
	 */
	public Adapter createSubstepConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3.namespace.TaggedLocation <em>Tagged Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3.namespace.TaggedLocation
	 * @generated
	 */
	public Adapter createTaggedLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NamespaceAdapterFactory
