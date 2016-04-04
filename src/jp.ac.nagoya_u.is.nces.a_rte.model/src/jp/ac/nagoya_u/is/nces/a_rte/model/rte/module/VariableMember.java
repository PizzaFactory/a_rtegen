/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariableMember()
 * @model
 * @generated
 */
public interface VariableMember extends Variable {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Variable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariableMember_Parent()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getMember
	 * @model opposite="member" required="true" transient="false"
	 * @generated
	 */
	Variable getParent();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Variable value);

} // VariableMember
