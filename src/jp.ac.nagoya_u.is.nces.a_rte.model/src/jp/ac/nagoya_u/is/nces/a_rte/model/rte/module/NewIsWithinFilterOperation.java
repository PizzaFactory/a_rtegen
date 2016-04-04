/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Is Within Filter Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMin <em>Min</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getNewIsWithinFilterOperation()
 * @model
 * @generated
 */
public interface NewIsWithinFilterOperation extends FilterOperation {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' reference.
	 * @see #setMin(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getNewIsWithinFilterOperation_Min()
	 * @model required="true"
	 * @generated
	 */
	Constant getMin();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMin <em>Min</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Constant value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' reference.
	 * @see #setMax(Constant)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getNewIsWithinFilterOperation_Max()
	 * @model required="true"
	 * @generated
	 */
	Constant getMax();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.NewIsWithinFilterOperation#getMax <em>Max</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Constant value);

} // NewIsWithinFilterOperation
