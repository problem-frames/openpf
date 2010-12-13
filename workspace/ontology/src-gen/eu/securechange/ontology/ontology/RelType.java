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
 * A representation of the literals of the enumeration '<em><b>Rel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.securechange.ontology.ontology.OntologyPackage#getRelType()
 * @model
 * @generated
 */
public enum RelType implements Enumerator
{
  /**
   * The '<em><b>CARRIESOUT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CARRIESOUT_VALUE
   * @generated
   * @ordered
   */
  CARRIESOUT(0, "CARRIESOUT", "carries out"),

  /**
   * The '<em><b>DEPENDS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEPENDS_VALUE
   * @generated
   * @ordered
   */
  DEPENDS(1, "DEPENDS", "depends"),

  /**
   * The '<em><b>DECOMPOSES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECOMPOSES_VALUE
   * @generated
   * @ordered
   */
  DECOMPOSES(2, "DECOMPOSES", "decomposes"),

  /**
   * The '<em><b>CONTRIBUTES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONTRIBUTES_VALUE
   * @generated
   * @ordered
   */
  CONTRIBUTES(3, "CONTRIBUTES", "contributes"),

  /**
   * The '<em><b>DELEGATES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DELEGATES_VALUE
   * @generated
   * @ordered
   */
  DELEGATES(4, "DELEGATES", "delegates"),

  /**
   * The '<em><b>FULFILS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FULFILS_VALUE
   * @generated
   * @ordered
   */
  FULFILS(5, "FULFILS", "fulfils"),

  /**
   * The '<em><b>PROVIDES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROVIDES_VALUE
   * @generated
   * @ordered
   */
  PROVIDES(6, "PROVIDES", "provides"),

  /**
   * The '<em><b>TRUSTS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TRUSTS_VALUE
   * @generated
   * @ordered
   */
  TRUSTS(7, "TRUSTS", "trusts"),

  /**
   * The '<em><b>WANTS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WANTS_VALUE
   * @generated
   * @ordered
   */
  WANTS(8, "WANTS", "wants"),

  /**
   * The '<em><b>DAMAGES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DAMAGES_VALUE
   * @generated
   * @ordered
   */
  DAMAGES(9, "DAMAGES", "damages"),

  /**
   * The '<em><b>ATTACKS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTACKS_VALUE
   * @generated
   * @ordered
   */
  ATTACKS(10, "ATTACKS", "attacks"),

  /**
   * The '<em><b>ARGUES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARGUES_VALUE
   * @generated
   * @ordered
   */
  ARGUES(11, "ARGUES", "argues"),

  /**
   * The '<em><b>INTERFACES</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INTERFACES_VALUE
   * @generated
   * @ordered
   */
  INTERFACES(12, "INTERFACES", "interfaces"),

  /**
   * The '<em><b>CONSUM Es</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSUM_ES_VALUE
   * @generated
   * @ordered
   */
  CONSUM_ES(13, "CONSUMEs", "consumes"),

  /**
   * The '<em><b>PROTECTS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PROTECTS_VALUE
   * @generated
   * @ordered
   */
  PROTECTS(14, "PROTECTS", "protects");

  /**
   * The '<em><b>CARRIESOUT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CARRIESOUT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CARRIESOUT
   * @model literal="carries out"
   * @generated
   * @ordered
   */
  public static final int CARRIESOUT_VALUE = 0;

  /**
   * The '<em><b>DEPENDS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DEPENDS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DEPENDS
   * @model literal="depends"
   * @generated
   * @ordered
   */
  public static final int DEPENDS_VALUE = 1;

  /**
   * The '<em><b>DECOMPOSES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DECOMPOSES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECOMPOSES
   * @model literal="decomposes"
   * @generated
   * @ordered
   */
  public static final int DECOMPOSES_VALUE = 2;

  /**
   * The '<em><b>CONTRIBUTES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONTRIBUTES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONTRIBUTES
   * @model literal="contributes"
   * @generated
   * @ordered
   */
  public static final int CONTRIBUTES_VALUE = 3;

  /**
   * The '<em><b>DELEGATES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DELEGATES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DELEGATES
   * @model literal="delegates"
   * @generated
   * @ordered
   */
  public static final int DELEGATES_VALUE = 4;

  /**
   * The '<em><b>FULFILS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FULFILS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FULFILS
   * @model literal="fulfils"
   * @generated
   * @ordered
   */
  public static final int FULFILS_VALUE = 5;

  /**
   * The '<em><b>PROVIDES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROVIDES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROVIDES
   * @model literal="provides"
   * @generated
   * @ordered
   */
  public static final int PROVIDES_VALUE = 6;

  /**
   * The '<em><b>TRUSTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRUSTS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TRUSTS
   * @model literal="trusts"
   * @generated
   * @ordered
   */
  public static final int TRUSTS_VALUE = 7;

  /**
   * The '<em><b>WANTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>WANTS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WANTS
   * @model literal="wants"
   * @generated
   * @ordered
   */
  public static final int WANTS_VALUE = 8;

  /**
   * The '<em><b>DAMAGES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DAMAGES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DAMAGES
   * @model literal="damages"
   * @generated
   * @ordered
   */
  public static final int DAMAGES_VALUE = 9;

  /**
   * The '<em><b>ATTACKS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ATTACKS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTACKS
   * @model literal="attacks"
   * @generated
   * @ordered
   */
  public static final int ATTACKS_VALUE = 10;

  /**
   * The '<em><b>ARGUES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARGUES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARGUES
   * @model literal="argues"
   * @generated
   * @ordered
   */
  public static final int ARGUES_VALUE = 11;

  /**
   * The '<em><b>INTERFACES</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INTERFACES</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INTERFACES
   * @model literal="interfaces"
   * @generated
   * @ordered
   */
  public static final int INTERFACES_VALUE = 12;

  /**
   * The '<em><b>CONSUM Es</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSUM Es</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSUM_ES
   * @model name="CONSUMEs" literal="consumes"
   * @generated
   * @ordered
   */
  public static final int CONSUM_ES_VALUE = 13;

  /**
   * The '<em><b>PROTECTS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PROTECTS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PROTECTS
   * @model literal="protects"
   * @generated
   * @ordered
   */
  public static final int PROTECTS_VALUE = 14;

  /**
   * An array of all the '<em><b>Rel Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RelType[] VALUES_ARRAY =
    new RelType[]
    {
      CARRIESOUT,
      DEPENDS,
      DECOMPOSES,
      CONTRIBUTES,
      DELEGATES,
      FULFILS,
      PROVIDES,
      TRUSTS,
      WANTS,
      DAMAGES,
      ATTACKS,
      ARGUES,
      INTERFACES,
      CONSUM_ES,
      PROTECTS,
    };

  /**
   * A public read-only list of all the '<em><b>Rel Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RelType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Rel Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rel Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RelType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Rel Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RelType get(int value)
  {
    switch (value)
    {
      case CARRIESOUT_VALUE: return CARRIESOUT;
      case DEPENDS_VALUE: return DEPENDS;
      case DECOMPOSES_VALUE: return DECOMPOSES;
      case CONTRIBUTES_VALUE: return CONTRIBUTES;
      case DELEGATES_VALUE: return DELEGATES;
      case FULFILS_VALUE: return FULFILS;
      case PROVIDES_VALUE: return PROVIDES;
      case TRUSTS_VALUE: return TRUSTS;
      case WANTS_VALUE: return WANTS;
      case DAMAGES_VALUE: return DAMAGES;
      case ATTACKS_VALUE: return ATTACKS;
      case ARGUES_VALUE: return ARGUES;
      case INTERFACES_VALUE: return INTERFACES;
      case CONSUM_ES_VALUE: return CONSUM_ES;
      case PROTECTS_VALUE: return PROTECTS;
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
  private RelType(int value, String name, String literal)
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
  
} //RelType
