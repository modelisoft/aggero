/**
 */
package com.modelisoft.aggero.model.common.impl;

import com.modelisoft.aggero.model.common.CommonPackage;
import com.modelisoft.aggero.model.common.ExecutableProject;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executable Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.modelisoft.aggero.model.common.impl.ExecutableProjectImpl#getExecutionEnvironment <em>Execution Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutableProjectImpl extends ProjectImpl implements ExecutableProject {
	/**
	 * The cached value of the '{@link #getExecutionEnvironment() <em>Execution Environment</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<String> executionEnvironment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutableProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.EXECUTABLE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExecutionEnvironment() {
		if (executionEnvironment == null) {
			executionEnvironment = new EDataTypeUniqueEList<String>(String.class, this, CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT);
		}
		return executionEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT:
				return getExecutionEnvironment();
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
			case CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT:
				getExecutionEnvironment().clear();
				getExecutionEnvironment().addAll((Collection<? extends String>)newValue);
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
			case CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT:
				getExecutionEnvironment().clear();
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
			case CommonPackage.EXECUTABLE_PROJECT__EXECUTION_ENVIRONMENT:
				return executionEnvironment != null && !executionEnvironment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (executionEnvironment: ");
		result.append(executionEnvironment);
		result.append(')');
		return result.toString();
	}

} //ExecutableProjectImpl
