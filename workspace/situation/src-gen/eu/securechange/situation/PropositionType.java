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
 * A representation of the literals of the enumeration '<em><b>Proposition Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see eu.securechange.situation.SituationPackage#getPropositionType()
 * @model
 * @generated
 */
public enum PropositionType implements Enumerator
{
  /**
	 * The '<em><b>Domain Assumption</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #DOMAIN_ASSUMPTION_VALUE
	 * @generated
	 * @ordered
	 */
  DOMAIN_ASSUMPTION(0, "DomainAssumption", "DA"),

  /**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
  FUNCTION(1, "Function", "FR"),

  /**
	 * The '<em><b>Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
  SECURITY(2, "Security", "SR"),

  /**
	 * The '<em><b>Anti</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ANTI_VALUE
	 * @generated
	 * @ordered
	 */
  ANTI(3, "Anti", "AR"),

  /**
	 * The '<em><b>Quality Proposition</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #QUALITY_PROPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
  QUALITY_PROPOSITION(4, "QualityProposition", "Q"),

  /**
	 * The '<em><b>Argument</b></em>' literal object.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
  ARGUMENT(5, "Argument", "A");

  /**
	 * The '<em><b>Domain Assumption</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Domain Assumption</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #DOMAIN_ASSUMPTION
	 * @model name="DomainAssumption" literal="DA"
	 * @generated
	 * @ordered
	 */
  public static final int DOMAIN_ASSUMPTION_VALUE = 0;

  /**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model name="Function" literal="FR"
	 * @generated
	 * @ordered
	 */
  public static final int FUNCTION_VALUE = 1;

  /**
	 * The '<em><b>Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Security</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model name="Security" literal="SR"
	 * @generated
	 * @ordered
	 */
  public static final int SECURITY_VALUE = 2;

  /**
	 * The '<em><b>Anti</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Anti</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ANTI
	 * @model name="Anti" literal="AR"
	 * @generated
	 * @ordered
	 */
  public static final int ANTI_VALUE = 3;

  /**
	 * The '<em><b>Quality Proposition</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Quality Proposition</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #QUALITY_PROPOSITION
	 * @model name="QualityProposition" literal="Q"
	 * @generated
	 * @ordered
	 */
  public static final int QUALITY_PROPOSITION_VALUE = 4;

  /**
	 * The '<em><b>Argument</b></em>' literal value.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Argument</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @see #ARGUMENT
	 * @model name="Argument" literal="A"
	 * @generated
	 * @ordered
	 */
  public static final int ARGUMENT_VALUE = 5;

  /**
	 * An array of all the '<em><b>Proposition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final PropositionType[] VALUES_ARRAY =
    new PropositionType[] {
			DOMAIN_ASSUMPTION,
			FUNCTION,
			SECURITY,
			ANTI,
			QUALITY_PROPOSITION,
			ARGUMENT,
		};

  /**
	 * A public read-only list of all the '<em><b>Proposition Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final List<PropositionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
	 * Returns the '<em><b>Proposition Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PropositionType get(String literal)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropositionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Proposition Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PropositionType getByName(String name)
  {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PropositionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

  /**
	 * Returns the '<em><b>Proposition Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static PropositionType get(int value)
  {
		switch (value) {
			case DOMAIN_ASSUMPTION_VALUE: return DOMAIN_ASSUMPTION;
			case FUNCTION_VALUE: return FUNCTION;
			case SECURITY_VALUE: return SECURITY;
			case ANTI_VALUE: return ANTI;
			case QUALITY_PROPOSITION_VALUE: return QUALITY_PROPOSITION;
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
  private PropositionType(int value, String name, String literal)
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
  
} //PropositionType
