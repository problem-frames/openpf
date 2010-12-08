package uk.ac.open.ui;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.groundtram.UncalEditor;
import uk.ac.open.problem.Link;
import uk.ac.open.problem.LinkType;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ProblemEditor extends UncalEditor {
	
	@Override
	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
		for (TreeIterator<EObject> it= xtextResource.getAllContents(); it.hasNext();) {
			EObject o = it.next();
			if (o instanceof ProblemDiagram) {
				updateID((ProblemDiagram) o);
			}
			// replace all inverse constraint ~> to <~
			if (o instanceof Link) {
				Link l = (Link) o;
				if (l.getType() == LinkType.INV_CONSTRAINT) {
					Node from = l.getFrom();
					Node to = l.getTo();
					l.setFrom(to);
					l.setTo(from);
					l.setType(LinkType.CONSTRAINT);
				}
			}
		}
	}
	private static void updateID(ProblemDiagram o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
		for (Node n: o.getNodes()) {
			updateID(n);
		}
	}
	
	private static void updateID(Node o) {
		String name = o.getName();
		if (name.indexOf(" ") >= 0 && name.indexOf("#") <0 ) {
			o.setName("#" + name + "#");
		}
	}
	
	public ProblemEditor() {
		super();
		extension = "problem";
	}

	@Override
	protected void createDiagram(URI diagramURI, URI modelURI, Resource xtextResource) {
		super.createDiagram(diagramURI, modelURI, xtextResource);
		ProblemDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}	
}
