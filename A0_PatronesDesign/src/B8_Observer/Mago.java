package B8_Observer;

public class Mago extends Enemy implements MyObserver{

	public Mago(String name) {
		super(name);
		setActive(false);
	}

	@Override
	public void attack() {
		System.out.println(getName() + " Mago on attack!!");
	}

	@Override
	public void activate() {
		setActive(true);
		System.out.println(getName() + " Mago is active!!");
	}

	@Override
	public void update() {
		activate();
		attack();
	}

	
}
