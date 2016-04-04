/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Spinlock Exclude Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation#getOsSpinlockId <em>Os Spinlock Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsSpinlockExcludeOperation()
 * @model
 * @generated
 */
public interface OsSpinlockExcludeOperation extends ExcludeOperation {
	/**
	 * Returns the value of the '<em><b>Os Spinlock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os Spinlock Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Spinlock Id</em>' attribute.
	 * @see #setOsSpinlockId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsSpinlockExcludeOperation_OsSpinlockId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOsSpinlockId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsSpinlockExcludeOperation#getOsSpinlockId <em>Os Spinlock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Spinlock Id</em>' attribute.
	 * @see #getOsSpinlockId()
	 * @generated
	 */
	void setOsSpinlockId(String value);

} // OsSpinlockExcludeOperation
