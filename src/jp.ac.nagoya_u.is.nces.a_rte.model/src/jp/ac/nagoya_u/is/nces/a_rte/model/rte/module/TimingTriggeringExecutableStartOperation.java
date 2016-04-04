/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timing Triggering Executable Start Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCyclePeriodConstant <em>Cycle Period Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleOffsetConstant <em>Cycle Offset Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetConstant <em>Start Offset Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetCounterVariable <em>Start Offset Counter Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleCounterVariable <em>Cycle Counter Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation()
 * @model
 * @generated
 */
public interface TimingTriggeringExecutableStartOperation extends ExecutableStartOperation {
	/**
	 * Returns the value of the '<em><b>Cycle Period Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Period Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Period Constant</em>' reference.
	 * @see #setCyclePeriodConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation_CyclePeriodConstant()
	 * @model
	 * @generated
	 */
	Constant getCyclePeriodConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCyclePeriodConstant <em>Cycle Period Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Period Constant</em>' reference.
	 * @see #getCyclePeriodConstant()
	 * @generated
	 */
	void setCyclePeriodConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Cycle Offset Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Offset Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Offset Constant</em>' reference.
	 * @see #setCycleOffsetConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation_CycleOffsetConstant()
	 * @model
	 * @generated
	 */
	Constant getCycleOffsetConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleOffsetConstant <em>Cycle Offset Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Offset Constant</em>' reference.
	 * @see #getCycleOffsetConstant()
	 * @generated
	 */
	void setCycleOffsetConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Start Offset Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Offset Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset Constant</em>' reference.
	 * @see #setStartOffsetConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation_StartOffsetConstant()
	 * @model
	 * @generated
	 */
	Constant getStartOffsetConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetConstant <em>Start Offset Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset Constant</em>' reference.
	 * @see #getStartOffsetConstant()
	 * @generated
	 */
	void setStartOffsetConstant(Constant value);

	/**
	 * Returns the value of the '<em><b>Start Offset Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Offset Counter Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Offset Counter Variable</em>' reference.
	 * @see #setStartOffsetCounterVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation_StartOffsetCounterVariable()
	 * @model
	 * @generated
	 */
	GlobalVariable getStartOffsetCounterVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getStartOffsetCounterVariable <em>Start Offset Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Offset Counter Variable</em>' reference.
	 * @see #getStartOffsetCounterVariable()
	 * @generated
	 */
	void setStartOffsetCounterVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Cycle Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cycle Counter Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cycle Counter Variable</em>' reference.
	 * @see #setCycleCounterVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getTimingTriggeringExecutableStartOperation_CycleCounterVariable()
	 * @model
	 * @generated
	 */
	GlobalVariable getCycleCounterVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.TimingTriggeringExecutableStartOperation#getCycleCounterVariable <em>Cycle Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cycle Counter Variable</em>' reference.
	 * @see #getCycleCounterVariable()
	 * @generated
	 */
	void setCycleCounterVariable(GlobalVariable value);

} // TimingTriggeringExecutableStartOperation
