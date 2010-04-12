/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.problem.impl;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import edu.toronto.cs.openome_model.Model;

import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getSubproblem <em>Subproblem</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getIstar <em>Istar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected static final NodeType TYPE_EDEFAULT = NodeType.REQUIREMENT;

  /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
  protected NodeType type = TYPE_EDEFAULT;

  /**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getSubproblem() <em>Subproblem</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSubproblem()
	 * @generated
	 * @ordered
	 */
  protected ProblemDiagram subproblem;

  /**
	 * The cached value of the '{@link #getIstar() <em>Istar</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getIstar()
	 * @generated
	 * @ordered
	 */
  protected Model istar;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected NodeImpl()
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
		return ProblemPackage.Literals.NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NodeType getType()
  {
		return type;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setType(NodeType newType)
  {
		NodeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__TYPE, oldType, type));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ProblemDiagram getSubproblem()
  {
		return subproblem;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSubproblem(ProblemDiagram newSubproblem, NotificationChain msgs)
  {
		ProblemDiagram oldSubproblem = subproblem;
		subproblem = newSubproblem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__SUBPROBLEM, oldSubproblem, newSubproblem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSubproblem(ProblemDiagram newSubproblem)
  {
		if (newSubproblem != subproblem) {
			NotificationChain msgs = null;
			if (subproblem != null)
				msgs = ((InternalEObject)subproblem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblemPackage.NODE__SUBPROBLEM, null, msgs);
			if (newSubproblem != null)
				msgs = ((InternalEObject)newSubproblem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblemPackage.NODE__SUBPROBLEM, null, msgs);
			msgs = basicSetSubproblem(newSubproblem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__SUBPROBLEM, newSubproblem, newSubproblem));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Model getIstar()
  {
		return istar;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetIstar(Model newIstar, NotificationChain msgs)
  {
		Model oldIstar = istar;
		istar = newIstar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__ISTAR, oldIstar, newIstar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setIstar(Model newIstar)
  {
		if (newIstar != istar) {
			NotificationChain msgs = null;
			if (istar != null)
				msgs = ((InternalEObject)istar).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProblemPackage.NODE__ISTAR, null, msgs);
			if (newIstar != null)
				msgs = ((InternalEObject)newIstar).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProblemPackage.NODE__ISTAR, null, msgs);
			msgs = basicSetIstar(newIstar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProblemPackage.NODE__ISTAR, newIstar, newIstar));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ProblemPackage.NODE__SUBPROBLEM:
				return basicSetSubproblem(null, msgs);
			case ProblemPackage.NODE__ISTAR:
				return basicSetIstar(null, msgs);
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
		switch (featureID) {
			case ProblemPackage.NODE__NAME:
				return getName();
			case ProblemPackage.NODE__TYPE:
				return getType();
			case ProblemPackage.NODE__DESCRIPTION:
				return getDescription();
			case ProblemPackage.NODE__SUBPROBLEM:
				return getSubproblem();
			case ProblemPackage.NODE__ISTAR:
				return getIstar();
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
			case ProblemPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case ProblemPackage.NODE__TYPE:
				setType((NodeType)newValue);
				return;
			case ProblemPackage.NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ProblemPackage.NODE__SUBPROBLEM:
				setSubproblem((ProblemDiagram)newValue);
				return;
			case ProblemPackage.NODE__ISTAR:
				setIstar((Model)newValue);
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
			case ProblemPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProblemPackage.NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ProblemPackage.NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ProblemPackage.NODE__SUBPROBLEM:
				setSubproblem((ProblemDiagram)null);
				return;
			case ProblemPackage.NODE__ISTAR:
				setIstar((Model)null);
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
			case ProblemPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProblemPackage.NODE__TYPE:
				return type != TYPE_EDEFAULT;
			case ProblemPackage.NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ProblemPackage.NODE__SUBPROBLEM:
				return subproblem != null;
			case ProblemPackage.NODE__ISTAR:
				return istar != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
