package B8_Observer;

import java.util.ArrayList;
import java.util.List;

public class Vigilante extends Enemy implements MyObserbable{

	public Vigilante(String name) {
		super(name);
		setActive(true);
	}

	@Override
	public void attack() {
		System.out.println(getName() + " Vigilante on attack!!");
	}

	@Override
	public void activate() {	
		System.out.println(getName() + " sending messages");
		broadCast();
	}

	@Override
	public void subscribe(MyObserver observer) {
		observers.add(observer);
	}

	@Override
	public void unsubscribe(MyObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void broadCast() {
		for(MyObserver observer : observers) {
			observer.update();
		}
	}

	
	private List<MyObserver> observers = new ArrayList<>();
	
	
}
