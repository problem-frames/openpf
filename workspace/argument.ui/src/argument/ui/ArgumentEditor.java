package argument.ui;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.parsetree.reconstr.Serializer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.ui.ImageDiagramEditor;
import argument.argument.Argument;
import argument.argument.ArgumentDiagram;
import argument.argument.ArgumentFactory;
import argument.argument.Link;
import argument.argument.Mitigates;
import argument.argument.Rebuts;
import argument.diagram.part.ArgumentDiagramEditorUtil;
import argument.ui.internal.ArgumentActivator;
import convertor.EventCalculusRun;

/**
 * 
 * @author yy66
 * @generate NOT
 * 
 */
public class ArgumentEditor extends ImageDiagramEditor {

	protected ArgumentEditor() {
		super();
		extension = "argument";
	}

	@Override
	protected void deleteGeneratedFiles(IResource res) {
		super.deleteGeneratedFiles(res);
		deleteFile(res, ".*\\.e");
		deleteFile(res, ".*\\.e\\.txt");
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
	private Serializer sr;

	String getExpr(Argument a) {
		// a.expr could be "" if the label is edited by the GMF editor
		if (a.getExpr() == null || a.getExpr().equals("")) {
			return a.getName();
		}
		if (sr != null)
			return a.getName() + "<-> (" + sr.serialize(a.getExpr()) + ")";
		return a.getName() + "<-> (" + a.getExpr() + ")";
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
		}
		if (replaced.contains(a))
			output.println(";" + a.getName() + ".");
		else if (!out.equals(""))
			output.println(out + ".");
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
		System.out.println(ArgumentActivator.getInstance().getPreferenceStore());
		System.out.println(ArgumentActivator.getInstance().getPreferenceStore().getBoolean("reasoning"));
		if (! ArgumentActivator.getInstance().getPreferenceStore().getString("reasoning").equals("true"))
			return;
		ArgumentDiagram d = (ArgumentDiagram) xtextResource.getContents()
				.get(0);
		XtextResource xr = (XtextResource) xtextResource;
		sr = xr.getSerializer();
		EList<Argument> arguments = d.getNodes();
		set.clear();
		// propagate the round number of the root argument to all the descendant
		// sub-arguments
		int maxRound = Integer.MIN_VALUE;
		int minRound = Integer.MAX_VALUE;
		for (Argument a : arguments) {
			updateRound(a);
			set.add(a);
			if (a.getRound() > maxRound) {
				maxRound = a.getRound();
			}
			if (a.getRound() < minRound) {
				minRound = a.getRound();
			}
		}
		// remove all user specified links
		d.getLinks().clear();
		// Algorithm 1: enumerate all the paths
		HashSet<ArrayList<Argument>> seqs = new HashSet<ArrayList<Argument>>();
		for (int r = minRound; r <= maxRound; r++) {
			HashSet<ArrayList<Argument>> seqs2 = new HashSet<ArrayList<Argument>>();
			for (Argument a : arguments) {
				// add the next round arguments
				if (a.getRound() == r) {
					if (r == minRound) {
						ArrayList<Argument> seq = new ArrayList<Argument>();
						seq.add(a);
						seqs2.add(seq);
					} else {
						// copy the earlier sequences
						for (ArrayList<Argument> seq : seqs) {
							ArrayList<Argument> seq2 = new ArrayList<Argument>();
							// append the new argument to these sequences
							seq2.addAll(seq);
							seq2.add(a);
							seqs2.add(seq2);
						}
					}
				}
			}
			seqs.clear();
			seqs = seqs2;
			for (ArrayList<Argument> seq : seqs) {
				for (int i=0; i<seq.size(); i++)
					System.out.print(seq.get(i).getName() + ".");
				System.out.println();
			}
		}
		for (ArrayList<Argument> seq : seqs) {
			for (int i=0; i<seq.size(); i++)
				System.out.print(seq.get(i).getName() + ".");
			System.out.println();
			// verify the sequence
			KB.clear();
			consistency.clear();
			reasoning(seq, d); // Algorithm 2
		}
	}

	/*
	 * Compute the accumulated knowledge from the incremental arguments along
	 * this sequence
	 */
	Set<String> getKB(List<Argument> seq, ArgumentDiagram d) {
		Set<String> KB = new HashSet<String>();
		if (seq.size() == 0)
			return KB;
		List<Argument> previous = seq.subList(0, seq.size() - 1);
		KB = getKB(previous, d);
		Argument tail = seq.get(seq.size() - 1);
		Set<String> removed = getRemoved(tail);
		Set<String> added = getModified(tail, d);
		KB.removeAll(removed);
		KB.addAll(added);
		return KB;
	}

	/*
	 * Compute the accumulated declarations from the incremental arguments along
	 * this sequence
	 */
	Set<String> getKBDeclarations(List<Argument> seq) {
		Set<String> KB = new HashSet<String>();
		if (seq.size() == 0)
			return KB;
		List<Argument> previous = seq.subList(0, seq.size() - 1);
		KB = getKBDeclarations(previous);
		Argument tail = seq.get(seq.size() - 1);
		Set<String> added = getKBDeclarations(tail);
		KB.addAll(added);
		return KB;
	}
	
	private Set<String> getKBDeclarations(Argument a) {
		Set<String> r = new HashSet<String>();
		r.add("boolean " + a.getName() + "; "
				+ a.getDescription().replaceAll("\n", "\n; "));
		for (Argument b : a.getGrounds()) {
			r.addAll(getKBDeclarations(b));
		}
		for (Argument b : a.getWarrants()) {
			r.addAll(getKBDeclarations(b));
		}
		return r;
	}

	/*
	 * Remove all the claims that are pointed by the "replacing A" clause
	 */
	private Set<String> getRemoved(Argument a) {
		Set<String> r = new HashSet<String>();
		if (a.getOrigin() != null) {
			r.add("!" + a.getOrigin().getName() + ".");
		}
		for (Argument b : a.getGrounds())
			r.addAll(getRemoved(b));
		for (Argument b : a.getWarrants())
			r.addAll(getRemoved(b));
		return r;
	}

	/*
	 * Add all the expressions in the "with E" clause If "with E" does not
	 * appear, then use the name of the argument instead
	 */
	private Set<String> getModified(Argument a, ArgumentDiagram d) {
		Set<String> r = new HashSet<String>();
		if (a.getExpr()!=null)
			r.add(getExpr(a) + ".");
		List<String> implicit_rules = new ArrayList<String>();
		for (Argument b : a.getGrounds()) {
			r.addAll(getModified(b, d));
			implicit_rules.add(b.getName());
		}
		for (Argument b : a.getWarrants()) {
			r.addAll(getModified(b, d));
			implicit_rules.add(b.getName());
		}
		String implicit = "";
		for (String premise: implicit_rules) {
			implicit = implicit + (implicit.equals("")?"": " & ") + premise;
		}
		if (implicit_rules.size()>0)
			r.add("(" + implicit + ") -> " + a.getName() + ".");
		else
			r.add(a.getName() + ".");
		return r;
	}

	/**
	 * return "." separated list of the names of the claim in the sequence
	 */
	String getSequenceID(List<Argument> seq) {
		String name = "";
		if (seq.size() == 0)
			return "";
		List<Argument> previous = seq.subList(0, seq.size() - 1);
		Argument tail = seq.get(seq.size() - 1);
		name = getSequenceID(previous) + (previous.size()>0?".":"") + tail.getName();
		return name;
	}

	Set<String> KB = new HashSet<String>();
	HashMap<Argument, Boolean> consistency = new HashMap<Argument, Boolean>();
	private void reasoning(List<Argument> seq, ArgumentDiagram d) {
		if (seq.size() == 0)
			return;
		List<Argument> previous = seq.subList(0, seq.size() - 1);
		// perform the reasoning on the previous arguments
		reasoning(previous, d);
		Argument tail = seq.get(seq.size() - 1);
		Set<String> removed = getRemoved(tail);
		Set<String> added = getModified(tail, d);
		for (String rem: removed) {
			KB.remove(rem.replace("!", ""));
		}
		KB.addAll(removed);
		KB.addAll(added);
		for (int i = 0; i < previous.size(); i++) {
			Argument a = previous.get(i);
			boolean consistent = reasoning(seq, KB, a, d);
			System.out.println(getSequenceID(seq) + "->" + a.getName() + " " + consistent);
			Boolean previousConsistency = consistency.get(a);
			if (previousConsistency == null)
				previousConsistency = Boolean.TRUE;
			if (previousConsistency && !consistent) {
				Rebuts r = ArgumentFactory.eINSTANCE.createRebuts();
				r.setFrom(previous.get(previous.size() - 1));
				r.setTo(tail);
				r.setOrigin(a);
				boolean found = false;
				for (Link l: d.getLinks()) {
					if (l instanceof Rebuts) {
						Rebuts lr = (Rebuts) l;
						if (l.getFrom() == r.getFrom() && l.getTo()==r.getTo() && lr.getOrigin() == r.getOrigin()) {
							found = true;
						}
					}
				}
				if (!found) d.getLinks().add(r);
			} else if (!previousConsistency && consistent) {
				Mitigates m = ArgumentFactory.eINSTANCE.createMitigates();
				m.setFrom(previous.get(previous.size() - 1));
				m.setTo(tail);
				m.setRebuttal(a);
				boolean found = false;
				for (Link l: d.getLinks()) {
					if (l instanceof Mitigates) {
						Mitigates lm = (Mitigates) l;
						if (l.getFrom() == m.getFrom() && l.getTo()==m.getTo() && lm.getRebuttal() == m.getRebuttal()) {
							found = true;
						}
					}
				}
				if (!found) d.getLinks().add(m);
			}
			consistency.put(a, consistent);
		}
	}

	private boolean reasoning(List<Argument> seq, Set<String> KB,
			Argument claim, ArgumentDiagram d) {
		// initialise the inconsistency flag
		boolean inconsistent = false;
		// prepare the filename
		URI u = claim.eResource().getURI();
		URI e = u
				.trimFileExtension()
				.appendFileExtension(
						"" + getSequenceID(seq) + "." + claim.getName())
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
			for (String s: getKBDeclarations(seq)) {
				out.println(s);
			}
			for (String s : KB) {
				out.println(s);
			}
			out.println("!" + claim.getName() + ".");
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

	@Override
	protected void createDiagram(URI diagramURI, URI modelURI,
			Resource xtextResource) {
		super.createDiagram(diagramURI, modelURI, xtextResource);
		ArgumentDiagramEditorUtil.createDiagram(diagramURI, modelURI,
				new NullProgressMonitor());
	}
}
