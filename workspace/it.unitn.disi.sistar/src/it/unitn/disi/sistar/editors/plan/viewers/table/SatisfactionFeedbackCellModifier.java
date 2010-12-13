package it.unitn.disi.sistar.editors.plan.viewers.table;



import java.util.Collections;
import java.util.List;
import java.util.Map;

import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;

import org.eclipse.gmf.runtime.diagram.ui.dialogs.sortfilter.SortFilterElement;
import org.eclipse.gmf.runtime.notation.Filtering;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.TableItem;

public class SatisfactionFeedbackCellModifier implements ICellModifier {
	
	private FeedbackTableViewer viewer;
	private PlanContainerMapUtility containerMap;
	
	public SatisfactionFeedbackCellModifier(FeedbackTableViewer viewer, PlanContainerMapUtility containerMap) {
		super();
		this.viewer = viewer;
		this.containerMap = containerMap;
	}

	public boolean canModify(Object element, String property) {
		return true;
	}
	
	public Object getValue(Object element, String property) {

		int columnIndex = getIntex(property);
		Object value=null;
		
		SatisfactionFeedback feedback = (SatisfactionFeedback) element;
		
		switch (columnIndex) {
		case 0: value = feedback.getActor();			
			break;

		case 1: value = feedback.getGoal();			
		break;
				
		case 2: value = Boolean.valueOf(feedback.getCanProvide()); 			
		break;
		
		case 3: value = feedback.getStatus();			
		break;

		}
			if(viewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor)
			{	
				String[] choices = ((ComboBoxCellEditor)viewer.getEditors()[columnIndex]).getItems();
				for (int i = 0; i < choices.length; i++) {
					if(choices[i].equals(value))
						value = new Integer(i);
				}
				if(!(value instanceof Integer))
					value = Integer.valueOf(0);
			}
		return value;
	}
	
	

	public void modify(Object element, String property, Object value) {

		if(value == null){
			return;
		}
		TableItem item = (TableItem) element;
		SatisfactionFeedback feedback = (SatisfactionFeedback) item.getData();
		
		boolean modify=false;
				
		int columnIndex = getIntex(property);
		String[] choices=null;
		if(viewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor){
			choices = ((ComboBoxCellEditor)viewer.getEditors()[columnIndex]).getItems();
		}
		switch (columnIndex) {
		case 0: 
			if(value instanceof Integer){
				if (feedback.getActor().compareTo(choices[(Integer)value])!=0){
					modify = true;
					feedback.setActor(choices[(Integer)value]);
				}
			} else { 
				feedback.setActor(choices[0]);
			}		
			break;

		case 1: 
			if(value instanceof Integer){
				if (feedback.getGoal().compareTo(choices[(Integer)value])!=0){
					modify = true;
					feedback.setGoal(choices[(Integer)value]);
				}
			} else { 
				feedback.setGoal(choices[0]);
			}		
			break;
		case 2: 
			if(value instanceof Boolean){
				if (feedback.getActor() != "[None selected]" && feedback.getGoal() != "[None selected]"){
					
					try {
						if(containerMap.canProvide(feedback.getActor(), feedback.getGoal())==true){
							String message = "In the original planning domain  the actor " + feedback.getActor() + " has the capability " + feedback.getGoal() + ".";
							MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
							feedback.setCanProvide(true);
						}else {
							feedback.setCanProvide(((Boolean)value).booleanValue());
						}
					} catch (ActorNotFoundException e) {
						 MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");

					} catch (GoalNotFoundException e) {
						MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");
					}
				}else{
					MessageDialog.openInformation(viewer.getControl().getShell(),"Information", "First you have to choose actor and goal.");
				}
			} else {
				feedback.setCanProvide(false);
			}
			break;		
			case 3: 
				if(value instanceof Integer){
					if (feedback.getStatus().compareTo(choices[(Integer)value])!=0){
						modify = true;
						feedback.setStatus(choices[(Integer)value]);
					}
				} else { 
					feedback.setStatus(choices[0]);
				}		
				break;
		}	
			
		if(modify == true && columnIndex!=2){
		if (feedback.getActor() != "[None selected]" && feedback.getGoal() != "[None selected]"){
			String message = "";
			try {
				if (containerMap.canProvide(feedback.getActor(), feedback.getGoal())==false){
					if (feedback.getCanProvide()==false) {
						message = "In the original planning domain the actor " + feedback.getActor() + " doesn't have the capability " + feedback.getGoal() + ", do you want to add it?";
						if (MessageDialog.openQuestion(viewer.getControl().getShell(),"Question", message)==true){
							feedback.setCanProvide(true);
						}				
					}else {
						message = "In the original planning domain the actor " + feedback.getActor() + " doesn't have the capability " + feedback.getGoal() +".";
						MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
					}
				} else if (containerMap.canProvide(feedback.getActor(), feedback.getGoal())==true && feedback.getCanProvide()==false){
					message = "In the original planning domain the actor " + feedback.getActor() + " has the capability " + feedback.getGoal() + ".";
					MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
					feedback.setCanProvide(true);
				}
			} catch (ActorNotFoundException e) {
				MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");
			} catch (GoalNotFoundException e) {
				MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original planning domain has been modified, try to run the plan analysis. ");
			}
		}
	}	
		viewer.refresh();
	}
	
	
	private int getIntex(String property){
		String[] column = viewer.getColumnNames();
		int columnIndex =0;
		while(columnIndex < column.length){
			if (column[columnIndex].compareTo(property)==0){
				return columnIndex;
			}
			columnIndex++;
		}
		return -1;
		
	}

}