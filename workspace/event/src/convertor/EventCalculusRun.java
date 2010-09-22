package convertor;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import edu.toronto.cs.openome.core.convertor.IConvertor;

public class EventCalculusRun implements IConvertor {
	public void convert(String input, String output) {
		try {
			final IWorkspace w = ResourcesPlugin.getWorkspace();
			String command = "/usr/bin/python "
					+ w.getRoot().getProject("Examples").getLocation()
					+ "/event/decreasoner.py" + " " + input;
			System.out.println(command);
			Process p = Runtime.getRuntime().exec(command, null, new File(w.getRoot().getProject("Examples").getLocation() + "/event"));
			int exitValue = p.waitFor();
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			PrintStream ps = new PrintStream(new File(output));
			int c;
			while ((c = br.read()) != -1) {
				ps.print((char) c);
			}
			if (exitValue != 0) {
			}
			ps.close();
            ResourcesPlugin.getWorkspace().getRoot().refreshLocal(0, null);
        } catch (CoreException e) {
                e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EventCalculusRun c = new EventCalculusRun();
		c.convert(args[0], args[1]);
	}
}
