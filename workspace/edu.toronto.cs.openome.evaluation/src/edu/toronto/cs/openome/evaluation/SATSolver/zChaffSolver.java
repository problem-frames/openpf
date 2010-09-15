package edu.toronto.cs.openome.evaluation.SATSolver;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Vector;

import edu.toronto.cs.openome_model.Intention;

public class zChaffSolver extends SATSolver{
	/**
	 * @author jenhork
	 * This is where the reasoning actually occurs; however, it should be overridden by it's childen, as this is a general type of reasoner. 
	 * It's not clear what the parent reasoner should do.
	 * 
	 * 1 cnf is SAT
	 * 0 cnf is Unsat
	 * -1 problem with reasoner, wrong file format or some such
	 */
	public int solve(Dimacs cnf) {
		String path = homedir + cnf.getFileName();
		cnf.writeToFile(path); 
		//System.out.println(path);
		
		try	{
			//System.out.println("Trying to run solver");
			Runtime rt = Runtime.getRuntime() ;
	
		    Process p = rt.exec(homedir + "zchaff.exe " + path);
		    //p.waitFor();

		    String line;
		    String[] vars;// = new String[cnf.getNumVariables() + 3];
		  
		   // System.out.println("Solver output:");
		    BufferedReader input =
		        new BufferedReader
		          (new InputStreamReader(p.getInputStream()));
		    	
		      while ((line = input.readLine()) != null) {
		    	  //System.out.println(line);
		    	  if (line.startsWith("Instance Satisfiable")) {
		    		  line = input.readLine();
		    		//  System.out.println(line);
		    		  vars = line.split(" ");
		    		  
		    		  //System.out.println(vars.length);
		    		// for (String str : vars) {
		    		//	 System.out.println(str);
		    		// }
		    		  results = convertToInts(vars, cnf.getNumVariables());
		    		  return 1;
		    	  }
		    	  if (line.startsWith("Instance Unsatisfiable")) {
		    		  
		    		  return 0;
		    	  }
		        
		      }
		      
		      BufferedReader error =
			        new BufferedReader
			          (new InputStreamReader(p.getErrorStream()));
			    	
			      while ((line = error.readLine()) != null) {
			        System.out.println(line);
			      }
		   
		      input.close();

		      //do whatever you want
		   //some more code
		    p.destroy() ;
		 }
		catch(Exception exc){
			
			 /*handle exception*/
			return -1;
		}
		return -1;
		
	}

	
	

}
