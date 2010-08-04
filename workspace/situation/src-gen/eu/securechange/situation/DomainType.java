/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domain Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.securechange.situation.SituationPackage#getDomainType()
 * @model
 * @generated
 */
public enum DomainType implements Enumerator
{
  /**
	 * The '<em><b>Machine</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MACHINE_VALUE
	 * @generated
	 * @ordered
	 */
  MACHINE(0, "Machine", "Machine"),

  /**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
  REQUIREMENT(1, "Requirement", "Requirement"),

  /**
	 * The '<em><b>Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
  SPECIFICATION(2, "Specification", "Specification");

  /**
	 * The '<em><b>Machine</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Machine</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MACHINE
	 * @model name="Machine"
	 * @generated
	 * @ordered
	 */
  public static final int MACHINE_VALUE = 0;

  /**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Requirement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #REQUIREMENT
	 * @model name="Requirement"
	 * @generated
	 * @ordered
	 */
  public static final int REQUIREMENT_VALUE = 1;

  /**
	 * The '<em><b>Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Specification</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SPECIFICATION
	 * @model name="Specification"
	 * @generated
	 * @ordered
	 */
  public static final int SPECIFICATION_VALUE = 2;

  /**
	 * An array of all the '<em><b>Domain Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final DomainType[] VALUES_ARRAY =
    new DomainType[] {
			MACHINE,
			REQUIREMENT,
			SPECIFICATION,
		};

  /**
	 * A public read-only list of all the '<em><b>Domain Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<DomainType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Domain Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DomainType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Domain Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DomainType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DomainType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Domain Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static DomainType get(int value)
  {
		switch (value) {
			case MACHINE_VALUE: return MACHINE;
			case REQUIREMENT_VALUE: return REQUIREMENT;
			case SPECIFICATION_VALUE: return SPECIFICATION;
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
  private DomainType(int value, String name, String literal)
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
  
} //DomainType
