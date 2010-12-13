package it.unitn.disi.sistar.editors.plan.viewers.table;

import it.unitn.disi.sistar.editors.plan.viewers.PlanContainer;
import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SatisfactionFeedback extends FeedbackPredicate {

	private String actor;
	private String goal;
	private boolean canProvide;
	

	public SatisfactionFeedback(String actor, String goal, String status, boolean canProvide){
		super(status);
		this.actor = actor;
		this.goal = goal;
		this.canProvide = canProvide;
	}
	
	public SatisfactionFeedback(){
		super();
	}
	public String getActor(){
		return actor;
	}

	public void setActor(String actor){
		this.actor = actor;
	}
	
	public String getGoal(){
		return goal;
	}

	public void setGoal(String goal){
		this.goal = goal;
	}
	
	public boolean getCanProvide(){
		return canProvide;
	}

	public void setCanProvide(boolean canProvide){
		this.canProvide = canProvide;
	}

	
	public static List getSatisfyPredicate(List solutionPlanner, String[] actors, String[] goals, PlanContainerMapUtility containerMap ) throws ActorNotFoundException, GoalNotFoundException{
		List result = new ArrayList();
		Iterator iterSol = solutionPlanner.iterator();
		while(iterSol.hasNext()){
			List element = (List)iterSol.next();
			if(((String) element.get(0)).compareTo("SATISFIES")==0){
				String actor=null;
				String goal=null;
				int i=0;
				while(i< actors.length){
					if ((actors[i]).toUpperCase().compareTo((String)element.get(1))==0){
						actor = actors[i];
						break;
					}
					i++;
				}
				if (actor==null) {
					throw new ActorNotFoundException("Actor not found!");
				}
				i=0;
				while(i< goals.length){
					if ((goals[i]).toUpperCase().compareTo((String)element.get(2))==0){
						goal = goals[i];
						break;
					}
					i++;
				}		
				if (goal==null) {
					throw new GoalNotFoundException("Goal not found!");
				}
				result.add(new SatisfactionFeedback(actor, goal, NO_STATUS, containerMap.canProvide(actor,goal)));
			}
		}
		return result;
	}
}

