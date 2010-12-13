package it.unitn.disi.sistar.editors;

import it.unitn.disi.sistar.common.constants.SistarConstants;
import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.transformers.DatalogInputTransformer;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

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
		Map parameterMap = new HashMap();
		parameterMap.put("instantiation", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_INSTANTIATION));
		parameterMap.put("depth", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_DEPTH));
		parameterMap.put("condition", PreferenceUtil.getPreference(PreferenceConstants.ASP_ANALYSIS_CONDITION));
		InputStream transformedStream = DatalogInputTransformer.transformFile(
				currentProject, contentStream, SistarConstants.DATALOG_INPUT_XSL, parameterMap);
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