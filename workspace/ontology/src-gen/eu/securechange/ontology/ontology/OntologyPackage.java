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
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__GOALS = 0;

  /**
   * The feature id for the '<em><b>Domains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__DOMAINS = 1;

  /**
   * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD__RELATIONSHIPS = 2;

  /**
   * The number of structural features of the '<em>World</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORLD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.GoalImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TYPE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.SecurityGoalImpl <em>Security Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.SecurityGoalImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getSecurityGoal()
   * @generated
   */
  int SECURITY_GOAL = 3;

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
  int REQUIREMENT = 4;

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
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.AntiRequirementImpl <em>Anti Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.AntiRequirementImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAntiRequirement()
   * @generated
   */
  int ANTI_REQUIREMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_REQUIREMENT__NAME = GOAL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_REQUIREMENT__TYPE = GOAL__TYPE;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_REQUIREMENT__PROPERTIES = GOAL__PROPERTIES;

  /**
   * The number of structural features of the '<em>Anti Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANTI_REQUIREMENT_FEATURE_COUNT = GOAL_FEATURE_COUNT + 0;

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
  int DOMAIN__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__TYPE = 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__PROPERTIES = 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.ActorImpl <em>Actor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.ActorImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getActor()
   * @generated
   */
  int ACTOR = 7;

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
  int ACTION = 8;

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
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.AssetImpl <em>Asset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.AssetImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAsset()
   * @generated
   */
  int ASSET = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__TYPE = DOMAIN__TYPE;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET__PROPERTIES = DOMAIN__PROPERTIES;

  /**
   * The number of structural features of the '<em>Asset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSET_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.AttackerImpl <em>Attacker</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.AttackerImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAttacker()
   * @generated
   */
  int ATTACKER = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__NAME = DOMAIN__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__TYPE = DOMAIN__TYPE;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER__PROPERTIES = DOMAIN__PROPERTIES;

  /**
   * The number of structural features of the '<em>Attacker</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTACKER_FEATURE_COUNT = DOMAIN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link eu.securechange.ontology.ontology.impl.PropositionImpl <em>Proposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.ontology.ontology.impl.PropositionImpl
   * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getProposition()
   * @generated
   */
  int PROPOSITION = 12;

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
  int RELATIONSHIP = 13;

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
  int REL_TYPE = 14;


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
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.World#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see eu.securechange.ontology.ontology.World#getGoals()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Goals();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.World#getDomains <em>Domains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domains</em>'.
   * @see eu.securechange.ontology.ontology.World#getDomains()
   * @see #getWorld()
   * @generated
   */
  EReference getWorld_Domains();

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
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see eu.securechange.ontology.ontology.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.ontology.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Goal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.ontology.Goal#getType()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.Goal#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.securechange.ontology.ontology.Goal#getProperties()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Properties();

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
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.AntiRequirement <em>Anti Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anti Requirement</em>'.
   * @see eu.securechange.ontology.ontology.AntiRequirement
   * @generated
   */
  EClass getAntiRequirement();

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
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.ontology.ontology.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.ontology.ontology.Domain#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.ontology.ontology.Domain#getType()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.ontology.ontology.Domain#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.securechange.ontology.ontology.Domain#getProperties()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Properties();

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
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asset</em>'.
   * @see eu.securechange.ontology.ontology.Asset
   * @generated
   */
  EClass getAsset();

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
   * Returns the meta object for class '{@link eu.securechange.ontology.ontology.Attacker <em>Attacker</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attacker</em>'.
   * @see eu.securechange.ontology.ontology.Attacker
   * @generated
   */
  EClass getAttacker();

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
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__GOALS = eINSTANCE.getWorld_Goals();

    /**
     * The meta object literal for the '<em><b>Domains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__DOMAINS = eINSTANCE.getWorld_Domains();

    /**
     * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORLD__RELATIONSHIPS = eINSTANCE.getWorld_Relationships();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__TYPE = eINSTANCE.getGoal_Type();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__PROPERTIES = eINSTANCE.getGoal_Properties();

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
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.AntiRequirementImpl <em>Anti Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.AntiRequirementImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAntiRequirement()
     * @generated
     */
    EClass ANTI_REQUIREMENT = eINSTANCE.getAntiRequirement();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__TYPE = eINSTANCE.getDomain_Type();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__PROPERTIES = eINSTANCE.getDomain_Properties();

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
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.AssetImpl <em>Asset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.AssetImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAsset()
     * @generated
     */
    EClass ASSET = eINSTANCE.getAsset();

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
     * The meta object literal for the '{@link eu.securechange.ontology.ontology.impl.AttackerImpl <em>Attacker</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.ontology.ontology.impl.AttackerImpl
     * @see eu.securechange.ontology.ontology.impl.OntologyPackageImpl#getAttacker()
     * @generated
     */
    EClass ATTACKER = eINSTANCE.getAttacker();

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
