package it.unitn.disi.sistar.objects;

import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.HashMap;
import java.util.Map;

public class GoalSolver {
	public static int YES = 1;
	public static int NO = 2;
	public static int AUTO = 0;
	
	public static String NOT = "NO";
	public static String PARTIAL = "PARTIAL";
	public static String TOTAL = "TOTAL";
	
	public static double PARTIAL_SAT_THRESHOLD = 0.25;
	public static double FULL_SAT_THRESHOLD = 0.75;
	
	public static double PARTIAL_DEN_THRESHOLD = 0.25;
	public static double FULL_DEN_THRESHOLD = 0.75;
	
	public final static String PARENT_COLUMN 		= "Parent";
	public final static String NAME_COLUMN 		= "Goal Name";
	public final static String TOPGOAL_COLUMN 	= "Is Top Goal";
	public final static String INPUT_COLUMN 			= "Is Input";
	public final static String INPUT_SAT 		= "Input SAT";
	public final static String INPUT_DEN 		= "Input DEN";
	public final static String OUTPUT_SAT 		= "Output SAT";
	public final static String OUTPUT_DEN 		= "Output DEN";
	
	private String parent;
	private String name;
	private int topGoalConstraint;
	private int inputConstraint;
	private double inputSAT;
	private double outputSAT;
	private double inputDEN;
	private double outputDEN;
	private Map properties = new HashMap();
	
	public static double convertStatusToValue(String status)
	{
		if(status == null)
			return 0;
		if ("True".equalsIgnoreCase
				(PreferenceUtil.getPreference(
						PreferenceConstants.GOAL_QUANTITATIVE_ANALYSIS))){
			return Double.parseDouble(status);
			
		} else {
			if(status.equalsIgnoreCase(NOT))
				return 0;
			if(status.equalsIgnoreCase(PARTIAL))
				return 0.5;
			if(status.equalsIgnoreCase(TOTAL))
				return 1.0;
		}
		return 0;
	}
	
	public void setTopGoalConstraintStatus(String input)
	{
		int newConstraint = "AUTO".equals(input)?AUTO:"YES".equals(input)?YES:
			NO;
		topGoalConstraint = newConstraint;
	}
	
	public void setFieldByName(String fieldName, Object value)
	{
			try {
				if(PARENT_COLUMN.equals(fieldName))
					setParent((String)value);
				else if (NAME_COLUMN.equals(fieldName))
					setName((String)value);
				else if (TOPGOAL_COLUMN.equals(fieldName))
					setTopGoalConstraint((Integer)value);
				else if (INPUT_COLUMN.equals(fieldName))
					setInputConstraint((Integer)value);
				else if(INPUT_SAT.equals(fieldName))
					setInputSAT(Double.parseDouble((String)value));
				else if(INPUT_DEN.equals(fieldName))
					setInputDEN(Double.parseDouble((String)value));
				else if(OUTPUT_SAT.equals(fieldName))
					setOutputSAT(Double.parseDouble((String)value));
				else if(OUTPUT_DEN.equals(fieldName))
					setOutputDEN(Double.parseDouble((String)value));
				else
				{
					double propertyValue = Double.parseDouble((String)value);
					properties.put(fieldName.toUpperCase(), propertyValue);
				}
			} catch (NumberFormatException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
	}
	
	public Object getFieldByName(String fieldName)
	{
		if(PARENT_COLUMN.equals(fieldName))
			return parent;
		else if (NAME_COLUMN.equals(fieldName))
			return name;
		else if (TOPGOAL_COLUMN.equals(fieldName))
			return new Integer(topGoalConstraint).toString();
		else if (INPUT_COLUMN.equals(fieldName))
			return String.valueOf(inputConstraint);
		else if(INPUT_SAT.equals(fieldName))
			return new Double(inputSAT).toString();
		else if(INPUT_DEN.equals(fieldName))
			return new Double(inputDEN).toString();
		else if(OUTPUT_SAT.equals(fieldName))
			return new Double(outputSAT).toString();
		else if(OUTPUT_DEN.equals(fieldName))
			return new Double(outputDEN).toString();
		else
		{
			Object object = properties.get(fieldName.toUpperCase());
			return object != null? object.toString():null;
		}
	}
	
	public Object getFieldDisplayByName(String fieldName)
	{
		if (TOPGOAL_COLUMN.equals(fieldName))
			return getTopGoalConstraintStatus();
		else if (INPUT_COLUMN.equals(fieldName))
			return getInputConstraintStatus();
		else
			return getFieldByName(fieldName);
	}
	public void setInputConstraintStatus(String input)
	{
		int newConstraint = "AUTO".equals(input)?AUTO:"YES".equals(input)?YES:
			NO;
		inputConstraint = newConstraint;
	}
	public String getTopGoalConstraintStatus()
	{
		return topGoalConstraint == AUTO?"AUTO":topGoalConstraint == YES?"YES":"NO";
	}
	
	public String getInputConstraintStatus()
	{
		return inputConstraint == AUTO?"AUTO":inputConstraint == YES?"YES":"NO";
	}
	
	public String getInputSATStatus()
	{	
		return inputSAT > FULL_SAT_THRESHOLD?TOTAL:
				inputSAT > PARTIAL_SAT_THRESHOLD?PARTIAL:NOT;
	}
	public String getInputDENStatus()
	{
		return inputDEN > FULL_DEN_THRESHOLD?TOTAL:
				inputDEN > PARTIAL_DEN_THRESHOLD?PARTIAL:NOT;
	}
	public String getOutputSATStatus()
	{
		return outputSAT > FULL_SAT_THRESHOLD?TOTAL:
			outputSAT > PARTIAL_SAT_THRESHOLD?PARTIAL:NOT;
	}
	public String getOutputDENStatus()
	{
		return outputDEN > FULL_DEN_THRESHOLD?TOTAL:
			outputDEN > PARTIAL_DEN_THRESHOLD?PARTIAL:NOT;
	}
	
	public int getInputConstraint() {
		return inputConstraint;
	}
	public void setInputConstraint(int inputConstraint) {
		this.inputConstraint = inputConstraint;
	}
	public double getInputDEN() {
		return inputDEN;
	}
	public void setInputDEN(double inputDEN) {
		if(inputDEN >= 0 && inputDEN <=1)
			this.inputDEN = inputDEN;
	}
	public double getInputSAT() {
		return inputSAT;
	}
	public void setInputSAT(double inputSAT) {
		if(inputSAT >= 0 && inputSAT <=1)
			this.inputSAT = inputSAT;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getOutputDEN() {
		return outputDEN;
	}
	public void setOutputDEN(double outputDEN) {
		if(outputDEN >= 0 && outputDEN <=1)
			this.outputDEN = outputDEN;
	}
	public double getOutputSAT() {
		return outputSAT;
	}
	public void setOutputSAT(double outputSAT) {
		if(outputSAT >= 0 && outputSAT <=1)
			this.outputSAT = outputSAT;
	}
	public int getTopGoalConstraint() {
		return topGoalConstraint;
	}
	public void setTopGoalConstraint(int topGoalConstraint) {
		this.topGoalConstraint = topGoalConstraint;
	}

	public String getParent() {
		if(parent == null)
			return "";
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Map getProperties() {
		return properties;
	}

	public void setProperties(Map properties) {
		this.properties = properties;
	}
	
}
