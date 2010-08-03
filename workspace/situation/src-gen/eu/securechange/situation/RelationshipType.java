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
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.securechange.situation.SituationPackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator
{
  /**
	 * The '<em><b>Wants</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #WANTS_VALUE
	 * @generated
	 * @ordered
	 */
  WANTS(0, "Wants", "wants"),

  /**
	 * The '<em><b>Does</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DOES_VALUE
	 * @generated
	 * @ordered
	 */
  DOES(1, "Does", "does"),

  /**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
  AND(2, "AND", "and"),

  /**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
  OR(3, "OR", "or"),

  /**
	 * The '<em><b>TRUST</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #TRUST_VALUE
	 * @generated
	 * @ordered
	 */
  TRUST(4, "TRUST", "trusts"),

  /**
	 * The '<em><b>DELEGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DELEGATE_VALUE
	 * @generated
	 * @ordered
	 */
  DELEGATE(5, "DELEGATE", "delegates"),

  /**
	 * The '<em><b>HURT</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #HURT_VALUE
	 * @generated
	 * @ordered
	 */
  HURT(6, "HURT", "-"),

  /**
	 * The '<em><b>HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
  HELP(7, "HELP", "+"),

  /**
	 * The '<em><b>BREAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
  BREAK(8, "BREAK", "--"),

  /**
	 * The '<em><b>MAKE</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #MAKE_VALUE
	 * @generated
	 * @ordered
	 */
  MAKE(9, "MAKE", "++"),

  /**
	 * The '<em><b>Fulfils</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FULFILS_VALUE
	 * @generated
	 * @ordered
	 */
  FULFILS(10, "Fulfils", "fulfils"),

  /**
	 * The '<em><b>Provides</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #PROVIDES_VALUE
	 * @generated
	 * @ordered
	 */
  PROVIDES(11, "Provides", "provides"),

  /**
	 * The '<em><b>Consumes</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #CONSUMES_VALUE
	 * @generated
	 * @ordered
	 */
  CONSUMES(12, "Consumes", "consumes"),

  /**
	 * The '<em><b>Exploits</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #EXPLOITS_VALUE
	 * @generated
	 * @ordered
	 */
  EXPLOITS(13, "Exploits", "exploits"),

  /**
	 * The '<em><b>Damages</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DAMAGES_VALUE
	 * @generated
	 * @ordered
	 */
  DAMAGES(14, "Damages", "damages"),

  /**
	 * The '<em><b>Attacks</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ATTACKS_VALUE
	 * @generated
	 * @ordered
	 */
  ATTACKS(15, "Attacks", "attacks"),

  /**
	 * The '<em><b>Argues</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ARGUES_VALUE
	 * @generated
	 * @ordered
	 */
  ARGUES(16, "Argues", "argues");

  /**
	 * The '<em><b>Wants</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Wants</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #WANTS
	 * @model name="Wants" literal="wants"
	 * @generated
	 * @ordered
	 */
  public static final int WANTS_VALUE = 0;

  /**
	 * The '<em><b>Does</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Does</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DOES
	 * @model name="Does" literal="does"
	 * @generated
	 * @ordered
	 */
  public static final int DOES_VALUE = 1;

  /**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #AND
	 * @model literal="and"
	 * @generated
	 * @ordered
	 */
  public static final int AND_VALUE = 2;

  /**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #OR
	 * @model literal="or"
	 * @generated
	 * @ordered
	 */
  public static final int OR_VALUE = 3;

  /**
	 * The '<em><b>TRUST</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TRUST</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #TRUST
	 * @model literal="trusts"
	 * @generated
	 * @ordered
	 */
  public static final int TRUST_VALUE = 4;

  /**
	 * The '<em><b>DELEGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DELEGATE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DELEGATE
	 * @model literal="delegates"
	 * @generated
	 * @ordered
	 */
  public static final int DELEGATE_VALUE = 5;

  /**
	 * The '<em><b>HURT</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HURT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #HURT
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
  public static final int HURT_VALUE = 6;

  /**
	 * The '<em><b>HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>HELP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #HELP
	 * @model literal="+"
	 * @generated
	 * @ordered
	 */
  public static final int HELP_VALUE = 7;

  /**
	 * The '<em><b>BREAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BREAK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #BREAK
	 * @model literal="--"
	 * @generated
	 * @ordered
	 */
  public static final int BREAK_VALUE = 8;

  /**
	 * The '<em><b>MAKE</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAKE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #MAKE
	 * @model literal="++"
	 * @generated
	 * @ordered
	 */
  public static final int MAKE_VALUE = 9;

  /**
	 * The '<em><b>Fulfils</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Fulfils</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FULFILS
	 * @model name="Fulfils" literal="fulfils"
	 * @generated
	 * @ordered
	 */
  public static final int FULFILS_VALUE = 10;

  /**
	 * The '<em><b>Provides</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Provides</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #PROVIDES
	 * @model name="Provides" literal="provides"
	 * @generated
	 * @ordered
	 */
  public static final int PROVIDES_VALUE = 11;

  /**
	 * The '<em><b>Consumes</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Consumes</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #CONSUMES
	 * @model name="Consumes" literal="consumes"
	 * @generated
	 * @ordered
	 */
  public static final int CONSUMES_VALUE = 12;

  /**
	 * The '<em><b>Exploits</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Exploits</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #EXPLOITS
	 * @model name="Exploits" literal="exploits"
	 * @generated
	 * @ordered
	 */
  public static final int EXPLOITS_VALUE = 13;

  /**
	 * The '<em><b>Damages</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Damages</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DAMAGES
	 * @model name="Damages" literal="damages"
	 * @generated
	 * @ordered
	 */
  public static final int DAMAGES_VALUE = 14;

  /**
	 * The '<em><b>Attacks</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attacks</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ATTACKS
	 * @model name="Attacks" literal="attacks"
	 * @generated
	 * @ordered
	 */
  public static final int ATTACKS_VALUE = 15;

  /**
	 * The '<em><b>Argues</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Argues</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ARGUES
	 * @model name="Argues" literal="argues"
	 * @generated
	 * @ordered
	 */
  public static final int ARGUES_VALUE = 16;

  /**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final RelationshipType[] VALUES_ARRAY =
    new RelationshipType[] {
			WANTS,
			DOES,
			AND,
			OR,
			TRUST,
			DELEGATE,
			HURT,
			HELP,
			BREAK,
			MAKE,
			FULFILS,
			PROVIDES,
			CONSUMES,
			EXPLOITS,
			DAMAGES,
			ATTACKS,
			ARGUES,
		};

  /**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RelationshipType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RelationshipType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static RelationshipType get(int value)
  {
		switch (value) {
			case WANTS_VALUE: return WANTS;
			case DOES_VALUE: return DOES;
			case AND_VALUE: return AND;
			case OR_VALUE: return OR;
			case TRUST_VALUE: return TRUST;
			case DELEGATE_VALUE: return DELEGATE;
			case HURT_VALUE: return HURT;
			case HELP_VALUE: return HELP;
			case BREAK_VALUE: return BREAK;
			case MAKE_VALUE: return MAKE;
			case FULFILS_VALUE: return FULFILS;
			case PROVIDES_VALUE: return PROVIDES;
			case CONSUMES_VALUE: return CONSUMES;
			case EXPLOITS_VALUE: return EXPLOITS;
			case DAMAGES_VALUE: return DAMAGES;
			case ATTACKS_VALUE: return ATTACKS;
			case ARGUES_VALUE: return ARGUES;
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
  private RelationshipType(int value, String name, String literal)
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
  
} //RelationshipType
