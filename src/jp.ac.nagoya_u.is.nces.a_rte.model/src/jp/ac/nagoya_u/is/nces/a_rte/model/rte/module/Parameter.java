/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getPassType <em>Pass Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getHasConst <em>Has Const</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Variable {
	/**
	 * Returns the value of the '<em><b>Pass Type</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pass Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pass Type</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum
	 * @see #setPassType(ParameterPassTypeEnum)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getParameter_PassType()
	 * @model required="true"
	 * @generated
	 */
	ParameterPassTypeEnum getPassType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getPassType <em>Pass Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Type</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterPassTypeEnum
	 * @see #getPassType()
	 * @generated
	 */
	void setPassType(ParameterPassTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum
	 * @see #setDirection(ParameterDirectionEnum)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getParameter_Direction()
	 * @model required="true"
	 * @generated
	 */
	ParameterDirectionEnum getDirection();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ParameterDirectionEnum
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionEnum value);

	/**
	 * Returns the value of the '<em><b>Has Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Const</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Const</em>' attribute.
	 * @see #setHasConst(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getParameter_HasConst()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getHasConst();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Parameter#getHasConst <em>Has Const</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Const</em>' attribute.
	 * @see #getHasConst()
	 * @generated
	 */
	void setHasConst(Boolean value);

} // Parameter
