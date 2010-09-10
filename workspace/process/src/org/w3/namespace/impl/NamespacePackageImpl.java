/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace.impl;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.w3.namespace.Aborter;
import org.w3.namespace.Aggregate;
import org.w3.namespace.Annotation;
import org.w3.namespace.Binding;
import org.w3.namespace.Cardinality;
import org.w3.namespace.ChannelBinding;
import org.w3.namespace.Connector;
import org.w3.namespace.ConstantBinding;
import org.w3.namespace.ContinuationAction;
import org.w3.namespace.ControlParameter;
import org.w3.namespace.Diagram;
import org.w3.namespace.DocumentRoot;
import org.w3.namespace.Encoding;
import org.w3.namespace.Export;
import org.w3.namespace.ExternalObject;
import org.w3.namespace.Field;
import org.w3.namespace.HandlerConnector;
import org.w3.namespace.Import;
import org.w3.namespace.InterfaceDecl;
import org.w3.namespace.Kind;
import org.w3.namespace.Kind1;
import org.w3.namespace.Kind2;
import org.w3.namespace.Kind3;
import org.w3.namespace.Kind4;
import org.w3.namespace.Littlejil;
import org.w3.namespace.Location;
import org.w3.namespace.Metadata;
import org.w3.namespace.Module;
import org.w3.namespace.NamespaceFactory;
import org.w3.namespace.NamespacePackage;
import org.w3.namespace.NullAggregate;
import org.w3.namespace.PostIt;
import org.w3.namespace.PreOrPost;
import org.w3.namespace.PreOrPost1;
import org.w3.namespace.PredicateExpression;
import org.w3.namespace.ReactionConnector;
import org.w3.namespace.RequisiteConnector;
import org.w3.namespace.ScopeBinding;
import org.w3.namespace.SimpleRequisiteConnector;
import org.w3.namespace.StepDeclaration;
import org.w3.namespace.StepReference;
import org.w3.namespace.SubstepConnector;
import org.w3.namespace.TaggedLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespacePackageImpl extends EPackageImpl implements NamespacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aborterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass channelBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass handlerConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceDeclEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass littlejilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullAggregateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postItEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactionConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requisiteConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRequisiteConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substepConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taggedLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum continuationActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum encodingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kind1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kind2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kind3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kind4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preOrPostEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preOrPost1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType continuationActionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType encodingObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindObject2EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindObject3EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kindObject4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preOrPostObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType preOrPostObject1EDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.w3.namespace.NamespacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NamespacePackageImpl() {
		super(eNS_URI, NamespaceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NamespacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NamespacePackage init() {
		if (isInited) return (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);

		// Obtain or create and register package
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NamespacePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNamespacePackage.createPackageContents();

		// Initialize created meta-data
		theNamespacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNamespacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NamespacePackage.eNS_URI, theNamespacePackage);
		return theNamespacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAborter() {
		return aborterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAborter_ExternalObject() {
		return (EReference)aborterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregate() {
		return aggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregate_Group() {
		return (EAttribute)aggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregate_Field() {
		return (EReference)aggregateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregate_Type() {
		return (EAttribute)aggregateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_ExternalObject() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Key() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Name() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_ScopeBinding() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_ChannelBinding() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinding_ConstantBinding() {
		return (EReference)bindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_Id() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBinding_NameInChild() {
		return (EAttribute)bindingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_ControlParameter() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinality_PredicateExpression() {
		return (EReference)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_Id() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_LowerBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_UpperBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChannelBinding() {
		return channelBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelBinding_ChannelName() {
		return (EAttribute)channelBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannelBinding_Kind() {
		return (EAttribute)channelBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_RequisiteConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SimpleRequisiteConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_SubstepConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_ReactionConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_HandlerConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Binding() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_StepDeclaration() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_StepReference() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Id() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantBinding() {
		return constantBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstantBinding_ExternalObject() {
		return (EReference)constantBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlParameter() {
		return controlParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControlParameter_ParameterName() {
		return (EAttribute)controlParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Group() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_PostIt() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Location() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_TaggedLocation() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Id() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Name() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Aborter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Aggregate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Annotation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Binding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cardinality() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChannelBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Connector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ConstantBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ControlParameter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Diagram() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Export() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExternalObject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Field() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HandlerConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Import() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InterfaceDecl() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Littlejil() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Location() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Metadata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Module() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NullAggregate() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PostIt() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PredicateExpression() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReactionConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RequisiteConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ScopeBinding() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SimpleRequisiteConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StepDeclaration() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StepReference() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SubstepConnector() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TaggedLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExport() {
		return exportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExport_Id() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExport_StepName() {
		return (EAttribute)exportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalObject() {
		return externalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObject_Mixed() {
		return (EAttribute)externalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObject_Group() {
		return (EAttribute)externalObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExternalObject_Aggregate() {
		return (EReference)externalObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObject_Encoding() {
		return (EAttribute)externalObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExternalObject_Id() {
		return (EAttribute)externalObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Mixed() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Group() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_Aggregate() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getField_NullAggregate() {
		return (EReference)fieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Kind() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHandlerConnector() {
		return handlerConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHandlerConnector_ExternalObject() {
		return (EReference)handlerConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerConnector_ContinuationAction() {
		return (EAttribute)handlerConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHandlerConnector_ParameterName() {
		return (EAttribute)handlerConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Id() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_StepName() {
		return (EAttribute)importEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDecl() {
		return interfaceDeclEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceDecl_ExternalObject() {
		return (EReference)interfaceDeclEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDecl_Id() {
		return (EAttribute)interfaceDeclEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDecl_Kind() {
		return (EAttribute)interfaceDeclEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDecl_Name() {
		return (EAttribute)interfaceDeclEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLittlejil() {
		return littlejilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLittlejil_Module() {
		return (EReference)littlejilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLittlejil_Metadata() {
		return (EReference)littlejilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Id() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_Key() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_XPosition() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocation_YPosition() {
		return (EAttribute)locationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetadata() {
		return metadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetadata_Group() {
		return (EAttribute)metadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Annotation() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetadata_Diagram() {
		return (EReference)metadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Group() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Import() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_Export() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_StepDeclaration() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_StepReference() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModule_Id() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullAggregate() {
		return nullAggregateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNullAggregate_Type() {
		return (EAttribute)nullAggregateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostIt() {
		return postItEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostIt_Mixed() {
		return (EAttribute)postItEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostIt_Id() {
		return (EAttribute)postItEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostIt_XPosition() {
		return (EAttribute)postItEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostIt_YPosition() {
		return (EAttribute)postItEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateExpression() {
		return predicateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateExpression_Expression() {
		return (EAttribute)predicateExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactionConnector() {
		return reactionConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactionConnector_ExternalObject() {
		return (EReference)reactionConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReactionConnector_ParameterName() {
		return (EAttribute)reactionConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequisiteConnector() {
		return requisiteConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequisiteConnector_PreOrPost() {
		return (EAttribute)requisiteConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeBinding() {
		return scopeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeBinding_Kind() {
		return (EAttribute)scopeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScopeBinding_NameInParent() {
		return (EAttribute)scopeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRequisiteConnector() {
		return simpleRequisiteConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRequisiteConnector_PredicateExpression() {
		return (EReference)simpleRequisiteConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleRequisiteConnector_ExternalObject() {
		return (EReference)simpleRequisiteConnectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleRequisiteConnector_PreOrPost() {
		return (EAttribute)simpleRequisiteConnectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepDeclaration() {
		return stepDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepDeclaration_Group() {
		return (EAttribute)stepDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepDeclaration_InterfaceDecl() {
		return (EReference)stepDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepDeclaration_Connector() {
		return (EReference)stepDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStepDeclaration_Aborter() {
		return (EReference)stepDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepDeclaration_Id() {
		return (EAttribute)stepDeclarationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepDeclaration_Kind() {
		return (EAttribute)stepDeclarationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepDeclaration_Name() {
		return (EAttribute)stepDeclarationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepReference() {
		return stepReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepReference_Id() {
		return (EAttribute)stepReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStepReference_Target() {
		return (EAttribute)stepReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstepConnector() {
		return substepConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstepConnector_Cardinality() {
		return (EReference)substepConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTaggedLocation() {
		return taggedLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedLocation_Id() {
		return (EAttribute)taggedLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedLocation_Key() {
		return (EAttribute)taggedLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedLocation_Tag() {
		return (EAttribute)taggedLocationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedLocation_XPosition() {
		return (EAttribute)taggedLocationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTaggedLocation_YPosition() {
		return (EAttribute)taggedLocationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContinuationAction() {
		return continuationActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEncoding() {
		return encodingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind() {
		return kindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind1() {
		return kind1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind2() {
		return kind2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind3() {
		return kind3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKind4() {
		return kind4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreOrPost() {
		return preOrPostEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreOrPost1() {
		return preOrPost1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getContinuationActionObject() {
		return continuationActionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEncodingObject() {
		return encodingObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindObject() {
		return kindObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindObject1() {
		return kindObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindObject2() {
		return kindObject2EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindObject3() {
		return kindObject3EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getKindObject4() {
		return kindObject4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreOrPostObject() {
		return preOrPostObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPreOrPostObject1() {
		return preOrPostObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceFactory getNamespaceFactory() {
		return (NamespaceFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		aborterEClass = createEClass(ABORTER);
		createEReference(aborterEClass, ABORTER__EXTERNAL_OBJECT);

		aggregateEClass = createEClass(AGGREGATE);
		createEAttribute(aggregateEClass, AGGREGATE__GROUP);
		createEReference(aggregateEClass, AGGREGATE__FIELD);
		createEAttribute(aggregateEClass, AGGREGATE__TYPE);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__EXTERNAL_OBJECT);
		createEAttribute(annotationEClass, ANNOTATION__KEY);
		createEAttribute(annotationEClass, ANNOTATION__NAME);

		bindingEClass = createEClass(BINDING);
		createEReference(bindingEClass, BINDING__SCOPE_BINDING);
		createEReference(bindingEClass, BINDING__CHANNEL_BINDING);
		createEReference(bindingEClass, BINDING__CONSTANT_BINDING);
		createEAttribute(bindingEClass, BINDING__ID);
		createEAttribute(bindingEClass, BINDING__NAME_IN_CHILD);

		cardinalityEClass = createEClass(CARDINALITY);
		createEReference(cardinalityEClass, CARDINALITY__CONTROL_PARAMETER);
		createEReference(cardinalityEClass, CARDINALITY__PREDICATE_EXPRESSION);
		createEAttribute(cardinalityEClass, CARDINALITY__ID);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER_BOUND);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER_BOUND);

		channelBindingEClass = createEClass(CHANNEL_BINDING);
		createEAttribute(channelBindingEClass, CHANNEL_BINDING__CHANNEL_NAME);
		createEAttribute(channelBindingEClass, CHANNEL_BINDING__KIND);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__REQUISITE_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SIMPLE_REQUISITE_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__SUBSTEP_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__REACTION_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__HANDLER_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__BINDING);
		createEReference(connectorEClass, CONNECTOR__STEP_DECLARATION);
		createEReference(connectorEClass, CONNECTOR__STEP_REFERENCE);
		createEAttribute(connectorEClass, CONNECTOR__ID);

		constantBindingEClass = createEClass(CONSTANT_BINDING);
		createEReference(constantBindingEClass, CONSTANT_BINDING__EXTERNAL_OBJECT);

		controlParameterEClass = createEClass(CONTROL_PARAMETER);
		createEAttribute(controlParameterEClass, CONTROL_PARAMETER__PARAMETER_NAME);

		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__GROUP);
		createEReference(diagramEClass, DIAGRAM__POST_IT);
		createEReference(diagramEClass, DIAGRAM__LOCATION);
		createEReference(diagramEClass, DIAGRAM__TAGGED_LOCATION);
		createEAttribute(diagramEClass, DIAGRAM__ID);
		createEAttribute(diagramEClass, DIAGRAM__NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABORTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AGGREGATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ANNOTATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CARDINALITY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHANNEL_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONSTANT_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTROL_PARAMETER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DIAGRAM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EXTERNAL_OBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FIELD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__HANDLER_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INTERFACE_DECL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LITTLEJIL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__METADATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MODULE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NULL_AGGREGATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__POST_IT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PREDICATE_EXPRESSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REACTION_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__REQUISITE_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SCOPE_BINDING);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SIMPLE_REQUISITE_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STEP_DECLARATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__STEP_REFERENCE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SUBSTEP_CONNECTOR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TAGGED_LOCATION);

		exportEClass = createEClass(EXPORT);
		createEAttribute(exportEClass, EXPORT__ID);
		createEAttribute(exportEClass, EXPORT__STEP_NAME);

		externalObjectEClass = createEClass(EXTERNAL_OBJECT);
		createEAttribute(externalObjectEClass, EXTERNAL_OBJECT__MIXED);
		createEAttribute(externalObjectEClass, EXTERNAL_OBJECT__GROUP);
		createEReference(externalObjectEClass, EXTERNAL_OBJECT__AGGREGATE);
		createEAttribute(externalObjectEClass, EXTERNAL_OBJECT__ENCODING);
		createEAttribute(externalObjectEClass, EXTERNAL_OBJECT__ID);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__MIXED);
		createEAttribute(fieldEClass, FIELD__GROUP);
		createEReference(fieldEClass, FIELD__AGGREGATE);
		createEReference(fieldEClass, FIELD__NULL_AGGREGATE);
		createEAttribute(fieldEClass, FIELD__KIND);
		createEAttribute(fieldEClass, FIELD__NAME);

		handlerConnectorEClass = createEClass(HANDLER_CONNECTOR);
		createEReference(handlerConnectorEClass, HANDLER_CONNECTOR__EXTERNAL_OBJECT);
		createEAttribute(handlerConnectorEClass, HANDLER_CONNECTOR__CONTINUATION_ACTION);
		createEAttribute(handlerConnectorEClass, HANDLER_CONNECTOR__PARAMETER_NAME);

		importEClass = createEClass(IMPORT);
		createEAttribute(importEClass, IMPORT__ID);
		createEAttribute(importEClass, IMPORT__STEP_NAME);

		interfaceDeclEClass = createEClass(INTERFACE_DECL);
		createEReference(interfaceDeclEClass, INTERFACE_DECL__EXTERNAL_OBJECT);
		createEAttribute(interfaceDeclEClass, INTERFACE_DECL__ID);
		createEAttribute(interfaceDeclEClass, INTERFACE_DECL__KIND);
		createEAttribute(interfaceDeclEClass, INTERFACE_DECL__NAME);

		littlejilEClass = createEClass(LITTLEJIL);
		createEReference(littlejilEClass, LITTLEJIL__MODULE);
		createEReference(littlejilEClass, LITTLEJIL__METADATA);

		locationEClass = createEClass(LOCATION);
		createEAttribute(locationEClass, LOCATION__ID);
		createEAttribute(locationEClass, LOCATION__KEY);
		createEAttribute(locationEClass, LOCATION__XPOSITION);
		createEAttribute(locationEClass, LOCATION__YPOSITION);

		metadataEClass = createEClass(METADATA);
		createEAttribute(metadataEClass, METADATA__GROUP);
		createEReference(metadataEClass, METADATA__ANNOTATION);
		createEReference(metadataEClass, METADATA__DIAGRAM);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__GROUP);
		createEReference(moduleEClass, MODULE__IMPORT);
		createEReference(moduleEClass, MODULE__EXPORT);
		createEReference(moduleEClass, MODULE__STEP_DECLARATION);
		createEReference(moduleEClass, MODULE__STEP_REFERENCE);
		createEAttribute(moduleEClass, MODULE__ID);

		nullAggregateEClass = createEClass(NULL_AGGREGATE);
		createEAttribute(nullAggregateEClass, NULL_AGGREGATE__TYPE);

		postItEClass = createEClass(POST_IT);
		createEAttribute(postItEClass, POST_IT__MIXED);
		createEAttribute(postItEClass, POST_IT__ID);
		createEAttribute(postItEClass, POST_IT__XPOSITION);
		createEAttribute(postItEClass, POST_IT__YPOSITION);

		predicateExpressionEClass = createEClass(PREDICATE_EXPRESSION);
		createEAttribute(predicateExpressionEClass, PREDICATE_EXPRESSION__EXPRESSION);

		reactionConnectorEClass = createEClass(REACTION_CONNECTOR);
		createEReference(reactionConnectorEClass, REACTION_CONNECTOR__EXTERNAL_OBJECT);
		createEAttribute(reactionConnectorEClass, REACTION_CONNECTOR__PARAMETER_NAME);

		requisiteConnectorEClass = createEClass(REQUISITE_CONNECTOR);
		createEAttribute(requisiteConnectorEClass, REQUISITE_CONNECTOR__PRE_OR_POST);

		scopeBindingEClass = createEClass(SCOPE_BINDING);
		createEAttribute(scopeBindingEClass, SCOPE_BINDING__KIND);
		createEAttribute(scopeBindingEClass, SCOPE_BINDING__NAME_IN_PARENT);

		simpleRequisiteConnectorEClass = createEClass(SIMPLE_REQUISITE_CONNECTOR);
		createEReference(simpleRequisiteConnectorEClass, SIMPLE_REQUISITE_CONNECTOR__PREDICATE_EXPRESSION);
		createEReference(simpleRequisiteConnectorEClass, SIMPLE_REQUISITE_CONNECTOR__EXTERNAL_OBJECT);
		createEAttribute(simpleRequisiteConnectorEClass, SIMPLE_REQUISITE_CONNECTOR__PRE_OR_POST);

		stepDeclarationEClass = createEClass(STEP_DECLARATION);
		createEAttribute(stepDeclarationEClass, STEP_DECLARATION__GROUP);
		createEReference(stepDeclarationEClass, STEP_DECLARATION__INTERFACE_DECL);
		createEReference(stepDeclarationEClass, STEP_DECLARATION__CONNECTOR);
		createEReference(stepDeclarationEClass, STEP_DECLARATION__ABORTER);
		createEAttribute(stepDeclarationEClass, STEP_DECLARATION__ID);
		createEAttribute(stepDeclarationEClass, STEP_DECLARATION__KIND);
		createEAttribute(stepDeclarationEClass, STEP_DECLARATION__NAME);

		stepReferenceEClass = createEClass(STEP_REFERENCE);
		createEAttribute(stepReferenceEClass, STEP_REFERENCE__ID);
		createEAttribute(stepReferenceEClass, STEP_REFERENCE__TARGET);

		substepConnectorEClass = createEClass(SUBSTEP_CONNECTOR);
		createEReference(substepConnectorEClass, SUBSTEP_CONNECTOR__CARDINALITY);

		taggedLocationEClass = createEClass(TAGGED_LOCATION);
		createEAttribute(taggedLocationEClass, TAGGED_LOCATION__ID);
		createEAttribute(taggedLocationEClass, TAGGED_LOCATION__KEY);
		createEAttribute(taggedLocationEClass, TAGGED_LOCATION__TAG);
		createEAttribute(taggedLocationEClass, TAGGED_LOCATION__XPOSITION);
		createEAttribute(taggedLocationEClass, TAGGED_LOCATION__YPOSITION);

		// Create enums
		continuationActionEEnum = createEEnum(CONTINUATION_ACTION);
		encodingEEnum = createEEnum(ENCODING);
		kindEEnum = createEEnum(KIND);
		kind1EEnum = createEEnum(KIND1);
		kind2EEnum = createEEnum(KIND2);
		kind3EEnum = createEEnum(KIND3);
		kind4EEnum = createEEnum(KIND4);
		preOrPostEEnum = createEEnum(PRE_OR_POST);
		preOrPost1EEnum = createEEnum(PRE_OR_POST1);

		// Create data types
		continuationActionObjectEDataType = createEDataType(CONTINUATION_ACTION_OBJECT);
		encodingObjectEDataType = createEDataType(ENCODING_OBJECT);
		kindObjectEDataType = createEDataType(KIND_OBJECT);
		kindObject1EDataType = createEDataType(KIND_OBJECT1);
		kindObject2EDataType = createEDataType(KIND_OBJECT2);
		kindObject3EDataType = createEDataType(KIND_OBJECT3);
		kindObject4EDataType = createEDataType(KIND_OBJECT4);
		preOrPostObjectEDataType = createEDataType(PRE_OR_POST_OBJECT);
		preOrPostObject1EDataType = createEDataType(PRE_OR_POST_OBJECT1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(aborterEClass, Aborter.class, "Aborter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAborter_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 1, 1, Aborter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregate_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregate_Field(), this.getField(), null, "field", null, 0, -1, Aggregate.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAggregate_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Key(), theXMLTypePackage.getIDREF(), "key", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinding_ScopeBinding(), this.getScopeBinding(), null, "scopeBinding", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_ChannelBinding(), this.getChannelBinding(), null, "channelBinding", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_ConstantBinding(), this.getConstantBinding(), null, "constantBinding", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinding_NameInChild(), theXMLTypePackage.getString(), "nameInChild", null, 1, 1, Binding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinality_ControlParameter(), this.getControlParameter(), null, "controlParameter", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardinality_PredicateExpression(), this.getPredicateExpression(), null, "predicateExpression", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_LowerBound(), theXMLTypePackage.getString(), "lowerBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_UpperBound(), theXMLTypePackage.getString(), "upperBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(channelBindingEClass, ChannelBinding.class, "ChannelBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannelBinding_ChannelName(), theXMLTypePackage.getString(), "channelName", null, 1, 1, ChannelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannelBinding_Kind(), this.getKind3(), "kind", null, 1, 1, ChannelBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_RequisiteConnector(), this.getRequisiteConnector(), null, "requisiteConnector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SimpleRequisiteConnector(), this.getSimpleRequisiteConnector(), null, "simpleRequisiteConnector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_SubstepConnector(), this.getSubstepConnector(), null, "substepConnector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_ReactionConnector(), this.getReactionConnector(), null, "reactionConnector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_HandlerConnector(), this.getHandlerConnector(), null, "handlerConnector", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_Binding(), this.getBinding(), null, "binding", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_StepDeclaration(), this.getStepDeclaration(), null, "stepDeclaration", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnector_StepReference(), this.getStepReference(), null, "stepReference", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantBindingEClass, ConstantBinding.class, "ConstantBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstantBinding_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, ConstantBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlParameterEClass, ControlParameter.class, "ControlParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getControlParameter_ParameterName(), theXMLTypePackage.getString(), "parameterName", null, 1, 1, ControlParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_PostIt(), this.getPostIt(), null, "postIt", null, 0, -1, Diagram.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Location(), this.getLocation(), null, "location", null, 0, -1, Diagram.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_TaggedLocation(), this.getTaggedLocation(), null, "taggedLocation", null, 0, -1, Diagram.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Aborter(), this.getAborter(), null, "aborter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Binding(), this.getBinding(), null, "binding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ChannelBinding(), this.getChannelBinding(), null, "channelBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Connector(), this.getConnector(), null, "connector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ConstantBinding(), this.getConstantBinding(), null, "constantBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ControlParameter(), this.getControlParameter(), null, "controlParameter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Diagram(), this.getDiagram(), null, "diagram", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Export(), this.getExport(), null, "export", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Field(), this.getField(), null, "field", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_HandlerConnector(), this.getHandlerConnector(), null, "handlerConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Import(), this.getImport(), null, "import", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_InterfaceDecl(), this.getInterfaceDecl(), null, "interfaceDecl", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Littlejil(), this.getLittlejil(), null, "littlejil", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Location(), this.getLocation(), null, "location", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Metadata(), this.getMetadata(), null, "metadata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Module(), this.getModule(), null, "module", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_NullAggregate(), this.getNullAggregate(), null, "nullAggregate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PostIt(), this.getPostIt(), null, "postIt", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PredicateExpression(), this.getPredicateExpression(), null, "predicateExpression", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ReactionConnector(), this.getReactionConnector(), null, "reactionConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_RequisiteConnector(), this.getRequisiteConnector(), null, "requisiteConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_ScopeBinding(), this.getScopeBinding(), null, "scopeBinding", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SimpleRequisiteConnector(), this.getSimpleRequisiteConnector(), null, "simpleRequisiteConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StepDeclaration(), this.getStepDeclaration(), null, "stepDeclaration", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_StepReference(), this.getStepReference(), null, "stepReference", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_SubstepConnector(), this.getSubstepConnector(), null, "substepConnector", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_TaggedLocation(), this.getTaggedLocation(), null, "taggedLocation", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exportEClass, Export.class, "Export", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExport_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExport_StepName(), theXMLTypePackage.getString(), "stepName", null, 1, 1, Export.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(externalObjectEClass, ExternalObject.class, "ExternalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternalObject_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ExternalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalObject_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ExternalObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getExternalObject_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, -1, ExternalObject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalObject_Encoding(), this.getEncoding(), "encoding", null, 1, 1, ExternalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternalObject_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, ExternalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Field.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getField_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, -1, Field.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getField_NullAggregate(), this.getNullAggregate(), null, "nullAggregate", null, 0, -1, Field.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Kind(), this.getKind4(), "kind", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(handlerConnectorEClass, HandlerConnector.class, "HandlerConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHandlerConnector_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, HandlerConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandlerConnector_ContinuationAction(), this.getContinuationAction(), "continuationAction", null, 1, 1, HandlerConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHandlerConnector_ParameterName(), theXMLTypePackage.getString(), "parameterName", null, 0, 1, HandlerConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importEClass, Import.class, "Import", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImport_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImport_StepName(), theXMLTypePackage.getString(), "stepName", null, 1, 1, Import.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDeclEClass, InterfaceDecl.class, "InterfaceDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceDecl_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, InterfaceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDecl_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, InterfaceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDecl_Kind(), this.getKind2(), "kind", null, 1, 1, InterfaceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDecl_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, InterfaceDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(littlejilEClass, Littlejil.class, "Littlejil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLittlejil_Module(), this.getModule(), null, "module", null, 1, 1, Littlejil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLittlejil_Metadata(), this.getMetadata(), null, "metadata", null, 0, 1, Littlejil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocation_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_Key(), theXMLTypePackage.getIDREF(), "key", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_XPosition(), theXMLTypePackage.getString(), "xPosition", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocation_YPosition(), theXMLTypePackage.getString(), "yPosition", null, 1, 1, Location.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metadataEClass, Metadata.class, "Metadata", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetadata_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Metadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, Metadata.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getMetadata_Diagram(), this.getDiagram(), null, "diagram", null, 0, -1, Metadata.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Import(), this.getImport(), null, "import", null, 0, -1, Module.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Export(), this.getExport(), null, "export", null, 0, -1, Module.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModule_StepDeclaration(), this.getStepDeclaration(), null, "stepDeclaration", null, 0, -1, Module.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getModule_StepReference(), this.getStepReference(), null, "stepReference", null, 0, -1, Module.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getModule_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullAggregateEClass, NullAggregate.class, "NullAggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNullAggregate_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, NullAggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postItEClass, PostIt.class, "PostIt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostIt_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, PostIt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostIt_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, PostIt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostIt_XPosition(), theXMLTypePackage.getString(), "xPosition", null, 1, 1, PostIt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostIt_YPosition(), theXMLTypePackage.getString(), "yPosition", null, 1, 1, PostIt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateExpressionEClass, PredicateExpression.class, "PredicateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateExpression_Expression(), theXMLTypePackage.getString(), "expression", null, 1, 1, PredicateExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactionConnectorEClass, ReactionConnector.class, "ReactionConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactionConnector_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, ReactionConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReactionConnector_ParameterName(), theXMLTypePackage.getString(), "parameterName", null, 0, 1, ReactionConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requisiteConnectorEClass, RequisiteConnector.class, "RequisiteConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequisiteConnector_PreOrPost(), this.getPreOrPost1(), "preOrPost", null, 1, 1, RequisiteConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(scopeBindingEClass, ScopeBinding.class, "ScopeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScopeBinding_Kind(), this.getKind1(), "kind", null, 1, 1, ScopeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getScopeBinding_NameInParent(), theXMLTypePackage.getString(), "nameInParent", null, 1, 1, ScopeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleRequisiteConnectorEClass, SimpleRequisiteConnector.class, "SimpleRequisiteConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleRequisiteConnector_PredicateExpression(), this.getPredicateExpression(), null, "predicateExpression", null, 0, 1, SimpleRequisiteConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleRequisiteConnector_ExternalObject(), this.getExternalObject(), null, "externalObject", null, 0, 1, SimpleRequisiteConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimpleRequisiteConnector_PreOrPost(), this.getPreOrPost(), "preOrPost", null, 1, 1, SimpleRequisiteConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepDeclarationEClass, StepDeclaration.class, "StepDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepDeclaration_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, StepDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStepDeclaration_InterfaceDecl(), this.getInterfaceDecl(), null, "interfaceDecl", null, 0, -1, StepDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStepDeclaration_Connector(), this.getConnector(), null, "connector", null, 0, -1, StepDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getStepDeclaration_Aborter(), this.getAborter(), null, "aborter", null, 0, -1, StepDeclaration.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepDeclaration_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StepDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepDeclaration_Kind(), this.getKind(), "kind", null, 1, 1, StepDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepDeclaration_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, StepDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepReferenceEClass, StepReference.class, "StepReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStepReference_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, StepReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStepReference_Target(), theXMLTypePackage.getString(), "target", null, 1, 1, StepReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substepConnectorEClass, SubstepConnector.class, "SubstepConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstepConnector_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, SubstepConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taggedLocationEClass, TaggedLocation.class, "TaggedLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaggedLocation_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, TaggedLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedLocation_Key(), theXMLTypePackage.getIDREF(), "key", null, 1, 1, TaggedLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedLocation_Tag(), theXMLTypePackage.getString(), "tag", null, 1, 1, TaggedLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedLocation_XPosition(), theXMLTypePackage.getString(), "xPosition", null, 1, 1, TaggedLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaggedLocation_YPosition(), theXMLTypePackage.getString(), "yPosition", null, 1, 1, TaggedLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(continuationActionEEnum, ContinuationAction.class, "ContinuationAction");
		addEEnumLiteral(continuationActionEEnum, ContinuationAction.COMPLETE);
		addEEnumLiteral(continuationActionEEnum, ContinuationAction.CONTINUE);
		addEEnumLiteral(continuationActionEEnum, ContinuationAction.RESTART);
		addEEnumLiteral(continuationActionEEnum, ContinuationAction.RETHROW);

		initEEnum(encodingEEnum, Encoding.class, "Encoding");
		addEEnumLiteral(encodingEEnum, Encoding.BASE64);
		addEEnumLiteral(encodingEEnum, Encoding.ODESC);
		addEEnumLiteral(encodingEEnum, Encoding.STRING);

		initEEnum(kindEEnum, Kind.class, "Kind");
		addEEnumLiteral(kindEEnum, Kind.SEQUENTIAL);
		addEEnumLiteral(kindEEnum, Kind.PARALLEL);
		addEEnumLiteral(kindEEnum, Kind.CHOICE);
		addEEnumLiteral(kindEEnum, Kind.TRY);
		addEEnumLiteral(kindEEnum, Kind.LEAF);

		initEEnum(kind1EEnum, Kind1.class, "Kind1");
		addEEnumLiteral(kind1EEnum, Kind1.COPY_IN);
		addEEnumLiteral(kind1EEnum, Kind1.COPY_OUT);
		addEEnumLiteral(kind1EEnum, Kind1.COPY_IN_AND_OUT);
		addEEnumLiteral(kind1EEnum, Kind1.CONSTRAIN);

		initEEnum(kind2EEnum, Kind2.class, "Kind2");
		addEEnumLiteral(kind2EEnum, Kind2.RESOURCE);
		addEEnumLiteral(kind2EEnum, Kind2.RESOURCE_USE);
		addEEnumLiteral(kind2EEnum, Kind2.RESOURCE_COLLECTION);
		addEEnumLiteral(kind2EEnum, Kind2.RESOURCE_COLLECTION_ITERATOR);
		addEEnumLiteral(kind2EEnum, Kind2.RESOURCE_COLLECTION_USE);
		addEEnumLiteral(kind2EEnum, Kind2.IN_PARAMETER);
		addEEnumLiteral(kind2EEnum, Kind2.OUT_PARAMETER);
		addEEnumLiteral(kind2EEnum, Kind2.IN_OUT_PARAMETER);
		addEEnumLiteral(kind2EEnum, Kind2.LOCAL_PARAMETER);
		addEEnumLiteral(kind2EEnum, Kind2.MESSAGE);
		addEEnumLiteral(kind2EEnum, Kind2.EXCEPTION);
		addEEnumLiteral(kind2EEnum, Kind2.CHANNEL);

		initEEnum(kind3EEnum, Kind3.class, "Kind3");
		addEEnumLiteral(kind3EEnum, Kind3.READ);
		addEEnumLiteral(kind3EEnum, Kind3.WRITE);
		addEEnumLiteral(kind3EEnum, Kind3.TAKE);
		addEEnumLiteral(kind3EEnum, Kind3.READ_NOWAIT);
		addEEnumLiteral(kind3EEnum, Kind3.TAKE_NOWAIT);

		initEEnum(kind4EEnum, Kind4.class, "Kind4");
		addEEnumLiteral(kind4EEnum, Kind4.AGGREGATE);
		addEEnumLiteral(kind4EEnum, Kind4.BOOLEAN);
		addEEnumLiteral(kind4EEnum, Kind4.INTEGER);
		addEEnumLiteral(kind4EEnum, Kind4.REAL);
		addEEnumLiteral(kind4EEnum, Kind4.STRING);
		addEEnumLiteral(kind4EEnum, Kind4.SYMBOL);

		initEEnum(preOrPostEEnum, PreOrPost.class, "PreOrPost");
		addEEnumLiteral(preOrPostEEnum, PreOrPost.PRE);
		addEEnumLiteral(preOrPostEEnum, PreOrPost.POST);

		initEEnum(preOrPost1EEnum, PreOrPost1.class, "PreOrPost1");
		addEEnumLiteral(preOrPost1EEnum, PreOrPost1.PRE);
		addEEnumLiteral(preOrPost1EEnum, PreOrPost1.POST);

		// Initialize data types
		initEDataType(continuationActionObjectEDataType, Enumerator.class, "ContinuationActionObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(encodingObjectEDataType, Enumerator.class, "EncodingObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindObjectEDataType, Enumerator.class, "KindObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindObject1EDataType, Enumerator.class, "KindObject1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindObject2EDataType, Enumerator.class, "KindObject2", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindObject3EDataType, Enumerator.class, "KindObject3", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kindObject4EDataType, Enumerator.class, "KindObject4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preOrPostObjectEDataType, Enumerator.class, "PreOrPostObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(preOrPostObject1EDataType, Enumerator.class, "PreOrPostObject1", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (aborterEClass, 
		   source, 
		   new String[] {
			 "name", "aborter_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAborter_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (aggregateEClass, 
		   source, 
		   new String[] {
			 "name", "aggregate_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAggregate_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getAggregate_Field(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "field",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getAggregate_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (annotationEClass, 
		   source, 
		   new String[] {
			 "name", "annotation_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAnnotation_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAnnotation_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getAnnotation_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (bindingEClass, 
		   source, 
		   new String[] {
			 "name", "binding_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBinding_ScopeBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scope-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinding_ChannelBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "channel-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinding_ConstantBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constant-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBinding_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getBinding_NameInChild(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name-in-child"
		   });		
		addAnnotation
		  (cardinalityEClass, 
		   source, 
		   new String[] {
			 "name", "cardinality_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCardinality_ControlParameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control-parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCardinality_PredicateExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "predicate-expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCardinality_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getCardinality_LowerBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lower-bound"
		   });		
		addAnnotation
		  (getCardinality_UpperBound(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "upper-bound"
		   });		
		addAnnotation
		  (channelBindingEClass, 
		   source, 
		   new String[] {
			 "name", "channel-binding_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getChannelBinding_ChannelName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channel-name"
		   });		
		addAnnotation
		  (getChannelBinding_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (connectorEClass, 
		   source, 
		   new String[] {
			 "name", "connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConnector_RequisiteConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requisite-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_SimpleRequisiteConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simple-requisite-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_SubstepConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substep-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_ReactionConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reaction-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_HandlerConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handler-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_Binding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_StepDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-declaration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_StepReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConnector_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (constantBindingEClass, 
		   source, 
		   new String[] {
			 "name", "constant-binding_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConstantBinding_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (continuationActionEEnum, 
		   source, 
		   new String[] {
			 "name", "continuation-action_._type"
		   });		
		addAnnotation
		  (continuationActionObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "continuation-action_._type:Object",
			 "base", "continuation-action_._type"
		   });		
		addAnnotation
		  (controlParameterEClass, 
		   source, 
		   new String[] {
			 "name", "control-parameter_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getControlParameter_ParameterName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parameter-name"
		   });		
		addAnnotation
		  (diagramEClass, 
		   source, 
		   new String[] {
			 "name", "diagram_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDiagram_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getDiagram_PostIt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-it",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagram_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagram_TaggedLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tagged-location",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getDiagram_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getDiagram_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Aborter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aborter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Aggregate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aggregate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Annotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "annotation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Binding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Cardinality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cardinality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ChannelBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "channel-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Connector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ConstantBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "constant-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ControlParameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control-parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Diagram(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagram",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Export(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "export",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Field(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "field",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_HandlerConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handler-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_InterfaceDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interface-decl",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Littlejil(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "littlejil",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "module",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_NullAggregate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null-aggregate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PostIt(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "post-it",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_PredicateExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "predicate-expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ReactionConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reaction-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_RequisiteConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "requisite-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_ScopeBinding(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scope-binding",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SimpleRequisiteConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "simple-requisite-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StepDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-declaration",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_StepReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_SubstepConnector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "substep-connector",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_TaggedLocation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tagged-location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (encodingEEnum, 
		   source, 
		   new String[] {
			 "name", "encoding_._type"
		   });		
		addAnnotation
		  (encodingObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "encoding_._type:Object",
			 "base", "encoding_._type"
		   });		
		addAnnotation
		  (exportEClass, 
		   source, 
		   new String[] {
			 "name", "export_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getExport_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getExport_StepName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "step-name"
		   });		
		addAnnotation
		  (externalObjectEClass, 
		   source, 
		   new String[] {
			 "name", "external-object_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getExternalObject_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getExternalObject_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getExternalObject_Aggregate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aggregate",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getExternalObject_Encoding(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "encoding"
		   });		
		addAnnotation
		  (getExternalObject_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (fieldEClass, 
		   source, 
		   new String[] {
			 "name", "field_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getField_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getField_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getField_Aggregate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aggregate",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getField_NullAggregate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "null-aggregate",
			 "namespace", "##targetNamespace",
			 "group", "#group:1"
		   });		
		addAnnotation
		  (getField_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (getField_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (handlerConnectorEClass, 
		   source, 
		   new String[] {
			 "name", "handler-connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getHandlerConnector_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getHandlerConnector_ContinuationAction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "continuation-action"
		   });		
		addAnnotation
		  (getHandlerConnector_ParameterName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parameter-name"
		   });		
		addAnnotation
		  (importEClass, 
		   source, 
		   new String[] {
			 "name", "import_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getImport_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getImport_StepName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "step-name"
		   });		
		addAnnotation
		  (interfaceDeclEClass, 
		   source, 
		   new String[] {
			 "name", "interface-decl_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInterfaceDecl_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInterfaceDecl_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getInterfaceDecl_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (getInterfaceDecl_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (kindEEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._1_._type"
		   });		
		addAnnotation
		  (kind1EEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._2_._type"
		   });		
		addAnnotation
		  (kind2EEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._3_._type"
		   });		
		addAnnotation
		  (kind3EEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._4_._type"
		   });		
		addAnnotation
		  (kind4EEnum, 
		   source, 
		   new String[] {
			 "name", "kind_._type"
		   });		
		addAnnotation
		  (kindObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._3_._type:Object",
			 "base", "kind_._3_._type"
		   });		
		addAnnotation
		  (kindObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._1_._type:Object",
			 "base", "kind_._1_._type"
		   });		
		addAnnotation
		  (kindObject2EDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._2_._type:Object",
			 "base", "kind_._2_._type"
		   });		
		addAnnotation
		  (kindObject3EDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._4_._type:Object",
			 "base", "kind_._4_._type"
		   });		
		addAnnotation
		  (kindObject4EDataType, 
		   source, 
		   new String[] {
			 "name", "kind_._type:Object",
			 "base", "kind_._type"
		   });		
		addAnnotation
		  (littlejilEClass, 
		   source, 
		   new String[] {
			 "name", "littlejil_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLittlejil_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "module",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLittlejil_Metadata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metadata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (locationEClass, 
		   source, 
		   new String[] {
			 "name", "location_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getLocation_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getLocation_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getLocation_XPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x-position"
		   });		
		addAnnotation
		  (getLocation_YPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y-position"
		   });		
		addAnnotation
		  (metadataEClass, 
		   source, 
		   new String[] {
			 "name", "metadata_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetadata_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getMetadata_Annotation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "annotation",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getMetadata_Diagram(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "diagram",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (moduleEClass, 
		   source, 
		   new String[] {
			 "name", "module_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModule_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getModule_Import(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "import",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getModule_Export(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "export",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getModule_StepDeclaration(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-declaration",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getModule_StepReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "step-reference",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getModule_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (nullAggregateEClass, 
		   source, 
		   new String[] {
			 "name", "null-aggregate_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getNullAggregate_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (postItEClass, 
		   source, 
		   new String[] {
			 "name", "post-it_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getPostIt_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getPostIt_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPostIt_XPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x-position"
		   });		
		addAnnotation
		  (getPostIt_YPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y-position"
		   });		
		addAnnotation
		  (predicateExpressionEClass, 
		   source, 
		   new String[] {
			 "name", "predicate-expression_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPredicateExpression_Expression(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expression"
		   });		
		addAnnotation
		  (preOrPostEEnum, 
		   source, 
		   new String[] {
			 "name", "pre-or-post_._type"
		   });		
		addAnnotation
		  (preOrPost1EEnum, 
		   source, 
		   new String[] {
			 "name", "pre-or-post_._1_._type"
		   });		
		addAnnotation
		  (preOrPostObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "pre-or-post_._type:Object",
			 "base", "pre-or-post_._type"
		   });		
		addAnnotation
		  (preOrPostObject1EDataType, 
		   source, 
		   new String[] {
			 "name", "pre-or-post_._1_._type:Object",
			 "base", "pre-or-post_._1_._type"
		   });		
		addAnnotation
		  (reactionConnectorEClass, 
		   source, 
		   new String[] {
			 "name", "reaction-connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReactionConnector_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReactionConnector_ParameterName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "parameter-name"
		   });		
		addAnnotation
		  (requisiteConnectorEClass, 
		   source, 
		   new String[] {
			 "name", "requisite-connector_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRequisiteConnector_PreOrPost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pre-or-post"
		   });		
		addAnnotation
		  (scopeBindingEClass, 
		   source, 
		   new String[] {
			 "name", "scope-binding_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getScopeBinding_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (getScopeBinding_NameInParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name-in-parent"
		   });		
		addAnnotation
		  (simpleRequisiteConnectorEClass, 
		   source, 
		   new String[] {
			 "name", "simple-requisite-connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSimpleRequisiteConnector_PredicateExpression(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "predicate-expression",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleRequisiteConnector_ExternalObject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "external-object",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSimpleRequisiteConnector_PreOrPost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pre-or-post"
		   });		
		addAnnotation
		  (stepDeclarationEClass, 
		   source, 
		   new String[] {
			 "name", "step-declaration_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getStepDeclaration_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getStepDeclaration_InterfaceDecl(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "interface-decl",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStepDeclaration_Connector(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "connector",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStepDeclaration_Aborter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aborter",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });		
		addAnnotation
		  (getStepDeclaration_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStepDeclaration_Kind(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kind"
		   });		
		addAnnotation
		  (getStepDeclaration_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (stepReferenceEClass, 
		   source, 
		   new String[] {
			 "name", "step-reference_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getStepReference_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getStepReference_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target"
		   });		
		addAnnotation
		  (substepConnectorEClass, 
		   source, 
		   new String[] {
			 "name", "substep-connector_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSubstepConnector_Cardinality(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cardinality",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (taggedLocationEClass, 
		   source, 
		   new String[] {
			 "name", "tagged-location_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getTaggedLocation_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getTaggedLocation_Key(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "key"
		   });		
		addAnnotation
		  (getTaggedLocation_Tag(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tag"
		   });		
		addAnnotation
		  (getTaggedLocation_XPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x-position"
		   });		
		addAnnotation
		  (getTaggedLocation_YPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y-position"
		   });
	}

} //NamespacePackageImpl
