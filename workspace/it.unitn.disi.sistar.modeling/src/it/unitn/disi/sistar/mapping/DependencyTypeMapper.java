package it.unitn.disi.sistar.mapping;

import it.unitn.disi.sistar.modeling.tropos.EDependencyType;

import java.util.HashMap;
import java.util.Map;

public class DependencyTypeMapper {

	private static Map mapping = new HashMap();
	static{
		//mapping.put(EDependencyType.DEPENDENCY_LITERAL, "D");
		mapping.put(EDependencyType.DELEGATION_EXECUTION_LITERAL, "De");
		mapping.put(EDependencyType.DELEGATION_PERMISSION_LITERAL, "Dp");
		mapping.put(EDependencyType.DISTRUST_EXECUTION_LITERAL, "Se");
		mapping.put(EDependencyType.DISTRUST_PERMISSION_LITERAL, "Sp");
		mapping.put(EDependencyType.TRUST_EXECUTION_LITERAL, "Te");
		mapping.put(EDependencyType.TRUST_PERMISSION_LITERAL, "Tp");
		mapping.put(EDependencyType.MONITORING_EXECUTION_LITERAL, "Me");
		mapping.put(EDependencyType.MONITORING_PERMISSION_LITERAL, "Mp");
		mapping.put(EDependencyType.TRUST_MONITOR_LITERAL, "Tm");
		
	}
	
	public static String mapAttribute(EDependencyType type)
	{
		String value = (String) mapping.get(type);
		if(value == null)
			value = type.toString();
		return value;
	}

}
