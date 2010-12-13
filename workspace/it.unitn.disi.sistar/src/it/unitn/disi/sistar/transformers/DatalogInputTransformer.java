package it.unitn.disi.sistar.transformers;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.util.ConsoleUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.xerces.jaxp.DocumentBuilderFactoryImpl;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DatalogInputTransformer {

	public static String TEMP_FILE_EXTENSION = ".tmp";
	public static String TEMP_FILE = "temp.xml";
	
	public static Document document;
	public static InputStream transformFile(IProject project, InputStream inputXML, String stylesheet, Map parameters)
	{
		InputStream inputXSL = 	null;
		OutputStream outputXML = null;
		
		try {
			Path path = new Path(stylesheet);
			inputXSL = 	FileLocator.openStream(SistarPlugin.getDefault().getBundle(), 
				path, false);
		File file = new File(TEMP_FILE);
		if(file.exists())
			file.delete();

		file.createNewFile();
		outputXML = new FileOutputStream(file);
		
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer(
				new StreamSource(inputXSL));
		for (Iterator iter = parameters.keySet().iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			transformer.setParameter(key, parameters.get(key));
		}
		transformer.transform(new StreamSource(inputXML), 
				new StreamResult(outputXML));
		return new FileInputStream(file);
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
			return null;
		}finally{
			
			try {
				if(inputXML!=null)
					inputXML.close();

				if(inputXSL!=null)
					inputXSL.close();

				if(outputXML!=null)
					outputXML.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
	
	public static InputStream transformFile(InputStream inputXML, InputStream inputXSL)
	{
		OutputStream outputXML = null;
		
		try {
			File file = new File(TEMP_FILE);
			if(file.exists())
				file.delete();
	
			file.createNewFile();
			outputXML = new FileOutputStream(file);
			
			TransformerFactory factory = TransformerFactory.newInstance();
			Transformer transformer = factory.newTransformer(
					new StreamSource(inputXSL));
			transformer.transform(new StreamSource(inputXML), 
					new StreamResult(outputXML));
			return new FileInputStream(file);
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
			return null;
		}finally{
			
			try {
				if(inputXML!=null)
					inputXML.close();

				if(inputXSL!=null)
					inputXSL.close();

				if(outputXML!=null)
					outputXML.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
	
	
	public static InputStream transformFileWithDOM(InputStream inputXML) throws Exception
	{
		InputStream inputXSL = 	null;
		OutputStream outputXML = null;
		
		try {
		File file = new File(TEMP_FILE);
		if(file.exists())
			file.delete();
		
		file.createNewFile();
		outputXML = new FileOutputStream(file);
		
		DocumentBuilderFactory factory = new DocumentBuilderFactoryImpl();
		DocumentBuilder builder = factory.newDocumentBuilder();
		document = builder.parse(inputXML);
	
		Node rootXMI = document.getChildNodes().item(0).getChildNodes().item(0);
		//System.out.println(getChildByName(rootXMI, "tr:Diagram"));
		
		return inputXML;
		} catch (Exception e) {
			ConsoleUtil.printExceptionToConsole(e);
			return null;
		}finally{
			
			try {
				if(inputXML!=null)
					inputXML.close();

				if(outputXML!=null)
					outputXML.close();
			} catch (IOException e) {
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
	}
	private static Node getChildByName(Node node, String name)
	{
		Node result = null;
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			result = list.item(i);
			if(result.getNodeName()!= null && result.getNodeName().equalsIgnoreCase(name))
				break;
		}
		return result;
	}
	
	public static void main(String[] args) throws Exception
	{
		InputStream input,xsl;
		try {
			input = new FileInputStream(new File("D:\\yudis\\Documents\\modeling\\misc\\trial\\default.tpd"));
			xsl = new FileInputStream(new File("D:\\yudis\\Documents\\code\\Si-star\\it.unitn.disi.sistar\\resources\\templates\\template.gr.xsl"));
			//DatalogInputTransformer.transformFileWithDOM(input);
			DatalogInputTransformer.transformFile(input,xsl);
		} catch (Throwable e) {
			ConsoleUtil.printExceptionToConsole(e);
		}
		
	}
}
