/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

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
 * @see eu.securechange.situation.SituationFactory
 * @model kind="package"
 * @generated
 */
public interface SituationPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "situation";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://securechange.eu/situation";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "situation";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SituationPackage eINSTANCE = eu.securechange.situation.impl.SituationPackageImpl.init();

  /**
   * The meta object id for the '{@link eu.securechange.situation.impl.SituationImpl <em>Situation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.impl.SituationImpl
   * @see eu.securechange.situation.impl.SituationPackageImpl#getSituation()
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
   * The feature id for the '<em><b>Things</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION__THINGS = 1;

  /**
   * The number of structural features of the '<em>Situation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SITUATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link eu.securechange.situation.impl.ThingImpl <em>Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.impl.ThingImpl
   * @see eu.securechange.situation.impl.SituationPackageImpl#getThing()
   * @generated
   */
  int THING = 1;

  /**
   * The number of structural features of the '<em>Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link eu.securechange.situation.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.impl.EntityImpl
   * @see eu.securechange.situation.impl.SituationPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__TYPE = THING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = THING_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = THING_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link eu.securechange.situation.impl.RelationshipImpl <em>Relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.impl.RelationshipImpl
   * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationship()
   * @generated
   */
  int RELATIONSHIP = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TYPE = THING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__SOURCE = THING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP__TARGET = THING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = THING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.situation.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.impl.DomainImpl
   * @see eu.securechange.situation.impl.SituationPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__NAME = THING_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__TYPE = THING_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__PROPERTIES = THING_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = THING_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link eu.securechange.situation.EntityType <em>Entity Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.EntityType
   * @see eu.securechange.situation.impl.SituationPackageImpl#getEntityType()
   * @generated
   */
  int ENTITY_TYPE = 5;

  /**
   * The meta object id for the '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.DomainType
   * @see eu.securechange.situation.impl.SituationPackageImpl#getDomainType()
   * @generated
   */
  int DOMAIN_TYPE = 6;

  /**
   * The meta object id for the '{@link eu.securechange.situation.RelationshipType <em>Relationship Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see eu.securechange.situation.RelationshipType
   * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationshipType()
   * @generated
   */
  int RELATIONSHIP_TYPE = 7;


  /**
   * Returns the meta object for class '{@link eu.securechange.situation.Situation <em>Situation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Situation</em>'.
   * @see eu.securechange.situation.Situation
   * @generated
   */
  EClass getSituation();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Situation#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see eu.securechange.situation.Situation#getTime()
   * @see #getSituation()
   * @generated
   */
  EAttribute getSituation_Time();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.situation.Situation#getThings <em>Things</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Things</em>'.
   * @see eu.securechange.situation.Situation#getThings()
   * @see #getSituation()
   * @generated
   */
  EReference getSituation_Things();

  /**
   * Returns the meta object for class '{@link eu.securechange.situation.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thing</em>'.
   * @see eu.securechange.situation.Thing
   * @generated
   */
  EClass getThing();

  /**
   * Returns the meta object for class '{@link eu.securechange.situation.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see eu.securechange.situation.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Entity#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.situation.Entity#getType()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Type();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.situation.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for class '{@link eu.securechange.situation.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Relationship</em>'.
   * @see eu.securechange.situation.Relationship
   * @generated
   */
  EClass getRelationship();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Relationship#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.situation.Relationship#getType()
   * @see #getRelationship()
   * @generated
   */
  EAttribute getRelationship_Type();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.situation.Relationship#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see eu.securechange.situation.Relationship#getSource()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Source();

  /**
   * Returns the meta object for the reference '{@link eu.securechange.situation.Relationship#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see eu.securechange.situation.Relationship#getTarget()
   * @see #getRelationship()
   * @generated
   */
  EReference getRelationship_Target();

  /**
   * Returns the meta object for class '{@link eu.securechange.situation.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see eu.securechange.situation.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Domain#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see eu.securechange.situation.Domain#getName()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Name();

  /**
   * Returns the meta object for the attribute '{@link eu.securechange.situation.Domain#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see eu.securechange.situation.Domain#getType()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_Type();

  /**
   * Returns the meta object for the containment reference list '{@link eu.securechange.situation.Domain#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see eu.securechange.situation.Domain#getProperties()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Properties();

  /**
   * Returns the meta object for enum '{@link eu.securechange.situation.EntityType <em>Entity Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Entity Type</em>'.
   * @see eu.securechange.situation.EntityType
   * @generated
   */
  EEnum getEntityType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Domain Type</em>'.
   * @see eu.securechange.situation.DomainType
   * @generated
   */
  EEnum getDomainType();

  /**
   * Returns the meta object for enum '{@link eu.securechange.situation.RelationshipType <em>Relationship Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Relationship Type</em>'.
   * @see eu.securechange.situation.RelationshipType
   * @generated
   */
  EEnum getRelationshipType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SituationFactory getSituationFactory();

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
     * The meta object literal for the '{@link eu.securechange.situation.impl.SituationImpl <em>Situation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.impl.SituationImpl
     * @see eu.securechange.situation.impl.SituationPackageImpl#getSituation()
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
     * The meta object literal for the '<em><b>Things</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SITUATION__THINGS = eINSTANCE.getSituation_Things();

    /**
     * The meta object literal for the '{@link eu.securechange.situation.impl.ThingImpl <em>Thing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.impl.ThingImpl
     * @see eu.securechange.situation.impl.SituationPackageImpl#getThing()
     * @generated
     */
    EClass THING = eINSTANCE.getThing();

    /**
     * The meta object literal for the '{@link eu.securechange.situation.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.impl.EntityImpl
     * @see eu.securechange.situation.impl.SituationPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__TYPE = eINSTANCE.getEntity_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '{@link eu.securechange.situation.impl.RelationshipImpl <em>Relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.impl.RelationshipImpl
     * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationship()
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
     * The meta object literal for the '{@link eu.securechange.situation.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.impl.DomainImpl
     * @see eu.securechange.situation.impl.SituationPackageImpl#getDomain()
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
     * The meta object literal for the '{@link eu.securechange.situation.EntityType <em>Entity Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.EntityType
     * @see eu.securechange.situation.impl.SituationPackageImpl#getEntityType()
     * @generated
     */
    EEnum ENTITY_TYPE = eINSTANCE.getEntityType();

    /**
     * The meta object literal for the '{@link eu.securechange.situation.DomainType <em>Domain Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.DomainType
     * @see eu.securechange.situation.impl.SituationPackageImpl#getDomainType()
     * @generated
     */
    EEnum DOMAIN_TYPE = eINSTANCE.getDomainType();

    /**
     * The meta object literal for the '{@link eu.securechange.situation.RelationshipType <em>Relationship Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see eu.securechange.situation.RelationshipType
     * @see eu.securechange.situation.impl.SituationPackageImpl#getRelationshipType()
     * @generated
     */
    EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

  }

} //SituationPackage
