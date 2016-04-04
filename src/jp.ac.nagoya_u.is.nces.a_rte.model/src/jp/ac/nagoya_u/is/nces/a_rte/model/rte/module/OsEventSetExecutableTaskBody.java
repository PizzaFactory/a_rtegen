/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Event Set Executable Task Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getOsEventId <em>Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getChecksOsEventId <em>Checks Os Event Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getEventVariable <em>Event Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetExecutableTaskBody()
 * @model
 * @generated
 */
public interface OsEventSetExecutableTaskBody extends TaskBody {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetExecutableTaskBody_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<OsEventSetActivationOperation> getOperation();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetExecutableTaskBody_OsEventId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	EList<String> getOsEventId();

	/**
	 * Returns the value of the '<em><b>Checks Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checks Os Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checks Os Event Id</em>' attribute.
	 * @see #setChecksOsEventId(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetExecutableTaskBody_ChecksOsEventId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getChecksOsEventId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getChecksOsEventId <em>Checks Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checks Os Event Id</em>' attribute.
	 * @see #getChecksOsEventId()
	 * @generated
	 */
	void setChecksOsEventId(Boolean value);

	/**
	 * Returns the value of the '<em><b>Event Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Variable</em>' reference.
	 * @see #setEventVariable(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetExecutableTaskBody_EventVariable()
	 * @model
	 * @generated
	 */
	Variable getEventVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetExecutableTaskBody#getEventVariable <em>Event Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Variable</em>' reference.
	 * @see #getEventVariable()
	 * @generated
	 */
	void setEventVariable(Variable value);

} // OsEventSetExecutableTaskBody
