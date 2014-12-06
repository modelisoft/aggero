/**
 */
package com.modelisoft.aggero.model.plugin;

import com.modelisoft.aggero.model.common.CommonPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see com.modelisoft.aggero.model.plugin.PluginFactory
 * @model kind="package"
 * @generated
 */
public interface PluginPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "plugin";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelisoft.com/plugin";

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
	PluginPackage eINSTANCE = com.modelisoft.aggero.model.plugin.impl.PluginPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.plugin.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.plugin.impl.PluginImpl
	 * @see com.modelisoft.aggero.model.plugin.impl.PluginPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__NAME = CommonPackage.EXECUTABLE_PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__LOCATION = CommonPackage.EXECUTABLE_PROJECT__LOCATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__PROPERTIES = CommonPackage.EXECUTABLE_PROJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Execution Environment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__EXECUTION_ENVIRONMENT = CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = CommonPackage.EXECUTABLE_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_OPERATION_COUNT = CommonPackage.EXECUTABLE_PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.plugin.impl.FragmentImpl <em>Fragment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.plugin.impl.FragmentImpl
	 * @see com.modelisoft.aggero.model.plugin.impl.PluginPackageImpl#getFragment()
	 * @generated
	 */
	int FRAGMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__NAME = CommonPackage.EXECUTABLE_PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__LOCATION = CommonPackage.EXECUTABLE_PROJECT__LOCATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__PROPERTIES = CommonPackage.EXECUTABLE_PROJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Execution Environment</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT__EXECUTION_ENVIRONMENT = CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT;

	/**
	 * The number of structural features of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_FEATURE_COUNT = CommonPackage.EXECUTABLE_PROJECT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fragment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAGMENT_OPERATION_COUNT = CommonPackage.EXECUTABLE_PROJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.plugin.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see com.modelisoft.aggero.model.plugin.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.plugin.Fragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fragment</em>'.
	 * @see com.modelisoft.aggero.model.plugin.Fragment
	 * @generated
	 */
	EClass getFragment();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PluginFactory getPluginFactory();

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
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.plugin.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.plugin.impl.PluginImpl
		 * @see com.modelisoft.aggero.model.plugin.impl.PluginPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.plugin.impl.FragmentImpl <em>Fragment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.plugin.impl.FragmentImpl
		 * @see com.modelisoft.aggero.model.plugin.impl.PluginPackageImpl#getFragment()
		 * @generated
		 */
		EClass FRAGMENT = eINSTANCE.getFragment();

	}

} //PluginPackage
