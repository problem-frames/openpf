package it.unitn.disi.sistar.objects;

import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GoalSolverList {
	private List goalList =  new ArrayList();
	private Map goalNameMap = new HashMap();
	private Map goalIndexMap = new HashMap();
	
	public Map getGoalIndexMap() {
		return goalIndexMap;
	}

	public List getGoalList() {
		return goalList;
	}

	public Map getGoalNameMap() {
		return goalNameMap;
	}

	public void load(InputStream input)
	{
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(input));
			int lineIndex = 0;
			for(String line = reader.readLine(); line != null; line = reader.readLine())
			{
				GoalSolver object = new GoalSolver();
				String[] data = line.split(",");
				for (int i = 0; i < data.length; i++) {
					switch (i) {
					case 0:
						object.setName(data[i]);
						break;
					case 1:
						object.setTopGoalConstraint((int)Double.parseDouble(data[i]));
						break;
					case 2:
						object.setInputConstraint((int)Double.parseDouble(data[i]));
						break;
					case 3:
						object.setInputSAT(Double.parseDouble(data[i]));
						break;
					case 4:
						object.setInputDEN(Double.parseDouble(data[i]));
						break;
					case 5:
						object.setOutputSAT(Double.parseDouble(data[i]));
						break;
					case 6:
						object.setOutputDEN(Double.parseDouble(data[i]));
						break;
					default:
						break;
					}
				}
				goalList.add(object);
				goalIndexMap.put(lineIndex, object.getName());
				goalNameMap.put(object.getName(), lineIndex++);
			}
			reader.close();
		}catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}finally
		{
			try {
				if(reader!= null)
					reader.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
	
	public void save(OutputStream output)
	{
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new OutputStreamWriter(output));
			for (Iterator iter = goalList.iterator(); iter.hasNext();) {
				GoalSolver element = (GoalSolver) iter.next();
				writer.write(element.getName() + "," 
						+ element.getTopGoalConstraint() + "," 
						+ element.getInputConstraint() + ","
						+ element.getInputSAT() + ","
						+ element.getInputDEN() + ","
						+ element.getOutputSAT() + ","
						+ element.getOutputDEN() + "\n");
			}
			writer.close();
		}catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}finally
		{
			try {
				if(writer!= null)
					writer.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}

	public void setGoalIndexMap(Map goalIndexMap) {
		this.goalIndexMap = goalIndexMap;
	}

	public void setGoalList(List goalList) {
		this.goalList = goalList;
	}

	public void setGoalNameMap(Map goalNameMap) {
		this.goalNameMap = goalNameMap;
	}
}
