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

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getRound <em>Round</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getImage <em>Image</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link uk.ac.open.argument.argument.impl.ArgumentImpl#getWarrants <em>Warrants</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgumentImpl extends MinimalEObjectImpl.Container implements Argument
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
   * The default value of the '{@link #getRound() <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRound()
   * @generated
   * @ordered
   */
  protected static final int ROUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRound() <em>Round</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRound()
   * @generated
   * @ordered
   */
  protected int round = ROUND_EDEFAULT;

  /**
   * The default value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected static final String EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected String expr = EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrigin()
   * @generated
   * @ordered
   */
  protected Argument origin;

  /**
   * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeground()
   * @generated
   * @ordered
   */
  protected static final String FOREGROUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForeground()
   * @generated
   * @ordered
   */
  protected String foreground = FOREGROUND_EDEFAULT;

  /**
   * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected static final String BACKGROUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected String background = BACKGROUND_EDEFAULT;

  /**
   * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected static final String SHAPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShape()
   * @generated
   * @ordered
   */
  protected String shape = SHAPE_EDEFAULT;

  /**
   * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImage()
   * @generated
   * @ordered
   */
  protected String image = IMAGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getGrounds() <em>Grounds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrounds()
   * @generated
   * @ordered
   */
  protected EList<Argument> grounds;

  /**
   * The cached value of the '{@link #getWarrants() <em>Warrants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWarrants()
   * @generated
   * @ordered
   */
  protected EList<Argument> warrants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentImpl()
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
    return ArgumentPackage.Literals.ARGUMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRound()
  {
    return round;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRound(int newRound)
  {
    int oldRound = round;
    round = newRound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__ROUND, oldRound, round));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(String newExpr)
  {
    String oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__EXPR, oldExpr, expr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument getOrigin()
  {
    if (origin != null && origin.eIsProxy())
    {
      InternalEObject oldOrigin = (InternalEObject)origin;
      origin = (Argument)eResolveProxy(oldOrigin);
      if (origin != oldOrigin)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.ARGUMENT__ORIGIN, oldOrigin, origin));
      }
    }
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetOrigin()
  {
    return origin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrigin(Argument newOrigin)
  {
    Argument oldOrigin = origin;
    origin = newOrigin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__ORIGIN, oldOrigin, origin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getForeground()
  {
    return foreground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForeground(String newForeground)
  {
    String oldForeground = foreground;
    foreground = newForeground;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__FOREGROUND, oldForeground, foreground));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackground(String newBackground)
  {
    String oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__BACKGROUND, oldBackground, background));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShape(String newShape)
  {
    String oldShape = shape;
    shape = newShape;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__SHAPE, oldShape, shape));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImage(String newImage)
  {
    String oldImage = image;
    image = newImage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__IMAGE, oldImage, image));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getGrounds()
  {
    if (grounds == null)
    {
      grounds = new EObjectContainmentEList<Argument>(Argument.class, this, ArgumentPackage.ARGUMENT__GROUNDS);
    }
    return grounds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getWarrants()
  {
    if (warrants == null)
    {
      warrants = new EObjectContainmentEList<Argument>(Argument.class, this, ArgumentPackage.ARGUMENT__WARRANTS);
    }
    return warrants;
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
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return ((InternalEList<?>)getGrounds()).basicRemove(otherEnd, msgs);
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return ((InternalEList<?>)getWarrants()).basicRemove(otherEnd, msgs);
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
      case ArgumentPackage.ARGUMENT__NAME:
        return getName();
      case ArgumentPackage.ARGUMENT__DESCRIPTION:
        return getDescription();
      case ArgumentPackage.ARGUMENT__ROUND:
        return getRound();
      case ArgumentPackage.ARGUMENT__EXPR:
        return getExpr();
      case ArgumentPackage.ARGUMENT__ORIGIN:
        if (resolve) return getOrigin();
        return basicGetOrigin();
      case ArgumentPackage.ARGUMENT__FOREGROUND:
        return getForeground();
      case ArgumentPackage.ARGUMENT__BACKGROUND:
        return getBackground();
      case ArgumentPackage.ARGUMENT__SHAPE:
        return getShape();
      case ArgumentPackage.ARGUMENT__IMAGE:
        return getImage();
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return getGrounds();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return getWarrants();
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
      case ArgumentPackage.ARGUMENT__NAME:
        setName((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__ROUND:
        setRound((Integer)newValue);
        return;
      case ArgumentPackage.ARGUMENT__EXPR:
        setExpr((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__ORIGIN:
        setOrigin((Argument)newValue);
        return;
      case ArgumentPackage.ARGUMENT__FOREGROUND:
        setForeground((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__BACKGROUND:
        setBackground((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__SHAPE:
        setShape((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__IMAGE:
        setImage((String)newValue);
        return;
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        getGrounds().addAll((Collection<? extends Argument>)newValue);
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
        getWarrants().addAll((Collection<? extends Argument>)newValue);
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
      case ArgumentPackage.ARGUMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__ROUND:
        setRound(ROUND_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__EXPR:
        setExpr(EXPR_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__ORIGIN:
        setOrigin((Argument)null);
        return;
      case ArgumentPackage.ARGUMENT__FOREGROUND:
        setForeground(FOREGROUND_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__BACKGROUND:
        setBackground(BACKGROUND_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__SHAPE:
        setShape(SHAPE_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__IMAGE:
        setImage(IMAGE_EDEFAULT);
        return;
      case ArgumentPackage.ARGUMENT__GROUNDS:
        getGrounds().clear();
        return;
      case ArgumentPackage.ARGUMENT__WARRANTS:
        getWarrants().clear();
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
      case ArgumentPackage.ARGUMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ArgumentPackage.ARGUMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case ArgumentPackage.ARGUMENT__ROUND:
        return round != ROUND_EDEFAULT;
      case ArgumentPackage.ARGUMENT__EXPR:
        return EXPR_EDEFAULT == null ? expr != null : !EXPR_EDEFAULT.equals(expr);
      case ArgumentPackage.ARGUMENT__ORIGIN:
        return origin != null;
      case ArgumentPackage.ARGUMENT__FOREGROUND:
        return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
      case ArgumentPackage.ARGUMENT__BACKGROUND:
        return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
      case ArgumentPackage.ARGUMENT__SHAPE:
        return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
      case ArgumentPackage.ARGUMENT__IMAGE:
        return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
      case ArgumentPackage.ARGUMENT__GROUNDS:
        return grounds != null && !grounds.isEmpty();
      case ArgumentPackage.ARGUMENT__WARRANTS:
        return warrants != null && !warrants.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(", round: ");
    result.append(round);
    result.append(", expr: ");
    result.append(expr);
    result.append(", foreground: ");
    result.append(foreground);
    result.append(", background: ");
    result.append(background);
    result.append(", shape: ");
    result.append(shape);
    result.append(", image: ");
    result.append(image);
    result.append(')');
    return result.toString();
  }

} //ArgumentImpl
