/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schm Lifecycle Api File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApiFileContentsGroup#getSchmLifecycleApi <em>Schm Lifecycle Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmLifecycleApiFileContentsGroup()
 * @model
 * @generated
 */
public interface SchmLifecycleApiFileContentsGroup extends FunctionFileContentsGroup {
	/**
	 * Returns the value of the '<em><b>Schm Lifecycle Api</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SchmLifecycleApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schm Lifecycle Api</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schm Lifecycle Api</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getSchmLifecycleApiFileContentsGroup_SchmLifecycleApi()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.function.oclAsType(SchmLifecycleApi)->asOrderedSet()'"
	 * @generated
	 */
	EList<SchmLifecycleApi> getSchmLifecycleApi();

} // SchmLifecycleApiFileContentsGroup
