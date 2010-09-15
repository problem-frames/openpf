package edu.toronto.cs.openome.evaluation.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.eclipse.emf.common.command.Command;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ListDialog;
import org.eclipse.ui.dialogs.SelectionDialog;

import edu.toronto.cs.openome.evaluation.gui.EvalLabelElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.gui.EvaluationDialog;
import edu.toronto.cs.openome.evaluation.gui.LabelBagElementTypeLabelProvider;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntQualIntentionWrapper;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.IntentionLabelPair;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.HumanJudgement;
import edu.toronto.cs.openome.evaluation.qualitativeinteractivereasoning.LabelBag;

import edu.toronto.cs.openome_model.Contribution;
import edu.toronto.cs.openome_model.EvaluationLabel;
import edu.toronto.cs.openome_model.Intention;
import edu.toronto.cs.openome_model.diagram.providers.Openome_modelElementTypes;

public class BackwardHJWindowCommand extends HJWindowCommand {
	
	private boolean done;
	private boolean noCombinations;
	private LabelBag resultBag;
	
	public BackwardHJWindowCommand(Shell s, IntQualIntentionWrapper w) {
		super(s, w);
		
		done = false;
		noCombinations = false;
		resultBag = new LabelBag();
	}

	public boolean canExecute() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean canUndo() {
		// TODO Auto-generated method stub
		return false;
	}

	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return null;
	}
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("restriction")
	public void execute() {
		Intention intention = wrapper.getIntention();
		
		Display display = PlatformUI.getWorkbench().getDisplay();
		
		final Shell shell = new Shell(display);
		
		shell.setText("Backward Evaluation Human Judgment");
		
		GridLayout gridLayout = new GridLayout(3, false);
        shell.setLayout(gridLayout);
		
		////FillLayout fillLayout = new FillLayout();
		//fillLayout.type = SWT.VERTICAL;
		//shell.setLayout(fillLayout);

		Text text = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		
		GridData gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;

		text.setLayoutData(gridData);

		String name = intention.getName();
		String target = wrapper.getInitialEvaluationLable().toString();
		text.setText("Results indicate that " + name + " must have a value of " 
				+ target + ".\nEnter a combination of evaluation labels for intentions contributing to " 
				+ name + " which would result in " + target + " for " + name + ".");
		
		
		final Table table = new Table (shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
		
		gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;

		table.setLayoutData(gridData);
		
		String [] titles = {"Contributing Intention", "Link", "Select Label"};
		
		for (int i=0; i<3; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth (150);
			column.setText(titles[i]);
		}
		
		final HashMap<Intention, CCombo> combos = new HashMap<Intention, CCombo>();
		
		for (Intention i: intention.getChildren()) {
			TableItem item = new TableItem (table, 0);
			item.setText (0, i.getName());
			//item.setText (1, "link");
			for (Contribution cont: i.getContributesTo()) {
				if (cont.getTarget().equals(intention))
					item.setText (1, cont.getContributionType());
			}
			
			TableEditor editor = new TableEditor (table);
			editor.grabHorizontal = true;
			//String [] names = {"S", "PS", "U", "C", "PD", "D"};
			
			/*//for (int j=0; j<6; j++) {
				Button button = new Button (table, SWT.RADIO);
				button.setText ("S");
				//button.addListener (SWT.Selection, listener);
				//if (j == 0)
				button.setSelection (true);
				
				editor.setEditor(button, item, 2);	
			//}

				 button = new Button (table, SWT.RADIO);
				button.setText ("PS");
				//button.addListener (SWT.Selection, listener);
				//if (j == 0)
				//button.setSelection (true);
				
				editor.setEditor(button, item, 2);
				*/
			
			//Button button = new Button (table, SWT.TOGGLE);
			//button.setText ("B");
			//button.addListener (SWT.Selection, listener);
			//button.setSelection (true);
			
			
			CCombo combo = new CCombo (table, SWT.NONE);
			combos.put(i, combo);
			combo.setText("Label");
			combo.add("Satisfied");
			combo.add("Partially Satisfied");
			combo.add("Unknown");
			combo.add("Conflict");
			combo.add("Partially Denied");
			combo.add("Denied");
			
			editor.setEditor(combo, item, 2);
			/*combo.addSelectionListener(new SelectionAdapter() {
				public void widgetSelected(SelectionEvent e) {
					System.out.println(e.detail + " " + e.text);
				}
			});*/			
			
					
		}
		
		text = new Text(shell, SWT.READ_ONLY | SWT.WRAP);
		
		gridData = new GridData();
		gridData.horizontalSpan = 3;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;

		text.setLayoutData(gridData);
		String previous = "Previous combinations: \n";
		Vector<HumanJudgement> hjs = wrapper.getHumanJudgements();
		if (hjs.size() == 0) {
			previous += "None";
		} else {
			for (HumanJudgement hj : hjs) {
				previous += hj.getLabelBag().toString();
				
				previous += "produced value: " + hj.getJudgement() + "\n";					
			}
		}
		text.setText(previous);
		
		
		final Button doneB = new Button (shell, SWT.PUSH);
		doneB.setText ("OK");
		
		doneB.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("Done");
				done = true;
				done(combos);
				shell.dispose();
				return;
			}
		});

		
		gridData = new GridData();
		gridData.horizontalSpan = 1;
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		//gridData.grabExcessVerticalSpace = true;
		doneB.setLayoutData(gridData);
		
		Button cancel = new Button (shell, SWT.PUSH);
		
		cancel.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("Cancel");
				cancelled = true;
				shell.dispose();
				return;
			}
		});
		
		cancel.setText ("Cancel");		
		cancel.setLayoutData(gridData);
		
		final Button noCombo = new Button (shell, SWT.PUSH);
		noCombo.setText ("No Combination");		
		noCombo.setLayoutData(gridData);
		
		noCombo.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				//System.out.println("NoCombo");
				noCombinations = true;
				shell.dispose();
				return;
			}
		});
		
		//table.setSize (300, 100);
		shell.setSize (500, 400);
		
		shell.open();
		
		shell.forceActive();
		
		while (!shell.isDisposed ()) {
			//System.out.println("shell not disposed");
			if (!display.readAndDispatch ()) display.sleep ();
		}
		//System.out.println("shell is disposed");
		
		return;
		/*Label label = new Label (shell, SWT.BORDER);
		//label.setImage (image);
		label.setText("Here is my label");
		label.pack ();

		label.setSize(200, 50);*/
		
	
		//text.setSize(400, 100);
		
		//shell.pack ();
		
		
		//GridLayout layout = new GridLayout(4, false);
		//shell.setLayout(layout);
		
		/*Button b = new Button(shell, SWT.PUSH);
		b.setText("LEFT, TOP");
		b.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("LEFT, CENTER");
		b.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("LEFT, BOTTOM");
		b.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("LEFT, FILL");
		b.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("CENTER, TOP");
		b.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("CENTER, CENTER");
		b.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("CENTER, BOTTOM");
		b.setLayoutData(new GridData(SWT.CENTER, SWT.BOTTOM, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("CENTER, FILL");
		b.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("RIGHT, TOP");
		b.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("RIGHT, CENTER");
		b.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("RIGHT, BOTTOM");
		b.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("RIGHT, FILL");
		b.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("FILL, TOP");
		b.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("FILL, CENTER");
		b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("FILL, BOTTOM");
		b.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, true, 1, 1));
		b = new Button(shell, SWT.PUSH);
		b.setText("FILL, FILL");
		b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		shell.open ();*/
		//while (!shell.isDisposed ()) {
		//	if (!display.readAndDispatch ()) display.sleep ();
		//}
		
		
		/*
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		data.heightHint = 200;
		table.setLayoutData(data);
		String[] titles = {" ", "C", "!", "Description", "Resource", "In Folder", "Location"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			column.setText (titles [i]);
		}	
		int count = 128;
		for (int i=0; i<count; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (0, "x");
			item.setText (1, "y");
			item.setText (2, "!");
			item.setText (3, "this stuff behaves the way I expect");
			item.setText (4, "almost everywhere");
			item.setText (5, "some.folder");
			item.setText (6, "line " + i + " in nowhere");
		}
		for (int i=0; i<titles.length; i++) {
			table.getColumn (i).pack ();
		}	
		shell.pack ();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		*/
		//display.dispose ();

		
	}

	protected void done(HashMap<Intention, CCombo> combos) {
		//System.out.println("in done");
		LabelBag lb = new LabelBag();
		for (Object obj : combos.keySet()) {
			Intention intention = (Intention) obj;
			//System.out.println("Intention in combos: " + intention.getName());
			
			CCombo combo = combos.get(obj);
			
			int index = combo.getSelectionIndex();
			
			//System.out.println("index: " + index);
			
			EvaluationLabel label = null;
			switch(index) {
				case(0): label = EvaluationLabel.SATISFIED; break;
				case(1): label = EvaluationLabel.WEAKLY_SATISFIED; break;
				case(2): label = EvaluationLabel.UNKNOWN; break;
				case(3): label = EvaluationLabel.CONFLICT; break;
				case(4): label = EvaluationLabel.WEAKLY_DENIED; break;
				case(5): label = EvaluationLabel.DENIED; break;
			}
			
			//System.out.println(label.getName());
				
			if (label != null)  {
				//System.out.println("label not null");
				
				lb.addToBag(intention, label);
				
				//wrapper.addtoLabelBag(intention, label);
			}
		}
		resultBag = lb;
		HumanJudgement hj = new HumanJudgement(lb, wrapper.getInitialEvaluationLable());
		wrapper.addHumanJudgement(hj);
	}
	
	public LabelBag getBagResult() {
		return resultBag;
	}
	
	
	public boolean done() {
		return done;
	}
	
	public boolean noCombinations() {
		return noCombinations;
	}

}
