/**
 */
package com.modelisoft.aggero.model.feature;

import com.modelisoft.aggero.model.common.Project;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.feature.Feature#getContent <em>Content</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.feature.Feature#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends Project {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' containment reference.
	 * @see #setContent(FeatureContent)
	 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeature_Content()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureContent getContent();

	/**
	 * Sets the value of the '{@link com.modelisoft.aggero.model.feature.Feature#getContent <em>Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' containment reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(FeatureContent value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference.
	 * @see #setDependencies(FeatureDependencies)
	 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeature_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	FeatureDependencies getDependencies();

	/**
	 * Sets the value of the '{@link com.modelisoft.aggero.model.feature.Feature#getDependencies <em>Dependencies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependencies</em>' containment reference.
	 * @see #getDependencies()
	 * @generated
	 */
	void setDependencies(FeatureDependencies value);

} // Feature
