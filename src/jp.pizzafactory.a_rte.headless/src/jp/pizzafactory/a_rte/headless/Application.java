package jp.pizzafactory.a_rte.headless;

import jp.ac.nagoya_u.is.nces.a_rte.app.RteGeneratorApp;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		Options options = new Options();
		options.addOption("r", "project", true, "Target project");
		options.addOption("d", "debug-app", false, "Debug mode");
		options.addOption("a", "application", true, "Application ID");

		String[] args = Platform.getCommandLineArgs();
		boolean debugMode = false;
		try {
			CommandLine cmd = new PosixParser().parse(options, args);
			debugMode = cmd.hasOption('d');
			String projectName = cmd.getOptionValue('p');
			if (projectName == null) {
				throw new IllegalArgumentException(
						"Target project name required.");
			}
			String[] argsToARteGen = cmd.getArgs();
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			RteGeneratorApp app = new RteGeneratorApp(project);
			app.execute(project, argsToARteGen);
		} catch (Exception e) {
			if (debugMode) {
				throw e;
			} else {
				BundleContext ctx = Activator.getContext();
				ServiceReference<?> logRef = ctx.getServiceReference(LogService.class.getName());
				if (logRef == null) {
					/* Can't log output. So just re-throw the exception. */
					throw e;
				} else {
					LogService log = (LogService) ctx.getService(logRef);
					log.log(LogService.LOG_ERROR, e.getMessage());
				}
			}
			return 1;
		}
		return IApplication.EXIT_OK;
	}

	@Override
	public void stop() {
		// nothing to do
	}
}
