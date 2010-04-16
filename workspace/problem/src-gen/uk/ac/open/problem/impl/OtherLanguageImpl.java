/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.problem.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.problem.OtherLanguage;
import uk.ac.open.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.problem.impl.OtherLanguageImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.OtherLanguageImpl#getHref <em>Href</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherLanguageImpl extends MinimalEObjectImpl.Container implements OtherLanguage
{
  /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final String TYPE_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected String type = TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
  protected static final String HREF_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
  protected String href = HREF_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OtherLanguageImpl()
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
		return ProblemPackage.Literals.OTHER_LANGUAGE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(String newType)
  {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.OTHER_LANGUAGE__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getHref()
  {
		return href;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setHref(String newHref)
  {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.OTHER_LANGUAGE__HREF, oldHref, href));
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
			case ProblemPackage.OTHER_LANGUAGE__TYPE:
				return getType();
			case ProblemPackage.OTHER_LANGUAGE__HREF:
				return getHref();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ProblemPackage.OTHER_LANGUAGE__TYPE:
				setType((String)newValue);
				return;
			case ProblemPackage.OTHER_LANGUAGE__HREF:
				setHref((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ProblemPackage.OTHER_LANGUAGE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProblemPackage.OTHER_LANGUAGE__HREF:
				setHref(HREF_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
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
			case ProblemPackage.OTHER_LANGUAGE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ProblemPackage.OTHER_LANGUAGE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", href: ");
		result.append(href);
		result.append(')');
		return result.toString();
	}

} //OtherLanguageImpl
