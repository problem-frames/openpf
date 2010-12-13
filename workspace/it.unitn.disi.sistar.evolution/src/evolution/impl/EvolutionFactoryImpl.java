/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package evolution.impl;

import evolution.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EvolutionFactoryImpl extends EFactoryImpl implements EvolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvolutionFactory init() {
		try {
			EvolutionFactory theEvolutionFactory = (EvolutionFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.troposproject.org/evolution"); 
			if (theEvolutionFactory != null) {
				return theEvolutionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EvolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EvolutionPackage.SCENARIO: return createScenario();
			case EvolutionPackage.FILE: return createFile();
			case EvolutionPackage.EVOLUTION_RULE: return createEvolutionRule();
			case EvolutionPackage.POSSIBILITY: return createPossibility();
			case EvolutionPackage.FILE_REPOSITORY: return createFileRepository();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scenario createScenario() {
		ScenarioImpl scenario = new ScenarioImpl();
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionRule createEvolutionRule() {
		EvolutionRuleImpl evolutionRule = new EvolutionRuleImpl();
		return evolutionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Possibility createPossibility() {
		PossibilityImpl possibility = new PossibilityImpl();
		return possibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileRepository createFileRepository() {
		FileRepositoryImpl fileRepository = new FileRepositoryImpl();
		return fileRepository;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvolutionPackage getEvolutionPackage() {
		return (EvolutionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EvolutionPackage getPackage() {
		return EvolutionPackage.eINSTANCE;
	}

} //EvolutionFactoryImpl
