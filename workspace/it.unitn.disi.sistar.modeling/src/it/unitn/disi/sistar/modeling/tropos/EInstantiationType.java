/**
 * <copyright>
 * </copyright>
 *
 * $Id: EInstantiationType.java,v 1.2 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EInstantiation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEInstantiationType()
 * @model
 * @generated
 */
public final class EInstantiationType extends AbstractEnumerator {
	/**
	 * The '<em><b>EXISTENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXISTENTIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXISTENTIAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXISTENTIAL = 0;

	/**
	 * The '<em><b>UNIVERSAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNIVERSAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNIVERSAL_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIVERSAL = 1;

	/**
	 * The '<em><b>EXISTENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXISTENTIAL
	 * @generated
	 * @ordered
	 */
	public static final EInstantiationType EXISTENTIAL_LITERAL = new EInstantiationType(EXISTENTIAL, "EXISTENTIAL", "EXISTENTIAL");

	/**
	 * The '<em><b>UNIVERSAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIVERSAL
	 * @generated
	 * @ordered
	 */
	public static final EInstantiationType UNIVERSAL_LITERAL = new EInstantiationType(UNIVERSAL, "UNIVERSAL", "UNIVERSAL");

	/**
	 * An array of all the '<em><b>EInstantiation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EInstantiationType[] VALUES_ARRAY =
		new EInstantiationType[] {
			EXISTENTIAL_LITERAL,
			UNIVERSAL_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EInstantiation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EInstantiation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInstantiationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInstantiationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInstantiation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInstantiationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EInstantiationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EInstantiation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EInstantiationType get(int value) {
		switch (value) {
			case EXISTENTIAL: return EXISTENTIAL_LITERAL;
			case UNIVERSAL: return UNIVERSAL_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EInstantiationType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EInstantiationType
