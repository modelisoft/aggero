/**
 */
package com.modelisoft.aggero.model.common;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.common.ExecutableProject#getExecutionEnvironment <em>Execution Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.modelisoft.aggero.model.common.CommonPackage#getExecutableProject()
 * @model
 * @generated
 */
public interface ExecutableProject extends Project {
	/**
	 * Returns the value of the '<em><b>Execution Environment</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Environment</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Environment</em>' attribute list.
	 * @see com.modelisoft.aggero.model.common.CommonPackage#getExecutableProject_ExecutionEnvironment()
	 * @model
	 * @generated
	 */
	EList<String> getExecutionEnvironment();

} // ExecutableProject
