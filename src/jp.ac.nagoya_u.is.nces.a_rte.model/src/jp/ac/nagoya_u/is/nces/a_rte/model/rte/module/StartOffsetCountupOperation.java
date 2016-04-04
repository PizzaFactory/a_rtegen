/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Offset Countup Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getCounterVariable <em>Counter Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getMaxConstant <em>Max Constant</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getStartOffsetCountupOperation()
 * @model
 * @generated
 */
public interface StartOffsetCountupOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Counter Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Variable</em>' reference.
	 * @see #setCounterVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getStartOffsetCountupOperation_CounterVariable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getCounterVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getCounterVariable <em>Counter Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Variable</em>' reference.
	 * @see #getCounterVariable()
	 * @generated
	 */
	void setCounterVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Max Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Constant</em>' reference.
	 * @see #setMaxConstant(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getStartOffsetCountupOperation_MaxConstant()
	 * @model required="true"
	 * @generated
	 */
	Constant getMaxConstant();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.StartOffsetCountupOperation#getMaxConstant <em>Max Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Constant</em>' reference.
	 * @see #getMaxConstant()
	 * @generated
	 */
	void setMaxConstant(Constant value);

} // StartOffsetCountupOperation
