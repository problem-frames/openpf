package it.unitn.disi.sistar.editors.plan.viewers.table;


import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;

public class DelegationFeedbackCellModifier implements ICellModifier {
	private FeedbackTableViewer viewer;
	private PlanContainerMapUtility containerMap;
	
	public DelegationFeedbackCellModifier(FeedbackTableViewer viewer, PlanContainerMapUtility containerMap) {
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
		
		DelegationFeedback feedback = (DelegationFeedback) element;
		
		switch (columnIndex) {
		case 0: value = feedback.getDelegator();			
			break;

		case 1: value = feedback.getGoal();			
		break;
		
		case 2: value = feedback.getDelegate();			
		break;
		
		case 3: value = Boolean.valueOf(feedback.getCanDepend()); 					
		break;

		case 4: value = feedback.getStatus();			
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
		boolean modify=false;
		TableItem item = (TableItem) element;
		DelegationFeedback feedback = (DelegationFeedback) item.getData();
		int columnIndex = getIntex(property);
		String[] choices=null;
		if(viewer.getEditors()[columnIndex] instanceof ComboBoxCellEditor){
			choices = ((ComboBoxCellEditor)viewer.getEditors()[columnIndex]).getItems();
		}
		switch (columnIndex) {
		case 0: 
			if(value instanceof Integer){
				if (feedback.getDelegator().compareTo(choices[(Integer)value])!=0){
					modify = true;
					feedback.setDelegator(choices[(Integer)value]);
				}
			} else { 
				feedback.setDelegator(choices[0]);
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
			if(value instanceof Integer){
				if (feedback.getDelegate().compareTo(choices[(Integer)value])!=0){
					modify = true;
					feedback.setDelegate(choices[(Integer)value]);
				}
			} else { 
				feedback.setDelegate(choices[0]);
			}		
			break;
		case 3: 
			if(value instanceof Boolean){
				if (feedback.getDelegator() != "[None selected]" && feedback.getGoal() != "[None selected]" && feedback.getDelegate() != "[None selected]"){
					try {
						if (containerMap.canDepend(feedback.getDelegator(), feedback.getDelegate(),feedback.getGoal())==true){
						String message = "In the original planning domain the actor " + feedback.getDelegator() + " can depend on " + feedback.getDelegate() + " for the capability " + feedback.getGoal() + ".";
						MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
						feedback.setCanDepend(true);
						} else {
							feedback.setCanDepend(((Boolean)value).booleanValue());
						}
					} catch (ActorNotFoundException e) {
						MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original model has been modified, try to run the plan analysis. ");
					} catch (GoalNotFoundException e) {
						MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original model has been modified, try to run the plan analysis. ");
					}
				}else{
					MessageDialog.openInformation(viewer.getControl().getShell(),"Information", "First you have to choose actors and goal.");
				}
			} else {
				feedback.setCanDepend(false);
			}
			break;	
			
		case 4: 
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
		if(modify == true && columnIndex!=3){
			if (feedback.getDelegator() != "[None selected]" && feedback.getGoal() != "[None selected]" && feedback.getDelegate() != "[None selected]"){
				String message = "";
				try {
					if (containerMap.canDepend(feedback.getDelegator(), feedback.getDelegate(),feedback.getGoal())==false){
						if (feedback.getCanDepend()==false) {
							message = "In the original planning domain the actor " + feedback.getDelegator() + " cannot depend on " + feedback.getDelegate() + " for the capability " + feedback.getGoal() + ", do you want to add it?";
							if (MessageDialog.openQuestion(viewer.getControl().getShell(),"Question", message)==true){
								feedback.setCanDepend(true);
							}				
						}else {
							message = "In the original planning domain the actor " + feedback.getDelegator() + " cannot depend on " + feedback.getDelegate() + " for the capability " + feedback.getGoal() + ".";
							MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
						}
					} else if (containerMap.canDepend(feedback.getDelegator(), feedback.getDelegate(),feedback.getGoal())==true && feedback.getCanDepend()==false){
						message = "In the original planning domain the actor " + feedback.getDelegator() + " can depend on " + feedback.getDelegate() + " for the capability " + feedback.getGoal() + ".";
						MessageDialog.openInformation(viewer.getControl().getShell(),"Information", message);
						feedback.setCanDepend(true);
					}
				} catch (ActorNotFoundException e) {
					MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original model has been modified, try to run the plan analysis. ");
				} catch (GoalNotFoundException e) {
					MessageDialog.openInformation(viewer.getControl().getShell(),"Warning", e.getMessage() + "\n The original model has been modified, try to run the plan analysis. ");
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