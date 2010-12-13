/**
 * <copyright>
 * </copyright>
 *
 * $Id: TroposPackageImpl.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EInstantiationType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.ESATType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.Relation;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposFactory;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TroposPackageImpl extends EPackageImpl implements TroposPackage {
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
	private EClass graphicalObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contributionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownershipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass meansEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eActorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eAssociationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eCompositionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eContributionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eDependencyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eOwnershipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum esatTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eRelationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eInstantiationTypeEEnum = null;

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
	 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TroposPackageImpl() {
		super(eNS_URI, TroposFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TroposPackage init() {
		if (isInited) return (TroposPackage)EPackage.Registry.INSTANCE.getEPackage(TroposPackage.eNS_URI);

		// Obtain or create and register package
		TroposPackageImpl theTroposPackage = (TroposPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof TroposPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new TroposPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTroposPackage.createPackageContents();

		// Initialize created meta-data
		theTroposPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTroposPackage.freeze();

		return theTroposPackage;
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
	public EAttribute getDiagram_Title() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_Object() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphicalObject() {
		return graphicalObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphicalObject_Name() {
		return (EAttribute)graphicalObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActor_ActorType() {
		return (EAttribute)actorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActor_Services() {
		return (EReference)actorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceType() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_ServiceProperties() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Source() {
		return (EReference)relationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelation_Target() {
		return (EReference)relationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_AssociationType() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComposition_CompositionType() {
		return (EAttribute)compositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContribution() {
		return contributionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_ContributionType() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_SatType() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_Weight() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContribution_RelationshipType() {
		return (EAttribute)contributionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_DependencyType() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDependency_DependencyProperties() {
		return (EAttribute)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnership() {
		return ownershipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnership_OwnershipType() {
		return (EAttribute)ownershipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnership_Instantiation() {
		return (EAttribute)ownershipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeansEnd() {
		return meansEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomRelation() {
		return customRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomRelation_Predicate() {
		return (EAttribute)customRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEActorType() {
		return eActorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEServiceType() {
		return eServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEAssociationType() {
		return eAssociationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getECompositionType() {
		return eCompositionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEContributionType() {
		return eContributionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEDependencyType() {
		return eDependencyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEOwnershipType() {
		return eOwnershipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getESATType() {
		return esatTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getERelationshipType() {
		return eRelationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEInstantiationType() {
		return eInstantiationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposFactory getTroposFactory() {
		return (TroposFactory)getEFactoryInstance();
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
		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__TITLE);
		createEReference(diagramEClass, DIAGRAM__OBJECT);

		graphicalObjectEClass = createEClass(GRAPHICAL_OBJECT);
		createEAttribute(graphicalObjectEClass, GRAPHICAL_OBJECT__NAME);

		actorEClass = createEClass(ACTOR);
		createEAttribute(actorEClass, ACTOR__ACTOR_TYPE);
		createEReference(actorEClass, ACTOR__SERVICES);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_TYPE);
		createEAttribute(serviceEClass, SERVICE__SERVICE_PROPERTIES);

		relationEClass = createEClass(RELATION);
		createEReference(relationEClass, RELATION__SOURCE);
		createEReference(relationEClass, RELATION__TARGET);

		associationEClass = createEClass(ASSOCIATION);
		createEAttribute(associationEClass, ASSOCIATION__ASSOCIATION_TYPE);

		compositionEClass = createEClass(COMPOSITION);
		createEAttribute(compositionEClass, COMPOSITION__COMPOSITION_TYPE);

		contributionEClass = createEClass(CONTRIBUTION);
		createEAttribute(contributionEClass, CONTRIBUTION__CONTRIBUTION_TYPE);
		createEAttribute(contributionEClass, CONTRIBUTION__SAT_TYPE);
		createEAttribute(contributionEClass, CONTRIBUTION__WEIGHT);
		createEAttribute(contributionEClass, CONTRIBUTION__RELATIONSHIP_TYPE);

		dependencyEClass = createEClass(DEPENDENCY);
		createEAttribute(dependencyEClass, DEPENDENCY__DEPENDENCY_TYPE);
		createEAttribute(dependencyEClass, DEPENDENCY__DEPENDENCY_PROPERTIES);

		ownershipEClass = createEClass(OWNERSHIP);
		createEAttribute(ownershipEClass, OWNERSHIP__OWNERSHIP_TYPE);
		createEAttribute(ownershipEClass, OWNERSHIP__INSTANTIATION);

		meansEndEClass = createEClass(MEANS_END);

		customRelationEClass = createEClass(CUSTOM_RELATION);
		createEAttribute(customRelationEClass, CUSTOM_RELATION__PREDICATE);

		// Create enums
		eActorTypeEEnum = createEEnum(EACTOR_TYPE);
		eServiceTypeEEnum = createEEnum(ESERVICE_TYPE);
		eAssociationTypeEEnum = createEEnum(EASSOCIATION_TYPE);
		eCompositionTypeEEnum = createEEnum(ECOMPOSITION_TYPE);
		eContributionTypeEEnum = createEEnum(ECONTRIBUTION_TYPE);
		eDependencyTypeEEnum = createEEnum(EDEPENDENCY_TYPE);
		eOwnershipTypeEEnum = createEEnum(EOWNERSHIP_TYPE);
		esatTypeEEnum = createEEnum(ESAT_TYPE);
		eRelationshipTypeEEnum = createEEnum(ERELATIONSHIP_TYPE);
		eInstantiationTypeEEnum = createEEnum(EINSTANTIATION_TYPE);
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
	 * @generated NOT
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Add supertypes to classes
		actorEClass.getESuperTypes().add(this.getGraphicalObject());
		serviceEClass.getESuperTypes().add(this.getGraphicalObject());
		relationEClass.getESuperTypes().add(this.getGraphicalObject());
		associationEClass.getESuperTypes().add(this.getRelation());
		compositionEClass.getESuperTypes().add(this.getRelation());
		contributionEClass.getESuperTypes().add(this.getRelation());
		dependencyEClass.getESuperTypes().add(this.getRelation());
		ownershipEClass.getESuperTypes().add(this.getRelation());
		meansEndEClass.getESuperTypes().add(this.getRelation());
		customRelationEClass.getESuperTypes().add(this.getRelation());
		
		// Initialize classes and features; add operations and parameters
		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Title(), ecorePackage.getEString(), "title", "TroposDiagram", 1, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Object(), this.getGraphicalObject(), null, "object", "", 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphicalObjectEClass, GraphicalObject.class, "GraphicalObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphicalObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, GraphicalObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActor_ActorType(), this.getEActorType(), "actorType", "AGENT", 1, 1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActor_Services(), this.getService(), null, "services", "", 0, -1, Actor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_ServiceType(), this.getEServiceType(), "serviceType", "GOAL", 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceProperties(), ecorePackage.getEString(), "serviceProperties", "", 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelation_Source(), this.getGraphicalObject(), null, "source", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelation_Target(), this.getGraphicalObject(), null, "target", null, 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssociation_AssociationType(), this.getEAssociationType(), "associationType", "IS_PART_OF", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComposition_CompositionType(), this.getECompositionType(), "compositionType", "AND", 1, 1, Composition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contributionEClass, Contribution.class, "Contribution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContribution_ContributionType(), this.getEContributionType(), "contributionType", "PP", 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_SatType(), this.getESATType(), "satType", "NA", 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_Weight(), ecorePackage.getEDouble(), "weight", "0", 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContribution_RelationshipType(), this.getERelationshipType(), "relationshipType", "CONTRIBUTION", 1, 1, Contribution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependency_DependencyType(), this.getEDependencyType(), "dependencyType", "DELEGATION_EXECUTION", 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependency_DependencyProperties(), ecorePackage.getEString(), "dependencyProperties", "", 1, 1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ownershipEClass, Ownership.class, "Ownership", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOwnership_OwnershipType(), this.getEOwnershipType(), "ownershipType", "OWN", 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOwnership_Instantiation(), this.getEInstantiationType(), "instantiation", "EXISTENTIAL", 1, 1, Ownership.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		initEClass(meansEndEClass, MeansEnd.class, "MeansEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customRelationEClass, CustomRelation.class, "CustomRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomRelation_Predicate(), ecorePackage.getEString(), "predicate", "", 1, 1, CustomRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		
		// Initialize enums and add enum literals
		initEEnum(eActorTypeEEnum, EActorType.class, "EActorType");
		addEEnumLiteral(eActorTypeEEnum, EActorType.ACTOR_LITERAL);
		addEEnumLiteral(eActorTypeEEnum, EActorType.AGENT_LITERAL);
		addEEnumLiteral(eActorTypeEEnum, EActorType.ROLE_LITERAL);
		addEEnumLiteral(eActorTypeEEnum, EActorType.POSITION_LITERAL);

		initEEnum(eServiceTypeEEnum, EServiceType.class, "EServiceType");
		addEEnumLiteral(eServiceTypeEEnum, EServiceType.GOAL_LITERAL);
		addEEnumLiteral(eServiceTypeEEnum, EServiceType.SOFTGOAL_LITERAL);
		addEEnumLiteral(eServiceTypeEEnum, EServiceType.TASK_LITERAL);
		addEEnumLiteral(eServiceTypeEEnum, EServiceType.RESOURCE_LITERAL);
		addEEnumLiteral(eServiceTypeEEnum, EServiceType.EVENT_LITERAL);

		initEEnum(eAssociationTypeEEnum, EAssociationType.class, "EAssociationType");
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.IS_PART_OF_LITERAL);
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.IS_A_LITERAL);
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.PLAY_LITERAL);
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.COVER_LITERAL);
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.OCCUPY_LITERAL);
		addEEnumLiteral(eAssociationTypeEEnum, EAssociationType.SUPERVISE_LITERAL);

		initEEnum(eCompositionTypeEEnum, ECompositionType.class, "ECompositionType");
		addEEnumLiteral(eCompositionTypeEEnum, ECompositionType.AND_LITERAL);
		addEEnumLiteral(eCompositionTypeEEnum, ECompositionType.OR_LITERAL);

		initEEnum(eContributionTypeEEnum, EContributionType.class, "EContributionType");
		addEEnumLiteral(eContributionTypeEEnum, EContributionType.PP_LITERAL);
		addEEnumLiteral(eContributionTypeEEnum, EContributionType.P_LITERAL);
		addEEnumLiteral(eContributionTypeEEnum, EContributionType.M_LITERAL);
		addEEnumLiteral(eContributionTypeEEnum, EContributionType.MM_LITERAL);

		initEEnum(eDependencyTypeEEnum, EDependencyType.class, "EDependencyType");
		//addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.DEPENDENCY_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.DELEGATION_EXECUTION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.DELEGATION_PERMISSION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.TRUST_EXECUTION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.TRUST_PERMISSION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.DISTRUST_EXECUTION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.DISTRUST_PERMISSION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.TRUST_MONITOR_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.MONITORING_EXECUTION_LITERAL);
		addEEnumLiteral(eDependencyTypeEEnum, EDependencyType.MONITORING_PERMISSION_LITERAL);

		initEEnum(eOwnershipTypeEEnum, EOwnershipType.class, "EOwnershipType");
		addEEnumLiteral(eOwnershipTypeEEnum, EOwnershipType.OWN_LITERAL);
		addEEnumLiteral(eOwnershipTypeEEnum, EOwnershipType.REQUEST_LITERAL);
		addEEnumLiteral(eOwnershipTypeEEnum, EOwnershipType.PROVIDE_LITERAL);

		initEEnum(esatTypeEEnum, ESATType.class, "ESATType");
		addEEnumLiteral(esatTypeEEnum, ESATType.SAT_LITERAL);
		addEEnumLiteral(esatTypeEEnum, ESATType.DEN_LITERAL);
		addEEnumLiteral(esatTypeEEnum, ESATType.NA_LITERAL);

		initEEnum(eRelationshipTypeEEnum, ERelationshipType.class, "ERelationshipType");
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.CONTRIBUTION_LITERAL);
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.IMPACT_LITERAL);
		addEEnumLiteral(eRelationshipTypeEEnum, ERelationshipType.ALLEVIATION_LITERAL);

		initEEnum(eInstantiationTypeEEnum, EInstantiationType.class, "EInstantiationType");
		addEEnumLiteral(eInstantiationTypeEEnum, EInstantiationType.EXISTENTIAL_LITERAL);
		addEEnumLiteral(eInstantiationTypeEEnum, EInstantiationType.UNIVERSAL_LITERAL);
		
		// Create resource
		createResource(eNS_URI);
	}
} //TroposPackageImpl
