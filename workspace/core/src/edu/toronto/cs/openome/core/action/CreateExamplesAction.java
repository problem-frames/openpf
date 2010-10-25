/*******************************************************************************
 * Adapted from the Eclipse Monkey project
 * Contributors:
 *     Yijun Yu -- adapting it for OpenOME
 *     Bjorn Freeman-Benson - initial implementation
 *     Ward Cunningham - initial implementation
 *******************************************************************************/

package edu.toronto.cs.openome.core.action;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourceAttributes;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.osgi.framework.Bundle;

public class CreateExamplesAction extends ExtensionReader implements
		IWorkbenchWindowActionDelegate {

	public CreateExamplesAction() {
	}

	Vector<IConfigurationElement> examples = null;

	public void run(IAction action) {
		IWorkspace w = ResourcesPlugin.getWorkspace();
		IProject project = w.getRoot().getProject("Examples");
		try {
			if (!project.exists())
				project.create(null);
			project.open(null);
			examples = new Vector<IConfigurationElement>();
			readExtensions("core.example", "example", examples);
			for (IConfigurationElement example : examples) {
				String pluginname = example.getDeclaringExtension()
						.getNamespaceIdentifier();
				Bundle bundle = Platform.getBundle(pluginname);
				String filename = example.getAttribute("file");
				HashSet<String> more = fetchFile(project, pluginname, bundle, filename);
				for (String f: more) {
					// don't do recursion because it can be endless
					// just one level of indirection already gives us enough flexibility :-)
					fetchFile(project, pluginname, bundle, f);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
		System.out.println("Example project created");
	}

	private HashSet<String> fetchFile(IProject project, String pluginname,
			Bundle bundle, String filename) throws IOException {
		HashSet<String> more = new HashSet<String>();
		String name = pluginname + "/" + filename;
		String[] words = name.split("/");
		String pathName = "";
		IFolder folder = null;
		for (int i = 0; i < words.length - 1; i++) {
			String string = words[i];
			pathName = pathName + string + "/";
			folder = project.getFolder(pathName);
			try {
				if (!folder.exists())
					folder.create(IResource.FORCE, true, null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		InputStream stream = null;
		Path path = new Path("samples/" + filename);
		try {
			stream = FileLocator.openStream(bundle, path, false);
		} catch (IOException e) {
			path = new Path(filename);
			try {
				stream = FileLocator.openStream(bundle, path, false);
			} catch (IOException e2) {
				try {
					URL url = new URL(filename);
					URLConnection uc = url.openConnection();
					stream = uc.getInputStream(); // ignore it!
				} catch (Exception x) {
					stream = null;
				}
			}
		}
		if (stream != null) {
			IFile file;
			if (folder == null)
				file = project.getFile(name);
			else
				file = folder.getFile(words[words.length - 1]);
			try {
				if (!file.exists())
					file.create(stream, false, null);
				if (filename.startsWith("bin")) {
					ResourceAttributes attributes = new ResourceAttributes();
					attributes.setExecutable(true);
					file.setResourceAttributes(attributes);
				}
				if (filename.endsWith(".dir")) {
					Scanner sc = new Scanner(stream);
					while (sc.hasNextLine()) {
						String s = sc.nextLine();
						System.out.println(s);
						more.add(s);
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			stream.close();
		}
		return more;
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}
}
