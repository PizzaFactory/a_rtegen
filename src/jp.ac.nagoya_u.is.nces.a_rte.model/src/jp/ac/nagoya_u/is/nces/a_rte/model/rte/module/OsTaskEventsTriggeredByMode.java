/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Task Events Triggered By Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * SchmSwitchApiと、モードにより起動するOSタスク・OSイベントとの関連を表す。
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode#getStartMode <em>Start Mode</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode#getOsTaskEvent <em>Os Task Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEventsTriggeredByMode()
 * @model
 * @generated
 */
public interface OsTaskEventsTriggeredByMode extends ModuleObject {
	/**
	 * Returns the value of the '<em><b>Start Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Mode</em>' reference.
	 * @see #setStartMode(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEventsTriggeredByMode_StartMode()
	 * @model required="true"
	 * @generated
	 */
	Constant getStartMode();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEventsTriggeredByMode#getStartMode <em>Start Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Mode</em>' reference.
	 * @see #getStartMode()
	 * @generated
	 */
	void setStartMode(Constant value);

	/**
	 * Returns the value of the '<em><b>Os Task Event</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task Event</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task Event</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEventsTriggeredByMode_OsTaskEvent()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsTaskEvent> getOsTaskEvent();

} // OsTaskEventsTriggeredByMode
