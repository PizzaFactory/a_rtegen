/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRteModule <em>Rte Module</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRte <em>Rte</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleRoot()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface ModuleRoot extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Rte Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Module</em>' containment reference.
	 * @see #setRteModule(RteModule)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleRoot_RteModule()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteModule getRteModule();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRteModule <em>Rte Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Module</em>' containment reference.
	 * @see #getRteModule()
	 * @generated
	 */
	void setRteModule(RteModule value);

	/**
	 * Returns the value of the '<em><b>Rte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte</em>' containment reference.
	 * @see #setRte(Rte)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleRoot_Rte()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Rte getRte();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleRoot#getRte <em>Rte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte</em>' containment reference.
	 * @see #getRte()
	 * @generated
	 */
	void setRte(Rte value);

} // ModuleRoot
