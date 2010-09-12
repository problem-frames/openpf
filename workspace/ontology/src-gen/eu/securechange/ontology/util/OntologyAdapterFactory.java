/**
 * <copyright>
 * </copyright>
 *
 */
package eu.securechange.ontology.util;

import eu.securechange.ontology.Action;
import eu.securechange.ontology.Activity;
import eu.securechange.ontology.Actor;
import eu.securechange.ontology.Argues;
import eu.securechange.ontology.Asset;
import eu.securechange.ontology.Attacker;
import eu.securechange.ontology.Attacks;
import eu.securechange.ontology.BeliefWorld;
import eu.securechange.ontology.Consumes;
import eu.securechange.ontology.Contributes;
import eu.securechange.ontology.Damages;
import eu.securechange.ontology.Decomposes;
import eu.securechange.ontology.Delegates;
import eu.securechange.ontology.Does;
import eu.securechange.ontology.Domain;
import eu.securechange.ontology.Entity;
import eu.securechange.ontology.Event;
import eu.securechange.ontology.Exploits;
import eu.securechange.ontology.Fulfils;
import eu.securechange.ontology.HumanActivity;
import eu.securechange.ontology.NaturalProcess;
import eu.securechange.ontology.OntologyPackage;
import eu.securechange.ontology.PhysicalWorld;
import eu.securechange.ontology.Proposition;
import eu.securechange.ontology.Provides;
import eu.securechange.ontology.Relationship;
import eu.securechange.ontology.Resource;
import eu.securechange.ontology.Situation;
import eu.securechange.ontology.Stakeholder;
import eu.securechange.ontology.Thing;
import eu.securechange.ontology.Trusts;
import eu.securechange.ontology.Wants;
import eu.securechange.ontology.World;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see eu.securechange.ontology.OntologyPackage
 * @generated
 */
public class OntologyAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OntologyPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OntologyAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OntologyPackage.eINSTANCE;
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
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected OntologySwitch<Adapter> modelSwitch =
    new OntologySwitch<Adapter>()
    {
      @Override
      public Adapter caseSituation(Situation object)
      {
        return createSituationAdapter();
      }
      @Override
      public Adapter caseWorld(World object)
      {
        return createWorldAdapter();
      }
      @Override
      public Adapter caseThing(Thing object)
      {
        return createThingAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseObject(eu.securechange.ontology.Object object)
      {
        return createObjectAdapter();
      }
      @Override
      public Adapter casePhysicalWorld(PhysicalWorld object)
      {
        return createPhysicalWorldAdapter();
      }
      @Override
      public Adapter caseBeliefWorld(BeliefWorld object)
      {
        return createBeliefWorldAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseProposition(Proposition object)
      {
        return createPropositionAdapter();
      }
      @Override
      public Adapter caseEntity(Entity object)
      {
        return createEntityAdapter();
      }
      @Override
      public Adapter caseActor(Actor object)
      {
        return createActorAdapter();
      }
      @Override
      public Adapter caseStakeholder(Stakeholder object)
      {
        return createStakeholderAdapter();
      }
      @Override
      public Adapter caseAttacker(Attacker object)
      {
        return createAttackerAdapter();
      }
      @Override
      public Adapter caseProcess(eu.securechange.ontology.Process object)
      {
        return createProcessAdapter();
      }
      @Override
      public Adapter caseNaturalProcess(NaturalProcess object)
      {
        return createNaturalProcessAdapter();
      }
      @Override
      public Adapter caseHumanActivity(HumanActivity object)
      {
        return createHumanActivityAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseResource(Resource object)
      {
        return createResourceAdapter();
      }
      @Override
      public Adapter caseAsset(Asset object)
      {
        return createAssetAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseWants(Wants object)
      {
        return createWantsAdapter();
      }
      @Override
      public Adapter caseDoes(Does object)
      {
        return createDoesAdapter();
      }
      @Override
      public Adapter caseDecomposes(Decomposes object)
      {
        return createDecomposesAdapter();
      }
      @Override
      public Adapter caseTrusts(Trusts object)
      {
        return createTrustsAdapter();
      }
      @Override
      public Adapter caseDelegates(Delegates object)
      {
        return createDelegatesAdapter();
      }
      @Override
      public Adapter caseContributes(Contributes object)
      {
        return createContributesAdapter();
      }
      @Override
      public Adapter caseFulfils(Fulfils object)
      {
        return createFulfilsAdapter();
      }
      @Override
      public Adapter caseProvides(Provides object)
      {
        return createProvidesAdapter();
      }
      @Override
      public Adapter caseConsumes(Consumes object)
      {
        return createConsumesAdapter();
      }
      @Override
      public Adapter caseExploits(Exploits object)
      {
        return createExploitsAdapter();
      }
      @Override
      public Adapter caseDamages(Damages object)
      {
        return createDamagesAdapter();
      }
      @Override
      public Adapter caseAttacks(Attacks object)
      {
        return createAttacksAdapter();
      }
      @Override
      public Adapter caseArgues(Argues object)
      {
        return createArguesAdapter();
      }
      @Override
      public Adapter caseActivity(Activity object)
      {
        return createActivityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Situation <em>Situation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Situation
   * @generated
   */
  public Adapter createSituationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.World <em>World</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.World
   * @generated
   */
  public Adapter createWorldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Thing
   * @generated
   */
  public Adapter createThingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Object
   * @generated
   */
  public Adapter createObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.PhysicalWorld <em>Physical World</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.PhysicalWorld
   * @generated
   */
  public Adapter createPhysicalWorldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.BeliefWorld <em>Belief World</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.BeliefWorld
   * @generated
   */
  public Adapter createBeliefWorldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Proposition <em>Proposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Proposition
   * @generated
   */
  public Adapter createPropositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Entity
   * @generated
   */
  public Adapter createEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Actor <em>Actor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Actor
   * @generated
   */
  public Adapter createActorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Attacker <em>Attacker</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Attacker
   * @generated
   */
  public Adapter createAttackerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Process
   * @generated
   */
  public Adapter createProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.NaturalProcess <em>Natural Process</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.NaturalProcess
   * @generated
   */
  public Adapter createNaturalProcessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.HumanActivity <em>Human Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.HumanActivity
   * @generated
   */
  public Adapter createHumanActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Resource <em>Resource</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Resource
   * @generated
   */
  public Adapter createResourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Asset <em>Asset</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Asset
   * @generated
   */
  public Adapter createAssetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Wants <em>Wants</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Wants
   * @generated
   */
  public Adapter createWantsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Does <em>Does</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Does
   * @generated
   */
  public Adapter createDoesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Decomposes <em>Decomposes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Decomposes
   * @generated
   */
  public Adapter createDecomposesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Trusts <em>Trusts</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Trusts
   * @generated
   */
  public Adapter createTrustsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Delegates <em>Delegates</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Delegates
   * @generated
   */
  public Adapter createDelegatesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Contributes <em>Contributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Contributes
   * @generated
   */
  public Adapter createContributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Fulfils <em>Fulfils</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Fulfils
   * @generated
   */
  public Adapter createFulfilsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Provides <em>Provides</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Provides
   * @generated
   */
  public Adapter createProvidesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Consumes <em>Consumes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Consumes
   * @generated
   */
  public Adapter createConsumesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Exploits <em>Exploits</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Exploits
   * @generated
   */
  public Adapter createExploitsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Damages <em>Damages</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Damages
   * @generated
   */
  public Adapter createDamagesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Attacks <em>Attacks</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Attacks
   * @generated
   */
  public Adapter createAttacksAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Argues <em>Argues</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Argues
   * @generated
   */
  public Adapter createArguesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link eu.securechange.ontology.Activity <em>Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see eu.securechange.ontology.Activity
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

} //OntologyAdapterFactory
