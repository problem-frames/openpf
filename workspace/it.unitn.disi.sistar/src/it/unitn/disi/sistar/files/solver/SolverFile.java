package it.unitn.disi.sistar.files.solver;

import it.unitn.disi.sistar.objects.GoalRelation;
import it.unitn.disi.sistar.objects.GoalSolver;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class SolverFile {

	private File baseFile;
	private List contentList;
	private List edgeList;
	private String type;
	private int numOfNodes;
	private int numOfRelations;
	
	public SolverFile(File file)
	{
		baseFile = file;
	}
	
	private String getNextElement(StringTokenizer tokenizer)
	{
		if(tokenizer != null && tokenizer.hasMoreElements())
			return (String)tokenizer.nextElement();
		return null;
	}

	public void load() throws Exception
	{
		contentList = new ArrayList();
		edgeList = new ArrayList();
		
		if(!baseFile.exists())
			baseFile.createNewFile();
		BufferedReader reader = new BufferedReader(new FileReader(baseFile));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine(), " ");
		
		type = getNextElement(tokenizer);
		numOfNodes = Integer.parseInt(getNextElement(tokenizer));
		numOfRelations = Integer.parseInt(getNextElement(tokenizer));

		for(int i =0; i < numOfNodes; i++)
		{
			String tmp = reader.readLine();
			if ((tmp==null) || (tmp.equals("")))
				continue;
			tokenizer = new StringTokenizer(tmp, " ");
			GoalSolver object = new GoalSolver();
			getNextElement(tokenizer);
			object.setInputSAT(GoalSolver.convertStatusToValue(getNextElement(tokenizer)));
			object.setInputDEN(GoalSolver.convertStatusToValue(getNextElement(tokenizer)));
			
			contentList.add(object);
		}
		

		for(int i =0; i < numOfRelations; i++)
		{
			String tmp = reader.readLine();
			if ((tmp==null) || (tmp.equals("")))
				continue;
			tokenizer = new StringTokenizer(tmp, " ");
			GoalRelation object = new GoalRelation();
			getNextElement(tokenizer);
			
			object.setType(getNextElement(tokenizer));
			object.setNodes(new ArrayList());
			while(tokenizer.hasMoreElements())
			{	
				try {
					object.getNodes().add(Integer.parseInt(getNextElement(tokenizer)));
				} catch (NumberFormatException e) {
					System.err.println("Error in parsing Integer");
				}
			}

			edgeList.add(object);
		}
		if(reader!= null)
			reader.close();
	}

	public void save() throws Exception
	{
		if(!baseFile.exists())
			baseFile.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(baseFile));
		writer.write(type + " " + contentList.size() + " " + edgeList.size() + "\n");
		for (Iterator iter = contentList.iterator(); iter.hasNext();) {
			GoalSolver element = (GoalSolver) iter.next();
			writer.write("N" + " ");
			writer.write("True".equalsIgnoreCase(PreferenceUtil.getPreference(PreferenceConstants.GOAL_QUANTITATIVE_ANALYSIS))?
					element.getInputSAT() + " ": element.getInputSATStatus() + " ");
			writer.write("True".equalsIgnoreCase(PreferenceUtil.getPreference(PreferenceConstants.GOAL_QUANTITATIVE_ANALYSIS))?
					element.getInputDEN() + " \n": element.getInputDENStatus() + "\n");
		}
		
		for (Iterator iter = edgeList.iterator(); iter.hasNext();) {
			GoalRelation element = (GoalRelation) iter.next();
			writer.write("R" + " ");
			writer.write(element.getType() + " ");
			for(Iterator iter1 = element.getNodes().iterator(); iter1.hasNext();)
			{
				writer.write("" +iter1.next());
				if(iter1.hasNext())
					writer.write(" ");
			}
			writer.write("\n");
		}
		if(writer!= null)
			writer.close();
	}

	public List getContentList() {
		return contentList;
	}

	public void setContentList(List contentList) {
		this.contentList = contentList;
	}

	public List getEdgeList() {
		return edgeList;
	}

	public void setEdgeList(List edgeList) {
		this.edgeList = edgeList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
