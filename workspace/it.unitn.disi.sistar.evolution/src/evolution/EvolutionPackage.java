/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package evolution;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see evolution.EvolutionFactory
 * @model kind="package"
 * @generated
 */
public interface EvolutionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "evolution";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.troposproject.org/evolution";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ev";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EvolutionPackage eINSTANCE = evolution.impl.EvolutionPackageImpl.init();

	/**
	 * The meta object id for the '{@link evolution.impl.ScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evolution.impl.ScenarioImpl
	 * @see evolution.impl.EvolutionPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Main Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__MAIN_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__RULES = 1;

	/**
	 * The feature id for the '<em><b>Repository</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__REPOSITORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = 3;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link evolution.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evolution.impl.FileImpl
	 * @see evolution.impl.EvolutionPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__FILENAME = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link evolution.impl.EvolutionRuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evolution.impl.EvolutionRuleImpl
	 * @see evolution.impl.EvolutionPackageImpl#getEvolutionRule()
	 * @generated
	 */
	int EVOLUTION_RULE = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Probabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__PROBABILITIES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVOLUTION_RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link evolution.impl.PossibilityImpl <em>Possibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evolution.impl.PossibilityImpl
	 * @see evolution.impl.EvolutionPackageImpl#getPossibility()
	 * @generated
	 */
	int POSSIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY__MODEL = 1;

	/**
	 * The number of structural features of the '<em>Possibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSSIBILITY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link evolution.impl.FileRepositoryImpl <em>File Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see evolution.impl.FileRepositoryImpl
	 * @see evolution.impl.EvolutionPackageImpl#getFileRepository()
	 * @generated
	 */
	int FILE_REPOSITORY = 4;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REPOSITORY__FILES = 0;

	/**
	 * The number of structural features of the '<em>File Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_REPOSITORY_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link evolution.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see evolution.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the reference '{@link evolution.Scenario#getMainDiagram <em>Main Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Main Diagram</em>'.
	 * @see evolution.Scenario#getMainDiagram()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_MainDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link evolution.Scenario#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see evolution.Scenario#getRules()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link evolution.Scenario#getRepository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Repository</em>'.
	 * @see evolution.Scenario#getRepository()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Repository();

	/**
	 * Returns the meta object for the attribute '{@link evolution.Scenario#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see evolution.Scenario#getName()
	 * @see #getScenario()
	 * @generated
	 */
	EAttribute getScenario_Name();

	/**
	 * Returns the meta object for class '{@link evolution.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see evolution.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link evolution.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see evolution.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for the attribute '{@link evolution.File#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see evolution.File#getFilename()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Filename();

	/**
	 * Returns the meta object for class '{@link evolution.EvolutionRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see evolution.EvolutionRule
	 * @generated
	 */
	EClass getEvolutionRule();

	/**
	 * Returns the meta object for the reference '{@link evolution.EvolutionRule#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see evolution.EvolutionRule#getModel()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EReference getEvolutionRule_Model();

	/**
	 * Returns the meta object for the containment reference list '{@link evolution.EvolutionRule#getProbabilities <em>Probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Probabilities</em>'.
	 * @see evolution.EvolutionRule#getProbabilities()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EReference getEvolutionRule_Probabilities();

	/**
	 * Returns the meta object for the attribute '{@link evolution.EvolutionRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see evolution.EvolutionRule#getName()
	 * @see #getEvolutionRule()
	 * @generated
	 */
	EAttribute getEvolutionRule_Name();

	/**
	 * Returns the meta object for class '{@link evolution.Possibility <em>Possibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Possibility</em>'.
	 * @see evolution.Possibility
	 * @generated
	 */
	EClass getPossibility();

	/**
	 * Returns the meta object for the attribute '{@link evolution.Possibility#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see evolution.Possibility#getProbability()
	 * @see #getPossibility()
	 * @generated
	 */
	EAttribute getPossibility_Probability();

	/**
	 * Returns the meta object for the reference '{@link evolution.Possibility#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see evolution.Possibility#getModel()
	 * @see #getPossibility()
	 * @generated
	 */
	EReference getPossibility_Model();

	/**
	 * Returns the meta object for class '{@link evolution.FileRepository <em>File Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Repository</em>'.
	 * @see evolution.FileRepository
	 * @generated
	 */
	EClass getFileRepository();

	/**
	 * Returns the meta object for the containment reference list '{@link evolution.FileRepository#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see evolution.FileRepository#getFiles()
	 * @see #getFileRepository()
	 * @generated
	 */
	EReference getFileRepository_Files();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EvolutionFactory getEvolutionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link evolution.impl.ScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evolution.impl.ScenarioImpl
		 * @see evolution.impl.EvolutionPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Main Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__MAIN_DIAGRAM = eINSTANCE.getScenario_MainDiagram();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__RULES = eINSTANCE.getScenario_Rules();

		/**
		 * The meta object literal for the '<em><b>Repository</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCENARIO__REPOSITORY = eINSTANCE.getScenario_Repository();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCENARIO__NAME = eINSTANCE.getScenario_Name();

		/**
		 * The meta object literal for the '{@link evolution.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evolution.impl.FileImpl
		 * @see evolution.impl.EvolutionPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__FILENAME = eINSTANCE.getFile_Filename();

		/**
		 * The meta object literal for the '{@link evolution.impl.EvolutionRuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evolution.impl.EvolutionRuleImpl
		 * @see evolution.impl.EvolutionPackageImpl#getEvolutionRule()
		 * @generated
		 */
		EClass EVOLUTION_RULE = eINSTANCE.getEvolutionRule();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTION_RULE__MODEL = eINSTANCE.getEvolutionRule_Model();

		/**
		 * The meta object literal for the '<em><b>Probabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVOLUTION_RULE__PROBABILITIES = eINSTANCE.getEvolutionRule_Probabilities();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVOLUTION_RULE__NAME = eINSTANCE.getEvolutionRule_Name();

		/**
		 * The meta object literal for the '{@link evolution.impl.PossibilityImpl <em>Possibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evolution.impl.PossibilityImpl
		 * @see evolution.impl.EvolutionPackageImpl#getPossibility()
		 * @generated
		 */
		EClass POSSIBILITY = eINSTANCE.getPossibility();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POSSIBILITY__PROBABILITY = eINSTANCE.getPossibility_Probability();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSSIBILITY__MODEL = eINSTANCE.getPossibility_Model();

		/**
		 * The meta object literal for the '{@link evolution.impl.FileRepositoryImpl <em>File Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see evolution.impl.FileRepositoryImpl
		 * @see evolution.impl.EvolutionPackageImpl#getFileRepository()
		 * @generated
		 */
		EClass FILE_REPOSITORY = eINSTANCE.getFileRepository();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_REPOSITORY__FILES = eINSTANCE.getFileRepository_Files();

	}

} //EvolutionPackage
