package it.unitn.disi.sistar.files.plan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PlanFile {
	private File baseFile;
	private List contentList;
	
	public PlanFile(File baseFile)
	{
		this.baseFile = baseFile;
	}
	
	public File getBaseFile() {
		return baseFile;
	}

	public void setBaseFile(File baseFile) {
		this.baseFile = baseFile;
	}

	public List getContentList() {
		return contentList;
	}

	public void setContentList(List contentList) {
		this.contentList = contentList;
	}
	public void load()throws Exception
	{
		contentList = new ArrayList();
		BufferedReader reader = new BufferedReader(new FileReader(baseFile));
		while(reader.ready())
		{
			
			String line = reader.readLine();
			if (line==null)
				line = "";
			else
				line = line.trim();
			if(line.startsWith(";"))
				continue;
			if(line.length() == 0)
				continue;
			if(line.startsWith("Time"))
				continue;
			
			if(line.indexOf("(")== -1 || line.indexOf(")") == -1)
				continue;
			int firstIndex = line.indexOf("(");
			int lastIndex = line.indexOf(")");
			
			String subString = line.substring(firstIndex + 1, lastIndex);
			StringTokenizer tokenizer = new StringTokenizer(subString.trim(), " ");
			
			List content = new ArrayList();
			while (tokenizer.hasMoreElements()) {
				String element = (String) tokenizer.nextElement();
				content.add(element);
			}
			contentList.add(content);
		}
		System.out.println("ContentList:" + contentList);
	}
}
