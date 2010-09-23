package uk.ac.open.event.ui;

import org.eclipse.core.runtime.IProgressMonitor;

import uk.ac.open.groundtram.UncalEditor;

/**
 * Event Calculus editor: save the xtext document into uncal format
 * @author Yijun Yu
 * @generate NOT
 */
public class EventCalculusEditor extends UncalEditor {

	public static void main(String args[]) {
//		String filename = args[0];
//		saveModel(filename);
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		try {
		super.performSave(overwrite, monitor);
		// FIXME: will do this later when we really need to do bi-transformation
//		String filename = this.getResource().getFullPath().toString();
//		saveModel(filename);
		} catch (IllegalStateException e) {}
	}

//	/**
//	 * save the xtext document into uncal format
//	 * @param filename the xtext document's filename
//	 */
//	private static void saveModel(String filename) {
//		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
////		EventCalculusStandaloneSetup.doSetup();
//		XtextResourceSet resourceSet = new XtextResourceSet();
//		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
//		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
//				Boolean.TRUE);
//		URI uri = URI.createURI(filename); // your input textual file
//		Resource xtextResource = resourceSet.getResource(uri, true);
//		saveUncal(xtextResource, filename.substring(0, filename
//				.lastIndexOf("."))
//				+ ".uncal");
//	}
}
