/**
 */
package uk.ac.open.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Link Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.open.problem.ProblemPackage#getLinkType()
 * @model
 * @generated
 */
public enum LinkType implements Enumerator
{
  /**
   * The '<em><b>INTERFACE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERFACE_VALUE
   * @generated
   * @ordered
   */
  INTERFACE(0, "INTERFACE", "--"),

  /**
   * The '<em><b>REFERENCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFERENCE_VALUE
   * @generated
   * @ordered
   */
  REFERENCE(1, "REFERENCE", "~~"),

  /**
   * The '<em><b>CONSTRAINT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSTRAINT_VALUE
   * @generated
   * @ordered
   */
  CONSTRAINT(2, "CONSTRAINT", "<~"),

  /**
   * The '<em><b>CONCERN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONCERN_VALUE
   * @generated
   * @ordered
   */
  CONCERN(3, "CONCERN", "->"),

  /**
   * The '<em><b>INV CONSTRAINT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INV_CONSTRAINT_VALUE
   * @generated
   * @ordered
   */
  INV_CONSTRAINT(4, "INV_CONSTRAINT", "~>");

  /**
   * The '<em><b>INTERFACE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERFACE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERFACE
   * @model literal="--"
   * @generated
   * @ordered
   */
  public static final int INTERFACE_VALUE = 0;

  /**
   * The '<em><b>REFERENCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REFERENCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFERENCE
   * @model literal="~~"
   * @generated
   * @ordered
   */
  public static final int REFERENCE_VALUE = 1;

  /**
   * The '<em><b>CONSTRAINT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSTRAINT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSTRAINT
   * @model literal="&lt;~"
   * @generated
   * @ordered
   */
  public static final int CONSTRAINT_VALUE = 2;

  /**
   * The '<em><b>CONCERN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONCERN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONCERN
   * @model literal="-&gt;"
   * @generated
   * @ordered
   */
  public static final int CONCERN_VALUE = 3;

  /**
   * The '<em><b>INV CONSTRAINT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INV CONSTRAINT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INV_CONSTRAINT
   * @model literal="~&gt;"
   * @generated
   * @ordered
   */
  public static final int INV_CONSTRAINT_VALUE = 4;

  /**
   * An array of all the '<em><b>Link Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LinkType[] VALUES_ARRAY =
    new LinkType[]
    {
      INTERFACE,
      REFERENCE,
      CONSTRAINT,
      CONCERN,
      INV_CONSTRAINT,
    };

  /**
   * A public read-only list of all the '<em><b>Link Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LinkType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Link Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinkType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LinkType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Link Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinkType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LinkType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Link Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinkType get(int value)
  {
    switch (value)
    {
      case INTERFACE_VALUE: return INTERFACE;
      case REFERENCE_VALUE: return REFERENCE;
      case CONSTRAINT_VALUE: return CONSTRAINT;
      case CONCERN_VALUE: return CONCERN;
      case INV_CONSTRAINT_VALUE: return INV_CONSTRAINT;
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
  private LinkType(int value, String name, String literal)
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
  
} //LinkType
