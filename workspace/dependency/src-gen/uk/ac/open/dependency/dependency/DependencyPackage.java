/**
 * <copyright>
 * </copyright>
 *
 */
package uk.ac.open.dependency.dependency;

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
 * @see uk.ac.open.dependency.dependency.DependencyFactory
 * @model kind="package"
 * @generated
 */
public interface DependencyPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "dependency";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "http://www.Dependency";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "dependency";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  DependencyPackage eINSTANCE = uk.ac.open.dependency.dependency.impl.DependencyPackageImpl.init();

  /**
	 * The meta object id for the '{@link uk.ac.open.dependency.dependency.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see uk.ac.open.dependency.dependency.impl.ModelImpl
	 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getModel()
	 * @generated
	 */
  int MODEL = 0;

  /**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__NODES = 0;

  /**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL__DEPENDENCIES = 1;

  /**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MODEL_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link uk.ac.open.dependency.dependency.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see uk.ac.open.dependency.dependency.impl.NodeImpl
	 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getNode()
	 * @generated
	 */
  int NODE = 1;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__NAME = 0;

  /**
	 * The feature id for the '<em><b>Referrence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE__REFERRENCE = 1;

  /**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int NODE_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link uk.ac.open.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see uk.ac.open.dependency.dependency.impl.DependencyImpl
	 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getDependency()
	 * @generated
	 */
  int DEPENDENCY = 2;

  /**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY__FROM = 0;

  /**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY__TO = 1;

  /**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int DEPENDENCY_FEATURE_COUNT = 2;

  /**
	 * The meta object id for the '{@link uk.ac.open.dependency.dependency.impl.CouplingImpl <em>Coupling</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see uk.ac.open.dependency.dependency.impl.CouplingImpl
	 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getCoupling()
	 * @generated
	 */
  int COUPLING = 3;

  /**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUPLING__FROM = DEPENDENCY__FROM;

  /**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUPLING__TO = DEPENDENCY__TO;

  /**
	 * The number of structural features of the '<em>Coupling</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int COUPLING_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;

  /**
	 * The meta object id for the '{@link uk.ac.open.dependency.dependency.impl.PrecedenceImpl <em>Precedence</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see uk.ac.open.dependency.dependency.impl.PrecedenceImpl
	 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getPrecedence()
	 * @generated
	 */
  int PRECEDENCE = 4;

  /**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRECEDENCE__FROM = DEPENDENCY__FROM;

  /**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRECEDENCE__TO = DEPENDENCY__TO;

  /**
	 * The number of structural features of the '<em>Precedence</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PRECEDENCE_FEATURE_COUNT = DEPENDENCY_FEATURE_COUNT + 0;


  /**
	 * Returns the meta object for class '{@link uk.ac.open.dependency.dependency.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.open.dependency.dependency.Model
	 * @generated
	 */
  EClass getModel();

  /**
	 * Returns the meta object for the containment reference list '{@link uk.ac.open.dependency.dependency.Model#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see uk.ac.open.dependency.dependency.Model#getNodes()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Nodes();

  /**
	 * Returns the meta object for the containment reference list '{@link uk.ac.open.dependency.dependency.Model#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see uk.ac.open.dependency.dependency.Model#getDependencies()
	 * @see #getModel()
	 * @generated
	 */
  EReference getModel_Dependencies();

  /**
	 * Returns the meta object for class '{@link uk.ac.open.dependency.dependency.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see uk.ac.open.dependency.dependency.Node
	 * @generated
	 */
  EClass getNode();

  /**
	 * Returns the meta object for the attribute '{@link uk.ac.open.dependency.dependency.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.open.dependency.dependency.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
  EAttribute getNode_Name();

  /**
	 * Returns the meta object for the attribute list '{@link uk.ac.open.dependency.dependency.Node#getReferrence <em>Referrence</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Referrence</em>'.
	 * @see uk.ac.open.dependency.dependency.Node#getReferrence()
	 * @see #getNode()
	 * @generated
	 */
  EAttribute getNode_Referrence();

  /**
	 * Returns the meta object for class '{@link uk.ac.open.dependency.dependency.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see uk.ac.open.dependency.dependency.Dependency
	 * @generated
	 */
  EClass getDependency();

  /**
	 * Returns the meta object for the reference '{@link uk.ac.open.dependency.dependency.Dependency#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see uk.ac.open.dependency.dependency.Dependency#getFrom()
	 * @see #getDependency()
	 * @generated
	 */
  EReference getDependency_From();

  /**
	 * Returns the meta object for the reference '{@link uk.ac.open.dependency.dependency.Dependency#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see uk.ac.open.dependency.dependency.Dependency#getTo()
	 * @see #getDependency()
	 * @generated
	 */
  EReference getDependency_To();

  /**
	 * Returns the meta object for class '{@link uk.ac.open.dependency.dependency.Coupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupling</em>'.
	 * @see uk.ac.open.dependency.dependency.Coupling
	 * @generated
	 */
  EClass getCoupling();

  /**
	 * Returns the meta object for class '{@link uk.ac.open.dependency.dependency.Precedence <em>Precedence</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Precedence</em>'.
	 * @see uk.ac.open.dependency.dependency.Precedence
	 * @generated
	 */
  EClass getPrecedence();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  DependencyFactory getDependencyFactory();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link uk.ac.open.dependency.dependency.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see uk.ac.open.dependency.dependency.impl.ModelImpl
		 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getModel()
		 * @generated
		 */
    EClass MODEL = eINSTANCE.getModel();

    /**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__NODES = eINSTANCE.getModel_Nodes();

    /**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference MODEL__DEPENDENCIES = eINSTANCE.getModel_Dependencies();

    /**
		 * The meta object literal for the '{@link uk.ac.open.dependency.dependency.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see uk.ac.open.dependency.dependency.impl.NodeImpl
		 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getNode()
		 * @generated
		 */
    EClass NODE = eINSTANCE.getNode();

    /**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NODE__NAME = eINSTANCE.getNode_Name();

    /**
		 * The meta object literal for the '<em><b>Referrence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute NODE__REFERRENCE = eINSTANCE.getNode_Referrence();

    /**
		 * The meta object literal for the '{@link uk.ac.open.dependency.dependency.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see uk.ac.open.dependency.dependency.impl.DependencyImpl
		 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getDependency()
		 * @generated
		 */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEPENDENCY__FROM = eINSTANCE.getDependency_From();

    /**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference DEPENDENCY__TO = eINSTANCE.getDependency_To();

    /**
		 * The meta object literal for the '{@link uk.ac.open.dependency.dependency.impl.CouplingImpl <em>Coupling</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see uk.ac.open.dependency.dependency.impl.CouplingImpl
		 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getCoupling()
		 * @generated
		 */
    EClass COUPLING = eINSTANCE.getCoupling();

    /**
		 * The meta object literal for the '{@link uk.ac.open.dependency.dependency.impl.PrecedenceImpl <em>Precedence</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see uk.ac.open.dependency.dependency.impl.PrecedenceImpl
		 * @see uk.ac.open.dependency.dependency.impl.DependencyPackageImpl#getPrecedence()
		 * @generated
		 */
    EClass PRECEDENCE = eINSTANCE.getPrecedence();

  }

} //DependencyPackage
