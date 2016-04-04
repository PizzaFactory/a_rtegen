/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Irv Read Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi#getDataParam <em>Data Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvReadApi()
 * @model
 * @generated
 */
public interface IrvReadApi extends RteApi {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(IrvReadOperation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvReadApi_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IrvReadOperation getOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(IrvReadOperation value);

	/**
	 * Returns the value of the '<em><b>Data Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Param</em>' reference.
	 * @see #setDataParam(Parameter)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIrvReadApi_DataParam()
	 * @model
	 * @generated
	 */
	Parameter getDataParam();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IrvReadApi#getDataParam <em>Data Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Param</em>' reference.
	 * @see #getDataParam()
	 * @generated
	 */
	void setDataParam(Parameter value);

} // IrvReadApi
