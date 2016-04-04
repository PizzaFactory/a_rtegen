/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trusted Function Rte Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getTempReturnVariable <em>Temp Return Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getActivationFlagOnRxSuccess <em>Activation Flag On Rx Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteOperation()
 * @model
 * @generated
 */
public interface TrustedFunctionRteOperation extends SendOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteOperation_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Temp Return Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temp Return Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp Return Variable</em>' reference.
	 * @see #setTempReturnVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteOperation_TempReturnVariable()
	 * @model
	 * @generated
	 */
	Variable getTempReturnVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getTempReturnVariable <em>Temp Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temp Return Variable</em>' reference.
	 * @see #getTempReturnVariable()
	 * @generated
	 */
	void setTempReturnVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Trusted Function Param Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trusted Function Param Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Function Param Variable</em>' reference.
	 * @see #setTrustedFunctionParamVariable(LocalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteOperation_TrustedFunctionParamVariable()
	 * @model required="true"
	 * @generated
	 */
	LocalVariable getTrustedFunctionParamVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteOperation#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Function Param Variable</em>' reference.
	 * @see #getTrustedFunctionParamVariable()
	 * @generated
	 */
	void setTrustedFunctionParamVariable(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Activation Flag On Rx Success</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Flag On Rx Success</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Flag On Rx Success</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteOperation_ActivationFlagOnRxSuccess()
	 * @model
	 * @generated
	 */
	EList<LocalVariable> getActivationFlagOnRxSuccess();

} // TrustedFunctionRteOperation
