package uk.ac.open.ui;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.parsetree.NodeUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import uk.ac.open.problem.Node;
public class ProblemSemanticHighlightingCalculator implements
                ISemanticHighlightingCalculator {

        public void provideHighlightingFor(XtextResource resource,
                        IHighlightedPositionAcceptor acceptor) {
                if (resource == null)
                        return;

                Iterable<AbstractNode> allNodes = NodeUtil.getAllContents(
                                resource.getParseResult().getRootNode());

                for (AbstractNode abstractNode : allNodes) {
                        // apply KEYWORD style to our Gaml defined Keyword / facet / operators
                        if (abstractNode.getElement() instanceof Node) {
                        		Node n = (Node) abstractNode.getElement();
                        		int l = n.getName().length();
                                acceptor.addPosition(abstractNode.getOffset(), l, 
                                                DefaultHighlightingConfiguration.STRING_ID);
                        }
                }
        }
}
