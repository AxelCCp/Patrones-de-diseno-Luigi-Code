package A8_Composite;

public class Item extends BaseItem{

	public Item(String name, int value) {
		super(name, value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(BaseItem baseItem) {
		// TODO Auto-generated method stub
		System.out.println("no items allowed");
	}

	@Override
	public void delete(BaseItem baseItem) {
		// TODO Auto-generated method stub
		System.out.println("no items allowed");
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}

	
	
}
