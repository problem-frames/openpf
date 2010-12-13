package it.unitn.disi.sistar.files.solver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class SolverMapFile {

	private File baseFile;
	private Map contentMap;
	private Map indexMap;
	
	public SolverMapFile(Map contentMap, Map indexMap)
	{
		this.contentMap = contentMap;
		this.indexMap = indexMap;
	}
	
	public SolverMapFile(File file)
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
		contentMap = new HashMap();
		indexMap = new HashMap();
		
		
		BufferedReader reader = new BufferedReader(new FileReader(baseFile));
		for(String line = reader.readLine(); line != null; line = reader.readLine())
		{
			int startIndex = line.indexOf("->");
			String frontString = line.substring(0, startIndex).trim();
			String endString = line.substring(startIndex + 2).trim();
			int index = Integer.parseInt(frontString);
			String value = endString;
			indexMap.put(index, value);
			contentMap.put(value, index);
		}
		if(reader!= null)
			reader.close();
	}
	
	public void save() throws Exception
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(baseFile));
		for (Iterator iter = indexMap.keySet().iterator(); iter.hasNext();) {
			int index = (Integer)iter.next();
			String content = (String)indexMap.get(index);
			writer.write(index + "->" + content + "\n");
		}
		if(writer!= null)
			writer.close();
	}

	public Map getContentMap() {
		return contentMap;
	}

	public void setContentMap(Map contentMap) {
		this.contentMap = contentMap;
	}

	public Map getIndexMap() {
		return indexMap;
	}

	public void setIndexMap(Map indexMap) {
		this.indexMap = indexMap;
	}

	public File getBaseFile() {
		return baseFile;
	}

	public void setBaseFile(File baseFile) {
		this.baseFile = baseFile;
	}

}
