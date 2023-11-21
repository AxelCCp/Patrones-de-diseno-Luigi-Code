package A8_Composite;

import java.util.ArrayList;

public class Bag extends BaseItem{

	public Bag(String name) {
		super(name, 0);
		items = new ArrayList<BaseItem>();
	}

	@Override
	public void add(BaseItem baseItem) {
		// TODO Auto-generated method stub
		items.add(baseItem);
	}

	@Override
	public void delete(BaseItem baseItem) {
		// TODO Auto-generated method stub
		items.remove(baseItem);
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		int result = value;
		for(BaseItem item : items) {
			result += item.getValue();
		}
		return result;
	}
	
	
	

}
