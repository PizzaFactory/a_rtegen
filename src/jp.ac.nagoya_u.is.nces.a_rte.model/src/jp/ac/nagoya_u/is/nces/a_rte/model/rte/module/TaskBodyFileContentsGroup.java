/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Body File Contents Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBodyFileContentsGroup#getTaskBody <em>Task Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTaskBodyFileContentsGroup()
 * @model
 * @generated
 */
public interface TaskBodyFileContentsGroup extends FunctionFileContentsGroup {
	/**
	 * Returns the value of the '<em><b>Task Body</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TaskBody}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Body</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Body</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTaskBodyFileContentsGroup_TaskBody()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.function.oclAsType(TaskBody)->asOrderedSet()'"
	 * @generated
	 */
	EList<TaskBody> getTaskBody();

} // TaskBodyFileContentsGroup
