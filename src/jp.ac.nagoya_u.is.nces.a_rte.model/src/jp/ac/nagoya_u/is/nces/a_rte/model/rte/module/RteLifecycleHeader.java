/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Lifecycle Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getRteLifecycleApiGroup <em>Rte Lifecycle Api Group</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleHeader#getSchmLifecycleApiGroup <em>Schm Lifecycle Api Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteLifecycleHeader()
 * @model
 * @generated
 */
public interface RteLifecycleHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Rte Lifecycle Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteLifecycleApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Lifecycle Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Lifecycle Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteLifecycleHeader_RteLifecycleApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteLifecycleApiFileContentsGroup> getRteLifecycleApiGroup();

	/**
	 * Returns the value of the '<em><b>Schm Lifecycle Api Group</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Lifecycle Api Group</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Lifecycle Api Group</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteLifecycleHeader_SchmLifecycleApiGroup()
	 * @model containment="true"
	 * @generated
	 */
	EList<SchmLifecycleApiFileContentsGroup> getSchmLifecycleApiGroup();

} // RteLifecycleHeader
