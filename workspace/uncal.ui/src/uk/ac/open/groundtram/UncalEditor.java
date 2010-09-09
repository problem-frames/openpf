package uk.ac.open.groundtram;

import java.util.TreeMap;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
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
 * The class extends the xtext editor with an additional behavior: When the .pf
 * text file is saved, an .uncal file is generated from the semantics model
 * (XtextResource);
 * <p/>
 * and when the .uncal file is saved, an .problem file is generated from the
 * semantics model (XtextResource).
 * <p/>
 * To use the editor, you need to do the followings:
 * <ol>
 * <li>create a subclass FooEditor to inherit this behavior:
 * <ol>
 * <li>Modify the MANIFEST.MF to add the "uk.ac.open.GRroundTram" plugin
 * dependency</li>
 * <li>Import this class in the FooEditor.java
 * 
 * <pre>
 *   class FooEditor extends UncalEditor { ... }
 * </pre>
 * 
 * </li>
 * </ol>
 * </li>
 * <li>modify the description of the xtext generated plugin:
 * "foo.ui/plugin.xml":
 * <ol>
 * <li>Modify the extension point:
 * 
 * <pre>
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
 * </pre>
 * 
 * </li>
 * </ol>
 * </li>
 * </ol>
 * 
 * @author Yijun Yu
 *         <p/>
 * @see uk.ac.open.PFEditor.diagram.part.ProblemEditor#doSave()
 * @see uk.ac.open.event.EventCalculusEditor#doSave()
 */
public class UncalEditor extends XtextEditor {
	protected static String ROOT = "&problem";

	static Resource resource = null;

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
	protected static void convert(Resource xtextResource, Resource r,
			EPackage pkg) {
		resource = r;
		TreeMap<String, EObject> table = new TreeMap<String, EObject>();
		// System.out.println(rootClass);
		for (TreeIterator<EObject> iter = xtextResource.getAllContents(); iter
				.hasNext();) {
			EObject obj = iter.next();
			String rootClass = null;
			if (obj instanceof RootDiagram) {
				RootDiagram root = (RootDiagram) obj;
				if (root.getName().startsWith("&")) {
					ROOT = root.getName();
					if (ROOT.equals("&problem")) {
						pkg = ProblemPackage.eINSTANCE;
					} else if (ROOT.equals("&ec")) {
						pkg = EventcalculusPackage.eINSTANCE;
					} else {
						pkg = ProblemPackage.eINSTANCE;
					}
				}
				rootClass = pkg.getEClassifiers().get(0).getName();
				preprocess_node(pkg, table, rootClass, root);
				for (Node node : root.getObjects()) {
					preprocess_node(pkg, table, rootClass, node);
					// System.out.println(r.getContents().size());
				}
			}
		}

		for (TreeIterator<EObject> iter = xtextResource.getAllContents(); iter
				.hasNext();) {
			EObject obj = iter.next();
			String rootClass = null;
			if (obj instanceof RootDiagram) {
				RootDiagram root = (RootDiagram) obj;
				if (root.getName().startsWith("&")) {
					ROOT = root.getName();
					if (ROOT.equals("&problem")) {
						pkg = ProblemPackage.eINSTANCE;
					} else if (ROOT.equals("&ec")) {
						pkg = EventcalculusPackage.eINSTANCE;
					} else {
						pkg = ProblemPackage.eINSTANCE;
					}
				}
				rootClass = pkg.getEClassifiers().get(0).getName();
				process_node(pkg, table, rootClass, root);
				for (Node node : root.getObjects()) {
					process_node(pkg, table, rootClass, node);
					// System.out.println(r.getContents().size());
				}
			}
		}
	}

	private static void preprocess_node(EPackage pkg,
			TreeMap<String, EObject> table, String rootClass, Node node) {
		String name = node.getName();
		String klass = node.getType();
		new_value(table, name, rootClass, pkg, klass);
	}
	
	private static void process_node(EPackage pkg,
			TreeMap<String, EObject> table, String rootClass, Node node) {
		String name = node.getName();
		String klass = node.getType();
		EObject eo = new_value(table, name, rootClass, pkg, klass);
		if (eo != null) {
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
									if (real_name.equals("ObjecType")) {
										// a type
										klass = value;
									} else if (!value.startsWith("&")
											&& !value.equals("null")) { // a
																		// string
										if (esf instanceof EAttribute) {
											if (eo.eGet(esf) instanceof Enum) {
												Enum<?> e = (Enum<?>) eo
														.eGet(esf);
												for (Enum<?> en : e.getClass()
														.getEnumConstants()) {
													if (en.toString().equals(
															value))
														eo.eSet(esf, en);
												}
											} else {
												// System.out.println(esf.getEType().getName());
												if (esf.getEType().getName()
														.equals("EString")) {
													eo.eSet(esf, value);
												} else if (esf.getEType()
														.getName()
														.equals("EInt")) {
													eo.eSet(esf, Integer
															.parseInt(value));
												}
											}
										}
									} else { // an ID
										if (esf instanceof EReference) {
											EObject vo = new_value(table,
													value, rootClass, pkg,
													((EReference) esf)
															.getEType()
															.getName());
											eo.eSet(esf, vo);
										}
									}
								} else { // a CompositeField
									CompositeField cf = (CompositeField) field;
									CompositeObject vo = cf.getValue();
									if (esf instanceof EReference) {
										EList<Object> node_list = get_list(
												table, vo, rootClass, pkg,
												((EReference) esf).getEType()
														.getName());
										eo.eSet(esf, node_list);
									} else if (esf instanceof EAttribute) {
										EList<Object> node_list = get_list(
												table, vo, rootClass, pkg,
												((EAttribute) esf).getEType()
														.getName());
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
			CompositeObject vo, String rootClass, EPackage pkg, String klass) {
		EList<Object> a = new BasicEList<Object>();
		for (Field f : vo.getFields()) {
			if (f instanceof SimpleField && f.getName().equals("hd")) {
				SimpleField sf = (SimpleField) f;
				String value = sf.getValue();
				if (klass.equals("EString")) // a String
					a.add(value);
				else { // an ID
					EObject eo = new_value(table, value, rootClass, pkg, klass);
					a.add(eo);
				}
			}
			// recursion
			if (f instanceof CompositeField && f.getName().equals("tl")) {
				CompositeObject tail = ((CompositeField) f).getValue();
				EList<Object> a1 = get_list(table, tail, rootClass, pkg, klass);
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
			String name, String rootClass, EPackage pkg, String klass) {
		// int pre = resource.getContents().size();
		// We assume that the class name is <name>Impl, except for the
		// rootClass, which will be translated from "src"
		if (name.equals(ROOT))
			klass = rootClass;
		klass = ((klass.indexOf("Impl") >= 0) ? klass.substring(0,
				klass.indexOf("Impl")) : klass);
		EObject eo = table.get(name);
		if (eo == null) {
			for (EClassifier ec : pkg.getEClassifiers()) {
				if (ec instanceof EClass) {
					if (klass.equals(((EClass) ec).getName())) {
						EObject obj = pkg.getEFactoryInstance().create(
								(EClass) ec);
						table.put(name, obj);
						if (klass.equals(rootClass)) {
							resource.getContents().add(obj);
						}
						break;
					}
				}
			}
		}
		// int post = resource.getContents().size();
		// if (post < pre) {
		// System.out.println("????" + name);
		// }
		return table.get(name);
	}

}
