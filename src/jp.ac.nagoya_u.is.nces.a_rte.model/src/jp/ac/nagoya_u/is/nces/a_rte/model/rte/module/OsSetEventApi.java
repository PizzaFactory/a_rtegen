/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Set Event Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsTaskId <em>Os Task Id</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsEventId <em>Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsSetEventApi()
 * @model
 * @generated
 */
public interface OsSetEventApi extends OsApi {
	/**
	 * Returns the value of the '<em><b>Os Task Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Task Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Task Id</em>' attribute.
	 * @see #setOsTaskId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsSetEventApi_OsTaskId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOsTaskId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsTaskId <em>Os Task Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Task Id</em>' attribute.
	 * @see #getOsTaskId()
	 * @generated
	 */
	void setOsTaskId(String value);

	/**
	 * Returns the value of the '<em><b>Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Event Id</em>' attribute.
	 * @see #setOsEventId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsSetEventApi_OsEventId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOsEventId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSetEventApi#getOsEventId <em>Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Event Id</em>' attribute.
	 * @see #getOsEventId()
	 * @generated
	 */
	void setOsEventId(String value);

} // OsSetEventApi
