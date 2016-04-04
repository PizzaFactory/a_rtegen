/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getDependentExternalExecutableEntityGroup <em>Dependent External Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getBswSchedulableEntityGroup <em>Bsw Schedulable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTaskBodyGroup <em>Task Body Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getComCallbackGroup <em>Com Callback Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getTrustedFunctionGroup <em>Trusted Function Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getSchmApiGroup <em>Schm Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getComSignalApiWrapperGroup <em>Com Signal Api Wrapper Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource#getComProxyFunctionGroup <em>Com Proxy Function Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource()
 * @model
 * @generated
 */
public interface RteSource extends SourceFile {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_GlobalVariableGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup();

	/**
	 * Returns the value of the '<em><b>Dependent External Executable Entity Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent External Executable Entity Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent External Executable Entity Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_DependentExternalExecutableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableEntityFileContentsGroup> getDependentExternalExecutableEntityGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_BswSchedulableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<BswSchedulableEntityFileContentsGroup> getBswSchedulableEntityGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_RteApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApiFileContentsGroup> getRteApiGroup();

	/**
	 * Returns the value of the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Lifecycle Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Lifecycle Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_RteLifecycleApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteLifecycleApiFileContentsGroup> getRteLifecycleApiGroup();

	/**
	 * Returns the value of the '<em><b>Task Body Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Body Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Body Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_TaskBodyGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskBodyFileContentsGroup> getTaskBodyGroup();

	/**
	 * Returns the value of the '<em><b>Com Callback Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComCallbackFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Callback Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Callback Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_ComCallbackGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComCallbackFileContentsGroup> getComCallbackGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_TrustedFunctionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrustedFunctionFileContentsGroup> getTrustedFunctionGroup();

	/**
	 * Returns the value of the '<em><b>Source Macro</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Macro</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Macro</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_SourceMacro()
	 * @model
	 * @generated
	 */
	EList<Macro> getSourceMacro();

	/**
	 * Returns the value of the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Lifecycle Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Lifecycle Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_SchmLifecycleApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchmLifecycleApiFileContentsGroup> getSchmLifecycleApiGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_SchmApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchmApiFileContentsGroup> getSchmApiGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_ComSignalApiWrapperGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComSignalApiWrapperFileContentsGroup> getComSignalApiWrapperGroup();

	/**
	 * Returns the value of the '<em><b>Com Proxy Function Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ComProxyFunctionFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Com Proxy Function Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Com Proxy Function Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteSource_ComProxyFunctionGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComProxyFunctionFileContentsGroup> getComProxyFunctionGroup();

} // RteSource
