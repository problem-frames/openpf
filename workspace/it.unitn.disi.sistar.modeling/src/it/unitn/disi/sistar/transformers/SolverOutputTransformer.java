package it.unitn.disi.sistar.transformers;

import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.objects.GoalSolverList;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;

public class SolverOutputTransformer {

	private Map resultSATMap = new HashMap();
	private Map resultDENMap = new HashMap();
	private Map goalMap = new HashMap();
	
	public static String TEMP_FILE_EXTENSION = ".tmp";
	public static String TEMP_FILE = "temp.xml";
	
	private double translateValue(String input)
	{
		if(input == null)
			return 0;
		
		if(input.equals("TOTAL"))
			return 1;
		if(input.equals("PARTIAL"))
			return 0.5;
		if(input.equals("NO"))
			return 0;
		return 0;
	}
	public SolverOutputTransformer(InputStream input, InputStream mapping)
	{
		BufferedReader reader = null;
		BufferedReader mappingReader = null;	
		try {
			reader = new BufferedReader(new InputStreamReader(input));
			mappingReader = new BufferedReader(new InputStreamReader(mapping));
			String infoLine = reader.readLine();
			
			String[] info = infoLine.split(" ");
			int numGoal = Integer.parseInt(info[1]);
			int numRelation = Integer.parseInt(info[2]);
			for(String line = mappingReader.readLine(); line != null; line = mappingReader.readLine())
			{ 
			    	String[] lineData = line.split(" -> ");
			    	goalMap.put(lineData[0], lineData[1]);
			}
			for(int i = 0; i < numGoal; i++)
			{
				String line = reader.readLine();
				String[] lineData = line.split(" ");
				String goalName = (String)goalMap.get(i);
				resultSATMap.put(goalName, translateValue(lineData[1]));
				resultDENMap.put(goalName, translateValue(lineData[2]));
			}
		   
			reader.close();
			mappingReader.close();
		
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
		}finally
		{
			try {
				if(reader!= null)
					reader.close();
				if(mappingReader!= null)
					mappingReader.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
	public void updateOutput(IFile baseFile)
	{
		GoalSolverList solverList = new GoalSolverList();
		try {
			solverList.load(baseFile.getContents());
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		
		List goalList = solverList.getGoalList();
		Map goalNameMap = solverList.getGoalNameMap();
		
		for (Iterator iter = goalList.iterator(); iter.hasNext();) {
			GoalSolver element = (GoalSolver) iter.next();
			String name = element.getName();
			element.setOutputSAT((Double)resultSATMap.get(name));
			element.setOutputDEN((Double)resultDENMap.get(name));
		}
		try {
			solverList.save(new FileOutputStream(new File(baseFile.getRawLocationURI())));
		} catch (FileNotFoundException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
	}
}
