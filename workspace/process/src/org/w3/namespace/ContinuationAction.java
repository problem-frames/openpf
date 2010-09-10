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
 * A representation of the literals of the enumeration '<em><b>Continuation Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.w3.namespace.NamespacePackage#getContinuationAction()
 * @model extendedMetaData="name='continuation-action_._type'"
 * @generated
 */
public enum ContinuationAction implements Enumerator {
	/**
	 * The '<em><b>Complete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETE(0, "complete", "complete"),

	/**
	 * The '<em><b>Continue</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTINUE_VALUE
	 * @generated
	 * @ordered
	 */
	CONTINUE(1, "continue", "continue"),

	/**
	 * The '<em><b>Restart</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESTART_VALUE
	 * @generated
	 * @ordered
	 */
	RESTART(2, "restart", "restart"),

	/**
	 * The '<em><b>Rethrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETHROW_VALUE
	 * @generated
	 * @ordered
	 */
	RETHROW(3, "rethrow", "rethrow");

	/**
	 * The '<em><b>Complete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Complete</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETE
	 * @model name="complete"
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETE_VALUE = 0;

	/**
	 * The '<em><b>Continue</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Continue</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTINUE
	 * @model name="continue"
	 * @generated
	 * @ordered
	 */
	public static final int CONTINUE_VALUE = 1;

	/**
	 * The '<em><b>Restart</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Restart</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESTART
	 * @model name="restart"
	 * @generated
	 * @ordered
	 */
	public static final int RESTART_VALUE = 2;

	/**
	 * The '<em><b>Rethrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rethrow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETHROW
	 * @model name="rethrow"
	 * @generated
	 * @ordered
	 */
	public static final int RETHROW_VALUE = 3;

	/**
	 * An array of all the '<em><b>Continuation Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContinuationAction[] VALUES_ARRAY =
		new ContinuationAction[] {
			COMPLETE,
			CONTINUE,
			RESTART,
			RETHROW,
		};

	/**
	 * A public read-only list of all the '<em><b>Continuation Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContinuationAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Continuation Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContinuationAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContinuationAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Continuation Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContinuationAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContinuationAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Continuation Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ContinuationAction get(int value) {
		switch (value) {
			case COMPLETE_VALUE: return COMPLETE;
			case CONTINUE_VALUE: return CONTINUE;
			case RESTART_VALUE: return RESTART;
			case RETHROW_VALUE: return RETHROW;
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
	private ContinuationAction(int value, String name, String literal) {
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
	
} //ContinuationAction
