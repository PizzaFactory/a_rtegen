/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getDataParam <em>Data Param</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getStatusVariable <em>Status Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getFilterResultVariable <em>Filter Result Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getNeedsCheckArg <em>Needs Check Arg</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getActivationFlag <em>Activation Flag</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi()
 * @model
 * @generated
 */
public interface SendApi extends RteApi {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<SendOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Param</em>' reference.
	 * @see #setDataParam(Parameter)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_DataParam()
	 * @model required="true"
	 * @generated
	 */
	Parameter getDataParam();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getDataParam <em>Data Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Param</em>' reference.
	 * @see #getDataParam()
	 * @generated
	 */
	void setDataParam(Parameter value);

	/**
	 * Returns the value of the '<em><b>Status Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Variable</em>' reference.
	 * @see #setStatusVariable(LocalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_StatusVariable()
	 * @model required="true"
	 * @generated
	 */
	LocalVariable getStatusVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getStatusVariable <em>Status Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Variable</em>' reference.
	 * @see #getStatusVariable()
	 * @generated
	 */
	void setStatusVariable(LocalVariable value);

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_TrustedFunctionParamVariable()
	 * @model
	 * @generated
	 */
	LocalVariable getTrustedFunctionParamVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTrustedFunctionParamVariable <em>Trusted Function Param Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Function Param Variable</em>' reference.
	 * @see #getTrustedFunctionParamVariable()
	 * @generated
	 */
	void setTrustedFunctionParamVariable(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Filter Result Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Result Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Result Variable</em>' reference.
	 * @see #setFilterResultVariable(LocalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_FilterResultVariable()
	 * @model
	 * @generated
	 */
	LocalVariable getFilterResultVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getFilterResultVariable <em>Filter Result Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Result Variable</em>' reference.
	 * @see #getFilterResultVariable()
	 * @generated
	 */
	void setFilterResultVariable(LocalVariable value);

	/**
	 * Returns the value of the '<em><b>Needs Check Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Check Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Check Arg</em>' attribute.
	 * @see #setNeedsCheckArg(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_NeedsCheckArg()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getNeedsCheckArg();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getNeedsCheckArg <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Check Arg</em>' attribute.
	 * @see #getNeedsCheckArg()
	 * @generated
	 */
	void setNeedsCheckArg(Boolean value);

	/**
	 * Returns the value of the '<em><b>Activation Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ActivationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_ActivationOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationOperation> getActivationOperation();

	/**
	 * Returns the value of the '<em><b>Activation Flag</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Flag</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Flag</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_ActivationFlag()
	 * @model
	 * @generated
	 */
	EList<LocalVariable> getActivationFlag();

	/**
	 * Returns the value of the '<em><b>TAck Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TAck Status</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TAck Status</em>' reference.
	 * @see #setTAckStatus(TAckStatus)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSendApi_TAckStatus()
	 * @model
	 * @generated
	 */
	TAckStatus getTAckStatus();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SendApi#getTAckStatus <em>TAck Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TAck Status</em>' reference.
	 * @see #getTAckStatus()
	 * @generated
	 */
	void setTAckStatus(TAckStatus value);

} // SendApi
