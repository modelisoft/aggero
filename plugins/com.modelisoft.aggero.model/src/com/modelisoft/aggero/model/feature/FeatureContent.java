/**
 */
package com.modelisoft.aggero.model.feature;

import com.modelisoft.aggero.model.common.ExecutableProject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.feature.FeatureContent#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.feature.FeatureContent#getIncludedFeatures <em>Included Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeatureContent()
 * @model
 * @generated
 */
public interface FeatureContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' reference list.
	 * The list contents are of type {@link com.modelisoft.aggero.model.common.ExecutableProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' reference list.
	 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeatureContent_Plugins()
	 * @model
	 * @generated
	 */
	EList<ExecutableProject> getPlugins();

	/**
	 * Returns the value of the '<em><b>Included Features</b></em>' reference list.
	 * The list contents are of type {@link com.modelisoft.aggero.model.feature.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Included Features</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Included Features</em>' reference list.
	 * @see com.modelisoft.aggero.model.feature.FeaturePackage#getFeatureContent_IncludedFeatures()
	 * @model
	 * @generated
	 */
	EList<Feature> getIncludedFeatures();

} // FeatureContent
