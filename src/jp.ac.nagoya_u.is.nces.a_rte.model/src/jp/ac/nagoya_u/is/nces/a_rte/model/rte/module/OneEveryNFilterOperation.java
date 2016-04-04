/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Every NFilter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOccurrenceVariable <em>Occurrence Variable</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getPeriod <em>Period</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOffset <em>Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOneEveryNFilterOperation()
 * @model
 * @generated
 */
public interface OneEveryNFilterOperation extends FilterOperation {
	/**
	 * Returns the value of the '<em><b>Occurrence Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Variable</em>' reference.
	 * @see #setOccurrenceVariable(GlobalVariable)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOneEveryNFilterOperation_OccurrenceVariable()
	 * @model required="true"
	 * @generated
	 */
	GlobalVariable getOccurrenceVariable();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOccurrenceVariable <em>Occurrence Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Variable</em>' reference.
	 * @see #getOccurrenceVariable()
	 * @generated
	 */
	void setOccurrenceVariable(GlobalVariable value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' reference.
	 * @see #setPeriod(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOneEveryNFilterOperation_Period()
	 * @model required="true"
	 * @generated
	 */
	Constant getPeriod();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getPeriod <em>Period</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Constant value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' reference.
	 * @see #setOffset(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getOneEveryNFilterOperation_Offset()
	 * @model required="true"
	 * @generated
	 */
	Constant getOffset();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.OneEveryNFilterOperation#getOffset <em>Offset</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Constant value);

} // OneEveryNFilterOperation
