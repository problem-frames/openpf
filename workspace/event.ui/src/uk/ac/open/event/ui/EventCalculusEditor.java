package uk.ac.open.event.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.event.EventCalculusStandaloneSetup;
import uk.ac.open.groundtram.UncalEditor;

/**
 * Event Calculus editor: save the xtext document into uncal format
 * @author Yijun Yu
 * @generate NOT
 */
public class EventCalculusEditor extends UncalEditor {

	public static void main(String args[]) {
		String filename = args[0];
		saveModel(filename);
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}

	/**
	 * save the xtext document into uncal format
	 * @param filename the xtext document's filename
	 */
	private static void saveModel(String filename) {
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		EventCalculusStandaloneSetup.doSetup();
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		saveUncal(xtextResource, filename.substring(0, filename
				.lastIndexOf("."))
				+ ".uncal");
	}
}
