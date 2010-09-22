package edu.toronto.cs.openome.testing;

import org.eclipse.swtbot.eclipse.finder.SWTEclipseBot;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

public class TestUtil {
	public static SWTEclipseBot	bot = new SWTEclipseBot();
	public static String projectName = "test";
	public static String diagramName = "test.ood";
	public String modelName = "test.oom";
	
	public static void initializeWorkspace(){
		//bot.view("Welcome").close();
		createNewProject();
		createNewDiagram();
	}

	public static void createNewProject() {
		//Create the project
		bot.menu("File").menu("New").menu("Project...").click();
 
		SWTBotShell shell = bot.shell("New Project");
		shell.activate();
		
		bot.tree().select("General").expandNode("General", true).select("Project");
		
		bot.button("Next >").click();
 
		bot.textWithLabel("Project name:").setText(projectName);
 
		bot.button("Finish").click();
	}

	public static void createNewDiagram() {
		SWTBotTreeItem theProject = bot.view("Project Explorer").bot().tree().getTreeItem(projectName);
		SWTBotMenu New = bot.menu("New");
		New.menu("Other...").click();
		
		SWTBotShell shell = bot.shell("New");
		shell.activate();
		
		bot.tree().select("OpenOME").expandNode("OpenOME", true).select("Diagram (ood)");
		bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.textWithLabel("Enter or select the parent folder:").setText(projectName);
		bot.textWithLabel("File name:").setText(diagramName);
		bot.button("Next >").click();
		
		bot.tree().select(projectName);
		bot.button("Finish").click();
	}
}