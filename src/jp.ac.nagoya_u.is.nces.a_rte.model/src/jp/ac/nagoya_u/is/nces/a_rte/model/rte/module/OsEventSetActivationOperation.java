/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Os Event Set Activation Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation#getActivationOsEventId <em>Activation Os Event Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetActivationOperation()
 * @model
 * @generated
 */
public interface OsEventSetActivationOperation extends ContextActivationOperation {
	/**
	 * Returns the value of the '<em><b>Activation Os Event Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Os Event Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Os Event Id</em>' attribute.
	 * @see #setActivationOsEventId(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOsEventSetActivationOperation_ActivationOsEventId()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getActivationOsEventId();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OsEventSetActivationOperation#getActivationOsEventId <em>Activation Os Event Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Os Event Id</em>' attribute.
	 * @see #getActivationOsEventId()
	 * @generated
	 */
	void setActivationOsEventId(String value);

} // OsEventSetActivationOperation
