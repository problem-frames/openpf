package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EAssociationType;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateAssociationTool extends ConnectionCreationTool{ 
	private EAssociationType type;
	public static String ASSOCIATION_TYPE = "associationType";
	
	public CreateAssociationTool(IElementType elementTypes,EAssociationType type)
	{
		super(elementTypes);
		setType(type);
	}
	public EAssociationType getType() {
		return type;
	}


	public void setType(EAssociationType type) {
		this.type = type;
	}
	
	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(ASSOCIATION_TYPE, type);
		request.setExtendedData(data);
		return request;
	}

}
