package it.unitn.disi.sistar.file.wizard.a5;

import it.unitn.disi.sistar.activator.SistarPlugin;
import it.unitn.disi.sistar.file.wizard.pattern.PatternElement;
import it.unitn.disi.sistar.file.wizard.pattern.PatternRelation;
import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
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

 

public class A5CreationWizardUtil {

	final String CLASS_STYLE = "resources/A5/classStyle.xsl";
	final String PATTERN_STYLE = "resources/A5/patternStyle.xsl";
	
	static Document document;

	InputStream classStyleSheet;
	InputStream patternStyleSheet;
	
	private ArrayList differences;
	private ArrayList differences1;
	
	private ArrayList servicesList;
	private ArrayList ecoList;
	private ArrayList dependencyList;
	private ArrayList decompositionList;
	
	private static String GOAL = "GOAL";
	private static String SOFTGOAL = "SOFTGOAL";
	private static String RESOURCE = "RESOURCE";
	private static String TASK = "TASK";
	private static String EVENT = "EVENT";
	
	private static String DELEX_REL = "DELEGATION_EXECUTION";
	private static String DELPER_REL = "DELEGATION_PERMISSION";
	private static String TRUSTEX_REL = "TRUST_EXECUTION";
	private static String TRUSTPER_REL = "TRUST_PERMISSION";
	private static String DISTRUSTEXE_REL = "DISTRUST_EXECUTION";
	private static String DISTRUSTPER_REL = "DISTRUST_EXECUTION";
	private static String MONEXE_REL = "MONITORING_EXECUTION";
	private static String MONPER_REL = "MONITORING_PERMISSION";
	private static String TRUSTMON_REL = "TRUST_MONITOR";
	
	private static String AND_DECOMP = "AND";
	private static String OR_DECOMP = "OR";
	
	private static String OWN_REL = "OWN";
	private static String REQUEST_REL = "REQUEST";
	private static String PROVIDE_REL = "PROVIDE";
	
	private ArrayList precon;
	private ArrayList param;

	public A5CreationWizardUtil(){
		differences = new ArrayList();
		differences1 = new ArrayList();
		
		this.servicesList =  new ArrayList();
		this.servicesList.add(GOAL);
		this.servicesList.add(SOFTGOAL);
		this.servicesList.add(TASK);
		this.servicesList.add(RESOURCE);
		this.servicesList.add(EVENT);
		
		this.dependencyList = new ArrayList();
		this.dependencyList.add(DELEX_REL);
		this.dependencyList.add(DELPER_REL);
		this.dependencyList.add(TRUSTEX_REL);
		this.dependencyList.add(TRUSTPER_REL);
		this.dependencyList.add(DISTRUSTEXE_REL);
		this.dependencyList.add(DISTRUSTPER_REL);
		this.dependencyList.add(MONEXE_REL);
		this.dependencyList.add(MONPER_REL);
		this.dependencyList.add(TRUSTMON_REL);
		
		this.decompositionList = new ArrayList();
		this.decompositionList.add(AND_DECOMP);
		this.decompositionList.add(OR_DECOMP);
		
		this.ecoList = new ArrayList();
		this.ecoList.add(OWN_REL);
		this.ecoList.add(REQUEST_REL);
		this.ecoList.add(PROVIDE_REL);
	}
	
	public boolean createDescritionFile(IFile contextFile, IFile solutionFile, 
			IFile output, List list, String id){
		System.out.println("CONTEXT: " + contextFile.getName());
		System.out.println("SOLUTION: " + solutionFile.getName());
		
		try {
			patternStyleSheet = FileLocator.openStream(
					SistarPlugin.getDefault().getBundle(), 
					new Path(PATTERN_STYLE), false);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
			document = builder.parse(FileUtil.toFile(contextFile));
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		
		/**Get the preconditions...**/
		precon = getPreconditions(document); 
        param = getParameters(document);
        
		// Use a Transformer for output
		TransformerFactory tFactory =
			TransformerFactory.newInstance();
		StreamSource stylesource = new StreamSource(patternStyleSheet);
		Transformer transformer;
		try {
			transformer = tFactory.newTransformer(stylesource);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
			return false;
		}

		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(FileUtil.toFile(output));
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		}

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
		
		differences = getDifferences(contextFile, solutionFile);
		differences1 = getDifferences2(contextFile, solutionFile);
		
		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String time = String.valueOf(calendar.getTimeInMillis());

		NodeList nodes = (NodeList)document.getElementsByTagName("date");
		Node node = (Node)nodes.item(0);
		node.appendChild(document.createTextNode(year+"-"+month+"-"+day));

		try{
			nodes = (NodeList)document.getElementsByTagName("property");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode("ToBe Defined"));
			
			nodes = (NodeList)document.getElementsByTagName("timestamp");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode(time));

			nodes = (NodeList)document.getElementsByTagName("id");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode(id));
			
			
			Document doc = builder.parse(FileUtil.toFile(solutionFile));
			OutputFormat format = new OutputFormat (doc); //as a String
		    StringWriter stringOut = new StringWriter ();    
		    XMLSerializer serial   = new XMLSerializer (stringOut, 
		                                                  format);
		    serial.serialize(doc);
			String s = stringOut.toString();
			
			nodes = (NodeList)document.getElementsByTagName("modelData");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode(s));
			System.out.println("SOLUTION file Text: " + s);
			
			nodes = (NodeList)document.getElementsByTagName("timestamp");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode(time));

		
			/** Add the preconditions....**/
			nodes = (NodeList)document.getElementsByTagName("precondition");
			node = (Node)nodes.item(0);
			for(int i=0; i<precon.size();i++){
				String pre = (String)precon.get(i);
				//System.out.println(pre);
				Node tmp = document.createElement("precondition");
				tmp.setTextContent(pre);
				node.appendChild(tmp);
			}
			
			Iterator iter = list.iterator();
			while(iter.hasNext()){
				String operation = (String)iter.next();
				System.out.println(operation);
				nodes = (NodeList)document.getElementsByTagName("classAdaptors");
				node = (Node)nodes.item(0);
				Element op = document.createElement("adaptor");
				Element def = document.createElement("Name");
				Element def1 = document.createElement("imports");
				Element def2 = document.createElement("headerClass");
				Element def3 = document.createElement("globalVariables");
				
				def.setTextContent(operation);
				
				op.appendChild(def);
				op.appendChild(def1);
				op.appendChild(def2);
				op.appendChild(def3);
				node.appendChild(op);
			}
			
			Iterator iter1 = param.iterator();
			while(iter1.hasNext()){
				String operation = (String)iter1.next();
				 nodes = (NodeList)document.getElementsByTagName("parameters");
				 node = (Node)nodes.item(0);
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
			
			ArrayList r1 = getRoles(contextFile);
			if(r1!= null){
				Iterator iter2 = r1.listIterator();			
				while(iter2.hasNext()){
					String operation =(String) iter2.next();
					
					nodes = (NodeList)document.getElementsByTagName("Role");
					node = (Node)nodes.item(0);
					Element op = document.createElement("roleName");
			
					op.setTextContent(operation);
					node.appendChild(op);
				}
			}
			ArrayList r = getRoles(contextFile);
			if(r!= null){
				Iterator iter4 = r.listIterator();			
				while(iter4.hasNext()){
					String operation =(String) iter4.next();
					
					nodes = (NodeList)document.getElementsByTagName("roles");
					node = (Node)nodes.item(0);
					Element op = document.createElement("role");
					Element def = document.createElement("roleName");
					Element def1 = document.createElement("description");
				
					
					def.setTextContent(operation);
				
					op.appendChild(def);
					op.appendChild(def1);
					
					node.appendChild(op);
				}
			}
			
			
			NodeList nodes1 = (NodeList)document.getElementsByTagName("validFrom");
			Node node1 = (Node)nodes1.item(0);
			node1.appendChild(document.createTextNode(time));

			NodeList nodes2 = (NodeList)document.getElementsByTagName("validUntil");
			Node node2 = (Node)nodes2.item(0);
			node2.appendChild(document.createTextNode(time+12));
			
		
			Iterator iter3 = differences.iterator();
			 while(iter3.hasNext()){
				String operation = (String)iter3.next();
				if (addedOperations(operation)){
				nodes = (NodeList)document.getElementsByTagName("calls");
				node = (Node)nodes.item(0);
				Element op = document.createElement("call");
				Element def = document.createElement("callName");
				Element def1 = document.createElement("description");
				Element def2 = document.createElement("signature");
				
				int i = operation.indexOf("(");
				String sub = operation.substring(0, i);
				def.setTextContent(sub);
				def2.setTextContent(operation);
				
				op.appendChild(def);
				op.appendChild(def1);
				op.appendChild(def2);
				
				node.appendChild(op);
				}
				
			}
			
			
			
				
			/*	
			Iterator iter5 = differences1.iterator();
			while(iter5.hasNext()){
				String operation = (String)iter5.next();
				if (addedOperations(operation)){
				nodes = (NodeList)document.getElementsByTagName("calls");
				node = (Node)nodes.item(0);
				Element op = document.createElement("call");
				Element def = document.createElement("callName");
				Element def1 = document.createElement("description");
				Element def2 = document.createElement("signature");
				
				
				int i = operation.indexOf("(");
				String sub = operation.substring(0, i);
				def.setTextContent(sub);
				def2.setTextContent(operation);
				
				op.appendChild(def);
				op.appendChild(def1);
				op.appendChild(def2);
				
				node.appendChild(op);
				}
			}
			*/
		} catch (Exception e){
			ConsoleUtil.printExceptionToConsole(e);
		}

		try {
			this.saveDom(document, new PrintWriter(FileUtil.toFile(output)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
ArrayList addedOp = new ArrayList();
	
	private boolean addedOperations( String s)
	{
		for(int i=0; i<addedOp.size(); i++){
			if((s.equals((String)addedOp.get(i))))return false; 
		}
		addedOp.add(s);
		return true;
	}

	
public boolean createClassFile(IFile output){

		try {
			classStyleSheet = FileLocator.openStream(
					SistarPlugin.getDefault().getBundle(), 
					new Path(CLASS_STYLE), false);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;
		try {
			builder = factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
			return false;
		}
		/*try {
			document = builder.parse(FileUtil.toFile(inputFile));
		} catch (SAXException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}*/
		
		// Use a Transformer for output
		TransformerFactory tFactory =
			TransformerFactory.newInstance();
		StreamSource stylesource = new StreamSource(classStyleSheet);
		Transformer transformer;
		try {
			transformer = tFactory.newTransformer(stylesource);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
			return false;
		}

		DOMSource source = new DOMSource(document);
		StreamResult result = new StreamResult(FileUtil.toFile(output));
		try {
			transformer.transform(source, result);
		} catch (TransformerException e) {
			e.printStackTrace();
			return false;
		}

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

		Calendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		String time = String.valueOf(calendar.getTimeInMillis());

		NodeList nodes = (NodeList)document.getElementsByTagName("date");
		Node node = (Node)nodes.item(0);
		node.appendChild(document.createTextNode(year+"-"+month+"-"+day));

		NodeList nodes1 = (NodeList)document.getElementsByTagName("validFrom");
		Node node1 = (Node)nodes1.item(0);
		node1.appendChild(document.createTextNode(time));

		NodeList nodes2 = (NodeList)document.getElementsByTagName("validUntil");
		Node node2 = (Node)nodes2.item(0);
		node2.appendChild(document.createTextNode(time+100000));
		
	
		
		try{
			
			nodes = (NodeList)document.getElementsByTagName("timestamp");
			node = (Node)nodes.item(0);
			node.appendChild(document.createTextNode(time));
			
			
			
			
		} catch (Exception e){
			e.printStackTrace();
		}

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
		NodeList nodes = (NodeList)document.getElementsByTagName("object");
		NodeList services = (NodeList)document.getElementsByTagName("services");
		Node node, att;
		//System.out.println("Size of array: " + nodes.getLength());
		for(int i=0; i<nodes.getLength(); i++){
			node = (Node)nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:type");
			if(att.getNodeValue().matches("tr:Dependency")){
				//System.out.println("Dependendcy");
				sourceId = attrs.getNamedItem("source").getNodeValue();
				serviceId = attrs.getNamedItem("target").getNodeValue();
				targetId = searchDependency(nodes,serviceId);
				type = attrs.getNamedItem("dependencyType").getNodeValue();
				if(targetId != null){
					precond = getDepPrecondition(type,getName(nodes,sourceId), 
							getName(nodes,serviceId),getName(nodes,targetId));
					//System.out.println("Dep: " + precond);
					list.add(precond);
				}else{
					/**
					 * 1. controlla che source non sia figlio di qualcuno
					 * 2. se lo è --> Dep. irregolare
					 * 3. se non lo è --> nothing to do...
					 */
					String parent = searchParent(nodes, sourceId);
					if(parent != null){
						precond = getDepPrecondition(type, getName(nodes, parent),
								getName(services,sourceId),getName(nodes,serviceId));
						list.add(precond);
					}
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
		System.out.println(type);
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
			System.out.println("DELEGATION_EXECUTION");
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
			node = (Node)nodes.item(j);
			NodeList childs = node.getChildNodes();
			for(int i=0; i<childs.getLength(); i++){
				child = (Node)childs.item(i);
				try{
					NamedNodeMap attrs = child.getAttributes();
					att = attrs.getNamedItem("xmi:id");
					if(att.getNodeValue().matches(id)){
						//è il figlio che sto cercando...
						return node.getAttributes().getNamedItem("xmi:id").getNodeValue();
					}
				}catch(Exception e){
					//Perché trova figli senza l'attributo xmi:id???
				}
			}
		}
		return null;
	}

	private String searchDependency(NodeList nodes, String id){
		Node node, att;
		for(int i=0; i<nodes.getLength(); i++){
			node = (Node)nodes.item(i);
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
			node = (Node)nodes.item(i);
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
			node = (Node)nodes.item(i);
			NamedNodeMap attrs = node.getAttributes();
			att = attrs.getNamedItem("xmi:id");
			if(att.getNodeValue().matches(id))
				return attrs.getNamedItem("name").getNodeValue();
		}
		return null;
	}
	
	
	
	public List readClassData(IFile file){
		Document doc = parseFile(file);
		ArrayList data = new ArrayList();
		
		NodeList nodes = (NodeList)doc.getElementsByTagName("call");
		for(int i=0; i<nodes.getLength(); i++){
			Node node = (Node)nodes.item(i);
			data.add(node.getTextContent());
		}
		return data;
	}
	
	private Document parseFile(IFile file){
		Document document = null;
		DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();

		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(FileUtil.toFile(file));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();	
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return document;
	}
	
	private ArrayList getDifferences(IFile context, IFile solution){
		ArrayList list = findDifferences(context, solution);
		
		ArrayList list2 = findDifferences( solution,context);
		ArrayList diff = encodeDifferences(list);
		ArrayList diff2 = encodeDifferences(list2);
		return diff;
	}
//----------------	
	private ArrayList getDifferences2(IFile context, IFile solution){
		ArrayList list = findDifferences(context, solution);
		
		ArrayList list2 = findDifferences( solution,context);
		ArrayList diff = encodeDifferences(list);
		ArrayList diff2 = encodeDifferences2(list2);
		return diff2;
	}
	
	
				
	
	//------------------
	private ArrayList encodeDifferences(ArrayList list) {
		ArrayList diff = new ArrayList();
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
    			if(servicesList.contains(pe.getType())){
    				if(pe.getType().matches(A5CreationWizardUtil.GOAL)){
    					System.out.println("ADD: " + pe.getName());
    					diff.add(A5Commands.ADD_GOAL);
    				}
    				if(pe.getType().matches(A5CreationWizardUtil.RESOURCE))
    					diff.add(A5Commands.ADD_RESOURCE);
    				if(pe.getType().matches(A5CreationWizardUtil.TASK))
    					diff.add(A5Commands.ADD_TASK);
    				if((pe.getType().matches(A5CreationWizardUtil.SOFTGOAL)))
    					diff.add(A5Commands.ADD_SOFTGOAL);
    			}else{
    				diff.add(A5Commands.ADD_ACTOR);
    			}
			}else if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			if(dependencyList.contains(pr.getType())){
    				if(pr.getType().matches(A5CreationWizardUtil.DELEX_REL)){
    					System.out.println("ADD: " + pr.getSource().getName()
    							+", " + pr.getTarget().getName());
    					diff.add(A5Commands.DEL_EXE);
    				}
    				if(pr.getType().matches(A5CreationWizardUtil.DELPER_REL))
    					diff.add(A5Commands.DEL_PERM);
    				if(pr.getType().matches(A5CreationWizardUtil.TRUSTEX_REL))
    					diff.add(A5Commands.ESTABLISH_TRUST_EXEC);
    				if(pr.getType().matches(A5CreationWizardUtil.TRUSTPER_REL))
    					diff.add(A5Commands.ESTABLISH_TRUST_PERM);
    				if(pr.getType().matches(A5CreationWizardUtil.TRUSTPER_REL))
    					diff.add(A5Commands.ESTABLISH_TRUST_PERM);
    			}else{
    				if(pr.getType().matches(A5CreationWizardUtil.REQUEST_REL))
    					diff.add(A5Commands.REQUEST);
    				if(pr.getType().matches(A5CreationWizardUtil.PROVIDE_REL))
    					diff.add(A5Commands.PROVIDE);
    				if(pr.getType().matches(A5CreationWizardUtil.OWN_REL))
    					diff.add(A5Commands.OWNERSHIP);
    				if(pr.getType().matches(A5CreationWizardUtil.AND_DECOMP))
    					diff.add(A5Commands.DECOMPOSE);
    			}
			}
		}
		return diff;
	}

	//------------------
	private ArrayList encodeDifferences2(ArrayList list) {
		ArrayList diff = new ArrayList();
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
    			if(servicesList.contains(pe.getType())){
    				if(pe.getType().matches(A5CreationWizardUtil.GOAL)){
    					System.out.println("DELETE: " + pe.getName());
    					diff.add(A5Commands.DELETE_GOAL);
    				}
    				if(pe.getType().matches(A5CreationWizardUtil.RESOURCE))
    					diff.add(A5Commands.DELETE_RESOURCE);
    				if(pe.getType().matches(A5CreationWizardUtil.TASK))
    					diff.add(A5Commands.DELETE_TASK);
    				if((pe.getType().matches(A5CreationWizardUtil.SOFTGOAL)))
    					diff.add(A5Commands.DELETE_SOFTGOAL);
    			}else{
    				diff.add(A5Commands.DELETE_ACTOR);
    			}
			}else if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			if(dependencyList.contains(pr.getType())){
    				if(pr.getType().matches(A5CreationWizardUtil.DELEX_REL)){
    					System.out.println("DELETE: " + pr.getSource().getName()
    							+", " + pr.getTarget().getName());
    					diff.add(A5Commands.DELETE_DEL_EXE );
    				}
    				if(pr.getType().matches(A5CreationWizardUtil.DELPER_REL))
    					diff.add(A5Commands.DELETE_DEL_PER);
    				if(pr.getType().matches(A5CreationWizardUtil.TRUSTEX_REL))
    					diff.add(A5Commands.DELETE_TRUST_EXEC);
    				if(pr.getType().matches(A5CreationWizardUtil.TRUSTPER_REL))
    					diff.add(A5Commands.DELETE_TRUST_PERM );
    	
    			}else{
    				if(pr.getType().matches(A5CreationWizardUtil.REQUEST_REL))
    					diff.add(A5Commands.REQUEST);
    				if(pr.getType().matches(A5CreationWizardUtil.PROVIDE_REL))
    					diff.add(A5Commands.PROVIDE);
    				if(pr.getType().matches(A5CreationWizardUtil.OWN_REL))
    					diff.add(A5Commands.OWNERSHIP);
    				if(pr.getType().matches(A5CreationWizardUtil.AND_DECOMP))
    					diff.add(A5Commands.DECOMPOSE);
    			}
			}
		}
		return diff;
	}
	//-------------------------
	
	private ArrayList findDifferences(IFile context, IFile solution){
		ArrayList list = null;
		Document doc = this.parseFile(context);
		ArrayList contextList = createList(doc);
		//this.dump(contextList);
		doc = this.parseFile(solution);
		ArrayList solutionList = createList(doc);
		//this.dump(solutionList);
		list = compareLists(contextList, solutionList);
		//this.dump(list);
		return list;
	}
	
	//--------------------
	private ArrayList findDifferences2(ArrayList diff, IFile solution){
		ArrayList list = null;
	//	Document doc = this.parseFile(context);
	//	ArrayList contextList = createList(doc);
		//this.dump(contextList);
		Document doc = this.parseFile(solution);
		ArrayList solutionList = createList(doc);
		//this.dump(solutionList);
		list = compareLists(diff, solutionList);
		//this.dump(list);
		return list;
	}
	//--------------------
	
	private ArrayList getRoles( IFile context){
			ArrayList roleList = new ArrayList();	
			Document doc = this.parseFile(context);
			ArrayList list = createList(doc);
			
			Iterator iter = list.iterator();
	    	while(iter.hasNext()){
	    		Object o = iter.next();
	    		if(PatternElement.class.isInstance(o)){
	    			PatternElement pe = (PatternElement)o;
	    			if (pe.getType().matches("ROLE"))
	    			{
	    				roleList.add(pe.getName());
	    			}
	    		}
		    }
	    	return roleList;
		}
	
	private ArrayList compareLists(ArrayList contextList, ArrayList solutionList) {
		dump(contextList);
		dump(solutionList);
		System.out.println("SIZE: " + solutionList.size());
		ArrayList diff = new ArrayList();
		for(int i = 0; i<solutionList.size(); i++){
			System.out.println("Indice: " + i);
			Object o = solutionList.get(i);
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				System.out.println("Analizzo: " + pe.getName());
				boolean flag = findElement(pe, contextList);
				if(!(flag)){
					System.out.println(pe.getName() + " non trovato, lo aggiungo!");
					diff.add(pe);
				}
    		}else if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			System.out.println("Analizzo: " + pr.getType()
    					+ ", " + pr.getSource().getName()
    					+ ", " + pr.getTarget().getName());
    			boolean flag = findRelation(pr, contextList);
    			if(!(flag)){
    				System.out.println(pr.getType() + " non trovata la aggiungo.");
    				diff.add(pr);
    			}
    		}else{
    			System.out.println("ERROR: " + o.getClass().toString());
    		}
		}
		return diff;
	}
	
	private boolean findRelation(PatternRelation rel, ArrayList list){
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			if(dependencyList.contains(pr.getType())){
    				if(rel.match(pr)){
    					//list.remove(pr);
    					System.out.println(pr.getType() + " trovata! Non lo aggiungo.");
    					return true;
    				}
    			}else{
    				if(this.compareRelation(pr, rel)){
    					//list.remove(pr);
    					System.out.println(pr.getType() + " trovata! Non lo aggiungo.");
    					return true;
    				}
    			}
			}
		}
		return false;
	}
	
	private boolean compareRelation(PatternRelation rel1, PatternRelation rel2){
		if(!(rel1.getType().matches(rel2.getType())))
			return false;
		if(!(rel1.getSource().getName().matches(rel2.getSource().getName())))
			return false;
		if(!(rel1.getTarget().getName().matches(rel2.getTarget().getName())))
			return false;
		try{
		if(!(rel1.getParent().matches(rel2.getParent())))
			return false;
		}catch(Exception e){
		}
		return true;
	}

	private boolean findElement(PatternElement ele, ArrayList list) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				System.out.println("ITEMS: " + ele.getType() + ", " + pe.getType());
				if(servicesList.contains(pe.getType())
						&&(servicesList.contains(ele.getType()))){
					System.out.println("Confronto....");
					System.out.println("Context: " + ele.getName()
							+ ", " + ele.getType() 
							+ ", " + ele.getParent());
					System.out.println("Diagram: " + pe.getName()
							+ ", " + pe.getType() 
							+ ", " + pe.getParent());
					if((pe.getName().matches(ele.getName()))&&
							(pe.getType().matches(ele.getType())) &&
							(pe.getParent().matches(ele.getParent()))){
						System.out.println(pe.getName() + " trovato! Non lo aggiungo.");
						//list.remove(pe);
						return true;
					}
				}else{
					if((pe.getName().matches(ele.getName()))&&
							(pe.getType().matches(ele.getType()))){
						System.out.println(pe.getName() + " trovato! Non lo aggiungo.");
						//list.remove(pe);
						return true;
					}
				}
			}
		}
		return false;
	}

	public ArrayList createList(Document doc){
		ArrayList list = new ArrayList();
		searchActorsAndServices(doc, list);
	    searchAssociations(doc, list);
	    searchOwnership(doc, list);
	    searchDependecy(doc, list);
	    searchDecomposition(doc, list);
		return list;
	}
	
	private void searchOwnership(Document doc, ArrayList list) {
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
    	for(int i=0; i<nodes.getLength(); i++){
    		Node element = (Node)nodes.item(i);
    		Node type = (Node)element.getAttributes().getNamedItem("ownershipType");
    		Node sourceId = (Node)element.getAttributes().getNamedItem("source");
    		Node targetId = (Node)element.getAttributes().getNamedItem("target");
    		try{
    			PatternElement source = searchElement(doc, sourceId.getNodeValue());
    			PatternElement target = searchElement(doc, targetId.getNodeValue());
    			PatternRelation rel = new PatternRelation(
    					type.getNodeValue(), source, target);
    			list.add(rel);
    		}catch(Exception e){
    			ConsoleUtil.printExceptionToConsole(e);
    		}
    	}

    }
	
	
	
	
    private void searchActorsAndServices(Document doc, ArrayList list) {
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
	    for(int i=0; i<nodes.getLength(); i++){
	    	Node element = (Node)nodes.item(i);
	    	Node name = (Node)element.getAttributes().getNamedItem("name");
	    	Node type = (Node)element.getAttributes().getNamedItem("actorType");
	    	
	    	try{
	    		PatternElement pEl = new PatternElement(name.getNodeValue(), type.getNodeValue());
	    		list.add(pEl);
	    	}catch(Exception e){
	    		//System.out.println("Not an intersting element...");
	    	}
	    	if(name != null)
	    		searchServices(list, element,name.getNodeValue());
	    }
}
    
    private ArrayList searchServices(ArrayList<PatternElement> elements, Node node, String parentName){
		NodeList childs = node.getChildNodes();
		for(int i=0; i<childs.getLength(); i++){
			Node child = (Node)childs.item(i);
			try{
				Node type = (Node)child.getAttributes().getNamedItem("serviceType");
				Node name = (Node)child.getAttributes().getNamedItem("name");
				PatternElement pEl = new PatternElement(name.getNodeValue(), type.getNodeValue());
				pEl.setParent(parentName);
				elements.add(pEl);
			}catch(Exception e){
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		
		return elements;
	}
    
    private void searchAssociations(Document doc, ArrayList list) {
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
    	for(int i=0; i<nodes.getLength(); i++){
    		Node element = (Node)nodes.item(i);
    		Node type = (Node)element.getAttributes().getNamedItem("associationType");
    		Node sourceId = (Node)element.getAttributes().getNamedItem("source");
    		Node targetId = (Node)element.getAttributes().getNamedItem("target");
    		try{
    			PatternElement source = searchElement(doc, sourceId.getNodeValue());
    			PatternElement target = searchElement(doc, targetId.getNodeValue());
    			PatternRelation rel = new PatternRelation(
    					type.getNodeValue(), source, target);
    			list.add(rel);
    		}catch(Exception e){
    			ConsoleUtil.printExceptionToConsole(e);
    		}
    	}

    }
    
    private void searchDecomposition(Document doc, ArrayList list) {
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
    	for(int i=0; i<nodes.getLength(); i++){
    		Node element = (Node)nodes.item(i);
    		Node type = (Node)element.getAttributes().getNamedItem("compositionType");
    		Node sourceId = (Node)element.getAttributes().getNamedItem("source");
    		Node targetId = (Node)element.getAttributes().getNamedItem("target");
    		try{
    			PatternElement source = searchElement(doc, sourceId.getNodeValue());
    			PatternElement target = searchElement(doc, targetId.getNodeValue());
    			PatternRelation rel = new PatternRelation(
    					type.getNodeValue(), source, target);
    			String parent = searchParent(doc, sourceId.getNodeValue()).getName();
    			rel.setParent(parent);
    			list.add(rel);
    		}catch(Exception e){
    			ConsoleUtil.printExceptionToConsole(e);
    		}
    	}

    }
    
    private PatternElement searchParent(Document doc, String id){
    	//System.out.println("Cerco parent...");
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
	    for(int i=0; i<nodes.getLength(); i++){
	    	Node element = (Node)nodes.item(i);
	    	Node name = (Node)element.getAttributes().getNamedItem("name");
	    	Node type = (Node)element.getAttributes().getNamedItem("actorType");
	    	try{
	    		//System.out.println("ID da cercare" + id);
	    	if(type != null){
	    		NodeList children = element.getChildNodes();
	    		//this.printAttributes(children);
	    		for(int k = 0; k< children.getLength() ; k++){
	    			Node child = (Node)children.item(k);
	    			if(child.getNodeName().matches("services")){
	    				Node childId = child.getAttributes().getNamedItem("xmi:id");
	    				//System.out.println("ID trovato: " + childId.getNodeValue());
	    				if(childId.getNodeValue().matches(id)){
	    					PatternElement parent = new PatternElement(name.getNodeValue(),
	    							type.getNodeValue());
	    					//System.out.println("Parent: " + parent);
	    					return parent;
	    				}
	    			}
	    		}
	    	}
	    	}catch(Exception e){
	    		//node is not an actor..
	    		e.printStackTrace();
	    	}
	    }
    	
    	return null;
    	
    }
    
    private PatternElement searchDelegator(Document doc, String id, String type){
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
    	for(int i=0; i<nodes.getLength(); i++){
    		Node element = (Node)nodes.item(i);
    		Node tmp = (Node)element.getAttributes().getNamedItem("xmi:type");
    		if(tmp.getNodeValue().matches("tr:Dependency")){
    			Node depType = (Node)element.getAttributes().getNamedItem("dependencyType");
    			Node targetId = (Node)element.getAttributes().getNamedItem("target");
    			Node sourceId = (Node)element.getAttributes().getNamedItem("source");
    			if(depType.getNodeValue().matches(type)){
    				if(targetId.getNodeValue().matches(id)){
    					PatternElement pe = this.searchElement(doc, sourceId.getNodeValue());
    					return pe;
    				}
    			}
    		}
    	}
    	return null;
    }
    
    private void searchDependecy(Document doc, ArrayList list) {
    	NodeList nodes = (NodeList)doc.getElementsByTagName("object");
    	for(int i=0; i<nodes.getLength(); i++){
    		Node element = (Node)nodes.item(i);
    		Node tmp = (Node)element.getAttributes().getNamedItem("xmi:type");
    		if(tmp.getNodeValue().matches("tr:Dependency")){
    			Node type = (Node)element.getAttributes().getNamedItem("dependencyType");
    			Node sourceId = (Node)element.getAttributes().getNamedItem("source");
    			Node targetId = (Node)element.getAttributes().getNamedItem("target");
    			try{
    				PatternElement source = searchElement(doc, sourceId.getNodeValue());
    				PatternElement target = searchElement(doc, targetId.getNodeValue());
    				PatternRelation rel = null;
    				//System.out.println("Analizzo: " + source.getName() + target.getName() + type.getNodeValue());
    				if(servicesList.contains(source.getType())){
    					String id = sourceId.getNodeValue();
    					//System.out.println("Cerco l'id: " + id);
    					PatternElement parent = searchDelegator(doc, id, type.getNodeValue());
    					if(parent == null)
    						parent = searchParent(doc, id);
    					rel = new PatternRelation(type.getNodeValue(), parent, source, target);
    					//System.out.println("Aggiungo: " + type.getNodeValue()+ parent.getName() 
    					//		+ source.getName() + target.getName());
    					list.add(rel);
    				}
    			}catch(Exception e){
    				e.printStackTrace();
    			}
    		}
    	}

    }
    
    private PatternElement searchElement(Document doc, String id) {
		PatternElement e = null;
		NodeList nodes = (NodeList)doc.getElementsByTagName("object");
	    for(int i=0; i<nodes.getLength(); i++){
	    	Node element = (Node)nodes.item(i);
	    	Node elementId = (Node)element.getAttributes().getNamedItem("xmi:id");
	    	if(elementId.getNodeValue().matches(id)){
	    		try{
	    			Node name = (Node)element.getAttributes().getNamedItem("name");
	    			Node type = (Node)element.getAttributes().getNamedItem("actorType");
	    			e = new PatternElement(name.getNodeValue(), type.getNodeValue());
	    			return e;
	    		}catch(Exception ex){
	    			Node name = (Node)element.getAttributes().getNamedItem("name");
	    			Node type = (Node)element.getAttributes().getNamedItem("serviceType");
	    			e = new PatternElement(name.getNodeValue(), type.getNodeValue());
	    			return e;
	    		}
	    	}
	    }
	    if(e==null){
	    	nodes = (NodeList)doc.getElementsByTagName("services");
		    for(int i=0; i<nodes.getLength(); i++){
		    	Node element = (Node)nodes.item(i);
		    	Node elementId = (Node)element.getAttributes().getNamedItem("xmi:id");
		    	if(elementId.getNodeValue().matches(id)){
		    		Node name = (Node)element.getAttributes().getNamedItem("name");
			    	Node type = (Node)element.getAttributes().getNamedItem("serviceType");
		    		e = new PatternElement(name.getNodeValue(), type.getNodeValue());
		    		return e;
		    	}
		    }
	    }
		return null;
	}

    private void dump(ArrayList list){
    	System.out.println("\n\n-----------------------\n");
    	System.out.println("SIZE: " + list.size());
    	Iterator iter = list.iterator();
    	
    	
    	
    	while(iter.hasNext()){
    		Object o = iter.next();
    		if(PatternElement.class.isInstance(o)){
    			PatternElement pe = (PatternElement)o;
    			System.out.println("++++++++++++++++++");
    			System.out.println("ELEMENT:");
    			System.out.println("Name: " + pe.getName());
    			System.out.println("Type: " + pe.getType());
    			System.out.println("++++++++++++++++++");
    			
    			
    		}else if(PatternRelation.class.isInstance(o)){
    			PatternRelation pr = (PatternRelation)o;
    			System.out.println("++++++++++++++++++");
    			System.out.println("RELATION:");
    			System.out.println("Type: " + pr.getType());
    			System.out.println("Source: " + pr.getSource().getName());
    			System.out.println("Target: " + pr.getTarget().getName());
    			try{
    				System.out.println("Goal: " + pr.getGoal().getName());
    			}catch(Exception e){
    			}
    			System.out.println("++++++++++++++++++");
    		}
    	}
    	System.out.println("\n\n-----------------------\n");
    }

	/*public String readId(IFile classFile) {
		Document doc = parseFile(classFile);
		NodeList nodes = (NodeList)doc.getElementsByTagName("id");
		Node node = (Node)nodes.item(0);
		String id = new String(node.getTextContent());
	
		return id;
	}*/
    
}

