/**
 * <copyright>
 * </copyright>
 *
 * $Id: EActorType.java,v 1.1.1.1 2007/03/19 10:37:30 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EActor Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage#getEActorType()
 * @model
 * @generated
 */
public final class EActorType extends AbstractEnumerator {
	/**
	 * The '<em><b>ACTOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTOR_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACTOR = 0;

	/**
	 * The '<em><b>AGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ACTOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENT = 1;

	/**
	 * The '<em><b>ROLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROLE_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROLE = 2;

	/**
	 * The '<em><b>POSITION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSITION_LITERAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSITION = 3;

	/**
	 * The '<em><b>ACTOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTOR
	 * @generated
	 * @ordered
	 */
	public static final EActorType ACTOR_LITERAL = new EActorType(ACTOR, "ACTOR", "ACTOR");

	/**
	 * The '<em><b>AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSITION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT
	 * @generated
	 * @ordered
	 */
	public static final EActorType AGENT_LITERAL = new EActorType(AGENT, "AGENT", "AGENT");

	/**
	 * The '<em><b>ROLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROLE
	 * @generated
	 * @ordered
	 */
	public static final EActorType ROLE_LITERAL = new EActorType(ROLE, "ROLE", "ROLE");

	/**
	 * The '<em><b>POSITION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSITION
	 * @generated
	 * @ordered
	 */
	public static final EActorType POSITION_LITERAL = new EActorType(POSITION, "POSITION", "POSITION");

	/**
	 * An array of all the '<em><b>EActor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EActorType[] VALUES_ARRAY =
		new EActorType[] {
			ACTOR_LITERAL,
			AGENT_LITERAL,
			ROLE_LITERAL,
			POSITION_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>EActor Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>EActor Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EActorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EActorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EActor Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EActorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EActorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>EActor Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EActorType get(int value) {
		switch (value) {
			case ACTOR: return ACTOR_LITERAL;
			case AGENT: return AGENT_LITERAL;
			case ROLE: return ROLE_LITERAL;
			case POSITION: return POSITION_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EActorType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //EActorType
