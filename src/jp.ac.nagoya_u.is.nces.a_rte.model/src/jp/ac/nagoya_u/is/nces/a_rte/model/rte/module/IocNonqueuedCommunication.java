/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Nonqueued Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getWriteApi <em>Write Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getReadApi <em>Read Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValue <em>Init Value</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValueVariable <em>Init Value Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedCommunication()
 * @model
 * @generated
 */
public interface IocNonqueuedCommunication extends IocCommunication {
	/**
	 * Returns the value of the '<em><b>Write Api</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Write Api</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Api</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedCommunication_WriteApi()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocWriteApi#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IocWriteApi> getWriteApi();

	/**
	 * Returns the value of the '<em><b>Read Api</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Api</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Api</em>' containment reference.
	 * @see #setReadApi(IocReadApi)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedCommunication_ReadApi()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IocReadApi getReadApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getReadApi <em>Read Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Api</em>' containment reference.
	 * @see #getReadApi()
	 * @generated
	 */
	void setReadApi(IocReadApi value);

	/**
	 * Returns the value of the '<em><b>Init Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value</em>' reference.
	 * @see #setInitValue(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedCommunication_InitValue()
	 * @model required="true"
	 * @generated
	 */
	Constant getInitValue();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValue <em>Init Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value</em>' reference.
	 * @see #getInitValue()
	 * @generated
	 */
	void setInitValue(Constant value);

	/**
	 * Returns the value of the '<em><b>Init Value Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Value Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Value Variable</em>' reference.
	 * @see #setInitValueVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocNonqueuedCommunication_InitValueVariable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getInitValueVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocNonqueuedCommunication#getInitValueVariable <em>Init Value Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Value Variable</em>' reference.
	 * @see #getInitValueVariable()
	 * @generated
	 */
	void setInitValueVariable(GlobalVariable value);

} // IocNonqueuedCommunication
