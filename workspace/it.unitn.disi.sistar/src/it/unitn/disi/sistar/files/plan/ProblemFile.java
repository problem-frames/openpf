package it.unitn.disi.sistar.files.plan;


import it.unitn.disi.sistar.config.PlanConfig;
import it.unitn.disi.sistar.config.PlanConfigItem;
import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ProblemFile {
	private File baseFile;
	private Map<String, PlanContainer> childContainerMap;
	
	private Map goalTypeMap;
	public ProblemFile(File baseFile)
	{
		this.baseFile = baseFile;
	}
	
	public void load() throws Exception
	{
		int state = 0;
		List queue = new ArrayList();
		List elementList = new ArrayList();
		List predicatesList = new ArrayList();
		BufferedReader reader = new BufferedReader(new FileReader(baseFile));
		goalTypeMap = new HashMap();
		while(reader.ready())
		{
			String s = reader.readLine();
			if (s == null)
				s = "";
			else
				s = s.trim();
			
			StringTokenizer tokenizer = new StringTokenizer(s, " ");
			while(tokenizer.hasMoreElements())
			{
				String element = (String)tokenizer.nextElement();
				//System.out.println(element);
				
				if(element.equals("(:objects"))
				{
					state = 1;
					continue;
				}
				if(element.equals("-"))
				{
					state = 3;
					continue;
				}
				if(state == 1)
				{
					//System.out.println(queue);
					if(queue != null && queue.size() > 0)
						elementList.add(queue);
					queue = new ArrayList();
					state = 2;
				}

				if(state == 2)
					queue.add(element);
				if(state == 3)
				{
					queue.add(element);
					state = 1;
				}
				
				if(element.equals("(:init"))
				{
					state = 4;
					queue = new ArrayList();
					continue;
				}
				if(state == 4)
				{
					if(element.startsWith("("))
						queue.add(element.substring(1));
					else if(element.endsWith(")") && element.length() > 1)
					{
						queue.add(element.substring(0, element.length() -1));
						if(queue != null && queue.size() > 0)
							predicatesList.add(queue);
						queue = new ArrayList();
					}
					else if(element.endsWith(")") && element.length() == 1)
					{
						if(queue != null && queue.size() > 0)
							predicatesList.add(queue);
						queue = new ArrayList();
					}
					else
					{
						queue.add(element);
					}
				}
					
			}
			
		}
		if(queue != null && queue.size() > 0)
			predicatesList.add(queue);
		for (Iterator iter = elementList.iterator(); iter.hasNext();) {
			List checkList = (List) iter.next();
			//System.out.println("element list:" + checkList);
		}
		for (Iterator iter = predicatesList.iterator(); iter.hasNext();) {
			List checkList = (List) iter.next();
			//System.out.println("predicates list:" + checkList);
		}
		//System.out.println("predicate list:" + predicatesList);
		
		PlanConfig config = PlanConfig.getInstance();
		Map predicateMap = config.getPredicatesMap();
		
		childContainerMap = new HashMap<String, PlanContainer>();
		for (int i = 0; i < elementList.size(); i++) {
			List elementContentList = (List) elementList.get(i);
			String elementType = (String)elementContentList.get(elementContentList.size() -1);
			PlanContainer parent = new PlanContainer(elementType);
			List planPredicateConfigurationList = (List)predicateMap.get(elementType);
			for (int j = 0; j < elementContentList.size() -1 ; j++) {
				String elementName = (String)elementContentList.get(j);
				PlanContainer container = new PlanContainer(elementName);
				for (Iterator iter = predicatesList.iterator(); iter
						.hasNext();) {
					List elementPredicateContentList = (List) iter.next();
					if(elementPredicateContentList.get(1).equals(elementName))
					{
						String predicateName = (String)elementPredicateContentList.get(0);
						
						//remove the last digits from such as and_decomposes2
						while(Character.isDigit(predicateName.charAt(predicateName.length() -1)))
							predicateName = predicateName.substring(0, predicateName.length() -1);
						PlanConfigItem planPredicateConfiguration = null;

						for (Iterator iterator = planPredicateConfigurationList.iterator(); iterator
								.hasNext();) {
							PlanConfigItem element = (PlanConfigItem) iterator.next();
							//System.out.println("element name:" + element.getName() + " predicate name:" + predicateName);
							if(element.getName().equals(predicateName))
								planPredicateConfiguration = element;
						}
						if(planPredicateConfiguration == null)
							throw new Exception("Domain file does not match with problem file cannot find element:" + predicateName);
						PlanPredicate predicate = new PlanPredicate();
						
						List paramList = new ArrayList();
						if(planPredicateConfiguration.getParameters()!= null)
						{
							for(int l = 1; l < planPredicateConfiguration.getParameters().size() + 1&& l < elementPredicateContentList.size(); l++)
							{
								String param = (String)elementPredicateContentList.get(l);
								paramList.add(param);
							}
						}
						if(planPredicateConfiguration.getParameters().size() + 1 < elementPredicateContentList.size())
						{
							String text = "";
							for(int l = planPredicateConfiguration.getParameters().size() + 1; l < elementPredicateContentList.size(); l++)
							{
								text += elementPredicateContentList.get(l);
								if(l != elementPredicateContentList.size() -1)
									text += ",";
							}
							paramList.add(text);
						}
						//System.out.println(paramList);
						
						//cache the goaltype definition
						if(predicateName.equals("type"))
						{
							List goalTypeList = null;
							
							String goalDef = elementName.toUpperCase();
							String goalTypeDef = ((String)paramList.get(1)).toUpperCase();
							if(goalTypeMap.get(goalTypeDef) == null)
								goalTypeList = new ArrayList();
							else
								goalTypeList = (List)goalTypeMap.get(goalTypeDef);
							goalTypeList.add(goalDef);
							goalTypeMap.put(goalTypeDef, goalTypeList);
						}
						
						predicate.setParams(paramList);
						container.addAttribute(predicateName, predicate);
					}
				}
				parent.add(container);
			}
			
			childContainerMap.put(elementType, parent);
			
		}
		//System.out.println("map:" + goalTypeMap);
		//System.out.println("element list:" + elementList);
		//System.out.println("predicate list:" + predicatesList);
		reader.close();
	}
	
	public void save() throws IOException
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(baseFile));
		PlanConfig config = PlanConfig.getInstance();
		Map predicateMap = config.getPredicatesMap();
		
		writer.write("(define (problem ptool) \n");
		writer.write("  (:domain tropos-domain) \n");
		writer.write("  (:objects \n");
		
		StringBuffer satisfiedSegment = new StringBuffer();
		satisfiedSegment.append("  (:goal (and \n");
		
		boolean isGTypeExist = false;
		StringBuffer initSegment = new StringBuffer();
		
		List predicateCheckList = new ArrayList();
		initSegment.append("  (:init \n");
		for (Iterator<String> keySet = childContainerMap.keySet().iterator();keySet.hasNext();)
		{
			String key = keySet.next();
			PlanContainer container = childContainerMap.get(key);
			List<PlanContainer> children = container.getChildren();
			String nameText = "";
			for (Iterator<PlanContainer> iter = children.iterator(); iter.hasNext();) {
				PlanContainer childContainer = iter.next();
				nameText += childContainer.getName() + " ";
				Map<String,List> childcontainerData = childContainer.getData();
				for (Iterator<String> predicateKeySet = childcontainerData.keySet().iterator();predicateKeySet.hasNext();) {
					String predicateName = (String) predicateKeySet.next();
					List predicateList = childcontainerData.get(predicateName);
					for (int i = 0; i < predicateList.size(); i++) {
						PlanPredicate predicate = (PlanPredicate) predicateList.get(i);
						List params = predicate.getParams();
						boolean negation = predicate.getNegation();
						if(key.equals("t_actor") && predicateName.equals("requests") && params != null && params.size() ==2){
							satisfiedSegment.append("        (satisfied " + params.get(1) + ")\n");
						}
							
						if(key.equals("t_goal") && predicateName.equals("pr_passes") && params != null && params.size() ==3 && negation==false){
							satisfiedSegment.append("        (pr_passes " + params.get(0) + " "+ params.get(1) + " "+ params.get(2) + ")\n");
							continue;
						}
						
						if(key.equals("t_goal") && predicateName.equals("pr_passes") && params != null && params.size() ==3 && negation==true){
							satisfiedSegment.append("        (not(pr_passes " + params.get(0) + " "+ params.get(1) + " "+ params.get(2) + "))\n");
							continue;
						}
						
						if(key.equals("t_goal") && predicateName.equals("pr_satisfies") && params != null && params.size() ==2 && negation==false ){
							satisfiedSegment.append("        (pr_satisfies " + params.get(0)+ " " + params.get(1) + ")\n");
							continue;
						}
						
						if(key.equals("t_goal") && predicateName.equals("pr_satisfies") && params != null && params.size() ==2 && negation==true ){
							satisfiedSegment.append("        (not(pr_satisfies " + params.get(0)+ " " + params.get(1) + "))\n");
							continue;
						}
							
						
						//System.out.println("predicate name:" + predicateName);
						//System.out.println("predicate map:" + predicateMap);
						List planConfigItemList = (List)predicateMap.get(key);
						PlanConfigItem planConfigItem = null;
						for (Iterator iterator = planConfigItemList.iterator(); iterator
								.hasNext();) {
							PlanConfigItem element = (PlanConfigItem) iterator.next();
							if(element.getName().equals(predicateName))
								planConfigItem = element;
						}
						
						int offset = planConfigItem.getParameters().size();
						List parameterConfigList = planConfigItem.getParametersList();
						boolean isWithList = parameterConfigList != null && parameterConfigList.size() > 0;
						
						int count = 0;
						String paramSequence = "";
						if (params != null) {
						for (int j = 0; j < params.size(); j++) {
							String element = (String) params.get(j);
							if(isWithList && j==offset)
							{
								StringTokenizer tokenizer = new StringTokenizer(element,",");
								while(tokenizer.hasMoreElements())
								{
									paramSequence += tokenizer.nextElement();
									if(tokenizer.hasMoreElements())
										paramSequence += " ";
									count++;
								}
							}
							else
								paramSequence += element;
							if(j< params.size() - 1)
								paramSequence += " ";
						}
						}
						
						
						if(!isWithList)
						{
							if(!predicateCheckList.contains(predicateName + "|" + paramSequence))
							{	
								initSegment.append("     (" + predicateName + " " + paramSequence + ")\n");
								predicateCheckList.add(predicateName + "|" + paramSequence);
							}
						}else
						{
							if(!predicateCheckList.contains(predicateName + "|" + paramSequence))
							{	
								initSegment.append("     (" + predicateName + count + " " + paramSequence + ")\n");
								predicateCheckList.add(predicateName + "|" + paramSequence);
							}
						}
					}
				}		
			}
			if(nameText.trim().length() != 0)
			{
				if(key.trim().equals("t_gtype"))
					isGTypeExist = true;
				nameText += " - " + key;
				writer.write("    " + nameText + "\n");
			}
		}
		if(!isGTypeExist)
			writer.write("    gtype_empty  - t_gtype \n");
		
		writer.write("  ) \n");
		
		satisfiedSegment.append("  )) \n");
		initSegment.append("  )\n");
		
		writer.write(satisfiedSegment.toString());
		writer.write(initSegment.toString());
		
		writer.write(")\n");
		if(writer!= null)
			writer.close();
	}

	public Map<String, PlanContainer> getChildContainerMap() {
		return childContainerMap;
	}

	public void setChildContainerMap(Map<String, PlanContainer> childContainerMap) {
		this.childContainerMap = childContainerMap;
	}

	public Map getGoalTypeMap() {
		return goalTypeMap;
	}

	public void setGoalTypeMap(Map goalTypeMap) {
		this.goalTypeMap = goalTypeMap;
	}

	
}
