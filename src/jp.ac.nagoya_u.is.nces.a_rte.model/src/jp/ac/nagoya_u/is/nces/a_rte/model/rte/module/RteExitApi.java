/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Exit Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getOperation <em>Operation</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getIsNoneExclude <em>Is None Exclude</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteExitApi()
 * @model
 * @generated
 */
public interface RteExitApi extends RteApi {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(ExcludeOperation)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteExitApi_Operation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExcludeOperation getOperation();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(ExcludeOperation value);

	/**
	 * Returns the value of the '<em><b>Is None Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is None Exclude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is None Exclude</em>' attribute.
	 * @see #setIsNoneExclude(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteExitApi_IsNoneExclude()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getIsNoneExclude();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteExitApi#getIsNoneExclude <em>Is None Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is None Exclude</em>' attribute.
	 * @see #getIsNoneExclude()
	 * @generated
	 */
	void setIsNoneExclude(Boolean value);

} // RteExitApi
