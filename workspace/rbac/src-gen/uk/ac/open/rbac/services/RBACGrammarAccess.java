/*
* generated by Xtext
*/

package uk.ac.open.rbac.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class RBACGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cRolesAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cRolesRoleParserRuleCall_0_0 = (RuleCall)cRolesAssignment_0.eContents().get(0);
		private final Assignment cUsersAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cUsersUserParserRuleCall_1_0 = (RuleCall)cUsersAssignment_1.eContents().get(0);
		private final Assignment cSessionsAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final RuleCall cSessionsSessionParserRuleCall_2_0 = (RuleCall)cSessionsAssignment_2.eContents().get(0);
		private final Assignment cObjectsAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final RuleCall cObjectsObjectParserRuleCall_3_0 = (RuleCall)cObjectsAssignment_3.eContents().get(0);
		private final Assignment cPermissionsAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final RuleCall cPermissionsRolePermissionAssignmentParserRuleCall_4_0 = (RuleCall)cPermissionsAssignment_4.eContents().get(0);
		private final Assignment cAssignmentsAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final RuleCall cAssignmentsUserRoleAssignmentParserRuleCall_5_0 = (RuleCall)cAssignmentsAssignment_5.eContents().get(0);
		
		//Model:
		//	(roles+=Role | users+=User | sessions+=Session | objects+=Object | permissions+=RolePermissionAssignment |
		//	assignments+=UserRoleAssignment)*;
		public ParserRule getRule() { return rule; }

		//(roles+=Role | users+=User | sessions+=Session | objects+=Object | permissions+=RolePermissionAssignment |
		//assignments+=UserRoleAssignment)*
		public Alternatives getAlternatives() { return cAlternatives; }

		//roles+=Role
		public Assignment getRolesAssignment_0() { return cRolesAssignment_0; }

		//Role
		public RuleCall getRolesRoleParserRuleCall_0_0() { return cRolesRoleParserRuleCall_0_0; }

		//users+=User
		public Assignment getUsersAssignment_1() { return cUsersAssignment_1; }

		//User
		public RuleCall getUsersUserParserRuleCall_1_0() { return cUsersUserParserRuleCall_1_0; }

		//sessions+=Session
		public Assignment getSessionsAssignment_2() { return cSessionsAssignment_2; }

		//Session
		public RuleCall getSessionsSessionParserRuleCall_2_0() { return cSessionsSessionParserRuleCall_2_0; }

		//objects+=Object
		public Assignment getObjectsAssignment_3() { return cObjectsAssignment_3; }

		//Object
		public RuleCall getObjectsObjectParserRuleCall_3_0() { return cObjectsObjectParserRuleCall_3_0; }

		//permissions+=RolePermissionAssignment
		public Assignment getPermissionsAssignment_4() { return cPermissionsAssignment_4; }

		//RolePermissionAssignment
		public RuleCall getPermissionsRolePermissionAssignmentParserRuleCall_4_0() { return cPermissionsRolePermissionAssignmentParserRuleCall_4_0; }

		//assignments+=UserRoleAssignment
		public Assignment getAssignmentsAssignment_5() { return cAssignmentsAssignment_5; }

		//UserRoleAssignment
		public RuleCall getAssignmentsUserRoleAssignmentParserRuleCall_5_0() { return cAssignmentsUserRoleAssignmentParserRuleCall_5_0; }
	}

	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Role");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRoleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Role:
		//	"role" name=ID;
		public ParserRule getRule() { return rule; }

		//"role" name=ID
		public Group getGroup() { return cGroup; }

		//"role"
		public Keyword getRoleKeyword_0() { return cRoleKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class UserElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "User");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUserKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//User:
		//	"user" name=ID;
		public ParserRule getRule() { return rule; }

		//"user" name=ID
		public Group getGroup() { return cGroup; }

		//"user"
		public Keyword getUserKeyword_0() { return cUserKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}

	public class ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypeSTRINGTerminalRuleCall_3_0 = (RuleCall)cTypeAssignment_3.eContents().get(0);
		
		//Object:
		//	"object" name=ID ":" type=STRING;
		public ParserRule getRule() { return rule; }

		//"object" name=ID ":" type=STRING
		public Group getGroup() { return cGroup; }

		//"object"
		public Keyword getObjectKeyword_0() { return cObjectKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//type=STRING
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }

		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_3_0() { return cTypeSTRINGTerminalRuleCall_3_0; }
	}

	public class SessionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Session");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSessionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAssignmentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAssignmentsUserRoleAssignmentCrossReference_3_0 = (CrossReference)cAssignmentsAssignment_3.eContents().get(0);
		private final RuleCall cAssignmentsUserRoleAssignmentIDTerminalRuleCall_3_0_1 = (RuleCall)cAssignmentsUserRoleAssignmentCrossReference_3_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Session:
		//	"session" name=ID "{" assignments+=[UserRoleAssignment]* "}";
		public ParserRule getRule() { return rule; }

		//"session" name=ID "{" assignments+=[UserRoleAssignment]* "}"
		public Group getGroup() { return cGroup; }

		//"session"
		public Keyword getSessionKeyword_0() { return cSessionKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//assignments+=[UserRoleAssignment]*
		public Assignment getAssignmentsAssignment_3() { return cAssignmentsAssignment_3; }

		//[UserRoleAssignment]
		public CrossReference getAssignmentsUserRoleAssignmentCrossReference_3_0() { return cAssignmentsUserRoleAssignmentCrossReference_3_0; }

		//ID
		public RuleCall getAssignmentsUserRoleAssignmentIDTerminalRuleCall_3_0_1() { return cAssignmentsUserRoleAssignmentIDTerminalRuleCall_3_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class UserRoleAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "UserRoleAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cUserAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cUserUserCrossReference_1_0 = (CrossReference)cUserAssignment_1.eContents().get(0);
		private final RuleCall cUserUserIDTerminalRuleCall_1_0_1 = (RuleCall)cUserUserCrossReference_1_0.eContents().get(1);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRoleAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRoleRoleCrossReference_3_0 = (CrossReference)cRoleAssignment_3.eContents().get(0);
		private final RuleCall cRoleRoleIDTerminalRuleCall_3_0_1 = (RuleCall)cRoleRoleCrossReference_3_0.eContents().get(1);
		
		//UserRoleAssignment:
		//	name=ID user=[User] ":" role=[Role];
		public ParserRule getRule() { return rule; }

		//name=ID user=[User] ":" role=[Role]
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//user=[User]
		public Assignment getUserAssignment_1() { return cUserAssignment_1; }

		//[User]
		public CrossReference getUserUserCrossReference_1_0() { return cUserUserCrossReference_1_0; }

		//ID
		public RuleCall getUserUserIDTerminalRuleCall_1_0_1() { return cUserUserIDTerminalRuleCall_1_0_1; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//role=[Role]
		public Assignment getRoleAssignment_3() { return cRoleAssignment_3; }

		//[Role]
		public CrossReference getRoleRoleCrossReference_3_0() { return cRoleRoleCrossReference_3_0; }

		//ID
		public RuleCall getRoleRoleIDTerminalRuleCall_3_0_1() { return cRoleRoleIDTerminalRuleCall_3_0_1; }
	}

	public class RolePermissionAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RolePermissionAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRoleAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cRoleRoleCrossReference_0_0 = (CrossReference)cRoleAssignment_0.eContents().get(0);
		private final RuleCall cRoleRoleIDTerminalRuleCall_0_0_1 = (RuleCall)cRoleRoleCrossReference_0_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTypeSTRINGTerminalRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		private final Assignment cObjectAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cObjectObjectCrossReference_2_0 = (CrossReference)cObjectAssignment_2.eContents().get(0);
		private final RuleCall cObjectObjectIDTerminalRuleCall_2_0_1 = (RuleCall)cObjectObjectCrossReference_2_0.eContents().get(1);
		
		//RolePermissionAssignment:
		//	role=[Role] type=STRING object=[Object];
		public ParserRule getRule() { return rule; }

		//role=[Role] type=STRING object=[Object]
		public Group getGroup() { return cGroup; }

		//role=[Role]
		public Assignment getRoleAssignment_0() { return cRoleAssignment_0; }

		//[Role]
		public CrossReference getRoleRoleCrossReference_0_0() { return cRoleRoleCrossReference_0_0; }

		//ID
		public RuleCall getRoleRoleIDTerminalRuleCall_0_0_1() { return cRoleRoleIDTerminalRuleCall_0_0_1; }

		//type=STRING
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }

		//STRING
		public RuleCall getTypeSTRINGTerminalRuleCall_1_0() { return cTypeSTRINGTerminalRuleCall_1_0; }

		//object=[Object]
		public Assignment getObjectAssignment_2() { return cObjectAssignment_2; }

		//[Object]
		public CrossReference getObjectObjectCrossReference_2_0() { return cObjectObjectCrossReference_2_0; }

		//ID
		public RuleCall getObjectObjectIDTerminalRuleCall_2_0_1() { return cObjectObjectIDTerminalRuleCall_2_0_1; }
	}
	
	
	private ModelElements pModel;
	private RoleElements pRole;
	private UserElements pUser;
	private ObjectElements pObject;
	private SessionElements pSession;
	private UserRoleAssignmentElements pUserRoleAssignment;
	private RolePermissionAssignmentElements pRolePermissionAssignment;
	
	private final GrammarProvider grammarProvider;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public RBACGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammarProvider = grammarProvider;
		this.gaTerminals = gaTerminals;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	(roles+=Role | users+=User | sessions+=Session | objects+=Object | permissions+=RolePermissionAssignment |
	//	assignments+=UserRoleAssignment)*;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Role:
	//	"role" name=ID;
	public RoleElements getRoleAccess() {
		return (pRole != null) ? pRole : (pRole = new RoleElements());
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}

	//User:
	//	"user" name=ID;
	public UserElements getUserAccess() {
		return (pUser != null) ? pUser : (pUser = new UserElements());
	}
	
	public ParserRule getUserRule() {
		return getUserAccess().getRule();
	}

	//Object:
	//	"object" name=ID ":" type=STRING;
	public ObjectElements getObjectAccess() {
		return (pObject != null) ? pObject : (pObject = new ObjectElements());
	}
	
	public ParserRule getObjectRule() {
		return getObjectAccess().getRule();
	}

	//Session:
	//	"session" name=ID "{" assignments+=[UserRoleAssignment]* "}";
	public SessionElements getSessionAccess() {
		return (pSession != null) ? pSession : (pSession = new SessionElements());
	}
	
	public ParserRule getSessionRule() {
		return getSessionAccess().getRule();
	}

	//UserRoleAssignment:
	//	name=ID user=[User] ":" role=[Role];
	public UserRoleAssignmentElements getUserRoleAssignmentAccess() {
		return (pUserRoleAssignment != null) ? pUserRoleAssignment : (pUserRoleAssignment = new UserRoleAssignmentElements());
	}
	
	public ParserRule getUserRoleAssignmentRule() {
		return getUserRoleAssignmentAccess().getRule();
	}

	//RolePermissionAssignment:
	//	role=[Role] type=STRING object=[Object];
	public RolePermissionAssignmentElements getRolePermissionAssignmentAccess() {
		return (pRolePermissionAssignment != null) ? pRolePermissionAssignment : (pRolePermissionAssignment = new RolePermissionAssignmentElements());
	}
	
	public ParserRule getRolePermissionAssignmentRule() {
		return getRolePermissionAssignmentAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}