package it.unitn.disi.sistar.modeling.diagram.filters;

import it.unitn.disi.sistar.modeling.diagram.filters.util.DiagramFilterUtil;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

public abstract class AbstractFilter  implements IEditorActionDelegate{
	private IEditorPart editor;
	private IAction action;
	
	public final int NUM_CHILD_BUTTONS = 5;
	public IAction getAction() {
		return action;
	}

	public IEditorPart getEditor() {
		return editor;
	}

	public AbstractFilter() {
		Map filterMap = DiagramFilterUtil.getFilterMap();
		filterMap.put(this.getClass().getCanonicalName(), this);
	}
	protected void manipulateAllAndNoneButton()
	{
		int elementCount = 0;
		AbstractFilter allModelFilter = null;
		
		for (Iterator iter = DiagramFilterUtil.getFilterMap().values().iterator(); iter.hasNext();) {
			AbstractFilter element = (AbstractFilter) iter.next();
			/*if(action.isChecked() && element instanceof NoneModelFilter 
					&& element.getAction().isChecked())
				element.getAction().setChecked(false);
			else */
			if(!action.isChecked() && element instanceof AllModelFilter 
					&& element.getAction().isChecked())
				element.getAction().setChecked(false);
			
			if(element.getAction().isChecked() && !(element instanceof NoneModelFilter)&& !(element instanceof TroposModelFilter)
					&&!(element instanceof AllModelFilter) )
				elementCount++;
			if(element instanceof AllModelFilter)
				allModelFilter = element;
		}
		if(elementCount == NUM_CHILD_BUTTONS)
			if(!allModelFilter.getAction().isChecked())
				allModelFilter.getAction().setChecked(true);
	
	}
	public abstract void run(IAction action);
	
	public void selectionChanged(IAction action, ISelection selection) {	
	}
	
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		editor = targetEditor;
		this.action = action;
		if(!(this instanceof NoneModelFilter) &&!(this instanceof TroposModelFilter))
		{
			action.setChecked(true);
			this.run(action);
		}else
		{
			action.setChecked(false);
			this.run(action);
		}
	}
	
	public void checkIfChecked(String canonicalName, boolean checked)
	{
		AbstractFilter filter = (AbstractFilter)DiagramFilterUtil.getFilterMap().get(canonicalName);
		if(filter!= null && checked && filter.getAction().isChecked()!= checked)
		{
			filter.getAction().setChecked(checked);
			filter.run(filter.getAction());
		}
	}
	
	public void uncheckIfUnchecked(String canonicalName, boolean checked)
	{
		AbstractFilter filter = (AbstractFilter)DiagramFilterUtil.getFilterMap().get(canonicalName);
		if(filter!= null && !checked && filter.getAction().isChecked()!= checked)
		{
			filter.getAction().setChecked(checked);
			filter.run(filter.getAction());
		}
	}
	public void uncheckIfChecked(String canonicalName, boolean checked)
	{
		AbstractFilter filter = (AbstractFilter)DiagramFilterUtil.getFilterMap().get(canonicalName);
		if(filter!= null && checked && filter.getAction().isChecked()== checked)
		{
			filter.getAction().setChecked(!checked);
			filter.run(filter.getAction());
		}
	}
}
