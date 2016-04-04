/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schm Init Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi#getInitialExecutableStartOperation <em>Initial Executable Start Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi#getInitialExecutableOsTaskEvent <em>Initial Executable Os Task Event</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmInitApi#getInitTargetModeMachineInstance <em>Init Target Mode Machine Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmInitApi()
 * @model
 * @generated
 */
public interface SchmInitApi extends SchmLifecycleApi {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.InitializeOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmInitApi_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<InitializeOperation> getOperation();

	/**
	 * Returns the value of the '<em><b>Initial Executable Start Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Executable Start Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Executable Start Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmInitApi_InitialExecutableStartOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeSwitchTriggeringExecutableStartOperation> getInitialExecutableStartOperation();

	/**
	 * Returns the value of the '<em><b>Initial Executable Os Task Event</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Executable Os Task Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Executable Os Task Event</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmInitApi_InitialExecutableOsTaskEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsTaskEvent> getInitialExecutableOsTaskEvent();

	/**
	 * Returns the value of the '<em><b>Init Target Mode Machine Instance</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Target Mode Machine Instance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Target Mode Machine Instance</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmInitApi_InitTargetModeMachineInstance()
	 * @model
	 * @generated
	 */
	EList<ModeMachineInstance> getInitTargetModeMachineInstance();

} // SchmInitApi
