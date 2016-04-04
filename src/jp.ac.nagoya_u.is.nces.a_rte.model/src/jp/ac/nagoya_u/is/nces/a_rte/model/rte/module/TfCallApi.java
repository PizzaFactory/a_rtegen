/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tf Call Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfParamTypeName <em>Cs Tf Param Type Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfArgcConstantName <em>Cs Tf Argc Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfOpidConstantName <em>Cs Tf Opid Constant Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfName <em>Cs Tf Name</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getNeedsCheckArg <em>Needs Check Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi()
 * @model
 * @generated
 */
public interface TfCallApi extends CallApi {
	/**
	 * Returns the value of the '<em><b>Cs Tf Param Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Param Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Param Type Name</em>' attribute.
	 * @see #setCsTfParamTypeName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi_CsTfParamTypeName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getCsTfParamTypeName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfParamTypeName <em>Cs Tf Param Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Tf Param Type Name</em>' attribute.
	 * @see #getCsTfParamTypeName()
	 * @generated
	 */
	void setCsTfParamTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Cs Tf Argc Constant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Argc Constant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Argc Constant Name</em>' attribute.
	 * @see #setCsTfArgcConstantName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi_CsTfArgcConstantName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getCsTfArgcConstantName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfArgcConstantName <em>Cs Tf Argc Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Tf Argc Constant Name</em>' attribute.
	 * @see #getCsTfArgcConstantName()
	 * @generated
	 */
	void setCsTfArgcConstantName(String value);

	/**
	 * Returns the value of the '<em><b>Cs Tf Opid Constant Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Opid Constant Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Opid Constant Name</em>' attribute.
	 * @see #setCsTfOpidConstantName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi_CsTfOpidConstantName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getCsTfOpidConstantName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfOpidConstantName <em>Cs Tf Opid Constant Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Tf Opid Constant Name</em>' attribute.
	 * @see #getCsTfOpidConstantName()
	 * @generated
	 */
	void setCsTfOpidConstantName(String value);

	/**
	 * Returns the value of the '<em><b>Cs Tf Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cs Tf Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cs Tf Name</em>' attribute.
	 * @see #setCsTfName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi_CsTfName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.CIdentifier" required="true"
	 * @generated
	 */
	String getCsTfName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getCsTfName <em>Cs Tf Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cs Tf Name</em>' attribute.
	 * @see #getCsTfName()
	 * @generated
	 */
	void setCsTfName(String value);

	/**
	 * Returns the value of the '<em><b>Needs Check Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Needs Check Arg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs Check Arg</em>' attribute.
	 * @see #setNeedsCheckArg(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTfCallApi_NeedsCheckArg()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getNeedsCheckArg();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TfCallApi#getNeedsCheckArg <em>Needs Check Arg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Needs Check Arg</em>' attribute.
	 * @see #getNeedsCheckArg()
	 * @generated
	 */
	void setNeedsCheckArg(Boolean value);

} // TfCallApi
