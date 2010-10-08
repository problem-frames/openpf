/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.argument.argument;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Node Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see uk.ac.open.argument.argument.ArgumentPackage#getNodeType()
 * @model
 * @generated
 */
public enum NodeType implements Enumerator
{
  /**
   * The '<em><b>CLAIM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CLAIM_VALUE
   * @generated
   * @ordered
   */
  CLAIM(0, "CLAIM", "C"),

  /**
   * The '<em><b>WARRANT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WARRANT_VALUE
   * @generated
   * @ordered
   */
  WARRANT(1, "WARRANT", "W"),

  /**
   * The '<em><b>GROUND</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GROUND_VALUE
   * @generated
   * @ordered
   */
  GROUND(2, "GROUND", "G"),

  /**
   * The '<em><b>REBUTTAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REBUTTAL_VALUE
   * @generated
   * @ordered
   */
  REBUTTAL(3, "REBUTTAL", "R"),

  /**
   * The '<em><b>MITIGATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MITIGATION_VALUE
   * @generated
   * @ordered
   */
  MITIGATION(4, "MITIGATION", "M"),

  /**
   * The '<em><b>ARGUMENT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARGUMENT_VALUE
   * @generated
   * @ordered
   */
  ARGUMENT(5, "ARGUMENT", "A");

  /**
   * The '<em><b>CLAIM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CLAIM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CLAIM
   * @model literal="C"
   * @generated
   * @ordered
   */
  public static final int CLAIM_VALUE = 0;

  /**
   * The '<em><b>WARRANT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WARRANT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WARRANT
   * @model literal="W"
   * @generated
   * @ordered
   */
  public static final int WARRANT_VALUE = 1;

  /**
   * The '<em><b>GROUND</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GROUND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GROUND
   * @model literal="G"
   * @generated
   * @ordered
   */
  public static final int GROUND_VALUE = 2;

  /**
   * The '<em><b>REBUTTAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REBUTTAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REBUTTAL
   * @model literal="R"
   * @generated
   * @ordered
   */
  public static final int REBUTTAL_VALUE = 3;

  /**
   * The '<em><b>MITIGATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MITIGATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MITIGATION
   * @model literal="M"
   * @generated
   * @ordered
   */
  public static final int MITIGATION_VALUE = 4;

  /**
   * The '<em><b>ARGUMENT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARGUMENT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARGUMENT
   * @model literal="A"
   * @generated
   * @ordered
   */
  public static final int ARGUMENT_VALUE = 5;

  /**
   * An array of all the '<em><b>Node Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final NodeType[] VALUES_ARRAY =
    new NodeType[]
    {
      CLAIM,
      WARRANT,
      GROUND,
      REBUTTAL,
      MITIGATION,
      ARGUMENT,
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
   * @generated
   */
  public static NodeType get(int value)
  {
    switch (value)
    {
      case CLAIM_VALUE: return CLAIM;
      case WARRANT_VALUE: return WARRANT;
      case GROUND_VALUE: return GROUND;
      case REBUTTAL_VALUE: return REBUTTAL;
      case MITIGATION_VALUE: return MITIGATION;
      case ARGUMENT_VALUE: return ARGUMENT;
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
