/**
 * <copyright>
 * </copyright>
 *
 * $Id: EShapeType.java,v 1.1.1.1 2007/06/08 11:23:04 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EShape Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getEShapeType()
 * @model
 * @generated
 */
public final class EShapeType extends AbstractEnumerator {
	/**
	 * The '<em><b>OVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OVAL = 0;

	/**
	 * The '<em><b>RECTANGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RECTANGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECTANGLE = 1;

	/**
	 * The '<em><b>OVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVAL
	 * @generated
	 * @ordered
	 */
	public static final EShapeType OVAL_LITERAL = new EShapeType(OVAL, "OVAL", "OVAL");

	/**
	 * The '<em><b>RECTANGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTANGLE
	 * @generated
	 * @ordered
	 */
	public static final EShapeType RECTANGLE_LITERAL = new EShapeType(RECTANGLE, "RECTANGLE", "RECTANGLE");

	/**
	 * An array of all the '<em><b>EShape Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EShapeType[] VALUES_ARRAY =
		new EShapeType[] {
			OVAL_LITERAL,
			RECTANGLE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EShape Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EShape Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EShapeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EShapeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EShape Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EShapeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EShapeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EShape Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EShapeType get(int value) {
		switch (value) {
			case OVAL: return OVAL_LITERAL;
			case RECTANGLE: return RECTANGLE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EShapeType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EShapeType
