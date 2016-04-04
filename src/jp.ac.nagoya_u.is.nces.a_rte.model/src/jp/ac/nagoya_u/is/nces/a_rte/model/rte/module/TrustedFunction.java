/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trusted Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction#getTrustedFunctionIndex <em>Trusted Function Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunction()
 * @model abstract="true"
 * @generated
 */
public interface TrustedFunction extends Function {
	/**
	 * Returns the value of the '<em><b>Trusted Function Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trusted Function Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trusted Function Index</em>' attribute.
	 * @see #setTrustedFunctionIndex(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTrustedFunction_TrustedFunctionIndex()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getTrustedFunctionIndex();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TrustedFunction#getTrustedFunctionIndex <em>Trusted Function Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trusted Function Index</em>' attribute.
	 * @see #getTrustedFunctionIndex()
	 * @generated
	 */
	void setTrustedFunctionIndex(String value);

} // TrustedFunction
