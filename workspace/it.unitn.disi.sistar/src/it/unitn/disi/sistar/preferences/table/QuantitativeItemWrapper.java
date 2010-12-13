package it.unitn.disi.sistar.preferences.table;

public class QuantitativeItemWrapper extends ItemWrapper{

	@Override
	public void setItemValue(int index, Object value) {
		if(index == 0)
		{
			try {
				double doubleValue = Double.parseDouble(value.toString());
				if(doubleValue < 0 || doubleValue >1)
					return;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return;
			}
		}
		super.setItemValue(index, value);
	}
}
