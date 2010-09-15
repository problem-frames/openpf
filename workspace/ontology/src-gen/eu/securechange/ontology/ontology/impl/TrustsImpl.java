/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Actor;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Thing;
import eu.securechange.ontology.ontology.Trusts;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trusts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.TrustsImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.TrustsImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.TrustsImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.TrustsImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrustsImpl extends RelationshipImpl implements Trusts
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
  protected Actor source;

  /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected Actor target;

  /**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
  protected Thing entity;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TrustsImpl()
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
		return OntologyPackage.Literals.TRUSTS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.TRUSTS__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Actor getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Actor)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.TRUSTS__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Actor basicGetSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(Actor newSource)
  {
		Actor oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.TRUSTS__SOURCE, oldSource, source));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Actor getTarget()
  {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Actor)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.TRUSTS__TARGET, oldTarget, target));
			}
		}
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Actor basicGetTarget()
  {
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTarget(Actor newTarget)
  {
		Actor oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.TRUSTS__TARGET, oldTarget, target));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thing getEntity()
  {
		if (entity != null && entity.eIsProxy()) {
			InternalEObject oldEntity = (InternalEObject)entity;
			entity = (Thing)eResolveProxy(oldEntity);
			if (entity != oldEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.TRUSTS__ENTITY, oldEntity, entity));
			}
		}
		return entity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thing basicGetEntity()
  {
		return entity;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEntity(Thing newEntity)
  {
		Thing oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.TRUSTS__ENTITY, oldEntity, entity));
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
			case OntologyPackage.TRUSTS__TYPE:
				return getType();
			case OntologyPackage.TRUSTS__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OntologyPackage.TRUSTS__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OntologyPackage.TRUSTS__ENTITY:
				if (resolve) return getEntity();
				return basicGetEntity();
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
			case OntologyPackage.TRUSTS__TYPE:
				setType((String)newValue);
				return;
			case OntologyPackage.TRUSTS__SOURCE:
				setSource((Actor)newValue);
				return;
			case OntologyPackage.TRUSTS__TARGET:
				setTarget((Actor)newValue);
				return;
			case OntologyPackage.TRUSTS__ENTITY:
				setEntity((Thing)newValue);
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
			case OntologyPackage.TRUSTS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OntologyPackage.TRUSTS__SOURCE:
				setSource((Actor)null);
				return;
			case OntologyPackage.TRUSTS__TARGET:
				setTarget((Actor)null);
				return;
			case OntologyPackage.TRUSTS__ENTITY:
				setEntity((Thing)null);
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
			case OntologyPackage.TRUSTS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OntologyPackage.TRUSTS__SOURCE:
				return source != null;
			case OntologyPackage.TRUSTS__TARGET:
				return target != null;
			case OntologyPackage.TRUSTS__ENTITY:
				return entity != null;
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

} //TrustsImpl
