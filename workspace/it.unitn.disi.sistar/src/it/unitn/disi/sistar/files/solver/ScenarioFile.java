package it.unitn.disi.sistar.files.solver;

import it.unitn.disi.sistar.config.PropertyConfig;
import it.unitn.disi.sistar.objects.GoalSolver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class ScenarioFile {

	private File baseFile;
	private List contentList;
	
	public ScenarioFile(File file)
	{
		baseFile = file;
	}
	
	private String getNextElement(StringTokenizer tokenizer)
	{
		if(tokenizer != null && tokenizer.hasMoreElements())
			return ((String)tokenizer.nextElement()).trim();
		return null;
	}
	public void load() throws Exception
	{
		contentList = new ArrayList();
		BufferedReader reader = new BufferedReader(new FileReader(baseFile));
		for(String line = reader.readLine(); line != null; line = reader.readLine())
		{
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			GoalSolver object = new GoalSolver();
			object.setName(getNextElement(tokenizer));
			object.setTopGoalConstraint(Integer.parseInt(getNextElement(tokenizer)));
			object.setInputConstraint(Integer.parseInt(getNextElement(tokenizer)));
			object.setInputSAT(Double.parseDouble(getNextElement(tokenizer)));
			object.setInputDEN(Double.parseDouble(getNextElement(tokenizer)));
			object.setOutputSAT(Double.parseDouble(getNextElement(tokenizer)));
			object.setOutputDEN(Double.parseDouble(getNextElement(tokenizer)));
			int i = 0;
			while(tokenizer.hasMoreElements())
			{
				List configList = (List)PropertyConfig.getInstance().getServiceProperties().get("SERVICE");
				if (configList!=null)
					object.getProperties().put(configList.get(i++), Double.parseDouble(getNextElement(tokenizer)));
			}
			contentList.add(object);
		}
		if(reader!= null)
			reader.close();
	}
	
	public void save() throws Exception
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(baseFile));
		for (Iterator iter = contentList.iterator(); iter.hasNext();) {
			GoalSolver element = (GoalSolver) iter.next();
			writer.write(element.getName() + ",");
			writer.write(element.getTopGoalConstraint() + ",");
			writer.write(element.getInputConstraint() + ",");
			writer.write(element.getInputSAT() + ",");
			writer.write(element.getInputDEN() + ",");
			writer.write(element.getOutputSAT() + ",");
			writer.write(element.getOutputDEN() + ",");
			List configList = (List)PropertyConfig.getInstance().getServiceProperties().get("SERVICE");
			if (configList!=null) {
				for (Iterator iterator = configList.iterator(); iterator.hasNext();) {
					String propertyName = (String) iterator.next();
					Object propertyValue = element.getProperties().get(propertyName);
					writer.write(propertyValue == null?"0.0":propertyValue.toString());
					if(iterator.hasNext())
						writer.write(",");
					
				}
			}
			writer.write("\n");
		}
		if(writer!= null)
			writer.close();
	}

	public List getContentList() {
		return contentList;
	}
	
	public Map getContentMap() {
		Map contentMap = new HashMap();
		for (Iterator iter = contentList.iterator(); iter.hasNext();) {
			GoalSolver element = (GoalSolver) iter.next();
			contentMap.put(element.getName(), element);
		}
		
		return contentMap;
	}

	public void setContentList(List contentList) {
		this.contentList = contentList;
	}
}
