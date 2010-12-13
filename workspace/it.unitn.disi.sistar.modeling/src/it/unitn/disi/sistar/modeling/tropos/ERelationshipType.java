/**
 * <copyright>
 * </copyright>
 *
 * $Id: ERelationshipType.java,v 1.1.1.1 2007/05/17 22:03:45 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ERelationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getERelationshipType()
 * @model
 * @generated
 */
public final class ERelationshipType extends AbstractEnumerator {
	/**
	 * The '<em><b>CONTRIBUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTRIBUTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTRIBUTION = 0;

	/**
	 * The '<em><b>IMPACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMPACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMPACT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMPACT = 1;

	/**
	 * The '<em><b>ALLEVIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALLEVIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLEVIATION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALLEVIATION = 2;

	/**
	 * The '<em><b>CONTRIBUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTRIBUTION
	 * @generated
	 * @ordered
	 */
	public static final ERelationshipType CONTRIBUTION_LITERAL = new ERelationshipType(CONTRIBUTION, "CONTRIBUTION", "CONTRIBUTION");

	/**
	 * The '<em><b>IMPACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPACT
	 * @generated
	 * @ordered
	 */
	public static final ERelationshipType IMPACT_LITERAL = new ERelationshipType(IMPACT, "IMPACT", "IMPACT");

	/**
	 * The '<em><b>ALLEVIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLEVIATION
	 * @generated
	 * @ordered
	 */
	public static final ERelationshipType ALLEVIATION_LITERAL = new ERelationshipType(ALLEVIATION, "ALLEVIATION", "ALLEVIATION");

	/**
	 * An array of all the '<em><b>ERelationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ERelationshipType[] VALUES_ARRAY =
		new ERelationshipType[] {
			CONTRIBUTION_LITERAL,
			IMPACT_LITERAL,
			ALLEVIATION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>ERelationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ERelationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERelationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ERelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ERelationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ERelationshipType get(int value) {
		switch (value) {
			case CONTRIBUTION: return CONTRIBUTION_LITERAL;
			case IMPACT: return IMPACT_LITERAL;
			case ALLEVIATION: return ALLEVIATION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ERelationshipType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //ERelationshipType
