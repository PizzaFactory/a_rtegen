/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSymbolName <em>Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getIsAnonymous <em>Is Anonymous</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSignedness <em>Signedness</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getOriginalTypeSymbolName <em>Original Type Symbol Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType()
 * @model abstract="true"
 * @generated
 */
public interface Type extends ModuleReferrable {
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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType_SymbolName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getSymbolName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSymbolName <em>Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Name</em>' attribute.
	 * @see #getSymbolName()
	 * @generated
	 */
	void setSymbolName(String value);

	/**
	 * Returns the value of the '<em><b>Is Anonymous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Anonymous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Anonymous</em>' attribute.
	 * @see #setIsAnonymous(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType_IsAnonymous()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsAnonymous();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getIsAnonymous <em>Is Anonymous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Anonymous</em>' attribute.
	 * @see #getIsAnonymous()
	 * @generated
	 */
	void setIsAnonymous(Boolean value);

	/**
	 * Returns the value of the '<em><b>Signedness</b></em>' attribute.
	 * The literals are from the enumeration {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signedness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signedness</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum
	 * @see #setSignedness(SignednessEnum)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType_Signedness()
	 * @model required="true"
	 * @generated
	 */
	SignednessEnum getSignedness();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSignedness <em>Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signedness</em>' attribute.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SignednessEnum
	 * @see #getSignedness()
	 * @generated
	 */
	void setSignedness(SignednessEnum value);

	/**
	 * Returns the value of the '<em><b>Original Type Symbol Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Type Symbol Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Type Symbol Name</em>' attribute.
	 * @see #setOriginalTypeSymbolName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType_OriginalTypeSymbolName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getOriginalTypeSymbolName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getOriginalTypeSymbolName <em>Original Type Symbol Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Type Symbol Name</em>' attribute.
	 * @see #getOriginalTypeSymbolName()
	 * @generated
	 */
	void setOriginalTypeSymbolName(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getType_Size()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Integer" required="true"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // Type
