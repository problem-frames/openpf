/*
 * generated by Xtext
 */
package uk.ac.open.problem;

import org.eclipse.xtext.linking.ILinkingService;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ProblemRuntimeModule extends AbstractProblemRuntimeModule {
	public Class<? extends ILinkingService> bindILinkingService() {
		return ProblemIDLinking.class;
	}
}