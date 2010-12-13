package it.unitn.disi.sistar.transformers;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.gmf.runtime.common.core.util.StringUtil;

public class DatalogOutputTransformer implements SistarConstants{

	public static String TEMP_FILE_EXTENSION = ".tmp";
	public static String TEMP_FILE = "temp.xml";
	
	
	public static InputStream transformFile(IProject project, InputStream inputStream)
	{
		try {
			int i = 1;
			BufferedReader mainReader = new BufferedReader(new InputStreamReader(inputStream));
			StringBuffer mainBuffer = new StringBuffer();
			for(String sb = mainReader.readLine(); sb != null; sb = mainReader.readLine())
			{
				String output = StringUtil.replaceAll(sb, "),", ")\n", false);
				BufferedReader smallReader = new BufferedReader(new StringReader(output));
				StringBuffer smallBuffer = new StringBuffer("Model " + i++ + ":\n");
				//StringBuffer smallBuffer = new StringBuffer();
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
					String key = line.substring(0, line.indexOf("(")).trim();
					String shownStr = project.getPersistentProperty(new QualifiedName(PROPERTY_ANALYSIS_OUTPUT, key));
					if(shownStr == null || shownStr.equalsIgnoreCase("TRUE"))
					{
						line = line.trim() + "\n";
					}else
						line = "";
					smallBuffer.append(line);
				}
				mainBuffer.append(smallBuffer);
			}
			return new StringBufferInputStream(mainBuffer.toString());
		} catch (IOException e) {
			ConsoleUtil.printExceptionToConsole(e);
		} catch (CoreException e) {
			ConsoleUtil.printExceptionToConsole(e);
		}   
		return null;
	}
	
	
}
