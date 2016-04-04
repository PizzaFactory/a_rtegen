/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Buffer Queue Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getMaxLengthConstant <em>Max Length Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferQueueType()
 * @model
 * @generated
 */
public interface RteBufferQueueType extends Type {
	/**
	 * Returns the value of the '<em><b>Max Length Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length Constant</em>' reference.
	 * @see #setMaxLengthConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferQueueType_MaxLengthConstant()
	 * @model required="true"
	 * @generated
	 */
	Constant getMaxLengthConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getMaxLengthConstant <em>Max Length Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length Constant</em>' reference.
	 * @see #getMaxLengthConstant()
	 * @generated
	 */
	void setMaxLengthConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Type)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteBufferQueueType_ElementType()
	 * @model required="true"
	 * @generated
	 */
	Type getElementType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteBufferQueueType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Type value);

} // RteBufferQueueType
