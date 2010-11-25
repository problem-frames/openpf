package uk.ac.open.argument.ui;

import java.io.File;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.argument.argument.Argument;
import uk.ac.open.argument.argument.ArgumentDiagram;
import uk.ac.open.argument.argument.ArgumentFactory;
import uk.ac.open.argument.argument.Mitigates;
import uk.ac.open.argument.argument.Rebuts;
import uk.ac.open.argument.argument.diagram.part.ArgumentDiagramEditorUtil;
import uk.ac.open.ui.ImageDiagramEditor;
import convertor.EventCalculusRun;

/**
 * 
 * @author yy66
 * @generate NOT
 */
public class ArgumentEditor extends ImageDiagramEditor {

	protected ArgumentEditor() {
		super();
		extension = "argument";
	}

	void updateRound(Argument a) {
		if (a.eContainer() != null && a.eContainer() instanceof Argument) {
			Argument parent = (Argument) a.eContainer();
			a.setRound(parent.getRound());
		}
		for (Argument s : a.getGrounds())
			updateRound(s);
		for (Argument s : a.getWarrants())
			updateRound(s);
	}

	Set<Argument> set = new HashSet<Argument>();

	/**
	 * Assume the original argument was true, check whether all knowledge
	 * accumulated from the intermediate rounds until this round, plus the
	 * current argument a is inconsistent.
	 * 
	 * @param origin
	 * @param rebuttal
	 * @param d
	 * @return
	 */
	boolean reasoning(Argument origin, Argument rebuttal, ArgumentDiagram d) {
		// initialise the inconsistency flag
		boolean inconsistent = false;

		// prepare the filename
		URI u = rebuttal.eResource().getURI();
		URI e = u.trimFileExtension().appendFileExtension("" + origin.getName() + "." + 
				rebuttal.getName() + ".e");
		IPath path = new Path(e.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			File f = new File(file.getLocation().toOSString());
			PrintStream out = new PrintStream(f);

			// print the common header for every specification in Event Calculus
			out.println("sort boolean");
			out.println("sort integer");
			out.println("sort fluent");
			out.println("sort time: integer");
			out.println("range time 1 2");

			// declare the booleans, also collect the replaced arguments
			Set<Argument> replaced = new HashSet<Argument>();
			declareArgument(out, origin, replaced);
			declareArgument(out, rebuttal, replaced);
			for (Argument a: d.getNodes()) {
				if (a != origin && a!=rebuttal) {
					declareArgumentNot(out, a, replaced);
				}
			}
			// prepare the grounds for the original, target and intermediate
			// arguments
			outputInternalArgumentGrounds(out, origin, replaced);
			outputInternalArgumentGrounds(out, rebuttal, replaced);

			// prepare an implication rule (warrants) for the original and the
			// target argument
			// and also all intermediate arguments
			outputInternalArgumentWarrants(out, origin, replaced);
			outputInternalArgumentWarrants(out, rebuttal, replaced);

			// set the claim of the original argument to be the goal
			out.println("!" + origin.getName() + ".");

			// run the event calculus reasoner to check whether there is any
			// inconsistency by introducing the goal
			EventCalculusRun c = new EventCalculusRun();
			c.convert(file.getLocation().toOSString(), file.getLocation()
					.toOSString() + ".txt");
			File txtFile = new File(file.getLocation().toOSString() + ".txt");
			Scanner scanner = new Scanner(txtFile);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (line.contains("unsatisfied clauses")) {
					inconsistent = true;
				}
			}
			scanner.close();

		} catch (Exception x) {
		}
		return inconsistent;
	}

	private void declareArgument(PrintStream out, Argument b,
			Set<Argument> replaced) {
		out.println("boolean " + b.getName() + "; "
				+ b.getDescription().replaceAll("\n", "\n; "));
		if (b.getOrigin() != null)
			replaced.add(b.getOrigin());
		for (Argument a : b.getGrounds())
			declareArgument(out, a, replaced);
		for (Argument a : b.getWarrants())
			declareArgument(out, a, replaced);
	}

	String getExpr(Argument a) {
		// a.expr could be "" if the label is edited by the GMF editor
		if (a.getExpr() == null || a.getExpr().equals("")) {
			return a.getName();
		}
		return a.getName() + "<-> (" + a.getExpr() + ")";
	}

	/**
	 * Output the facts that are not nested
	 */
	private void outputInternalArgumentGrounds(PrintStream out, Argument a,
			Set<Argument> replaced) {
		Set<Argument> sub = new HashSet<Argument>();
		sub.addAll(a.getGrounds());
		sub.addAll(a.getWarrants());
		if (sub.size() > 0) {
			for (Argument c : sub) {
				outputInternalArgumentGrounds(out, c, replaced);
			}
			if (!(a.getExpr()==null || a.getExpr().equals(""))) {
				out.println(getExpr(a) + ".");
			}
		} else {
			if (replaced.contains(a))
				out.println(";" + a.getName() + ".");
			else {
				out.println(a.getName() + ".");
				if (!(a.getExpr()==null || a.getExpr().equals("")))
					out.println(getExpr(a) + ".");
			}
		}
	}

	/**
	 * Output the implicit implication rule for every nested argument
	 * 
	 * @param output
	 * @param a
	 * @param replaced
	 */
	private void outputInternalArgumentWarrants(PrintStream output, Argument a,
			Set<Argument> replaced) {
		String out = "";
		Set<Argument> sub = new HashSet<Argument>();
		sub.addAll(a.getGrounds());
		sub.addAll(a.getWarrants());
		if (sub.size() > 0) {
			Iterator<Argument> I = sub.iterator();
			for (int i = 0; i < sub.size() - 1; i++) {
				Argument c = I.next();
				outputInternalArgumentWarrants(output, c, replaced);
				out += c.getName() + "&";
			}
			Argument c = I.next();
			outputInternalArgumentWarrants(output, c, replaced);
			out += c.getName() + "->" + a.getName();
			if (replaced.contains(a))
				output.println(";" + a.getName() + ".");
			else
				output.println(out + ".");
		}
	}

	/**
	 * This method is called right after the syntax check is done, and before
	 * the model is to be saved back.
	 * 
	 * The argumentation model is updated according to the following semantics:
	 * (1) updateRound -- the rounds of sub-argument will inherit their parent
	 * argument's (2) reasoning --
	 * 
	 * The origin of the arguments (assume to be true) will be challenged by
	 * candidate rebuttal arguments in the next rounds. If they introduce
	 * inconsistency, the rebuttal relationships between the new argument and
	 * the original is found;
	 * 
	 * if the rebuttal is found, and in the next rounds the consistency is
	 * reestablished by the new argument, then a mitigation relationship between
	 * the new argument and the original is found.
	 * 
	 * @param resourceSet
	 *            -- the resourceSet
	 * @param xtextResource
	 *            -- the argumentation model
	 */
	protected void updateModel(XtextResourceSet resourceSet,
			Resource xtextResource) {
		ArgumentDiagram d = (ArgumentDiagram) xtextResource.getContents()
				.get(0);
		EList<Argument> arguments = d.getNodes();
		set.clear();
		for (Argument a : arguments) {
			updateRound(a);
			set.add(a);
		}
		// remove all user specified links
		d.getLinks().clear();
		for (Argument origin : arguments) {
			for (Argument rebuttal : arguments) {
				if (rebuttal.getRound() == origin.getRound()+1) {
					boolean consistent = reasoning(origin, rebuttal, d);
					if (!consistent) {
						// insert rebuttal links
						Rebuts r = ArgumentFactory.eINSTANCE.createRebuts();
						r.setFrom(origin);
						r.setTo(rebuttal);
						d.getLinks().add(r);
						// now we need to look for mitigations
						for (Argument mitigation : arguments) {
							if (mitigation.getRound() == rebuttal.getRound()+1) {
								consistent = reasoning(origin, rebuttal, mitigation, d);
								if (consistent) {
									// insert mitigation links
									Mitigates m = ArgumentFactory.eINSTANCE
											.createMitigates();
									m.setFrom(origin);
									m.setTo(mitigation);
									m.setRebuttal(rebuttal);
									m.setName(rebuttal.getName());
									d.getLinks().add(m);
								}
							}
						}
					}
				}
			}
		}
	}

	private boolean reasoning(Argument origin, Argument rebuttal,
			Argument mitigation, ArgumentDiagram d) {
		// initialise the inconsistency flag
		boolean inconsistent = false;

		// prepare the filename
		URI u = mitigation.eResource().getURI();
		URI e = u.trimFileExtension().appendFileExtension("" + origin.getName() + "." + 
				rebuttal.getName() + "." + mitigation.getName())
				.appendFileExtension("e");
		IPath path = new Path(e.toString());
		try {
			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			File f = new File(file.getLocation().toOSString());
			PrintStream out = new PrintStream(f);

			// print the common header for every specification in Event Calculus
			out.println("sort boolean");
			out.println("sort integer");
			out.println("sort fluent");
			out.println("sort time: integer");
			out.println("range time 1 2");

			// declare the booleans, also collect the replaced arguments
			Set<Argument> replaced = new HashSet<Argument>();
			declareArgument(out, origin, replaced);
			declareArgument(out, rebuttal, replaced);
			declareArgument(out, mitigation, replaced);
			for (Argument a: d.getNodes()) {
				if (a != origin && a!=rebuttal && a!=mitigation) {
					declareArgumentNot(out, a, replaced);
				}
			}
			outputInternalArgumentGrounds(out, origin, replaced);
			outputInternalArgumentGrounds(out, rebuttal, replaced);
			outputInternalArgumentGrounds(out, mitigation, replaced);
			outputInternalArgumentWarrants(out, origin, replaced);
			outputInternalArgumentWarrants(out, rebuttal, replaced);
			outputInternalArgumentWarrants(out, mitigation, replaced);
			out.println("!" + origin.getName() + ".");

			// run the event calculus reasoner to check whether there is any
			// inconsistency by introducing the goal
			EventCalculusRun c = new EventCalculusRun();
			c.convert(file.getLocation().toOSString(), file.getLocation()
					.toOSString() + ".txt");
			File txtFile = new File(file.getLocation().toOSString() + ".txt");
			Scanner scanner = new Scanner(txtFile);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				if (line.contains("unsatisfied clauses")) {
					inconsistent = true;
				}
			}
			scanner.close();

		} catch (Exception x) {
		}
		return inconsistent;
	}

	private void declareArgumentNot(PrintStream out, Argument b,
			Set<Argument> replaced) {
		// don't care about these arguments
		out.println("boolean " + b.getName());
		out.println("!" + b.getName() + ".");
		for (Argument a : b.getGrounds())
			declareArgumentNot(out, a, replaced);
		for (Argument a : b.getWarrants())
			declareArgumentNot(out, a, replaced);
		
	}

	protected void createDiagram(URI diagramURI, URI modelURI) {
		ArgumentDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}
}
