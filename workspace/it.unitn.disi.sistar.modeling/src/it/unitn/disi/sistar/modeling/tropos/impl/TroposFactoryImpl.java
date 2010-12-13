/**
 * <copyright>
 * </copyright>
 *
 * $Id: TroposFactoryImpl.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TroposFactoryImpl extends EFactoryImpl implements TroposFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TroposFactory init() {
		try {
			TroposFactory theTroposFactory = (TroposFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.troposproject.org"); 
			if (theTroposFactory != null) {
				return theTroposFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TroposFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TroposPackage.DIAGRAM: return createDiagram();
			case TroposPackage.GRAPHICAL_OBJECT: return createGraphicalObject();
			case TroposPackage.ACTOR: return createActor();
			case TroposPackage.SERVICE: return createService();
			case TroposPackage.RELATION: return createRelation();
			case TroposPackage.ASSOCIATION: return createAssociation();
			case TroposPackage.COMPOSITION: return createComposition();
			case TroposPackage.CONTRIBUTION: return createContribution();
			case TroposPackage.DEPENDENCY: return createDependency();
			case TroposPackage.OWNERSHIP: return createOwnership();
			case TroposPackage.MEANS_END: return createMeansEnd();
			case TroposPackage.CUSTOM_RELATION: return createCustomRelation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TroposPackage.EACTOR_TYPE:
				return createEActorTypeFromString(eDataType, initialValue);
			case TroposPackage.ESERVICE_TYPE:
				return createEServiceTypeFromString(eDataType, initialValue);
			case TroposPackage.EASSOCIATION_TYPE:
				return createEAssociationTypeFromString(eDataType, initialValue);
			case TroposPackage.ECOMPOSITION_TYPE:
				return createECompositionTypeFromString(eDataType, initialValue);
			case TroposPackage.ECONTRIBUTION_TYPE:
				return createEContributionTypeFromString(eDataType, initialValue);
			case TroposPackage.EDEPENDENCY_TYPE:
				return createEDependencyTypeFromString(eDataType, initialValue);
			case TroposPackage.EOWNERSHIP_TYPE:
				return createEOwnershipTypeFromString(eDataType, initialValue);
			case TroposPackage.ESAT_TYPE:
				return createESATTypeFromString(eDataType, initialValue);
			case TroposPackage.ERELATIONSHIP_TYPE:
				return createERelationshipTypeFromString(eDataType, initialValue);
			case TroposPackage.EINSTANTIATION_TYPE:
				return createEInstantiationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TroposPackage.EACTOR_TYPE:
				return convertEActorTypeToString(eDataType, instanceValue);
			case TroposPackage.ESERVICE_TYPE:
				return convertEServiceTypeToString(eDataType, instanceValue);
			case TroposPackage.EASSOCIATION_TYPE:
				return convertEAssociationTypeToString(eDataType, instanceValue);
			case TroposPackage.ECOMPOSITION_TYPE:
				return convertECompositionTypeToString(eDataType, instanceValue);
			case TroposPackage.ECONTRIBUTION_TYPE:
				return convertEContributionTypeToString(eDataType, instanceValue);
			case TroposPackage.EDEPENDENCY_TYPE:
				return convertEDependencyTypeToString(eDataType, instanceValue);
			case TroposPackage.EOWNERSHIP_TYPE:
				return convertEOwnershipTypeToString(eDataType, instanceValue);
			case TroposPackage.ESAT_TYPE:
				return convertESATTypeToString(eDataType, instanceValue);
			case TroposPackage.ERELATIONSHIP_TYPE:
				return convertERelationshipTypeToString(eDataType, instanceValue);
			case TroposPackage.EINSTANTIATION_TYPE:
				return convertEInstantiationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagram createDiagram() {
		DiagramImpl diagram = new DiagramImpl();
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicalObject createGraphicalObject() {
		GraphicalObjectImpl graphicalObject = new GraphicalObjectImpl();
		return graphicalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation createRelation() {
		RelationImpl relation = new RelationImpl();
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contribution createContribution() {
		ContributionImpl contribution = new ContributionImpl();
		return contribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ownership createOwnership() {
		OwnershipImpl ownership = new OwnershipImpl();
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeansEnd createMeansEnd() {
		MeansEndImpl meansEnd = new MeansEndImpl();
		return meansEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomRelation createCustomRelation() {
		CustomRelationImpl customRelation = new CustomRelationImpl();
		return customRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EActorType createEActorTypeFromString(EDataType eDataType, String initialValue) {
		EActorType result = EActorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEActorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EServiceType createEServiceTypeFromString(EDataType eDataType, String initialValue) {
		EServiceType result = EServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAssociationType createEAssociationTypeFromString(EDataType eDataType, String initialValue) {
		EAssociationType result = EAssociationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECompositionType createECompositionTypeFromString(EDataType eDataType, String initialValue) {
		ECompositionType result = ECompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertECompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContributionType createEContributionTypeFromString(EDataType eDataType, String initialValue) {
		EContributionType result = EContributionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEContributionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDependencyType createEDependencyTypeFromString(EDataType eDataType, String initialValue) {
		EDependencyType result = EDependencyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDependencyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOwnershipType createEOwnershipTypeFromString(EDataType eDataType, String initialValue) {
		EOwnershipType result = EOwnershipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEOwnershipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESATType createESATTypeFromString(EDataType eDataType, String initialValue) {
		ESATType result = ESATType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertESATTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERelationshipType createERelationshipTypeFromString(EDataType eDataType, String initialValue) {
		ERelationshipType result = ERelationshipType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertERelationshipTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EInstantiationType createEInstantiationTypeFromString(EDataType eDataType, String initialValue) {
		EInstantiationType result = EInstantiationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEInstantiationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposPackage getTroposPackage() {
		return (TroposPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static TroposPackage getPackage() {
		return TroposPackage.eINSTANCE;
	}

} //TroposFactoryImpl
