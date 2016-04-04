/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Internal Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getFunctionMacro <em>Function Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getComProxyFunctionTableGroup <em>Com Proxy Function Table Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getComSignalApiWrapperGroup <em>Com Signal Api Wrapper Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getModeType <em>Mode Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getSchmApiGroup <em>Schm Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader()
 * @model
 * @generated
 */
public interface RteInternalHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Constant</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_Constant()
	 * @model
	 * @generated
	 */
	EList<Constant> getConstant();

	/**
	 * Returns the value of the '<em><b>Global Variable Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_GlobalVariableGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup();

	/**
	 * Returns the value of the '<em><b>Trusted Function Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trusted Function Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Function Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_TrustedFunctionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrustedFunctionFileContentsGroup> getTrustedFunctionGroup();

	/**
	 * Returns the value of the '<em><b>Bsw Schedulable Entity Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.BswSchedulableEntityFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsw Schedulable Entity Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsw Schedulable Entity Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_BswSchedulableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswSchedulableEntityFileContentsGroup> getBswSchedulableEntityGroup();

	/**
	 * Returns the value of the '<em><b>Rte Core Start Api Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Core Start Api Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Core Start Api Impl</em>' reference.
	 * @see #setRteCoreStartApiImpl(RteCoreStartApiImpl)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_RteCoreStartApiImpl()
	 * @model
	 * @generated
	 */
	RteCoreStartApiImpl getRteCoreStartApiImpl();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getRteCoreStartApiImpl <em>Rte Core Start Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Core Start Api Impl</em>' reference.
	 * @see #getRteCoreStartApiImpl()
	 * @generated
	 */
	void setRteCoreStartApiImpl(RteCoreStartApiImpl value);

	/**
	 * Returns the value of the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Executable Entity Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Executable Entity Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_DependentExecutableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableEntityFileContentsGroup> getDependentExecutableEntityGroup();

	/**
	 * Returns the value of the '<em><b>Schm Core Init Api Impl</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Core Init Api Impl</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Core Init Api Impl</em>' reference.
	 * @see #setSchmCoreInitApiImpl(SchmCoreInitApiImpl)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_SchmCoreInitApiImpl()
	 * @model
	 * @generated
	 */
	SchmCoreInitApiImpl getSchmCoreInitApiImpl();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader#getSchmCoreInitApiImpl <em>Schm Core Init Api Impl</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schm Core Init Api Impl</em>' reference.
	 * @see #getSchmCoreInitApiImpl()
	 * @generated
	 */
	void setSchmCoreInitApiImpl(SchmCoreInitApiImpl value);

	/**
	 * Returns the value of the '<em><b>Function Macro</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.FunctionMacro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Macro</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Macro</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_FunctionMacro()
	 * @model containment="true"
	 * @generated
	 */
	EList<FunctionMacro> getFunctionMacro();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function Table Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionTableFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function Table Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function Table Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_ComProxyFunctionTableGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComProxyFunctionTableFileContentsGroup> getComProxyFunctionTableGroup();

	/**
	 * Returns the value of the '<em><b>Com Signal Api Wrapper Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComSignalApiWrapperFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Signal Api Wrapper Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Signal Api Wrapper Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_ComSignalApiWrapperGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComSignalApiWrapperFileContentsGroup> getComSignalApiWrapperGroup();

	/**
	 * Returns the value of the '<em><b>Mode Type</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Type</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_ModeType()
	 * @model
	 * @generated
	 */
	EList<ModeType> getModeType();

	/**
	 * Returns the value of the '<em><b>Mode Declaration Group</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeDeclarationGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Declaration Group</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Declaration Group</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_ModeDeclarationGroup()
	 * @model
	 * @generated
	 */
	EList<ModeDeclarationGroup> getModeDeclarationGroup();

	/**
	 * Returns the value of the '<em><b>Mode Machine Instance</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Machine Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Machine Instance</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_ModeMachineInstance()
	 * @model
	 * @generated
	 */
	EList<ModeMachineInstance> getModeMachineInstance();

	/**
	 * Returns the value of the '<em><b>Rte Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_RteApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApiFileContentsGroup> getRteApiGroup();

	/**
	 * Returns the value of the '<em><b>Schm Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteInternalHeader_SchmApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchmApiFileContentsGroup> getSchmApiGroup();

} // RteInternalHeader
