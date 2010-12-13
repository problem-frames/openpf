package it.unitn.disi.sistar.element.configuration.util;

import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Association;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.CustomRelation;
import it.unitn.disi.sistar.modeling.tropos.Dependency;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EActorType;
import it.unitn.disi.sistar.modeling.tropos.EAssociationType;
import it.unitn.disi.sistar.modeling.tropos.ECompositionType;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.EDependencyType;
import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.EServiceType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Ownership;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.tools.CreateActorTool;
import it.unitn.disi.sistar.tools.CreateAssociationTool;
import it.unitn.disi.sistar.tools.CreateCompositionTool;
import it.unitn.disi.sistar.tools.CreateContributionTool;
import it.unitn.disi.sistar.tools.CreateDependencyTool;
import it.unitn.disi.sistar.tools.CreateOwnershipTool;
import it.unitn.disi.sistar.tools.CreateServiceTool;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

public class TroposElementConfiguration {
	
	private static int SEQ_NO = 1;
	
	public static String NAME_PARAM = "NAME";
	public static String EXACT_NAME = "EXACT_NAME";
	
	public static Actor configureActor(Actor element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		EActorType actorType = (EActorType) request.getParameter(
				CreateActorTool.ACTOR_TYPE);
		String name = (String)request.getParameter(NAME_PARAM);
		Object object = request.getParameter("SAME_OBJECT");
		boolean isSameObject = object instanceof Boolean && (Boolean)object == true;
		
		if(actorType == null)
			actorType = EActorType.AGENT_LITERAL;
		
		if(request.getParameter(EXACT_NAME)!= null)
			name = (String)request.getParameter(EXACT_NAME);
		else if(name==null)
			name = getSequenceName(((Diagram) element.eContainer())
				.getObject(), actorType.getLiteral().toLowerCase(), isSameObject);
		else
			name = getSequenceName(((Diagram) element.eContainer())
					.getObject(), name, isSameObject);
		element.setActorType(actorType);
		element.setName(name);
		
		return element;
	}
	
	public static Service configureService(Service element, IEditCommandRequest request, boolean isNested)
	{
		if(element == null)
			return null;
		
		EServiceType serviceType = (EServiceType) request.getParameter(
				CreateServiceTool.SERVICE_TYPE);
		String name = (String)request.getParameter(NAME_PARAM);
		Object object = request.getParameter("SAME_OBJECT");
		boolean isSameObject = object instanceof Boolean && (Boolean)object == true;
		
		if(serviceType == null)
			serviceType = EServiceType.GOAL_LITERAL;
		
		if(request.getParameter(EXACT_NAME)!= null)
			name = (String)request.getParameter(EXACT_NAME);
		else if(name==null)
			name = isNested?getSequenceName(((Actor) element.eContainer()).getServices(), 
					((Actor) element.eContainer()).getName()
					+ "_" + serviceType.getLiteral().toLowerCase(), isSameObject):
						getSequenceName(((Diagram) element.eContainer())
				.getObject(), serviceType.getLiteral().toLowerCase(), isSameObject);
		else
			name = isNested?getSequenceName(((Actor) element.eContainer()).getServices(), 
					name, isSameObject):
						getSequenceName(((Diagram) element.eContainer())
				.getObject(), name, isSameObject);
				
		element.setServiceType(serviceType);
		element.setName(name);
		                          
		return element;
	}
	
	public static Association configureAssociation(Association element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		EAssociationType type = (EAssociationType) request
		.getParameter(CreateAssociationTool.ASSOCIATION_TYPE);
		if(type == null)
			type = EAssociationType.IS_A_LITERAL;
		
		element.setAssociationType(type);
		return element;
	}
	
	public static Contribution configureContribution(Contribution element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		EContributionType type = (EContributionType) request
		.getParameter(CreateContributionTool.CONTRIBUTION_TYPE);
		if(type == null)
			type = EContributionType.PP_LITERAL;
		
		ERelationshipType relationshipType = (ERelationshipType) request
		.getParameter(CreateContributionTool.RELATIONSHIP_TYPE);
		if(relationshipType == null)
			relationshipType = ERelationshipType.CONTRIBUTION_LITERAL;
		
		element.setContributionType(type);
		element.setRelationshipType(relationshipType);
		return element;
	}
	
	public static Composition configureComposition(Composition element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		ECompositionType type = (ECompositionType) request
		.getParameter(CreateCompositionTool.COMPOSITION_TYPE);
		if(type == null)
			type = ECompositionType.AND_LITERAL;
		
		element.setCompositionType(type);
		element.setName(Composition.class.getSimpleName());
		return element;
	}
	
	public static Dependency configureDependency(Dependency element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		EDependencyType type = (EDependencyType) request
		.getParameter(CreateDependencyTool.DEPENDENCY_TYPE);
		if(type == null)
			type = EDependencyType.DELEGATION_EXECUTION_LITERAL;
		
		element.setDependencyType(type);
		return element;
	}
	
	public static Ownership configureOwership(Ownership element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		EOwnershipType type = (EOwnershipType) request
		.getParameter(CreateOwnershipTool.OWNERSHIP_TYPE);
		if(type == null)
			type = EOwnershipType.OWN_LITERAL;
		
		element.setOwnershipType(type);
		return element;
	}
	
	public static MeansEnd configureMeansEnd(MeansEnd element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		element.setName(MeansEnd.class.getSimpleName());
		return element;
	}
	
	public static CustomRelation configureCustomRelation(CustomRelation element, IEditCommandRequest request)
	{
		if(element == null)
			return null;
		
		element.setParameterMap(request.getParameters());
		element.setPredicate((String)request.getParameter(PropertyConfig.CUSTREL_PREDICATE));
		return element;
	}
	
	private static String getSequenceName(EList list, String nameLiteral, boolean isSameObject) {

		Map nameMap = new HashMap();
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			GraphicalObject element = (GraphicalObject) iter.next();
			nameMap.put(element.getName(), true);
		}
		while (nameMap.containsKey(nameLiteral + SEQ_NO))
			SEQ_NO++;

		String result = nameLiteral + SEQ_NO;
		
		if(!isSameObject)
			SEQ_NO++;
		return result;
	}
}
