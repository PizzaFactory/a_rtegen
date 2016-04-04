/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Runnable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * NOTE 本モデル要素のstartExecutableは、必ずRunnableEntityのインスタンスとすること
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ServerRunnableStartOperation#getStartServerRunnable <em>Start Server Runnable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getServerRunnableStartOperation()
 * @model
 * @generated
 */
public interface ServerRunnableStartOperation extends ExecutableStartOperation {
	/**
	 * Returns the value of the '<em><b>Start Server Runnable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Server Runnable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Server Runnable</em>' reference.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getServerRunnableStartOperation_StartServerRunnable()
	 * @model resolveProxies="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.startExecutable.oclAsType(RunnableEntity)'"
	 * @generated
	 */
	RunnableEntity getStartServerRunnable();

} // ServerRunnableStartOperation
