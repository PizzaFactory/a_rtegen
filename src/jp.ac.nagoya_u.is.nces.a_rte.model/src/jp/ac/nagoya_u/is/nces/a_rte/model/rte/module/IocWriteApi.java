/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Write Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocWriteApi()
 * @model
 * @generated
 */
public interface IocWriteApi extends IocApi {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getWriteApi <em>Write Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(IocNonqueuedCommunication)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocWriteApi_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getWriteApi
	 * @model opposite="writeApi" required="true" transient="false"
	 * @generated
	 */
	IocNonqueuedCommunication getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(IocNonqueuedCommunication value);

} // IocWriteApi
