/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation.impl;

import eu.securechange.situation.Domain;
import eu.securechange.situation.DomainType;
import eu.securechange.situation.Entity;
import eu.securechange.situation.EntityType;
import eu.securechange.situation.Relationship;
import eu.securechange.situation.RelationshipType;
import eu.securechange.situation.Situation;
import eu.securechange.situation.SituationFactory;
import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.Thing;

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
public class SituationPackageImpl extends EPackageImpl implements SituationPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass situationEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass thingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass entityEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass relationshipEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass domainEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum entityTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum domainTypeEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum relationshipTypeEEnum = null;

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
	 * @see eu.securechange.situation.SituationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private SituationPackageImpl()
  {
		super(eNS_URI, SituationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SituationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static SituationPackage init()
  {
		if (isInited) return (SituationPackage)EPackage.Registry.INSTANCE.getEPackage(SituationPackage.eNS_URI);

		// Obtain or create and register package
		SituationPackageImpl theSituationPackage = (SituationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SituationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SituationPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSituationPackage.createPackageContents();

		// Initialize created meta-data
		theSituationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSituationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SituationPackage.eNS_URI, theSituationPackage);
		return theSituationPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getSituation()
  {
		return situationEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getSituation_Time()
  {
		return (EAttribute)situationEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getSituation_Things()
  {
		return (EReference)situationEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getThing()
  {
		return thingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEntity()
  {
		return entityEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEntity_Type()
  {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getEntity_Name()
  {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRelationship()
  {
		return relationshipEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRelationship_Type()
  {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationship_Source()
  {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRelationship_Target()
  {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getDomain()
  {
		return domainEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getDomain_Type()
  {
		return (EAttribute)domainEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getDomain_Properties()
  {
		return (EReference)domainEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getEntityType()
  {
		return entityTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getDomainType()
  {
		return domainTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getRelationshipType()
  {
		return relationshipTypeEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SituationFactory getSituationFactory()
  {
		return (SituationFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		situationEClass = createEClass(SITUATION);
		createEAttribute(situationEClass, SITUATION__TIME);
		createEReference(situationEClass, SITUATION__THINGS);

		thingEClass = createEClass(THING);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__TYPE);
		createEAttribute(entityEClass, ENTITY__NAME);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		domainEClass = createEClass(DOMAIN);
		createEAttribute(domainEClass, DOMAIN__TYPE);
		createEReference(domainEClass, DOMAIN__PROPERTIES);

		// Create enums
		entityTypeEEnum = createEEnum(ENTITY_TYPE);
		domainTypeEEnum = createEEnum(DOMAIN_TYPE);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
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
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityEClass.getESuperTypes().add(this.getThing());
		relationshipEClass.getESuperTypes().add(this.getThing());
		domainEClass.getESuperTypes().add(this.getThing());

		// Initialize classes and features; add operations and parameters
		initEClass(situationEClass, Situation.class, "Situation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSituation_Time(), ecorePackage.getEString(), "time", null, 0, 1, Situation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSituation_Things(), this.getThing(), null, "things", null, 0, -1, Situation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thingEClass, Thing.class, "Thing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Type(), this.getEntityType(), "type", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationship_Type(), this.getRelationshipType(), "type", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Source(), this.getThing(), null, "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getThing(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainEClass, Domain.class, "Domain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomain_Type(), this.getDomainType(), "type", null, 0, 1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomain_Properties(), this.getEntity(), null, "properties", null, 0, -1, Domain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(entityTypeEEnum, EntityType.class, "EntityType");
		addEEnumLiteral(entityTypeEEnum, EntityType.DOMAIN_ASSUMPTION);
		addEEnumLiteral(entityTypeEEnum, EntityType.FUNCTION);
		addEEnumLiteral(entityTypeEEnum, EntityType.SECURITY);
		addEEnumLiteral(entityTypeEEnum, EntityType.ANTI);
		addEEnumLiteral(entityTypeEEnum, EntityType.QUALITY_PROPOSITION);
		addEEnumLiteral(entityTypeEEnum, EntityType.ARGUMENT);
		addEEnumLiteral(entityTypeEEnum, EntityType.ACTOR);
		addEEnumLiteral(entityTypeEEnum, EntityType.ACTION);
		addEEnumLiteral(entityTypeEEnum, EntityType.ATTACKER);
		addEEnumLiteral(entityTypeEEnum, EntityType.PROCESS);
		addEEnumLiteral(entityTypeEEnum, EntityType.ACTIVITY);
		addEEnumLiteral(entityTypeEEnum, EntityType.RESOURCE);
		addEEnumLiteral(entityTypeEEnum, EntityType.ASSET);
		addEEnumLiteral(entityTypeEEnum, EntityType.EVENT);

		initEEnum(domainTypeEEnum, DomainType.class, "DomainType");
		addEEnumLiteral(domainTypeEEnum, DomainType.MACHINE);
		addEEnumLiteral(domainTypeEEnum, DomainType.REQUIREMENT);
		addEEnumLiteral(domainTypeEEnum, DomainType.SPECIFICATION);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.WANTS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.DOES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.AND);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.OR);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.TRUST);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.DELEGATE);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.HURT);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.HELP);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.BREAK);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.MAKE);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.FULFILS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.PROVIDES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.CONSUMES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.EXPLOITS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.DAMAGES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.ATTACKS);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.ARGUES);

		// Create resource
		createResource(eNS_URI);
	}

} //SituationPackageImpl
