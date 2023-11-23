package B8_Observer;

public class TestObservable {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("warrior 1");
		Warrior warrior2 = new Warrior("warrior 2");
		Mago mago1 = new  Mago("mago 1");
		Mago mago2 = new  Mago("mago 2");
		
		
		Vigilante vigilante = new Vigilante("vigilante");
		
		vigilante.subscribe(warrior1);
		vigilante.subscribe(warrior2);
		
		vigilante.subscribe(mago1);
		vigilante.subscribe(mago2);
		
		vigilante.activate();
		
		System.out.println("------------------------");
		
		vigilante.unsubscribe(mago2);
		vigilante.activate();
		
	}
}
