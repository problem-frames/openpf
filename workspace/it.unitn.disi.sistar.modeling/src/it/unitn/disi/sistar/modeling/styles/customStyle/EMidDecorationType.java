/**
 * <copyright>
 * </copyright>
 *
 * $Id: EMidDecorationType.java,v 1.1.1.1 2007/06/13 21:53:33 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EMid Decoration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getEMidDecorationType()
 * @model
 * @generated
 */
public final class EMidDecorationType extends AbstractEnumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>ARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW = 1;

	/**
	 * The '<em><b>BOX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOX_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOX = 2;

	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final EMidDecorationType NONE_LITERAL = new EMidDecorationType(NONE, "NONE", "NONE");

	/**
	 * The '<em><b>ARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW
	 * @generated
	 * @ordered
	 */
	public static final EMidDecorationType ARROW_LITERAL = new EMidDecorationType(ARROW, "ARROW", "ARROW");

	/**
	 * The '<em><b>BOX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOX
	 * @generated
	 * @ordered
	 */
	public static final EMidDecorationType BOX_LITERAL = new EMidDecorationType(BOX, "BOX", "BOX");

	/**
	 * An array of all the '<em><b>EMid Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EMidDecorationType[] VALUES_ARRAY =
		new EMidDecorationType[] {
			NONE_LITERAL,
			ARROW_LITERAL,
			BOX_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EMid Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EMid Decoration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMidDecorationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EMidDecorationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EMid Decoration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMidDecorationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EMidDecorationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EMid Decoration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EMidDecorationType get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case ARROW: return ARROW_LITERAL;
			case BOX: return BOX_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EMidDecorationType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EMidDecorationType
