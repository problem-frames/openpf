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
 * A representation of the literals of the enumeration '<em><b>Kind Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage#getKindType()
 * @model extendedMetaData="name='kind_._1_._type'"
 * @generated
 */
public enum KindType implements Enumerator {
	/**
	 * The '<em><b>Sequential</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	SEQUENTIAL(0, "sequential", "sequential"),

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(1, "parallel", "parallel"),

	/**
	 * The '<em><b>Choice</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHOICE_VALUE
	 * @generated
	 * @ordered
	 */
	CHOICE(2, "choice", "choice"),

	/**
	 * The '<em><b>Try</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRY_VALUE
	 * @generated
	 * @ordered
	 */
	TRY(3, "try", "try"),

	/**
	 * The '<em><b>Leaf</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAF_VALUE
	 * @generated
	 * @ordered
	 */
	LEAF(4, "leaf", "leaf");

	/**
	 * The '<em><b>Sequential</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sequential</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEQUENTIAL
	 * @model name="sequential"
	 * @generated
	 * @ordered
	 */
	public static final int SEQUENTIAL_VALUE = 0;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 1;

	/**
	 * The '<em><b>Choice</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Choice</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHOICE
	 * @model name="choice"
	 * @generated
	 * @ordered
	 */
	public static final int CHOICE_VALUE = 2;

	/**
	 * The '<em><b>Try</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Try</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRY
	 * @model name="try"
	 * @generated
	 * @ordered
	 */
	public static final int TRY_VALUE = 3;

	/**
	 * The '<em><b>Leaf</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Leaf</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAF
	 * @model name="leaf"
	 * @generated
	 * @ordered
	 */
	public static final int LEAF_VALUE = 4;

	/**
	 * An array of all the '<em><b>Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final KindType[] VALUES_ARRAY =
		new KindType[] {
			SEQUENTIAL,
			PARALLEL,
			CHOICE,
			TRY,
			LEAF,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<KindType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KindType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			KindType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KindType get(int value) {
		switch (value) {
			case SEQUENTIAL_VALUE: return SEQUENTIAL;
			case PARALLEL_VALUE: return PARALLEL;
			case CHOICE_VALUE: return CHOICE;
			case TRY_VALUE: return TRY;
			case LEAF_VALUE: return LEAF;
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
	private KindType(int value, String name, String literal) {
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
	
} //KindType
