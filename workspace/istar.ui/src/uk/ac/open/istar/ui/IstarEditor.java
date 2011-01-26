package uk.ac.open.istar.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.ui.ImageDiagramEditor;
import edu.toronto.cs.openome_model.Container;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.Model;
import edu.toronto.cs.openome_model.diagram.part.Openome_modelDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class IstarEditor extends ImageDiagramEditor {

	@Override
	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
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
	}

	private static void updateID(Model o) {
		String name = o.getName();
		if (name==null)
			return;
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
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
	public IstarEditor() {
		super();
		extension = "istar";
		diagram_extension = "ood";
	}

	@Override
	protected void createDiagram(URI diagramURI, URI modelURI, Resource xtextResource) {
		super.createDiagram(diagramURI, modelURI, xtextResource);
		Openome_modelDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}	
	
}
