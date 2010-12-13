/**
 * <copyright>
 * </copyright>
 *
 * $Id: EConnectionLineStyle.java,v 1.1.1.1 2007/06/19 11:47:43 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.styles.customStyle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EConnection Line Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.styles.customStyle.CustomStylePackage#getEConnectionLineStyle()
 * @model
 * @generated
 */
public final class EConnectionLineStyle extends AbstractEnumerator {
	/**
	 * The '<em><b>SOLID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOLID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLID_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOLID = 0;

	/**
	 * The '<em><b>DASHED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DASHED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASHED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DASHED = 1;

	/**
	 * The '<em><b>DOTTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOTTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOTTED_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOTTED = 2;

	/**
	 * The '<em><b>SOLID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLID
	 * @generated
	 * @ordered
	 */
	public static final EConnectionLineStyle SOLID_LITERAL = new EConnectionLineStyle(SOLID, "SOLID", "SOLID");

	/**
	 * The '<em><b>DASHED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHED
	 * @generated
	 * @ordered
	 */
	public static final EConnectionLineStyle DASHED_LITERAL = new EConnectionLineStyle(DASHED, "DASHED", "DASHED");

	/**
	 * The '<em><b>DOTTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOTTED
	 * @generated
	 * @ordered
	 */
	public static final EConnectionLineStyle DOTTED_LITERAL = new EConnectionLineStyle(DOTTED, "DOTTED", "DOTTED");

	/**
	 * An array of all the '<em><b>EConnection Line Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EConnectionLineStyle[] VALUES_ARRAY =
		new EConnectionLineStyle[] {
			SOLID_LITERAL,
			DASHED_LITERAL,
			DOTTED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EConnection Line Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EConnection Line Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EConnectionLineStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EConnectionLineStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EConnection Line Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EConnectionLineStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EConnectionLineStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EConnection Line Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EConnectionLineStyle get(int value) {
		switch (value) {
			case SOLID: return SOLID_LITERAL;
			case DASHED: return DASHED_LITERAL;
			case DOTTED: return DOTTED_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EConnectionLineStyle(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EConnectionLineStyle
