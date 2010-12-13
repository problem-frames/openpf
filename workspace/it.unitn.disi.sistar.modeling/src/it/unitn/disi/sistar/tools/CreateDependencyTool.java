package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EDependencyType;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateDependencyTool extends ConnectionCreationTool{ 
	private EDependencyType type;
	public static String DEPENDENCY_TYPE = "dependencyType";
	
	public CreateDependencyTool(IElementType elementTypes,EDependencyType type)
	{
		super(elementTypes);
		setType(type);
	}
	public EDependencyType getType() {
		return type;
	}


	public void setType(EDependencyType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(DEPENDENCY_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
