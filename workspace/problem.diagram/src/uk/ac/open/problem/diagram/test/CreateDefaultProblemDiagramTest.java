package uk.ac.open.problem.diagram.test;

import static org.junit.Assert.assertTrue;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.finders.UIThreadRunnable;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.results.VoidResult;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.ui.PlatformUI;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SWTBotJunit4ClassRunner.class)
public class CreateDefaultProblemDiagramTest {

	private static SWTWorkbenchBot bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		try {
		bot = new SWTWorkbenchBot();
		bot.viewByTitle("Welcome").close();
		} catch (IllegalStateException x) { }
	}

	@Before
    public void setUp() throws Exception {
		try {
            UIThreadRunnable.syncExec(new VoidResult() {
                    public void run() {
                            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().forceActive();
                    }
            });
		} catch (IllegalStateException x) { }
    }

	@Test
	public void canCreateProblemExamplesProject() throws Exception {
		try {
		IProject p = ResourcesPlugin.getWorkspace().getRoot()
				.getProject("Examples");
		if (p.exists())
			p.delete(true, null);
		assertTrue(!p.exists());
		bot.menu("Open").menu("Generate Example Project").click();
		sleep();
		assertTrue(p.exists());
		existProblem(p, "Problem.xtext");
		existProblem(p, "ads-b-pwd.problem");
		// the 2nd case
		bot = new SWTWorkbenchBot();
		SWTBotMenu menu = bot.menu("File").menu("New");
		menu = menu.menu("Example...").click();
		SWTBotShell shell = bot.shell("New Example");
		shell.activate();
		bot.tree().select("Problem Diagram");
		bot.button("Next >").click();
		bot.tree().expandNode("Examples").select("problem");
		bot.button("Next >").click();
		bot.tree().expandNode("Examples").select("problem");
		bot.button("Finish").click();
		sleep();
		existProblem(p, "default.problem");
		} catch (IllegalStateException x) { }
	}

	private void existProblem(IProject p, String problem) {
		IFile f = p.getFile("problem/" + problem);
		assertTrue(f.exists());
	}

	public static void sleep() {
		try {
			bot.sleep(2000);
		} catch (Exception x) {} 
	}

}
