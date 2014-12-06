/**
 */
package com.modelisoft.aggero.model.feature.impl;

import com.modelisoft.aggero.model.common.ExecutableProject;

import com.modelisoft.aggero.model.feature.Feature;
import com.modelisoft.aggero.model.feature.FeatureContent;
import com.modelisoft.aggero.model.feature.FeaturePackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.feature.impl.FeatureContentImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.feature.impl.FeatureContentImpl#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureContentImpl extends MinimalEObjectImpl.Container implements FeatureContent {
	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableProject> plugins;

	/**
	 * The cached value of the '{@link #getIncludedFeatures() <em>Included Features</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludedFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> includedFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeaturePackage.Literals.FEATURE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableProject> getPlugins() {
		if (plugins == null) {
			plugins = new EObjectResolvingEList<ExecutableProject>(ExecutableProject.class, this, FeaturePackage.FEATURE_CONTENT__PLUGINS);
		}
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getIncludedFeatures() {
		if (includedFeatures == null) {
			includedFeatures = new EObjectResolvingEList<Feature>(Feature.class, this, FeaturePackage.FEATURE_CONTENT__INCLUDED_FEATURES);
		}
		return includedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeaturePackage.FEATURE_CONTENT__PLUGINS:
				return getPlugins();
			case FeaturePackage.FEATURE_CONTENT__INCLUDED_FEATURES:
				return getIncludedFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeaturePackage.FEATURE_CONTENT__PLUGINS:
				getPlugins().clear();
				getPlugins().addAll((Collection<? extends ExecutableProject>)newValue);
				return;
			case FeaturePackage.FEATURE_CONTENT__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				getIncludedFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FeaturePackage.FEATURE_CONTENT__PLUGINS:
				getPlugins().clear();
				return;
			case FeaturePackage.FEATURE_CONTENT__INCLUDED_FEATURES:
				getIncludedFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FeaturePackage.FEATURE_CONTENT__PLUGINS:
				return plugins != null && !plugins.isEmpty();
			case FeaturePackage.FEATURE_CONTENT__INCLUDED_FEATURES:
				return includedFeatures != null && !includedFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureContentImpl
