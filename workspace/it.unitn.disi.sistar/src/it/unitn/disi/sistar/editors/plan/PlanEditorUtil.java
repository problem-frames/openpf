package it.unitn.disi.sistar.editors.plan;

import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class PlanEditorUtil {
	public static void refreshNames(PlanContainer container, String oldName, String newName, boolean delete)
	{
		Map data = container.getData();
		for (Iterator iter = data.keySet().iterator(); iter.hasNext();) {
			String predicateName = (String)iter.next();
			List predicateList = (List)data.get(predicateName);
			
			List deleteList = new ArrayList();
			for (int i = 0; i < predicateList.size(); i++) {
				PlanPredicate planPredicate = (PlanPredicate) predicateList.get(i);
				List predicateItemParams = planPredicate.getParams();

				for (int j =0; j < predicateItemParams.size(); j++) {
					String itemName = (String) predicateItemParams.get(j);
					StringTokenizer tokenizer = new StringTokenizer(itemName, ",");
					String newItemName = "";
					while(tokenizer.hasMoreElements())
					{
						String separator = newItemName.equals("")?"":",";
						String itemSubName = (String)tokenizer.nextElement();
					
						if(delete && itemSubName.equals(oldName))
						{
							deleteList.add(planPredicate);
							break;
						}
						if(itemSubName.equals(oldName))
							newItemName += separator + newName;
						else
							newItemName += separator + itemSubName;
					}
					if(!delete)
						predicateItemParams.set(j, newItemName);
				}
			}
			predicateList.removeAll(deleteList);
		}
	}
}
