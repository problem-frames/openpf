package it.unitn.disi.sistar.files.asp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.gmf.runtime.common.core.util.StringUtil;

public class ASPOutputFile {

	private List predicatesList;
	private File baseFile;
	
	public ASPOutputFile(File baseFile) {
		this.baseFile = baseFile;
	}
	
	public void load() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(baseFile)));
		
		predicatesList = new ArrayList();
		
		int modelIndex = 1;
		for(String sb = reader.readLine(); sb != null; sb = reader.readLine())
		{
			String output = StringUtil.replaceAll(sb, "),", ")\n", false);
			BufferedReader smallReader = new BufferedReader(new StringReader(output));
			for(String line = smallReader.readLine(); line != null; line = smallReader.readLine())
			{	
				if(line.startsWith("{"))
				{
					line = line.substring(1,line.length());
				}
				if(line.endsWith("}"))
				{
					line = line.substring(0, line.length() -1);
				}
				if(line.trim().length() == 0)
					continue;
				String predicate = line.substring(0, line.indexOf("(")).trim();
				String arguments = line.substring(line.indexOf("(") + 1, line.length() - 1).trim();
				line = line.trim() + "\n";
				//System.out.println("p:" + predicate + "|args:"  + arguments);
				
				StringTokenizer argTokenizer = new StringTokenizer(arguments, ",");
				List content = new ArrayList();
				content.add(predicate);
				content.add(modelIndex);
				while(argTokenizer.hasMoreElements())
				{
					String argument = (String) argTokenizer.nextElement();
					content.add(argument);
				}
				predicatesList.add(content);
			}
			modelIndex++;
		}
	}

	public List getPredicatesList() {
		return predicatesList;
	}

	public void setPredicatesList(List predicatesList) {
		this.predicatesList = predicatesList;
	}
}
