package it.unitn.disi.sistar.editors.output;

import it.unitn.disi.sistar.transformers.DatalogOutputTransformer;

import java.io.InputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class XMLDocumentProvider extends FileDocumentProvider {

	private IProject currentProject;
	@Override
	protected void setDocumentContent(IDocument document, InputStream contentStream, String encoding) throws CoreException {
		InputStream transformedStream = DatalogOutputTransformer.transformFile(
				currentProject, contentStream);
		super.setDocumentContent(document, transformedStream, encoding);
	}
	protected IDocument createDocument(Object element) throws CoreException {
		currentProject=  ((IFileEditorInput)element).getFile().getProject();
		IDocument document = super.createDocument(element);
		if (document != null) {
			IDocumentPartitioner partitioner =
				new FastPartitioner(
					new XMLPartitionScanner(),
					new String[] {
						XMLPartitionScanner.XML_TAG,
						XMLPartitionScanner.XML_COMMENT });
			partitioner.connect(document);
			document.setDocumentPartitioner(partitioner);
		}
		return document;
	}
}