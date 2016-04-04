/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ioc Initialize Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocInitializeOperation#getInitIocApi <em>Init Ioc Api</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocInitializeOperation()
 * @model
 * @generated
 */
public interface IocInitializeOperation extends InitializeOperation {
	/**
	 * Returns the value of the '<em><b>Init Ioc Api</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.IocApi}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Ioc Api</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Ioc Api</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getIocInitializeOperation_InitIocApi()
	 * @model
	 * @generated
	 */
	EList<IocApi> getInitIocApi();

} // IocInitializeOperation
