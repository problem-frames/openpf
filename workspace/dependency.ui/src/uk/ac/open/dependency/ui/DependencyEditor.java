package uk.ac.open.dependency.ui;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.dependency.dependency.Dependency;
import uk.ac.open.dependency.dependency.Precedence;
import uk.ac.open.dependency.dependency.diagram.part.DependencyDiagramEditorUtil;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.ui.ImageDiagramEditor;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class DependencyEditor extends ImageDiagramEditor {

	public DependencyEditor() {
		super();
		extension = "dependency";
	}
	private static Set<String> getNodeNames(ProblemDiagram pd1) {
		Set<String> names = new HashSet<String>();
		for (TreeIterator<EObject> it = pd1.eAllContents(); it.hasNext();) {
			EObject ob = it.next();
			if (ob instanceof Node) {
				Node n = (Node) ob;
				if (n.getType().equals(NodeType.REQUIREMENT))
					continue;
				names.add(n.getName());
			}
		}
		return names;
	}
	private static ProblemDiagram getProblem(XtextResourceSet resourceSet,
			IPath p1) {
		ProblemDiagram pd1 = null;
		if (p1.getFileExtension().equals("problem_diagram")) {
			p1 = p1.removeFileExtension().addFileExtension("problem");
			File f1 = p1.toFile();
			if (f1.exists()) {
				URI u1 = URI.createFileURI(p1.toString());
				Resource r1 = resourceSet.getResource(u1, true);
				try {
					r1.load(null);
					pd1 = (ProblemDiagram) r1.getContents().get(0);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return pd1;
	}
	
	@Override
	protected void createDiagram(URI diagramURI, URI modelURI, Resource xtextResource) {
		super.createDiagram(diagramURI, modelURI, xtextResource);
		DependencyDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}

	protected void updateModel(XtextResourceSet resourceSet, Resource xtextResource) {
		for (TreeIterator<EObject> i = xtextResource.getAllContents(); i
				.hasNext();) {
			EObject o = i.next();
			if (o instanceof Dependency) {
				Dependency d = (Dependency) o;
				if (d.getFrom().getReferrence().size() > 0
						&& d.getTo().getReferrence().size() > 0) {
					IPath p = ResourcesPlugin.getWorkspace().getRoot()
							.getLocation();
					IPath p1 = p.append(d.getFrom().getReferrence().get(0));
					IPath p2 = p.append(d.getTo().getReferrence().get(0));
					ProblemDiagram pd1 = getProblem(resourceSet, p1);
					ProblemDiagram pd2 = getProblem(resourceSet, p2);
					if (pd1 != null && pd2 != null) {
						Set<String> n1 = getNodeNames(pd1);
						Set<String> n2 = getNodeNames(pd2);
						Set<String> n = new HashSet<String>();
						n.addAll(n1);
						n.retainAll(n2);
						if (n.size() > 0) {
							System.out.println(d.getFrom().getName() + "--"
									+ d.getTo().getName() + "// " + n);
							if (d instanceof Precedence) {
								System.out.println("???"
										+ d.getFrom().getName() + "->"
										+ d.getTo().getName() + "// " + n);
							}
						}
					}
				}
			}
		}

	}
	
}
