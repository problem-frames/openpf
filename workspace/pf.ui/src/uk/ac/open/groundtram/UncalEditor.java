package uk.ac.open.groundtram;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.TreeMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;

import uk.ac.open.event.eventcalculus.EventcalculusPackage;
import uk.ac.open.pf.pF.CompositeField;
import uk.ac.open.pf.pF.CompositeObject;
import uk.ac.open.pf.pF.Field;
import uk.ac.open.pf.pF.Node;
import uk.ac.open.pf.pF.RootDiagram;
import uk.ac.open.pf.pF.SimpleField;
import uk.ac.open.problem.ProblemPackage;

/**
 * The class extends the xtext editor with an additional behavior: 
 * When the .pf text file is saved, an .uncal file is generated from the semantics model (XtextResource); <p/>
 * and when the .uncal file is saved, an .problem file is generated from the semantics model (XtextResource). <p/>
 * To use the editor, you need to do the followings:
 * <ol>
 * <li> create a subclass FooEditor to inherit this behavior:
 *  <ol>
 *  <li> Modify the MANIFEST.MF to add the "uk.ac.open.GRroundTram" plugin dependency </li>
 *  <li> Import this class in the FooEditor.java <pre>
 *   class FooEditor extends UncalEditor { ... } </pre>
 *  </li>
 *  </ol>
 * </li>
 * <li> modify the description of the xtext generated plugin: "foo.ui/plugin.xml":
 *  <ol>
 *  <li> Modify the extension point: <pre>
 *   &lt;extension
 *           point="org.eclipse.ui.editors"&gt;
 *       &lt;editor
 *           class="FooExecutableExtensionFactory:FooEditor"
 *           contributorClass="org.eclipse.ui.editors.text.TextEditorActionContributor"
 *           default="true"
 *           extensions="ec"
 *           id="Foo"
 *           name="Foo Editor"&gt;
 *       &lt;/editor&gt;
 *   &lt;/extension&gt;
 *   </pre>
 *  </li>
 *  </ol>
 * </li>
 * </ol>
 * @author Yijun Yu <p/>
 * @see uk.ac.open.PFEditor.diagram.part.ProblemEditor#doSave()
 * @see uk.ac.open.event.EventCalculusEditor#doSave()
 */
public class UncalEditor extends XtextEditor {
	protected static String ROOT = "&problem";
	
	/**
	 * Save the resource to the unql/uncal format used by the GRoundTram system
	 * @see http://www.biglab.org/pdf/manual.pdf
	 * @param xtextResource
	 */
	protected static void saveUncal(Resource xtextResource, String filename) {
		URI uri = URI.createURI(filename);
		IPath path = new Path(uri.toString());
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);		
		try {
			ByteArrayOutputStream content = new ByteArrayOutputStream();
			PrintStream out = new PrintStream(content);
			HashMap<EObject, String> table = new HashMap<EObject, String>();
			HashMap<EObject, Integer> count = new HashMap<EObject, Integer>();
			HashMap<EClass, Integer> counts = new HashMap<EClass, Integer>();
			EObject root = xtextResource.getContents().get(0);
			EObject o = root;
			new_object(table, count, counts, root, o);			
			String name = referenceName(table, count, root, o);
			out.println(ROOT + " @ cycle(");
			out.println("(");
			int u = 0;
			for (TreeIterator<EObject> objects = EcoreUtil.getAllContents(
					xtextResource, true); objects.hasNext();) {
				o = objects.next();
				new_object(table, count, counts, root, o);			
				name = referenceName(table, count, root, o);
				if (o == root)
					name = ROOT;
				if (u > 0) {
					out.println(",");
				}
				u++;
				out.println("  " + name + " := ");
				out.println("  {");
				int n = 0;
				for (EStructuralFeature feature : o.eClass().getEAllStructuralFeatures()) {
					Object val = o.eGet(feature);
					handleValue(out, table, count, counts, n, feature, val, root);
					n++;
				} 
				out.print("\n  }");
			}
			out.println("\n)");
			out.println(")");
			out.close();
			ByteArrayInputStream stream = new ByteArrayInputStream(content.toByteArray());
            if (file.exists()) {
                file.setContents(stream, false, true, null);
            } else {
                file.create(stream, false, null);
            }
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private static String referenceName(HashMap<EObject, String> table,
			HashMap<EObject, Integer> count, EObject root, EObject o) {
		String name = table.get(o) + (o==root?"":count.get(o));
		return name;
	}

	private static EObject new_object(HashMap<EObject, String> table,
			HashMap<EObject, Integer> count, HashMap<EClass, Integer> counts,
			EObject root, EObject o) {
		String name = o.getClass().getSimpleName();
		table.put(o, "&" + name);
		if (count.get(o) == null) {
			if (counts.get(o.eClass()) == null)
				counts.put(o.eClass(), 1);
			else
				counts.put(o.eClass(), 1 + counts.get(o.eClass()));
			count.put(o, counts.get(o.eClass()));
		}
		return o;
	}

	private static void handleValue(PrintStream out,
			HashMap<EObject, String> table, HashMap<EObject, Integer> count,
			HashMap<EClass, Integer> counts, int n, EStructuralFeature feature, Object val,
			EObject root) {
		if (val instanceof EList<?>) {
			String list = "{";
			int m = 0;
			for (Object Obj: (EList<?>) val) {
				if (Obj instanceof EList<?>) {
					// TODO: we need to create a list variable
				} else if (Obj instanceof EObject) {
					EObject obj = (EObject) Obj;
					new_object(table, count, counts, root, obj);			
					String name = referenceName(table, count, root, obj);					
					list = list + "hd:" + name + ", tl:{";
					m ++;
				} else {
					// primitive value
					Object obj = Obj;
					list = list + "hd:\"" + obj + "\"" + ", tl:{";
					m ++;
				}
			}
			for (int i=0; i<=m; i++)
				list = list + "}";
			out.print(((n>0)?",\n":"") + "      " + feature.getName() + ":" + list);
		} else if (val instanceof EObject) {
			EObject obj = (EObject) val;
			new_object(table, count, counts, root, obj);			
			String name = referenceName(table, count, root, obj);					
			out.print(((n>0)?",\n":"") + "      " + feature.getName() + ": " + name);				
		} else {
			out.print(((n>0)?",\n":"") + "      " + feature.getName() + ": \"" + val + "\"");
		}
	}


	/**
	 * Convert a generic uncal resource into a specific resource denoted by an
	 * Ecore package through the reflection mechanisms
	 * 
	 * @param xtextResource
	 *            The generic source resource of uncal parsed from xtext
	 * @param resource
	 *            The specific target resource of the Ecore package
	 * @param pkg
	 *            The instance of Ecore package
	 */
	protected static void convert(Resource xtextResource, Resource resource,
			EPackage pkg) {
		TreeMap<String, EObject> table = new TreeMap<String, EObject>();
		// System.out.println(rootClass);
		for (TreeIterator<EObject> iter = xtextResource.getAllContents(); iter
				.hasNext();) {
			EObject obj = iter.next();
			if (obj instanceof RootDiagram) {
				RootDiagram root = (RootDiagram) obj;
				if (root.getName().startsWith("&")) {
					ROOT = root.getName();
					if (root.getName().equals("&problem")) {
						pkg = ProblemPackage.eINSTANCE;
					} else if (root.getName().equals("&ec")) {
						pkg = EventcalculusPackage.eINSTANCE;
					} else {
						pkg = ProblemPackage.eINSTANCE;						
					}
				}
				String rootClass = pkg.getEClassifiers().get(0).getName();
				for (Node node : root.getObjects()) {
					String name = node.getName();
					EObject eo = new_value(table, name, rootClass, pkg);
					CompositeObject co = node.getComposite();
					for (Field field : co.getFields()) {
						String real_name = field.getName();
						for (EClassifier ec : pkg.getEClassifiers()) {
							if (ec instanceof EClass && ec == eo.eClass()) {
								for (EStructuralFeature esf : ((EClass) ec)
										.getEAllStructuralFeatures()) {
									if (real_name.equals(esf.getName())) {
										if (field instanceof SimpleField) {
											SimpleField sf = (SimpleField) field;
											String value = sf.getValue();
											if (!value.startsWith("&")
													&& !value.equals("null")) { // a
																				// string
												if (esf instanceof EAttribute) {
													if (eo.eGet(esf) instanceof Enum) {
														Enum<?> e = (Enum<?>) eo
																.eGet(esf);
														for (Enum<?> en : e
																.getClass()
																.getEnumConstants()) {
															if (en.toString()
																	.equals(value))
																eo.eSet(esf, en);
														}
													} else if (eo.eGet(esf) instanceof String) {
														eo.eSet(esf, value);
													} else if (eo.eGet(esf) instanceof Integer) {
														eo.eSet(esf, Integer.parseInt(value));
													}
												}
											} else { // an ID
												EObject vo = new_value(table,
														value, rootClass, pkg);
												if (esf instanceof EReference)
													eo.eSet(esf, vo);
											}
										} else { // a CompositeField
											CompositeField cf = (CompositeField) field;
											CompositeObject vo = cf.getValue();
											EList<Object> node_list = get_list(
													table, vo, rootClass, pkg);
											eo.eSet(esf, node_list);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		resource.getContents().add(table.get(ROOT));
	}

	/**
	 * Obtain an EList from a composite object like: {hd: <?>, tl: { hd:<?>,
	 * ..., tl:{}}...}
	 * 
	 * @param table
	 *            The table to map string like &TypeNumber to an object
	 * @param vo
	 *            The Composite object
	 * @param rootClass
	 *            Pass on the name of the root class
	 * @param pkg
	 *            Pass on the name of the EPackage
	 * @return The EList
	 */
	private static EList<Object> get_list(TreeMap<String, EObject> table,
			CompositeObject vo, String rootClass, EPackage pkg) {
		EList<Object> a = new BasicEList<Object>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String val = sf.getValue();
				String value = sf.getValue();
				if (!value.startsWith("&") && !value.equals("null")) // a String
					a.add(value);
				else { // an ID
					EObject eo = new_value(table, val, rootClass, pkg);
					a.add(eo);
				}
			}
			// recursion
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				EList<Object> a1 = get_list(table, tail, rootClass, pkg);
				a.addAll(a1);
			}
		}
		return a;
	}

	/**
	 * Look up the table that maps &TypeNumber reference names into an EObject
	 * 
	 * @param table
	 * @param name
	 * @param rootClass
	 * @return The EObject if found, otherwise create an empty new one
	 */
	private static EObject new_value(TreeMap<String, EObject> table,
			String name, String rootClass, EPackage pkg) {
		// We assume that the class name is <name>Impl, except for the
		// rootClass, which will be translated from "src"
		String klass = name.equals(ROOT) ? rootClass
				: ((name.indexOf("Impl") >= 0) ? name.substring(1,
						name.indexOf("Impl")) : name);
		EObject eo = table.get(name);
		if (eo == null) {
			for (EClassifier ec : pkg.getEClassifiers()) {
				if (ec instanceof EClass) {
					if (klass.equals(((EClass) ec).getName())) {
						EObject obj = pkg.getEFactoryInstance().create(
								(EClass) ec);
						table.put(name, obj);
					}
				}
			}
		}
		return table.get(name);
	}
	
	
}
