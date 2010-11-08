/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.impl;

import eu.securechange.ontology.ontology.Decomposes;
import eu.securechange.ontology.ontology.DecomposesType;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Requirement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decomposes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.securechange.ontology.ontology.impl.DecomposesImpl#getType <em>Type</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.DecomposesImpl#getSource <em>Source</em>}</li>
 *   <li>{@link eu.securechange.ontology.ontology.impl.DecomposesImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecomposesImpl extends RelationshipImpl implements Decomposes
{
  /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final DecomposesType TYPE_EDEFAULT = DecomposesType.AND;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected DecomposesType type = TYPE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
  protected Requirement source;

  /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
  protected Requirement target;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected DecomposesImpl()
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
		return OntologyPackage.Literals.DECOMPOSES;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DecomposesType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(DecomposesType newType)
  {
		DecomposesType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.DECOMPOSES__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Requirement getSource()
  {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Requirement)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.DECOMPOSES__SOURCE, oldSource, source));
			}
		}
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Requirement basicGetSource()
  {
		return source;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSource(Requirement newSource)
  {
		Requirement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.DECOMPOSES__SOURCE, oldSource, source));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Requirement getTarget()
  {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (Requirement)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OntologyPackage.DECOMPOSES__TARGET, oldTarget, target));
			}
		}
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Requirement basicGetTarget()
  {
		return target;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTarget(Requirement newTarget)
  {
		Requirement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OntologyPackage.DECOMPOSES__TARGET, oldTarget, target));
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
			case OntologyPackage.DECOMPOSES__TYPE:
				return getType();
			case OntologyPackage.DECOMPOSES__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OntologyPackage.DECOMPOSES__TARGET:
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
			case OntologyPackage.DECOMPOSES__TYPE:
				setType((DecomposesType)newValue);
				return;
			case OntologyPackage.DECOMPOSES__SOURCE:
				setSource((Requirement)newValue);
				return;
			case OntologyPackage.DECOMPOSES__TARGET:
				setTarget((Requirement)newValue);
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
			case OntologyPackage.DECOMPOSES__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OntologyPackage.DECOMPOSES__SOURCE:
				setSource((Requirement)null);
				return;
			case OntologyPackage.DECOMPOSES__TARGET:
				setTarget((Requirement)null);
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
			case OntologyPackage.DECOMPOSES__TYPE:
				return type != TYPE_EDEFAULT;
			case OntologyPackage.DECOMPOSES__SOURCE:
				return source != null;
			case OntologyPackage.DECOMPOSES__TARGET:
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

} //DecomposesImpl
