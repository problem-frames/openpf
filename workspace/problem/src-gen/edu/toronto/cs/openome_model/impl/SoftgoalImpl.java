/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.toronto.cs.openome_model.Openome_modelPackage;
import edu.toronto.cs.openome_model.Softgoal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Softgoal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.toronto.cs.openome_model.impl.SoftgoalImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoftgoalImpl extends IntentionImpl implements Softgoal
{
  /**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
  protected static final String TOPIC_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
  protected String topic = TOPIC_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SoftgoalImpl()
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
		return Openome_modelPackage.Literals.SOFTGOAL;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getTopic()
  {
		return topic;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTopic(String newTopic)
  {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Openome_modelPackage.SOFTGOAL__TOPIC, oldTopic, topic));
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
			case Openome_modelPackage.SOFTGOAL__TOPIC:
				return getTopic();
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
			case Openome_modelPackage.SOFTGOAL__TOPIC:
				setTopic((String)newValue);
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
			case Openome_modelPackage.SOFTGOAL__TOPIC:
				setTopic(TOPIC_EDEFAULT);
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
			case Openome_modelPackage.SOFTGOAL__TOPIC:
				return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
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
		result.append(" (Topic: ");
		result.append(topic);
		result.append(')');
		return result.toString();
	}

} //SoftgoalImpl
