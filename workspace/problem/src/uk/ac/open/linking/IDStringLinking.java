/*
 * generated by Xtext
 */

package uk.ac.open.linking;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopedElement;

import uk.ac.open.problem.Node;

import com.google.inject.Singleton;

@Singleton
public class IDStringLinking extends DefaultLinkingService {
	// Remove the # in the ID
	@Override
	protected String getCrossRefNodeAsString(AbstractNode node, boolean convert) {
		String result = super.getCrossRefNodeAsString(node, convert);
		if (result.startsWith("#") && result.endsWith("#")) {
			result = result.substring(1, result.length() - 1);
		}
		return result;
	}

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference ref,
			AbstractNode node) throws IllegalNodeException {
		final EClass requiredType = ref.getEReferenceType();
		if (requiredType == null)
			return Collections.<EObject> emptyList();

		final IScope scope = getScope(context, ref);
		final Iterator<IScopedElement> iterator = scope.getAllContents()
				.iterator();
		final String s = getCrossRefNodeAsString(node);
		if (s != null) {
			while (iterator.hasNext()) {
				final IScopedElement element = iterator.next();
				String n = element.name(); 
				if (n.startsWith("#") && n.endsWith("#")) {
					if (element.element() instanceof Node)
						((Node)element.element()).setName(n.substring(1, n.length() - 1));
				}
				if (s.equals(element.name()))
					return Collections.singletonList(element.element());
			}
		}
		return Collections.emptyList();
	}

}
