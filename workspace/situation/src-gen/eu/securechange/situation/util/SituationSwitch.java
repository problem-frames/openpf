/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.situation.util;

import eu.securechange.situation.Action;
import eu.securechange.situation.Activity;
import eu.securechange.situation.Actor;
import eu.securechange.situation.Argues;
import eu.securechange.situation.Asset;
import eu.securechange.situation.Attack;
import eu.securechange.situation.Attacker;
import eu.securechange.situation.BeliefWorld;
import eu.securechange.situation.Consumes;
import eu.securechange.situation.Contributes;
import eu.securechange.situation.Damages;
import eu.securechange.situation.Decomposes;
import eu.securechange.situation.Depends;
import eu.securechange.situation.Does;
import eu.securechange.situation.Domain;
import eu.securechange.situation.Entity;
import eu.securechange.situation.Event;
import eu.securechange.situation.Exploits;
import eu.securechange.situation.Fulfils;
import eu.securechange.situation.HumanActivity;
import eu.securechange.situation.NaturalProcess;
import eu.securechange.situation.PhysicalWorld;
import eu.securechange.situation.Proposition;
import eu.securechange.situation.Provides;
import eu.securechange.situation.Relationship;
import eu.securechange.situation.Resource;
import eu.securechange.situation.Situation;
import eu.securechange.situation.SituationPackage;
import eu.securechange.situation.Stakeholder;
import eu.securechange.situation.Thing;
import eu.securechange.situation.Wants;
import eu.securechange.situation.World;

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
 * @see eu.securechange.situation.SituationPackage
 * @generated
 */
public class SituationSwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SituationPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SituationSwitch()
  {
		if (modelPackage == null) {
			modelPackage = SituationPackage.eINSTANCE;
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  public T doSwitch(EObject theEObject)
  {
		return doSwitch(theEObject.eClass(), theEObject);
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case SituationPackage.SITUATION: {
				Situation situation = (Situation)theEObject;
				T result = caseSituation(situation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.WORLD: {
				World world = (World)theEObject;
				T result = caseWorld(world);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseThing(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.OBJECT: {
				eu.securechange.situation.Object object = (eu.securechange.situation.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseThing(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.PHYSICAL_WORLD: {
				PhysicalWorld physicalWorld = (PhysicalWorld)theEObject;
				T result = casePhysicalWorld(physicalWorld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.BELIEF_WORLD: {
				BeliefWorld beliefWorld = (BeliefWorld)theEObject;
				T result = caseBeliefWorld(beliefWorld);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.PROPOSITION: {
				Proposition proposition = (Proposition)theEObject;
				T result = caseProposition(proposition);
				if (result == null) result = caseObject(proposition);
				if (result == null) result = caseThing(proposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseObject(entity);
				if (result == null) result = caseThing(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseEntity(actor);
				if (result == null) result = caseObject(actor);
				if (result == null) result = caseThing(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseActor(stakeholder);
				if (result == null) result = caseEntity(stakeholder);
				if (result == null) result = caseObject(stakeholder);
				if (result == null) result = caseThing(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ATTACKER: {
				Attacker attacker = (Attacker)theEObject;
				T result = caseAttacker(attacker);
				if (result == null) result = caseActor(attacker);
				if (result == null) result = caseEntity(attacker);
				if (result == null) result = caseObject(attacker);
				if (result == null) result = caseThing(attacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.PROCESS: {
				eu.securechange.situation.Process process = (eu.securechange.situation.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseEntity(process);
				if (result == null) result = caseObject(process);
				if (result == null) result = caseThing(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.NATURAL_PROCESS: {
				NaturalProcess naturalProcess = (NaturalProcess)theEObject;
				T result = caseNaturalProcess(naturalProcess);
				if (result == null) result = caseProcess(naturalProcess);
				if (result == null) result = caseEntity(naturalProcess);
				if (result == null) result = caseObject(naturalProcess);
				if (result == null) result = caseThing(naturalProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.HUMAN_ACTIVITY: {
				HumanActivity humanActivity = (HumanActivity)theEObject;
				T result = caseHumanActivity(humanActivity);
				if (result == null) result = caseProcess(humanActivity);
				if (result == null) result = caseEntity(humanActivity);
				if (result == null) result = caseObject(humanActivity);
				if (result == null) result = caseThing(humanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseEntity(resource);
				if (result == null) result = caseObject(resource);
				if (result == null) result = caseThing(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseResource(asset);
				if (result == null) result = caseEntity(asset);
				if (result == null) result = caseObject(asset);
				if (result == null) result = caseThing(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseObject(relationship);
				if (result == null) result = caseThing(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.WANTS: {
				Wants wants = (Wants)theEObject;
				T result = caseWants(wants);
				if (result == null) result = caseRelationship(wants);
				if (result == null) result = caseObject(wants);
				if (result == null) result = caseThing(wants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.DOES: {
				Does does = (Does)theEObject;
				T result = caseDoes(does);
				if (result == null) result = caseRelationship(does);
				if (result == null) result = caseObject(does);
				if (result == null) result = caseThing(does);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.DECOMPOSES: {
				Decomposes decomposes = (Decomposes)theEObject;
				T result = caseDecomposes(decomposes);
				if (result == null) result = caseRelationship(decomposes);
				if (result == null) result = caseObject(decomposes);
				if (result == null) result = caseThing(decomposes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.CONTRIBUTES: {
				Contributes contributes = (Contributes)theEObject;
				T result = caseContributes(contributes);
				if (result == null) result = caseRelationship(contributes);
				if (result == null) result = caseObject(contributes);
				if (result == null) result = caseThing(contributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.FULFILS: {
				Fulfils fulfils = (Fulfils)theEObject;
				T result = caseFulfils(fulfils);
				if (result == null) result = caseRelationship(fulfils);
				if (result == null) result = caseObject(fulfils);
				if (result == null) result = caseThing(fulfils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.DEPENDS: {
				Depends depends = (Depends)theEObject;
				T result = caseDepends(depends);
				if (result == null) result = caseRelationship(depends);
				if (result == null) result = caseObject(depends);
				if (result == null) result = caseThing(depends);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.PROVIDES: {
				Provides provides = (Provides)theEObject;
				T result = caseProvides(provides);
				if (result == null) result = caseRelationship(provides);
				if (result == null) result = caseObject(provides);
				if (result == null) result = caseThing(provides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.CONSUMES: {
				Consumes consumes = (Consumes)theEObject;
				T result = caseConsumes(consumes);
				if (result == null) result = caseRelationship(consumes);
				if (result == null) result = caseObject(consumes);
				if (result == null) result = caseThing(consumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.EXPLOITS: {
				Exploits exploits = (Exploits)theEObject;
				T result = caseExploits(exploits);
				if (result == null) result = caseRelationship(exploits);
				if (result == null) result = caseObject(exploits);
				if (result == null) result = caseThing(exploits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.DAMAGES: {
				Damages damages = (Damages)theEObject;
				T result = caseDamages(damages);
				if (result == null) result = caseRelationship(damages);
				if (result == null) result = caseObject(damages);
				if (result == null) result = caseThing(damages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ATTACK: {
				Attack attack = (Attack)theEObject;
				T result = caseAttack(attack);
				if (result == null) result = caseRelationship(attack);
				if (result == null) result = caseObject(attack);
				if (result == null) result = caseThing(attack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ARGUES: {
				Argues argues = (Argues)theEObject;
				T result = caseArgues(argues);
				if (result == null) result = caseRelationship(argues);
				if (result == null) result = caseObject(argues);
				if (result == null) result = caseThing(argues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SituationPackage.ACTIVITY: {
				Activity activity = (Activity)theEObject;
				T result = caseActivity(activity);
				if (result == null) result = caseHumanActivity(activity);
				if (result == null) result = caseProcess(activity);
				if (result == null) result = caseEntity(activity);
				if (result == null) result = caseObject(activity);
				if (result == null) result = caseThing(activity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSituation(Situation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>World</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWorld(World object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseThing(Thing object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEvent(Event object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseObject(eu.securechange.situation.Object object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Physical World</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T casePhysicalWorld(PhysicalWorld object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Belief World</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Belief World</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBeliefWorld(BeliefWorld object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proposition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProposition(Proposition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEntity(Entity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDomain(Domain object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActor(Actor object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStakeholder(Stakeholder object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAttacker(Attacker object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcess(eu.securechange.situation.Process object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNaturalProcess(NaturalProcess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Human Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Human Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseHumanActivity(HumanActivity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAction(Action object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResource(Resource object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAsset(Asset object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRelationship(Relationship object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Wants</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseWants(Wants object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Does</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Does</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDoes(Does object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Decomposes</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decomposes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDecomposes(Decomposes object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Contributes</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContributes(Contributes object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfils</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfils</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFulfils(Fulfils object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Depends</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDepends(Depends object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProvides(Provides object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConsumes(Consumes object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Exploits</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exploits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExploits(Exploits object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Damages</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Damages</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDamages(Damages object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAttack(Attack object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Argues</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argues</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgues(Argues object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseActivity(Activity object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  public T defaultCase(EObject object)
  {
		return null;
	}

} //SituationSwitch
