/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package eu.securechange.ontology.ontology.provider;

import eu.securechange.ontology.ontology.util.OntologyAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OntologyItemProviderAdapterFactory extends OntologyAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OntologyItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Situation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SituationItemProvider situationItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Situation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSituationAdapter() {
		if (situationItemProvider == null) {
			situationItemProvider = new SituationItemProvider(this);
		}

		return situationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.World} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldItemProvider worldItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.World}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWorldAdapter() {
		if (worldItemProvider == null) {
			worldItemProvider = new WorldItemProvider(this);
		}

		return worldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Thing} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThingItemProvider thingItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Thing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createThingAdapter() {
		if (thingItemProvider == null) {
			thingItemProvider = new ThingItemProvider(this);
		}

		return thingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Event} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventItemProvider eventItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEventAdapter() {
		if (eventItemProvider == null) {
			eventItemProvider = new EventItemProvider(this);
		}

		return eventItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Object} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectItemProvider objectItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createObjectAdapter() {
		if (objectItemProvider == null) {
			objectItemProvider = new ObjectItemProvider(this);
		}

		return objectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Domain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainItemProvider domainItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Domain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAdapter() {
		if (domainItemProvider == null) {
			domainItemProvider = new DomainItemProvider(this);
		}

		return domainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Proposition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropositionItemProvider propositionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Proposition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropositionAdapter() {
		if (propositionItemProvider == null) {
			propositionItemProvider = new PropositionItemProvider(this);
		}

		return propositionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Requirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementItemProvider requirementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequirementAdapter() {
		if (requirementItemProvider == null) {
			requirementItemProvider = new RequirementItemProvider(this);
		}

		return requirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.DomainAssumption} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainAssumptionItemProvider domainAssumptionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.DomainAssumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainAssumptionAdapter() {
		if (domainAssumptionItemProvider == null) {
			domainAssumptionItemProvider = new DomainAssumptionItemProvider(this);
		}

		return domainAssumptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.FunctionalRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalRequirementItemProvider functionalRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.FunctionalRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFunctionalRequirementAdapter() {
		if (functionalRequirementItemProvider == null) {
			functionalRequirementItemProvider = new FunctionalRequirementItemProvider(this);
		}

		return functionalRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.SecurityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementItemProvider securityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSecurityRequirementAdapter() {
		if (securityRequirementItemProvider == null) {
			securityRequirementItemProvider = new SecurityRequirementItemProvider(this);
		}

		return securityRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.AntiRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AntiRequirementItemProvider antiRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.AntiRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAntiRequirementAdapter() {
		if (antiRequirementItemProvider == null) {
			antiRequirementItemProvider = new AntiRequirementItemProvider(this);
		}

		return antiRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.QualityRequirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityRequirementItemProvider qualityRequirementItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.QualityRequirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQualityRequirementAdapter() {
		if (qualityRequirementItemProvider == null) {
			qualityRequirementItemProvider = new QualityRequirementItemProvider(this);
		}

		return qualityRequirementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Argument} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgumentItemProvider argumentItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Argument}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArgumentAdapter() {
		if (argumentItemProvider == null) {
			argumentItemProvider = new ArgumentItemProvider(this);
		}

		return argumentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Actor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorItemProvider actorItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActorAdapter() {
		if (actorItemProvider == null) {
			actorItemProvider = new ActorItemProvider(this);
		}

		return actorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Stakeholder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderItemProvider stakeholderItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStakeholderAdapter() {
		if (stakeholderItemProvider == null) {
			stakeholderItemProvider = new StakeholderItemProvider(this);
		}

		return stakeholderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Attacker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerItemProvider attackerItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Attacker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttackerAdapter() {
		if (attackerItemProvider == null) {
			attackerItemProvider = new AttackerItemProvider(this);
		}

		return attackerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Process} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessItemProvider processItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Process}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessAdapter() {
		if (processItemProvider == null) {
			processItemProvider = new ProcessItemProvider(this);
		}

		return processItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.NaturalProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NaturalProcessItemProvider naturalProcessItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.NaturalProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNaturalProcessAdapter() {
		if (naturalProcessItemProvider == null) {
			naturalProcessItemProvider = new NaturalProcessItemProvider(this);
		}

		return naturalProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.HumanActivity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HumanActivityItemProvider humanActivityItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.HumanActivity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createHumanActivityAdapter() {
		if (humanActivityItemProvider == null) {
			humanActivityItemProvider = new HumanActivityItemProvider(this);
		}

		return humanActivityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Action} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionItemProvider actionItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionItemProvider(this);
		}

		return actionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Asset} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssetItemProvider assetItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssetAdapter() {
		if (assetItemProvider == null) {
			assetItemProvider = new AssetItemProvider(this);
		}

		return assetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Relationship} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipItemProvider relationshipItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Relationship}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationshipAdapter() {
		if (relationshipItemProvider == null) {
			relationshipItemProvider = new RelationshipItemProvider(this);
		}

		return relationshipItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Wants} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WantsItemProvider wantsItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Wants}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWantsAdapter() {
		if (wantsItemProvider == null) {
			wantsItemProvider = new WantsItemProvider(this);
		}

		return wantsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Does} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoesItemProvider doesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Does}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDoesAdapter() {
		if (doesItemProvider == null) {
			doesItemProvider = new DoesItemProvider(this);
		}

		return doesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Decomposes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecomposesItemProvider decomposesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Decomposes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDecomposesAdapter() {
		if (decomposesItemProvider == null) {
			decomposesItemProvider = new DecomposesItemProvider(this);
		}

		return decomposesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Trusts} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrustsItemProvider trustsItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Trusts}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTrustsAdapter() {
		if (trustsItemProvider == null) {
			trustsItemProvider = new TrustsItemProvider(this);
		}

		return trustsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Delegates} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegatesItemProvider delegatesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Delegates}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDelegatesAdapter() {
		if (delegatesItemProvider == null) {
			delegatesItemProvider = new DelegatesItemProvider(this);
		}

		return delegatesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Contributes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributesItemProvider contributesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Contributes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createContributesAdapter() {
		if (contributesItemProvider == null) {
			contributesItemProvider = new ContributesItemProvider(this);
		}

		return contributesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Fulfils} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfilsItemProvider fulfilsItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Fulfils}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFulfilsAdapter() {
		if (fulfilsItemProvider == null) {
			fulfilsItemProvider = new FulfilsItemProvider(this);
		}

		return fulfilsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Provides} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidesItemProvider providesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Provides}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidesAdapter() {
		if (providesItemProvider == null) {
			providesItemProvider = new ProvidesItemProvider(this);
		}

		return providesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Consumes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumesItemProvider consumesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Consumes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConsumesAdapter() {
		if (consumesItemProvider == null) {
			consumesItemProvider = new ConsumesItemProvider(this);
		}

		return consumesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Exploits} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExploitsItemProvider exploitsItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Exploits}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExploitsAdapter() {
		if (exploitsItemProvider == null) {
			exploitsItemProvider = new ExploitsItemProvider(this);
		}

		return exploitsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Damages} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DamagesItemProvider damagesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Damages}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDamagesAdapter() {
		if (damagesItemProvider == null) {
			damagesItemProvider = new DamagesItemProvider(this);
		}

		return damagesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Attacks} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttacksItemProvider attacksItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Attacks}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttacksAdapter() {
		if (attacksItemProvider == null) {
			attacksItemProvider = new AttacksItemProvider(this);
		}

		return attacksItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Argues} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArguesItemProvider arguesItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Argues}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArguesAdapter() {
		if (arguesItemProvider == null) {
			arguesItemProvider = new ArguesItemProvider(this);
		}

		return arguesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link eu.securechange.ontology.ontology.Activity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityItemProvider activityItemProvider;

	/**
	 * This creates an adapter for a {@link eu.securechange.ontology.ontology.Activity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createActivityAdapter() {
		if (activityItemProvider == null) {
			activityItemProvider = new ActivityItemProvider(this);
		}

		return activityItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (situationItemProvider != null) situationItemProvider.dispose();
		if (worldItemProvider != null) worldItemProvider.dispose();
		if (thingItemProvider != null) thingItemProvider.dispose();
		if (eventItemProvider != null) eventItemProvider.dispose();
		if (objectItemProvider != null) objectItemProvider.dispose();
		if (domainItemProvider != null) domainItemProvider.dispose();
		if (propositionItemProvider != null) propositionItemProvider.dispose();
		if (requirementItemProvider != null) requirementItemProvider.dispose();
		if (domainAssumptionItemProvider != null) domainAssumptionItemProvider.dispose();
		if (functionalRequirementItemProvider != null) functionalRequirementItemProvider.dispose();
		if (securityRequirementItemProvider != null) securityRequirementItemProvider.dispose();
		if (antiRequirementItemProvider != null) antiRequirementItemProvider.dispose();
		if (qualityRequirementItemProvider != null) qualityRequirementItemProvider.dispose();
		if (argumentItemProvider != null) argumentItemProvider.dispose();
		if (entityItemProvider != null) entityItemProvider.dispose();
		if (actorItemProvider != null) actorItemProvider.dispose();
		if (stakeholderItemProvider != null) stakeholderItemProvider.dispose();
		if (attackerItemProvider != null) attackerItemProvider.dispose();
		if (processItemProvider != null) processItemProvider.dispose();
		if (naturalProcessItemProvider != null) naturalProcessItemProvider.dispose();
		if (humanActivityItemProvider != null) humanActivityItemProvider.dispose();
		if (actionItemProvider != null) actionItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (assetItemProvider != null) assetItemProvider.dispose();
		if (relationshipItemProvider != null) relationshipItemProvider.dispose();
		if (wantsItemProvider != null) wantsItemProvider.dispose();
		if (doesItemProvider != null) doesItemProvider.dispose();
		if (decomposesItemProvider != null) decomposesItemProvider.dispose();
		if (trustsItemProvider != null) trustsItemProvider.dispose();
		if (delegatesItemProvider != null) delegatesItemProvider.dispose();
		if (contributesItemProvider != null) contributesItemProvider.dispose();
		if (fulfilsItemProvider != null) fulfilsItemProvider.dispose();
		if (providesItemProvider != null) providesItemProvider.dispose();
		if (consumesItemProvider != null) consumesItemProvider.dispose();
		if (exploitsItemProvider != null) exploitsItemProvider.dispose();
		if (damagesItemProvider != null) damagesItemProvider.dispose();
		if (attacksItemProvider != null) attacksItemProvider.dispose();
		if (arguesItemProvider != null) arguesItemProvider.dispose();
		if (activityItemProvider != null) activityItemProvider.dispose();
	}

}