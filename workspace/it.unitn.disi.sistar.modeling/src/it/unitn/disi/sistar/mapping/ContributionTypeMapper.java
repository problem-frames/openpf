package it.unitn.disi.sistar.mapping;

import it.unitn.disi.sistar.modeling.tropos.EContributionType;
import it.unitn.disi.sistar.modeling.tropos.ESATType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContributionTypeMapper {

	private static boolean isQuantitativeView = false;
	private static Map mapping = new HashMap();
	static{
		mapping.put(EContributionType.M_LITERAL, "-");
		mapping.put(EContributionType.MM_LITERAL, "--");
		mapping.put(EContributionType.P_LITERAL, "+");
		mapping.put(EContributionType.PP_LITERAL, "++");
		
		mapping.put(ESATType.NA_LITERAL, "");
		mapping.put(ESATType.SAT_LITERAL, "S");
		mapping.put(ESATType.DEN_LITERAL, "D");
	}
	
	public static String mapAttribute(EContributionType type, ESATType satType, double weight)
	{
		String value = (String) mapping.get(type);
		String valueSat = (String)mapping.get(satType);
		
		if(value == null)
			value = type.toString();
		
		if(valueSat == null)
			valueSat = satType.toString();
		
		List positiveValues = new ArrayList();
		positiveValues.add(EContributionType.PP_LITERAL);
		positiveValues.add(EContributionType.P_LITERAL);
		
		if(!isQuantitativeView)
			return value + " " + valueSat;
		else
			return (positiveValues.contains(type)?"":"-") + " " + weight;
	}

	public static boolean isQuantitativeView() {
		return isQuantitativeView;
	}

	public static void setQuantitativeView(boolean isQuantitativeView) {
		ContributionTypeMapper.isQuantitativeView = isQuantitativeView;
	}

}
