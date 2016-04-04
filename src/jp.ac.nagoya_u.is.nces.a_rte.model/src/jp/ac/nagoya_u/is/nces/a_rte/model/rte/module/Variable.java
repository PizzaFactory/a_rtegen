/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getType <em>Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getMember <em>Member</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getSymbolName <em>Symbol Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariable()
 * @model abstract="true"
 * @generated
 */
public interface Variable extends Value {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember}.
	 * It is bidirectional and its opposite is '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariable_Member()
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.VariableMember#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<VariableMember> getMember();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getVariable_SymbolName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getSymbolName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Variable#getSymbolName <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Name</em>' attribute.
	 * @see #getSymbolName()
	 * @generated
	 */
	void setSymbolName(String value);

} // Variable
