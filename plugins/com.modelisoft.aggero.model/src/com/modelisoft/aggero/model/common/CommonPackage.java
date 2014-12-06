/**
 */
package com.modelisoft.aggero.model.common;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.modelisoft.aggero.model.common.CommonFactory
 * @model kind="package"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelisoft.com/common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = com.modelisoft.aggero.model.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.common.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.common.impl.NamedElementImpl
	 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.common.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.common.impl.ProjectImpl
	 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.common.impl.ProjectPropertiesImpl <em>Project Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.common.impl.ProjectPropertiesImpl
	 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getProjectProperties()
	 * @generated
	 */
	int PROJECT_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES__ID = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES__VERSION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES__VENDOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Project Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Project Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROPERTIES_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.common.impl.ExecutableProjectImpl <em>Executable Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.common.impl.ExecutableProjectImpl
	 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getExecutableProject()
	 * @generated
	 */
	int EXECUTABLE_PROJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT__NAME = PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT__LOCATION = PROJECT__LOCATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT__PROPERTIES = PROJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Execution Environment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT = PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Executable Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT_FEATURE_COUNT = PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Executable Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTABLE_PROJECT_OPERATION_COUNT = PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.common.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.common.impl.WorkspaceImpl
	 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__LOCATION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PLUGINS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__FEATURES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.common.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.modelisoft.aggero.model.common.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.modelisoft.aggero.model.common.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.common.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see com.modelisoft.aggero.model.common.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.Project#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.modelisoft.aggero.model.common.Project#getLocation()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Location();

	/**
	 * Returns the meta object for the containment reference '{@link com.modelisoft.aggero.model.common.Project#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Properties</em>'.
	 * @see com.modelisoft.aggero.model.common.Project#getProperties()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Properties();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.common.ProjectProperties <em>Project Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Properties</em>'.
	 * @see com.modelisoft.aggero.model.common.ProjectProperties
	 * @generated
	 */
	EClass getProjectProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.ProjectProperties#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.modelisoft.aggero.model.common.ProjectProperties#getId()
	 * @see #getProjectProperties()
	 * @generated
	 */
	EAttribute getProjectProperties_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.ProjectProperties#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.modelisoft.aggero.model.common.ProjectProperties#getVersion()
	 * @see #getProjectProperties()
	 * @generated
	 */
	EAttribute getProjectProperties_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.ProjectProperties#getVendor <em>Vendor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor</em>'.
	 * @see com.modelisoft.aggero.model.common.ProjectProperties#getVendor()
	 * @see #getProjectProperties()
	 * @generated
	 */
	EAttribute getProjectProperties_Vendor();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.common.ExecutableProject <em>Executable Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Executable Project</em>'.
	 * @see com.modelisoft.aggero.model.common.ExecutableProject
	 * @generated
	 */
	EClass getExecutableProject();

	/**
	 * Returns the meta object for the attribute list '{@link com.modelisoft.aggero.model.common.ExecutableProject#getExecutionEnvironment <em>Execution Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Execution Environment</em>'.
	 * @see com.modelisoft.aggero.model.common.ExecutableProject#getExecutionEnvironment()
	 * @see #getExecutableProject()
	 * @generated
	 */
	EAttribute getExecutableProject_ExecutionEnvironment();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.common.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see com.modelisoft.aggero.model.common.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the attribute '{@link com.modelisoft.aggero.model.common.Workspace#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.modelisoft.aggero.model.common.Workspace#getLocation()
	 * @see #getWorkspace()
	 * @generated
	 */
	EAttribute getWorkspace_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link com.modelisoft.aggero.model.common.Workspace#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugins</em>'.
	 * @see com.modelisoft.aggero.model.common.Workspace#getPlugins()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Plugins();

	/**
	 * Returns the meta object for the containment reference list '{@link com.modelisoft.aggero.model.common.Workspace#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see com.modelisoft.aggero.model.common.Workspace#getFeatures()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Features();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.common.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.common.impl.NamedElementImpl
		 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.common.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.common.impl.ProjectImpl
		 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LOCATION = eINSTANCE.getProject_Location();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROPERTIES = eINSTANCE.getProject_Properties();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.common.impl.ProjectPropertiesImpl <em>Project Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.common.impl.ProjectPropertiesImpl
		 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getProjectProperties()
		 * @generated
		 */
		EClass PROJECT_PROPERTIES = eINSTANCE.getProjectProperties();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PROPERTIES__ID = eINSTANCE.getProjectProperties_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PROPERTIES__VERSION = eINSTANCE.getProjectProperties_Version();

		/**
		 * The meta object literal for the '<em><b>Vendor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PROPERTIES__VENDOR = eINSTANCE.getProjectProperties_Vendor();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.common.impl.ExecutableProjectImpl <em>Executable Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.common.impl.ExecutableProjectImpl
		 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getExecutableProject()
		 * @generated
		 */
		EClass EXECUTABLE_PROJECT = eINSTANCE.getExecutableProject();

		/**
		 * The meta object literal for the '<em><b>Execution Environment</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT = eINSTANCE.getExecutableProject_ExecutionEnvironment();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.common.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.common.impl.WorkspaceImpl
		 * @see com.modelisoft.aggero.model.common.impl.CommonPackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKSPACE__LOCATION = eINSTANCE.getWorkspace_Location();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PLUGINS = eINSTANCE.getWorkspace_Plugins();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__FEATURES = eINSTANCE.getWorkspace_Features();

	}

} //CommonPackage
