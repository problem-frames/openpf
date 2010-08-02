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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.securechange.situation.SituationPackage
 * @generated
 */
public class SituationAdapterFactory extends AdapterFactoryImpl
{
  /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static SituationPackage modelPackage;

  /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SituationAdapterFactory()
  {
		if (modelPackage == null) {
			modelPackage = SituationPackage.eINSTANCE;
		}
	}

  /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
  @Override
  public boolean isFactoryForType(Object object)
  {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

  /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SituationSwitch<Adapter> modelSwitch =
    new SituationSwitch<Adapter>() {
			@Override
			public Adapter caseSituation(Situation object) {
				return createSituationAdapter();
			}
			@Override
			public Adapter caseWorld(World object) {
				return createWorldAdapter();
			}
			@Override
			public Adapter caseThing(Thing object) {
				return createThingAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseObject(eu.securechange.situation.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter casePhysicalWorld(PhysicalWorld object) {
				return createPhysicalWorldAdapter();
			}
			@Override
			public Adapter caseBeliefWorld(BeliefWorld object) {
				return createBeliefWorldAdapter();
			}
			@Override
			public Adapter caseProposition(Proposition object) {
				return createPropositionAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseDomain(Domain object) {
				return createDomainAdapter();
			}
			@Override
			public Adapter caseActor(Actor object) {
				return createActorAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseAttacker(Attacker object) {
				return createAttackerAdapter();
			}
			@Override
			public Adapter caseProcess(eu.securechange.situation.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseNaturalProcess(NaturalProcess object) {
				return createNaturalProcessAdapter();
			}
			@Override
			public Adapter caseHumanActivity(HumanActivity object) {
				return createHumanActivityAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseWants(Wants object) {
				return createWantsAdapter();
			}
			@Override
			public Adapter caseDoes(Does object) {
				return createDoesAdapter();
			}
			@Override
			public Adapter caseDecomposes(Decomposes object) {
				return createDecomposesAdapter();
			}
			@Override
			public Adapter caseContributes(Contributes object) {
				return createContributesAdapter();
			}
			@Override
			public Adapter caseFulfils(Fulfils object) {
				return createFulfilsAdapter();
			}
			@Override
			public Adapter caseDepends(Depends object) {
				return createDependsAdapter();
			}
			@Override
			public Adapter caseProvides(Provides object) {
				return createProvidesAdapter();
			}
			@Override
			public Adapter caseConsumes(Consumes object) {
				return createConsumesAdapter();
			}
			@Override
			public Adapter caseExploits(Exploits object) {
				return createExploitsAdapter();
			}
			@Override
			public Adapter caseDamages(Damages object) {
				return createDamagesAdapter();
			}
			@Override
			public Adapter caseAttack(Attack object) {
				return createAttackAdapter();
			}
			@Override
			public Adapter caseArgues(Argues object) {
				return createArguesAdapter();
			}
			@Override
			public Adapter caseActivity(Activity object) {
				return createActivityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

  /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
  @Override
  public Adapter createAdapter(Notifier target)
  {
		return modelSwitch.doSwitch((EObject)target);
	}


  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Situation <em>Situation</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Situation
	 * @generated
	 */
  public Adapter createSituationAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.World <em>World</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.World
	 * @generated
	 */
  public Adapter createWorldAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Thing <em>Thing</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Thing
	 * @generated
	 */
  public Adapter createThingAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Event
	 * @generated
	 */
  public Adapter createEventAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Object
	 * @generated
	 */
  public Adapter createObjectAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.PhysicalWorld <em>Physical World</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.PhysicalWorld
	 * @generated
	 */
  public Adapter createPhysicalWorldAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.BeliefWorld <em>Belief World</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.BeliefWorld
	 * @generated
	 */
  public Adapter createBeliefWorldAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Proposition <em>Proposition</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Proposition
	 * @generated
	 */
  public Adapter createPropositionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Entity
	 * @generated
	 */
  public Adapter createEntityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Domain
	 * @generated
	 */
  public Adapter createDomainAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Actor
	 * @generated
	 */
  public Adapter createActorAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Stakeholder
	 * @generated
	 */
  public Adapter createStakeholderAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Attacker
	 * @generated
	 */
  public Adapter createAttackerAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Process
	 * @generated
	 */
  public Adapter createProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.NaturalProcess <em>Natural Process</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.NaturalProcess
	 * @generated
	 */
  public Adapter createNaturalProcessAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.HumanActivity <em>Human Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.HumanActivity
	 * @generated
	 */
  public Adapter createHumanActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Action
	 * @generated
	 */
  public Adapter createActionAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Resource
	 * @generated
	 */
  public Adapter createResourceAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Asset
	 * @generated
	 */
  public Adapter createAssetAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Relationship
	 * @generated
	 */
  public Adapter createRelationshipAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Wants <em>Wants</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Wants
	 * @generated
	 */
  public Adapter createWantsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Does <em>Does</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Does
	 * @generated
	 */
  public Adapter createDoesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Decomposes <em>Decomposes</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Decomposes
	 * @generated
	 */
  public Adapter createDecomposesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Contributes <em>Contributes</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Contributes
	 * @generated
	 */
  public Adapter createContributesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Fulfils <em>Fulfils</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Fulfils
	 * @generated
	 */
  public Adapter createFulfilsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Depends <em>Depends</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Depends
	 * @generated
	 */
  public Adapter createDependsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Provides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Provides
	 * @generated
	 */
  public Adapter createProvidesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Consumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Consumes
	 * @generated
	 */
  public Adapter createConsumesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Exploits <em>Exploits</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Exploits
	 * @generated
	 */
  public Adapter createExploitsAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Damages <em>Damages</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Damages
	 * @generated
	 */
  public Adapter createDamagesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Attack
	 * @generated
	 */
  public Adapter createAttackAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Argues <em>Argues</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Argues
	 * @generated
	 */
  public Adapter createArguesAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for an object of class '{@link eu.securechange.situation.Activity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see eu.securechange.situation.Activity
	 * @generated
	 */
  public Adapter createActivityAdapter()
  {
		return null;
	}

  /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
  public Adapter createEObjectAdapter()
  {
		return null;
	}

} //SituationAdapterFactory
