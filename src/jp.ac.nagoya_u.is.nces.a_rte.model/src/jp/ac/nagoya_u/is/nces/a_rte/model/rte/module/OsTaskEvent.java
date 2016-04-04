/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Task Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>OSタスク起動・OSイベント設定に使用する識別子(OSタスクID、もしくはOSタスクIDとOSイベントIDのペア)を表す。</p>
 * <p>NOTE OsTaskEventに復数のOSイベントが指定される場合があることに注意。</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent#getOsTaskId <em>Os Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent#getOsTaskPriority <em>Os Task Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEvent()
 * @model
 * @generated
 */
public interface OsTaskEvent extends ModuleObject {
	/**
	 * Returns the value of the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task Id</em>' attribute.
	 * @see #setOsTaskId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEvent_OsTaskId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOsTaskId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent#getOsTaskId <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Task Id</em>' attribute.
	 * @see #getOsTaskId()
	 * @generated
	 */
	void setOsTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Os Event Id</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Event Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Event Id</em>' attribute list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEvent_OsEventId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier"
	 * @generated
	 */
	EList<String> getOsEventId();

	/**
	 * Returns the value of the '<em><b>Os Task Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task Priority</em>' attribute.
	 * @see #setOsTaskPriority(Integer)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsTaskEvent_OsTaskPriority()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Integer" required="true"
	 * @generated
	 */
	Integer getOsTaskPriority();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsTaskEvent#getOsTaskPriority <em>Os Task Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Task Priority</em>' attribute.
	 * @see #getOsTaskPriority()
	 * @generated
	 */
	void setOsTaskPriority(Integer value);

} // OsTaskEvent
