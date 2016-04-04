/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Redefinition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType#getSourceType <em>Source Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRedefinitionType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RedefinitionType extends Type {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRedefinitionType_SourceType()
	 * @model required="true"
	 * @generated
	 */
	Type getSourceType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RedefinitionType#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(Type value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 大元のTypeを取得する
	 * <!-- end-model-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='if sourceType.oclIsKindOf(RedefinitionType)\n\t\t\tthen sourceType.oclAsType(RedefinitionType).getLeafType()\n\t\t\telse sourceType\n\t\t\tendif'"
	 * @generated
	 */
	Type getLeafType();

} // RedefinitionType
