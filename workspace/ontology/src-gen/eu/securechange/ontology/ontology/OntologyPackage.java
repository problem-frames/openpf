/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.securechange.ontology.ontology.OntologyFactory
 * @model kind="package"
 * @generated
 */
public interface OntologyPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ontology";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://securechange.eu/ontology";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ontology";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OntologyPackage eINSTANCE = eu.securechange.ontology.ontology.impl.OntologyPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.SituationImpl <em>Situation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.SituationImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getSituation()
   * @generated
   */
  int SITUATION = 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION__TIME = 0;

  /**
   * The feature id for the '<em><b>World</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION__WORLD = 1;

  /**
   * The number of structural features of the '<em>Situation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.WorldImpl <em>World</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.WorldImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getWorld()
   * @generated
   */
  int WORLD = 1;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__ENTITIES = 0;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__RELATIONSHIPS = 1;

  /**
   * The number of structural features of the '<em>World</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.EntityImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE = 1;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ASSET = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.GoalImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TYPE = ENTITY__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ASSET = ENTITY__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PROPERTIES = ENTITY__PROPERTIES;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.SecurityGoalImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getSecurityGoal()
   * @generated
   */
  int SECURITY_GOAL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_GOAL__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_GOAL__TYPE = GOAL__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_GOAL__ASSET = GOAL__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_GOAL__PROPERTIES = GOAL__PROPERTIES;

  /**
   * The number of structural features of the '<em>Security Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SECURITY_GOAL_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.RequirementImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TYPE = GOAL__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ASSET = GOAL__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__PROPERTIES = GOAL__PROPERTIES;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.DomainImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = ENTITY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__TYPE = ENTITY__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__ASSET = ENTITY__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__PROPERTIES = ENTITY__PROPERTIES;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.AssetImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__VALUE = 1;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.ActorImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__TYPE = DOMAIN__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__ASSET = DOMAIN__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR__PROPERTIES = DOMAIN__PROPERTIES;

  /**
   * The number of structural features of the '<em>Actor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTOR_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.ActionImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__TYPE = DOMAIN__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ASSET = DOMAIN__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__PROPERTIES = DOMAIN__PROPERTIES;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.ResourceImpl <em>Resource</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.ResourceImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getResource()
   * @generated
   */
  int RESOURCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__TYPE = DOMAIN__TYPE;

  /**
   * The feature id for the '<em><b>Asset</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__ASSET = DOMAIN__ASSET;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE__PROPERTIES = DOMAIN__PROPERTIES;

  /**
   * The number of structural features of the '<em>Resource</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESOURCE_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.PropositionImpl <em>Proposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.PropositionImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getProposition()
   * @generated
   */
  int PROPOSITION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Proposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPOSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.RelationshipImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 12;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET = 2;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.RelType <em>Rel Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.RelType
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRelType()
   * @generated
   */
  int REL_TYPE = 13;


  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Situation <em>Situation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation</em>'.
   * @see eu.securechange.ontology.ontology.Situation
   * @generated
   */
  EClass getSituation();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Situation#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see eu.securechange.ontology.ontology.Situation#getTime()
   * @see #getSituation()
   * @generated
   */
  EAttribute getSituation_Time();

  /**
   * Returns the meta object for the containment reference '{@link eu.securechange.ontology.ontology.Situation#getWorld <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>World</em>'.
   * @see eu.securechange.ontology.ontology.Situation#getWorld()
   * @see #getSituation()
   * @generated
   */
  EReference getSituation_World();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.World <em>World</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>World</em>'.
   * @see eu.securechange.ontology.ontology.World
   * @generated
   */
  EClass getWorld();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.World#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see eu.securechange.ontology.ontology.World#getEntities()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Entities();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.World#getRelationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationships</em>'.
   * @see eu.securechange.ontology.ontology.World#getRelationships()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Relationships();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see eu.securechange.ontology.ontology.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.ontology.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Entity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.ontology.Entity#getType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Type();

  /**
   * Returns the meta object for the containment reference '{@link eu.securechange.ontology.ontology.Entity#getAsset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Asset</em>'.
   * @see eu.securechange.ontology.ontology.Entity#getAsset()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Asset();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.Entity#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.securechange.ontology.ontology.Entity#getProperties()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Properties();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see eu.securechange.ontology.ontology.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.SecurityGoal <em>Security Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Security Goal</em>'.
   * @see eu.securechange.ontology.ontology.SecurityGoal
   * @generated
   */
  EClass getSecurityGoal();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see eu.securechange.ontology.ontology.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see eu.securechange.ontology.ontology.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see eu.securechange.ontology.ontology.Asset
   * @generated
   */
  EClass getAsset();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Asset#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.ontology.Asset#getName()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Asset#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see eu.securechange.ontology.ontology.Asset#getValue()
   * @see #getAsset()
   * @generated
   */
  EAttribute getAsset_Value();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actor</em>'.
   * @see eu.securechange.ontology.ontology.Actor
   * @generated
   */
  EClass getActor();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see eu.securechange.ontology.ontology.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resource</em>'.
   * @see eu.securechange.ontology.ontology.Resource
   * @generated
   */
  EClass getResource();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Proposition</em>'.
   * @see eu.securechange.ontology.ontology.Proposition
   * @generated
   */
  EClass getProposition();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Proposition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.ontology.Proposition#getName()
   * @see #getProposition()
   * @generated
   */
  EAttribute getProposition_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see eu.securechange.ontology.ontology.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.ontology.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.ontology.Relationship#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.ontology.ontology.Relationship#getSource()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.ontology.ontology.Relationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.ontology.ontology.Relationship#getTarget()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Target();

  /**
   * Returns the meta object for enum '{@link eu.securechange.ontology.ontology.RelType <em>Rel Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Rel Type</em>'.
   * @see eu.securechange.ontology.ontology.RelType
   * @generated
   */
  EEnum getRelType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OntologyFactory getOntologyFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.SituationImpl <em>Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.SituationImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getSituation()
     * @generated
     */
    EClass SITUATION = eINSTANCE.getSituation();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SITUATION__TIME = eINSTANCE.getSituation_Time();

    /**
     * The meta object literal for the '<em><b>World</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITUATION__WORLD = eINSTANCE.getSituation_World();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.WorldImpl <em>World</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.WorldImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getWorld()
     * @generated
     */
    EClass WORLD = eINSTANCE.getWorld();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__ENTITIES = eINSTANCE.getWorld_Entities();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__RELATIONSHIPS = eINSTANCE.getWorld_Relationships();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.EntityImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

    /**
     * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ASSET = eINSTANCE.getEntity_Asset();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__PROPERTIES = eINSTANCE.getEntity_Properties();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.GoalImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.SecurityGoalImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getSecurityGoal()
     * @generated
     */
    EClass SECURITY_GOAL = eINSTANCE.getSecurityGoal();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.RequirementImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.DomainImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.AssetImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSET__VALUE = eINSTANCE.getAsset_Value();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.ActorImpl <em>Actor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.ActorImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getActor()
     * @generated
     */
    EClass ACTOR = eINSTANCE.getActor();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.ActionImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.ResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.ResourceImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getResource()
     * @generated
     */
    EClass RESOURCE = eINSTANCE.getResource();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.PropositionImpl <em>Proposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.PropositionImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getProposition()
     * @generated
     */
    EClass PROPOSITION = eINSTANCE.getProposition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPOSITION__NAME = eINSTANCE.getProposition_Name();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.RelationshipImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getRelationship();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

    /**
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.RelType <em>Rel Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.RelType
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getRelType()
     * @generated
     */
    EEnum REL_TYPE = eINSTANCE.getRelType();

  }

} //OntologyPackage
