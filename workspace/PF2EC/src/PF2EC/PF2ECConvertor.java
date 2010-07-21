package PF2EC;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

import uk.ac.open.ProblemStandaloneSetup;
import PF2EC.files.Generate;

import com.google.inject.Injector;

import edu.toronto.cs.openome.core.convertor.IConvertor;

public class PF2ECConvertor implements IConvertor {
	public void convert(String input, String output) {
		ProblemStandaloneSetup.doSetup();
		Injector injector = new ProblemStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);		
		URI uri = URI.createFileURI(input); // your input textual file
		Resource xtextResource = resourceSet.getResource(uri, true);
		String newfile = input.substring(0, input.lastIndexOf("."))
				+ ".problem";
		URI modelURI = URI.createFileURI(newfile);
		Resource xmiResource = new XMIResourceFactoryImpl()
				.createResource(modelURI);
		xmiResource.getContents().add(xtextResource.getContents().get(0));
		try {
			xmiResource.save(null);
			String[] args = new String[2];
			args[0] = newfile;
			args[1] = output;
			Generate.main(args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
