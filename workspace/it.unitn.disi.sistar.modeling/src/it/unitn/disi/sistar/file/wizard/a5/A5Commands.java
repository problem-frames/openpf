package it.unitn.disi.sistar.file.wizard.a5;

public class A5Commands {
	
	public static String ADD_ACTOR = "add_actor(label:in String, listCapabilities:in List_goals)";
	public static String ADD_GOAL = "add_goal(label: in String, owner:in actor, providers:in list_actors, requesters:in list_actors)";
	public static String ADD_SOFTGOAL = "add_softgoal(label: in String, owner:in actor, providers:in list_actors, requesters:in list_actors)";
	public static String ADD_TASK = "add_task(label: in String, owner:in actor, providers:in list_actors, requesters:in list_actors)";
	public static String ADD_RESOURCE = "add_resource(label: in String, owner:in actor, providers:in list_actors, requesters:in list_actors)";
	
	public static String DELETE_ACTOR = "delete_actor(label:in String)";
	public static String DELETE_GOAL = "delete_goal(label:in String)";
	public static String DELETE_TASK = "delete_task(label:in String)";
	public static String DELETE_SOFTGOAL = "delete_softgoal(label:in String)";
	public static String DELETE_RESOURCE = "delete_resource(label:in String)";
	
	public static String DELETE_DEL_EXE = "delete_del_exec(delegatee:in actor, delegator: in actor, delegated:goal/resource/task)";
	public static String DELETE_DEL_PER = "deleted_del_perm(delegatee:in actor, delegator: in actor, delegated:goal/resource/task)";
	
	public static String DELETE_TRUST_EXEC = "delete_trust_exec(A: actor, B: actor, X: goal/resource/task)";
	public static String DELETE_TRUST_PERM = "delete_trust_perm(A: actor, B: actor, X: goal/resource/task)";
	
	public static String DECOMPOSE = "decompose(X:goal/resource/task, X1: goal/resource/task)";
	public static String DEL_EXE = "del_exec(A:actor,B:actor,X:goal/resource/task)";
	public static String DEL_PERM = "del_perm(A:actor,B:actor,X:goal/resource/task)";
	public static String ESTABLISH_TRUST_EXEC = "establish_trust_exec(A:actor,B:actor,X:goal/resource/task)";
	public static String ESTABLISH_TRUST_PERM = "establish_trust_perm(A:actor,B:actor,X:goal/resource/task)";
	public static String REQUEST = "request(A:actor,X:goal/resource/task)";
	public static String PROVIDE = "provide(A:actor,X:goal/resource/task)";
	public static String OWNERSHIP = "ownership(A:actor,X:goal/resource/task)";
	

}
