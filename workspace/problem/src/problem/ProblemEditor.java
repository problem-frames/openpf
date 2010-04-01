package problem;

import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.core.editor.XtextEditor;

import uk.ac.open.ProblemStandaloneSetup;

public class ProblemEditor extends XtextEditor {

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor)
	{
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toOSString();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		ProblemStandaloneSetup.doSetup();		
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri , true);
		String newfile = filename.substring(0, filename.lastIndexOf("."))+ ".problem";
		Resource xmiResource = resourceSet.createResource(URI.createURI(newfile));
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
