/**
 */
package com.modelisoft.aggero.model.common;

import com.modelisoft.aggero.model.feature.Feature;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.common.Workspace#getLocation <em>Location</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.common.Workspace#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.common.Workspace#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.modelisoft.aggero.model.common.CommonPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getWorkspace_Location()
	 * @model required="true"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link com.modelisoft.aggero.model.common.Workspace#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference list.
	 * The list contents are of type {@link com.modelisoft.aggero.model.common.ExecutableProject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference list.
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getWorkspace_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableProject> getPlugins();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link com.modelisoft.aggero.model.feature.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getWorkspace_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Workspace
