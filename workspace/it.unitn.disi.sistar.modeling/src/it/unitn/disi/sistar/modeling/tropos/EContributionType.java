/**
 * <copyright>
 * </copyright>
 *
 * $Id: EContributionType.java,v 1.1.1.1 2007/04/06 12:51:19 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EContribution Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEContributionType()
 * @model
 * @generated
 */
public final class EContributionType extends AbstractEnumerator {
	/**
	 * The '<em><b>PP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PP_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PP = 0;

	/**
	 * The '<em><b>P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #P_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int P = 1;

	/**
	 * The '<em><b>M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #M_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int M = 2;

	/**
	 * The '<em><b>MM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MM_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MM = 3;

	/**
	 * The '<em><b>PP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PP
	 * @generated NOT
	 * @ordered
	 */
	public static final EContributionType PP_LITERAL = new EContributionType(PP, "PP", "PP");

	/**
	 * The '<em><b>P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #P
	 * @generated NOT
	 * @ordered
	 */
	public static final EContributionType P_LITERAL = new EContributionType(P, "P", "P");

	/**
	 * The '<em><b>M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #M
	 * @generated NOT
	 * @ordered
	 */
	public static final EContributionType M_LITERAL = new EContributionType(M, "M", "M");

	/**
	 * The '<em><b>MM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MM
	 * @generated NOT
	 * @ordered
	 */
	public static final EContributionType MM_LITERAL = new EContributionType(MM, "MM", "MM");

	/**
	 * An array of all the '<em><b>EContribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EContributionType[] VALUES_ARRAY =
		new EContributionType[] {
			PP_LITERAL,
			P_LITERAL,
			M_LITERAL,
			MM_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EContribution Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EContribution Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EContributionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EContributionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EContribution Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EContributionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EContributionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EContribution Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EContributionType get(int value) {
		switch (value) {
			case PP: return PP_LITERAL;
			case P: return P_LITERAL;
			case M: return M_LITERAL;
			case MM: return MM_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EContributionType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EContributionType
