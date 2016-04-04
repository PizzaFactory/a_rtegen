/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schm Switch Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi#getOsTaskEventTriggeredByMode <em>Os Task Event Triggered By Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi#getExecutableStartOperation <em>Executable Start Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmSwitchApi()
 * @model
 * @generated
 */
public interface SchmSwitchApi extends SchmApi {
	/**
	 * Returns the value of the '<em><b>Mode Machine Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Machine Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Machine Instance</em>' reference.
	 * @see #setModeMachineInstance(ModeMachineInstance)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmSwitchApi_ModeMachineInstance()
	 * @model
	 * @generated
	 */
	ModeMachineInstance getModeMachineInstance();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmSwitchApi#getModeMachineInstance <em>Mode Machine Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Machine Instance</em>' reference.
	 * @see #getModeMachineInstance()
	 * @generated
	 */
	void setModeMachineInstance(ModeMachineInstance value);

	/**
	 * Returns the value of the '<em><b>Os Task Event Triggered By Mode</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task Event Triggered By Mode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task Event Triggered By Mode</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmSwitchApi_OsTaskEventTriggeredByMode()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsTaskEventsTriggeredByMode> getOsTaskEventTriggeredByMode();

	/**
	 * Returns the value of the '<em><b>Executable Start Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable Start Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable Start Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmSwitchApi_ExecutableStartOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModeSwitchTriggeringExecutableStartOperation> getExecutableStartOperation();

} // SchmSwitchApi
