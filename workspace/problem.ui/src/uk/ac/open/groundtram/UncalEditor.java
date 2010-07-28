package uk.ac.open.groundtram;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.ui.editor.XtextEditor;

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
	static protected String ROOT = "&problem";
	
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
			HashMap<EObject, Integer> globalCount = new HashMap<EObject, Integer>();
			EObject root = xtextResource.getContents().get(0);
			EObject o = root;
			new_object(table, count, counts, globalCount, root, o);			
			String name = ROOT;
			String edge_name = ROOT;
			out.println(ROOT + " @ cycle(");
			out.println("(");
			int u = 0;
			int number = 0;
			for (TreeIterator<EObject> objects = EcoreUtil.getAllContents(
					xtextResource, true); objects.hasNext();) {
				o = objects.next();
				new_object(table, count, counts, globalCount, root, o);			
				if (o == root) {
					edge_name = referenceName(table, o);
					number = 0;
					name = ROOT;
				} else {					
					edge_name = referenceName(table, o);
					number = globalCount.get(o);					
					name = "&n" + number;
				}
				if (u > 0) {
					out.println(",");
				}
				u++;
				out.println("  " + name + " := ");
				out.println("  {");
				int n = 0;
				out.print("      " + "ObjectType" + ": \"" + edge_name + "\"");				
				for (EStructuralFeature feature : o.eClass().getEAllStructuralFeatures()) {
					Object val = o.eGet(feature);
					handleValue(out, table, count, counts, globalCount, n, feature, val, root);
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

	private static String referenceName(HashMap<EObject, String> table, EObject o) {
//		String name = table.get(o) + (o==root?"":count.get(o));
		String name = table.get(o);
		return name;
	}
	
	
	static int total = 0;
	/**
	 * Create a new entry of object -> classname mapping, and increment the instance count for that class
	 * Also increment the total instances
	 * @param table
	 * @param count
	 * @param counts
	 * @param root
	 * @param o
	 * @return
	 */
	private static EObject new_object(HashMap<EObject, String> table,
			HashMap<EObject, Integer> count, 
			HashMap<EClass, Integer> counts,
			HashMap<EObject, Integer> globalCount,
			EObject root, EObject o) {
		String name = o.getClass().getSimpleName();
		table.put(o, name);
		if (count.get(o) == null) {
			if (counts.get(o.eClass()) == null)
				counts.put(o.eClass(), 1);
			else
				counts.put(o.eClass(), 1 + counts.get(o.eClass()));
			count.put(o, counts.get(o.eClass()));
			total++;
			globalCount.put(o, total);
		}
		return o;
	}

	/**
	 * Create the attributes based on the reflected EObject's features
	 * @param out
	 * @param table
	 * @param count
	 * @param counts
	 * @param globalCounts
	 * @param n
	 * @param feature
	 * @param val
	 * @param root
	 */
	private static void handleValue(PrintStream out,
			HashMap<EObject, String> table, HashMap<EObject, Integer> count,
			HashMap<EClass, Integer> counts, HashMap<EObject, Integer> globalCounts, 
			int n, EStructuralFeature feature, Object val,
			EObject root) {
		if (val instanceof EList<?>) {
			String list = "{";
			int m = 0;
			for (Object Obj: (EList<?>) val) {
				if (Obj instanceof EList<?>) {
					// TODO: we need to create a list variable
				} else if (Obj instanceof EObject) {
					EObject obj = (EObject) Obj;
					new_object(table, count, counts, globalCounts, root, obj);			
//					String name = referenceName(table, count, root, obj);
					String name = "&n" + globalCounts.get(obj);
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
			out.print(",\n" + "      " + feature.getName() + ":" + list);
		} else if (val instanceof EObject) {
			EObject obj = (EObject) val;
			new_object(table, count, counts, globalCounts, root, obj);			
//			String name = referenceName(table, count, root, obj);					
			String name = "&n" + globalCounts.get(obj);
			out.print(",\n" + "      " + feature.getName() + ": " + name);				
		} else {
			out.print(",\n" + "      " + feature.getName() + ": \"" + val + "\"");
		}
	}
	
}
