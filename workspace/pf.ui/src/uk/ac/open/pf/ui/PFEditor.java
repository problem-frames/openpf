package uk.ac.open.pf.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;

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
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.groundtram.UncalEditor;
import uk.ac.open.pf.PFStandaloneSetup;
import uk.ac.open.pf.pF.CompositeField;
import uk.ac.open.pf.pF.CompositeObject;
import uk.ac.open.pf.pF.Field;
import uk.ac.open.pf.pF.Node;
import uk.ac.open.pf.pF.RootDiagram;
import uk.ac.open.pf.pF.SimpleField;
import uk.ac.open.problem.LinkType;
import uk.ac.open.problem.NodeType;
import uk.ac.open.problem.PhenomenonType;
import uk.ac.open.problem.ProblemDiagram;
import uk.ac.open.problem.ProblemFactory;
import uk.ac.open.problem.diagram.part.ProblemDiagramEditorUtil;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class PFEditor extends UncalEditor {

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
	}

	private static void saveModel(String filename) {
		// http://www.eclipse.org/forums/index.php?t=msg&goto=520616&
		try {
		PFStandaloneSetup.doSetup();
		XtextResourceSet resourceSet = new XtextResourceSet();
		// http://www.eclipse.org/forums/index.php?t=msg&goto=480679&
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
		URI uri = URI.createURI(filename); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		String newfile = filename.substring(0, filename.lastIndexOf("."))+ ".problem";
		URI modelURI = URI.createURI(newfile);
		Resource resource = resourceSet.createResource(modelURI);
		convert(xtextResource, resource);
		save_diagram(filename, modelURI);
		save_emf(modelURI, resource);
		} catch (Exception e) { }
	}

	private static void save_emf(URI modelURI, Resource resource) {
		Resource xmiResource = new XMIResourceFactoryImpl()
				.createResource(modelURI);
		for (int i=0; i<resource.getContents().size(); i++)
			xmiResource.getContents().add(resource.getContents().get(i));
		try {
			xmiResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void save_diagram(String filename, URI modelURI) {
		String diagramFile = filename.substring(0, filename.lastIndexOf("."))
				+ ".problem_diagram";
		URI diagramURI = URI.createURI(diagramFile);
		IPath path = new Path(diagramURI.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			if (file != null && file.exists()) {
				SaveAsDialog fd = new SaveAsDialog(PlatformUI.getWorkbench()
						.getDisplay().getActiveShell());
				fd.setOriginalName(file.getName());
				fd.setTitle("Please specify the diagram name to save!");
				fd.open();
				path = fd.getResult();
				if (path != null) {
					diagramURI = URI.createURI(path.toOSString());
				} else {
					diagramURI = null;
				}
			}
		} catch (IllegalStateException e) {
		}
		if (diagramURI != null)
			ProblemDiagramEditorUtil.createDiagram(diagramURI, modelURI,
					new NullProgressMonitor());
	}

	private static void convert(Resource xtextResource, Resource resource) {
		TreeMap<String, EObject> table = new TreeMap<String, EObject>();
		for (TreeIterator<EObject> iter = xtextResource.getAllContents(); iter
				.hasNext();) {
			EObject obj = iter.next();
			if (obj instanceof RootDiagram) {
				RootDiagram root = (RootDiagram) obj;
				for (Node node : root.getObjects()) {
					String name = node.getName();
					EObject eo = new_value(table, name);
					CompositeObject co = node.getComposite();
					for (Field field : co.getFields()) {
						if (field instanceof SimpleField) {
							SimpleField sf = (SimpleField) field;
							String real_name = sf.getName();
							String value = sf.getValue();
							if (!value.startsWith("&") && !value.equals("null")) {
								// is string
								if (real_name.equals("name")) {
									if (eo instanceof ProblemDiagram) {
										ProblemDiagram o = (ProblemDiagram) eo;
										o.setName(value);
									} else if (eo instanceof uk.ac.open.problem.Node) {
										uk.ac.open.problem.Node o = (uk.ac.open.problem.Node) eo;
										o.setName(value);
									} else if (eo instanceof uk.ac.open.problem.Phenomenon) {
										uk.ac.open.problem.Phenomenon o = (uk.ac.open.problem.Phenomenon) eo;
										o.setName(value);
									}
								}
								if (real_name.equals("type")) {
									if (eo instanceof uk.ac.open.problem.Node) {
										uk.ac.open.problem.Node o = (uk.ac.open.problem.Node) eo;
										o.setType(NodeType.get(value));
									} else if (eo instanceof uk.ac.open.problem.Link) {
										uk.ac.open.problem.Link o = (uk.ac.open.problem.Link) eo;
										o.setType(LinkType.get(value));
									} else if (eo instanceof uk.ac.open.problem.Phenomenon) {
										uk.ac.open.problem.Phenomenon o = (uk.ac.open.problem.Phenomenon) eo;
										o.setType(PhenomenonType.get(value));
									}
								}
								if (real_name.equals("description")) {
									if (value.equals("null"))
										value = null;
									if (eo instanceof uk.ac.open.problem.Node) {
										uk.ac.open.problem.Node o = (uk.ac.open.problem.Node) eo;
										o.setDescription(value);
									} else if (eo instanceof uk.ac.open.problem.Link) {
										uk.ac.open.problem.Link o = (uk.ac.open.problem.Link) eo;
										o.setDescription(value);
									} else if (eo instanceof uk.ac.open.problem.Phenomenon) {
										uk.ac.open.problem.Phenomenon o = (uk.ac.open.problem.Phenomenon) eo;
										o.setDescription(value);
									}
								}
							} else {
								// is &ID
								EObject vo = new_value(table, value);
								if (real_name.equals("highlight") && vo != null) {
									if (eo instanceof ProblemDiagram
											&& vo instanceof uk.ac.open.problem.Node) {
										ProblemDiagram o = (ProblemDiagram) eo;
										o.setHighlight((uk.ac.open.problem.Node) vo);
									}
								}
								if (real_name.equals("from") && vo != null) {
									if (eo instanceof uk.ac.open.problem.Link
											&& vo instanceof uk.ac.open.problem.Node) {
										uk.ac.open.problem.Link o = (uk.ac.open.problem.Link) eo;
										o.setFrom((uk.ac.open.problem.Node) vo);
									}
								}
								if (real_name.equals("to") && vo != null) {
									if (eo instanceof uk.ac.open.problem.Link
											&& vo instanceof uk.ac.open.problem.Node) {
										uk.ac.open.problem.Link o = (uk.ac.open.problem.Link) eo;
										o.setTo((uk.ac.open.problem.Node) vo);
									}
								}
							}
						} else { // CompositeField
							CompositeField cf = (CompositeField) field;
							String real_name = cf.getName();
							CompositeObject vo = cf.getValue();
							ArrayList<uk.ac.open.problem.Node> node_list = get_node_list(
									table, vo);
							ArrayList<uk.ac.open.problem.Link> link_list = get_Link_list(
									table, vo);
							ArrayList<ProblemDiagram> diagram_list = get_diagram_list(
									table, vo);
							ArrayList<uk.ac.open.problem.Phenomenon> phenomena_list = get_phenomena_list(
									table, vo);
							ArrayList<String> href_list = get_href_list(table,
									vo);
							if (real_name.equals("nodes")
									&& eo instanceof ProblemDiagram) {
								for (uk.ac.open.problem.Node e : node_list)
									((ProblemDiagram) eo).getNodes().add(e);
							}
							if (real_name.equals("problemNodeRef")
									&& eo instanceof uk.ac.open.problem.Node) {
								for (uk.ac.open.problem.Node e : node_list)
									((uk.ac.open.problem.Node) eo).getProblemNodeRef().add(e);
							}
							if (real_name.equals("links")
									&& eo instanceof ProblemDiagram) {
								for (uk.ac.open.problem.Link e : link_list)
									((ProblemDiagram) eo).getLinks().add(e);
							}
							if (real_name.equals("problemRef")
									&& eo instanceof uk.ac.open.problem.Node) {
								for (ProblemDiagram e : diagram_list) {
									((uk.ac.open.problem.Node) eo).getProblemRef().add(e);
//									resource.getContents().add(e);
								}
							}
							if (real_name.equals("subproblem")
									&& eo instanceof uk.ac.open.problem.Node) {
								for (ProblemDiagram e : diagram_list)
									((uk.ac.open.problem.Node) eo).getProblemRef().add(e);
							}
							if (real_name.equals("hiddenPhenomena")
									&& eo instanceof ProblemDiagram) {
								for (uk.ac.open.problem.Phenomenon e : phenomena_list)
									((uk.ac.open.problem.Node) eo).getHiddenPhenomena().add(e);
							}
							if (real_name.equals("phenomena")
									&& eo instanceof uk.ac.open.problem.Link) {
								for (uk.ac.open.problem.Phenomenon e : phenomena_list)
									((uk.ac.open.problem.Link) eo)
											.getPhenomena().add(e);
							}
							if (real_name.equals("href")
									&& eo instanceof uk.ac.open.problem.Node) {
								for (String e : href_list)
									((uk.ac.open.problem.Node) eo).getHref()
											.add(e);
							}
						}
					}
				}
			}
		}
		resource.getContents().add(table.get("&src"));
	}

	private static ArrayList<uk.ac.open.problem.Node> get_node_list(
			TreeMap<String, EObject> table, CompositeObject vo) {
		ArrayList<uk.ac.open.problem.Node> a = new ArrayList<uk.ac.open.problem.Node>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				EObject eo = new_value(table, val);
				if (eo instanceof uk.ac.open.problem.Node) {
					a.add((uk.ac.open.problem.Node) eo);
				}
			}
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				ArrayList<uk.ac.open.problem.Node> a1 = get_node_list(table,
						tail);
				a.addAll(a1);
			}
		}
		return a;
	}

	
	private static ArrayList<uk.ac.open.problem.Link> get_Link_list(
			TreeMap<String, EObject> table, CompositeObject vo) {
		ArrayList<uk.ac.open.problem.Link> a = new ArrayList<uk.ac.open.problem.Link>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				EObject eo = new_value(table, val);
				if (eo instanceof uk.ac.open.problem.Link) {
					a.add((uk.ac.open.problem.Link) eo);
				}
			}
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				ArrayList<uk.ac.open.problem.Link> a1 = get_Link_list(table,
						tail);
				a.addAll(a1);
			}
		}
		return a;
	}

	private static ArrayList<ProblemDiagram> get_diagram_list(
			TreeMap<String, EObject> table, CompositeObject vo) {
		ArrayList<ProblemDiagram> a = new ArrayList<ProblemDiagram>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				EObject eo = new_value(table, val);
				if (eo instanceof ProblemDiagram) {
					a.add((ProblemDiagram) eo);
				}
			}
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				ArrayList<ProblemDiagram> a1 = get_diagram_list(table,
						tail);
				a.addAll(a1);
			}
		}
		return a;
	}
	
	
	private static ArrayList<uk.ac.open.problem.Phenomenon> get_phenomena_list(
			TreeMap<String, EObject> table, CompositeObject vo) {
		ArrayList<uk.ac.open.problem.Phenomenon> a = new ArrayList<uk.ac.open.problem.Phenomenon>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				EObject eo = new_value(table, val);
				if (eo instanceof uk.ac.open.problem.Phenomenon) {
					a.add((uk.ac.open.problem.Phenomenon) eo);
				}
			}
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				ArrayList<uk.ac.open.problem.Phenomenon> a1 = get_phenomena_list(
						table, tail);
				a.addAll(a1);
			}
		}
		return a;
	}


	private static ArrayList<String> get_href_list(
			TreeMap<String, EObject> table, CompositeObject vo) {
		ArrayList<String> a = new ArrayList<String>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				a.add(val);
			}
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				ArrayList<String> a1 = get_href_list(table, tail);
				a.addAll(a1);
			}
		}
		return a;
	}

	private static EObject new_value(TreeMap<String, EObject> table, String name) {
		String klass = name.equals("&src") ? "ProblemDiagram" : ((name
				.indexOf("Impl") >= 0) ? name
				.substring(1, name.indexOf("Impl")) : name);
		EObject eo = table.get(name);
		if (eo == null) {
			if (klass.equals("ProblemDiagram")) {
				ProblemDiagram pd = ProblemFactory.eINSTANCE
						.createProblemDiagram();
				table.put(name, pd);
			} else if (klass.equals("Node")) {
				uk.ac.open.problem.Node nd = ProblemFactory.eINSTANCE
						.createNode();
				table.put(name, nd);
			} else if (klass.equals("Link")) {
				uk.ac.open.problem.Link l = ProblemFactory.eINSTANCE
						.createLink();
				table.put(name, l);
			} else if (klass.equals("Phenomenon")) {
				uk.ac.open.problem.Phenomenon p = ProblemFactory.eINSTANCE
						.createPhenomenon();
				table.put(name, p);
			}
		}
		return table.get(name);
	}
}
