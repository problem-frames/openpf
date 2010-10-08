/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.open.argument.argument.ArgumentPackage;
import uk.ac.open.argument.argument.Expression;
import uk.ac.open.argument.argument.Link;
import uk.ac.open.argument.argument.LinkType;
import uk.ac.open.argument.argument.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.LinkImpl#getAfrom <em>Afrom</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.LinkImpl#getLink <em>Link</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.LinkImpl#getToNode1 <em>To Node1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link
{
  /**
   * The cached value of the '{@link #getAfrom() <em>Afrom</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfrom()
   * @generated
   * @ordered
   */
  protected Node afrom;

  /**
   * The default value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected static final LinkType LINK_EDEFAULT = LinkType.ARGUES;

  /**
   * The cached value of the '{@link #getLink() <em>Link</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLink()
   * @generated
   * @ordered
   */
  protected LinkType link = LINK_EDEFAULT;

  /**
   * The cached value of the '{@link #getToNode1() <em>To Node1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToNode1()
   * @generated
   * @ordered
   */
  protected Expression toNode1;

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
  public Node getAfrom()
  {
    if (afrom != null && afrom.eIsProxy())
    {
      InternalEObject oldAfrom = (InternalEObject)afrom;
      afrom = (Node)eResolveProxy(oldAfrom);
      if (afrom != oldAfrom)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.LINK__AFROM, oldAfrom, afrom));
      }
    }
    return afrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Node basicGetAfrom()
  {
    return afrom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfrom(Node newAfrom)
  {
    Node oldAfrom = afrom;
    afrom = newAfrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__AFROM, oldAfrom, afrom));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType getLink()
  {
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLink(LinkType newLink)
  {
    LinkType oldLink = link;
    link = newLink == null ? LINK_EDEFAULT : newLink;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__LINK, oldLink, link));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getToNode1()
  {
    return toNode1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToNode1(Expression newToNode1, NotificationChain msgs)
  {
    Expression oldToNode1 = toNode1;
    toNode1 = newToNode1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__TO_NODE1, oldToNode1, newToNode1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToNode1(Expression newToNode1)
  {
    if (newToNode1 != toNode1)
    {
      NotificationChain msgs = null;
      if (toNode1 != null)
        msgs = ((InternalEObject)toNode1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.LINK__TO_NODE1, null, msgs);
      if (newToNode1 != null)
        msgs = ((InternalEObject)newToNode1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.LINK__TO_NODE1, null, msgs);
      msgs = basicSetToNode1(newToNode1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.LINK__TO_NODE1, newToNode1, newToNode1));
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
      case ArgumentPackage.LINK__TO_NODE1:
        return basicSetToNode1(null, msgs);
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
      case ArgumentPackage.LINK__AFROM:
        if (resolve) return getAfrom();
        return basicGetAfrom();
      case ArgumentPackage.LINK__LINK:
        return getLink();
      case ArgumentPackage.LINK__TO_NODE1:
        return getToNode1();
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
    switch (featureID)
    {
      case ArgumentPackage.LINK__AFROM:
        setAfrom((Node)newValue);
        return;
      case ArgumentPackage.LINK__LINK:
        setLink((LinkType)newValue);
        return;
      case ArgumentPackage.LINK__TO_NODE1:
        setToNode1((Expression)newValue);
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
      case ArgumentPackage.LINK__AFROM:
        setAfrom((Node)null);
        return;
      case ArgumentPackage.LINK__LINK:
        setLink(LINK_EDEFAULT);
        return;
      case ArgumentPackage.LINK__TO_NODE1:
        setToNode1((Expression)null);
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
      case ArgumentPackage.LINK__AFROM:
        return afrom != null;
      case ArgumentPackage.LINK__LINK:
        return link != LINK_EDEFAULT;
      case ArgumentPackage.LINK__TO_NODE1:
        return toNode1 != null;
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
    result.append(" (link: ");
    result.append(link);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
