/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Domain Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.securechange.ontology.ontology.OntologyPackage#getDomainType()
 * @model
 * @generated
 */
public enum DomainType implements Enumerator
{
  /**
	 * The '<em><b>Specification</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SPECIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
  SPECIFICATION(0, "Specification", "S"),

  /**
	 * The '<em><b>Requirement</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #REQUIREMENT_VALUE
	 * @generated
	 * @ordered
	 */
  REQUIREMENT(1, "Requirement", "R"),

  /**
	 * The '<em><b>World</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WORLD_VALUE
	 * @generated
	 * @ordered
	 */
  WORLD(2, "World", "W");

  /**
	 * The '<em><b>Specification</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Specification</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SPECIFICATION
	 * @model name="Specification" literal="S"
	 * @generated
	 * @ordered
	 */
  public static final int SPECIFICATION_VALUE = 0;

  /**
	 * The '<em><b>Requirement</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Requirement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #REQUIREMENT
	 * @model name="Requirement" literal="R"
	 * @generated
	 * @ordered
	 */
  public static final int REQUIREMENT_VALUE = 1;

  /**
	 * The '<em><b>World</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>World</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WORLD
	 * @model name="World" literal="W"
	 * @generated
	 * @ordered
	 */
  public static final int WORLD_VALUE = 2;

  /**
	 * An array of all the '<em><b>Domain Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final DomainType[] VALUES_ARRAY =
    new DomainType[] {
			SPECIFICATION,
			REQUIREMENT,
			WORLD,
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
			case SPECIFICATION_VALUE: return SPECIFICATION;
			case REQUIREMENT_VALUE: return REQUIREMENT;
			case WORLD_VALUE: return WORLD;
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
