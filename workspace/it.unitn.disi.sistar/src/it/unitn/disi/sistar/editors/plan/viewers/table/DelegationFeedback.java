package it.unitn.disi.sistar.editors.plan.viewers.table;

import it.unitn.disi.sistar.exceptions.ActorNotFoundException;
import it.unitn.disi.sistar.exceptions.GoalNotFoundException;
import it.unitn.disi.sistar.files.plan.PlanContainerMapUtility;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DelegationFeedback extends FeedbackPredicate  {

	private String actorDelegator;
	private String actorDelegate;
	private String goal;
	private boolean canDepend;
	
	public DelegationFeedback(String actorDelegator, String goal, String actorDelegate, String status, boolean canDepend){
		super(status);
		this.actorDelegator = actorDelegator;
		this.goal = goal;
		this.actorDelegate = actorDelegate;
		this.canDepend = canDepend;
	}
	
	public DelegationFeedback(){
		super();
	}
	
	public String getDelegate(){
		return actorDelegate;
	}

	public void setDelegate(String actorDelegate){
		this.actorDelegate = actorDelegate;
	}
	
	public String getDelegator(){
		return actorDelegator;
	}

	public void setDelegator(String actorDelegator){
		this.actorDelegator = actorDelegator;
	}
	
	public String getGoal(){
		return goal;
	}

	public void setGoal(String goal){
		this.goal = goal;
	}	
	
	public boolean getCanDepend(){
		return canDepend;
	}

	public void setCanDepend(boolean canDepend){
		this.canDepend = canDepend;
	}
	
	public static List getDelegatePredicate(List solutionPlanner, String[] actors, String[] goals, PlanContainerMapUtility containerMap) throws ActorNotFoundException, GoalNotFoundException{
		List result = new ArrayList();
		Iterator iterSol = solutionPlanner.iterator();
		while(iterSol.hasNext()){
			List element = (List)iterSol.next();
			if(((String) element.get(0)).compareTo("PASSES")==0){
				String actorD1=null;
				String goal=null;
				int i=0;
				while(i< actors.length){
					if ((actors[i]).toUpperCase().compareTo((String)element.get(1))==0){
						actorD1 = actors[i];
						break;
					}
					i++;
				}				
				if (actorD1==null) {
					throw new ActorNotFoundException("Actor not found!");
				}
				i=0;
				while(i< goals.length){
					if ((goals[i]).toUpperCase().compareTo((String)element.get(3))==0){
						goal = goals[i];
						break;
					}
					i++;
				}
				if (goal==null) {
					throw new GoalNotFoundException("Goal not found!");
				}
				String actorD2=null;
				i=0;
				while(i< actors.length){
					if ((actors[i]).toUpperCase().compareTo((String)element.get(2))==0){
						actorD2 = actors[i];
						break;
					}
					i++;
				}
				if (actorD2==null) {
					throw new ActorNotFoundException("Actor not found!");
				}
				result.add(new DelegationFeedback(actorD1, goal,actorD2,NO_STATUS, containerMap.canDepend(actorD1, actorD2,goal)));
			}
		}
		return result;
	}
	
}

