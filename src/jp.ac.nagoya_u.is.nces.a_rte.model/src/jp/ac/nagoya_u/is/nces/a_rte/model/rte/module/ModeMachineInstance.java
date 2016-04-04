/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Machine Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getRequestModeQueueType <em>Request Mode Queue Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getRequestModeQueue <em>Request Mode Queue</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getCurrentModeVariable <em>Current Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getNextModeVariable <em>Next Mode Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getInitModeConstant <em>Init Mode Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance()
 * @model
 * @generated
 */
public interface ModeMachineInstance extends ModuleReferrable {
	/**
	 * Returns the value of the '<em><b>Request Mode Queue Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Mode Queue Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Mode Queue Type</em>' containment reference.
	 * @see #setRequestModeQueueType(ModeQueueType)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance_RequestModeQueueType()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeQueueType getRequestModeQueueType();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getRequestModeQueueType <em>Request Mode Queue Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Mode Queue Type</em>' containment reference.
	 * @see #getRequestModeQueueType()
	 * @generated
	 */
	void setRequestModeQueueType(ModeQueueType value);

	/**
	 * Returns the value of the '<em><b>Request Mode Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Mode Queue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Mode Queue</em>' containment reference.
	 * @see #setRequestModeQueue(ModeQueuedVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance_RequestModeQueue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ModeQueuedVariable getRequestModeQueue();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getRequestModeQueue <em>Request Mode Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Mode Queue</em>' containment reference.
	 * @see #getRequestModeQueue()
	 * @generated
	 */
	void setRequestModeQueue(ModeQueuedVariable value);

	/**
	 * Returns the value of the '<em><b>Current Mode Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Mode Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Mode Variable</em>' containment reference.
	 * @see #setCurrentModeVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance_CurrentModeVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalVariable getCurrentModeVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getCurrentModeVariable <em>Current Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Mode Variable</em>' containment reference.
	 * @see #getCurrentModeVariable()
	 * @generated
	 */
	void setCurrentModeVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Next Mode Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Mode Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Mode Variable</em>' containment reference.
	 * @see #setNextModeVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance_NextModeVariable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GlobalVariable getNextModeVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getNextModeVariable <em>Next Mode Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Mode Variable</em>' containment reference.
	 * @see #getNextModeVariable()
	 * @generated
	 */
	void setNextModeVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Init Mode Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Mode Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Mode Constant</em>' reference.
	 * @see #setInitModeConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getModeMachineInstance_InitModeConstant()
	 * @model required="true"
	 * @generated
	 */
	Constant getInitModeConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModeMachineInstance#getInitModeConstant <em>Init Mode Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Mode Constant</em>' reference.
	 * @see #getInitModeConstant()
	 * @generated
	 */
	void setInitModeConstant(Constant value);

} // ModeMachineInstance
