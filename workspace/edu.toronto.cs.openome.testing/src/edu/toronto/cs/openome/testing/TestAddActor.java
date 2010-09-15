package edu.toronto.cs.openome.testing;

import static org.junit.Assert.assertNotNull;

import org.eclipse.swtbot.eclipse.finder.SWTEclipseBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.SWTBotPreferences;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class TestAddActor{
	
	private static SWTEclipseBot bot;
	 
	@BeforeClass
	public static void beforeClass() throws Exception {
		TestUtil.initializeWorkspace();
		bot = new SWTEclipseBot();
	}
 
 
	@Test
	public void canAddActor() throws Exception {
//		System.out.println("The views are: ");
//		for (SWTBotView view : bot.views()){
//			System.out.println(view.getTitle());
//		}

		
		
	}
 
 
	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}
	
}