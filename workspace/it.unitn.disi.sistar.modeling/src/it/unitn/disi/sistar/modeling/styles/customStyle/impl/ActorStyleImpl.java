/**
 * <copyright>
 * </copyright>
 *
 * $Id: ActorStyleImpl.java,v 1.1.1.1 2007/06/13 20:26:55 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle.impl;

import it.unitn.disi.sistar.modeling.styles.customStyle.ActorStyle;
import it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage;
import it.unitn.disi.sistar.modeling.styles.customStyle.EShapeType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl#getActorWidth <em>Actor Width</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl#getActorHeight <em>Actor Height</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl#getActorX <em>Actor X</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl#getActorY <em>Actor Y</em>}</li>
 *   <li>{@link it.unitn.disi.sistar.modeling.styles.customStyle.impl.ActorStyleImpl#getRationaleShape <em>Rationale Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorStyleImpl extends EObjectImpl implements ActorStyle {
	/**
	 * The default value of the '{@link #getActorWidth() <em>Actor Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTOR_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActorWidth() <em>Actor Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorWidth()
	 * @generated
	 * @ordered
	 */
	protected int actorWidth = ACTOR_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorHeight() <em>Actor Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTOR_HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActorHeight() <em>Actor Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorHeight()
	 * @generated
	 * @ordered
	 */
	protected int actorHeight = ACTOR_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorX() <em>Actor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorX()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTOR_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActorX() <em>Actor X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorX()
	 * @generated
	 * @ordered
	 */
	protected int actorX = ACTOR_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getActorY() <em>Actor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorY()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTOR_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActorY() <em>Actor Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorY()
	 * @generated
	 * @ordered
	 */
	protected int actorY = ACTOR_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRationaleShape() <em>Rationale Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleShape()
	 * @generated
	 * @ordered
	 */
	protected static final EShapeType RATIONALE_SHAPE_EDEFAULT = EShapeType.OVAL_LITERAL;

	/**
	 * The cached value of the '{@link #getRationaleShape() <em>Rationale Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationaleShape()
	 * @generated
	 * @ordered
	 */
	protected EShapeType rationaleShape = RATIONALE_SHAPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return CustomStylePackage.Literals.ACTOR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActorWidth() {
		return actorWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorWidth(int newActorWidth) {
		int oldActorWidth = actorWidth;
		actorWidth = newActorWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.ACTOR_STYLE__ACTOR_WIDTH, oldActorWidth, actorWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActorHeight() {
		return actorHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorHeight(int newActorHeight) {
		int oldActorHeight = actorHeight;
		actorHeight = newActorHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.ACTOR_STYLE__ACTOR_HEIGHT, oldActorHeight, actorHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActorX() {
		return actorX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorX(int newActorX) {
		int oldActorX = actorX;
		actorX = newActorX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.ACTOR_STYLE__ACTOR_X, oldActorX, actorX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActorY() {
		return actorY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActorY(int newActorY) {
		int oldActorY = actorY;
		actorY = newActorY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.ACTOR_STYLE__ACTOR_Y, oldActorY, actorY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EShapeType getRationaleShape() {
		return rationaleShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRationaleShape(EShapeType newRationaleShape) {
		EShapeType oldRationaleShape = rationaleShape;
		rationaleShape = newRationaleShape == null ? RATIONALE_SHAPE_EDEFAULT : newRationaleShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CustomStylePackage.ACTOR_STYLE__RATIONALE_SHAPE, oldRationaleShape, rationaleShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomStylePackage.ACTOR_STYLE__ACTOR_WIDTH:
				return new Integer(getActorWidth());
			case CustomStylePackage.ACTOR_STYLE__ACTOR_HEIGHT:
				return new Integer(getActorHeight());
			case CustomStylePackage.ACTOR_STYLE__ACTOR_X:
				return new Integer(getActorX());
			case CustomStylePackage.ACTOR_STYLE__ACTOR_Y:
				return new Integer(getActorY());
			case CustomStylePackage.ACTOR_STYLE__RATIONALE_SHAPE:
				return getRationaleShape();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CustomStylePackage.ACTOR_STYLE__ACTOR_WIDTH:
				setActorWidth(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_HEIGHT:
				setActorHeight(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_X:
				setActorX(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_Y:
				setActorY(((Integer)newValue).intValue());
				return;
			case CustomStylePackage.ACTOR_STYLE__RATIONALE_SHAPE:
				setRationaleShape((EShapeType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case CustomStylePackage.ACTOR_STYLE__ACTOR_WIDTH:
				setActorWidth(ACTOR_WIDTH_EDEFAULT);
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_HEIGHT:
				setActorHeight(ACTOR_HEIGHT_EDEFAULT);
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_X:
				setActorX(ACTOR_X_EDEFAULT);
				return;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_Y:
				setActorY(ACTOR_Y_EDEFAULT);
				return;
			case CustomStylePackage.ACTOR_STYLE__RATIONALE_SHAPE:
				setRationaleShape(RATIONALE_SHAPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomStylePackage.ACTOR_STYLE__ACTOR_WIDTH:
				return actorWidth != ACTOR_WIDTH_EDEFAULT;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_HEIGHT:
				return actorHeight != ACTOR_HEIGHT_EDEFAULT;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_X:
				return actorX != ACTOR_X_EDEFAULT;
			case CustomStylePackage.ACTOR_STYLE__ACTOR_Y:
				return actorY != ACTOR_Y_EDEFAULT;
			case CustomStylePackage.ACTOR_STYLE__RATIONALE_SHAPE:
				return rationaleShape != RATIONALE_SHAPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actorWidth: ");
		result.append(actorWidth);
		result.append(", actorHeight: ");
		result.append(actorHeight);
		result.append(", actorX: ");
		result.append(actorX);
		result.append(", actorY: ");
		result.append(actorY);
		result.append(", rationaleShape: ");
		result.append(rationaleShape);
		result.append(')');
		return result.toString();
	}

} //ActorStyleImpl