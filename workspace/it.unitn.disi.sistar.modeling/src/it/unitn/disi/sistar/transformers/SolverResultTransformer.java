package it.unitn.disi.sistar.transformers;

import it.unitn.disi.sistar.files.solver.ScenarioFile;
import it.unitn.disi.sistar.files.solver.SolverFile;
import it.unitn.disi.sistar.files.solver.SolverMapFile;
import it.unitn.disi.sistar.objects.GoalSolver;

import java.io.File;
import java.util.Iterator;
import java.util.List;

public class SolverResultTransformer {

	public static void transformResult(File outputFile, File mapFile, File resultFile) throws Exception
	{
		ScenarioFile resultScenario = new ScenarioFile(resultFile);
		resultScenario.load();
		
		SolverFile solverOutput = new SolverFile(outputFile);
		solverOutput.load();
		
		SolverMapFile solverMap = new SolverMapFile(mapFile);
		solverMap.load();
		
		List contents = resultScenario.getContentList();
		
		for (Iterator iter = contents.iterator(); iter.hasNext();) {
			GoalSolver element = (GoalSolver) iter.next();
			int index = (Integer)solverMap.getContentMap().get(element.getName());
			if(index < solverOutput.getContentList().size())
			{
				GoalSolver elementResult = (GoalSolver)solverOutput.getContentList().get(index);
				element.setOutputSAT(elementResult.getInputSAT());
				element.setOutputDEN(elementResult.getInputDEN());
			}
		}
		
		resultScenario.save();
	}
}
