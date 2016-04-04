/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent <em>Parent</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSwcMemoryMapping <em>Swc Memory Mapping</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getDependentRunnableEntity <em>Dependent Runnable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getDependentExternalRunnableEntity <em>Dependent External Runnable Entity</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getRteApi <em>Rte Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiEnumConstant <em>Api Enum Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getApiUpperLowerLimitConstant <em>Api Upper Lower Limit Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSrApiInitValueConstant <em>Sr Api Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSrImplInitValueConstant <em>Sr Impl Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSrImplInvalidValueConstant <em>Sr Impl Invalid Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getSrFilterConstant <em>Sr Filter Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getCsApiApplicationErrorConstant <em>Cs Api Application Error Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getCsPortArgValueConstant <em>Cs Port Arg Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getCsPortArgValueVariable <em>Cs Port Arg Value Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getIrvBufferInitValueConstant <em>Irv Buffer Init Value Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getIrvBufferVariableSet <em>Irv Buffer Variable Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc()
 * @model
 * @generated
 */
public interface Swc extends LogicalCompartment {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSwc <em>Swc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Partition)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Partition#getSwc
	 * @model opposite="swc" required="true" transient="false"
	 * @generated
	 */
	Partition getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Swc#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Partition value);

	/**
	 * Returns the value of the '<em><b>Swc Memory Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc Memory Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc Memory Mapping</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_SwcMemoryMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwcMemoryMapping> getSwcMemoryMapping();

	/**
	 * Returns the value of the '<em><b>Dependent Runnable Entity</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Runnable Entity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Runnable Entity</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_DependentRunnableEntity()
	 * @model containment="true"
	 * @generated
	 */
	EList<RunnableEntity> getDependentRunnableEntity();

	/**
	 * Returns the value of the '<em><b>Dependent External Runnable Entity</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RunnableEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent External Runnable Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent External Runnable Entity</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_DependentExternalRunnableEntity()
	 * @model
	 * @generated
	 */
	EList<RunnableEntity> getDependentExternalRunnableEntity();

	/**
	 * Returns the value of the '<em><b>Rte Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_RteApi()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApi#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<RteApi> getRteApi();

	/**
	 * Returns the value of the '<em><b>Api Enum Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Enum Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Enum Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_ApiEnumConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getApiEnumConstant();

	/**
	 * Returns the value of the '<em><b>Api Upper Lower Limit Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api Upper Lower Limit Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api Upper Lower Limit Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_ApiUpperLowerLimitConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getApiUpperLowerLimitConstant();

	/**
	 * Returns the value of the '<em><b>Sr Api Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * S/Rデータ要素の初期値定数(API)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sr Api Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_SrApiInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrApiInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Sr Impl Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * S/Rデータ要素の初期値定数(内部実装用)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sr Impl Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_SrImplInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrImplInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Sr Impl Invalid Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * S/Rデータ要素の無効値(内部実装用)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sr Impl Invalid Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_SrImplInvalidValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrImplInvalidValueConstant();

	/**
	 * Returns the value of the '<em><b>Sr Filter Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sr Filter Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr Filter Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_SrFilterConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getSrFilterConstant();

	/**
	 * Returns the value of the '<em><b>Cs Api Application Error Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Api Application Error Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Api Application Error Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_CsApiApplicationErrorConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getCsApiApplicationErrorConstant();

	/**
	 * Returns the value of the '<em><b>Cs Port Arg Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Port Arg Value Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Port Arg Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_CsPortArgValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getCsPortArgValueConstant();

	/**
	 * Returns the value of the '<em><b>Cs Port Arg Value Variable</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Port Arg Value Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Port Arg Value Variable</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_CsPortArgValueVariable()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariable> getCsPortArgValueVariable();

	/**
	 * Returns the value of the '<em><b>Irv Buffer Init Value Constant</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irv Buffer Init Value Constant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irv Buffer Init Value Constant</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_IrvBufferInitValueConstant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constant> getIrvBufferInitValueConstant();

	/**
	 * Returns the value of the '<em><b>Irv Buffer Variable Set</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferVariableSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Irv Buffer Variable Set</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Irv Buffer Variable Set</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSwc_IrvBufferVariableSet()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteBufferVariableSet> getIrvBufferVariableSet();

} // Swc
