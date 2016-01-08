/**
 * Copyright (C) 2006 by Monami-ya LLC, Japan
 * 
 * EPL 1.0
 */

/**
 * @author Masaki Muranaka <monaka@monami-ya.com>
 */
package jp.ac.nagoya_u.is.nces.a_rte.app;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import jp.ac.nagoya_u.is.nces.a_rte.app.internal.Activator;
import jp.ac.nagoya_u.is.nces.a_rte.app.template.Base;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.osgi.util.NLS;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class RteGeneratorAppTest {

	public class TemporaryWorkspaceRoot extends ExternalResource {
		private IWorkspaceRoot root;
		private List<IProject> projects;

		@Override
		protected void before() throws CoreException {
			projects = new ArrayList<IProject>();
			root = ResourcesPlugin.getWorkspace().getRoot();
		}

		@Override
		protected void after() {
			MultiStatus status = new MultiStatus(Activator.PLUGIN_ID,
					IStatus.OK, "Error(s) in deleting project...", null);
			for (IProject project : projects) {
				try {
					project.delete(true, null);
				} catch (CoreException e) {
					status.add(e.getStatus());
				}
			}
			if (!status.isOK()) {
				CoreException e = new CoreException(status);
				throw new RuntimeException(e);
			}
		}

		/**
		 * 
		 * @param projectName
		 *            the project name that will be created.
		 * @param monitor
		 *            the progress monitor or null.
		 * @return The instance of created project.
		 * @throws CoreException
		 *             failed to create new project.
		 */
		public IProject createProject(String projectName,
				IProgressMonitor monitor) throws CoreException {
			IProject project = root.getProject(projectName);
			project.create(monitor);
			projects.add(project);
			return project;
		}
	};

	@Rule
	public TemporaryWorkspaceRoot root = new TemporaryWorkspaceRoot();

	/**
	 * Downloads zip form autosar.org. Because it is not sure if AUTOSAR
	 * specification can be redistributed.
	 * 
	 * @throws IOException
	 * @throws CoreException
	 */
	private void unzipSchemas(final IProject project) throws IOException,
			CoreException {
		final URL url = new URL(
				"http://www.autosar.org/fileadmin/files/releases/4-0/methodology-templates/templates/standard/AUTOSAR_MMOD_XMLSchema.zip");
		final InputStream is = url.openStream();
		final ZipInputStream zis = new ZipInputStream(is);
		final IFolder folder = project.getFolder("schema");
		folder.create(true, true, null);
		ZipEntry zipEntry;
		while ((zipEntry = zis.getNextEntry()) != null) {
			final String entryName = zipEntry.getName();
			if ("AUTOSAR_4-0-3_STRICT.xsd".equals(entryName)
					|| "xml.xsd".equals(entryName)) {
				final int MAX_SIZE = 5120000;
				final int BUFFER_SIZE = 4096;
				int total = 0;
				int count = 0;
				byte[] data = new byte[BUFFER_SIZE];
				final ByteArrayOutputStream baos = new ByteArrayOutputStream(
						MAX_SIZE);
				while (total <= MAX_SIZE
						&& (count = zis.read(data, 0, BUFFER_SIZE)) != -1) {
					baos.write(data, 0, count);
					total += count;
				}
				if (total > MAX_SIZE) {
					throw new IllegalStateException(NLS.bind(
							"Content in zip entry is too big: {0}", entryName));
				}
				final ByteArrayInputStream bais = new ByteArrayInputStream(
						baos.toByteArray());
				IFile file = folder.getFile(entryName);
				file.create(bais, true, null);
			}
			zis.closeEntry();
		}
	}

	private IProject project;
	final String[] baseFiles = { "HelloAutosar.arxml", "SystemDesk.arxml",
			"target_hw_counter.arxml" };

	@Before
	public void tearUp() throws CoreException, IOException {
		project = root.createProject("test-project", null);
		project.open(null);

		for (String fileName : baseFiles) {
			IFile helloAutosar = project.getFile(fileName);
			InputStream his = Base.class.getResourceAsStream(fileName);
			helloAutosar.create(his, true, null);
		}
		IFolder folder = project.getFolder("model");
		folder.create(true, true, null);
		String[] fileNames = { "Rte_InternalDataTypes.arxml" };
		for (String fileName : fileNames) {
			InputStream is = Base.class
					.getResourceAsStream("model/" + fileName);
			IFile file = folder.getFile(fileName);
			file.create(is, true, null);
		}
		unzipSchemas(project);
	}

	@Test
	public void test() throws CoreException {
		RteGeneratorApp app = new RteGeneratorApp(project);
		app.execute(project, baseFiles);
	}

}
