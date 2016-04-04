/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Buffer Nonqueued Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getAccessVariable <em>Access Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getFilterOperation <em>Filter Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getActivationFlagOnRxSuccess <em>Activation Flag On Rx Success</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedSendOperation()
 * @model
 * @generated
 */
public interface RteBufferNonqueuedSendOperation extends SendOperation {
	/**
	 * Returns the value of the '<em><b>Access Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Variable</em>' reference.
	 * @see #setAccessVariable(RteBufferVariableSet)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedSendOperation_AccessVariable()
	 * @model required="true"
	 * @generated
	 */
	RteBufferVariableSet getAccessVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getAccessVariable <em>Access Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Variable</em>' reference.
	 * @see #getAccessVariable()
	 * @generated
	 */
	void setAccessVariable(RteBufferVariableSet value);

	/**
	 * Returns the value of the '<em><b>Filter Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Operation</em>' containment reference.
	 * @see #setFilterOperation(FilterOperation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedSendOperation_FilterOperation()
	 * @model containment="true"
	 * @generated
	 */
	FilterOperation getFilterOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedSendOperation#getFilterOperation <em>Filter Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Operation</em>' containment reference.
	 * @see #getFilterOperation()
	 * @generated
	 */
	void setFilterOperation(FilterOperation value);

	/**
	 * Returns the value of the '<em><b>Activation Flag On Rx Success</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.LocalVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Flag On Rx Success</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Flag On Rx Success</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedSendOperation_ActivationFlagOnRxSuccess()
	 * @model
	 * @generated
	 */
	EList<LocalVariable> getActivationFlagOnRxSuccess();

} // RteBufferNonqueuedSendOperation
