package it.unitn.disi.sistar.file.wizard.pattern;

import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApplyPatternUtil {

	private ArrayList couples;
	private ArrayList stringCouples;
	
	private ArrayList addedElements;
	
	private static String AGENT = "AGENT";
	private static String ROLE = "ROLE";
	
	private static String GOAL = "GOAL";
	private static String SOFTGOAL = "SOFTGOAL";
	private static String RESOURCE = "RESOURCE";
	private static String TASK = "TASK";
	private static String EVENT = "EVENT";
	
	private static String AND_DECOMP = "AND";
	private static String OR_DECOMP = "OR";
	
	private static String OWN_REL = "OWN";
	private static String REQUEST_REL = "REQUEST";
	private static String PROVIDE_REL = "PROVIDE";
	
	private static String DELEX_REL = "DELEGATION_EXECUTION";
	private static String DELPER_REL = "DELEGATION_PERMISSION";
	private static String TRUSTEX_REL = "TRUST_EXECUTION";
	private static String TRUSTPER_REL = "TRUST_PERMISSION";
	private static String DISTRUSTEXE_REL = "DISTRUST_EXECUTION";
	private static String DISTRUSTPER_REL = "DISTRUST_EXECUTION";
	private static String MONEXE_REL = "MONITORING_EXECUTION";
	private static String MONPER_REL = "MONITORING_PERMISSION";
	private static String TRUSTMON_REL = "TRUST_MONITOR";
	
	private static String ISPART_REL = "IS_PART_OF";
	private static String ISA_REL = "IS_A";
	private static String PLAY_REL = "PLAY";
	private static String SUPERVISE_REL = "SUPERVISE";
	
	private ArrayList actorList;
	private ArrayList servicesList;
	
	private ArrayList decompositionList;
	private ArrayList ecoList;
	private ArrayList dependencyList;
	private ArrayList associationList;
	
	public ApplyPatternUtil(){
		servicesList =  new ArrayList();
		servicesList.add(GOAL);
		servicesList.add(SOFTGOAL);
		servicesList.add(TASK);
		servicesList.add(RESOURCE);
		servicesList.add(EVENT);
		
		dependencyList = new ArrayList();
		this.dependencyList.add(DELEX_REL);
		this.dependencyList.add(DELPER_REL);
		this.dependencyList.add(TRUSTEX_REL);
		this.dependencyList.add(TRUSTPER_REL);
		this.dependencyList.add(DISTRUSTEXE_REL);
		this.dependencyList.add(DISTRUSTPER_REL);
		this.dependencyList.add(MONEXE_REL);
		this.dependencyList.add(MONPER_REL);
		this.dependencyList.add(TRUSTMON_REL);
	}
	
	public ApplyPatternUtil(PatternModel pmodel){
		this.addedElements = new ArrayList();
		
		this.actorList = new ArrayList();
		this.actorList.add(AGENT);
		this.actorList.add(ROLE);
		
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
		
		this.associationList = new ArrayList();
		this.associationList.add(ISPART_REL);
		this.associationList.add(ISA_REL);
		this.associationList.add(PLAY_REL);
		this.associationList.add(SUPERVISE_REL);
	}
	
	public static void copyFile(File in, File out) 
	throws IOException 
	{
		FileChannel inChannel = new
		FileInputStream(in).getChannel();
		FileChannel outChannel = new
		FileOutputStream(out).getChannel();
		try {
			inChannel.transferTo(0, inChannel.size(),
					outChannel);
		} 
		catch (IOException e) {
			throw e;
		}
		finally {
			if (inChannel != null) inChannel.close();
			if (outChannel != null) outChannel.close();
		}
	}
	
	public ArrayList applyPattern(ArrayList elements, PatternModel model){
		try {
			this.stringCouples = elements;
			
			couples = compareDiagrams(model.getContextFile(), model.getDiagramFile(),elements);
			ArrayList triple = comparePatternDiagrams(model.getSolutionFile(), model.getContextFile(), couples);
			
			//ArrayList newTriple =  compAllElements( triple);
			
		//	this.dumpCouples(newTriple);
			return triple;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		//crea in diagram gli elementi mancanti di context
		//Confornta context e solution
		//lista le differenze
		//applica le differenze al diagramma user.
		//aprire il diagramma
	}
	
	
	
	//private ArrayList delateElements(IFile diagramfile, ArrayList Elements){
		
	//}
	
	
	private ArrayList comparePatternDiagrams(IFile solutionFile, IFile contextFile, ArrayList list) {
		Document solDoc = parseFile(solutionFile);
		Document conDoc = parseFile(contextFile);
		ArrayList list1 = createList(solDoc);
		//dump("SOLUTION:", list1);
		//dump(list1);
		//ArrayList list2 = createList(conDoc);
		//dump("CONTEXT:", list2);
		
		ArrayList triples = comparePatternList(list1, list);
		
		return triples;
	}

	
	
	
	
	private ArrayList comparePatternList(ArrayList solution, ArrayList list) {
		Iterator iter = solution.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement sEl = (PatternElement)o;
				boolean contains = this.listContains(list, sEl);
				if(contains == false){
					//In context non esiste elemento di solution
					ApplyPatternCouple a = new ApplyPatternCouple();
					a.setSolutionElement(sEl);
					list.add(a);
				}
			}else if(PatternRelation.class.isInstance(o)){
				PatternRelation sRel = (PatternRelation)o;
				System.out.println(sRel.print());
				boolean contains = this.listContains(list, sRel);
				if(contains == false){
					ApplyPatternCouple a = new ApplyPatternCouple();
					a.setSolutionRelation(sRel);
					list.add(a);
				}

			}else{
				System.err.println("ERROR: Cannot recognize element");
			}
		}
		return list;
	}

	
	//---------------
	private ArrayList comparePatternList1(ArrayList solution, ArrayList list) {
		Iterator iter = solution.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement sEl = (PatternElement)o;
				boolean contains = this.listContains(list, sEl);
				if(contains == true){
					//In context non esiste elemento di solution
					ApplyPatternCouple a = new ApplyPatternCouple();
					a.setSolutionElement(sEl);
					list.add(a);
				}
			}else if(PatternRelation.class.isInstance(o)){
				PatternRelation sRel = (PatternRelation)o;
				System.out.println(sRel.print());
				boolean contains = this.listContains(list, sRel);
				if(contains == true){
					ApplyPatternCouple a = new ApplyPatternCouple();
					a.setSolutionRelation(sRel);
					list.add(a);
				}

			}else{
				System.err.println("ERROR: Cannot recognize element");
			}
		}
		return list;
	}
	
	//--------------
	
	
	
	private boolean listContains(ArrayList list, PatternElement el) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple a = (ApplyPatternCouple)iter.next();
			PatternElement pe = a.getContextElement();
			if(pe != null){
				if(compareElement(el, pe)){
					a.setSolutionElement(el);
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean listContains(ArrayList list, PatternRelation rel) {
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple a = (ApplyPatternCouple)iter.next();
			PatternRelation pr = a.getContextRelation();
			if(pr != null){
				if(compareRelation(rel, pr)){
					try{
						//System.out.println("PARENT IN LISTCONTAINS: " + pr.getParent());
					}catch(Exception e){}
					a.setSolutionRelation(rel);
					return true;
				}
			}
		}
		return false;
	}

	private boolean compareRelation(PatternRelation rel1, PatternRelation rel2) {
		if(!(rel1.getType().matches(rel2.getType())))
			return false;
		PatternElement source1 = rel1.getSource();
		PatternElement source2 = rel2.getSource();
		if(!compareElement(source1, source2))
			return false;
		PatternElement target1 = rel1.getTarget();
		PatternElement target2 = rel2.getTarget();
		if(!compareElement(target1, target2))
			return false;
		try{
			PatternElement goal1 = rel1.getGoal();
			PatternElement goal2 = rel2.getGoal();
			if(!compareElement(goal1, goal2))
				return false;
		}catch(Exception e){}
		return true;
	}
	
	private boolean compareElement(PatternElement ele1, PatternElement ele2){
		if(!(ele1.getName().matches(ele2.getName())))
			return false;
		if(!(ele1.getType().matches(ele2.getType())))
			return false;
		return true;
	}

	public IFile copyDiagramFile(IFile diagramIFile) throws Exception{
		String fileName = diagramIFile.getName().toString();
		String [] temp = null;
	    temp = fileName.split(".tpd");
	    String newFileName = temp[0];
		
		IResource resource = diagramIFile.getParent();
		if (!resource.exists() || !(resource instanceof IContainer)) {
			throw new Exception("Container \"" + diagramIFile.getParent().getName().toString() + "\" does not exist.");
		}
		IContainer container = (IContainer) resource;
		IFile diagramIFileCopy = container.getFile(new Path(newFileName +"_copy.tpd"));
		
		File diagramFileCopy = FileUtil.toFile(diagramIFileCopy);
		File diagramFile = FileUtil.toFile(diagramIFile);
		try {
			copyFile(diagramFile, diagramFileCopy);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Path path = new Path(diagramFileCopy.getName());
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		return file;
	}
	
	
	//compareDiagrams(model.getContextFile(), model.getDiagramFile(),elements);
	
	private ArrayList compareDiagrams(IFile file1, IFile file2, ArrayList couple){
		Document docFile1 = parseFile(file1);
		Document docFile2 = parseFile(file2);
		//System.out.println("CompareDiagrams...");
		//crea lista file1
		ArrayList list1 = createList(docFile1);
		//dump("CONTEXT:", list1);
		//dump(list1);
		ArrayList list2 = createList(docFile2);
		//dump("DIAGRAM:", list2);
		//controlla ogni elemento della lista in file2
		ArrayList list = compareLists(list1, list2, couple);
		//dump("MISSING:", missing);
		return list;
		//return list1;
	}

	private ArrayList compareLists(ArrayList list1, ArrayList list2,ArrayList couple) {
		//System.out.println("SOno in compareList....");
		ArrayList list = new ArrayList();
		Iterator iter1 = list1.iterator();
		while(iter1.hasNext()){
			Object el1 = iter1.next();
			ApplyPatternCouple c = new ApplyPatternCouple();
			if(PatternElement.class.isInstance(el1)){
				PatternElement pe = (PatternElement)el1;
				c.setContextElement(pe);
				PatternElement tmp = findElement(pe, list2);
				if(tmp != null)
					c.setDiagramElement(tmp);
				list.add(c);
			}
			else if(PatternRelation.class.isInstance(el1)){
				PatternRelation pr = (PatternRelation)el1;
				if(decompositionList.contains(pr.getType())){
					System.out.println("PARENT APPLYPATTERNUTIL: " + pr.getParent());
				}
				c.setContextRelation(pr);
			
				PatternRelation tmp = getLinkedRelation(pr, list1, list2);
				if(tmp != null){
					try{
					tmp.setParent(pr.getParent());
					}catch(Exception e){
					}
					c.setDiagramRelation(tmp);
				}
				list.add(c);
			}
			else{
				System.err.println("ERROR: Cannot recognize element");
			}
		}
		Iterator iter = list2.iterator();
		while(iter.hasNext()){
			Object el1 = iter.next();
			ApplyPatternCouple c = new ApplyPatternCouple();
			if(PatternElement.class.isInstance(el1)){
				PatternElement pe = (PatternElement)el1;
				c.setDiagramElement(pe);
				boolean flag = existElement(pe);
				if(!flag){
					System.out.println("NOT FOUND!!!! adding " + pe.getName());
					
					
			//-------- uncommenting list.add
					list.add(c);
			//--------
				
				
				}
			}if(PatternRelation.class.isInstance(el1)){
				PatternRelation pr = (PatternRelation)el1;
				c.setDiagramRelation(pr);
				boolean flag = existRelation(pr, list);
				
				
				if(!flag){
			
					System.out.println("NOT FOUND---!!!! adding " );
			//--------Uncommenting list.add	
					list.add(c);
			//-------------		
					
				}
			}
		}
		
		return list;
	}

	private boolean existRelation(PatternRelation pr, ArrayList list) {
		for(int i=0; i<list.size(); i++){
			ApplyPatternCouple c = (ApplyPatternCouple)list.get(i);
			PatternRelation rel = c.getContextRelation();
			if(rel != null){
				if(this.dependencyList.contains(pr.getType())){
					return pr.match(rel);
				}else{
					if((pr.getSource().getName().matches(rel.getSource().getName()))&&
							(pr.getTarget().getName().matches(rel.getTarget().getName()))){
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean existElement(PatternElement pe) {
		Iterator iter = this.addedElements.iterator();
		while(iter.hasNext()){
			Object el1 = iter.next();
			if(PatternElement.class.isInstance(el1)){
				PatternElement pele = (PatternElement)el1;
				if(pe.getType().matches(pele.getType())){
					if(pe.getName().matches(pele.getName())){
						return true;
					}
				}
			}
		}
		return false;
	}

	private PatternElement findElement(PatternElement element, ArrayList list) {
		//System.out.println("Sono in find element, cerco " + element.getName());
		Iterator iter = list.iterator();
		PatternElement pe = getLinkedElement(element);
		if(pe == null)
			return null;
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement e = (PatternElement)o;
				if((e.getName().matches(pe.getName()))&&(e.getType().matches(pe.getType()))){
					this.addedElements.add(e);
					return e;
				}
			}
		}
		return null;
	}

	private PatternRelation getLinkedRelation(PatternRelation rel, ArrayList context, ArrayList diagram) {
		Iterator iter = stringCouples.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			PatternRelation tmp = decodeRelationString(couple.getContextElementString(), context);
			if(tmp != null){
				if(tmp.match(rel)){
					try{
						PatternRelation pr = decodeRelationString(couple.getDiagramElementString(), diagram);	
						//System.out.println("CONTEXT RELATION: " + rel.print());
						//System.out.println("DIAGRAM RELATION: " + pr.print());
						return pr; 
				}catch(Exception e){
					e.printStackTrace();
					}
				}
			}
		}
		return null;
	}
	
	

	private PatternElement getLinkedElement(PatternElement pe){
		Iterator iter = stringCouples.iterator();
		while(iter.hasNext()){
			ApplyPatternCouple couple = (ApplyPatternCouple)iter.next();
			PatternElement tmp = decodeString(couple.getContextElementString());
			if((tmp.getName().matches(pe.getName()))&&
					(tmp.getType().matches(pe.getType()))){
				//System.out.println("\nLINKED ELEMENT");
				//System.out.println("Socio: " + couple.getDiagramElementString());
				return decodeString(couple.getDiagramElementString());
				
			}
		}
		return null;
	}
	
	private PatternRelation decodeRelationString(String string, ArrayList list) {
		StringTokenizer tokenizer = new StringTokenizer(string, "\\(");
		String type = tokenizer.nextToken();
		String tmp = tokenizer.nextToken();
		tokenizer = new StringTokenizer(tmp,"\\)");
		String item = tokenizer.nextToken();
		PatternRelation pr = new PatternRelation();
		//System.out.println("TYPE: " + type);
		if(dependencyList.contains(type)){
			tokenizer = new StringTokenizer(item, ",");
			String sourceString = tokenizer.nextToken();
			PatternElement source = findPatternElement(sourceString, list);
			String goalString = tokenizer.nextToken();
			PatternElement goal = findPatternElement(goalString, list);
			String targetString = tokenizer.nextToken();
			PatternElement target = findPatternElement(targetString, list);
			pr = new PatternRelation(type,
					source, goal, target);
			//System.out.println("DECODIFICATA: " + pr.print());
		}else{
			//System.out.println("ERROR!CANNOT RECOGNIZE RELATION");
			return null;
		}
		return pr;
	}

	private PatternElement findPatternElement(String name, ArrayList list) {
		Iterator iter = list.iterator();
		//System.out.println("\n\nDevo cercare " + name);
		name = name.replaceAll("^\\s+", "");
		while(iter.hasNext()){
			//System.out.println("Cerco....");
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				//System.out.println("Trovo: " + pe.getName());
				if(pe.getName().matches(name)){
					//System.out.println("TROVATO!!! " + name + pe.getName());
					return pe;
				}
					
			}
		}
		return null;
	}

	private PatternElement decodeString(String string) {
		StringTokenizer tokenizer = new StringTokenizer(string, "\\(");
		String type = tokenizer.nextToken();
		String tmp = tokenizer.nextToken();
		tokenizer = new StringTokenizer(tmp,"\\)");
		String item = tokenizer.nextToken();
		PatternElement pe = new PatternElement();
		if(actorList.contains(type)){
			pe.setType(type);
			pe.setName(item);
		}else if(servicesList.contains(type)){
			pe.setType(type);
			pe.setName(item);
		}
		return pe;
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
	
	public ArrayList createList(Document doc){
		ArrayList list = new ArrayList();
		//aggiungi Attori e services
		searchActorsAndServices(doc, list);
		//aggiung Associations
	    searchAssociations(doc, list);
		//aggiungi Relazioni
	    searchOwnership(doc, list);
	    searchDependecy(doc, list);
	    searchDecomposition(doc, list);
		return list;
	}
	    
	    private void searchActorsAndServices(Document doc, ArrayList list) {
	    	NodeList nodes = doc.getElementsByTagName("object");
		    for(int i=0; i<nodes.getLength(); i++){
		    	Node element = nodes.item(i);
		    	Node name = element.getAttributes().getNamedItem("name");
		    	Node type = element.getAttributes().getNamedItem("actorType");
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

	    private void searchAssociations(Document doc, ArrayList list) {
	    	NodeList nodes = doc.getElementsByTagName("object");
	    	for(int i=0; i<nodes.getLength(); i++){
	    		Node element = nodes.item(i);
	    		Node type = element.getAttributes().getNamedItem("associationType");
	    		Node sourceId = element.getAttributes().getNamedItem("source");
	    		Node targetId = element.getAttributes().getNamedItem("target");
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
	    	NodeList nodes = doc.getElementsByTagName("object");
	    	for(int i=0; i<nodes.getLength(); i++){
	    		Node element = nodes.item(i);
	    		Node type = element.getAttributes().getNamedItem("compositionType");
	    		Node sourceId = element.getAttributes().getNamedItem("source");
	    		Node targetId = element.getAttributes().getNamedItem("target");
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
	    
	    private void searchOwnership(Document doc, ArrayList list) {
	    	NodeList nodes = doc.getElementsByTagName("object");
	    	for(int i=0; i<nodes.getLength(); i++){
	    		Node element = nodes.item(i);
	    		Node type = element.getAttributes().getNamedItem("ownershipType");
	    		Node sourceId = element.getAttributes().getNamedItem("source");
	    		Node targetId = element.getAttributes().getNamedItem("target");
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
	    
	    private void searchDependecy(Document doc, ArrayList list) {
	    	NodeList nodes = doc.getElementsByTagName("object");
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
	    private void printAttributes(NodeList list){
	    	for(int i=0; i<list.getLength(); i++){
	    		Node tmp = (Node)list.item(i);
	    		System.out.println("Node ");
	    		System.out.println("Name " + tmp.getNodeName());
	    		System.out.println("Type " + tmp.getNodeType());
	    		System.out.println("Value " + tmp.getNodeValue());
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
	
		
		
		private ArrayList compAllElements(ArrayList triple){
			
			Iterator iter = triple.iterator();
			
			while(iter.hasNext()){
				ApplyPatternCouple c = (ApplyPatternCouple)iter.next();
				try{
					if(((c.getDiagramElement() != null)&&(c.getContextElement() != null))&&(c.getSolutionElement() == null)){
						
						//Delete c from Triple
						
					}else if((c.getDiagramRelation() != null)&&(c.getContextRelation()!= null)&& (c.getSolutionRelation() == null)){
						
						
					// Delete c from Triple	
						
					}
					
				}catch(Exception e){
					ConsoleUtil.printExceptionToConsole(e);	
				}
			}
			return triple;
		}
		private void dumpCouples(ArrayList list){
			System.out.println("\nDUMP DI COUPLES");
			System.out.println("--------------------");
			System.out.println("ITEMS: " + list.size());
			System.out.println("++++++++++++++++++");
			Iterator iter = list.iterator();
			
				while(iter.hasNext()){
					ApplyPatternCouple c = (ApplyPatternCouple)iter.next();
					try{
					if((c.getContextElement() != null)){
						System.out.println("ELEMENT COUPLE");
						System.out.println("Solution: " + c.getSolutionElement().getType()
								+ "(" + c.getSolutionElement().getName() + ")");
						System.out.println("Context: " + c.getContextElement().getType() 
								+ "(" + c.getContextElement().getName() + ")" );
						System.out.println("Diagram: " + c.getDiagramElement().getType() 
								+ "(" + c.getDiagramElement().getName() + ")" );
					}else if((c.getDiagramRelation() != null)||(c.getContextRelation() != null)){
						System.out.println("RELATION COUPLE");
						System.out.println("Solution: " + c.getSolutionRelation().print());
						System.out.println("Context: " + c.getContextRelation().print());
						System.out.println("Diagram: " + c.getDiagramRelation().print() );
					}else{
						System.out.println("CANNOT RECOGNIZE ELEMENT");
						System.out.println();
					}
					}catch(Exception e){
						
					}
					System.out.println("++++++++++++++++++");
				}
			
			System.out.println("--------------------");
		}
}
