package it.unitn.disi.sistar.mapping;

import it.unitn.disi.sistar.preferences.common.PreferenceConstants;
import it.unitn.disi.sistar.preferences.table.ItemList;
import it.unitn.disi.sistar.preferences.table.ItemWrapper;
import it.unitn.disi.sistar.util.PreferenceUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.swt.graphics.Color;

public class GRColorMapper {

	public static Color mapColor(double satValue, double denValue)
	{
		double mySATValue = 0;
		double myDENValue = 0;
		
		ItemList itemSATValueList =	PreferenceUtil.getQuantitativePreferences(PreferenceConstants.QUANTITATIVE_SAT_VALUE);
		ItemList itemDENValueList = PreferenceUtil.getQuantitativePreferences(PreferenceConstants.QUANTITATIVE_DEN_VALUE);
		
		List satValues = new ArrayList();
		for (Iterator iter = itemSATValueList.getItems().iterator(); iter.hasNext();) {
			ItemWrapper element = (ItemWrapper) iter.next();
			satValues.add(element.getItem().get(0));
		}
		Collections.sort(satValues);
		
		List denValues = new ArrayList();
		for (Iterator iter = itemDENValueList.getItems().iterator(); iter.hasNext();) {
			ItemWrapper element = (ItemWrapper) iter.next();
			denValues.add(element.getItem().get(0));
		}
		Collections.sort(denValues);
		
		for (Iterator iter = satValues.iterator(); iter.hasNext();) {
			double satThreshold = Double.parseDouble((String)iter.next());
			if(satValue <= satThreshold)
			{
				mySATValue = satThreshold;
				break;
			}
		}
		for (Iterator iter = denValues.iterator(); iter.hasNext();) {
			double denThreshold = Double.parseDouble((String)iter.next());
			if(denValue <= denThreshold)
			{
				myDENValue = denThreshold;
				break;
			}
		}

		System.out.println("SAT " + mySATValue);
		System.out.println("DEN " + myDENValue);
		return PreferenceUtil.getColorPreference("SAT" + mySATValue + "DEN" + myDENValue);
	}
}
