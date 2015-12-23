/*
 *  TOPPERS/A-RTEGEN
 *      Automotive Runtime Environment Generator
 *
 *  Copyright (C) 2013-2015 by Eiwa System Management, Inc., JAPAN
 *
 *  �嵭����Ԥϡ��ʲ���(1)��(4)�ξ������������˸¤ꡤ�ܥ��եȥ���
 *  �����ܥ��եȥ���������Ѥ�����Τ�ޤࡥ�ʲ�Ʊ���ˤ���ѡ�ʣ������
 *  �ѡ������ۡʰʲ������ѤȸƤ֡ˤ��뤳�Ȥ�̵���ǵ������롥
 *  (1) �ܥ��եȥ������򥽡��������ɤη������Ѥ�����ˤϡ��嵭������
 *      ��ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ��꤬�����Τޤޤη��ǥ���
 *      ����������˴ޤޤ�Ƥ��뤳�ȡ�
 *  (2) �ܥ��եȥ������򡤥饤�֥������ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ�����Ǻ����ۤ�����ˤϡ������ۤ�ȼ���ɥ�����ȡ�����
 *      �ԥޥ˥奢��ʤɡˤˡ��嵭�����ɽ�����������Ѿ�浪��Ӳ���
 *      ��̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *  (3) �ܥ��եȥ������򡤵�����Ȥ߹���ʤɡ�¾�Υ��եȥ�������ȯ�˻�
 *      �ѤǤ��ʤ����Ǻ����ۤ�����ˤϡ����Τ����줫�ξ�����������
 *      �ȡ�
 *    (a) �����ۤ�ȼ���ɥ�����ȡ����Ѽԥޥ˥奢��ʤɡˤˡ��嵭����
 *        �ɽ�����������Ѿ�浪��Ӳ�����̵�ݾڵ����Ǻܤ��뤳�ȡ�
 *    (b) �����ۤη��֤��̤�������ˡ�ˤ�äơ�TOPPERS�ץ������Ȥ�
 *        ��𤹤뤳�ȡ�
 *  (4) �ܥ��եȥ����������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������뤤���ʤ�»
 *      ������⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ����դ��뤳�ȡ�
 *      �ޤ����ܥ��եȥ������Υ桼���ޤ��ϥ���ɥ桼������Τ����ʤ���
 *      ͳ�˴�Ť����ᤫ��⡤�嵭����Ԥ����TOPPERS�ץ������Ȥ�
 *      ���դ��뤳�ȡ�
 *
 *  �ܥ��եȥ������ϡ�AUTOSAR��AUTomotive Open System ARchitecture�˻�
 *  �ͤ˴�Ť��Ƥ��롥�嵭�ε����ϡ�AUTOSAR����Ū�⻺������������Τ�
 *  �Ϥʤ���AUTOSAR�ϡ�AUTOSAR���ͤ˴�Ť������եȥ�����������Ū����
 *  �Ѥ���Ԥ��Ф��ơ�AUTOSAR�ѡ��ȥʡ��ˤʤ뤳�Ȥ���Ƥ��롥
 *
 *  �ܥ��եȥ������ϡ�̵�ݾڤ��󶡤���Ƥ����ΤǤ��롥�嵭����Ԥ�
 *  ���TOPPERS�ץ������Ȥϡ��ܥ��եȥ������˴ؤ��ơ�����λ�����Ū
 *  ���Ф���Ŭ������ޤ�ơ������ʤ��ݾڤ�Ԥ�ʤ����ޤ����ܥ��եȥ���
 *  �������Ѥˤ��ľ��Ū�ޤ��ϴ���Ū�������������ʤ�»���˴ؤ��Ƥ⡤��
 *  ����Ǥ�����ʤ���
 *
 *  $Id $
 */
package jp.ac.nagoya_u.is.nces.a_rte.persist.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jp.ac.nagoya_u.is.nces.a_rte.model.ExtendedEObject;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelException;
import jp.ac.nagoya_u.is.nces.a_rte.model.ModelLabels;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.EcucFactory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.ecuc.util.EcucModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucContainerValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucModuleConfigurationValues;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.EcucNumericalParamValue;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Factory;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.util.M2ModelUtils;
import jp.ac.nagoya_u.is.nces.a_rte.model.util.NameStringUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.util.M2XmlUtils.XmlWrapType;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.osgi.util.NLS;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.google.common.base.Preconditions;

public class M2ModelLoadHandler extends DefaultHandler {

	private static enum XmlContextType {
		ROLE_WRAPPER, ROLE, TYPE, REFERENCE_WRAPPER, REFERENCE, TYPE_REFERENCE, UNKNOWN, VARIANTS, CONDITIONAL
	}

	private static class XmlContext {
		public String xmlTagName;
		public ExtendedEObject contextM2Element;
		public EStructuralFeature contextM2Feature;
		public XmlWrapType wrapType;
		public XmlContextType contextType;

		public XmlContext(String xmlTagName, ExtendedEObject contextM2Element, EStructuralFeature contextM2Feature, XmlWrapType wrapType, XmlContextType contextType) {
			this.xmlTagName = xmlTagName;
			this.contextM2Element = contextM2Element;
			this.contextM2Feature = contextM2Feature;
			this.wrapType = wrapType;
			this.contextType = contextType;
		}

		public XmlContext createRoleWrapperContext(String xmlTagName, EStructuralFeature m2Feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2Feature, wrapType, XmlContextType.ROLE_WRAPPER);
		}

		public XmlContext createReferenceWrapperContext(String xmlTagName, EStructuralFeature m2feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2feature, wrapType, XmlContextType.REFERENCE_WRAPPER);
		}

		public XmlContext createEClassRoleContext(String xmlTagName, ExtendedEObject m2Element, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, m2Element, null, wrapType, XmlContextType.ROLE);
		}

		public XmlContext createEDataTypeRoleContext(String xmlTagName, EStructuralFeature m2Feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2Feature, wrapType, XmlContextType.ROLE);
		}

		public XmlContext createReferenceContext(String xmlTagName, EStructuralFeature m2feature, XmlWrapType wrapType) {
			return new XmlContext(xmlTagName, this.contextM2Element, m2feature, wrapType, XmlContextType.REFERENCE);
		}

		public XmlContext createEClassRoleContextInWrapper(String xmlTagName, ExtendedEObject m2Element) {
			return new XmlContext(xmlTagName, m2Element, null, XmlWrapType.ROLE, XmlContextType.ROLE); // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
		}

		public XmlContext createEDataTypeRoleContextInWrapper(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.ROLE, XmlContextType.ROLE); // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
		}

		public XmlContext createTypeContextInWrapper(String xmlTagName, ExtendedEObject m2Element) {
			return new XmlContext(xmlTagName, m2Element, null, XmlWrapType.TYPE, XmlContextType.TYPE);
		}

		public XmlContext createReferenceContextInWrapper(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.REFERENCE, XmlContextType.REFERENCE);
		}

		public XmlContext createVariantsContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, this.wrapType, XmlContextType.VARIANTS);
		}

		public XmlContext createConditionalContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, this.wrapType, XmlContextType.CONDITIONAL);
		}

		public XmlContext createUnknownContext(String xmlTagName) {
			return new XmlContext(xmlTagName, this.contextM2Element, this.contextM2Feature, XmlWrapType.UNKNOWN, XmlContextType.UNKNOWN);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "XmlContext [xmlTagName=" + this.xmlTagName + ", contextM2Element=" + this.contextM2Element + ", contextM2Feature=" + this.contextM2Feature + ", wrapType=" + this.wrapType
					+ ", contextType=" + this.contextType + "]";
		}

		private static M2ModelLoadHandler.XmlContext createRootContext(M2Root m2Root) {
			return new M2ModelLoadHandler.XmlContext(null, m2Root, null, XmlWrapType.TYPE, M2ModelLoadHandler.XmlContextType.TYPE);
		}
	}

	private List<XmlContext> xmlContexts;
	private M2Root m2Root;

	public M2Root getM2Root() {
		return this.m2Root;
	}

	@Override
	public void startDocument() throws SAXException {
		this.xmlContexts = new ArrayList<XmlContext>();
		this.m2Root = M2Factory.eINSTANCE.createM2Root();
		pushXmlContext(XmlContext.createRootContext(this.m2Root));
	}

	@Override
	public void endDocument() throws SAXException {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		XmlContext currentXmlContext = getCurrentXmlContext();
		if (localName.endsWith(M2XmlUtils.VARIANTS_TAG_NAME_SUFFIX)) {
			pushXmlContext(currentXmlContext.createVariantsContext(localName));
			return;
		} else if (localName.endsWith(M2XmlUtils.CONDITIONAL_TAG_NAME_SUFFIX)) {
			pushXmlContext(currentXmlContext.createConditionalContext(localName));
			return;
		}
		
		switch (currentXmlContext.wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
		case ROLE_WRAPPER_AND_TYPE:
		case ROLE_AND_TYPE:
		case REFERENCE_WRAPPER_AND_REFERENCE:
			pushXmlContext(startElementInWrapper(localName));
			break;
		case ROLE:
		case TYPE:
			pushXmlContext(startElementInRoleOrType(localName));
			break;
		default:
			pushXmlContext(currentXmlContext.createUnknownContext(localName));
			break;
		}
	}

	private XmlContext startElementInRoleOrType(String localName) {
		XmlContext currentXmlContext = getCurrentXmlContext();

		EStructuralFeature m2feature = getM2FeatureByXmlElement(localName);
		if (m2feature != null) {
			XmlWrapType wrapType = M2XmlUtils.getXmlWrapType(m2feature);
			switch (wrapType) {
			case ROLE:
				if (m2feature.getEType() instanceof EClass) {
					EClass eClass = (EClass) m2feature.getEType();
					ExtendedEObject newElement = createM2Element(eClass);
					setValueToCurrentContextM2Element(m2feature, newElement);
					return currentXmlContext.createEClassRoleContext(localName, newElement, wrapType);
				} else if (m2feature.getEType() instanceof EDataType) { // COVERAGE ���true(������EType��EClass��EDataType�Τ����줫�Ǥ��뤿��)
					return currentXmlContext.createEDataTypeRoleContext(localName, m2feature, wrapType);
				}
				break;
			case ROLE_WRAPPER_AND_ROLE:
			case ROLE_WRAPPER_AND_TYPE:
				return currentXmlContext.createRoleWrapperContext(localName, m2feature, wrapType);
			case ROLE_AND_TYPE:
				return currentXmlContext.createEDataTypeRoleContext(localName, m2feature, wrapType);
			case REFERENCE_WRAPPER_AND_REFERENCE:
				return currentXmlContext.createReferenceWrapperContext(localName, m2feature, wrapType);
			case REFERENCE:
			case TYPE_REFERENCE:
				return currentXmlContext.createReferenceContext(localName, m2feature, wrapType);
			default: // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
				break;
			}
		}

		return currentXmlContext.createUnknownContext(localName);
	}

	private XmlContext startElementInWrapper(String localName) {
		XmlContext currentXmlContext = getCurrentXmlContext();
		switch (currentXmlContext.wrapType) {
		case ROLE_WRAPPER_AND_ROLE:
			if (localName.equals(getCurrentXmlRoleName())) {
				if (currentXmlContext.contextM2Feature.getEType() instanceof EClass) {
					EClass eClass = (EClass) currentXmlContext.contextM2Feature.getEType();
					ExtendedEObject newElement = createM2Element(eClass);
					setValueToCurrentContextM2Element(getCurrentXmlContext().contextM2Feature, newElement);
					return currentXmlContext.createEClassRoleContextInWrapper(localName, newElement);
				} else if (currentXmlContext.contextM2Feature.getEType() instanceof EDataType) { // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
					return currentXmlContext.createEDataTypeRoleContextInWrapper(localName);
				}
			}
			break;
		case ROLE_WRAPPER_AND_TYPE:
		case ROLE_AND_TYPE:
			EClass eClass = (EClass) M2Package.eINSTANCE.getEClassifier(NameStringUtils.upperCaseWithHyphenToPascalCase(localName));
			if (eClass != null) { // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
				ExtendedEObject newElement = createM2Element(eClass);
				setValueToCurrentContextM2Element(getCurrentXmlContext().contextM2Feature, newElement);
				return currentXmlContext.createTypeContextInWrapper(localName, newElement);
			}
			break;
		case REFERENCE_WRAPPER_AND_REFERENCE:
			if (localName.equals(getCurrentXmlReferenceRoleName())) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�) 
				return currentXmlContext.createReferenceContextInWrapper(localName);
			}
			break;
		default: // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
			break;
		}
		return currentXmlContext.createUnknownContext(localName); // COVERAGE (���ѥ������ǤϤʤ����ᡤ�����ɥ�ӥ塼������ʤ����Ȥ��ǧ)
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		popM2Element();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		switch (getCurrentXmlContext().contextType) {
		case ROLE:
			EStructuralFeature valueFeature;
			if (M2ModelUtils.hasMixedStringStereotype(getCurrentXmlContext().contextM2Element.eClass())) {
				valueFeature = getCurrentXmlContext().contextM2Element.eClass().getEStructuralFeature(M2ModelUtils.MIXED_STRING_VALUE_FEATURE_NAME);
			} else {
				valueFeature = getCurrentXmlContext().contextM2Feature;
			}

			if (valueFeature != null && valueFeature.getEType() instanceof EDataType) { // COVERAGE ���true(false�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
				String originalValue = String.valueOf(ch, start, length);

				Object value;
				try {
					if (valueFeature.getEType() instanceof EEnum) {
						value = M2ModelUtils.convertValueForFeature(M2XmlUtils.getM2EnumLiteralName(originalValue), valueFeature);
					} else {
						value = M2ModelUtils.convertValueForFeature(originalValue, valueFeature);
					}
				} catch (ModelException e) {
					// �����ͥ졼����̤���Ѥ�EcucContainerValue��Numerical�ͤΥѡ������顼���ˡ������ͤ��֤������뤳�Ȥǡ�
					// ̤���ѥѥ�᡼���η����顼�ˤ�������������ߤޤ뤳�Ȥ��ɤ���
					if (isSkippableNumericalParameter()) {
						// ���Ѥ��ʤ�Numerical�ѥ�᡼���Ǥ��뤿�ᡢ������(0)�򥻥åȤ��뤳�Ȥ��н褹�롣
						// ̤���ѤǤ��뤿�᥽�������Ϥ˱ƶ��������ޤ�����­����ե�������ν����оݤˤ�ʤ�ʤ����ᡢ�����ͤ�����Ƥ�����ʤ���
						value = new BigDecimal(0);
					} else {
						throw new SAXException("Error found in the parameter '" + valueFeature.getName() + "' of " + ModelLabels.getLabel(getCurrentXmlContext().contextM2Element) + ". " + e.getMessage(),
								e);
					}
				}
				Activator.debugLog(NLS.bind("set value ''{0}'' to {1}", value, valueFeature));
				setValueToCurrentContextM2Element(valueFeature, value);
			}
			break;
		case REFERENCE:
		case TYPE_REFERENCE:
			String value = String.valueOf(ch, start, length);
			Activator.debugLog(NLS.bind("set reference ''{0} to {1}", value, getCurrentXmlContext().contextM2Feature));
			getCurrentXmlContext().contextM2Element.addUnresolvedReference((EReference) getCurrentXmlContext().contextM2Feature, M2ModelUtils.ID_PREFIX + value);
			break;
		default:
			break;
		}
	}

	/* �ѡ������EcucModuleConfigurationValues��XmlContexts����������� */
	private EcucModuleConfigurationValues getParsingEcucModuleConfigurationValues() {
		for (XmlContext context : xmlContexts) {
			if (context.contextM2Element instanceof EcucModuleConfigurationValues) {
				return (EcucModuleConfigurationValues)context.contextM2Element;
			}
		}
		return null; // COVERAGE ���̤��ã(isSkippableNumericalParameter()����θƤӽФ��Ǥ���ã���ʤ����ᡤ̤���Х�å�������ʤ�)
	}
	
	/* �ѡ������EcucContainerValue��XmlContexts����������� */
	private List<EcucContainerValue> getParsingEcucContainerValues() {
		List<EcucContainerValue> values = new ArrayList<EcucContainerValue>();
		for (XmlContext context : xmlContexts) {
			if (context.contextM2Element instanceof EcucContainerValue) {
				if (!values.contains((EcucContainerValue)context.contextM2Element)) {
					values.add((EcucContainerValue)context.contextM2Element);
				}
			}
		}
		return values;
	}

	/* containerClass�۲��ˡ�definitionRef�Ǽ�����륯�饹���֥������Ȥ�������� */
	private ExtendedEObject createObjectInEcucPackage(ExtendedEObject containerClass, String definitionRef) {
		EStructuralFeature eFeature = containerClass.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(definitionRef));
		if (eFeature == null) {
			return null;
		}
		EClass eClass = (EClass) eFeature.getEType();
		return (ExtendedEObject) EcucFactory.eINSTANCE.create(eClass);
	}
	
	/* containerClass�۲��ˡ�definitionRef�Ǽ������feature�򥻥åȲ�ǽ�� */
	private boolean isDefinedInEcore(ExtendedEObject containerClass, String definitionRef) {
		EStructuralFeature eFeature = containerClass.eClass().getEStructuralFeature(EcucModelUtils.getRoleNameOfContainerDef(definitionRef));
		return eFeature != null;
	}

	/**
	 * �ѡ�����Υѥ�᡼�����������åײ�ǽ(�����ͥ졼���ǻ��Ѥ��ʤ�)����Ƚ�ꤹ��
	 * ecuc�Υ���ե������󡢤��ġ������ͥ졼���ǻ��Ѥ���Numrical�ѥ�᡼���ξ���true���֤�
	 * ����ʳ��ξ���false���֤�
	 */
	private boolean isSkippableNumericalParameter() {
		ExtendedEObject valueClass = getCurrentXmlContext().contextM2Element;
		if (!(valueClass instanceof EcucNumericalParamValue)) {
			return false;
		}
		EcucNumericalParamValue numericalValueClass = (EcucNumericalParamValue)valueClass;
		
		EcucModuleConfigurationValues configValues = getParsingEcucModuleConfigurationValues();
		if (configValues == null) { // COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			// EcucModuleConfigurationValues��ѡ�����Ǥʤ���С�Numerical�ѥ�᡼����ѡ������ʤ����ᡢ��ã���ʤ�
			return false;
		}
		
		ExtendedEObject containerClass = EcucFactory.eINSTANCE.createEcucRoot();

		// m2.EcucModuleConfigurationValues���б�����ecuc�ѥå������Υ��󥹥��󥹤�����Ǥ��뤫�ˤ�ꡢ�оݤ��ݤ���Ƚ�ꤹ��
		containerClass = createObjectInEcucPackage(containerClass, configValues.getDefinitionRef());
		if (containerClass == null) {
			// �оݤȤ��ʤ��⥸�塼��Ǥ��뤿�ᡢ���פʥѥ�᡼���Ǥ���
			return true;
		}

		List<EcucContainerValue> containerValues = getParsingEcucContainerValues();
		if (containerValues.isEmpty()) { // COVERAGE ���false(true�Ȥʤ�Τ��Զ�纮�����ΤߤʤΤǡ�̤���Х�å�������ʤ�)
			// ����ƥʰʳ���Numerical�ѥ�᡼�����ݻ����ʤ����ᡢ��ã���ʤ�
			return false;
		}
		for (EcucContainerValue containerValue : containerValues) {
			// m2.EcucContainerValue���б�����ecuc�ѥå������Υ��󥹥��󥹤�����Ǥ��뤫�ˤ�ꡢ�оݤ��ݤ���Ƚ�ꤹ��
			containerClass = createObjectInEcucPackage(containerClass, containerValue.getDefinitionRef());
			if (containerClass == null) {
				// �оݤȤ��ʤ�����ƥʤǤ��뤿�ᡢ���פʥѥ�᡼���Ǥ���
				return true;
			}
		}

		return !isDefinedInEcore(containerClass, numericalValueClass.getDefinitionRef());
	}

	private void setValueToCurrentContextM2Element(EStructuralFeature m2Feature, Object value) {
		Preconditions.checkArgument(m2Feature.getEType().isInstance(value));
		if (m2Feature.isMany()) {
			@SuppressWarnings("unchecked")
			EList<Object> values = (EList<Object>) getCurrentXmlContext().contextM2Element.eGet(m2Feature);
			values.add(value);
		} else {
			getCurrentXmlContext().contextM2Element.eSet(m2Feature, value);
		}
	}

	private XmlContext getCurrentXmlContext() {
		return this.xmlContexts.get(this.xmlContexts.size() - 1);
	}

	private String getCurrentXmlRoleName() {
		return M2XmlUtils.getXmlRoleName(getCurrentXmlContext().contextM2Feature); // COVERAGE ���̤ã(�����Υġ������ե��Ǥϻ��Ѥ���ʤ����������ɥ�ӥ塼�ѤߤǤ��뤿������ʤ�) 
	}

	private String getCurrentXmlReferenceRoleName() {
		return M2XmlUtils.getXmlReferenceRoleName(getCurrentXmlContext().contextM2Feature);
	}

	private void pushXmlContext(XmlContext context) {
		Activator.debugLog(NLS.bind("enter {0}", context));
		this.xmlContexts.add(context);
	}

	private void popM2Element() {
		Activator.debugLog(NLS.bind("exit {0}", getCurrentXmlContext()));
		this.xmlContexts.remove(this.xmlContexts.size() - 1);
	}

	private EStructuralFeature getM2FeatureByXmlElement(String localName) {
		return M2XmlUtils.getM2FeatureByTagName(getCurrentXmlContext().contextM2Element.eClass(), localName);
	}

	private ExtendedEObject createM2Element(EClass eClass) {
		return (ExtendedEObject) M2Factory.eINSTANCE.create(eClass);
	}
}
