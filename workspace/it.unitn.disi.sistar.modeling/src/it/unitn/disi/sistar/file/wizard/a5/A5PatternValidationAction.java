package it.unitn.disi.sistar.file.wizard.a5;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.common.constants.SistarConstants;

import java.io.IOException;
import java.net.URL;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.xml.sax.SAXException;

public class A5PatternValidationAction implements IObjectActionDelegate, SistarConstants{

	private IFile selectedFile;
	
	private URL classSchema;
	private URL patternSchema;
	
	final String CLASS_SCHEMA = "resources/A5/classSchema.xsd";
	final String PATTERN_SCHEMA = "resources/A5/patternSchema.xsd";
	
	public A5PatternValidationAction(){
		super();
	}
	
	public void run(IAction action){
		System.out.println("Fin qui...tutto bene!");
		
		setUpSchemas();

		//		 1. Lookup a factory for the W3C XML Schema language
        SchemaFactory factory = 
            SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
        
        try {
        // 2. Compile the schema. 
        // Here the schema is loaded from a java.io.File, but you could use 
        // a java.net.URL or a javax.xml.transform.Source instead.
        Schema schema = factory.newSchema(patternSchema);
    
        // 3. Get a validator from the schema.
        Validator validator = schema.newValidator();
        
        // 4. Parse the document you want to check.
        //Source source = new StreamSource("new_file_class.xml");
        IPath path = selectedFile.getLocation();
        Source source = new StreamSource(path.toFile());
        
        // 5. Check the document
        
            validator.validate(source);
            String filename = selectedFile.getName();
            MessageDialog.openInformation(null, "Validation complete", "The pattern file " +
            		"\"" + filename + "\" is valid.");
        }
        catch (SAXException ex) {
            System.out.println(" is not valid because ");
            System.out.println(ex.getMessage());
            String filename = selectedFile.getName();
            MessageDialog.openError( null, "Validation Error", "The pattern file \" " 
            		+ filename + " \" is not valid because: " + ex.getMessage());
        }
        catch (IOException e){
        	e.printStackTrace();
        }
        catch(Exception exc){
        	exc.printStackTrace();
        }
	}
	
	private void setUpSchemas(){
		try {
			patternSchema = FileLocator.find(SistarPlugin.getDefault().getBundle(), 
					new Path(PATTERN_SCHEMA), null);
			classSchema = FileLocator.find(SistarPlugin.getDefault().getBundle(), 
					new Path(CLASS_SCHEMA), null);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	
	public void selectionChanged(IAction action, ISelection selection) {
		if(selection instanceof ITreeSelection)
		{
			if(((ITreeSelection)selection).getFirstElement() instanceof IFile)
			{
					selectedFile = (IFile)((ITreeSelection)selection).toList().get(0);
			}
		}
	}
	
	public static void main(String[] args) {
		A5PatternValidationAction action = new A5PatternValidationAction();
		action.run(null);
	}
}
