/**
 */
package com.modelisoft.aggero.model.common;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.common.Project#getLocation <em>Location</em>}</li>
 *   <li>{@link com.modelisoft.aggero.model.common.Project#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.modelisoft.aggero.model.common.CommonPackage#getProject()
 * @model abstract="true"
 * @generated
 */
public interface Project extends NamedElement {
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
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getProject_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link com.modelisoft.aggero.model.common.Project#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(ProjectProperties)
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getProject_Properties()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProjectProperties getProperties();

	/**
	 * Sets the value of the '{@link com.modelisoft.aggero.model.common.Project#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(ProjectProperties value);

} // Project
