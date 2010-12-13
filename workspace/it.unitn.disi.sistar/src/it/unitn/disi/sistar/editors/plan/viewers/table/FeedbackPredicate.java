package it.unitn.disi.sistar.editors.plan.viewers.table;

import java.util.List;

public abstract class FeedbackPredicate {
	
	private String status;
	
	public static final String KEEP = "keep";
	public static final String DELETE = "delete";
	public static final String NO_STATUS ="no_status";
	public static final String[] STATUS_VAL = { NO_STATUS, DELETE, KEEP};
	
	
	public static final String ACTOR = "Actor";
	public static final String SATISFIES = "Satisfies";
	public static final String CANPERFORM = "CP";
	public static final String CANDEPEND = "CD";
	public static final String DELEGATES = "Delegates";
	public static final String STATUS ="Status";
	public static final String ACTOR1 = "Actor1";
	public static final String ACTOR2 = "Actor2";
	public static final String[] COLUMNSAT = { ACTOR, SATISFIES, CANPERFORM, STATUS};
	public static final String[] COLUMNDEL = { ACTOR1, DELEGATES,ACTOR2 , CANDEPEND, STATUS};
	
	public FeedbackPredicate(){
	}
	
	public FeedbackPredicate(String status){
		this.status = status;
	}
	
	public String getStatus(){
		return status;
	}
	public void setStatus(String status){
		this.status = status;
	}

}
