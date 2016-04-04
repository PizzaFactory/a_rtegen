/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interlink Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getSchmApiGroup <em>Schm Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader#getConstant <em>Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleInterlinkHeader()
 * @model
 * @generated
 */
public interface ModuleInterlinkHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Global Variable Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.GlobalVariableFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Variable Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Variable Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleInterlinkHeader_GlobalVariableGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup();

	/**
	 * Returns the value of the '<em><b>Schm Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleInterlinkHeader_SchmApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchmApiFileContentsGroup> getSchmApiGroup();

	/**
	 * Returns the value of the '<em><b>Dependent Executable Entity Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ExecutableEntityFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Executable Entity Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Executable Entity Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleInterlinkHeader_DependentExecutableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableEntityFileContentsGroup> getDependentExecutableEntityGroup();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModuleInterlinkHeader_Constant()
	 * @model
	 * @generated
	 */
	EList<Constant> getConstant();

} // ModuleInterlinkHeader
