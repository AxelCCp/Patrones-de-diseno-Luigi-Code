package B0_Facade;

public class Forge implements Smithy{

	@Override
	public void work(String name) {
		// TODO Auto-generated method stub
		System.out.println("let's " + ACTION + " the " + name + "...");
	}

	@Override
	public boolean search(String name) {
		// TODO Auto-generated method stub
		return Inventory.search(name, true);
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		Inventory.remove(name, true);
	}

	@Override
	public void working(String name) {
		// TODO Auto-generated method stub
		System.out.println("making " + name);
	}
	
	public static final String ACTION = "make";

}
