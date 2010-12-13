/**
 * <copyright>
 * </copyright>
 *
 * $Id: EOwnershipType.java,v 1.1.1.1 2007/02/24 23:59:03 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EOwnership Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEOwnershipType()
 * @model
 * @generated
 */
public final class EOwnershipType extends AbstractEnumerator {
	/**
	 * The '<em><b>OWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OWN_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OWN = 0;

	/**
	 * The '<em><b>REQUEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REQUEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST = 1;

	/**
	 * The '<em><b>PROVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROVIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDE = 2;

	/**
	 * The '<em><b>OWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OWN
	 * @generated
	 * @ordered
	 */
	public static final EOwnershipType OWN_LITERAL = new EOwnershipType(OWN, "OWN", "OWN");

	/**
	 * The '<em><b>REQUEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST
	 * @generated
	 * @ordered
	 */
	public static final EOwnershipType REQUEST_LITERAL = new EOwnershipType(REQUEST, "REQUEST", "REQUEST");

	/**
	 * The '<em><b>PROVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDE
	 * @generated
	 * @ordered
	 */
	public static final EOwnershipType PROVIDE_LITERAL = new EOwnershipType(PROVIDE, "PROVIDE", "PROVIDE");

	/**
	 * An array of all the '<em><b>EOwnership Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EOwnershipType[] VALUES_ARRAY =
		new EOwnershipType[] {
			OWN_LITERAL,
			REQUEST_LITERAL,
			PROVIDE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EOwnership Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EOwnership Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EOwnershipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOwnershipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOwnership Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EOwnershipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EOwnershipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EOwnership Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EOwnershipType get(int value) {
		switch (value) {
			case OWN: return OWN_LITERAL;
			case REQUEST: return REQUEST_LITERAL;
			case PROVIDE: return PROVIDE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EOwnershipType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EOwnershipType
