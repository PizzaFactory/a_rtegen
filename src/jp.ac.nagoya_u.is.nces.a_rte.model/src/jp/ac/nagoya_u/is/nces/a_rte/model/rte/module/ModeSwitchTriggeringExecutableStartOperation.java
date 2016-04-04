/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Switch Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeSwitchTriggeringExecutableStartOperation#getStartMode <em>Start Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeSwitchTriggeringExecutableStartOperation()
 * @model
 * @generated
 */
public interface ModeSwitchTriggeringExecutableStartOperation extends ExecutableStartOperation {
	/**
	 * Returns the value of the '<em><b>Start Mode</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Mode</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Mode</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeSwitchTriggeringExecutableStartOperation_StartMode()
	 * @model
	 * @generated
	 */
	EList<Constant> getStartMode();

} // ModeSwitchTriggeringExecutableStartOperation
