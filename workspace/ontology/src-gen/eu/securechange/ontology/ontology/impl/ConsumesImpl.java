/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Consumes;
import eu.securechange.ontology.ontology.Entity;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.ConsumesImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.ConsumesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.ConsumesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConsumesImpl extends RelationshipImpl implements Consumes
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
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected Entity source;

  /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected Resource target;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConsumesImpl()
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
		return OntologyPackage.Literals.CONSUMES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.CONSUMES__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Entity getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Entity)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.CONSUMES__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Entity basicGetSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(Entity newSource)
  {
		Entity oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.CONSUMES__SOURCE, oldSource, source));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource getTarget()
  {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Resource)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.CONSUMES__TARGET, oldTarget, target));
			}
		}
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Resource basicGetTarget()
  {
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTarget(Resource newTarget)
  {
		Resource oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.CONSUMES__TARGET, oldTarget, target));
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
			case OntologyPackage.CONSUMES__TYPE:
				return getType();
			case OntologyPackage.CONSUMES__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OntologyPackage.CONSUMES__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case OntologyPackage.CONSUMES__TYPE:
				setType((String)newValue);
				return;
			case OntologyPackage.CONSUMES__SOURCE:
				setSource((Entity)newValue);
				return;
			case OntologyPackage.CONSUMES__TARGET:
				setTarget((Resource)newValue);
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
			case OntologyPackage.CONSUMES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OntologyPackage.CONSUMES__SOURCE:
				setSource((Entity)null);
				return;
			case OntologyPackage.CONSUMES__TARGET:
				setTarget((Resource)null);
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
			case OntologyPackage.CONSUMES__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OntologyPackage.CONSUMES__SOURCE:
				return source != null;
			case OntologyPackage.CONSUMES__TARGET:
				return target != null;
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
		result.append(')');
		return result.toString();
	}

} //ConsumesImpl
