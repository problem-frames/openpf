/**
 * <copyright>
 * </copyright>
 *
 * $Id: ContributionImpl.java,v 1.1.1.1 2007/05/18 12:47:22 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.impl;

import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.ESATType;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl#getContributionType <em>Contribution Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl#getSatType <em>Sat Type</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.tropos.impl.ContributionImpl#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionImpl extends RelationImpl implements Contribution {
	/**
	 * The default value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected static final EContributionType CONTRIBUTION_TYPE_EDEFAULT = EContributionType.PP_LITERAL;

	/**
	 * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
	protected EContributionType contributionType = CONTRIBUTION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatType() <em>Sat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatType()
	 * @generated
	 * @ordered
	 */
	protected static final ESATType SAT_TYPE_EDEFAULT = ESATType.NA_LITERAL;

	/**
	 * The cached value of the '{@link #getSatType() <em>Sat Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatType()
	 * @generated
	 * @ordered
	 */
	protected ESATType satType = SAT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected static final ERelationshipType RELATIONSHIP_TYPE_EDEFAULT = ERelationshipType.CONTRIBUTION_LITERAL;

	/**
	 * The cached value of the '{@link #getRelationshipType() <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipType()
	 * @generated
	 * @ordered
	 */
	protected ERelationshipType relationshipType = RELATIONSHIP_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return TroposPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContributionType getContributionType() {
		return contributionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContributionType(EContributionType newContributionType) {
		EContributionType oldContributionType = contributionType;
		contributionType = newContributionType == null ? CONTRIBUTION_TYPE_EDEFAULT : newContributionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.CONTRIBUTION__CONTRIBUTION_TYPE, oldContributionType, contributionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESATType getSatType() {
		return satType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatType(ESATType newSatType) {
		ESATType oldSatType = satType;
		satType = newSatType == null ? SAT_TYPE_EDEFAULT : newSatType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.CONTRIBUTION__SAT_TYPE, oldSatType, satType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setWeight(double newWeight) {
		if(newWeight > 1.0 ||newWeight < -1.0)
			return;
		
		double oldWeight = weight;
		
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.CONTRIBUTION__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ERelationshipType getRelationshipType() {
		return relationshipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipType(ERelationshipType newRelationshipType) {
		ERelationshipType oldRelationshipType = relationshipType;
		relationshipType = newRelationshipType == null ? RELATIONSHIP_TYPE_EDEFAULT : newRelationshipType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TroposPackage.CONTRIBUTION__RELATIONSHIP_TYPE, oldRelationshipType, relationshipType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TroposPackage.CONTRIBUTION__CONTRIBUTION_TYPE:
				return getContributionType();
			case TroposPackage.CONTRIBUTION__SAT_TYPE:
				return getSatType();
			case TroposPackage.CONTRIBUTION__WEIGHT:
				return new Double(getWeight());
			case TroposPackage.CONTRIBUTION__RELATIONSHIP_TYPE:
				return getRelationshipType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TroposPackage.CONTRIBUTION__CONTRIBUTION_TYPE:
				setContributionType((EContributionType)newValue);
				return;
			case TroposPackage.CONTRIBUTION__SAT_TYPE:
				setSatType((ESATType)newValue);
				return;
			case TroposPackage.CONTRIBUTION__WEIGHT:
				setWeight(((Double)newValue).doubleValue());
				return;
			case TroposPackage.CONTRIBUTION__RELATIONSHIP_TYPE:
				setRelationshipType((ERelationshipType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case TroposPackage.CONTRIBUTION__CONTRIBUTION_TYPE:
				setContributionType(CONTRIBUTION_TYPE_EDEFAULT);
				return;
			case TroposPackage.CONTRIBUTION__SAT_TYPE:
				setSatType(SAT_TYPE_EDEFAULT);
				return;
			case TroposPackage.CONTRIBUTION__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case TroposPackage.CONTRIBUTION__RELATIONSHIP_TYPE:
				setRelationshipType(RELATIONSHIP_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TroposPackage.CONTRIBUTION__CONTRIBUTION_TYPE:
				return contributionType != null;
			case TroposPackage.CONTRIBUTION__SAT_TYPE:
				return satType != null;
			case TroposPackage.CONTRIBUTION__WEIGHT:
				return weight != 0;
			case TroposPackage.CONTRIBUTION__RELATIONSHIP_TYPE:
				return relationshipType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contributionType: ");
		result.append(contributionType);
		result.append(", satType: ");
		result.append(satType);
		result.append(", weight: ");
		result.append(weight);
		result.append(", relationshipType: ");
		result.append(relationshipType);
		result.append(')');
		return result.toString();
	}

} //ContributionImpl