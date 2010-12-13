package it.unitn.disi.sistar.file.wizard.pattern;

import it.unitn.disi.sistar.util.ConsoleUtil;
import it.unitn.disi.sistar.util.FileUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApplyPatternWizardPageTable extends WizardPage implements Listener {
	private ISelection selection;
	
	private boolean flag = false;
	
	private IFile patternFile;
	private IFile selectedDiagram;
	
	private Document document;
	private Table table;

	private ArrayList combos;
	private ArrayList texts;
	
	private ApplyPatternUtil util;
	
	private ArrayList diagramElements;
	private ArrayList contextElements;
	
	private HashMap diagramMap;
	private HashMap contextMap;
	
	private static String DELEX_REL = "DELEGATION_EXECUTION";
	private static String DELPER_REL = "DELEGATION_PERMISSION";
	private static String TRUSTEX_REL = "TRUST_EXECUTION";
	private static String TRUSTPER_REL = "TRUST_PERMISSION";
	private static String DISTRUSTEXE_REL = "DISTRUST_EXECUTION";
	private static String DISTRUSTPER_REL = "DISTRUST_EXECUTION";
	private static String MONEXE_REL = "MONITORING_EXECUTION";
	private static String MONPER_REL = "MONITORING_PERMISSION";
	private static String TRUSTMON_REL = "TRUST_MONITOR";
	
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
	
	private static String SELECT = "Select...";
	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ApplyPatternWizardPageTable(ISelection selection) {
		super("wizardPage");
		setTitle("Apply a pattern");
		setDescription("This wizard to apply a pattern to a target diagram.");
		this.selection = selection;
		combos = new ArrayList();
		texts = new ArrayList();
		
		diagramMap = new HashMap();
		contextMap = new HashMap();
		
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
		

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		
		container.setLayout(layout);
		
		
		table =
			new Table(container,SWT.NULL);
		GridData gd = new GridData(GridData.FILL_VERTICAL);
		
		table.setLayoutData(gd);
		
		TableColumn patternColumn = new TableColumn(table, SWT.NONE);
		patternColumn.setWidth(300);
		patternColumn.setText("Pattern Elements");
		
		TableColumn diagramColumn = new TableColumn(table, SWT.NONE);
		diagramColumn.setWidth(300);
		diagramColumn.setText("Diagram Elements");
		
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		initialize();
		setControl(container);
		
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
			}
		}
	}
	
	public void onEnterPage(){
		flag = true;
		ApplyPatternWizard wizard = (ApplyPatternWizard)this.getWizard();
		PatternModel model = wizard.model;
		this.patternFile = model.getPatternFile();
		this.selectedDiagram = model.getDiagramFile();

		if((patternFile!=null)&&(selectedDiagram!=null)){
			System.out.println("FILE: " + this.patternFile.getName());
			System.out.println("DIAGRAM: " + this.selectedDiagram.getName());

			util = new ApplyPatternUtil(this.setPatternData());

			//ArrayList patternElements = this.readPatternData();
			contextElements = util.createList(this.parseFile(model.getContextFile()));
			diagramElements = util.createList(parseFile(model.getDiagramFile()));
			try{
				this.setPatternTable(contextElements);
				this.setDiagramTable(diagramElements, contextElements);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			this.updateMap();
			
		}

	}
	
	private PatternModel setPatternData(){
		ArrayList<PatternElement> elements = new ArrayList<PatternElement>();
		
		ApplyPatternWizard wizard = (ApplyPatternWizard)this.getWizard();
		PatternModel model = wizard.model;
		
		//Gatering context and solution files...
		parseFile(patternFile);
		NodeList nodes = document.getElementsByTagName("solutionfile");
		Node tmp = nodes.item(0);
		String solutionFileName = tmp.getTextContent();
		System.out.println("Solution file diagram: " + solutionFileName);
		
		Path path = new Path(solutionFileName);
	    IFile solutionFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	    model.setSolution(solutionFile);
		
		nodes = document.getElementsByTagName("contextfile");
		tmp = nodes.item(0);
		String contextFileName = tmp.getTextContent();
		System.out.println("Context file diagram: " + contextFileName);
		
		path = new Path(contextFileName);
	    IFile contextFile = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	    parseFile(contextFile);
	    model.setContextFile(contextFile);
	    
	    return model;
	}
	
	private ArrayList readDiagramData(){
		ArrayList<PatternElement> elements = new ArrayList<PatternElement>();
		
		parseFile(this.selectedDiagram);
		NodeList nodes = document.getElementsByTagName("object");
	    for(int i=0; i<nodes.getLength(); i++){
	    	Node element = nodes.item(i);
	    	Node name = element.getAttributes().getNamedItem("name");
	    	Node type = element.getAttributes().getNamedItem("actorType");
	    	try{
	    		PatternElement pEl = new PatternElement(name.getNodeValue(), type.getNodeValue());
	    		System.out.println("DIAGRAM. Name: " + name.getNodeValue() + ", type: " + type.getNodeValue());
	    		elements.add(pEl);
	    	}catch(Exception e){
	    		//System.out.println("Not an intersting element...");
	    		ConsoleUtil.printExceptionToConsole(e);
	    	}
	    	this.searchServices(elements, element);
	    }
		return elements;
	}
	
	private void setPatternTable(ArrayList elements){
		int count = countElement(elements);
		for (int i = 0; i < (count*2); i++) {
		      new TableItem(table, SWT.NONE);
		}
		Iterator iter = elements.iterator();
		TableItem[] items = table.getItems();
		int i=0;
	    while(iter.hasNext()) {
	    	TableEditor editor = new TableEditor(table);
	    	Text text = new Text(table, SWT.NONE);
	    	Object o = iter.next();
	    	if(PatternElement.class.isInstance(o)){
	    		PatternElement tmp = (PatternElement)o;
	    		if(tmp.getParent() != null){
	    			text.setText(tmp.getType() + "(" + tmp.getName()+ ")" + " of "
	    					+ tmp.getParent());
	    		}else{
	    			text.setText(tmp.getType() + "(" + tmp.getName()+ ")");
	    		}
	    		texts.add(text);
		    	editor.grabHorizontal = true;
		    	editor.setEditor(text, items[i], 0);
		    	i++;
	    	}else{
	    		PatternRelation tmp = (PatternRelation)o;
	    		if(dependencyList.contains(tmp.getType())){
	    			text.setText(tmp.getType() + "(" + tmp.getSource().getName() 
	    					+ ", " + tmp.getGoal().getName()
	    					+ ", " + tmp.getTarget().getName() + ")");
	    			texts.add(text);
	    	    	editor.grabHorizontal = true;
	    	    	editor.setEditor(text, items[i], 0);
	    	    	i++;
	    		}else{
					//text.setText(tmp.getType() + "(" + tmp.getSource().getName() 
					//+ ", " + tmp.getTarget().getName() + ")");
				}
	    	}
	    	/*texts.add(text);
	    	editor.grabHorizontal = true;
	    	editor.setEditor(text, items[i], 0);
	    	i++;*/
	    }
		
	}
	
	private int countElement(ArrayList elements) {
		int count = 0;
		Iterator iter = elements.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				count = count + 1;
			}else if(PatternRelation.class.isInstance(o)){
				PatternRelation tmp = (PatternRelation)o;
				if(dependencyList.contains(tmp.getType())){
					count = count + 1;
				}
			}
		}
		return count;
	}


	private void setDiagramTable(ArrayList<PatternElement> e, ArrayList pattern){
		int size = this.countElement(pattern);
		ArrayList array = new ArrayList();
		//String[] components = new String[e.size()+1];
		//components[0] = "Select...";
		String[] components;
		for(int i=0; i<pattern.size(); i++){
			Object o = pattern.get(i);
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				String type = pe.getType();
				ArrayList list = searchSimilar(type, e);
				components = new String[list.size()+1];
				components[0] = SELECT;
				addItems(list, components);
				array.add(components);
			}else{
				PatternRelation pr = (PatternRelation)o;
				if(dependencyList.contains(pr.getType())){
					String type = pr.getType();
					ArrayList list = searchSimilar(type, e);
					components = new String[list.size()+1];
					components[0] = SELECT;
					addItems(list, components);
					array.add( components);
				}else{
				}
				
			}
		}
		TableItem[] items = table.getItems();
	    for(int i=0; i<array.size(); i++){
	    	TableEditor editor = new TableEditor(table);
	    	CCombo combo = new CCombo(table, SWT.NONE);
	    	combo.addListener(SWT.Selection, this);
	    	String[] str = (String[])array.get(i);
	    	combo.setItems(str);
	    	combo.select(0);
	    	combos.add(combo);
	    	editor.grabHorizontal = true;
	    	editor.setEditor(combo, items[i], 1);
	    }
	}
	
	private ArrayList searchSimilar(String type, ArrayList<PatternElement> e) {
		
		ArrayList list = new ArrayList();
		Iterator iter = e.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				if(pe.getType().matches(type)){
					list.add(pe);
				}
			}else{
				PatternRelation pr = (PatternRelation)o;
				if(pr.getType().matches(type))
					list.add(pr);
			}
		}
		return list;
	}


	private String[] addItems(ArrayList list, String[] components) {
		Iterator iter = list.iterator();
		int i = 1;
		while(iter.hasNext()){
			Object o = iter.next();
			String text = "";
			if(PatternElement.class.isInstance(o)){
				PatternElement tmp = (PatternElement)o;
				if(tmp.getParent() != null){
					text = tmp.getType() + "(" + tmp.getName()+ ")" + " of "
					+ tmp.getParent();
				}else{
					text = tmp.getType() + "(" + tmp.getName()+ ")";
				}
				components[i] = text;
				i++;
			}else{
				
				PatternRelation tmp = (PatternRelation)o;
				if(dependencyList.contains(tmp.getType())){
					text = tmp.getType() + "(" + tmp.getSource().getName() 
					+ ", " + tmp.getGoal().getName()
					+ ", " + tmp.getTarget().getName() + ")";
					components[i] = text;
					i++;
				}
			}
			//components[i] = text;
			//i++;
		}
		return components;
	}


	private ArrayList searchServices(ArrayList<PatternElement> elements, Node node){
		NodeList childs = node.getChildNodes();
		for(int i=0; i<childs.getLength(); i++){
			Node child = childs.item(i);
			try{
				Node type = child.getAttributes().getNamedItem("serviceType");
				Node name = child.getAttributes().getNamedItem("name");
				PatternElement pEl = new PatternElement(name.getNodeValue(), type.getNodeValue());
				elements.add(pEl);
			}catch(Exception e){
				ConsoleUtil.printExceptionToConsole(e);
			}
		}
		
		return elements;
	}
	
	private Document parseFile(IFile file){
		DocumentBuilderFactory factory =
			DocumentBuilderFactory.newInstance();
		Document doc = null;
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			document = builder.parse(FileUtil.toFile(file));
			System.out.println("Selected file: " + patternFile);
			doc = document;
		} catch (ParserConfigurationException e) {
			e.printStackTrace();	
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}
		return doc;
	}
	
	public ArrayList getCouples(){
		ArrayList couples = new ArrayList();
		
		for(int i=0; i<texts.size();i++){
			Text text = (Text)texts.get(i);
			CCombo combo = (CCombo)combos.get(i);
			int k = combo.getSelectionIndex();
			ApplyPatternCouple couple = new ApplyPatternCouple(text.getText(), combo.getItem(k));
			couples.add(couple);
			System.out.println("Coppia: " + couple.getContextElementString() 
					+ ", " + couple.getDiagramElementString());
		}
		
		return couples;
	}
	
	private boolean isComplete(){
		for(int i=0; i<texts.size();i++){
			CCombo combo = (CCombo)combos.get(i);
			int k = combo.getSelectionIndex();
			//System.out.println("COMBO "+i + ", " + combo.getItem(k).toString());
			if(combo.getItem(k).matches(SELECT))
				return false;
		}
		if(this.checkMatch() == false){
			MessageDialog.openError( null, "Matching error",
			 "Please check your matches. Context and Diagram elements do not match.");
			return false;
		}
		return flag;
	}
	
	public boolean isPageComplete(){
		return this.isComplete();
	}


	public void handleEvent(Event event) {
		
		Wizard wizard = (Wizard)this.getWizard();
		wizard.getContainer().updateButtons();	
	}
	
	public void createActorMap(PatternElement pe, List list, HashMap map){
		ArrayList items = new ArrayList();
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement el = (PatternElement)o;
				if(servicesList.contains(el)){
					if(el.getParent().matches(pe.getName()))
						items.add(el);
				}
			}else if(PatternRelation.class.isInstance(o)){
				PatternRelation pr = (PatternRelation)o;
				if((pr.getSource().getName().matches(pe.getName()))||
						(pr.getTarget().getName().matches(pe.getName()))){
					items.add(pr);
				}
			}
		}
		map.put(pe.getName(), items);
	}
	
	public boolean checkMatch(){
		//this.updateMap();
		ArrayList couples = this.getCouples();
		Iterator iter = couples.iterator();
		while(iter.hasNext()){
			System.out.println("Analyizing couple...........");
			ApplyPatternCouple c = (ApplyPatternCouple)iter.next();
			if(c.getContextElementString() != null){
				System.out.println("Trovata una stringa. " + c.getContextElementString());
				PatternElement cpe = this.decodeString(c.getContextElementString());
				PatternElement dpe = this.decodeString(c.getDiagramElementString());
				if((cpe != null)&&(dpe != null)){
					System.out.println("Trovati due actors: " + cpe.getName() + cpe.getType() 
							+", " + dpe.getName()+dpe.getType());
					if((actorList.contains(cpe.getType()))&&(actorList.contains(dpe.getType()))){
						System.out.println("Comparing actors: " + cpe.getName() + ", " 
								+ dpe.getName());
						boolean flag = compareActors(cpe.getName(), dpe.getName());
						if(flag == false)
							return false;
					}
				}
			}
		}
		return true;
		
		//confrontare ogni coppia --> se un actor non ha le stess cose dell'altro --> errore
	}
	
	private boolean compareActors(String cActor, String dActor) {
		
		ArrayList cList = (ArrayList)this.contextMap.get(cActor);
		ArrayList dList = (ArrayList)this.diagramMap.get(dActor);
		
		ArrayList contextList = (ArrayList)cList.clone();
		ArrayList diagramList = (ArrayList)dList.clone();
		
		Iterator iter = contextList.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				boolean flag = findItem(pe, diagramList);
				if(flag == false)
					return false;
			}if(PatternRelation.class.isInstance(o)){
				PatternRelation pr = (PatternRelation)o;
				boolean flag = findRelItem(pr, diagramList);
				if(flag == false)
					return false;
			}
		}
		
		return true;
	}


	private boolean findRelItem(PatternRelation pr, ArrayList diagramList) {
		Iterator iter = diagramList.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternRelation.class.isInstance(o)){
				PatternRelation tmp = (PatternRelation)o;
				if(pr.getType().matches(tmp.getType())){
					if(pr.getSource().getType().matches(tmp.getSource().getType())){
						if(pr.getTarget().getType().matches(tmp.getTarget().getType())){
							diagramList.remove(tmp);
							return true;
						}
					}
				}
			}
		}
		return false;
	}


	private boolean findItem(PatternElement pe, ArrayList diagramList) {
		System.out.println("Searching item " + pe.getName());
		Iterator iter = diagramList.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement tmp = (PatternElement)o;
				if(pe.getType().matches(tmp.getType())){
					diagramList.remove(tmp);
					return true;
				}
			}
		}
		return false;
	}


	private PatternElement decodeString(String string) {
		StringTokenizer tokenizer = new StringTokenizer(string, "\\(");
		String type = tokenizer.nextToken();
		String tmp = tokenizer.nextToken();
		tokenizer = new StringTokenizer(tmp,"\\)");
		String item = tokenizer.nextToken();
		PatternElement pe = null;
		if(actorList.contains(type)){
			pe = new PatternElement();
			pe.setType(type);
			pe.setName(item);
		}else if(servicesList.contains(type)){
			pe = new PatternElement();
			pe.setType(type);
			pe.setName(item);
		}
		return pe;
	}
	
	private void updateMap(){
		Iterator iter = contextElements.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				if(actorList.contains(pe.getType())){
					this.createActorMap(pe, contextElements, contextMap);
				}
			}
		}
		iter = diagramElements.iterator();
		while(iter.hasNext()){
			Object o = iter.next();
			if(PatternElement.class.isInstance(o)){
				PatternElement pe = (PatternElement)o;
				if(actorList.contains(pe.getType())){
					this.createActorMap(pe, diagramElements, diagramMap);
				}
			}
		}
	}
}
	
