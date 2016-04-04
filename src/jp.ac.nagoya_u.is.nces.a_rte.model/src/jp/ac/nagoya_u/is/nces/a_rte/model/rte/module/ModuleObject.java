/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSource <em>Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSingleSource <em>Single Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleObject()
 * @model abstract="true"
 * @extends ExtendedEObject
 * @generated
 */
public interface ModuleObject extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleObject_Source()
	 * @model ordered="false"
	 * @generated
	 */
	EList<EObject> getSource();

	/**
	 * Returns the value of the '<em><b>Single Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Source</em>' reference.
	 * @see #setSingleSource(EObject)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleObject_SingleSource()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EObject getSingleSource();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getSingleSource <em>Single Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Source</em>' reference.
	 * @see #getSingleSource()
	 * @generated
	 */
	void setSingleSource(EObject value);

	/**
	 * Returns the value of the '<em><b>Role Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * モジュールオブジェクトのロール名．（例：フィルタ過去値用の定数であることを示すために，"filterOldValue"を設定する）
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Name</em>' attribute.
	 * @see #setRoleName(String)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleObject_RoleName()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.String"
	 * @generated
	 */
	String getRoleName();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleObject#getRoleName <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Name</em>' attribute.
	 * @see #getRoleName()
	 * @generated
	 */
	void setRoleName(String value);

} // ModuleObject
