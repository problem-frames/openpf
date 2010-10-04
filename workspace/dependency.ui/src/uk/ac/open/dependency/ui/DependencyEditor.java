package uk.ac.open.dependency.ui;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
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

import uk.ac.open.dependency.dependency.Coupling;
import uk.ac.open.dependency.dependency.Dependency;
import uk.ac.open.dependency.dependency.Precedence;
import uk.ac.open.dependency.dependency.diagram.part.DependencyDiagramEditorUtil;
import uk.ac.open.problem.Node;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.ProblemDiagram;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class DependencyEditor extends XtextEditor {

	@Override
	public void performSave(boolean overwrite, IProgressMonitor monitor) {
		super.performSave(overwrite, monitor);
		String filename = this.getResource().getFullPath().toString();
		saveModel(filename);
	}

	private static void saveModel(String filename) {
		XtextResourceSet resourceSet = new XtextResourceSet();
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		try {
			xtextResource.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".dependency_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				diagramURI = null;
			}
		} catch (Exception e) {
		}
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
							System.out.println(d.getFrom().getName() + "--" + d.getTo().getName() + "// " + n);
							if (d instanceof Precedence) {
								System.out.println("???"+d.getFrom().getName() + "->" + d.getTo().getName() + "// " + n);
							}
						}
					}
				}
			}
		}
		try {
			xtextResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String newfile = filename.substring(0, filename.lastIndexOf("."))
				+ ".dependency";
		URI modelURI = URI.createURI(newfile);
		if (diagramURI != null) {
			DependencyDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
		}
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return pd1;
	}
}
