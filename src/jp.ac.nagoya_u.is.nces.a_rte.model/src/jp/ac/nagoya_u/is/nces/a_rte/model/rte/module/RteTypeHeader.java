/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Type Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteType <em>Rte Type</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getRteTypeConstant <em>Rte Type Constant</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getProvidesSignalGroupTransmission <em>Provides Signal Group Transmission</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteTypeHeader()
 * @model
 * @generated
 */
public interface RteTypeHeader extends HeaderFile {
	/**
	 * Returns the value of the '<em><b>Rte Type</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Type</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteTypeHeader_RteType()
	 * @model
	 * @generated
	 */
	EList<Type> getRteType();

	/**
	 * Returns the value of the '<em><b>Rte Type Constant</b></em>' reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Constant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Type Constant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Type Constant</em>' reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteTypeHeader_RteTypeConstant()
	 * @model
	 * @generated
	 */
	EList<Constant> getRteTypeConstant();

	/**
	 * Returns the value of the '<em><b>Provides Signal Group Transmission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides Signal Group Transmission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides Signal Group Transmission</em>' attribute.
	 * @see #setProvidesSignalGroupTransmission(Boolean)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteTypeHeader_ProvidesSignalGroupTransmission()
	 * @model dataType="jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.Boolean" required="true"
	 * @generated
	 */
	Boolean getProvidesSignalGroupTransmission();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteTypeHeader#getProvidesSignalGroupTransmission <em>Provides Signal Group Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides Signal Group Transmission</em>' attribute.
	 * @see #getProvidesSignalGroupTransmission()
	 * @generated
	 */
	void setProvidesSignalGroupTransmission(Boolean value);

} // RteTypeHeader
