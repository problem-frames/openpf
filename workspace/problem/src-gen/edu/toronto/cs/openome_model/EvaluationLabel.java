/**
 * <copyright>
 * </copyright>
 *
 */
package edu.toronto.cs.openome_model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluation Label</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.toronto.cs.openome_model.Openome_modelPackage#getEvaluationLabel()
 * @model
 * @generated
 */
public enum EvaluationLabel implements Enumerator
{
  /**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
  NONE(0, "None", "None"),

  /**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
  UNKNOWN(0, "Unknown", "Unknown"),

  /**
	 * The '<em><b>Satisfied</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
  SATISFIED(0, "Satisfied", "Satisfied"),

  /**
	 * The '<em><b>Weakly Satisfied</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WEAKLY_SATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
  WEAKLY_SATISFIED(0, "WeaklySatisfied", "WeaklySatisfied"),

  /**
	 * The '<em><b>Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DENIED_VALUE
	 * @generated
	 * @ordered
	 */
  DENIED(0, "Denied", "Denied"),

  /**
	 * The '<em><b>Weakly Denied</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WEAKLY_DENIED_VALUE
	 * @generated
	 * @ordered
	 */
  WEAKLY_DENIED(0, "WeaklyDenied", "WeaklyDenied"),

  /**
	 * The '<em><b>Conflict</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CONFLICT_VALUE
	 * @generated
	 * @ordered
	 */
  CONFLICT(0, "Conflict", "Conflict");

  /**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
  public static final int NONE_VALUE = 0;

  /**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
  public static final int UNKNOWN_VALUE = 0;

  /**
	 * The '<em><b>Satisfied</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Satisfied</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SATISFIED
	 * @model name="Satisfied"
	 * @generated
	 * @ordered
	 */
  public static final int SATISFIED_VALUE = 0;

  /**
	 * The '<em><b>Weakly Satisfied</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Weakly Satisfied</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WEAKLY_SATISFIED
	 * @model name="WeaklySatisfied"
	 * @generated
	 * @ordered
	 */
  public static final int WEAKLY_SATISFIED_VALUE = 0;

  /**
	 * The '<em><b>Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Denied</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DENIED
	 * @model name="Denied"
	 * @generated
	 * @ordered
	 */
  public static final int DENIED_VALUE = 0;

  /**
	 * The '<em><b>Weakly Denied</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Weakly Denied</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WEAKLY_DENIED
	 * @model name="WeaklyDenied"
	 * @generated
	 * @ordered
	 */
  public static final int WEAKLY_DENIED_VALUE = 0;

  /**
	 * The '<em><b>Conflict</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Conflict</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CONFLICT
	 * @model name="Conflict"
	 * @generated
	 * @ordered
	 */
  public static final int CONFLICT_VALUE = 0;

  /**
	 * An array of all the '<em><b>Evaluation Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final EvaluationLabel[] VALUES_ARRAY =
    new EvaluationLabel[] {
			NONE,
			UNKNOWN,
			SATISFIED,
			WEAKLY_SATISFIED,
			DENIED,
			WEAKLY_DENIED,
			CONFLICT,
		};

  /**
	 * A public read-only list of all the '<em><b>Evaluation Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<EvaluationLabel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Evaluation Label</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EvaluationLabel get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationLabel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Evaluation Label</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EvaluationLabel getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluationLabel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Evaluation Label</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EvaluationLabel get(int value)
  {
		switch (value) {
			case NONE_VALUE: return NONE;
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
  private EvaluationLabel(int value, String name, String literal)
  {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public int getValue()
  {
	  return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
	  return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getLiteral()
  {
	  return literal;
	}

  /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		return literal;
	}
  
} //EvaluationLabel
