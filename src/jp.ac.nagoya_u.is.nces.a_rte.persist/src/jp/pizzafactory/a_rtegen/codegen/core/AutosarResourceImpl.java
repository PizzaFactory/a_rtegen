package jp.pizzafactory.a_rtegen.codegen.core;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import javax.xml.stream.XMLStreamException;

import jp.ac.nagoya_u.is.nces.a_rte.model.ar4x.m2.M2Root;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelLoader;
import jp.ac.nagoya_u.is.nces.a_rte.persist.internal.M2ModelSaver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class AutosarResourceImpl extends XMIResourceImpl implements AutosarResource {

	public AutosarResourceImpl() {
		super();
	}

	public AutosarResourceImpl(URI uri) {
		super(uri);
	}
	
	@Override
	public void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		M2ModelLoader loader = new M2ModelLoader();
		loader.load(this, inputStream);
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		M2ModelSaver saver = new M2ModelSaver();
		try {
			saver.save(this, outputStream);
		} catch (XMLStreamException e) {
			throw new IOException("Failed to save ARXML file.", e);
		}
	}
}
