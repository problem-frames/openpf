/**
 */
package argument.argument.impl;

import argument.argument.Argument;
import argument.argument.ArgumentPackage;
import argument.argument.Expression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getName <em>Name</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getRound <em>Round</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getImage <em>Image</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getGrounds <em>Grounds</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getWarrants <em>Warrants</em>}</li>
 *   <li>{@link argument.argument.impl.ArgumentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentImpl extends TerminalExpressionImpl implements Argument
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
   * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReplaces()
   * @generated
   * @ordered
   */
  protected Argument replaces;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected Expression expr;

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
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Argument value;

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
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public int getRound()
  {
    return round;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public Argument getReplaces()
  {
    if (replaces != null && replaces.eIsProxy())
    {
      InternalEObject oldReplaces = (InternalEObject)replaces;
      replaces = (Argument)eResolveProxy(oldReplaces);
      if (replaces != oldReplaces)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.ARGUMENT__REPLACES, oldReplaces, replaces));
      }
    }
    return replaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetReplaces()
  {
    return replaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReplaces(Argument newReplaces)
  {
    Argument oldReplaces = replaces;
    replaces = newReplaces;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__REPLACES, oldReplaces, replaces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(Expression newExpr, NotificationChain msgs)
  {
    Expression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr(Expression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.ARGUMENT__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ArgumentPackage.ARGUMENT__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getForeground()
  {
    return foreground;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public String getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public String getShape()
  {
    return shape;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
  public String getImage()
  {
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
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
  @Override
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
  @Override
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
  public Argument getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (Argument)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArgumentPackage.ARGUMENT__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(Argument newValue)
  {
    Argument oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArgumentPackage.ARGUMENT__VALUE, oldValue, value));
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
      case ArgumentPackage.ARGUMENT__EXPR:
        return basicSetExpr(null, msgs);
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
      case ArgumentPackage.ARGUMENT__REPLACES:
        if (resolve) return getReplaces();
        return basicGetReplaces();
      case ArgumentPackage.ARGUMENT__EXPR:
        return getExpr();
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
      case ArgumentPackage.ARGUMENT__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
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
      case ArgumentPackage.ARGUMENT__REPLACES:
        setReplaces((Argument)newValue);
        return;
      case ArgumentPackage.ARGUMENT__EXPR:
        setExpr((Expression)newValue);
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
      case ArgumentPackage.ARGUMENT__VALUE:
        setValue((Argument)newValue);
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
      case ArgumentPackage.ARGUMENT__REPLACES:
        setReplaces((Argument)null);
        return;
      case ArgumentPackage.ARGUMENT__EXPR:
        setExpr((Expression)null);
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
      case ArgumentPackage.ARGUMENT__VALUE:
        setValue((Argument)null);
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
      case ArgumentPackage.ARGUMENT__REPLACES:
        return replaces != null;
      case ArgumentPackage.ARGUMENT__EXPR:
        return expr != null;
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
      case ArgumentPackage.ARGUMENT__VALUE:
        return value != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", round: ");
    result.append(round);
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
