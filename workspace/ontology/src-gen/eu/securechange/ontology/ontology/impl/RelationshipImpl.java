/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Entity;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Proposition;
import eu.securechange.ontology.ontology.RelType;
import eu.securechange.ontology.ontology.Relationship;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.RelationshipImpl#getDependum <em>Dependum</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.RelationshipImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final RelType TYPE_EDEFAULT = RelType.CARRIESOUT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected RelType type = TYPE_EDEFAULT;

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
  protected Entity target;

  /**
   * The cached value of the '{@link #getDependum() <em>Dependum</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependum()
   * @generated
   * @ordered
   */
  protected Entity dependum;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Proposition> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return OntologyPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(RelType newType)
  {
    RelType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.RELATIONSHIP__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Entity)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.RELATIONSHIP__SOURCE, oldSource, source));
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
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.RELATIONSHIP__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (Entity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.RELATIONSHIP__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(Entity newTarget)
  {
    Entity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.RELATIONSHIP__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity getDependum()
  {
    if (dependum != null && dependum.eIsProxy())
    {
      InternalEObject oldDependum = (InternalEObject)dependum;
      dependum = (Entity)eResolveProxy(oldDependum);
      if (dependum != oldDependum)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.RELATIONSHIP__DEPENDUM, oldDependum, dependum));
      }
    }
    return dependum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity basicGetDependum()
  {
    return dependum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependum(Entity newDependum)
  {
    Entity oldDependum = dependum;
    dependum = newDependum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.RELATIONSHIP__DEPENDUM, oldDependum, dependum));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Proposition> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Proposition>(Proposition.class, this, OntologyPackage.RELATIONSHIP__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OntologyPackage.RELATIONSHIP__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OntologyPackage.RELATIONSHIP__TYPE:
        return getType();
      case OntologyPackage.RELATIONSHIP__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case OntologyPackage.RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case OntologyPackage.RELATIONSHIP__DEPENDUM:
        if (resolve) return getDependum();
        return basicGetDependum();
      case OntologyPackage.RELATIONSHIP__PROPERTIES:
        return getProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OntologyPackage.RELATIONSHIP__TYPE:
        setType((RelType)newValue);
        return;
      case OntologyPackage.RELATIONSHIP__SOURCE:
        setSource((Entity)newValue);
        return;
      case OntologyPackage.RELATIONSHIP__TARGET:
        setTarget((Entity)newValue);
        return;
      case OntologyPackage.RELATIONSHIP__DEPENDUM:
        setDependum((Entity)newValue);
        return;
      case OntologyPackage.RELATIONSHIP__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Proposition>)newValue);
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
    switch (featureID)
    {
      case OntologyPackage.RELATIONSHIP__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OntologyPackage.RELATIONSHIP__SOURCE:
        setSource((Entity)null);
        return;
      case OntologyPackage.RELATIONSHIP__TARGET:
        setTarget((Entity)null);
        return;
      case OntologyPackage.RELATIONSHIP__DEPENDUM:
        setDependum((Entity)null);
        return;
      case OntologyPackage.RELATIONSHIP__PROPERTIES:
        getProperties().clear();
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
    switch (featureID)
    {
      case OntologyPackage.RELATIONSHIP__TYPE:
        return type != TYPE_EDEFAULT;
      case OntologyPackage.RELATIONSHIP__SOURCE:
        return source != null;
      case OntologyPackage.RELATIONSHIP__TARGET:
        return target != null;
      case OntologyPackage.RELATIONSHIP__DEPENDUM:
        return dependum != null;
      case OntologyPackage.RELATIONSHIP__PROPERTIES:
        return properties != null && !properties.isEmpty();
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

} //RelationshipImpl
