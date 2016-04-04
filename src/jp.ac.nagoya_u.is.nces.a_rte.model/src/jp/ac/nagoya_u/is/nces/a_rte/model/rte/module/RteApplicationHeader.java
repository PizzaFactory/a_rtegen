/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Application Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getHasInlineApi <em>Has Inline Api</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getSourceMacro <em>Source Macro</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getGlobalVariableGroup <em>Global Variable Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getRteApiGroup <em>Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getDeclarationsRteApiGroup <em>Declarations Rte Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getConstant <em>Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getDependentExecutableEntityGroup <em>Dependent Executable Entity Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader()
 * @model
 * @generated
 */
public interface RteApplicationHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Has Inline Api</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Inline Api</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Inline Api</em>' attribute.
	 * @see #setHasInlineApi(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_HasInlineApi()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getHasInlineApi();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader#getHasInlineApi <em>Has Inline Api</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Inline Api</em>' attribute.
	 * @see #getHasInlineApi()
	 * @generated
	 */
	void setHasInlineApi(Boolean value);

	/**
	 * Returns the value of the '<em><b>Source Macro</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Macro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Macro</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Macro</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_SourceMacro()
	 * @model
	 * @generated
	 */
	EList<Macro> getSourceMacro();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_GlobalVariableGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlobalVariableFileContentsGroup> getGlobalVariableGroup();

	/**
	 * Returns the value of the '<em><b>Rte Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_RteApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApiFileContentsGroup> getRteApiGroup();

	/**
	 * Returns the value of the '<em><b>Declarations Rte Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declarations Rte Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declarations Rte Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_DeclarationsRteApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApiFileContentsGroup> getDeclarationsRteApiGroup();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_Constant()
	 * @model
	 * @generated
	 */
	EList<Constant> getConstant();

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
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteApplicationHeader_DependentExecutableEntityGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExecutableEntityFileContentsGroup> getDependentExecutableEntityGroup();

} // RteApplicationHeader
