/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAck Notify Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation#getActivationOperation <em>Activation Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation#getTAckStatus <em>TAck Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTAckNotifyOperation()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface TAckNotifyOperation extends ExtendedEObject {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTAckNotifyOperation_ActivationOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivationOperation> getActivationOperation();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTAckNotifyOperation_TAckStatus()
	 * @model
	 * @generated
	 */
	TAckStatus getTAckStatus();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckNotifyOperation#getTAckStatus <em>TAck Status</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TAck Status</em>' reference.
	 * @see #getTAckStatus()
	 * @generated
	 */
	void setTAckStatus(TAckStatus value);

} // TAckNotifyOperation
