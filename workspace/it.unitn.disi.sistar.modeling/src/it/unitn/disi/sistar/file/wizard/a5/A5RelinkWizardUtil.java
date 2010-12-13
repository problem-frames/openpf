package it.unitn.disi.sistar.file.wizard.a5;

import it.unitn.disi.sistar.util.FileUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IFile;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSException;
import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSSerializer;
import org.xml.sax.SAXException;

public class A5RelinkWizardUtil {

	static Document document;
	
	ArrayList precon;
	ArrayList parameters;
	

	public A5RelinkWizardUtil(){
	}
	
	public boolean updateDescritionFile(IFile inputFile, IFile output){

		DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return false;
		}
		try {
			document = builder.parse(FileUtil.toFile(inputFile));
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		/**Get the preconditions...**/
		parameters = getParameters(document);
		precon = getPreconditions(document); 

		factory = 
			DocumentBuilderFactory.newInstance(); 
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(FileUtil.toFile(output));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}  catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		
		try{
	/*	Node parametersNode = document.getElementsByTagName("parameters")
			.item(0);
		parametersNode.getParentNode().removeChild(parametersNode);
		
		Node parameterPreconditions = document
			.getElementsByTagName("parametersPrecondition").item(0);
		parameterPreconditions.getParentNode().removeChild(parameterPreconditions);
		
		Element root = (Element)document.getElementsByTagName("SandDPattern").item(0);
		
		Element preconditions = (Element)root.getElementsByTagName("preconditions").item(0);
		Element parametersEl = document.createElement("parameters");
		root.insertBefore(parametersEl, preconditions);
		
		Element solPreconditions = (Element)preconditions.getElementsByTagName("solutionsPreconditions").item(0);
		Element parameterPreconditionsEl = document.createElement("parametersPrecondition");
		preconditions.insertBefore(parameterPreconditionsEl, solPreconditions);*/
		
		
		
		/*Add the parameters...*/
		
		Iterator iter = parameters.iterator();
		while(iter.hasNext()){
			String operation = (String)iter.next();
			
			NodeList nodes = (NodeList)document.getElementsByTagName("parameters");
			Node node = (Node)nodes.item(0);
			Element op = document.createElement("parameter");
			Element def = document.createElement("Name");
			Element def1 = document.createElement("description");
			Element def2 = document.createElement("domain");
			Element def3 = document.createElement("defaultValue");
			
			def.setTextContent(operation);
			
			op.appendChild(def);
			op.appendChild(def1);
			op.appendChild(def2);
			op.appendChild(def3);
			node.appendChild(op);
		}
	//-------------------	
	/*	while(iter.hasNext()){
			String text = (String)iter.next();
			Element el = document.createElement("parameter");
			
			el.setTextContent(text);
			parametersEl.appendChild(el);
		}
	//------------------------	
		iter = precon.iterator();
		while(iter.hasNext()){
			String text = (String)iter.next();
			Element el = document.createElement("parameterPrecondition");
			el.setTextContent(text);
			parameterPreconditionsEl.appendChild(el);
		}
		*/
		}catch(Exception e){
			e.printStackTrace();
		}

		document.normalize();
		
		try {
			this.saveDom(document, new PrintWriter(FileUtil.toFile(output)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	private void saveDom (Document doc, Writer w){
		DOMImplementationLS ls = (DOMImplementationLS)doc.getImplementation();
		LSOutput o = ls.createLSOutput();
		LSSerializer s = ls.createLSSerializer();
		try{
			o.setCharacterStream(w);
			s.write(doc, o);
		}catch (LSException le){
			le.printStackTrace();
		}

	}
	
	private void removeNodes(Document doc, NodeList nodes){
		System.out.println("Rimuoviamo i nodi....");
		try{
		for(int i=0; i<nodes.getLength(); i++){
			Node node = nodes.item(i);
			
			doc.removeChild(node);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private ArrayList getParameters(Document doc){
		ArrayList<String> list = new ArrayList<String>();
		Node node, att;
		NodeList nodes = document.getElementsByTagName("object");
		for(int i=0; i<nodes.getLength(); i++){
			node = nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("name");
			try{
				String name = att.getNodeValue();
				list.add(name);
			}catch(Exception e){
				//do nothing...
			}
		}
		NodeList services = document.getElementsByTagName("services");
		for(int i=0; i<services.getLength();i++){
			node = services.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("name");
			list.add(att.getNodeValue());
		}
		return list;
	}

	private ArrayList getPreconditions(Document doc){
		ArrayList list = new ArrayList();
		String sourceId, serviceId, targetId, type, precond;
		NodeList nodes = document.getElementsByTagName("object");
		NodeList services = document.getElementsByTagName("services");
		Node node, att;
		System.out.println("Size of array: " + nodes.getLength());
		for(int i=0; i<nodes.getLength(); i++){
			node = nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:type");
			if(att.getNodeValue().matches("tr:Dependency")){
				sourceId = attrs.getNamedItem("source").getNodeValue();
				serviceId = attrs.getNamedItem("target").getNodeValue();
				targetId = searchDependency(nodes,serviceId);
				type = attrs.getNamedItem("dependencyType").getNodeValue();
				if(targetId != null){
					precond = getDepPrecondition(type,getName(nodes,sourceId), 
							getName(nodes,serviceId),getName(nodes,targetId));
					System.out.println("Dep: " + precond);
					list.add(precond);
				}else{
					/**
					 * 1. controlla che source non sia figlio di qualcuno
					 * 2. se lo è --> Dep. irregolare
					 * 3. se non lo è --> nothing to do...
					 */
				}
			}else if(att.getNodeValue().matches("tr:Ownership")){
				type = attrs.getNamedItem("ownershipType").getNodeValue();
				sourceId = attrs.getNamedItem("source").getNodeValue();
				targetId = attrs.getNamedItem("target").getNodeValue();
				precond = getOwnPrecondition(type, searchElement(nodes,sourceId),
						searchElement(services,targetId));
				//System.out.println(precond);
				list.add(precond);
			}else if(att.getNodeValue().matches("tr:Association")){
				type = attrs.getNamedItem("associationType").getNodeValue();
				sourceId = attrs.getNamedItem("source").getNodeValue();
				targetId = attrs.getNamedItem("target").getNodeValue();
				precond = getAssPrecondition(type, searchElement(nodes,sourceId),
						searchElement(nodes,targetId));
				//System.out.println(precond);
				list.add(precond);
			}
		}
		return list;
	}
	
	private String getAssPrecondition(String type, String source, String target){
		//System.out.println(type);
		if(type.matches("IS_PART_OF")){
			return source + " is part of " + target;
		}
		else if(type.matches("PLAY")){
			return source + " plays " + target;
		}
		if(type.matches("IS_A")){
			return source + " is a " + target;
		}
		else if(type.matches("SUPERVISE")){
			return source + " supervises " + target;
		}
		else return null;
		
	}
	
	private String getOwnPrecondition(String type, String source, String target){
		//System.out.println(type);
		if(type.matches("OWN")){
			return source + " owns " + target;
		}
		else if(type.matches("REQUEST")){
			return source + " requests " + target;
		}
		else if(type.matches("PROVIDE")){
			return source + " provides " + target;
		}
		else return "Nothing to do...";
	}

	private String getDepPrecondition(String type, String source, String service, String target){
		//System.out.println(type);
		if(type.matches("DELEGATION_EXECUTION")){
			return source + " delegates " + target 
				+ " to execute " + service;
		}
		else if(type.matches("DELEGATION_PERMISSION")){
			return source + " delegates " + target 
				+ " to provide " + service;
		}
		else if(type.matches("TRUST_EXECUTION")){
			return source + " trusts " + target 
				+ " to execute " + service;
		}
		else if(type.matches("TRUST_PERMISSION")){
			return source + " trusts " + target 
				+ " to provide " + service;
		}
		else if(type.matches("DISTRUST_EXECUTION")){
			return source + " distrusts " + target 
				+ " to provide " + service;
		}
		else if(type.matches("DISTRUST_PERMISSION")){
			return source + " distrust " + target 
				+ " to provide " + service;
		}
		else if(type.matches("MONITORING_EXECUTION")){
			return source + " monitors " + target 
				+ " to execute " + service;
		}
		else if(type.matches("MONITORING_PERMISSION")){
			return source + " monitors " + target 
				+ " to provide " + service;
		}
		else if(type.matches("TRUST_MONITOR")){
			return source + " monitors " + target 
				+ " to provide " + service;
		}
		else{
			System.out.println("Nothing to do...");
			return null;
		}
	}
	
	private String searchParent(NodeList nodes, String id){
		Node node,child, att;
		for(int j=0; j<nodes.getLength(); j++){
			node = nodes.item(j);
			NodeList childs = node.getChildNodes();
			for(int i=0; i<childs.getLength(); i++){
				child = childs.item(i);
				NamedNodeMap attrs = child.getAttributes();
				att = attrs.getNamedItem("xmi:id");
				if(att.getNodeValue().matches(id)){
					//è il figlio che sto cercando...
					return node.getAttributes().getNamedItem("xmi:id").getNodeValue();
				}
			}
		}
		return null;
	}

	private String searchDependency(NodeList nodes, String id){
		Node node, att;
		for(int i=0; i<nodes.getLength(); i++){
			node = nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:type");
			if(att.getNodeValue().matches("tr:Dependency")){
				if(attrs.getNamedItem("source").getNodeValue().matches(id))
					return attrs.getNamedItem("target").getNodeValue();
			}
		}
		return null;
	}
	
	private String searchElement(NodeList nodes, String id){
		Node node, att;
		for(int i=0; i<nodes.getLength(); i++){
			node = nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:id");
			if(att.getNodeValue().matches(id))
				return attrs.getNamedItem("name").getNodeValue();
		}
		return null;
	}

	private String getName(NodeList nodes, String id){
		Node node, att;
		for(int i=0; i<nodes.getLength(); i++){
			node = nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:id");
			if(att.getNodeValue().matches(id))
				return attrs.getNamedItem("name").getNodeValue();
		}
		return null;
	}
}

