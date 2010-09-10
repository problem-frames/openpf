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
 * A representation of the literals of the enumeration '<em><b>Kind1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage#getKind1()
 * @model extendedMetaData="name='kind_._2_._type'"
 * @generated
 */
public enum Kind1 implements Enumerator {
	/**
	 * The '<em><b>Copy In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_IN_VALUE
	 * @generated
	 * @ordered
	 */
	COPY_IN(0, "copyIn", "copy-in"),

	/**
	 * The '<em><b>Copy Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	COPY_OUT(1, "copyOut", "copy-out"),

	/**
	 * The '<em><b>Copy In And Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPY_IN_AND_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	COPY_IN_AND_OUT(2, "copyInAndOut", "copy-in-and-out"),

	/**
	 * The '<em><b>Constrain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRAIN(3, "constrain", "constrain");

	/**
	 * The '<em><b>Copy In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copy In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPY_IN
	 * @model name="copyIn" literal="copy-in"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_IN_VALUE = 0;

	/**
	 * The '<em><b>Copy Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copy Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPY_OUT
	 * @model name="copyOut" literal="copy-out"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_OUT_VALUE = 1;

	/**
	 * The '<em><b>Copy In And Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copy In And Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPY_IN_AND_OUT
	 * @model name="copyInAndOut" literal="copy-in-and-out"
	 * @generated
	 * @ordered
	 */
	public static final int COPY_IN_AND_OUT_VALUE = 2;

	/**
	 * The '<em><b>Constrain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constrain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRAIN
	 * @model name="constrain"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAIN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Kind1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Kind1[] VALUES_ARRAY =
		new Kind1[] {
			COPY_IN,
			COPY_OUT,
			COPY_IN_AND_OUT,
			CONSTRAIN,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Kind1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Kind1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Kind1 get(int value) {
		switch (value) {
			case COPY_IN_VALUE: return COPY_IN;
			case COPY_OUT_VALUE: return COPY_OUT;
			case COPY_IN_AND_OUT_VALUE: return COPY_IN_AND_OUT;
			case CONSTRAIN_VALUE: return CONSTRAIN;
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
	private Kind1(int value, String name, String literal) {
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
	
} //Kind1
