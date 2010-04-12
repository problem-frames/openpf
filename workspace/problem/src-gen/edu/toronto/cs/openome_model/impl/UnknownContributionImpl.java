/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model.impl;


import org.eclipse.emf.ecore.EClass;

import edu.toronto.cs.openome_model.Openome_modelPackage;
import edu.toronto.cs.openome_model.UnknownContribution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.UnknownContributionImpl#getContributionType <em>Contribution Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnknownContributionImpl extends ContributionImpl implements UnknownContribution
{
  /**
	 * The default value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
  protected static final String CONTRIBUTION_TYPE_EDEFAULT = "Unknown";

  /**
	 * The cached value of the '{@link #getContributionType() <em>Contribution Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getContributionType()
	 * @generated
	 * @ordered
	 */
  protected String contributionType = CONTRIBUTION_TYPE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected UnknownContributionImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Openome_modelPackage.Literals.UNKNOWN_CONTRIBUTION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getContributionType()
  {
		return contributionType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case Openome_modelPackage.UNKNOWN_CONTRIBUTION__CONTRIBUTION_TYPE:
				return getContributionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case Openome_modelPackage.UNKNOWN_CONTRIBUTION__CONTRIBUTION_TYPE:
				return CONTRIBUTION_TYPE_EDEFAULT == null ? contributionType != null : !CONTRIBUTION_TYPE_EDEFAULT.equals(contributionType);
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contributionType: ");
		result.append(contributionType);
		result.append(')');
		return result.toString();
	}

} //UnknownContributionImpl
