/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trusted Function Rte Buffer Write Send Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteBufferWriteSendOperation()
 * @model
 * @generated
 */
public interface TrustedFunctionRteBufferWriteSendOperation extends TrustedFunctionRteOperation {
	/**
	 * Returns the value of the '<em><b>Access Trusted Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Access Trusted Function</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Trusted Function</em>' reference.
	 * @see #setAccessTrustedFunction(RteBufferWriteTrustedFunction)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunctionRteBufferWriteSendOperation_AccessTrustedFunction()
	 * @model required="true"
	 * @generated
	 */
	RteBufferWriteTrustedFunction getAccessTrustedFunction();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunctionRteBufferWriteSendOperation#getAccessTrustedFunction <em>Access Trusted Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Trusted Function</em>' reference.
	 * @see #getAccessTrustedFunction()
	 * @generated
	 */
	void setAccessTrustedFunction(RteBufferWriteTrustedFunction value);

} // TrustedFunctionRteBufferWriteSendOperation
