/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.w3.namespace;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind3</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage#getKind3()
 * @model extendedMetaData="name='kind_._4_._type'"
 * @generated
 */
public enum Kind3 implements Enumerator {
	/**
	 * The '<em><b>Read</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_VALUE
	 * @generated
	 * @ordered
	 */
	READ(0, "read", "read"),

	/**
	 * The '<em><b>Write</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRITE_VALUE
	 * @generated
	 * @ordered
	 */
	WRITE(1, "write", "write"),

	/**
	 * The '<em><b>Take</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAKE_VALUE
	 * @generated
	 * @ordered
	 */
	TAKE(2, "take", "take"),

	/**
	 * The '<em><b>Read Nowait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_NOWAIT_VALUE
	 * @generated
	 * @ordered
	 */
	READ_NOWAIT(3, "readNowait", "read-nowait"),

	/**
	 * The '<em><b>Take Nowait</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAKE_NOWAIT_VALUE
	 * @generated
	 * @ordered
	 */
	TAKE_NOWAIT(4, "takeNowait", "take-nowait");

	/**
	 * The '<em><b>Read</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ
	 * @model name="read"
	 * @generated
	 * @ordered
	 */
	public static final int READ_VALUE = 0;

	/**
	 * The '<em><b>Write</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Write</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRITE
	 * @model name="write"
	 * @generated
	 * @ordered
	 */
	public static final int WRITE_VALUE = 1;

	/**
	 * The '<em><b>Take</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Take</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAKE
	 * @model name="take"
	 * @generated
	 * @ordered
	 */
	public static final int TAKE_VALUE = 2;

	/**
	 * The '<em><b>Read Nowait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Read Nowait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_NOWAIT
	 * @model name="readNowait" literal="read-nowait"
	 * @generated
	 * @ordered
	 */
	public static final int READ_NOWAIT_VALUE = 3;

	/**
	 * The '<em><b>Take Nowait</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Take Nowait</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAKE_NOWAIT
	 * @model name="takeNowait" literal="take-nowait"
	 * @generated
	 * @ordered
	 */
	public static final int TAKE_NOWAIT_VALUE = 4;

	/**
	 * An array of all the '<em><b>Kind3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kind3[] VALUES_ARRAY =
		new Kind3[] {
			READ,
			WRITE,
			TAKE,
			READ_NOWAIT,
			TAKE_NOWAIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind3</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kind3> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind3</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind3 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind3 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind3</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind3 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind3 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind3</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind3 get(int value) {
		switch (value) {
			case READ_VALUE: return READ;
			case WRITE_VALUE: return WRITE;
			case TAKE_VALUE: return TAKE;
			case READ_NOWAIT_VALUE: return READ_NOWAIT;
			case TAKE_NOWAIT_VALUE: return TAKE_NOWAIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Kind3(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Kind3
