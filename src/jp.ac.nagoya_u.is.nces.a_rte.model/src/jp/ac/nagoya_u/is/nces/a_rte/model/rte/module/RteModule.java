/**
 */
package jp.ac.nagoya_u.is.nces.a_rte.model.rte.module;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rte Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getDependentHeader <em>Dependent Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getBswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getSwcMemoryMappingHeader <em>Swc Memory Mapping Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteHeader <em>Rte Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteTypeHeader <em>Rte Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationTypeHeader <em>Rte Application Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteApplicationHeader <em>Rte Application Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkTypeHeader <em>Module Interlink Type Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getModuleInterlinkHeader <em>Module Interlink Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteLifecycleHeader <em>Rte Lifecycle Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteConfigurationHeader <em>Rte Configuration Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteVfbTraceHeader <em>Rte Vfb Trace Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCallbackHeader <em>Rte Callback Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteUtilityHeader <em>Rte Utility Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteBswApiHeader <em>Rte Bsw Api Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonHeader <em>Rte Common Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionHeader <em>Rte Partition Header</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonSource <em>Rte Common Source</em>}</li>
 *   <li>{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRtePartitionSource <em>Rte Partition Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule()
 * @model
 * @extends ExtendedEObject
 * @generated
 */
public interface RteModule extends ExtendedEObject {
	/**
	 * Returns the value of the '<em><b>Dependent Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.HeaderFile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependent Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_DependentHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<HeaderFile> getDependentHeader();

	/**
	 * Returns the value of the '<em><b>Bsw Memory Mapping Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bsw Memory Mapping Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bsw Memory Mapping Header</em>' containment reference.
	 * @see #setBswMemoryMappingHeader(BswMemoryMappingHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_BswMemoryMappingHeader()
	 * @model containment="true"
	 * @generated
	 */
	BswMemoryMappingHeader getBswMemoryMappingHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getBswMemoryMappingHeader <em>Bsw Memory Mapping Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bsw Memory Mapping Header</em>' containment reference.
	 * @see #getBswMemoryMappingHeader()
	 * @generated
	 */
	void setBswMemoryMappingHeader(BswMemoryMappingHeader value);

	/**
	 * Returns the value of the '<em><b>Swc Memory Mapping Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.SwcMemoryMappingHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swc Memory Mapping Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swc Memory Mapping Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_SwcMemoryMappingHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<SwcMemoryMappingHeader> getSwcMemoryMappingHeader();

	/**
	 * Returns the value of the '<em><b>Rte Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Header</em>' containment reference.
	 * @see #setRteHeader(RteHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteHeader getRteHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteHeader <em>Rte Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Header</em>' containment reference.
	 * @see #getRteHeader()
	 * @generated
	 */
	void setRteHeader(RteHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Type Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Type Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Type Header</em>' containment reference.
	 * @see #setRteTypeHeader(RteTypeHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteTypeHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteTypeHeader getRteTypeHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteTypeHeader <em>Rte Type Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Type Header</em>' containment reference.
	 * @see #getRteTypeHeader()
	 * @generated
	 */
	void setRteTypeHeader(RteTypeHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Application Type Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationTypeHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Application Type Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Application Type Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteApplicationTypeHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApplicationTypeHeader> getRteApplicationTypeHeader();

	/**
	 * Returns the value of the '<em><b>Rte Application Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteApplicationHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Application Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Application Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteApplicationHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteApplicationHeader> getRteApplicationHeader();

	/**
	 * Returns the value of the '<em><b>Module Interlink Type Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkTypeHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Interlink Type Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Interlink Type Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_ModuleInterlinkTypeHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleInterlinkTypeHeader> getModuleInterlinkTypeHeader();

	/**
	 * Returns the value of the '<em><b>Module Interlink Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModuleInterlinkHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Interlink Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Interlink Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_ModuleInterlinkHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModuleInterlinkHeader> getModuleInterlinkHeader();

	/**
	 * Returns the value of the '<em><b>Rte Lifecycle Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Lifecycle Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Lifecycle Header</em>' containment reference.
	 * @see #setRteLifecycleHeader(RteLifecycleHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteLifecycleHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteLifecycleHeader getRteLifecycleHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteLifecycleHeader <em>Rte Lifecycle Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Lifecycle Header</em>' containment reference.
	 * @see #getRteLifecycleHeader()
	 * @generated
	 */
	void setRteLifecycleHeader(RteLifecycleHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Configuration Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Configuration Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Configuration Header</em>' containment reference.
	 * @see #setRteConfigurationHeader(RteConfigurationHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteConfigurationHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteConfigurationHeader getRteConfigurationHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteConfigurationHeader <em>Rte Configuration Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Configuration Header</em>' containment reference.
	 * @see #getRteConfigurationHeader()
	 * @generated
	 */
	void setRteConfigurationHeader(RteConfigurationHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Vfb Trace Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Vfb Trace Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Vfb Trace Header</em>' containment reference.
	 * @see #setRteVfbTraceHeader(RteVfbTraceHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteVfbTraceHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteVfbTraceHeader getRteVfbTraceHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteVfbTraceHeader <em>Rte Vfb Trace Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Vfb Trace Header</em>' containment reference.
	 * @see #getRteVfbTraceHeader()
	 * @generated
	 */
	void setRteVfbTraceHeader(RteVfbTraceHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Callback Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Callback Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Callback Header</em>' containment reference.
	 * @see #setRteCallbackHeader(RteCallbackHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteCallbackHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteCallbackHeader getRteCallbackHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCallbackHeader <em>Rte Callback Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Callback Header</em>' containment reference.
	 * @see #getRteCallbackHeader()
	 * @generated
	 */
	void setRteCallbackHeader(RteCallbackHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Utility Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Utility Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Utility Header</em>' containment reference.
	 * @see #setRteUtilityHeader(RteUtilityHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteUtilityHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteUtilityHeader getRteUtilityHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteUtilityHeader <em>Rte Utility Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Utility Header</em>' containment reference.
	 * @see #getRteUtilityHeader()
	 * @generated
	 */
	void setRteUtilityHeader(RteUtilityHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Bsw Api Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Bsw Api Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Bsw Api Header</em>' containment reference.
	 * @see #setRteBswApiHeader(RteBswApiHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteBswApiHeader()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RteBswApiHeader getRteBswApiHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteBswApiHeader <em>Rte Bsw Api Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Bsw Api Header</em>' containment reference.
	 * @see #getRteBswApiHeader()
	 * @generated
	 */
	void setRteBswApiHeader(RteBswApiHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Common Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Common Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Common Header</em>' containment reference.
	 * @see #setRteCommonHeader(RteInternalHeader)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteCommonHeader()
	 * @model containment="true"
	 * @generated
	 */
	RteInternalHeader getRteCommonHeader();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonHeader <em>Rte Common Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Common Header</em>' containment reference.
	 * @see #getRteCommonHeader()
	 * @generated
	 */
	void setRteCommonHeader(RteInternalHeader value);

	/**
	 * Returns the value of the '<em><b>Rte Partition Header</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteInternalHeader}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Partition Header</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Partition Header</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RtePartitionHeader()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteInternalHeader> getRtePartitionHeader();

	/**
	 * Returns the value of the '<em><b>Rte Common Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Common Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Common Source</em>' containment reference.
	 * @see #setRteCommonSource(RteSource)
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RteCommonSource()
	 * @model containment="true"
	 * @generated
	 */
	RteSource getRteCommonSource();

	/**
	 * Sets the value of the '{@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteModule#getRteCommonSource <em>Rte Common Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rte Common Source</em>' containment reference.
	 * @see #getRteCommonSource()
	 * @generated
	 */
	void setRteCommonSource(RteSource value);

	/**
	 * Returns the value of the '<em><b>Rte Partition Source</b></em>' containment reference list.
	 * The list contents are of type {@link jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.RteSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rte Partition Source</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rte Partition Source</em>' containment reference list.
	 * @see jp.ac.nagoya_u.is.nces.a_rte.model.rte.module.ModulePackage#getRteModule_RtePartitionSource()
	 * @model containment="true"
	 * @generated
	 */
	EList<RteSource> getRtePartitionSource();

} // RteModule
