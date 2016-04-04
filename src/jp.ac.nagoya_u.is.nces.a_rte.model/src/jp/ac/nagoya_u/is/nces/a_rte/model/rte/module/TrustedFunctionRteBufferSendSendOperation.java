/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trusted Function Rte Buffer Send Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferSendSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteBufferSendSendOperation()
 * @model
 * @generated
 */
public interface TrustedFunctionRteBufferSendSendOperation extends TrustedFunctionRteOperation {
	/**
	 * Returns the value of the '<em><b>Access Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Trusted Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Trusted Function</em>' reference.
	 * @see #setAccessTrustedFunction(RteBufferSendTrustedFunction)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteBufferSendSendOperation_AccessTrustedFunction()
	 * @model required="true"
	 * @generated
	 */
	RteBufferSendTrustedFunction getAccessTrustedFunction();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferSendSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Trusted Function</em>' reference.
	 * @see #getAccessTrustedFunction()
	 * @generated
	 */
	void setAccessTrustedFunction(RteBufferSendTrustedFunction value);

} // TrustedFunctionRteBufferSendSendOperation
