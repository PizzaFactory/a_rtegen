/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Buffer Nonqueued Read Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation#getAccessVariable <em>Access Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedReadOperation()
 * @model
 * @generated
 */
public interface RteBufferNonqueuedReadOperation extends ReadOperation {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferNonqueuedReadOperation_AccessVariable()
	 * @model required="true"
	 * @generated
	 */
	RteBufferVariableSet getAccessVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferNonqueuedReadOperation#getAccessVariable <em>Access Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Variable</em>' reference.
	 * @see #getAccessVariable()
	 * @generated
	 */
	void setAccessVariable(RteBufferVariableSet value);

} // RteBufferNonqueuedReadOperation
