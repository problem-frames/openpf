/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package secmertool.troposAspect.impl;

import eu.securechange.ontology.ontology.OntologyPackage;

import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import secmertool.SecMERToolPackage;

import secmertool.impl.SecMERToolPackageImpl;

import secmertool.troposAspect.TroposActorLink;
import secmertool.troposAspect.TroposAspectFactory;
import secmertool.troposAspect.TroposAspectPackage;
import secmertool.troposAspect.TroposDelegateLink;
import secmertool.troposAspect.TroposReferenceModel;
import secmertool.troposAspect.TroposResourceLink;
import secmertool.troposAspect.TroposTrustLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TroposAspectPackageImpl extends EPackageImpl implements TroposAspectPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troposReferenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troposActorLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troposResourceLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troposTrustLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass troposDelegateLinkEClass = null;

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
	 * @see secmertool.troposAspect.TroposAspectPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TroposAspectPackageImpl() {
		super(eNS_URI, TroposAspectFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TroposAspectPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TroposAspectPackage init() {
		if (isInited) return (TroposAspectPackage)EPackage.Registry.INSTANCE.getEPackage(TroposAspectPackage.eNS_URI);

		// Obtain or create and register package
		TroposAspectPackageImpl theTroposAspectPackage = (TroposAspectPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TroposAspectPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TroposAspectPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		OntologyPackage.eINSTANCE.eClass();
		TroposPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		SecMERToolPackageImpl theSecMERToolPackage = (SecMERToolPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(SecMERToolPackage.eNS_URI) instanceof SecMERToolPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(SecMERToolPackage.eNS_URI) : SecMERToolPackage.eINSTANCE);

		// Create package meta-data objects
		theTroposAspectPackage.createPackageContents();
		theSecMERToolPackage.createPackageContents();

		// Initialize created meta-data
		theTroposAspectPackage.initializePackageContents();
		theSecMERToolPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTroposAspectPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TroposAspectPackage.eNS_URI, theTroposAspectPackage);
		return theTroposAspectPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTroposReferenceModel() {
		return troposReferenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTroposActorLink() {
		return troposActorLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposActorLink_Secmer() {
		return (EReference)troposActorLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposActorLink_Tropos() {
		return (EReference)troposActorLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTroposResourceLink() {
		return troposResourceLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposResourceLink_Secmer() {
		return (EReference)troposResourceLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposResourceLink_Tropos() {
		return (EReference)troposResourceLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTroposTrustLink() {
		return troposTrustLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposTrustLink_Secmer() {
		return (EReference)troposTrustLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposTrustLink_Tropos() {
		return (EReference)troposTrustLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTroposDelegateLink() {
		return troposDelegateLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposDelegateLink_Secmer() {
		return (EReference)troposDelegateLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTroposDelegateLink_Tropos() {
		return (EReference)troposDelegateLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposAspectFactory getTroposAspectFactory() {
		return (TroposAspectFactory)getEFactoryInstance();
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
		troposReferenceModelEClass = createEClass(TROPOS_REFERENCE_MODEL);

		troposActorLinkEClass = createEClass(TROPOS_ACTOR_LINK);
		createEReference(troposActorLinkEClass, TROPOS_ACTOR_LINK__SECMER);
		createEReference(troposActorLinkEClass, TROPOS_ACTOR_LINK__TROPOS);

		troposResourceLinkEClass = createEClass(TROPOS_RESOURCE_LINK);
		createEReference(troposResourceLinkEClass, TROPOS_RESOURCE_LINK__SECMER);
		createEReference(troposResourceLinkEClass, TROPOS_RESOURCE_LINK__TROPOS);

		troposTrustLinkEClass = createEClass(TROPOS_TRUST_LINK);
		createEReference(troposTrustLinkEClass, TROPOS_TRUST_LINK__SECMER);
		createEReference(troposTrustLinkEClass, TROPOS_TRUST_LINK__TROPOS);

		troposDelegateLinkEClass = createEClass(TROPOS_DELEGATE_LINK);
		createEReference(troposDelegateLinkEClass, TROPOS_DELEGATE_LINK__SECMER);
		createEReference(troposDelegateLinkEClass, TROPOS_DELEGATE_LINK__TROPOS);
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
		SecMERToolPackage theSecMERToolPackage = (SecMERToolPackage)EPackage.Registry.INSTANCE.getEPackage(SecMERToolPackage.eNS_URI);
		OntologyPackage theOntologyPackage = (OntologyPackage)EPackage.Registry.INSTANCE.getEPackage(OntologyPackage.eNS_URI);
		TroposPackage theTroposPackage = (TroposPackage)EPackage.Registry.INSTANCE.getEPackage(TroposPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		troposReferenceModelEClass.getESuperTypes().add(theSecMERToolPackage.getReferenceModel());
		troposActorLinkEClass.getESuperTypes().add(theSecMERToolPackage.getNamedReferenceLink());
		troposResourceLinkEClass.getESuperTypes().add(theSecMERToolPackage.getNamedReferenceLink());
		troposTrustLinkEClass.getESuperTypes().add(theSecMERToolPackage.getReferenceLink());
		troposDelegateLinkEClass.getESuperTypes().add(theSecMERToolPackage.getReferenceLink());

		// Initialize classes and features; add operations and parameters
		initEClass(troposReferenceModelEClass, TroposReferenceModel.class, "TroposReferenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(troposActorLinkEClass, TroposActorLink.class, "TroposActorLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTroposActorLink_Secmer(), theOntologyPackage.getActor(), null, "secmer", null, 0, 1, TroposActorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTroposActorLink_Tropos(), theTroposPackage.getActor(), null, "tropos", null, 0, 1, TroposActorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(troposResourceLinkEClass, TroposResourceLink.class, "TroposResourceLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTroposResourceLink_Secmer(), theOntologyPackage.getResource(), null, "secmer", null, 0, 1, TroposResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTroposResourceLink_Tropos(), theTroposPackage.getService(), null, "tropos", null, 0, 1, TroposResourceLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(troposTrustLinkEClass, TroposTrustLink.class, "TroposTrustLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTroposTrustLink_Secmer(), theOntologyPackage.getRelationship(), null, "secmer", null, 0, 1, TroposTrustLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTroposTrustLink_Tropos(), theTroposPackage.getDependency(), null, "tropos", null, 0, 1, TroposTrustLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(troposDelegateLinkEClass, TroposDelegateLink.class, "TroposDelegateLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTroposDelegateLink_Secmer(), theOntologyPackage.getRelationship(), null, "secmer", null, 0, 1, TroposDelegateLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTroposDelegateLink_Tropos(), theTroposPackage.getDependency(), null, "tropos", null, 0, 1, TroposDelegateLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //TroposAspectPackageImpl
