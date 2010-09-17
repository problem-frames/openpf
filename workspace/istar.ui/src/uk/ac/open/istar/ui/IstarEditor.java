package uk.ac.open.istar.ui;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ui.editor.XtextEditor;

import uk.ac.open.istar.IstarStandaloneSetup;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
@SuppressWarnings("restriction")
public class IstarEditor extends XtextEditor {

	public static void main(String args[]) {
		String filename = args[0];
		// ProblemParser p = new ProblemParser();
		// try {
		// IParseResult result = p.parse("ProblemDiagram", new
		// FileInputStream(new File(filename)));
		saveModel(filename);
		// } catch (FileNotFoundException e) {
		// e.printStackTrace();
		// }
	}

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
//		super.performSave(overwrite, monitor);
	}

	private static void saveModel(String filename) {
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		IstarStandaloneSetup.doSetup();
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		for (TreeIterator<EObject> it= xtextResource.getAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (o instanceof Model) {
				updateID((Model) o);
			}
			if (o instanceof Intention) {
				updateID((Intention) o);
			}
			if (o instanceof Container) {
				updateID((Container) o);
			}
		}		
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".ood";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		diagramURI = URI.createURI(path.toOSString());
		if (diagramURI != null)
			Openome_modelDiagramEditorUtil.createDiagram(diagramURI, uri,
					new NullProgressMonitor());
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
// FIXME: we don't need to save the oom if the synchronisation works
//		Resource xmiResource = new XMIResourceFactoryImpl()
//				.createResource(modelURI);
//		xmiResource.getContents().add(xtextResource.getContents().get(0));
//		try {
//			xmiResource.save(null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
	private static void updateID(Model o) {
		String name = o.getName();
		// FIXED: the name can be null
		if (name==null)
			return;
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			System.out.println(name);
			o.setName("#" + name + "#");
		}
	}
	
	private static void updateID(Intention o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
	}
	private static void updateID(Container o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
	}
	
}
