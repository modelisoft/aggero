/**
 */
package com.modelisoft.aggero.model.feature;

import com.modelisoft.aggero.model.common.CommonPackage;

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
 * @see com.modelisoft.aggero.model.feature.FeatureFactory
 * @model kind="package"
 * @generated
 */
public interface FeaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "feature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://modelisoft.com/feature";

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
	FeaturePackage eINSTANCE = com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.feature.impl.FeatureImpl
	 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = CommonPackage.PROJECT__NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LOCATION = CommonPackage.PROJECT__LOCATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__PROPERTIES = CommonPackage.PROJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CONTENT = CommonPackage.PROJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DEPENDENCIES = CommonPackage.PROJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = CommonPackage.PROJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = CommonPackage.PROJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.feature.impl.FeatureContentImpl
	 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeatureContent()
	 * @generated
	 */
	int FEATURE_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTENT__PLUGINS = 0;

	/**
	 * The feature id for the '<em><b>Included Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTENT__INCLUDED_FEATURES = 1;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureDependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.modelisoft.aggero.model.feature.impl.FeatureDependenciesImpl
	 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeatureDependencies()
	 * @generated
	 */
	int FEATURE_DEPENDENCIES = 2;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCIES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DEPENDENCIES_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.feature.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see com.modelisoft.aggero.model.feature.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link com.modelisoft.aggero.model.feature.Feature#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content</em>'.
	 * @see com.modelisoft.aggero.model.feature.Feature#getContent()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Content();

	/**
	 * Returns the meta object for the containment reference '{@link com.modelisoft.aggero.model.feature.Feature#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dependencies</em>'.
	 * @see com.modelisoft.aggero.model.feature.Feature#getDependencies()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Dependencies();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.feature.FeatureContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see com.modelisoft.aggero.model.feature.FeatureContent
	 * @generated
	 */
	EClass getFeatureContent();

	/**
	 * Returns the meta object for the reference list '{@link com.modelisoft.aggero.model.feature.FeatureContent#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plugins</em>'.
	 * @see com.modelisoft.aggero.model.feature.FeatureContent#getPlugins()
	 * @see #getFeatureContent()
	 * @generated
	 */
	EReference getFeatureContent_Plugins();

	/**
	 * Returns the meta object for the reference list '{@link com.modelisoft.aggero.model.feature.FeatureContent#getIncludedFeatures <em>Included Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Included Features</em>'.
	 * @see com.modelisoft.aggero.model.feature.FeatureContent#getIncludedFeatures()
	 * @see #getFeatureContent()
	 * @generated
	 */
	EReference getFeatureContent_IncludedFeatures();

	/**
	 * Returns the meta object for class '{@link com.modelisoft.aggero.model.feature.FeatureDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see com.modelisoft.aggero.model.feature.FeatureDependencies
	 * @generated
	 */
	EClass getFeatureDependencies();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureFactory getFeatureFactory();

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
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.feature.impl.FeatureImpl
		 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CONTENT = eINSTANCE.getFeature_Content();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__DEPENDENCIES = eINSTANCE.getFeature_Dependencies();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.feature.impl.FeatureContentImpl
		 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeatureContent()
		 * @generated
		 */
		EClass FEATURE_CONTENT = eINSTANCE.getFeatureContent();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTENT__PLUGINS = eINSTANCE.getFeatureContent_Plugins();

		/**
		 * The meta object literal for the '<em><b>Included Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_CONTENT__INCLUDED_FEATURES = eINSTANCE.getFeatureContent_IncludedFeatures();

		/**
		 * The meta object literal for the '{@link com.modelisoft.aggero.model.feature.impl.FeatureDependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.modelisoft.aggero.model.feature.impl.FeatureDependenciesImpl
		 * @see com.modelisoft.aggero.model.feature.impl.FeaturePackageImpl#getFeatureDependencies()
		 * @generated
		 */
		EClass FEATURE_DEPENDENCIES = eINSTANCE.getFeatureDependencies();

	}

} //FeaturePackage
