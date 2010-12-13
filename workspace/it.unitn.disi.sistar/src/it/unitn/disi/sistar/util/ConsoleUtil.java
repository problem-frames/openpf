package it.unitn.disi.sistar.util;

import java.io.PrintStream;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsoleUtil {
	
	private static String DEBUG = "DEBUG";
	
	private static MessageConsole console;
	
	public static void printToConsole(String name, String message)
	{
		if(console == null || !console.getName().equals(name))
			console = findConsole(name);
		MessageConsoleStream out = console.newMessageStream();
		out.println(message);
		System.out.println(message);
	}
	
	public static void printToConsole(String message)
	{
		printToConsole(DEBUG, message);
	}
	
	public static void printExceptionToConsole(String name, String title, Throwable throwable)
	{
		if(console == null || !console.getName().equals(name))
			console = findConsole(name);
		MessageConsoleStream out = console.newMessageStream();
		out.setColor(ColorConstants.red);
		out.println(title);
		throwable.printStackTrace(new PrintStream(out));
		throwable.printStackTrace();
		out.setColor(ColorConstants.black);
	}
	public static void printExceptionToConsole(String title, Throwable throwable)
	{
		printExceptionToConsole(DEBUG, title, throwable);
	}
	public static void printExceptionToConsole(Throwable throwable)
	{
		printExceptionToConsole(DEBUG, "Exception", throwable);
	}
	private static MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   } 
}
