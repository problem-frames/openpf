package it.unitn.disi.sistar.files.plan;

import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.editors.plan.viewers.table.DelegationFeedback;
import it.unitn.disi.sistar.editors.plan.viewers.table.FeedbackPredicate;
import it.unitn.disi.sistar.editors.plan.viewers.table.SatisfactionFeedback;
import it.unitn.disi.sistar.editors.plan.viewers.table.PlanPredicate;
import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PlanContainerMapUtility {
	
	private Map<String, PlanContainer> childContainerMap;
	
	public PlanContainerMapUtility(){
	}
	
	public PlanContainerMapUtility(Map<String, PlanContainer> childContMap){
		childContainerMap = childContMap;
	}
	
	public void setPlanContainerMap(Map<String, PlanContainer> childContMap){
		childContainerMap = childContMap;
	}
	public Map<String, PlanContainer> getPlanContainerMap(){
		return childContainerMap;
	}
	
	public boolean canProvide(String satisfier, String satisfierGoal) throws ActorNotFoundException, GoalNotFoundException{
		
		PlanContainer containerActor = childContainerMap.get("t_actor"); 
		List actorsChildren = containerActor.getChildren();

		PlanContainer containerGoal = childContainerMap.get("t_goal");
		List goalsChildren = containerGoal.getChildren();		
			
		PlanContainer actorToModify = findActor(actorsChildren, satisfier);
		if (actorToModify==null) {
			throw new ActorNotFoundException("Actor " + satisfier + " not found!");
		}
		PlanContainer goalToModify = findGoal(goalsChildren, satisfierGoal);
		if (goalToModify==null) {
			throw new GoalNotFoundException("Goal " + satisfierGoal + " not found!");
		}
		return canProvideGoal(actorToModify, goalToModify);
	}
	
	public boolean canDepend(String delegator, String delegate, String delegatedGoal) throws ActorNotFoundException, GoalNotFoundException{
		
		PlanContainer containerActor = childContainerMap.get("t_actor"); 
		List actorsChildren = containerActor.getChildren();
		PlanContainer containerGoal = childContainerMap.get("t_goal");
		List goalsChildren = containerGoal.getChildren();	
			
		PlanContainer actorD1 = findActor(actorsChildren, delegator);
		if (actorD1==null) {
			throw new ActorNotFoundException("Actor " + delegator + " not found!");
		}
		if (findActor(actorsChildren, delegate)==null) {
			throw new ActorNotFoundException("Actor " + delegate + " not found!");
		}
		PlanContainer goal = findGoal(goalsChildren, delegatedGoal);
		if (goal==null) {
			throw new GoalNotFoundException("Goal " + delegatedGoal + " not found!");
		}
		return canDependOnActor(actorD1, delegate) || canDependOn(actorD1, delegate, goal);
	}
	
	public String[] getAllActors(){
		PlanContainer containerActor = childContainerMap.get("t_actor"); 
		Iterator iterActor = containerActor.getChildren().iterator();
		String[] actors = new String[containerActor.getChildren().size()+1];	
		actors[0]="[None selected]";
		int i =1;
		while(iterActor.hasNext()){
			actors[i++]= ((PlanContainer) iterActor.next()).getName().intern();
		}
		return actors;

	}

	public String[] getAllGoals(){
		PlanContainer containerGoal = childContainerMap.get("t_goal"); 
		Iterator iterGoal = containerGoal.getChildren().iterator();
		String[] goals = new String[containerGoal.getChildren().size()+1];
		goals[0]="[None selected]";
		int i =1;
		while(iterGoal.hasNext()){
			goals[i++]=((PlanContainer) iterGoal.next()).getName().intern();
		}
		return goals;
	}

	private static PlanContainer findActor(List actorsList, String actorName) {
		PlanContainer actorToFind = null;
		Iterator iterActor = actorsList.iterator();
		while(iterActor.hasNext()){
			actorToFind = (PlanContainer) iterActor.next();
			String actor = actorToFind.getName();
			if (actor.compareTo(actorName)==0){
				break;
			}
		}
		return actorToFind;
	}

	private static PlanContainer findGoal(List goalsList, String goalName){
		PlanContainer goalToFind = null;
		Iterator iterActor = goalsList.iterator();
		while(iterActor.hasNext()){
			goalToFind = (PlanContainer) iterActor.next();
			String goal = goalToFind.getName();
			if (goal.compareTo(goalName)==0){
				break;
			}
		}
		return goalToFind;
	}


	private static boolean canProvideGoal(PlanContainer actor, PlanContainer goalP){
		List canProvide = actor.getAttribute("can_provide");
		// controllo se ho già un predicato "can_provide A G" 
		Iterator iterCanProv = canProvide.iterator();
		while(iterCanProv.hasNext()){
			List canProvideParam = ((PlanPredicate) iterCanProv.next()).getParams();
			String goal = (String)canProvideParam.get(1);
			if (goal.compareTo(goalP.getName())==0){
				return true;
			}
		}	
		
		// controllo se ho già un predicato "can_provide_gt A T" dove T è il tipo del goal che A deve soddisfare
			List satisfierGoalType = new ArrayList();
			List type = goalP.getAttribute("type");
			Iterator iterType = type.iterator();
			while(iterType.hasNext()){
				List typeParam = ((PlanPredicate) iterType.next()).getParams();
				satisfierGoalType.add(typeParam.get(1));
			}

			canProvide = actor.getAttribute("can_provide_gt");
			iterCanProv = canProvide.iterator();
			while(iterCanProv.hasNext()){
				List canProvideParam = ((PlanPredicate) iterCanProv.next()).getParams();
				String goalType = (String)canProvideParam.get(1);
				Iterator iterSatGoalType = satisfierGoalType.iterator();
				while(iterSatGoalType.hasNext()){
					if (goalType.compareTo((String)iterSatGoalType.next())==0){
						return true;
					}
				}
		}
		return false;
	}

	private static boolean canDependOnActor(PlanContainer delegator, String delegate){
		List delegateOn = delegator.getAttribute("can_depend_on");
		// controllo se ho già un predicato "can_depend_on A B" 
		Iterator iterDelegateOn = delegateOn.iterator();
		while(iterDelegateOn.hasNext()){
			List canProvideParam = ((PlanPredicate) iterDelegateOn.next()).getParams();
			String actor = (String)canProvideParam.get(1);
			if (actor.compareTo(delegate)==0){
				return true;
			}
		}		
		return false;
	}
	
	private static boolean canDependOn(PlanContainer delegator, String  delegate, PlanContainer goalP){
		List delegateOn = delegator.getAttribute("can_depend_on_g");
		// controllo se ho già un predicato "can_depend_on_g A B G" 
		Iterator iterDelegateOn = delegateOn.iterator();
		while(iterDelegateOn.hasNext()){
			List canProvideParam = ((PlanPredicate) iterDelegateOn.next()).getParams();
			String actor = (String)canProvideParam.get(1);
			String goal = (String)canProvideParam.get(2);
			if (actor.compareTo(delegate)==0 && goal.compareTo(goalP.getName())==0){
				return true;
			}
		}		
		
		List goalType = new ArrayList();
		List type = goalP.getAttribute("type");
		Iterator iterType = type.iterator();
		while(iterType.hasNext()){
			List typeParam = ((PlanPredicate) iterType.next()).getParams();
			goalType.add(typeParam.get(1));
		}

		delegateOn = delegator.getAttribute("can_provide_on_gt");
		iterDelegateOn = delegateOn.iterator();
		while(iterDelegateOn.hasNext()){
			List canProvideParam = ((PlanPredicate) iterDelegateOn.next()).getParams();
			String actor = (String)canProvideParam.get(1);
			String goalT = (String)canProvideParam.get(2);
			if (actor.compareTo(delegate)==0){
			Iterator iterSatGoalType = goalType.iterator();
			while(iterSatGoalType.hasNext()){
				if (goalT.compareTo((String)iterSatGoalType.next())==0){
					return true;
				}
			}
			}
	}
		
		return false;
	}
	

	public PlanContainerMapUtility performDelUserFeedback(List userFeedback) throws GoalNotFoundException, ActorNotFoundException{

		PlanContainer containerActor = childContainerMap.remove("t_actor"); 
		List actorsChildren = containerActor.getChildren();

		PlanContainer containerGoal = childContainerMap.remove("t_goal");
		List goalsChildren = containerGoal.getChildren();		

		// itero la lista delle modifiche da effettuare
		Iterator iterator = userFeedback.iterator();
		while(iterator.hasNext()){
			DelegationFeedback predicate = (DelegationFeedback)iterator.next();
			String status = predicate.getStatus();
			boolean canDepend = predicate.getCanDepend();
			if(status.compareTo(SatisfactionFeedback.NO_STATUS)!=0){
				String delegator = (String)predicate.getDelegator();
				String delegate = (String)predicate.getDelegate();
				String delegatedGoal = (String)predicate.getGoal();
				PlanContainer actorToModify = findActor(actorsChildren, delegator);
				if (actorToModify==null) {
					throw new ActorNotFoundException("Actor " + delegator + " not found!");
				}
				if (findActor(actorsChildren, delegate)==null) {
					throw new ActorNotFoundException("Actor " + delegate + " not found!");
				}
				PlanContainer goalToModify = findGoal(goalsChildren, delegatedGoal);
				if (goalToModify==null) {
					throw new GoalNotFoundException("Goal " + delegatedGoal + " not found!");
				}

				List param = new ArrayList();
				param.add(delegator);
				param.add(delegate);
				param.add(delegatedGoal);
				PlanPredicate pred = new PlanPredicate();
				pred.setParams(param);
				if (status.compareTo(SatisfactionFeedback.DELETE)==0){
					pred.setNegation(true);			
				}
				goalsChildren.remove(goalToModify);
				Map data = goalToModify.getData();	
				List dataList = new ArrayList();
				Set  entryData = data.entrySet();
				Iterator iterEntryData = entryData.iterator(); 
				while(iterEntryData.hasNext()){
					Map.Entry entry = (Map.Entry)iterEntryData.next();
					String key = (String)entry.getKey();
					if (key.compareTo("pr_passes")==0){
						dataList = (List)entry.getValue();
						break;
					}
				}
//				aggiungo "pr_passes A G"
				dataList.add(pred);
				data.put("pr_passes", dataList); 
				goalToModify.setData(data);
				goalsChildren.add(goalToModify);

				if (canDependOnActor(actorToModify, delegate)== false && canDependOn(actorToModify, delegate, goalToModify)==false &&canDepend==true  && status.compareTo(SatisfactionFeedback.KEEP)==0){ 
					dataList = new ArrayList();
					pred = new PlanPredicate();
					param = new ArrayList();
					param.add(delegator);
					param.add(delegate);
					param.add(delegatedGoal);
					pred.setParams(param);
					dataList.add(pred);				
					actorsChildren.remove(actorToModify);
					data = actorToModify.getData();
					entryData = data.entrySet();
					iterEntryData = entryData.iterator(); 
					while(iterEntryData.hasNext()){
						Map.Entry entry = (Map.Entry)iterEntryData.next();
						String key = (String)entry.getKey();
						if (key.compareTo("can_depend_on_g")==0){
							dataList = (List)entry.getValue();
							break;
						}
					}				
//					aggiungo "can_depend_on_g A B G"	
					data.put("can_depend_on_g", dataList);
					actorToModify.setData(data);
					actorsChildren.add(actorToModify);
				}
			}
		}

		containerGoal.setChildren(goalsChildren);
		childContainerMap.put("t_goal", containerGoal);
		containerActor.setChildren(actorsChildren);
		childContainerMap.put("t_actor", containerActor);
		return new PlanContainerMapUtility(childContainerMap);

	}


	public PlanContainerMapUtility performSatUserFeedback(List userFeedback) throws ActorNotFoundException, GoalNotFoundException{

		PlanContainer containerActor = childContainerMap.remove("t_actor"); 
		List actorsChildren = containerActor.getChildren();

		PlanContainer containerGoal = childContainerMap.remove("t_goal");
		List goalsChildren = containerGoal.getChildren();		

		// itero la lista delle modifiche da effettuare
		Iterator iterator = userFeedback.iterator();
		while(iterator.hasNext()){
			SatisfactionFeedback predicate = (SatisfactionFeedback)iterator.next();
			if(predicate.getStatus().compareTo(FeedbackPredicate.NO_STATUS)!=0){
				String satisfier =  (String)predicate.getActor();
				String satisfierGoal = (String)predicate.getGoal();
				PlanContainer actorToModify = findActor(actorsChildren, satisfier);
				if (actorToModify==null) {
					throw new ActorNotFoundException("Actor " + satisfier + " not found!");
				}
				PlanContainer goalToModify = findGoal(goalsChildren, satisfierGoal);
				if (goalToModify==null) {
					throw new GoalNotFoundException("Goal " + satisfierGoal + " not found!");
				}
				
				List param = new ArrayList();
				param.add(satisfier);
				param.add(satisfierGoal);
				PlanPredicate pred = new PlanPredicate();
				pred.setParams(param);
				if (predicate.getStatus().compareTo(SatisfactionFeedback.DELETE)==0){
					pred.setNegation(true);			
				}
				goalsChildren.remove(goalToModify);
				Map data = goalToModify.getData();	
				List dataList = new ArrayList();
				Set  entryData = data.entrySet();
				Iterator iterEntryData = entryData.iterator(); 
				while(iterEntryData.hasNext()){
					Map.Entry entry = (Map.Entry)iterEntryData.next();
					String key = (String)entry.getKey();
					if (key.compareTo("pr_satisfies")==0){
						dataList = (List)entry.getValue();
						break;
					}
				}
				// aggiungo "pr_satisfies A G"
				dataList.add(pred);
				data.put("pr_satisfies", dataList);
				goalToModify.setData(data);
				goalsChildren.add(goalToModify);

				if (canProvideGoal(actorToModify, goalToModify) == false && predicate.getCanProvide()==true && predicate.getStatus().compareTo(SatisfactionFeedback.KEEP)==0){ 
					dataList = new ArrayList();
					pred = new PlanPredicate();
					param = new ArrayList();
					param.add(satisfier);
					param.add(satisfierGoal);
					pred.setParams(param);
					dataList.add(pred);	
					actorsChildren.remove(actorToModify);
					data = actorToModify.getData();
					entryData = data.entrySet();
					iterEntryData = entryData.iterator(); 
					while(iterEntryData.hasNext()){
						Map.Entry entry = (Map.Entry)iterEntryData.next();
						String key = (String)entry.getKey();
						if (key.compareTo("can_provide")==0){
							dataList = (List)entry.getValue();
							break;
						}
					}					
					// aggiungo "can_provide A G"	
					data.put("can_provide", dataList);
					actorToModify.setData(data);
					actorsChildren.add(actorToModify);
				}			
			}
		}	
		containerGoal.setChildren(goalsChildren);
		childContainerMap.put("t_goal", containerGoal);
		containerActor.setChildren(actorsChildren);
		childContainerMap.put("t_actor", containerActor);
		return new PlanContainerMapUtility(childContainerMap);
	}

}
