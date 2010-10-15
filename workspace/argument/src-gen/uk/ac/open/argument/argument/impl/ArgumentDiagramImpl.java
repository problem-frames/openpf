/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

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

import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Link;
import uk.ac.open.argument.argument.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl#getHighlight <em>Highlight</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentDiagramImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentDiagramImpl extends MinimalEObjectImpl.Container implements ArgumentDiagram
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
   * The cached value of the '{@link #getHighlight() <em>Highlight</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighlight()
   * @generated
   * @ordered
   */
  protected Node highlight;

  /**
   * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodes()
   * @generated
   * @ordered
   */
  protected EList<Node> nodes;

  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EList<Link> links;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentDiagramImpl()
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
    return ArgumentPackage.Literals.ARGUMENT_DIAGRAM;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT_DIAGRAM__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node getHighlight()
  {
    if (highlight != null && highlight.eIsProxy())
    {
      InternalEObject oldHighlight = (InternalEObject)highlight;
      highlight = (Node)eResolveProxy(oldHighlight);
      if (highlight != oldHighlight)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT, oldHighlight, highlight));
      }
    }
    return highlight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetHighlight()
  {
    return highlight;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighlight(Node newHighlight)
  {
    Node oldHighlight = highlight;
    highlight = newHighlight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT, oldHighlight, highlight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Node> getNodes()
  {
    if (nodes == null)
    {
      nodes = new EObjectContainmentEList<Node>(Node.class, this, ArgumentPackage.ARGUMENT_DIAGRAM__NODES);
    }
    return nodes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Link> getLinks()
  {
    if (links == null)
    {
      links = new EObjectContainmentEList<Link>(Link.class, this, ArgumentPackage.ARGUMENT_DIAGRAM__LINKS);
    }
    return links;
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
      case ArgumentPackage.ARGUMENT_DIAGRAM__NODES:
        return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
      case ArgumentPackage.ARGUMENT_DIAGRAM__LINKS:
        return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
      case ArgumentPackage.ARGUMENT_DIAGRAM__NAME:
        return getName();
      case ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT:
        if (resolve) return getHighlight();
        return basicGetHighlight();
      case ArgumentPackage.ARGUMENT_DIAGRAM__NODES:
        return getNodes();
      case ArgumentPackage.ARGUMENT_DIAGRAM__LINKS:
        return getLinks();
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
      case ArgumentPackage.ARGUMENT_DIAGRAM__NAME:
        setName((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT:
        setHighlight((Node)newValue);
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__NODES:
        getNodes().clear();
        getNodes().addAll((Collection<? extends Node>)newValue);
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__LINKS:
        getLinks().clear();
        getLinks().addAll((Collection<? extends Link>)newValue);
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
      case ArgumentPackage.ARGUMENT_DIAGRAM__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT:
        setHighlight((Node)null);
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__NODES:
        getNodes().clear();
        return;
      case ArgumentPackage.ARGUMENT_DIAGRAM__LINKS:
        getLinks().clear();
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
      case ArgumentPackage.ARGUMENT_DIAGRAM__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArgumentPackage.ARGUMENT_DIAGRAM__HIGHLIGHT:
        return highlight != null;
      case ArgumentPackage.ARGUMENT_DIAGRAM__NODES:
        return nodes != null && !nodes.isEmpty();
      case ArgumentPackage.ARGUMENT_DIAGRAM__LINKS:
        return links != null && !links.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ArgumentDiagramImpl