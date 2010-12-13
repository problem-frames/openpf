/**
 * <copyright>
 * </copyright>
 *
 * $Id: TroposSwitch.java,v 1.3 2007/07/24 09:08:24 swferry Exp $
 */
package it.unitn.disi.sistar.modeling.tropos.util;

import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.Relation;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.modeling.tropos.TroposPackage;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.unitn.disi.sistar.modeling.tropos.TroposPackage
 * @generated
 */
public class TroposSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TroposPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TroposSwitch() {
		if (modelPackage == null) {
			modelPackage = TroposPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TroposPackage.DIAGRAM: {
				Diagram diagram = (Diagram)theEObject;
				Object result = caseDiagram(diagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.GRAPHICAL_OBJECT: {
				GraphicalObject graphicalObject = (GraphicalObject)theEObject;
				Object result = caseGraphicalObject(graphicalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				Object result = caseActor(actor);
				if (result == null) result = caseGraphicalObject(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.SERVICE: {
				Service service = (Service)theEObject;
				Object result = caseService(service);
				if (result == null) result = caseGraphicalObject(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.RELATION: {
				Relation relation = (Relation)theEObject;
				Object result = caseRelation(relation);
				if (result == null) result = caseGraphicalObject(relation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.ASSOCIATION: {
				Association association = (Association)theEObject;
				Object result = caseAssociation(association);
				if (result == null) result = caseRelation(association);
				if (result == null) result = caseGraphicalObject(association);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				Object result = caseComposition(composition);
				if (result == null) result = caseRelation(composition);
				if (result == null) result = caseGraphicalObject(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.CONTRIBUTION: {
				Contribution contribution = (Contribution)theEObject;
				Object result = caseContribution(contribution);
				if (result == null) result = caseRelation(contribution);
				if (result == null) result = caseGraphicalObject(contribution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.DEPENDENCY: {
				Dependency dependency = (Dependency)theEObject;
				Object result = caseDependency(dependency);
				if (result == null) result = caseRelation(dependency);
				if (result == null) result = caseGraphicalObject(dependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.OWNERSHIP: {
				Ownership ownership = (Ownership)theEObject;
				Object result = caseOwnership(ownership);
				if (result == null) result = caseRelation(ownership);
				if (result == null) result = caseGraphicalObject(ownership);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.MEANS_END: {
				MeansEnd meansEnd = (MeansEnd)theEObject;
				Object result = caseMeansEnd(meansEnd);
				if (result == null) result = caseRelation(meansEnd);
				if (result == null) result = caseGraphicalObject(meansEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TroposPackage.CUSTOM_RELATION: {
				CustomRelation customRelation = (CustomRelation)theEObject;
				Object result = caseCustomRelation(customRelation);
				if (result == null) result = caseRelation(customRelation);
				if (result == null) result = caseGraphicalObject(customRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDiagram(Diagram object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Graphical Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Graphical Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseGraphicalObject(GraphicalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseActor(Actor object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseRelation(Relation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Contribution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContribution(Contribution object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Ownership</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Ownership</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOwnership(Ownership object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Means End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Means End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseMeansEnd(MeansEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Custom Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Custom Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseCustomRelation(CustomRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //TroposSwitch
