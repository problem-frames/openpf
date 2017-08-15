/**
 */
package uk.ac.open.problem;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.open.problem.ProblemPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator
{
  /**
   * The '<em><b>REQUIREMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REQUIREMENT_VALUE
   * @generated
   * @ordered
   */
  REQUIREMENT(0, "REQUIREMENT", "R"),

  /**
   * The '<em><b>MACHINE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MACHINE_VALUE
   * @generated
   * @ordered
   */
  MACHINE(1, "MACHINE", "M"),

  /**
   * The '<em><b>BIDDABLE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BIDDABLE_VALUE
   * @generated
   * @ordered
   */
  BIDDABLE(2, "BIDDABLE", "B"),

  /**
   * The '<em><b>LEXICAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LEXICAL_VALUE
   * @generated
   * @ordered
   */
  LEXICAL(3, "LEXICAL", "X"),

  /**
   * The '<em><b>CAUSAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CAUSAL_VALUE
   * @generated
   * @ordered
   */
  CAUSAL(4, "CAUSAL", "C"),

  /**
   * The '<em><b>DESIGNED</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DESIGNED_VALUE
   * @generated
   * @ordered
   */
  DESIGNED(5, "DESIGNED", "D"),

  /**
   * The '<em><b>PHYSICAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PHYSICAL_VALUE
   * @generated
   * @ordered
   */
  PHYSICAL(6, "PHYSICAL", "P"),

  /**
   * The '<em><b>CONCERN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONCERN_VALUE
   * @generated
   * @ordered
   */
  CONCERN(7, "CONCERN", "?");

  /**
   * The '<em><b>REQUIREMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REQUIREMENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REQUIREMENT
   * @model literal="R"
   * @generated
   * @ordered
   */
  public static final int REQUIREMENT_VALUE = 0;

  /**
   * The '<em><b>MACHINE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MACHINE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MACHINE
   * @model literal="M"
   * @generated
   * @ordered
   */
  public static final int MACHINE_VALUE = 1;

  /**
   * The '<em><b>BIDDABLE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BIDDABLE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BIDDABLE
   * @model literal="B"
   * @generated
   * @ordered
   */
  public static final int BIDDABLE_VALUE = 2;

  /**
   * The '<em><b>LEXICAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LEXICAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LEXICAL
   * @model literal="X"
   * @generated
   * @ordered
   */
  public static final int LEXICAL_VALUE = 3;

  /**
   * The '<em><b>CAUSAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CAUSAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CAUSAL
   * @model literal="C"
   * @generated
   * @ordered
   */
  public static final int CAUSAL_VALUE = 4;

  /**
   * The '<em><b>DESIGNED</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DESIGNED</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DESIGNED
   * @model literal="D"
   * @generated
   * @ordered
   */
  public static final int DESIGNED_VALUE = 5;

  /**
   * The '<em><b>PHYSICAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PHYSICAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PHYSICAL
   * @model literal="P"
   * @generated
   * @ordered
   */
  public static final int PHYSICAL_VALUE = 6;

  /**
   * The '<em><b>CONCERN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONCERN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONCERN
   * @model literal="?"
   * @generated
   * @ordered
   */
  public static final int CONCERN_VALUE = 7;

  /**
   * An array of all the '<em><b>Node Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NodeType[] VALUES_ARRAY =
    new NodeType[]
    {
      REQUIREMENT,
      MACHINE,
      BIDDABLE,
      LEXICAL,
      CAUSAL,
      DESIGNED,
      PHYSICAL,
      CONCERN,
    };

  /**
   * A public read-only list of all the '<em><b>Node Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<NodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NodeType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NodeType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NodeType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      NodeType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Node Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static NodeType get(int value)
  {
    switch (value)
    {
      case REQUIREMENT_VALUE: return REQUIREMENT;
      case MACHINE_VALUE: return MACHINE;
      case BIDDABLE_VALUE: return BIDDABLE;
      case LEXICAL_VALUE: return LEXICAL;
      case CAUSAL_VALUE: return CAUSAL;
      case DESIGNED_VALUE: return DESIGNED;
      case PHYSICAL_VALUE: return PHYSICAL;
      case CONCERN_VALUE: return CONCERN;
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
  private NodeType(int value, String name, String literal)
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
  
} //NodeType
