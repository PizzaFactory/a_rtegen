/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro#getSymbolName <em>Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMacro()
 * @model
 * @generated
 */
public interface Macro extends ModuleReferrable {
	/**
	 * Returns the value of the '<em><b>Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Name</em>' attribute.
	 * @see #setSymbolName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getMacro_SymbolName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.CIdentifier" required="true"
	 * @generated
	 */
	String getSymbolName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro#getSymbolName <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Name</em>' attribute.
	 * @see #getSymbolName()
	 * @generated
	 */
	void setSymbolName(String value);

} // Macro
