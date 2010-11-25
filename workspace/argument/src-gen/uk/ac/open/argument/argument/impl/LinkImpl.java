/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Link;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.LinkImpl#getFrom <em>From</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.LinkImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link
{
  /**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
  protected Argument from;

  /**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
  protected Argument to;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected LinkImpl()
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
		return ArgumentPackage.Literals.LINK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument getFrom()
  {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Argument)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.LINK__FROM, oldFrom, from));
			}
		}
		return from;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument basicGetFrom()
  {
		return from;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFrom(Argument newFrom)
  {
		Argument oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__FROM, oldFrom, from));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument getTo()
  {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (Argument)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.LINK__TO, oldTo, to));
			}
		}
		return to;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Argument basicGetTo()
  {
		return to;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTo(Argument newTo)
  {
		Argument oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__TO, oldTo, to));
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
			case ArgumentPackage.LINK__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case ArgumentPackage.LINK__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case ArgumentPackage.LINK__FROM:
				setFrom((Argument)newValue);
				return;
			case ArgumentPackage.LINK__TO:
				setTo((Argument)newValue);
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
			case ArgumentPackage.LINK__FROM:
				setFrom((Argument)null);
				return;
			case ArgumentPackage.LINK__TO:
				setTo((Argument)null);
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
			case ArgumentPackage.LINK__FROM:
				return from != null;
			case ArgumentPackage.LINK__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkImpl
