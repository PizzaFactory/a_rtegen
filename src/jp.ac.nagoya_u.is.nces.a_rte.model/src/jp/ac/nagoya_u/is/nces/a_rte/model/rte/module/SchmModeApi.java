/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schm Mode Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi#getModeDeclarationGroup <em>Mode Declaration Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi#getModeMachineInstance <em>Mode Machine Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmModeApi()
 * @model
 * @generated
 */
public interface SchmModeApi extends SchmApi {
	/**
	 * Returns the value of the '<em><b>Mode Declaration Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Declaration Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Declaration Group</em>' reference.
	 * @see #setModeDeclarationGroup(ModeDeclarationGroup)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmModeApi_ModeDeclarationGroup()
	 * @model required="true"
	 * @generated
	 */
	ModeDeclarationGroup getModeDeclarationGroup();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi#getModeDeclarationGroup <em>Mode Declaration Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Declaration Group</em>' reference.
	 * @see #getModeDeclarationGroup()
	 * @generated
	 */
	void setModeDeclarationGroup(ModeDeclarationGroup value);

	/**
	 * Returns the value of the '<em><b>Mode Machine Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode Machine Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode Machine Instance</em>' reference.
	 * @see #setModeMachineInstance(ModeMachineInstance)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmModeApi_ModeMachineInstance()
	 * @model
	 * @generated
	 */
	ModeMachineInstance getModeMachineInstance();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmModeApi#getModeMachineInstance <em>Mode Machine Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode Machine Instance</em>' reference.
	 * @see #getModeMachineInstance()
	 * @generated
	 */
	void setModeMachineInstance(ModeMachineInstance value);

} // SchmModeApi
