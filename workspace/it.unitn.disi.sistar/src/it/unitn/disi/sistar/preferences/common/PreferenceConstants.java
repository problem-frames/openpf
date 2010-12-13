package it.unitn.disi.sistar.preferences.common;

/**
 * Constant definitions for plug-in preferences
 */
public class PreferenceConstants {
	public static final String P_FILENAME = "configuration/it.unitn.disi.sistar.prefs";
	public static final String DATALOG_EXE = "datalog.exe.path";
	public static final String SOLVER_JAR = "solver.jar.path";
	public static final String DATALOG_AXIOMS = "datalog.axioms.path";
	public static final String DATALOG_FILTERS = "datalog.filters.path";

	public static final String PLANNER_EXE = "planner.exe.path";
	public static final String PLANNER_DOMAIN_PDDL = "domain.pddl.path";
	public static final String FREE_GOAL = "free.goal";
	
	public static final String EXTERNAL_CONNECTION_RULES = "external.connection.rules";
	public static final String EXTERNAL_CONNECTION_RULES_PATH = "external.connection.rules.path";
	
	public static final String EXTERNAL_DOMAIN = "external.domain";
	public static final String EXTERNAL_DOMAIN_PATH = "external.domain.path";
	
	public static final String SIZE_ACTOR = "diagrams.size.actor";
	public static final String WIDTH_SERVICE = "diagrams.width.service";
	public static final String HEIGHT_SERVICE = "diagrams.height.service";
	
	public static final String COLOR_SCHEMA = "diagrams.color.schema";
	
	public static final String COLOR_SCHEMA_BW = "Black and White";
	public static final String COLOR_SCHEMA_CUSTOM = "Custom";
	
	public static final String COLOR_ACTOR = "diagrams.color.actor";
	public static final String COLOR_ACTOR_FONT = "diagrams.color.actor.font";
	
	public static final String COLOR_AGENT = "diagrams.color.agent";
	public static final String COLOR_ROLE = "diagrams.color.role";
	public static final String COLOR_POSITION = "diagrams.color.position";
	
	public static final String COLOR_SERVICE = "diagrams.color.service";
	public static final String COLOR_SERVICE_FONT = "diagrams.color.service.font";
	
	public static final String COLOR_GOAL = "diagrams.color.goal";
	public static final String COLOR_SOFTGOAL = "diagrams.color.softgoal";
	public static final String COLOR_TASK = "diagrams.color.task";
	public static final String COLOR_RESOURCE = "diagrams.color.resource";
	public static final String COLOR_EVENT = "diagrams.color.event";
	
	public static final String COLOR_DEPENDENCY = "diagrams.color.dependency";
	
	//the following is added by minh sang
	public static final String COLOR_DP_DEPENDENCY = "diagrams.color.dp_dependency";
	public static final String COLOR_TE_DEPENDENCY = "diagrams.color.te_dependency";
	public static final String COLOR_TP_DEPENDENCY = "diagrams.color.tp_dependency";
	public static final String COLOR_SE_DEPENDENCY = "diagrams.color.se_dependency";
	public static final String COLOR_SP_DEPENDENCY = "diagrams.color.sp_dependency";
	public static final String COLOR_ME_DEPENDENCY = "diagrams.color.me_dependency";
	public static final String COLOR_MP_DEPENDENCY = "diagrams.color.mp_dependency";
	public static final String COLOR_TM_DEPENDENCY = "diagrams.color.tm_dependency";
	//
	public static final String COLOR_OWNERSHIP = "diagrams.color.ownership";
	
	public static final String P_BOOLEAN = "booleanPreference";

	public static final String P_CHOICE = "choicePreference";

	public static final String P_STRING = "stringPreference";
	
	public static final String QUANTITATIVE_SAT_VALUE = "quantitative.sat.value";
	public static final String QUANTITATIVE_SAT_COLOR = "quantitative.sat.color";
	
	public static final String QUANTITATIVE_DEN_VALUE = "quantitative.den.value";
	public static final String QUANTITATIVE_DEN_COLOR = "quantitative.den.color";
	
	public static final String ASP_ANALYSIS_DEPTH = "asp.analysis.depth";
	public static final String ASP_ANALYSIS_INSTANTIATION = "asp.analysis.instantiation";
	public static final String ASP_ANALYSIS_CONDITION = "asp.analysis.condition";
	
	public static final String GOAL_QUANTITATIVE_ANALYSIS = "goal.quantitative.analysis";
}
