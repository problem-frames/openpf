package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EOwnershipType;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateOwnershipTool extends ConnectionCreationTool{ 
	private EOwnershipType type;
	public static String OWNERSHIP_TYPE = "ownershipType";
	
	public CreateOwnershipTool(IElementType elementTypes,EOwnershipType type)
	{
		super(elementTypes);
		setType(type);
	}
	public EOwnershipType getType() {
		return type;
	}


	public void setType(EOwnershipType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(OWNERSHIP_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
