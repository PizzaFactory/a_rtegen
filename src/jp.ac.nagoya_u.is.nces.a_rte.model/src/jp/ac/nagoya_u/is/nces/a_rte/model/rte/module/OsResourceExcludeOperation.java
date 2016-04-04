/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Resource Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation#getOsResourceId <em>Os Resource Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsResourceExcludeOperation()
 * @model
 * @generated
 */
public interface OsResourceExcludeOperation extends ExcludeOperation {
	/**
	 * Returns the value of the '<em><b>Os Resource Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Resource Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Resource Id</em>' attribute.
	 * @see #setOsResourceId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsResourceExcludeOperation_OsResourceId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOsResourceId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsResourceExcludeOperation#getOsResourceId <em>Os Resource Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Resource Id</em>' attribute.
	 * @see #getOsResourceId()
	 * @generated
	 */
	void setOsResourceId(String value);

} // OsResourceExcludeOperation
