/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.ontology.util;

import eu.securechange.ontology.ontology.Action;
import eu.securechange.ontology.ontology.Activity;
import eu.securechange.ontology.ontology.Actor;
import eu.securechange.ontology.ontology.AntiRequirement;
import eu.securechange.ontology.ontology.Argues;
import eu.securechange.ontology.ontology.Argument;
import eu.securechange.ontology.ontology.Asset;
import eu.securechange.ontology.ontology.Attacker;
import eu.securechange.ontology.ontology.Attacks;
import eu.securechange.ontology.ontology.Consumes;
import eu.securechange.ontology.ontology.Contributes;
import eu.securechange.ontology.ontology.Damages;
import eu.securechange.ontology.ontology.Decomposes;
import eu.securechange.ontology.ontology.Delegates;
import eu.securechange.ontology.ontology.Does;
import eu.securechange.ontology.ontology.Domain;
import eu.securechange.ontology.ontology.DomainAssumption;
import eu.securechange.ontology.ontology.Entity;
import eu.securechange.ontology.ontology.Event;
import eu.securechange.ontology.ontology.Exploits;
import eu.securechange.ontology.ontology.Fulfils;
import eu.securechange.ontology.ontology.FunctionalRequirement;
import eu.securechange.ontology.ontology.HumanActivity;
import eu.securechange.ontology.ontology.NaturalProcess;
import eu.securechange.ontology.ontology.OntologyPackage;
import eu.securechange.ontology.ontology.Proposition;
import eu.securechange.ontology.ontology.Provides;
import eu.securechange.ontology.ontology.QualityRequirement;
import eu.securechange.ontology.ontology.Relationship;
import eu.securechange.ontology.ontology.Requirement;
import eu.securechange.ontology.ontology.Resource;
import eu.securechange.ontology.ontology.SecurityRequirement;
import eu.securechange.ontology.ontology.Situation;
import eu.securechange.ontology.ontology.Stakeholder;
import eu.securechange.ontology.ontology.Thing;
import eu.securechange.ontology.ontology.Trusts;
import eu.securechange.ontology.ontology.Wants;
import eu.securechange.ontology.ontology.World;

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
 * @see eu.securechange.ontology.ontology.OntologyPackage
 * @generated
 */
public class OntologySwitch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static OntologyPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OntologySwitch()
  {
		if (modelPackage == null) {
			modelPackage = OntologyPackage.eINSTANCE;
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
			case OntologyPackage.SITUATION: {
				Situation situation = (Situation)theEObject;
				T result = caseSituation(situation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.WORLD: {
				World world = (World)theEObject;
				T result = caseWorld(world);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.THING: {
				Thing thing = (Thing)theEObject;
				T result = caseThing(thing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseThing(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.OBJECT: {
				eu.securechange.ontology.ontology.Object object = (eu.securechange.ontology.ontology.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseThing(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DOMAIN: {
				Domain domain = (Domain)theEObject;
				T result = caseDomain(domain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.PROPOSITION: {
				Proposition proposition = (Proposition)theEObject;
				T result = caseProposition(proposition);
				if (result == null) result = caseObject(proposition);
				if (result == null) result = caseThing(proposition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseProposition(requirement);
				if (result == null) result = caseObject(requirement);
				if (result == null) result = caseThing(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DOMAIN_ASSUMPTION: {
				DomainAssumption domainAssumption = (DomainAssumption)theEObject;
				T result = caseDomainAssumption(domainAssumption);
				if (result == null) result = caseProposition(domainAssumption);
				if (result == null) result = caseObject(domainAssumption);
				if (result == null) result = caseThing(domainAssumption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.FUNCTIONAL_REQUIREMENT: {
				FunctionalRequirement functionalRequirement = (FunctionalRequirement)theEObject;
				T result = caseFunctionalRequirement(functionalRequirement);
				if (result == null) result = caseRequirement(functionalRequirement);
				if (result == null) result = caseProposition(functionalRequirement);
				if (result == null) result = caseObject(functionalRequirement);
				if (result == null) result = caseThing(functionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = caseRequirement(securityRequirement);
				if (result == null) result = caseProposition(securityRequirement);
				if (result == null) result = caseObject(securityRequirement);
				if (result == null) result = caseThing(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ANTI_REQUIREMENT: {
				AntiRequirement antiRequirement = (AntiRequirement)theEObject;
				T result = caseAntiRequirement(antiRequirement);
				if (result == null) result = caseRequirement(antiRequirement);
				if (result == null) result = caseProposition(antiRequirement);
				if (result == null) result = caseObject(antiRequirement);
				if (result == null) result = caseThing(antiRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.QUALITY_REQUIREMENT: {
				QualityRequirement qualityRequirement = (QualityRequirement)theEObject;
				T result = caseQualityRequirement(qualityRequirement);
				if (result == null) result = caseRequirement(qualityRequirement);
				if (result == null) result = caseProposition(qualityRequirement);
				if (result == null) result = caseObject(qualityRequirement);
				if (result == null) result = caseThing(qualityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ARGUMENT: {
				Argument argument = (Argument)theEObject;
				T result = caseArgument(argument);
				if (result == null) result = caseProposition(argument);
				if (result == null) result = caseObject(argument);
				if (result == null) result = caseThing(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = caseObject(entity);
				if (result == null) result = caseThing(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ACTOR: {
				Actor actor = (Actor)theEObject;
				T result = caseActor(actor);
				if (result == null) result = caseEntity(actor);
				if (result == null) result = caseObject(actor);
				if (result == null) result = caseThing(actor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseActor(stakeholder);
				if (result == null) result = caseEntity(stakeholder);
				if (result == null) result = caseObject(stakeholder);
				if (result == null) result = caseThing(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ATTACKER: {
				Attacker attacker = (Attacker)theEObject;
				T result = caseAttacker(attacker);
				if (result == null) result = caseActor(attacker);
				if (result == null) result = caseEntity(attacker);
				if (result == null) result = caseObject(attacker);
				if (result == null) result = caseThing(attacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.PROCESS: {
				eu.securechange.ontology.ontology.Process process = (eu.securechange.ontology.ontology.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseEntity(process);
				if (result == null) result = caseObject(process);
				if (result == null) result = caseThing(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.NATURAL_PROCESS: {
				NaturalProcess naturalProcess = (NaturalProcess)theEObject;
				T result = caseNaturalProcess(naturalProcess);
				if (result == null) result = caseProcess(naturalProcess);
				if (result == null) result = caseEntity(naturalProcess);
				if (result == null) result = caseObject(naturalProcess);
				if (result == null) result = caseThing(naturalProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.HUMAN_ACTIVITY: {
				HumanActivity humanActivity = (HumanActivity)theEObject;
				T result = caseHumanActivity(humanActivity);
				if (result == null) result = caseProcess(humanActivity);
				if (result == null) result = caseEntity(humanActivity);
				if (result == null) result = caseObject(humanActivity);
				if (result == null) result = caseThing(humanActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = caseEntity(resource);
				if (result == null) result = caseObject(resource);
				if (result == null) result = caseThing(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ASSET: {
				Asset asset = (Asset)theEObject;
				T result = caseAsset(asset);
				if (result == null) result = caseResource(asset);
				if (result == null) result = caseEntity(asset);
				if (result == null) result = caseObject(asset);
				if (result == null) result = caseThing(asset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.RELATIONSHIP: {
				Relationship relationship = (Relationship)theEObject;
				T result = caseRelationship(relationship);
				if (result == null) result = caseObject(relationship);
				if (result == null) result = caseThing(relationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.WANTS: {
				Wants wants = (Wants)theEObject;
				T result = caseWants(wants);
				if (result == null) result = caseRelationship(wants);
				if (result == null) result = caseObject(wants);
				if (result == null) result = caseThing(wants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DOES: {
				Does does = (Does)theEObject;
				T result = caseDoes(does);
				if (result == null) result = caseRelationship(does);
				if (result == null) result = caseObject(does);
				if (result == null) result = caseThing(does);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DECOMPOSES: {
				Decomposes decomposes = (Decomposes)theEObject;
				T result = caseDecomposes(decomposes);
				if (result == null) result = caseRelationship(decomposes);
				if (result == null) result = caseObject(decomposes);
				if (result == null) result = caseThing(decomposes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.TRUSTS: {
				Trusts trusts = (Trusts)theEObject;
				T result = caseTrusts(trusts);
				if (result == null) result = caseRelationship(trusts);
				if (result == null) result = caseObject(trusts);
				if (result == null) result = caseThing(trusts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DELEGATES: {
				Delegates delegates = (Delegates)theEObject;
				T result = caseDelegates(delegates);
				if (result == null) result = caseRelationship(delegates);
				if (result == null) result = caseObject(delegates);
				if (result == null) result = caseThing(delegates);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.CONTRIBUTES: {
				Contributes contributes = (Contributes)theEObject;
				T result = caseContributes(contributes);
				if (result == null) result = caseRelationship(contributes);
				if (result == null) result = caseObject(contributes);
				if (result == null) result = caseThing(contributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.FULFILS: {
				Fulfils fulfils = (Fulfils)theEObject;
				T result = caseFulfils(fulfils);
				if (result == null) result = caseRelationship(fulfils);
				if (result == null) result = caseObject(fulfils);
				if (result == null) result = caseThing(fulfils);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.PROVIDES: {
				Provides provides = (Provides)theEObject;
				T result = caseProvides(provides);
				if (result == null) result = caseRelationship(provides);
				if (result == null) result = caseObject(provides);
				if (result == null) result = caseThing(provides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.CONSUMES: {
				Consumes consumes = (Consumes)theEObject;
				T result = caseConsumes(consumes);
				if (result == null) result = caseRelationship(consumes);
				if (result == null) result = caseObject(consumes);
				if (result == null) result = caseThing(consumes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.EXPLOITS: {
				Exploits exploits = (Exploits)theEObject;
				T result = caseExploits(exploits);
				if (result == null) result = caseRelationship(exploits);
				if (result == null) result = caseObject(exploits);
				if (result == null) result = caseThing(exploits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.DAMAGES: {
				Damages damages = (Damages)theEObject;
				T result = caseDamages(damages);
				if (result == null) result = caseRelationship(damages);
				if (result == null) result = caseObject(damages);
				if (result == null) result = caseThing(damages);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ATTACKS: {
				Attacks attacks = (Attacks)theEObject;
				T result = caseAttacks(attacks);
				if (result == null) result = caseRelationship(attacks);
				if (result == null) result = caseObject(attacks);
				if (result == null) result = caseThing(attacks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ARGUES: {
				Argues argues = (Argues)theEObject;
				T result = caseArgues(argues);
				if (result == null) result = caseRelationship(argues);
				if (result == null) result = caseObject(argues);
				if (result == null) result = caseThing(argues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OntologyPackage.ACTIVITY: {
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
  public T caseObject(eu.securechange.ontology.ontology.Object object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRequirement(Requirement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Assumption</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDomainAssumption(DomainAssumption object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFunctionalRequirement(FunctionalRequirement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSecurityRequirement(SecurityRequirement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Anti Requirement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anti Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAntiRequirement(AntiRequirement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quality Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseQualityRequirement(QualityRequirement object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseArgument(Argument object)
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
  public T caseProcess(eu.securechange.ontology.ontology.Process object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Trusts</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trusts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTrusts(Trusts object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Delegates</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegates</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseDelegates(Delegates object)
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
	 * Returns the result of interpreting the object as an instance of '<em>Attacks</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAttacks(Attacks object)
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

} //OntologySwitch
