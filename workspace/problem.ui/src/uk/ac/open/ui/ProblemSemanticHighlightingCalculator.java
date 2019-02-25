package uk.ac.open.ui;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;
public class ProblemSemanticHighlightingCalculator implements
                ISemanticHighlightingCalculator {

        public void provideHighlightingFor(XtextResource resource,
                        IHighlightedPositionAcceptor acceptor) {
                if (resource == null)
                        return;

                TreeIterator<EObject> allNodes = resource.getAllContents();

                for (EObject abstractNode = allNodes.next(); allNodes.hasNext(); abstractNode = allNodes.next()) {
                        // apply KEYWORD style to our Gaml defined Keyword / facet / operators
                        if (abstractNode instanceof AbstractNode) {
                        		ICompositeNode n = ((AbstractNode) abstractNode).getRootNode();
                        		int l = n.getText().length();
                                acceptor.addPosition(n.getOffset(), l, 
                                                DefaultHighlightingConfiguration.STRING_ID);
                        }
                }
        }
}
