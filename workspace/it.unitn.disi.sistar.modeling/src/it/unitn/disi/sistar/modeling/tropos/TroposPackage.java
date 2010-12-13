/**
 * <copyright>
 * </copyright>
 *
 * $Id: TroposPackage.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

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
 * @see it.unitn.disi.sistar.modeling.tropos.TroposFactory
 * @model kind="package"
 * @generated
 */
public interface TroposPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tropos";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.troposproject.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TroposPackage eINSTANCE = it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl.init();

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.DiagramImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OBJECT = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.GraphicalObjectImpl <em>Graphical Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.GraphicalObjectImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getGraphicalObject()
	 * @generated
	 */
	int GRAPHICAL_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Graphical Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPHICAL_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = GRAPHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ACTOR_TYPE = GRAPHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SERVICES = GRAPHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = GRAPHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = GRAPHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_TYPE = GRAPHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SERVICE_PROPERTIES = GRAPHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = GRAPHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.RelationImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = GRAPHICAL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__SOURCE = GRAPHICAL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = GRAPHICAL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = GRAPHICAL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.AssociationImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__ASSOCIATION_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.CompositionImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Composition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__COMPOSITION_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Contribution Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTRIBUTION_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__SAT_TYPE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__WEIGHT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__RELATIONSHIP_TYPE = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Dependency Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependency Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__DEPENDENCY_PROPERTIES = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl <em>Ownership</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getOwnership()
	 * @generated
	 */
	int OWNERSHIP = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Ownership Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__OWNERSHIP_TYPE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instantiation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP__INSTANTIATION = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Ownership</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OWNERSHIP_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.MeansEndImpl <em>Means End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.MeansEndImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getMeansEnd()
	 * @generated
	 */
	int MEANS_END = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END__TARGET = RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Means End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEANS_END_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.CustomRelationImpl <em>Custom Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.CustomRelationImpl
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getCustomRelation()
	 * @generated
	 */
	int CUSTOM_RELATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RELATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RELATION__SOURCE = RELATION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RELATION__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Predicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RELATION__PREDICATE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RELATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EActorType <em>EActor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EActorType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEActorType()
	 * @generated
	 */
	int EACTOR_TYPE = 12;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EServiceType <em>EService Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EServiceType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEServiceType()
	 * @generated
	 */
	int ESERVICE_TYPE = 13;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EAssociationType <em>EAssociation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EAssociationType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEAssociationType()
	 * @generated
	 */
	int EASSOCIATION_TYPE = 14;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.ECompositionType <em>EComposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.ECompositionType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getECompositionType()
	 * @generated
	 */
	int ECOMPOSITION_TYPE = 15;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EContributionType <em>EContribution Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EContributionType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEContributionType()
	 * @generated
	 */
	int ECONTRIBUTION_TYPE = 16;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EDependencyType <em>EDependency Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EDependencyType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEDependencyType()
	 * @generated
	 */
	int EDEPENDENCY_TYPE = 17;

	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EOwnershipType <em>EOwnership Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EOwnershipType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEOwnershipType()
	 * @generated
	 */
	int EOWNERSHIP_TYPE = 18;


	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.ESATType <em>ESAT Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.ESATType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getESATType()
	 * @generated
	 */
	int ESAT_TYPE = 19;


	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.ERelationshipType <em>ERelationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.ERelationshipType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getERelationshipType()
	 * @generated
	 */
	int ERELATIONSHIP_TYPE = 20;


	/**
	 * The meta object id for the '{@link it.unitn.disi.sistar.modeling.tropos.EInstantiationType <em>EInstantiation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see it.unitn.disi.sistar.modeling.tropos.EInstantiationType
	 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEInstantiationType()
	 * @generated
	 */
	int EINSTANTIATION_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Diagram#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Diagram#getTitle()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.sistar.modeling.tropos.Diagram#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Diagram#getObject()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_Object();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.GraphicalObject <em>Graphical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graphical Object</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.GraphicalObject
	 * @generated
	 */
	EClass getGraphicalObject();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.GraphicalObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.GraphicalObject#getName()
	 * @see #getGraphicalObject()
	 * @generated
	 */
	EAttribute getGraphicalObject_Name();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Actor#getActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actor Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Actor#getActorType()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ActorType();

	/**
	 * Returns the meta object for the containment reference list '{@link it.unitn.disi.sistar.modeling.tropos.Actor#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Actor#getServices()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Services();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Service#getServiceType()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceType();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Service#getServiceProperties <em>Service Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Properties</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Service#getServiceProperties()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ServiceProperties();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.sistar.modeling.tropos.Relation#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Relation#getSource()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Source();

	/**
	 * Returns the meta object for the reference '{@link it.unitn.disi.sistar.modeling.tropos.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Association#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Association#getAssociationType()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_AssociationType();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Composition#getCompositionType <em>Composition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Composition Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Composition#getCompositionType()
	 * @see #getComposition()
	 * @generated
	 */
	EAttribute getComposition_CompositionType();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getContributionType <em>Contribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contribution Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Contribution#getContributionType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_ContributionType();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getSatType <em>Sat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sat Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Contribution#getSatType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_SatType();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Contribution#getWeight()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Weight();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Contribution#getRelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Contribution#getRelationshipType()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_RelationshipType();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyType <em>Dependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyType()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_DependencyType();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyProperties <em>Dependency Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency Properties</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Dependency#getDependencyProperties()
	 * @see #getDependency()
	 * @generated
	 */
	EAttribute getDependency_DependencyProperties();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.Ownership <em>Ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ownership</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Ownership
	 * @generated
	 */
	EClass getOwnership();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getOwnershipType <em>Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ownership Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Ownership#getOwnershipType()
	 * @see #getOwnership()
	 * @generated
	 */
	EAttribute getOwnership_OwnershipType();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.Ownership#getInstantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instantiation</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.Ownership#getInstantiation()
	 * @see #getOwnership()
	 * @generated
	 */
	EAttribute getOwnership_Instantiation();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.MeansEnd <em>Means End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Means End</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.MeansEnd
	 * @generated
	 */
	EClass getMeansEnd();

	/**
	 * Returns the meta object for class '{@link it.unitn.disi.sistar.modeling.tropos.CustomRelation <em>Custom Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Relation</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.CustomRelation
	 * @generated
	 */
	EClass getCustomRelation();

	/**
	 * Returns the meta object for the attribute '{@link it.unitn.disi.sistar.modeling.tropos.CustomRelation#getPredicate <em>Predicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Predicate</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.CustomRelation#getPredicate()
	 * @see #getCustomRelation()
	 * @generated
	 */
	EAttribute getCustomRelation_Predicate();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EActorType <em>EActor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EActor Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EActorType
	 * @generated
	 */
	EEnum getEActorType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EServiceType <em>EService Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EService Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EServiceType
	 * @generated
	 */
	EEnum getEServiceType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EAssociationType <em>EAssociation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EAssociation Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EAssociationType
	 * @generated
	 */
	EEnum getEAssociationType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.ECompositionType <em>EComposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EComposition Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.ECompositionType
	 * @generated
	 */
	EEnum getECompositionType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EContributionType <em>EContribution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EContribution Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EContributionType
	 * @generated
	 */
	EEnum getEContributionType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EDependencyType <em>EDependency Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EDependency Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EDependencyType
	 * @generated
	 */
	EEnum getEDependencyType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EOwnershipType <em>EOwnership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EOwnership Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EOwnershipType
	 * @generated
	 */
	EEnum getEOwnershipType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.ESATType <em>ESAT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ESAT Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.ESATType
	 * @generated
	 */
	EEnum getESATType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.ERelationshipType <em>ERelationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ERelationship Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.ERelationshipType
	 * @generated
	 */
	EEnum getERelationshipType();

	/**
	 * Returns the meta object for enum '{@link it.unitn.disi.sistar.modeling.tropos.EInstantiationType <em>EInstantiation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EInstantiation Type</em>'.
	 * @see it.unitn.disi.sistar.modeling.tropos.EInstantiationType
	 * @generated
	 */
	EEnum getEInstantiationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TroposFactory getTroposFactory();

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
	interface Literals  {
		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.DiagramImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__TITLE = eINSTANCE.getDiagram_Title();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OBJECT = eINSTANCE.getDiagram_Object();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.GraphicalObjectImpl <em>Graphical Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.GraphicalObjectImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getGraphicalObject()
		 * @generated
		 */
		EClass GRAPHICAL_OBJECT = eINSTANCE.getGraphicalObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPHICAL_OBJECT__NAME = eINSTANCE.getGraphicalObject_Name();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.ActorImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Actor Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ACTOR_TYPE = eINSTANCE.getActor_ActorType();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__SERVICES = eINSTANCE.getActor_Services();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.ServiceImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_TYPE = eINSTANCE.getService_ServiceType();

		/**
		 * The meta object literal for the '<em><b>Service Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SERVICE_PROPERTIES = eINSTANCE.getService_ServiceProperties();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.RelationImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__SOURCE = eINSTANCE.getRelation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.AssociationImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getAssociation_AssociationType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.CompositionImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>Composition Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITION__COMPOSITION_TYPE = eINSTANCE.getComposition_CompositionType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Contribution Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__CONTRIBUTION_TYPE = eINSTANCE.getContribution_ContributionType();

		/**
		 * The meta object literal for the '<em><b>Sat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__SAT_TYPE = eINSTANCE.getContribution_SatType();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__WEIGHT = eINSTANCE.getContribution_Weight();

		/**
		 * The meta object literal for the '<em><b>Relationship Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__RELATIONSHIP_TYPE = eINSTANCE.getContribution_RelationshipType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.DependencyImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '<em><b>Dependency Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__DEPENDENCY_TYPE = eINSTANCE.getDependency_DependencyType();

		/**
		 * The meta object literal for the '<em><b>Dependency Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY__DEPENDENCY_PROPERTIES = eINSTANCE.getDependency_DependencyProperties();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl <em>Ownership</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.OwnershipImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getOwnership()
		 * @generated
		 */
		EClass OWNERSHIP = eINSTANCE.getOwnership();

		/**
		 * The meta object literal for the '<em><b>Ownership Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNERSHIP__OWNERSHIP_TYPE = eINSTANCE.getOwnership_OwnershipType();

		/**
		 * The meta object literal for the '<em><b>Instantiation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OWNERSHIP__INSTANTIATION = eINSTANCE.getOwnership_Instantiation();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.MeansEndImpl <em>Means End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.MeansEndImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getMeansEnd()
		 * @generated
		 */
		EClass MEANS_END = eINSTANCE.getMeansEnd();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.impl.CustomRelationImpl <em>Custom Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.CustomRelationImpl
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getCustomRelation()
		 * @generated
		 */
		EClass CUSTOM_RELATION = eINSTANCE.getCustomRelation();

		/**
		 * The meta object literal for the '<em><b>Predicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RELATION__PREDICATE = eINSTANCE.getCustomRelation_Predicate();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EActorType <em>EActor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EActorType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEActorType()
		 * @generated
		 */
		EEnum EACTOR_TYPE = eINSTANCE.getEActorType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EServiceType <em>EService Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EServiceType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEServiceType()
		 * @generated
		 */
		EEnum ESERVICE_TYPE = eINSTANCE.getEServiceType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EAssociationType <em>EAssociation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EAssociationType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEAssociationType()
		 * @generated
		 */
		EEnum EASSOCIATION_TYPE = eINSTANCE.getEAssociationType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.ECompositionType <em>EComposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.ECompositionType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getECompositionType()
		 * @generated
		 */
		EEnum ECOMPOSITION_TYPE = eINSTANCE.getECompositionType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EContributionType <em>EContribution Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EContributionType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEContributionType()
		 * @generated
		 */
		EEnum ECONTRIBUTION_TYPE = eINSTANCE.getEContributionType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EDependencyType <em>EDependency Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EDependencyType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEDependencyType()
		 * @generated
		 */
		EEnum EDEPENDENCY_TYPE = eINSTANCE.getEDependencyType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EOwnershipType <em>EOwnership Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EOwnershipType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEOwnershipType()
		 * @generated
		 */
		EEnum EOWNERSHIP_TYPE = eINSTANCE.getEOwnershipType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.ESATType <em>ESAT Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.ESATType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getESATType()
		 * @generated
		 */
		EEnum ESAT_TYPE = eINSTANCE.getESATType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.ERelationshipType <em>ERelationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.ERelationshipType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getERelationshipType()
		 * @generated
		 */
		EEnum ERELATIONSHIP_TYPE = eINSTANCE.getERelationshipType();

		/**
		 * The meta object literal for the '{@link it.unitn.disi.sistar.modeling.tropos.EInstantiationType <em>EInstantiation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see it.unitn.disi.sistar.modeling.tropos.EInstantiationType
		 * @see it.unitn.disi.sistar.modeling.tropos.impl.TroposPackageImpl#getEInstantiationType()
		 * @generated
		 */
		EEnum EINSTANTIATION_TYPE = eINSTANCE.getEInstantiationType();

	}

} //TroposPackage
