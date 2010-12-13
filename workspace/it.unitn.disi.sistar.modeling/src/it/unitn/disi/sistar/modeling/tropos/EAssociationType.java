/**
 * <copyright>
 * </copyright>
 *
 * $Id: EAssociationType.java,v 1.1.1.1 2007/06/26 10:24:20 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EAssociation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEAssociationType()
 * @model
 * @generated
 */
public final class EAssociationType extends AbstractEnumerator {
	/**
	 * The '<em><b>IS PART OF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS PART OF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_PART_OF = 0;

	/**
	 * The '<em><b>IS A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IS A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IS_A_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IS_A = 1;

	/**
	 * The '<em><b>PLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLAY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PLAY = 2;

	/**
	 * The '<em><b>COVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COVER_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COVER = 3;

	/**
	 * The '<em><b>OCCUPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OCCUPY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCUPY_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OCCUPY = 4;

	/**
	 * The '<em><b>SUPERVISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COVER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERVISE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPERVISE = 5;

	/**
	 * The '<em><b>IS PART OF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_PART_OF
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType IS_PART_OF_LITERAL = new EAssociationType(IS_PART_OF, "IS_PART_OF", "IS_PART_OF");

	/**
	 * The '<em><b>IS A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IS_A
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType IS_A_LITERAL = new EAssociationType(IS_A, "IS_A", "IS_A");

	/**
	 * The '<em><b>PLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLAY
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType PLAY_LITERAL = new EAssociationType(PLAY, "PLAY", "PLAY");

	/**
	 * The '<em><b>COVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COVER
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType COVER_LITERAL = new EAssociationType(COVER, "COVER", "COVER");

	/**
	 * The '<em><b>OCCUPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCUPY
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType OCCUPY_LITERAL = new EAssociationType(OCCUPY, "OCCUPY", "OCCUPY");

	/**
	 * The '<em><b>SUPERVISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERVISE
	 * @generated
	 * @ordered
	 */
	public static final EAssociationType SUPERVISE_LITERAL = new EAssociationType(SUPERVISE, "SUPERVISE", "SUPERVISE");

	/**
	 * An array of all the '<em><b>EAssociation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EAssociationType[] VALUES_ARRAY =
		new EAssociationType[] {
			IS_PART_OF_LITERAL,
			IS_A_LITERAL,
			PLAY_LITERAL,
			COVER_LITERAL,
			OCCUPY_LITERAL,
			SUPERVISE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EAssociation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EAssociation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EAssociationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EAssociationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EAssociation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EAssociationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EAssociationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EAssociation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public static EAssociationType get(int value) {
		switch (value) {
			case IS_PART_OF: return IS_PART_OF_LITERAL;
			case IS_A: return IS_A_LITERAL;
			case PLAY: return PLAY_LITERAL;
		//	case COVER: return COVER_LITERAL;
		//	case OCCUPY: return OCCUPY_LITERAL;
			case SUPERVISE: return SUPERVISE_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EAssociationType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EAssociationType
