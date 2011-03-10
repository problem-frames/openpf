package convertor;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import edu.toronto.cs.openome.core.convertor.IConvertor;

public class EventCalculusRun implements IConvertor {
	public void convert(String input, String output) {
		try {
			String os = System.getProperty("os.name");
			String arch = System.getProperty("os.arch");
			String vendor = "win32";
			if (os.contains("Mac"))
				vendor = "macosx";
			else if (os.contains("nix") || os.contains("nux"))
				vendor = "linux";
			final IWorkspace w = ResourcesPlugin.getWorkspace();
			IPath location = w.getRoot().getProject("Examples").getLocation();
			String command;
			if (vendor.equals("win32")) {
				command = location + "/event/decreasoner.bat" + " " + input;
				File binary = new File(location + "/event/decreasoner.exe");
				if (!binary.exists()) {
					copy_file(location + "/event/binary/" + vendor
							+ "/python.exe", binary);
					copy_file(location + "/event/binary/" + vendor
							+ "/decreasoner.exe", new File(location
									+ "/event/decreasoner.exe"));
					copy_file(location + "/event/binary/" + vendor
							+ "/cygwin1.dll", new File(location
									+ "/event/cygwin1.dll"));
					copy_file(location + "/event/binary/" + vendor
							+ "/cyggcc_s-1.dll", new File(location
									+ "/event/cyggcc_s-1.dll"));
					copy_file(location + "/event/binary/" + vendor
							+ "/solvers/relsat.exe", new File(location
							+ "/event/solvers/relsat.exe"));
					copy_file(location + "/event/binary/" + vendor
							+ "/solvers/walksat.exe", new File(location
							+ "/event/solvers/walksat.exe"));					
				}
			} else {
				command = "/usr/bin/python " + location
						+ "/event/decreasoner.py" + " " + input;
				File binary = new File(location + "/event/decreasoner");
				if (!binary.exists()) {
					copy_file(location + "/event/binary/" + vendor + "." + arch
							+ "/decreasoner", binary);
					copy_file(location + "/event/binary/" + vendor + "." + arch
							+ "/solvers/relsat", new File(location
							+ "/event/solvers/relsat"));
					copy_file(location + "/event/binary/" + vendor + "." + arch
							+ "/solvers/walksat", new File(location
							+ "/event/solvers/walksat"));
				}
			}
			System.out.println(command);
			Process p = Runtime.getRuntime().exec(command, null,
					new File(location + "/event"));
			final Process   prc=Runtime.getRuntime().exec(command); 
			Thread   thread   =   new   Thread   (new   Runnable(){ 
			public   void   run()   { 
			    try{ 
			       prc.waitFor(); 
			    }catch(InterruptedException   e   )   {} 
//			    if(prc.exitValue() != 0){ 
//			          prc.destroy(); 
//			    } 
			}}); 
			thread.start(); 
//			synchronized(this){ 
//			    try{ 
//			        this.wait(5000); 
//			    }catch(Exception   e   )   {} 
//			    if(   thread   .isAlive())   
//			        thread.interrupt(); 
//			}			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			PrintStream ps = new PrintStream(new File(output));
			int c;
			while ((c = br.read()) != -1) {
				ps.print((char) c);
			}
			ps.close();
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(0, null);
		} catch (CoreException e) {
//			e.printStackTrace();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}

	private void copy_file(String string, File binary) {
		// TODO Auto-generated method stub
		if (binary.exists() && binary.canExecute())
			return;
		if (!binary.exists()) {
			try {
				binary.createNewFile();
				File f = new File(string);
				FileInputStream is = new FileInputStream(f);
				FileOutputStream os = new FileOutputStream(binary);
				BufferedOutputStream bos = new BufferedOutputStream(os, 4096);
				int theChar;
				while ((theChar = is.read()) != -1) {
					bos.write(theChar);
				}
				is.close();
				bos.close();
				if (!binary.canExecute())
					binary.setExecutable(true);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		EventCalculusRun c = new EventCalculusRun();
		c.convert(args[0], args[1]);
	}
}
