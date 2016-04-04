/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Never Read Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation#getInitValueConstant <em>Init Value Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getNeverReadOperation()
 * @model
 * @generated
 */
public interface NeverReadOperation extends ReadOperation {
	/**
	 * Returns the value of the '<em><b>Init Value Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value Constant</em>' reference.
	 * @see #setInitValueConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getNeverReadOperation_InitValueConstant()
	 * @model required="true"
	 * @generated
	 */
	Constant getInitValueConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NeverReadOperation#getInitValueConstant <em>Init Value Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value Constant</em>' reference.
	 * @see #getInitValueConstant()
	 * @generated
	 */
	void setInitValueConstant(Constant value);

} // NeverReadOperation
