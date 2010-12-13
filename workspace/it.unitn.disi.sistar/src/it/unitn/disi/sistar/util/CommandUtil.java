package it.unitn.disi.sistar.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

import org.eclipse.debug.core.DebugPlugin;

public class CommandUtil {

	//minhsang: return the error message of executing command.  
	public static String executeCommand(String[] command, File workingDir )
	{
		try {
			String actualCommand = "";
			for (int i = 0; i < command.length; i++) {
				actualCommand += command[i] + (i==command.length-1?"":" ");
			}
			
			ConsoleUtil.printToConsole("Running Command:[" + actualCommand + "]");
			if(workingDir !=null)
				ConsoleUtil.printToConsole("Working Directory[" + workingDir.getAbsolutePath() + "]");
			Process p = null;
			p = DebugPlugin.exec(command, workingDir);
			
			String errorStr = "";
			BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		    for(String line = input.readLine(); line != null; line = input.readLine())
		    	ConsoleUtil.printToConsole(line);

		    input.close();
		    
		    BufferedReader error = new BufferedReader(new InputStreamReader(p.getErrorStream()));
		    for(String line = error.readLine(); line != null; line = error.readLine())
		    {
		    	ConsoleUtil.printToConsole(line);
		    	errorStr += line;
		    }
		    error.close();
		    
		    p.waitFor();
			if(errorStr.length() == 0)
		    	ConsoleUtil.printToConsole("Command:[" + actualCommand + "] Successful");
		    else
		    	ConsoleUtil.printToConsole("Command:[" + actualCommand + "] Failed");
			
			return errorStr;
		} catch (Throwable e) {
			ConsoleUtil.printExceptionToConsole(e);
			return "Exception: " + e.getLocalizedMessage();
		}
	}
}
