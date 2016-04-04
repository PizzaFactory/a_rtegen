/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAck Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus#getStatusVariable <em>Status Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTAckStatus()
 * @model
 * @generated
 */
public interface TAckStatus extends LogicalBlock {
	/**
	 * Returns the value of the '<em><b>Status Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status Variable</em>' containment reference.
	 * @see #setStatusVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTAckStatus_StatusVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalVariable getStatusVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TAckStatus#getStatusVariable <em>Status Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status Variable</em>' containment reference.
	 * @see #getStatusVariable()
	 * @generated
	 */
	void setStatusVariable(GlobalVariable value);

} // TAckStatus
