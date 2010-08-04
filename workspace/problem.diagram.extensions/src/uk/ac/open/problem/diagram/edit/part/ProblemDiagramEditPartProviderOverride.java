package uk.ac.open.problem.diagram.edit.part;

import uk.ac.open.problem.diagram.providers.ProblemEditPartProvider;

public class ProblemDiagramEditPartProviderOverride extends ProblemEditPartProvider {

	public ProblemDiagramEditPartProviderOverride() {
		setFactory(new ProblemDiagramEditPartFactoryOverride());
	}
}
