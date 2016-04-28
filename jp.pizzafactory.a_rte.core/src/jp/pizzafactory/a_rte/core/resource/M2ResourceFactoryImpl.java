package jp.pizzafactory.a_rte.core.resource;

import java.util.HashMap;
import java.util.Map;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Package;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLPackage;
import org.eclipse.emf.mapping.ecore2xml.Ecore2XMLRegistry;
import org.eclipse.emf.mapping.ecore2xml.impl.Ecore2XMLRegistryImpl;
import org.eclipse.emf.mapping.ecore2xml.util.Ecore2XMLExtendedMetaData;

public class M2ResourceFactoryImpl extends XMIResourceFactoryImpl {
	public static final String BEFORE_NS_URI = "http://autosar.org/schema/r4.0"; //$NON-NLS-1
	//public static final String AFTER_PLATFORM_URI = "platform:/plugin/jp.ac.nagoya_u.is.nces.a_rte.model/model/ar4x.ecore"; //$NON-NLS-1
	public static final String AFTER_PLATFORM_URI = "http://nces.is.nagoya-u.ac.jp/a-rte/ar4x/m2"; //$NON-NLS-1$
	public static final String BEFORE_PLATFORM_URI = "platform:/plugin/jp.ac.nagoya_u.is.nces.a_rte.model/model/ar4x.ecore2xml"; //$NON-NLS-1

	private ExtendedMetaData extendedMetaData;

	@Override
	public XMLResource createResource(URI uri) {
		final XMLResource resource = (XMLResource) super.createResource(uri);

		final Map<Object, Object> defaultLoadOptions = resource
				.getDefaultLoadOptions();
		defaultLoadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA,
				getExtendedMetaData());
		defaultLoadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE,
				Boolean.TRUE);
		defaultLoadOptions.put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, new HashMap<String,EStructuralFeature>());
		// defaultLoadOptions.put(XMLResource.OPTION_RESOURCE_HANDLER, new
		// PetriNetsResourceHandler());

		return resource;
	}

	private ExtendedMetaData getExtendedMetaData() {
		if (extendedMetaData == null) {
			final ResourceSet resourceSet = new ResourceSetImpl();
			final EPackage.Registry ePackageRegistry = resourceSet
					.getPackageRegistry();

			ePackageRegistry.put(BEFORE_NS_URI, M2Package.eINSTANCE);
			ePackageRegistry.put(AFTER_PLATFORM_URI, M2Package.eINSTANCE);

			Ecore2XMLRegistry ecore2xmlRegistry = new Ecore2XMLRegistryImpl(
					Ecore2XMLRegistry.INSTANCE);
			ecore2xmlRegistry.put(BEFORE_NS_URI, EcoreUtil.getObjectByType(
					resourceSet.getResource(URI.createURI(BEFORE_PLATFORM_URI),
							true).getContents(),
					Ecore2XMLPackage.Literals.XML_MAP));

			extendedMetaData = new Ecore2XMLExtendedMetaData(ePackageRegistry,
					ecore2xmlRegistry);
		}
		return extendedMetaData;
	}
}
