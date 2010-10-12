package uk.ac.open;

import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CreateExamplesTest {

	private static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
	}

	@Test
	public void canCreateExamplesProject() throws Exception {
		IProject p = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("Examples");
		if (p.exists())
			p.delete(true, null);
		assertTrue(!p.exists());
		bot.menu("Open").menu("Generate Example Project").click();
		// sleep();
		assertTrue(p.exists());
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(2000);
	}

}
