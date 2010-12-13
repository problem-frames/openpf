/**
 * <copyright>
 * </copyright>
 *
 * $Id: ESATType.java,v 1.1.1.1 2007/03/18 21:36:43 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ESAT Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getESATType()
 * @model
 * @generated
 */
public final class ESATType extends AbstractEnumerator {
	/**
	 * The '<em><b>SAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAT_LITERAL
	 * @model literal="S"
	 * @generated
	 * @ordered
	 */
	public static final int SAT = 0;

	/**
	 * The '<em><b>DEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEN_LITERAL
	 * @model literal="D"
	 * @generated
	 * @ordered
	 */
	public static final int DEN = 0;

	/**
	 * The '<em><b>NA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NA_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NA = 0;

	/**
	 * The '<em><b>SAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAT
	 * @generated
	 * @ordered
	 */
	public static final ESATType SAT_LITERAL = new ESATType(SAT, "SAT", "S");

	/**
	 * The '<em><b>DEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEN
	 * @generated
	 * @ordered
	 */
	public static final ESATType DEN_LITERAL = new ESATType(DEN, "DEN", "D");

	/**
	 * The '<em><b>NA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NA
	 * @generated
	 * @ordered
	 */
	public static final ESATType NA_LITERAL = new ESATType(NA, "NA", "NA");

	/**
	 * An array of all the '<em><b>ESAT Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ESATType[] VALUES_ARRAY =
		new ESATType[] {
			SAT_LITERAL,
			DEN_LITERAL,
			NA_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ESAT Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ESAT Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESATType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESATType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESAT Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESATType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ESATType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ESAT Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ESATType get(int value) {
		switch (value) {
			case SAT: return SAT_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ESATType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ESATType
