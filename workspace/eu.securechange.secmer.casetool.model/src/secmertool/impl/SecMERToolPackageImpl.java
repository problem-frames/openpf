/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.impl;

import eu.securechange.ontology.ontology.OntologyPackage;

import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import secmertool.NamedReferenceLink;
import secmertool.ReferenceLink;
import secmertool.ReferenceModel;
import secmertool.SecMERIntegrationModel;
import secmertool.SecMERToolFactory;
import secmertool.SecMERToolPackage;

import secmertool.troposAspect.TroposAspectPackage;

import secmertool.troposAspect.impl.TroposAspectPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecMERToolPackageImpl extends EPackageImpl implements SecMERToolPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secMERIntegrationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedReferenceLinkEClass = null;

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
	 * @see secmertool.SecMERToolPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecMERToolPackageImpl() {
		super(eNS_URI, SecMERToolFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SecMERToolPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecMERToolPackage init() {
		if (isInited) return (SecMERToolPackage)EPackage.Registry.INSTANCE.getEPackage(SecMERToolPackage.eNS_URI);

		// Obtain or create and register package
		SecMERToolPackageImpl theSecMERToolPackage = (SecMERToolPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SecMERToolPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SecMERToolPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OntologyPackage.eINSTANCE.eClass();
		TroposPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		TroposAspectPackageImpl theTroposAspectPackage = (TroposAspectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TroposAspectPackage.eNS_URI) instanceof TroposAspectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TroposAspectPackage.eNS_URI) : TroposAspectPackage.eINSTANCE);

		// Create package meta-data objects
		theSecMERToolPackage.createPackageContents();
		theTroposAspectPackage.createPackageContents();

		// Initialize created meta-data
		theSecMERToolPackage.initializePackageContents();
		theTroposAspectPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecMERToolPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecMERToolPackage.eNS_URI, theSecMERToolPackage);
		return theSecMERToolPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecMERIntegrationModel() {
		return secMERIntegrationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecMERIntegrationModel_TroposModel() {
		return (EReference)secMERIntegrationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecMERIntegrationModel_TroposResource() {
		return (EAttribute)secMERIntegrationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecMERIntegrationModel_SituationModel() {
		return (EReference)secMERIntegrationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecMERIntegrationModel_SituationResource() {
		return (EAttribute)secMERIntegrationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecMERIntegrationModel_ReferenceModels() {
		return (EReference)secMERIntegrationModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceModel() {
		return referenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceModel_Links() {
		return (EReference)referenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceLink() {
		return referenceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedReferenceLink() {
		return namedReferenceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedReferenceLink_Name() {
		return (EAttribute)namedReferenceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecMERToolFactory getSecMERToolFactory() {
		return (SecMERToolFactory)getEFactoryInstance();
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
		secMERIntegrationModelEClass = createEClass(SEC_MER_INTEGRATION_MODEL);
		createEReference(secMERIntegrationModelEClass, SEC_MER_INTEGRATION_MODEL__TROPOS_MODEL);
		createEAttribute(secMERIntegrationModelEClass, SEC_MER_INTEGRATION_MODEL__TROPOS_RESOURCE);
		createEReference(secMERIntegrationModelEClass, SEC_MER_INTEGRATION_MODEL__SITUATION_MODEL);
		createEAttribute(secMERIntegrationModelEClass, SEC_MER_INTEGRATION_MODEL__SITUATION_RESOURCE);
		createEReference(secMERIntegrationModelEClass, SEC_MER_INTEGRATION_MODEL__REFERENCE_MODELS);

		referenceModelEClass = createEClass(REFERENCE_MODEL);
		createEReference(referenceModelEClass, REFERENCE_MODEL__LINKS);

		referenceLinkEClass = createEClass(REFERENCE_LINK);

		namedReferenceLinkEClass = createEClass(NAMED_REFERENCE_LINK);
		createEAttribute(namedReferenceLinkEClass, NAMED_REFERENCE_LINK__NAME);
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
		TroposAspectPackage theTroposAspectPackage = (TroposAspectPackage)EPackage.Registry.INSTANCE.getEPackage(TroposAspectPackage.eNS_URI);
		TroposPackage theTroposPackage = (TroposPackage)EPackage.Registry.INSTANCE.getEPackage(TroposPackage.eNS_URI);
		OntologyPackage theOntologyPackage = (OntologyPackage)EPackage.Registry.INSTANCE.getEPackage(OntologyPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theTroposAspectPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namedReferenceLinkEClass.getESuperTypes().add(this.getReferenceLink());

		// Initialize classes and features; add operations and parameters
		initEClass(secMERIntegrationModelEClass, SecMERIntegrationModel.class, "SecMERIntegrationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecMERIntegrationModel_TroposModel(), theTroposPackage.getDiagram(), null, "TroposModel", null, 1, 1, SecMERIntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecMERIntegrationModel_TroposResource(), ecorePackage.getEString(), "TroposResource", null, 1, 1, SecMERIntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecMERIntegrationModel_SituationModel(), theOntologyPackage.getSituation(), null, "SituationModel", null, 0, 1, SecMERIntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecMERIntegrationModel_SituationResource(), ecorePackage.getEString(), "SituationResource", null, 1, 1, SecMERIntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecMERIntegrationModel_ReferenceModels(), this.getReferenceModel(), null, "referenceModels", null, 0, -1, SecMERIntegrationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceModelEClass, ReferenceModel.class, "ReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceModel_Links(), this.getReferenceLink(), null, "links", null, 0, -1, ReferenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceLinkEClass, ReferenceLink.class, "ReferenceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedReferenceLinkEClass, NamedReferenceLink.class, "NamedReferenceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedReferenceLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedReferenceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SecMERToolPackageImpl
