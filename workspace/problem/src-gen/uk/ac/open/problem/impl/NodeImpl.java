/**
 */
package uk.ac.open.problem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.open.problem.Constraint;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.Phenomenon;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getHiddenPhenomena <em>Hidden Phenomena</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getTimingConstraint <em>Timing Constraint</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getSubproblem <em>Subproblem</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getProblemNodeRef <em>Problem Node Ref</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getProblemRef <em>Problem Ref</em>}</li>
 *   <li>{@link uk.ac.open.problem.impl.NodeImpl#getHref <em>Href</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ClockImpl implements Node
{
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
   * The cached value of the '{@link #getHiddenPhenomena() <em>Hidden Phenomena</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHiddenPhenomena()
   * @generated
   * @ordered
   */
  protected EList<Phenomenon> hiddenPhenomena;

  /**
   * The cached value of the '{@link #getTimingConstraint() <em>Timing Constraint</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimingConstraint()
   * @generated
   * @ordered
   */
  protected EList<Constraint> timingConstraint;

  /**
   * The cached value of the '{@link #getSubproblem() <em>Subproblem</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubproblem()
   * @generated
   * @ordered
   */
  protected EList<ProblemDiagram> subproblem;

  /**
   * The cached value of the '{@link #getProblemNodeRef() <em>Problem Node Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblemNodeRef()
   * @generated
   * @ordered
   */
  protected EList<Node> problemNodeRef;

  /**
   * The cached value of the '{@link #getProblemRef() <em>Problem Ref</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProblemRef()
   * @generated
   * @ordered
   */
  protected EList<ProblemDiagram> problemRef;

  /**
   * The cached value of the '{@link #getHref() <em>Href</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHref()
   * @generated
   * @ordered
   */
  protected EList<String> href;

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
  public EList<Phenomenon> getHiddenPhenomena()
  {
    if (hiddenPhenomena == null)
    {
      hiddenPhenomena = new EObjectContainmentEList<Phenomenon>(Phenomenon.class, this, ProblemPackage.NODE__HIDDEN_PHENOMENA);
    }
    return hiddenPhenomena;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Constraint> getTimingConstraint()
  {
    if (timingConstraint == null)
    {
      timingConstraint = new EObjectContainmentEList<Constraint>(Constraint.class, this, ProblemPackage.NODE__TIMING_CONSTRAINT);
    }
    return timingConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProblemDiagram> getSubproblem()
  {
    if (subproblem == null)
    {
      subproblem = new EObjectContainmentEList<ProblemDiagram>(ProblemDiagram.class, this, ProblemPackage.NODE__SUBPROBLEM);
    }
    return subproblem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getProblemNodeRef()
  {
    if (problemNodeRef == null)
    {
      problemNodeRef = new EObjectResolvingEList<Node>(Node.class, this, ProblemPackage.NODE__PROBLEM_NODE_REF);
    }
    return problemNodeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ProblemDiagram> getProblemRef()
  {
    if (problemRef == null)
    {
      problemRef = new EObjectResolvingEList<ProblemDiagram>(ProblemDiagram.class, this, ProblemPackage.NODE__PROBLEM_REF);
    }
    return problemRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getHref()
  {
    if (href == null)
    {
      href = new EDataTypeEList<String>(String.class, this, ProblemPackage.NODE__HREF);
    }
    return href;
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
      case ProblemPackage.NODE__HIDDEN_PHENOMENA:
        return ((InternalEList<?>)getHiddenPhenomena()).basicRemove(otherEnd, msgs);
      case ProblemPackage.NODE__TIMING_CONSTRAINT:
        return ((InternalEList<?>)getTimingConstraint()).basicRemove(otherEnd, msgs);
      case ProblemPackage.NODE__SUBPROBLEM:
        return ((InternalEList<?>)getSubproblem()).basicRemove(otherEnd, msgs);
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
      case ProblemPackage.NODE__TYPE:
        return getType();
      case ProblemPackage.NODE__HIDDEN_PHENOMENA:
        return getHiddenPhenomena();
      case ProblemPackage.NODE__TIMING_CONSTRAINT:
        return getTimingConstraint();
      case ProblemPackage.NODE__SUBPROBLEM:
        return getSubproblem();
      case ProblemPackage.NODE__PROBLEM_NODE_REF:
        return getProblemNodeRef();
      case ProblemPackage.NODE__PROBLEM_REF:
        return getProblemRef();
      case ProblemPackage.NODE__HREF:
        return getHref();
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
      case ProblemPackage.NODE__TYPE:
        setType((NodeType)newValue);
        return;
      case ProblemPackage.NODE__HIDDEN_PHENOMENA:
        getHiddenPhenomena().clear();
        getHiddenPhenomena().addAll((Collection<? extends Phenomenon>)newValue);
        return;
      case ProblemPackage.NODE__TIMING_CONSTRAINT:
        getTimingConstraint().clear();
        getTimingConstraint().addAll((Collection<? extends Constraint>)newValue);
        return;
      case ProblemPackage.NODE__SUBPROBLEM:
        getSubproblem().clear();
        getSubproblem().addAll((Collection<? extends ProblemDiagram>)newValue);
        return;
      case ProblemPackage.NODE__PROBLEM_NODE_REF:
        getProblemNodeRef().clear();
        getProblemNodeRef().addAll((Collection<? extends Node>)newValue);
        return;
      case ProblemPackage.NODE__PROBLEM_REF:
        getProblemRef().clear();
        getProblemRef().addAll((Collection<? extends ProblemDiagram>)newValue);
        return;
      case ProblemPackage.NODE__HREF:
        getHref().clear();
        getHref().addAll((Collection<? extends String>)newValue);
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
      case ProblemPackage.NODE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case ProblemPackage.NODE__HIDDEN_PHENOMENA:
        getHiddenPhenomena().clear();
        return;
      case ProblemPackage.NODE__TIMING_CONSTRAINT:
        getTimingConstraint().clear();
        return;
      case ProblemPackage.NODE__SUBPROBLEM:
        getSubproblem().clear();
        return;
      case ProblemPackage.NODE__PROBLEM_NODE_REF:
        getProblemNodeRef().clear();
        return;
      case ProblemPackage.NODE__PROBLEM_REF:
        getProblemRef().clear();
        return;
      case ProblemPackage.NODE__HREF:
        getHref().clear();
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
      case ProblemPackage.NODE__TYPE:
        return type != TYPE_EDEFAULT;
      case ProblemPackage.NODE__HIDDEN_PHENOMENA:
        return hiddenPhenomena != null && !hiddenPhenomena.isEmpty();
      case ProblemPackage.NODE__TIMING_CONSTRAINT:
        return timingConstraint != null && !timingConstraint.isEmpty();
      case ProblemPackage.NODE__SUBPROBLEM:
        return subproblem != null && !subproblem.isEmpty();
      case ProblemPackage.NODE__PROBLEM_NODE_REF:
        return problemNodeRef != null && !problemNodeRef.isEmpty();
      case ProblemPackage.NODE__PROBLEM_REF:
        return problemRef != null && !problemRef.isEmpty();
      case ProblemPackage.NODE__HREF:
        return href != null && !href.isEmpty();
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

} //NodeImpl
