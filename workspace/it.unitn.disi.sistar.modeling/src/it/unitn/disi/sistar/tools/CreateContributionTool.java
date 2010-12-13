package it.unitn.disi.sistar.tools;

import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.ERelationshipType;

import java.util.Map;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.tools.ConnectionCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

public class CreateContributionTool extends ConnectionCreationTool{ 
	private EContributionType type;
	private ERelationshipType relationshipType;
	
	public static String CONTRIBUTION_TYPE = "contributionType";
	public static String RELATIONSHIP_TYPE = "relationshipType";
	
	public CreateContributionTool(IElementType elementTypes,EContributionType type, ERelationshipType relationshipType)
	{
		super(elementTypes);
		setType(type);
		setRelationshipType(relationshipType);
	}
	public EContributionType getType() {
		return type;
	}


	public void setType(EContributionType type) {
		this.type = type;
	}


	@Override
	protected Request createTargetRequest() {
		Request request = super.createTargetRequest();
		Map data = request.getExtendedData();
		data.put(CONTRIBUTION_TYPE, type);
		data.put(RELATIONSHIP_TYPE, relationshipType);
		request.setExtendedData(data);
		return request;
	}
	public ERelationshipType getRelationshipType() {
		return relationshipType;
	}
	public void setRelationshipType(ERelationshipType relationshipType) {
		this.relationshipType = relationshipType;
	}

}
