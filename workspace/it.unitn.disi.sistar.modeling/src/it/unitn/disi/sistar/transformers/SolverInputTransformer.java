package it.unitn.disi.sistar.transformers;

import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.files.solver.SolverFile;
import it.unitn.disi.sistar.files.solver.SolverMapFile;
import it.unitn.disi.sistar.modeling.tropos.Actor;
import it.unitn.disi.sistar.modeling.tropos.Composition;
import it.unitn.disi.sistar.modeling.tropos.Contribution;
import it.unitn.disi.sistar.modeling.tropos.Diagram;
import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;
import it.unitn.disi.sistar.modeling.tropos.ESATType;
import it.unitn.disi.sistar.modeling.tropos.GraphicalObject;
import it.unitn.disi.sistar.modeling.tropos.MeansEnd;
import it.unitn.disi.sistar.modeling.tropos.Service;
import it.unitn.disi.sistar.objects.GoalRelation;
import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class SolverInputTransformer {
	private ScenarioFile scenarioFile;
	private SolverMapFile solverMapFile;
	
	public SolverInputTransformer(File input) throws Exception
	{
		scenarioFile = new ScenarioFile(input);
		scenarioFile.load();
		Map contentMap = new HashMap();
		Map indexMap = new HashMap();
		
		for (int i = 0; i < scenarioFile.getContentList().size(); i++) {
			GoalSolver element = (GoalSolver) scenarioFile.getContentList().get(i);
			contentMap.put(element.getName(), i);
			indexMap.put(i, element.getName());
		}
		solverMapFile = new SolverMapFile(contentMap, indexMap);
	}
	
	public void transformMap(File output) throws Exception
	{
		solverMapFile.setBaseFile(output);
		solverMapFile.save();
	}
	private String getContributionMapping(EContributionType contributionType, ESATType satType)
	{
		if(contributionType.equals(EContributionType.PP_LITERAL))
			if(satType.equals(ESATType.SAT_LITERAL))
				return "++";
			else
				return "**";
		if(contributionType.equals(EContributionType.P_LITERAL))
			if(satType.equals(ESATType.SAT_LITERAL))
				return "+";
			else
				return "*";
		if(contributionType.equals(EContributionType.MM_LITERAL))
			if(satType.equals(ESATType.SAT_LITERAL))
				return "--";
			else
				return "//";
	
		if(contributionType.equals(EContributionType.M_LITERAL))
			if(satType.equals(ESATType.SAT_LITERAL))
				return "-";
			else
				return "/";
		
		return null;
	}
	
	public void transformFile(File output, Diagram diagram) throws Exception
	{
		SolverFile solverFile = new SolverFile(output);
		solverFile.setContentList(scenarioFile.getContentList());
		solverFile.setType("True".equalsIgnoreCase
				(PreferenceUtil.getPreference(
						PreferenceConstants.GOAL_QUANTITATIVE_ANALYSIS))?"C":"D");
		List relationList = new ArrayList();
		EList contents = diagram.eContents();
		
		List compositionList = new ArrayList();
		List topGoalList = new ArrayList();
		for (Iterator iter = contents.iterator(); iter.hasNext();) {
			EObject element = (EObject) iter.next();
			if(element instanceof Composition)
			{
				compositionList.add(element);
				if(!topGoalList.contains(((Composition)element).getSource()))
					topGoalList.add(((Composition)element).getSource());
			}else if(element instanceof Contribution)
			{
				Contribution contribution = (Contribution)element;
				
				if(contribution.getRelationshipType()!= ERelationshipType.CONTRIBUTION_LITERAL)
					continue;
				GoalRelation relation = new GoalRelation();
				List nodes = new ArrayList();
				nodes.add(solverMapFile.getContentMap().get(getElementName(contribution.getTarget())));
				nodes.add(solverMapFile.getContentMap().get(getElementName(contribution.getSource())));
				relation.setNodes(nodes);
				
				//System.out.println("relation nodes:" + relation.getNodes());
				EContributionType contributionType = contribution.getContributionType();
				ESATType satType = contribution.getSatType();

				if(satType.equals(ESATType.NA_LITERAL))
				{
					relation.setType(getContributionMapping(contributionType, ESATType.SAT_LITERAL));
					relationList.add(relation);
					
					GoalRelation relation2 = new GoalRelation();
					relation2.setNodes(relation.getNodes());
					relation2.setType(getContributionMapping(contributionType, ESATType.DEN_LITERAL));
					relationList.add(relation2);
				}
				else
				{
					relation.setType(getContributionMapping(contributionType, satType));
					relationList.add(relation);
				}
			}else if(element instanceof MeansEnd)
			{
				MeansEnd meansEnd = (MeansEnd)element;
				List nodes = new ArrayList();
				
				nodes.add(solverMapFile.getContentMap().get(getElementName(meansEnd.getSource())));
				nodes.add(solverMapFile.getContentMap().get(getElementName(meansEnd.getTarget())));
				
				GoalRelation ppSATRelation = new GoalRelation();
				ppSATRelation.setNodes(nodes);
				ppSATRelation.setType(getContributionMapping(EContributionType.PP_LITERAL, ESATType.SAT_LITERAL));
				relationList.add(ppSATRelation);
				
				GoalRelation ppDENRelation = new GoalRelation();
				ppDENRelation.setNodes(nodes);
				ppDENRelation.setType(getContributionMapping(EContributionType.PP_LITERAL, ESATType.DEN_LITERAL));
				relationList.add(ppDENRelation);
			}
		}
		for (Iterator iter = topGoalList.iterator(); iter.hasNext();) {
			Service element = (Service) iter.next();
			Integer sourceIndex = (Integer)solverMapFile.getContentMap().get(getElementName(element));
			
			GoalRelation relation = new GoalRelation();
			relation.setNodes(new ArrayList());
			boolean firstRelation = true;
			for (Iterator iterator = compositionList.iterator(); iterator
					.hasNext();) {
				
				Composition composition = (Composition) iterator.next();
				if(composition.getSource()==element)
				{
					if(firstRelation)
					{
						relation.setType(composition.getCompositionType().getLiteral());
						relation.getNodes().add(sourceIndex);
						firstRelation = false;
					}
					GraphicalObject target = composition.getTarget();
					Integer targetIndex = (Integer)solverMapFile.getContentMap().get(getElementName(target));
					relation.getNodes().add(targetIndex);
				}
			
			}
			relationList.add(relation);
		}
		solverFile.setEdgeList(relationList);
		solverFile.save();
	}
	
	private String getElementName(EObject element)
	{
		if(element.eContainer() instanceof Actor)
			return ((Actor)element.eContainer()).getName() + "." + ((GraphicalObject)element).getName();
		return ((GraphicalObject)element).getName();
	}
}
