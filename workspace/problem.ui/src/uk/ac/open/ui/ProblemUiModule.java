/*
 * generated by Xtext
 */
package uk.ac.open.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ProblemUiModule extends uk.ac.open.ui.AbstractProblemUiModule {
	public ProblemUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
    /**
     * @return ProblemSemanticHighlightingCalculator
     */
    public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
            return ProblemSemanticHighlightingCalculator.class;
    }    
}
